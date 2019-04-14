package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class InstantApps
{
  private static Context zzht;
  private static Boolean zzhu;
  
  @KeepForSdk
  public static boolean isInstantApp(Context paramContext)
  {
    Context localContext;
    for (;;)
    {
      try
      {
        localContext = paramContext.getApplicationContext();
        if ((zzht != null) && (zzhu != null) && (zzht == localContext))
        {
          bool = zzhu.booleanValue();
          return bool;
        }
        zzhu = null;
        if (PlatformVersion.isAtLeastO())
        {
          paramContext = Boolean.valueOf(localContext.getPackageManager().isInstantApp());
          zzhu = paramContext;
        }
      }
      finally {}
      try
      {
        paramContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
        zzhu = Boolean.TRUE;
      }
      catch (ClassNotFoundException paramContext)
      {
        continue;
      }
      paramContext = Boolean.FALSE;
    }
    zzht = localContext;
    boolean bool = zzhu.booleanValue();
    return bool;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/wrappers/InstantApps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */