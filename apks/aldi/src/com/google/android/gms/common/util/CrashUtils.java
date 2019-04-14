package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public final class CrashUtils
{
  private static final String[] zzge = { "android.", "com.android.", "dalvik.", "java.", "javax." };
  private static DropBoxManager zzgf = null;
  private static boolean zzgg = false;
  private static int zzgh = -1;
  @GuardedBy("CrashUtils.class")
  private static int zzgi = 0;
  @GuardedBy("CrashUtils.class")
  private static int zzgj = 0;
  
  @KeepForSdk
  public static boolean addDynamiteErrorToDropBox(Context paramContext, Throwable paramThrowable)
  {
    return zza(paramContext, paramThrowable, 536870912);
  }
  
  private static boolean zza(Context paramContext, Throwable paramThrowable, int paramInt)
  {
    try
    {
      Preconditions.checkNotNull(paramContext);
      Preconditions.checkNotNull(paramThrowable);
      return false;
    }
    catch (Exception paramContext)
    {
      Log.e("CrashUtils", "Error adding exception to DropBox!", paramContext);
    }
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/CrashUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */