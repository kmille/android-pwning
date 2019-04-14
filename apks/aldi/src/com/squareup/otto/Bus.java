package com.squareup.otto;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class Bus
{
  public static final String DEFAULT_IDENTIFIER = "default";
  private final ThreadEnforcer enforcer;
  private final ThreadLocal<ConcurrentLinkedQueue<EventWithHandler>> eventsToDispatch = new ThreadLocal()
  {
    protected ConcurrentLinkedQueue<Bus.EventWithHandler> initialValue()
    {
      return new ConcurrentLinkedQueue();
    }
  };
  private final ConcurrentMap<Class<?>, Set<Class<?>>> flattenHierarchyCache = new ConcurrentHashMap();
  private final HandlerFinder handlerFinder;
  private final ConcurrentMap<Class<?>, Set<EventHandler>> handlersByType = new ConcurrentHashMap();
  private final String identifier;
  private final ThreadLocal<Boolean> isDispatching = new ThreadLocal()
  {
    protected Boolean initialValue()
    {
      return Boolean.FALSE;
    }
  };
  private final ConcurrentMap<Class<?>, EventProducer> producersByType = new ConcurrentHashMap();
  
  public Bus()
  {
    this("default");
  }
  
  public Bus(ThreadEnforcer paramThreadEnforcer)
  {
    this(paramThreadEnforcer, "default");
  }
  
  public Bus(ThreadEnforcer paramThreadEnforcer, String paramString)
  {
    this(paramThreadEnforcer, paramString, HandlerFinder.ANNOTATED);
  }
  
  Bus(ThreadEnforcer paramThreadEnforcer, String paramString, HandlerFinder paramHandlerFinder)
  {
    this.enforcer = paramThreadEnforcer;
    this.identifier = paramString;
    this.handlerFinder = paramHandlerFinder;
  }
  
  public Bus(String paramString)
  {
    this(ThreadEnforcer.MAIN, paramString);
  }
  
  private void dispatchProducerResultToHandler(EventHandler paramEventHandler, EventProducer paramEventProducer)
  {
    try
    {
      Object localObject = paramEventProducer.produceEvent();
      paramEventProducer = (EventProducer)localObject;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuilder localStringBuilder = new StringBuilder("Producer ");
      localStringBuilder.append(paramEventProducer);
      localStringBuilder.append(" threw an exception.");
      throwRuntimeException(localStringBuilder.toString(), localInvocationTargetException);
      paramEventProducer = null;
    }
    if (paramEventProducer == null) {
      return;
    }
    dispatch(paramEventProducer, paramEventHandler);
  }
  
  private Set<Class<?>> getClassesFor(Class<?> paramClass)
  {
    LinkedList localLinkedList = new LinkedList();
    HashSet localHashSet = new HashSet();
    for (;;)
    {
      localLinkedList.add(paramClass);
      do
      {
        if (localLinkedList.isEmpty()) {
          break;
        }
        paramClass = (Class)localLinkedList.remove(0);
        localHashSet.add(paramClass);
        paramClass = paramClass.getSuperclass();
      } while (paramClass == null);
    }
    return localHashSet;
  }
  
  private static void throwRuntimeException(String paramString, InvocationTargetException paramInvocationTargetException)
  {
    Object localObject = paramInvocationTargetException.getCause();
    if (localObject != null)
    {
      paramInvocationTargetException = new StringBuilder();
      paramInvocationTargetException.append(paramString);
      paramInvocationTargetException.append(": ");
      paramInvocationTargetException.append(((Throwable)localObject).getMessage());
      throw new RuntimeException(paramInvocationTargetException.toString(), (Throwable)localObject);
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(paramInvocationTargetException.getMessage());
    throw new RuntimeException(((StringBuilder)localObject).toString(), paramInvocationTargetException);
  }
  
  protected void dispatch(Object paramObject, EventHandler paramEventHandler)
  {
    try
    {
      paramEventHandler.handleEvent(paramObject);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuilder localStringBuilder = new StringBuilder("Could not dispatch event: ");
      localStringBuilder.append(paramObject.getClass());
      localStringBuilder.append(" to handler ");
      localStringBuilder.append(paramEventHandler);
      throwRuntimeException(localStringBuilder.toString(), localInvocationTargetException);
    }
  }
  
  protected void dispatchQueuedEvents()
  {
    if (((Boolean)this.isDispatching.get()).booleanValue()) {
      return;
    }
    this.isDispatching.set(Boolean.TRUE);
    try
    {
      for (;;)
      {
        EventWithHandler localEventWithHandler = (EventWithHandler)((ConcurrentLinkedQueue)this.eventsToDispatch.get()).poll();
        if (localEventWithHandler == null) {
          break;
        }
        if (localEventWithHandler.handler.isValid()) {
          dispatch(localEventWithHandler.event, localEventWithHandler.handler);
        }
      }
      return;
    }
    finally
    {
      this.isDispatching.set(Boolean.FALSE);
    }
  }
  
  protected void enqueueEvent(Object paramObject, EventHandler paramEventHandler)
  {
    ((ConcurrentLinkedQueue)this.eventsToDispatch.get()).offer(new EventWithHandler(paramObject, paramEventHandler));
  }
  
  Set<Class<?>> flattenHierarchy(Class<?> paramClass)
  {
    Set localSet2 = (Set)this.flattenHierarchyCache.get(paramClass);
    Set localSet1 = localSet2;
    if (localSet2 == null)
    {
      localSet2 = getClassesFor(paramClass);
      localSet1 = (Set)this.flattenHierarchyCache.putIfAbsent(paramClass, localSet2);
      if (localSet1 == null) {
        return localSet2;
      }
    }
    return localSet1;
  }
  
  Set<EventHandler> getHandlersForEventType(Class<?> paramClass)
  {
    return (Set)this.handlersByType.get(paramClass);
  }
  
  EventProducer getProducerForEventType(Class<?> paramClass)
  {
    return (EventProducer)this.producersByType.get(paramClass);
  }
  
  public void post(Object paramObject)
  {
    if (paramObject != null)
    {
      this.enforcer.enforce(this);
      Object localObject1 = flattenHierarchy(paramObject.getClass());
      int i = 0;
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = getHandlersForEventType((Class)((Iterator)localObject1).next());
        if ((localObject2 != null) && (!((Set)localObject2).isEmpty()))
        {
          int j = 1;
          localObject2 = ((Set)localObject2).iterator();
          for (;;)
          {
            i = j;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            enqueueEvent(paramObject, (EventHandler)((Iterator)localObject2).next());
          }
        }
      }
      if ((i == 0) && (!(paramObject instanceof DeadEvent))) {
        post(new DeadEvent(this, paramObject));
      }
      dispatchQueuedEvents();
      return;
    }
    throw new NullPointerException("Event to post must not be null.");
  }
  
  public void register(Object paramObject)
  {
    if (paramObject != null)
    {
      this.enforcer.enforce(this);
      Object localObject2 = this.handlerFinder.findAllProducers(paramObject);
      Object localObject3 = ((Map)localObject2).keySet().iterator();
      Object localObject4;
      Object localObject1;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Class)((Iterator)localObject3).next();
        localObject1 = (EventProducer)((Map)localObject2).get(localObject4);
        EventProducer localEventProducer = (EventProducer)this.producersByType.putIfAbsent(localObject4, localObject1);
        if (localEventProducer == null)
        {
          localObject4 = (Set)this.handlersByType.get(localObject4);
          if ((localObject4 != null) && (!((Set)localObject4).isEmpty()))
          {
            localObject4 = ((Set)localObject4).iterator();
            while (((Iterator)localObject4).hasNext()) {
              dispatchProducerResultToHandler((EventHandler)((Iterator)localObject4).next(), (EventProducer)localObject1);
            }
          }
        }
        else
        {
          paramObject = new StringBuilder("Producer method for type ");
          ((StringBuilder)paramObject).append(localObject4);
          ((StringBuilder)paramObject).append(" found on type ");
          ((StringBuilder)paramObject).append(((EventProducer)localObject1).target.getClass());
          ((StringBuilder)paramObject).append(", but already registered by type ");
          ((StringBuilder)paramObject).append(localEventProducer.target.getClass());
          ((StringBuilder)paramObject).append(".");
          throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
        }
      }
      localObject2 = this.handlerFinder.findAllSubscribers(paramObject);
      localObject3 = ((Map)localObject2).keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Class)((Iterator)localObject3).next();
        localObject1 = (Set)this.handlersByType.get(localObject4);
        paramObject = localObject1;
        if (localObject1 == null)
        {
          paramObject = new CopyOnWriteArraySet();
          localObject1 = (Set)this.handlersByType.putIfAbsent(localObject4, paramObject);
          if (localObject1 != null) {
            paramObject = localObject1;
          }
        }
        if (!((Set)paramObject).addAll((Set)((Map)localObject2).get(localObject4))) {
          throw new IllegalArgumentException("Object already registered.");
        }
      }
      paramObject = ((Map)localObject2).entrySet().iterator();
      label499:
      while (((Iterator)paramObject).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)paramObject).next();
        localObject1 = (Class)((Map.Entry)localObject2).getKey();
        localObject1 = (EventProducer)this.producersByType.get(localObject1);
        if ((localObject1 != null) && (((EventProducer)localObject1).isValid()))
        {
          localObject2 = ((Set)((Map.Entry)localObject2).getValue()).iterator();
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label499;
            }
            localObject3 = (EventHandler)((Iterator)localObject2).next();
            if (!((EventProducer)localObject1).isValid()) {
              break;
            }
            if (((EventHandler)localObject3).isValid()) {
              dispatchProducerResultToHandler((EventHandler)localObject3, (EventProducer)localObject1);
            }
          }
        }
      }
      return;
    }
    throw new NullPointerException("Object to register must not be null.");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[Bus \"");
    localStringBuilder.append(this.identifier);
    localStringBuilder.append("\"]");
    return localStringBuilder.toString();
  }
  
  public void unregister(Object paramObject)
  {
    if (paramObject != null)
    {
      this.enforcer.enforce(this);
      Object localObject1 = this.handlerFinder.findAllProducers(paramObject).entrySet().iterator();
      Object localObject4;
      Object localObject2;
      Object localObject3;
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (Map.Entry)((Iterator)localObject1).next();
        localObject2 = (Class)((Map.Entry)localObject4).getKey();
        localObject3 = getProducerForEventType((Class)localObject2);
        localObject4 = (EventProducer)((Map.Entry)localObject4).getValue();
        if ((localObject4 != null) && (((EventProducer)localObject4).equals(localObject3)))
        {
          ((EventProducer)this.producersByType.remove(localObject2)).invalidate();
        }
        else
        {
          localObject1 = new StringBuilder("Missing event producer for an annotated method. Is ");
          ((StringBuilder)localObject1).append(paramObject.getClass());
          ((StringBuilder)localObject1).append(" registered?");
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
        }
      }
      localObject1 = this.handlerFinder.findAllSubscribers(paramObject).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject1).next();
        localObject2 = getHandlersForEventType((Class)((Map.Entry)localObject3).getKey());
        localObject3 = (Collection)((Map.Entry)localObject3).getValue();
        if ((localObject2 != null) && (((Set)localObject2).containsAll((Collection)localObject3)))
        {
          localObject4 = ((Set)localObject2).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            EventHandler localEventHandler = (EventHandler)((Iterator)localObject4).next();
            if (((Collection)localObject3).contains(localEventHandler)) {
              localEventHandler.invalidate();
            }
          }
          ((Set)localObject2).removeAll((Collection)localObject3);
        }
        else
        {
          localObject1 = new StringBuilder("Missing event handler for an annotated method. Is ");
          ((StringBuilder)localObject1).append(paramObject.getClass());
          ((StringBuilder)localObject1).append(" registered?");
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
        }
      }
      return;
    }
    throw new NullPointerException("Object to unregister must not be null.");
  }
  
  static class EventWithHandler
  {
    final Object event;
    final EventHandler handler;
    
    public EventWithHandler(Object paramObject, EventHandler paramEventHandler)
    {
      this.event = paramObject;
      this.handler = paramEventHandler;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/squareup/otto/Bus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */