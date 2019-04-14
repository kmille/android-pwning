package com.google.android.gms.tasks;

public class CancellationTokenSource
{
  private final zza zzc = new zza();
  
  public void cancel()
  {
    this.zzc.cancel();
  }
  
  public CancellationToken getToken()
  {
    return this.zzc;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/CancellationTokenSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */