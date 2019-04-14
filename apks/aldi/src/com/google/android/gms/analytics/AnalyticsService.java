package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcy;

public final class AnalyticsService
  extends Service
  implements zzcy
{
  private zzcu<AnalyticsService> zzqo;
  
  private final zzcu<AnalyticsService> zzj()
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
  
  public final IBinder onBind(Intent paramIntent)
  {
    zzj();
    return null;
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
  
  public final void zza(JobParameters paramJobParameters, boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */