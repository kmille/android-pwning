package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;

public final class zzcu<T extends Context,  extends zzcy>
{
  private static Boolean zzabm;
  private final Handler handler;
  private final T zzabl;
  
  public zzcu(T paramT)
  {
    Preconditions.checkNotNull(paramT);
    this.zzabl = paramT;
    this.handler = new Handler();
  }
  
  private final void zzb(Runnable paramRunnable)
  {
    zzat.zzc(this.zzabl).zzby().zza(new zzcx(this, paramRunnable));
  }
  
  public static boolean zze(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (zzabm != null) {
      return zzabm.booleanValue();
    }
    boolean bool = zzdd.zzc(paramContext, "com.google.android.gms.analytics.AnalyticsService");
    zzabm = Boolean.valueOf(bool);
    return bool;
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final void onCreate()
  {
    zzat.zzc(this.zzabl).zzbu().zzq("Local AnalyticsService is starting up");
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final void onDestroy()
  {
    zzat.zzc(this.zzabl).zzbu().zzq("Local AnalyticsService is shutting down");
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      synchronized (zzct.lock)
      {
        WakeLock localWakeLock = zzct.zzabk;
        if ((localWakeLock != null) && (localWakeLock.isHeld())) {
          localWakeLock.release();
        }
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
    ??? = zzat.zzc(this.zzabl).zzbu();
    if (paramIntent == null)
    {
      ((zzaq)???).zzt("AnalyticsService started with null intent");
      return 2;
    }
    paramIntent = paramIntent.getAction();
    ((zzaq)???).zza("Local AnalyticsService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
    if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(paramIntent)) {
      zzb(new zzcv(this, paramInt2, (zzcm)???));
    }
    return 2;
  }
  
  @TargetApi(24)
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    zzcm localzzcm = zzat.zzc(this.zzabl).zzbu();
    String str = paramJobParameters.getExtras().getString("action");
    localzzcm.zza("Local AnalyticsJobService called. action", str);
    if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(str)) {
      zzb(new zzcw(this, localzzcm, paramJobParameters));
    }
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */