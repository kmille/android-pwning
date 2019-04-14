package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

public final class zzbz
  extends zzar
{
  private boolean zzyf;
  private boolean zzyg;
  private final AlarmManager zzyh = (AlarmManager)getContext().getSystemService("alarm");
  private Integer zzyi;
  
  protected zzbz(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  private final int getJobId()
  {
    if (this.zzyi == null)
    {
      String str = String.valueOf(getContext().getPackageName());
      if (str.length() != 0) {
        str = "analytics".concat(str);
      } else {
        str = new String("analytics");
      }
      this.zzyi = Integer.valueOf(str.hashCode());
    }
    return this.zzyi.intValue();
  }
  
  private final PendingIntent zzek()
  {
    Intent localIntent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    localIntent.setComponent(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"));
    return PendingIntent.getBroadcast(getContext(), 0, localIntent, 0);
  }
  
  public final void cancel()
  {
    this.zzyg = false;
    this.zzyh.cancel(zzek());
    if (Build.VERSION.SDK_INT >= 24)
    {
      JobScheduler localJobScheduler = (JobScheduler)getContext().getSystemService("jobscheduler");
      zza("Cancelling job. JobID", Integer.valueOf(getJobId()));
      localJobScheduler.cancel(getJobId());
    }
  }
  
  protected final void zzac()
  {
    try
    {
      cancel();
      if (zzbu.zzdw() > 0L)
      {
        ActivityInfo localActivityInfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2);
        if ((localActivityInfo != null) && (localActivityInfo.enabled))
        {
          zzq("Receiver registered for local dispatch.");
          this.zzyf = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public final boolean zzef()
  {
    return this.zzyg;
  }
  
  public final boolean zzei()
  {
    return this.zzyf;
  }
  
  public final void zzej()
  {
    zzch();
    Preconditions.checkState(this.zzyf, "Receiver not registered");
    long l1 = zzbu.zzdw();
    if (l1 > 0L)
    {
      cancel();
      long l2 = zzbt().elapsedRealtime();
      this.zzyg = true;
      if (Build.VERSION.SDK_INT >= 24)
      {
        zzq("Scheduling upload with JobScheduler");
        Object localObject = new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsJobService");
        JobScheduler localJobScheduler = (JobScheduler)getContext().getSystemService("jobscheduler");
        localObject = new JobInfo.Builder(getJobId(), (ComponentName)localObject);
        ((JobInfo.Builder)localObject).setMinimumLatency(l1);
        ((JobInfo.Builder)localObject).setOverrideDeadline(l1 << 1);
        PersistableBundle localPersistableBundle = new PersistableBundle();
        localPersistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        ((JobInfo.Builder)localObject).setExtras(localPersistableBundle);
        localObject = ((JobInfo.Builder)localObject).build();
        zza("Scheduling job. JobID", Integer.valueOf(getJobId()));
        localJobScheduler.schedule((JobInfo)localObject);
        return;
      }
      zzq("Scheduling upload with AlarmManager");
      this.zzyh.setInexactRepeating(2, l2 + l1, l1, zzek());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */