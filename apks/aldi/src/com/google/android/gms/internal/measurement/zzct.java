package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;

public final class zzct
{
  static Object lock = new Object();
  static WakeLock zzabk;
  private static Boolean zzqt;
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public static void onReceive(Context paramContext, Intent arg1)
  {
    zzcm localzzcm = zzat.zzc(paramContext).zzbu();
    if (??? == null)
    {
      localzzcm.zzt("AnalyticsReceiver called with null intent");
      return;
    }
    ??? = ???.getAction();
    localzzcm.zza("Local AnalyticsReceiver got", ???);
    if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(???))
    {
      boolean bool = zzcu.zze(paramContext);
      Intent localIntent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localIntent.setComponent(new ComponentName(paramContext, "com.google.android.gms.analytics.AnalyticsService"));
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      synchronized (lock)
      {
        paramContext.startService(localIntent);
        if (!bool) {
          return;
        }
        try
        {
          if (zzabk == null)
          {
            paramContext = new WakeLock(paramContext, 1, "Analytics WakeLock");
            zzabk = paramContext;
            paramContext.setReferenceCounted(false);
          }
          zzabk.acquire(1000L);
        }
        catch (SecurityException paramContext)
        {
          for (;;) {}
        }
        localzzcm.zzt("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
        return;
      }
    }
  }
  
  public static boolean zza(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (zzqt != null) {
      return zzqt.booleanValue();
    }
    boolean bool = zzdd.zza(paramContext, "com.google.android.gms.analytics.AnalyticsReceiver", false);
    zzqt = Boolean.valueOf(bool);
    return bool;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */