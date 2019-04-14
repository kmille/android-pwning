package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzg<TResult>
  implements zzq<TResult>
{
  private final Object mLock = new Object();
  private final Executor zzd;
  @GuardedBy("mLock")
  private OnCanceledListener zzj;
  
  public zzg(@NonNull Executor paramExecutor, @NonNull OnCanceledListener paramOnCanceledListener)
  {
    this.zzd = paramExecutor;
    this.zzj = paramOnCanceledListener;
  }
  
  public final void cancel()
  {
    synchronized (this.mLock)
    {
      this.zzj = null;
      return;
    }
  }
  
  public final void onComplete(@NonNull Task arg1)
  {
    if (???.isCanceled()) {
      synchronized (this.mLock)
      {
        if (this.zzj == null) {
          return;
        }
        this.zzd.execute(new zzh(this));
        return;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */