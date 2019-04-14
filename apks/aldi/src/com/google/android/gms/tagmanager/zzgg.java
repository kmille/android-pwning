package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

final class zzgg
  implements Logger
{
  public final void error(Exception paramException)
  {
    zzdi.zza("", paramException);
  }
  
  public final void error(String paramString)
  {
    zzdi.e(paramString);
  }
  
  public final int getLogLevel()
  {
    switch (zzdi.zzyb)
    {
    case 6: 
    default: 
      return 3;
    case 5: 
      return 2;
    case 3: 
    case 4: 
      return 1;
    }
    return 0;
  }
  
  public final void info(String paramString)
  {
    zzdi.zzcz(paramString);
  }
  
  public final void setLogLevel(int paramInt)
  {
    zzdi.zzab("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
  }
  
  public final void verbose(String paramString)
  {
    zzdi.v(paramString);
  }
  
  public final void warn(String paramString)
  {
    zzdi.zzab(paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */