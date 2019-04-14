package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.ArrayList;

@VisibleForTesting
public class ExceptionReporter
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler zzqv;
  private final Tracker zzqw;
  private final Context zzqx;
  private ExceptionParser zzqy;
  private GoogleAnalytics zzqz;
  
  public ExceptionReporter(Tracker paramTracker, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    if (paramTracker != null)
    {
      if (paramContext != null)
      {
        this.zzqv = paramUncaughtExceptionHandler;
        this.zzqw = paramTracker;
        this.zzqy = new StandardExceptionParser(paramContext, new ArrayList());
        this.zzqx = paramContext.getApplicationContext();
        if (paramUncaughtExceptionHandler == null) {
          paramTracker = "null";
        } else {
          paramTracker = paramUncaughtExceptionHandler.getClass().getName();
        }
        paramTracker = String.valueOf(paramTracker);
        if (paramTracker.length() != 0) {
          paramTracker = "ExceptionReporter created, original handler is ".concat(paramTracker);
        } else {
          paramTracker = new String("ExceptionReporter created, original handler is ");
        }
        zzcl.v(paramTracker);
        return;
      }
      throw new NullPointerException("context cannot be null");
    }
    throw new NullPointerException("tracker cannot be null");
  }
  
  public ExceptionParser getExceptionParser()
  {
    return this.zzqy;
  }
  
  public void setExceptionParser(ExceptionParser paramExceptionParser)
  {
    this.zzqy = paramExceptionParser;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object localObject = "UncaughtException";
    if (this.zzqy != null)
    {
      if (paramThread != null) {
        localObject = paramThread.getName();
      } else {
        localObject = null;
      }
      localObject = this.zzqy.getDescription((String)localObject, paramThrowable);
    }
    String str = String.valueOf(localObject);
    if (str.length() != 0) {
      str = "Reporting uncaught exception: ".concat(str);
    } else {
      str = new String("Reporting uncaught exception: ");
    }
    zzcl.v(str);
    this.zzqw.send(new HitBuilders.ExceptionBuilder().setDescription((String)localObject).setFatal(true).build());
    if (this.zzqz == null) {
      this.zzqz = GoogleAnalytics.getInstance(this.zzqx);
    }
    localObject = this.zzqz;
    ((GoogleAnalytics)localObject).dispatchLocalHits();
    ((zza)localObject).zzh().zzby().zzbp();
    if (this.zzqv != null)
    {
      zzcl.v("Passing exception to the original handler");
      this.zzqv.uncaughtException(paramThread, paramThrowable);
    }
  }
  
  final Thread.UncaughtExceptionHandler zzl()
  {
    return this.zzqv;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/ExceptionReporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */