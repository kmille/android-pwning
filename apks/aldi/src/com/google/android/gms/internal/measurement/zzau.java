package com.google.android.gms.internal.measurement;

final class zzau
  implements Thread.UncaughtExceptionHandler
{
  zzau(zzat paramzzat) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    paramThread = this.zzwd.zzcj();
    if (paramThread != null) {
      paramThread.zze("Job execution failed", paramThrowable);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */