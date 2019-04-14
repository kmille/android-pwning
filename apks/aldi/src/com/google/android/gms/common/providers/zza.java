package com.google.android.gms.common.providers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class zza
  implements PooledExecutorsProvider.PooledExecutorFactory
{
  public final ScheduledExecutorService newSingleThreadScheduledExecutor()
  {
    return Executors.newSingleThreadScheduledExecutor();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/providers/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */