package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

final class zzp
  implements Runnable
{
  zzp(zzo paramzzo, Task paramTask) {}
  
  public final void run()
  {
    try
    {
      Task localTask = zzo.zza(this.zzs).then(this.zzg.getResult());
      if (localTask == null)
      {
        this.zzs.onFailure(new NullPointerException("Continuation returned null"));
        return;
      }
      localTask.addOnSuccessListener(TaskExecutors.zzw, this.zzs);
      localTask.addOnFailureListener(TaskExecutors.zzw, this.zzs);
      localTask.addOnCanceledListener(TaskExecutors.zzw, this.zzs);
      return;
    }
    catch (Exception localException)
    {
      this.zzs.onFailure(localException);
      return;
      this.zzs.onCanceled();
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        this.zzs.onFailure((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      this.zzs.onFailure(localRuntimeExecutionException);
      return;
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */