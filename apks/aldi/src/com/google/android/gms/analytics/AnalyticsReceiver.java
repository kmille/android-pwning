package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.internal.measurement.zzct;

public final class AnalyticsReceiver
  extends BroadcastReceiver
{
  private zzct zzqp;
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.zzqp == null) {
      this.zzqp = new zzct();
    }
    zzct.onReceive(paramContext, paramIntent);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/AnalyticsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */