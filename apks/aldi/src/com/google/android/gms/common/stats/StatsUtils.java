package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class StatsUtils
{
  @KeepForSdk
  public static String getEventKey(Context paramContext, Intent paramIntent)
  {
    long l = System.identityHashCode(paramContext);
    return String.valueOf(System.identityHashCode(paramIntent) | l << 32);
  }
  
  @KeepForSdk
  public static String getEventKey(PowerManager.WakeLock paramWakeLock, String paramString)
  {
    String str = String.valueOf(String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramWakeLock)));
    paramWakeLock = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paramWakeLock = "";
    }
    paramWakeLock = String.valueOf(paramWakeLock);
    if (paramWakeLock.length() != 0) {
      return str.concat(paramWakeLock);
    }
    return new String(str);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/stats/StatsUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */