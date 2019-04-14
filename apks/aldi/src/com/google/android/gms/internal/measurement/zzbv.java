package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.Logger;

final class zzbv
  implements Logger
{
  private boolean zzrg;
  private int zzyb = 2;
  
  public final void error(Exception paramException) {}
  
  public final void error(String paramString) {}
  
  public final int getLogLevel()
  {
    return this.zzyb;
  }
  
  public final void info(String paramString) {}
  
  public final void setLogLevel(int paramInt)
  {
    this.zzyb = paramInt;
    if (!this.zzrg)
    {
      zzcc.zzyl.get();
      String str = (String)zzcc.zzyl.get();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 91);
      localStringBuilder.append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
      localStringBuilder.append(str);
      localStringBuilder.append(" DEBUG");
      this.zzrg = true;
    }
  }
  
  public final void verbose(String paramString) {}
  
  public final void warn(String paramString) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */