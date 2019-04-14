package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

final class zzr<TResult>
{
  private final Object mLock = new Object();
  @GuardedBy("mLock")
  private Queue<zzq<TResult>> zzt;
  @GuardedBy("mLock")
  private boolean zzu;
  
  public final void zza(@NonNull Task<TResult> paramTask)
  {
    synchronized (this.mLock)
    {
      if ((this.zzt != null) && (!this.zzu))
      {
        this.zzu = true;
        synchronized (this.mLock)
        {
          zzq localzzq = (zzq)this.zzt.poll();
          if (localzzq == null)
          {
            this.zzu = false;
            return;
          }
          localzzq.onComplete(paramTask);
        }
      }
      return;
    }
  }
  
  public final void zza(@NonNull zzq<TResult> paramzzq)
  {
    synchronized (this.mLock)
    {
      if (this.zzt == null) {
        this.zzt = new ArrayDeque();
      }
      this.zzt.add(paramzzq);
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */