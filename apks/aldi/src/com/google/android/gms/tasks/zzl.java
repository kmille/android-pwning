package com.google.android.gms.tasks;

final class zzl
  implements Runnable
{
  zzl(zzk paramzzk, Task paramTask) {}
  
  public final void run()
  {
    synchronized (zzk.zza(this.zzo))
    {
      if (zzk.zzb(this.zzo) != null) {
        zzk.zzb(this.zzo).onFailure(this.zzg.getException());
      }
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */