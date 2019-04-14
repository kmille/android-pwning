package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class zza
  implements Runnable
{
  private final int priority;
  private final Runnable zzhs;
  
  public zza(Runnable paramRunnable, int paramInt)
  {
    this.zzhs = paramRunnable;
    this.priority = paramInt;
  }
  
  public final void run()
  {
    Process.setThreadPriority(this.priority);
    this.zzhs.run();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/concurrent/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */