package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class PackageManagerWrapper
{
  private final Context zzhv;
  
  public PackageManagerWrapper(Context paramContext)
  {
    this.zzhv = paramContext;
  }
  
  @KeepForSdk
  public int checkCallingOrSelfPermission(String paramString)
  {
    return this.zzhv.checkCallingOrSelfPermission(paramString);
  }
  
  @KeepForSdk
  public int checkPermission(String paramString1, String paramString2)
  {
    return this.zzhv.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  @KeepForSdk
  public ApplicationInfo getApplicationInfo(String paramString, int paramInt)
    throws PackageManager.NameNotFoundException
  {
    return this.zzhv.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  @KeepForSdk
  public CharSequence getApplicationLabel(String paramString)
    throws PackageManager.NameNotFoundException
  {
    return this.zzhv.getPackageManager().getApplicationLabel(this.zzhv.getPackageManager().getApplicationInfo(paramString, 0));
  }
  
  @KeepForSdk
  public PackageInfo getPackageInfo(String paramString, int paramInt)
    throws PackageManager.NameNotFoundException
  {
    return this.zzhv.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  public final String[] getPackagesForUid(int paramInt)
  {
    return this.zzhv.getPackageManager().getPackagesForUid(paramInt);
  }
  
  @KeepForSdk
  public boolean isCallerInstantApp()
  {
    if (Binder.getCallingUid() == Process.myUid()) {
      return InstantApps.isInstantApp(this.zzhv);
    }
    if (PlatformVersion.isAtLeastO())
    {
      String str = this.zzhv.getPackageManager().getNameForUid(Binder.getCallingUid());
      if (str != null) {
        return this.zzhv.getPackageManager().isInstantApp(str);
      }
    }
    return false;
  }
  
  public final PackageInfo zza(String paramString, int paramInt1, int paramInt2)
    throws PackageManager.NameNotFoundException
  {
    return this.zzhv.getPackageManager().getPackageInfo(paramString, 64);
  }
  
  @TargetApi(19)
  public final boolean zzb(int paramInt, String paramString)
  {
    if (PlatformVersion.isAtLeastKitKat()) {}
    try
    {
      ((AppOpsManager)this.zzhv.getSystemService("appops")).checkPackage(paramInt, paramString);
      return true;
    }
    catch (SecurityException paramString) {}
    String[] arrayOfString = this.zzhv.getPackageManager().getPackagesForUid(paramInt);
    if ((paramString != null) && (arrayOfString != null))
    {
      paramInt = 0;
      while (paramInt < arrayOfString.length)
      {
        if (paramString.equals(arrayOfString[paramInt])) {
          return true;
        }
        paramInt += 1;
      }
    }
    return false;
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/wrappers/PackageManagerWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */