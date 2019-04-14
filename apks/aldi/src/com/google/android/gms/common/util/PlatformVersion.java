package com.google.android.gms.common.util;

import android.os.Build.VERSION;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@VisibleForTesting
public final class PlatformVersion
{
  @KeepForSdk
  public static boolean isAtLeastHoneycomb()
  {
    return true;
  }
  
  @KeepForSdk
  public static boolean isAtLeastHoneycombMR1()
  {
    return true;
  }
  
  @KeepForSdk
  public static boolean isAtLeastIceCreamSandwich()
  {
    return true;
  }
  
  @KeepForSdk
  public static boolean isAtLeastIceCreamSandwichMR1()
  {
    return Build.VERSION.SDK_INT >= 15;
  }
  
  @KeepForSdk
  public static boolean isAtLeastJellyBean()
  {
    return Build.VERSION.SDK_INT >= 16;
  }
  
  @KeepForSdk
  public static boolean isAtLeastJellyBeanMR1()
  {
    return Build.VERSION.SDK_INT >= 17;
  }
  
  @KeepForSdk
  public static boolean isAtLeastJellyBeanMR2()
  {
    return Build.VERSION.SDK_INT >= 18;
  }
  
  @KeepForSdk
  public static boolean isAtLeastKitKat()
  {
    return Build.VERSION.SDK_INT >= 19;
  }
  
  @KeepForSdk
  public static boolean isAtLeastKitKatWatch()
  {
    return Build.VERSION.SDK_INT >= 20;
  }
  
  @KeepForSdk
  public static boolean isAtLeastLollipop()
  {
    return Build.VERSION.SDK_INT >= 21;
  }
  
  @KeepForSdk
  public static boolean isAtLeastLollipopMR1()
  {
    return Build.VERSION.SDK_INT >= 22;
  }
  
  @KeepForSdk
  public static boolean isAtLeastM()
  {
    return Build.VERSION.SDK_INT >= 23;
  }
  
  @KeepForSdk
  public static boolean isAtLeastN()
  {
    return Build.VERSION.SDK_INT >= 24;
  }
  
  @KeepForSdk
  public static boolean isAtLeastO()
  {
    return Build.VERSION.SDK_INT >= 26;
  }
  
  @KeepForSdk
  public static boolean isAtLeastP()
  {
    return Build.VERSION.SDK_INT >= 28;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/PlatformVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */