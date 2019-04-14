package com.google.android.gms.tagmanager;

import android.util.Log;

public final class zzba
  implements zzdj
{
  private int zzyb = 5;
  
  public final void e(String paramString)
  {
    if (this.zzyb <= 6) {
      Log.e("GoogleTagManager", paramString);
    }
  }
  
  public final void setLogLevel(int paramInt)
  {
    this.zzyb = paramInt;
  }
  
  public final void v(String paramString) {}
  
  public final void zza(String paramString, Throwable paramThrowable)
  {
    if (this.zzyb <= 6) {
      Log.e("GoogleTagManager", paramString, paramThrowable);
    }
  }
  
  public final void zzab(String paramString) {}
  
  public final void zzb(String paramString, Throwable paramThrowable) {}
  
  public final void zzcz(String paramString) {}
  
  public final void zzda(String paramString) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */