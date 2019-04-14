package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;

@VisibleForTesting
public class CampaignTrackingReceiver
  extends BroadcastReceiver
{
  private static Boolean zzqt;
  
  public static boolean zza(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (zzqt != null) {
      return zzqt.booleanValue();
    }
    boolean bool = zzdd.zza(paramContext, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
    zzqt = Boolean.valueOf(bool);
    return bool;
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    zzat localzzat = zzat.zzc(paramContext);
    zzcm localzzcm = localzzat.zzbu();
    if (paramIntent == null)
    {
      localzzcm.zzt("CampaignTrackingReceiver received null intent");
      return;
    }
    String str = paramIntent.getStringExtra("referrer");
    paramIntent = paramIntent.getAction();
    localzzcm.zza("CampaignTrackingReceiver received", paramIntent);
    if (("com.android.vending.INSTALL_REFERRER".equals(paramIntent)) && (!TextUtils.isEmpty(str)))
    {
      zza(paramContext, str);
      int i = zzbu.zzdu();
      if (str.length() <= i)
      {
        paramContext = str;
      }
      else
      {
        localzzcm.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(i));
        paramContext = str.substring(0, i);
      }
      paramIntent = goAsync();
      localzzat.zzby().zza(paramContext, new zzc(this, paramIntent));
      return;
    }
    localzzcm.zzt("CampaignTrackingReceiver received unexpected intent without referrer extra");
  }
  
  protected void zza(Context paramContext, String paramString) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/CampaignTrackingReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */