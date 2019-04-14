package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

class zzdn
  extends BroadcastReceiver
{
  @VisibleForTesting
  private static final String zzaav = "com.google.android.gms.tagmanager.zzdn";
  private final zzfm zzbbk;
  
  zzdn(zzfm paramzzfm)
  {
    this.zzbbk = paramzzfm;
  }
  
  public static void zzp(Context paramContext)
  {
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(paramContext.getPackageName());
    localIntent.putExtra(zzaav, true);
    paramContext.sendBroadcast(localIntent);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      Bundle localBundle = paramIntent.getExtras();
      paramContext = Boolean.FALSE;
      if (localBundle != null) {
        paramContext = Boolean.valueOf(paramIntent.getExtras().getBoolean("noConnectivity"));
      }
      this.zzbbk.zzp(paramContext.booleanValue() ^ true);
      return;
    }
    if (("com.google.analytics.RADIO_POWERED".equals(paramContext)) && (!paramIntent.hasExtra(zzaav))) {
      this.zzbbk.zzpb();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */