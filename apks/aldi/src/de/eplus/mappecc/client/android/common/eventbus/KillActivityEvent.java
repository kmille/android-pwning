package de.eplus.mappecc.client.android.common.eventbus;

import android.support.annotation.Nullable;

public class KillActivityEvent
{
  private final String whitelist;
  
  public KillActivityEvent()
  {
    this.whitelist = null;
  }
  
  public KillActivityEvent(@Nullable String paramString)
  {
    this.whitelist = paramString;
  }
  
  public String getWhitelist()
  {
    return this.whitelist;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/eventbus/KillActivityEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */