package com.squareup.otto;

import java.util.Map;
import java.util.Set;

abstract interface HandlerFinder
{
  public static final HandlerFinder ANNOTATED = new HandlerFinder()
  {
    public final Map<Class<?>, EventProducer> findAllProducers(Object paramAnonymousObject)
    {
      return AnnotatedHandlerFinder.findAllProducers(paramAnonymousObject);
    }
    
    public final Map<Class<?>, Set<EventHandler>> findAllSubscribers(Object paramAnonymousObject)
    {
      return AnnotatedHandlerFinder.findAllSubscribers(paramAnonymousObject);
    }
  };
  
  public abstract Map<Class<?>, EventProducer> findAllProducers(Object paramObject);
  
  public abstract Map<Class<?>, Set<EventHandler>> findAllSubscribers(Object paramObject);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/squareup/otto/HandlerFinder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */