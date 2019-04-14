package com.google.android.gms.tasks;

final class zzh
  implements Runnable
{
  zzh(zzg paramzzg) {}
  
  public final void run()
  {
    synchronized (zzg.zza(this.zzk))
    {
      if (zzg.zzb(this.zzk) != null) {
        zzg.zzb(this.zzk).onCanceled();
      }
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */