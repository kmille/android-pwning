package com.google.android.gms.tasks;

final class zzf
  implements Runnable
{
  zzf(zze paramzze, Task paramTask) {}
  
  public final void run()
  {
    try
    {
      Task localTask = (Task)zze.zza(this.zzi).then(this.zzg);
      if (localTask == null)
      {
        this.zzi.onFailure(new NullPointerException("Continuation returned null"));
        return;
      }
      localTask.addOnSuccessListener(TaskExecutors.zzw, this.zzi);
      localTask.addOnFailureListener(TaskExecutors.zzw, this.zzi);
      localTask.addOnCanceledListener(TaskExecutors.zzw, this.zzi);
      return;
    }
    catch (Exception localException)
    {
      zze.zzb(this.zzi).setException(localException);
      return;
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      if ((localRuntimeExecutionException.getCause() instanceof Exception))
      {
        zze.zzb(this.zzi).setException((Exception)localRuntimeExecutionException.getCause());
        return;
      }
      zze.zzb(this.zzi).setException(localRuntimeExecutionException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */