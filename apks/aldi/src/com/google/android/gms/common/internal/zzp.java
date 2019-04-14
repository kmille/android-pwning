package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

public final class zzp
{
  private static Object sLock = new Object();
  @GuardedBy("sLock")
  private static boolean zzeo;
  private static String zzep;
  private static int zzeq;
  
  public static String zzc(Context paramContext)
  {
    zze(paramContext);
    return zzep;
  }
  
  public static int zzd(Context paramContext)
  {
    zze(paramContext);
    return zzeq;
  }
  
  private static void zze(Context paramContext)
  {
    synchronized (sLock)
    {
      if (zzeo) {
        return;
      }
      zzeo = true;
      String str = paramContext.getPackageName();
      paramContext = Wrappers.packageManager(paramContext);
      try
      {
        paramContext = paramContext.getApplicationInfo(str, 128).metaData;
        if (paramContext == null) {
          return;
        }
        zzep = paramContext.getString("com.google.app.id");
        zzeq = paramContext.getInt("com.google.android.gms.version");
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.wtf("MetadataValueReader", "This should never happen.", paramContext);
      }
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */