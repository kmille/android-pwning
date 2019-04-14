package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcy;

@TargetApi(24)
public final class AnalyticsJobService
  extends JobService
  implements zzcy
{
  private zzcu<AnalyticsJobService> zzqo;
  
  private final zzcu<AnalyticsJobService> zzj()
  {
    if (this.zzqo == null) {
      this.zzqo = new zzcu(this);
    }
    return this.zzqo;
  }
  
  public final boolean callServiceStopSelfResult(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final void onCreate()
  {
    super.onCreate();
    zzj().onCreate();
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final void onDestroy()
  {
    zzj().onDestroy();
    super.onDestroy();
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return zzj().onStartCommand(paramIntent, paramInt1, paramInt2);
  }
  
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    return zzj().onStartJob(paramJobParameters);
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters)
  {
    return false;
  }
  
  @TargetApi(24)
  public final void zza(JobParameters paramJobParameters, boolean paramBoolean)
  {
    jobFinished(paramJobParameters, false);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */