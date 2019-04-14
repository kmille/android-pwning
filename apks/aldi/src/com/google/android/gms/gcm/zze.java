package com.google.android.gms.gcm;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zze
  implements ThreadFactory
{
  private final AtomicInteger zzx = new AtomicInteger(1);
  
  zze(GcmTaskService paramGcmTaskService) {}
  
  public final Thread newThread(@NonNull Runnable paramRunnable)
  {
    int i = this.zzx.getAndIncrement();
    StringBuilder localStringBuilder = new StringBuilder(20);
    localStringBuilder.append("gcm-task#");
    localStringBuilder.append(i);
    paramRunnable = new Thread(paramRunnable, localStringBuilder.toString());
    paramRunnable.setPriority(4);
    return paramRunnable;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */