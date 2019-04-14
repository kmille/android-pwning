package com.squareup.otto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventProducer
{
  private final int hashCode;
  private final Method method;
  final Object target;
  private boolean valid = true;
  
  EventProducer(Object paramObject, Method paramMethod)
  {
    if (paramObject != null)
    {
      if (paramMethod != null)
      {
        this.target = paramObject;
        this.method = paramMethod;
        paramMethod.setAccessible(true);
        this.hashCode = ((paramMethod.hashCode() + 31) * 31 + paramObject.hashCode());
        return;
      }
      throw new NullPointerException("EventProducer method cannot be null.");
    }
    throw new NullPointerException("EventProducer target cannot be null.");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    paramObject = (EventProducer)paramObject;
    return (this.method.equals(((EventProducer)paramObject).method)) && (this.target == ((EventProducer)paramObject).target);
  }
  
  public int hashCode()
  {
    return this.hashCode;
  }
  
  public void invalidate()
  {
    this.valid = false;
  }
  
  public boolean isValid()
  {
    return this.valid;
  }
  
  public Object produceEvent()
    throws InvocationTargetException
  {
    if (this.valid) {
      try
      {
        Object localObject = this.method.invoke(this.target, new Object[0]);
        return localObject;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        if ((localInvocationTargetException.getCause() instanceof Error)) {
          throw ((Error)localInvocationTargetException.getCause());
        }
        throw localInvocationTargetException;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new AssertionError(localIllegalAccessException);
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(toString());
    localStringBuilder.append(" has been invalidated and can no longer produce events.");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[EventProducer ");
    localStringBuilder.append(this.method);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/squareup/otto/EventProducer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */