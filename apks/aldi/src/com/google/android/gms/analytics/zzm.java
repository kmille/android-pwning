package com.google.android.gms.analytics;

import android.util.Log;
import java.util.concurrent.FutureTask;

final class zzm
  extends FutureTask<T>
{
  zzm(zzk.zza paramzza, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }
  
  protected final void setException(Throwable paramThrowable)
  {
    Object localObject = zzk.zzb(this.zzsi.zzsh);
    if (localObject != null)
    {
      ((Thread.UncaughtExceptionHandler)localObject).uncaughtException(Thread.currentThread(), paramThrowable);
    }
    else if (Log.isLoggable("GAv4", 6))
    {
      localObject = String.valueOf(paramThrowable);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 37);
      localStringBuilder.append("MeasurementExecutor: job failed with ");
      localStringBuilder.append((String)localObject);
      Log.e("GAv4", localStringBuilder.toString());
    }
    super.setException(paramThrowable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */