package de.eplus.mappecc.client.android.common.eventbus;

public class BusEvent
{
  public final String content;
  public final int event;
  
  public BusEvent(int paramInt, String paramString)
  {
    this.event = paramInt;
    this.content = paramString;
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof BusEvent;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof BusEvent)) {
      return false;
    }
    Object localObject = (BusEvent)paramObject;
    if (!((BusEvent)localObject).canEqual(this)) {
      return false;
    }
    if (getEvent() != ((BusEvent)localObject).getEvent()) {
      return false;
    }
    paramObject = getContent();
    localObject = ((BusEvent)localObject).getContent();
    if (paramObject == null)
    {
      if (localObject != null) {
        return false;
      }
    }
    else if (!paramObject.equals(localObject)) {
      return false;
    }
    return true;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public int getEvent()
  {
    return this.event;
  }
  
  public int hashCode()
  {
    int j = getEvent();
    String str = getContent();
    int i;
    if (str == null) {
      i = 43;
    } else {
      i = str.hashCode();
    }
    return (j + 59) * 59 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("BusEvent(event=");
    localStringBuilder.append(getEvent());
    localStringBuilder.append(", content=");
    localStringBuilder.append(getContent());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/eventbus/BusEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */