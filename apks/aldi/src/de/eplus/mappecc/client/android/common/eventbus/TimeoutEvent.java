package de.eplus.mappecc.client.android.common.eventbus;

public class TimeoutEvent
{
  private int timeoutId;
  
  public TimeoutEvent(int paramInt)
  {
    this.timeoutId = paramInt;
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof TimeoutEvent;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof TimeoutEvent)) {
      return false;
    }
    paramObject = (TimeoutEvent)paramObject;
    if (!((TimeoutEvent)paramObject).canEqual(this)) {
      return false;
    }
    return getTimeoutId() == ((TimeoutEvent)paramObject).getTimeoutId();
  }
  
  public int getTimeoutId()
  {
    return this.timeoutId;
  }
  
  public int hashCode()
  {
    return getTimeoutId() + 59;
  }
  
  public void setTimeoutId(int paramInt)
  {
    this.timeoutId = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("TimeoutEvent(timeoutId=");
    localStringBuilder.append(getTimeoutId());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/eventbus/TimeoutEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */