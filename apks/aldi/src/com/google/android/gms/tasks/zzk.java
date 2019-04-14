package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzk<TResult>
  implements zzq<TResult>
{
  private final Object mLock = new Object();
  private final Executor zzd;
  @GuardedBy("mLock")
  private OnFailureListener zzn;
  
  public zzk(@NonNull Executor paramExecutor, @NonNull OnFailureListener paramOnFailureListener)
  {
    this.zzd = paramExecutor;
    this.zzn = paramOnFailureListener;
  }
  
  public final void cancel()
  {
    synchronized (this.mLock)
    {
      this.zzn = null;
      return;
    }
  }
  
  public final void onComplete(@NonNull Task<TResult> paramTask)
  {
    if ((!paramTask.isSuccessful()) && (!paramTask.isCanceled())) {
      synchronized (this.mLock)
      {
        if (this.zzn == null) {
          return;
        }
        this.zzd.execute(new zzl(this, paramTask));
        return;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */