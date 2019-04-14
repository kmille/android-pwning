package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.WakeLockTracker;

@KeepForSdk
@ShowFirstParty
public abstract class GCoreWakefulBroadcastReceiver
  extends WakefulBroadcastReceiver
{
  private static String TAG = "GCoreWakefulBroadcastReceiver";
  
  @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
  @KeepForSdk
  public static boolean completeWakefulIntent(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    if (paramContext != null)
    {
      WakeLockTracker.getInstance().registerReleaseEvent(paramContext, paramIntent);
    }
    else
    {
      paramContext = String.valueOf(paramIntent.toUri(0));
      if (paramContext.length() != 0) {
        "context shouldn't be null. intent: ".concat(paramContext);
      } else {
        new String("context shouldn't be null. intent: ");
      }
    }
    return WakefulBroadcastReceiver.completeWakefulIntent(paramIntent);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/stats/GCoreWakefulBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */