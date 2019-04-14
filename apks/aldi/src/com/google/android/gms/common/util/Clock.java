package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
@ShowFirstParty
public abstract interface Clock
{
  @KeepForSdk
  public abstract long currentThreadTimeMillis();
  
  @KeepForSdk
  public abstract long currentTimeMillis();
  
  @KeepForSdk
  public abstract long elapsedRealtime();
  
  @KeepForSdk
  public abstract long nanoTime();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/Clock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */