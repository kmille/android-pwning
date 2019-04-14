package com.squareup.otto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventHandler
{
  private final int hashCode;
  private final Method method;
  private final Object target;
  private boolean valid = true;
  
  EventHandler(Object paramObject, Method paramMethod)
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
      throw new NullPointerException("EventHandler method cannot be null.");
    }
    throw new NullPointerException("EventHandler target cannot be null.");
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
    paramObject = (EventHandler)paramObject;
    return (this.method.equals(((EventHandler)paramObject).method)) && (this.target == ((EventHandler)paramObject).target);
  }
  
  public void handleEvent(Object paramObject)
    throws InvocationTargetException
  {
    if (this.valid) {
      try
      {
        this.method.invoke(this.target, new Object[] { paramObject });
        return;
      }
      catch (InvocationTargetException paramObject)
      {
        if ((((InvocationTargetException)paramObject).getCause() instanceof Error)) {
          throw ((Error)((InvocationTargetException)paramObject).getCause());
        }
        throw ((Throwable)paramObject);
      }
      catch (IllegalAccessException paramObject)
      {
        throw new AssertionError(paramObject);
      }
    }
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append(toString());
    ((StringBuilder)paramObject).append(" has been invalidated and can no longer handle events.");
    throw new IllegalStateException(((StringBuilder)paramObject).toString());
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[EventHandler ");
    localStringBuilder.append(this.method);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/squareup/otto/EventHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */