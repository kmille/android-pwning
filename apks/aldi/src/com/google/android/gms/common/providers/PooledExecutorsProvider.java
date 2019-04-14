package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
public class PooledExecutorsProvider
{
  private static PooledExecutorFactory zzey;
  
  @KeepForSdk
  public static PooledExecutorFactory getInstance()
  {
    try
    {
      if (zzey == null) {
        zzey = new zza();
      }
      PooledExecutorFactory localPooledExecutorFactory = zzey;
      return localPooledExecutorFactory;
    }
    finally {}
  }
  
  public static abstract interface PooledExecutorFactory
  {
    @KeepForSdk
    public abstract ScheduledExecutorService newSingleThreadScheduledExecutor();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/providers/PooledExecutorsProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */