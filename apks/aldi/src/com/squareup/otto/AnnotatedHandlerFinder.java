package com.squareup.otto;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class AnnotatedHandlerFinder
{
  private static final ConcurrentMap<Class<?>, Map<Class<?>, Method>> PRODUCERS_CACHE = new ConcurrentHashMap();
  private static final ConcurrentMap<Class<?>, Map<Class<?>, Set<Method>>> SUBSCRIBERS_CACHE = new ConcurrentHashMap();
  
  static Map<Class<?>, EventProducer> findAllProducers(Object paramObject)
  {
    Object localObject3 = paramObject.getClass();
    HashMap localHashMap = new HashMap();
    Object localObject2 = (Map)PRODUCERS_CACHE.get(localObject3);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new HashMap();
      loadAnnotatedProducerMethods((Class)localObject3, (Map)localObject1);
    }
    if (!((Map)localObject1).isEmpty())
    {
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = new EventProducer(paramObject, (Method)((Map.Entry)localObject2).getValue());
        localHashMap.put(((Map.Entry)localObject2).getKey(), localObject3);
      }
    }
    return localHashMap;
  }
  
  static Map<Class<?>, Set<EventHandler>> findAllSubscribers(Object paramObject)
  {
    Object localObject3 = paramObject.getClass();
    HashMap localHashMap = new HashMap();
    Object localObject2 = (Map)SUBSCRIBERS_CACHE.get(localObject3);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new HashMap();
      loadAnnotatedSubscriberMethods((Class)localObject3, (Map)localObject1);
    }
    if (!((Map)localObject1).isEmpty())
    {
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = new HashSet();
        Iterator localIterator = ((Set)((Map.Entry)localObject2).getValue()).iterator();
        while (localIterator.hasNext()) {
          ((Set)localObject3).add(new EventHandler(paramObject, (Method)localIterator.next()));
        }
        localHashMap.put(((Map.Entry)localObject2).getKey(), localObject3);
      }
    }
    return localHashMap;
  }
  
  private static void loadAnnotatedMethods(Class<?> paramClass, Map<Class<?>, Method> paramMap, Map<Class<?>, Set<Method>> paramMap1)
  {
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    int j = arrayOfMethod.length;
    int i = 0;
    while (i < j)
    {
      Method localMethod = arrayOfMethod[i];
      if (!localMethod.isBridge())
      {
        Object localObject1;
        if (localMethod.isAnnotationPresent(Subscribe.class))
        {
          localObject1 = localMethod.getParameterTypes();
          if (localObject1.length == 1)
          {
            Object localObject2 = localObject1[0];
            if (!((Class)localObject2).isInterface())
            {
              if ((0x1 & localMethod.getModifiers()) != 0)
              {
                Set localSet = (Set)paramMap1.get(localObject2);
                localObject1 = localSet;
                if (localSet == null)
                {
                  localObject1 = new HashSet();
                  paramMap1.put(localObject2, localObject1);
                }
                ((Set)localObject1).add(localMethod);
              }
              else
              {
                paramClass = new StringBuilder("Method ");
                paramClass.append(localMethod);
                paramClass.append(" has @Subscribe annotation on ");
                paramClass.append(localObject2);
                paramClass.append(" but is not 'public'.");
                throw new IllegalArgumentException(paramClass.toString());
              }
            }
            else
            {
              paramClass = new StringBuilder("Method ");
              paramClass.append(localMethod);
              paramClass.append(" has @Subscribe annotation on ");
              paramClass.append(localObject2);
              paramClass.append(" which is an interface.  Subscription must be on a concrete class type.");
              throw new IllegalArgumentException(paramClass.toString());
            }
          }
          else
          {
            paramClass = new StringBuilder("Method ");
            paramClass.append(localMethod);
            paramClass.append(" has @Subscribe annotation but requires ");
            paramClass.append(localObject1.length);
            paramClass.append(" arguments.  Methods must require a single argument.");
            throw new IllegalArgumentException(paramClass.toString());
          }
        }
        else if (localMethod.isAnnotationPresent(Produce.class))
        {
          localObject1 = localMethod.getParameterTypes();
          if (localObject1.length == 0)
          {
            if (localMethod.getReturnType() != Void.class)
            {
              localObject1 = localMethod.getReturnType();
              if (!((Class)localObject1).isInterface())
              {
                if (!localObject1.equals(Void.TYPE))
                {
                  if ((0x1 & localMethod.getModifiers()) != 0)
                  {
                    if (!paramMap.containsKey(localObject1))
                    {
                      paramMap.put(localObject1, localMethod);
                    }
                    else
                    {
                      paramClass = new StringBuilder("Producer for type ");
                      paramClass.append(localObject1);
                      paramClass.append(" has already been registered.");
                      throw new IllegalArgumentException(paramClass.toString());
                    }
                  }
                  else
                  {
                    paramClass = new StringBuilder("Method ");
                    paramClass.append(localMethod);
                    paramClass.append(" has @Produce annotation on ");
                    paramClass.append(localObject1);
                    paramClass.append(" but is not 'public'.");
                    throw new IllegalArgumentException(paramClass.toString());
                  }
                }
                else
                {
                  paramClass = new StringBuilder("Method ");
                  paramClass.append(localMethod);
                  paramClass.append(" has @Produce annotation but has no return type.");
                  throw new IllegalArgumentException(paramClass.toString());
                }
              }
              else
              {
                paramClass = new StringBuilder("Method ");
                paramClass.append(localMethod);
                paramClass.append(" has @Produce annotation on ");
                paramClass.append(localObject1);
                paramClass.append(" which is an interface.  Producers must return a concrete class type.");
                throw new IllegalArgumentException(paramClass.toString());
              }
            }
            else
            {
              paramClass = new StringBuilder("Method ");
              paramClass.append(localMethod);
              paramClass.append(" has a return type of void.  Must declare a non-void type.");
              throw new IllegalArgumentException(paramClass.toString());
            }
          }
          else
          {
            paramClass = new StringBuilder("Method ");
            paramClass.append(localMethod);
            paramClass.append("has @Produce annotation but requires ");
            paramClass.append(localObject1.length);
            paramClass.append(" arguments.  Methods must require zero arguments.");
            throw new IllegalArgumentException(paramClass.toString());
          }
        }
      }
      i += 1;
    }
    PRODUCERS_CACHE.put(paramClass, paramMap);
    SUBSCRIBERS_CACHE.put(paramClass, paramMap1);
  }
  
  private static void loadAnnotatedProducerMethods(Class<?> paramClass, Map<Class<?>, Method> paramMap)
  {
    loadAnnotatedMethods(paramClass, paramMap, new HashMap());
  }
  
  private static void loadAnnotatedSubscriberMethods(Class<?> paramClass, Map<Class<?>, Set<Method>> paramMap)
  {
    loadAnnotatedMethods(paramClass, new HashMap(), paramMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/squareup/otto/AnnotatedHandlerFinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */