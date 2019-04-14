package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

public final class LogTime
{
  private static final double MILLIS_MULTIPLIER;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    double d = 1.0D;
    if (i >= 17) {
      d = 1.0D / Math.pow(10.0D, 6.0D);
    }
    MILLIS_MULTIPLIER = d;
  }
  
  public static double getElapsedMillis(long paramLong)
  {
    double d1 = getLogTime() - paramLong;
    double d2 = MILLIS_MULTIPLIER;
    Double.isNaN(d1);
    return d1 * d2;
  }
  
  @TargetApi(17)
  public static long getLogTime()
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return SystemClock.elapsedRealtimeNanos();
    }
    return SystemClock.uptimeMillis();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/LogTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */