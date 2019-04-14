package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
@ShowFirstParty
public class GooglePlayServicesUtilLight
{
  @KeepForSdk
  static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
  @KeepForSdk
  static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
  @KeepForSdk
  public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
  @Deprecated
  @KeepForSdk
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  @Deprecated
  @KeepForSdk
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
  @KeepForSdk
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  @KeepForSdk
  @VisibleForTesting
  static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
  @VisibleForTesting
  private static boolean zzag = false;
  @VisibleForTesting
  private static boolean zzah = false;
  private static boolean zzai = false;
  @VisibleForTesting
  private static boolean zzaj = false;
  private static final AtomicBoolean zzak = new AtomicBoolean();
  
  @Deprecated
  @KeepForSdk
  public static void cancelAvailabilityErrorNotifications(Context paramContext)
  {
    if (sCanceledAvailabilityNotification.getAndSet(true)) {
      return;
    }
    try
    {
      paramContext = (NotificationManager)paramContext.getSystemService("notification");
      if (paramContext != null) {
        paramContext.cancel(10436);
      }
      return;
    }
    catch (SecurityException paramContext) {}
  }
  
  @KeepForSdk
  @ShowFirstParty
  public static void enableUsingApkIndependentContext()
  {
    zzak.set(true);
  }
  
  @Deprecated
  @KeepForSdk
  public static void ensurePlayServicesAvailable(Context paramContext, int paramInt)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    paramInt = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext, paramInt);
    if (paramInt != 0)
    {
      paramContext = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(paramContext, paramInt, "e");
      StringBuilder localStringBuilder = new StringBuilder(57);
      localStringBuilder.append("GooglePlayServices not available due to error ");
      localStringBuilder.append(paramInt);
      Log.e("GooglePlayServicesUtil", localStringBuilder.toString());
      if (paramContext == null) {
        throw new GooglePlayServicesNotAvailableException(paramInt);
      }
      throw new GooglePlayServicesRepairableException(paramInt, "Google Play Services not available", paramContext);
    }
  }
  
  @Deprecated
  @KeepForSdk
  @ShowFirstParty
  public static int getApkVersion(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return paramContext.versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return 0;
  }
  
  @Deprecated
  @KeepForSdk
  @ShowFirstParty
  public static int getClientVersion(Context paramContext)
  {
    Preconditions.checkState(true);
    return ClientLibraryUtils.getClientVersion(paramContext, paramContext.getPackageName());
  }
  
  @Deprecated
  @KeepForSdk
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(paramContext, paramInt1, paramInt2);
  }
  
  @Deprecated
  @KeepForSdk
  @VisibleForTesting
  public static String getErrorString(int paramInt)
  {
    return ConnectionResult.zza(paramInt);
  }
  
  @Deprecated
  @KeepForSdk
  @ShowFirstParty
  public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int paramInt)
  {
    return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, paramInt, null);
  }
  
  @KeepForSdk
  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      paramContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  @KeepForSdk
  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  @KeepForSdk
  @ShowFirstParty
  public static boolean honorsDebugCertificates(Context paramContext)
  {
    if (!zzaj) {}
    try
    {
      try
      {
        PackageInfo localPackageInfo = Wrappers.packageManager(paramContext).getPackageInfo("com.google.android.gms", 64);
        GoogleSignatureVerifier.getInstance(paramContext);
        if ((localPackageInfo != null) && (!GoogleSignatureVerifier.zza(localPackageInfo, false)) && (GoogleSignatureVerifier.zza(localPackageInfo, true))) {
          zzai = true;
        }
      }
      finally
      {
        zzaj = true;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    zzaj = true;
    if (!zzai) {
      return !DeviceProperties.isUserBuild();
    }
    return true;
  }
  
  @Deprecated
  @KeepForSdk
  @HideFirstParty
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    return isGooglePlayServicesAvailable(paramContext, GOOGLE_PLAY_SERVICES_VERSION_CODE);
  }
  
  @Deprecated
  @KeepForSdk
  public static int isGooglePlayServicesAvailable(Context paramContext, int paramInt)
  {
    try
    {
      paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
    }
    catch (Throwable localThrowable)
    {
      int i;
      boolean bool;
      for (;;) {}
    }
    Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
    if ((!"com.google.android.gms".equals(paramContext.getPackageName())) && (!zzak.get()))
    {
      i = zzp.zzd(paramContext);
      if (i != 0)
      {
        if (i != GOOGLE_PLAY_SERVICES_VERSION_CODE)
        {
          paramInt = GOOGLE_PLAY_SERVICES_VERSION_CODE;
          paramContext = new StringBuilder(320);
          paramContext.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
          paramContext.append(paramInt);
          paramContext.append(" but found ");
          paramContext.append(i);
          paramContext.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
          throw new IllegalStateException(paramContext.toString());
        }
      }
      else {
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
    }
    if ((!DeviceProperties.isWearableWithoutPlayStore(paramContext)) && (!DeviceProperties.zzf(paramContext))) {
      bool = true;
    } else {
      bool = false;
    }
    return zza(paramContext, bool, paramInt);
  }
  
  @Deprecated
  @KeepForSdk
  public static boolean isGooglePlayServicesUid(Context paramContext, int paramInt)
  {
    return UidVerifier.isGooglePlayServicesUid(paramContext, paramInt);
  }
  
  @Deprecated
  @KeepForSdk
  @ShowFirstParty
  public static boolean isPlayServicesPossiblyUpdating(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return isUninstalledAppPossiblyUpdating(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  @KeepForSdk
  @ShowFirstParty
  public static boolean isPlayStorePossiblyUpdating(Context paramContext, int paramInt)
  {
    if (paramInt == 9) {
      return isUninstalledAppPossiblyUpdating(paramContext, "com.android.vending");
    }
    return false;
  }
  
  @TargetApi(18)
  @KeepForSdk
  public static boolean isRestrictedUserProfile(Context paramContext)
  {
    if (PlatformVersion.isAtLeastJellyBeanMR2())
    {
      paramContext = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
      if ((paramContext != null) && ("true".equals(paramContext.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
  
  @Deprecated
  @KeepForSdk
  @ShowFirstParty
  @VisibleForTesting
  public static boolean isSidewinderDevice(Context paramContext)
  {
    return DeviceProperties.isSidewinder(paramContext);
  }
  
  /* Error */
  @TargetApi(21)
  static boolean isUninstalledAppPossiblyUpdating(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 18
    //   3: invokevirtual 246	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   6: istore_2
    //   7: invokestatic 324	com/google/android/gms/common/util/PlatformVersion:isAtLeastLollipop	()Z
    //   10: ifeq +51 -> 61
    //   13: aload_0
    //   14: invokevirtual 137	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   17: invokevirtual 328	android/content/pm/PackageManager:getPackageInstaller	()Landroid/content/pm/PackageInstaller;
    //   20: invokevirtual 334	android/content/pm/PackageInstaller:getAllSessions	()Ljava/util/List;
    //   23: astore_3
    //   24: aload_3
    //   25: invokeinterface 340 1 0
    //   30: astore_3
    //   31: aload_3
    //   32: invokeinterface 345 1 0
    //   37: ifeq +24 -> 61
    //   40: aload_1
    //   41: aload_3
    //   42: invokeinterface 349 1 0
    //   47: checkcast 351	android/content/pm/PackageInstaller$SessionInfo
    //   50: invokevirtual 354	android/content/pm/PackageInstaller$SessionInfo:getAppPackageName	()Ljava/lang/String;
    //   53: invokevirtual 246	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   56: ifeq -25 -> 31
    //   59: iconst_1
    //   60: ireturn
    //   61: aload_0
    //   62: invokevirtual 137	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   65: astore_3
    //   66: aload_3
    //   67: aload_1
    //   68: sipush 8192
    //   71: invokevirtual 358	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   74: astore_1
    //   75: iload_2
    //   76: ifeq +8 -> 84
    //   79: aload_1
    //   80: getfield 363	android/content/pm/ApplicationInfo:enabled	Z
    //   83: ireturn
    //   84: aload_1
    //   85: getfield 363	android/content/pm/ApplicationInfo:enabled	Z
    //   88: ifeq +14 -> 102
    //   91: aload_0
    //   92: invokestatic 365	com/google/android/gms/common/GooglePlayServicesUtilLight:isRestrictedUserProfile	(Landroid/content/Context;)Z
    //   95: istore_2
    //   96: iload_2
    //   97: ifne +5 -> 102
    //   100: iconst_1
    //   101: ireturn
    //   102: iconst_0
    //   103: ireturn
    //   104: astore_0
    //   105: iconst_0
    //   106: ireturn
    //   107: astore_0
    //   108: iconst_0
    //   109: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	paramContext	Context
    //   0	110	1	paramString	String
    //   6	91	2	bool	boolean
    //   23	44	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	24	104	java/lang/Exception
    //   66	75	107	android/content/pm/PackageManager$NameNotFoundException
    //   79	84	107	android/content/pm/PackageManager$NameNotFoundException
    //   84	96	107	android/content/pm/PackageManager$NameNotFoundException
  }
  
  @Deprecated
  @KeepForSdk
  public static boolean isUserRecoverableError(int paramInt)
  {
    if (paramInt != 9) {
      switch (paramInt)
      {
      default: 
        return false;
      }
    }
    return true;
  }
  
  @Deprecated
  @TargetApi(19)
  @KeepForSdk
  public static boolean uidHasPackageName(Context paramContext, int paramInt, String paramString)
  {
    return UidVerifier.uidHasPackageName(paramContext, paramInt, paramString);
  }
  
  /* Error */
  @VisibleForTesting
  private static int zza(Context paramContext, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: iload_2
    //   1: iflt +9 -> 10
    //   4: iconst_1
    //   5: istore 4
    //   7: goto +6 -> 13
    //   10: iconst_0
    //   11: istore 4
    //   13: iload 4
    //   15: invokestatic 375	com/google/android/gms/common/internal/Preconditions:checkArgument	(Z)V
    //   18: aload_0
    //   19: invokevirtual 137	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   22: astore 6
    //   24: aconst_null
    //   25: astore 5
    //   27: iload_1
    //   28: ifeq +18 -> 46
    //   31: aload 6
    //   33: ldc 24
    //   35: sipush 8256
    //   38: invokevirtual 143	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   41: astore 5
    //   43: goto +3 -> 46
    //   46: aload 6
    //   48: ldc 18
    //   50: bipush 64
    //   52: invokevirtual 143	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   55: astore 7
    //   57: aload_0
    //   58: invokestatic 207	com/google/android/gms/common/GoogleSignatureVerifier:getInstance	(Landroid/content/Context;)Lcom/google/android/gms/common/GoogleSignatureVerifier;
    //   61: pop
    //   62: aload 7
    //   64: iconst_1
    //   65: invokestatic 210	com/google/android/gms/common/GoogleSignatureVerifier:zza	(Landroid/content/pm/PackageInfo;Z)Z
    //   68: ifne +6 -> 74
    //   71: bipush 9
    //   73: ireturn
    //   74: iload_1
    //   75: ifeq +35 -> 110
    //   78: aload 5
    //   80: iconst_1
    //   81: invokestatic 210	com/google/android/gms/common/GoogleSignatureVerifier:zza	(Landroid/content/pm/PackageInfo;Z)Z
    //   84: ifeq +23 -> 107
    //   87: aload 5
    //   89: getfield 379	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   92: iconst_0
    //   93: aaload
    //   94: aload 7
    //   96: getfield 379	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   99: iconst_0
    //   100: aaload
    //   101: invokevirtual 382	android/content/pm/Signature:equals	(Ljava/lang/Object;)Z
    //   104: ifne +6 -> 110
    //   107: bipush 9
    //   109: ireturn
    //   110: aload 7
    //   112: getfield 148	android/content/pm/PackageInfo:versionCode	I
    //   115: invokestatic 388	com/google/android/gms/common/util/zzb:zzc	(I)I
    //   118: iload_2
    //   119: invokestatic 388	com/google/android/gms/common/util/zzb:zzc	(I)I
    //   122: if_icmpge +49 -> 171
    //   125: aload 7
    //   127: getfield 148	android/content/pm/PackageInfo:versionCode	I
    //   130: istore_3
    //   131: new 100	java/lang/StringBuilder
    //   134: dup
    //   135: bipush 77
    //   137: invokespecial 102	java/lang/StringBuilder:<init>	(I)V
    //   140: astore_0
    //   141: aload_0
    //   142: ldc_w 390
    //   145: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_0
    //   150: iload_2
    //   151: invokevirtual 111	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload_0
    //   156: ldc_w 258
    //   159: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_0
    //   164: iload_3
    //   165: invokevirtual 111	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: iconst_2
    //   170: ireturn
    //   171: aload 7
    //   173: getfield 394	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   176: astore 5
    //   178: aload 5
    //   180: astore_0
    //   181: aload 5
    //   183: ifnonnull +28 -> 211
    //   186: aload 6
    //   188: ldc 18
    //   190: iconst_0
    //   191: invokevirtual 358	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   194: astore_0
    //   195: goto +16 -> 211
    //   198: astore_0
    //   199: ldc 113
    //   201: ldc_w 396
    //   204: aload_0
    //   205: invokestatic 400	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   208: pop
    //   209: iconst_1
    //   210: ireturn
    //   211: aload_0
    //   212: getfield 363	android/content/pm/ApplicationInfo:enabled	Z
    //   215: ifne +5 -> 220
    //   218: iconst_3
    //   219: ireturn
    //   220: iconst_0
    //   221: ireturn
    //   222: astore_0
    //   223: bipush 9
    //   225: ireturn
    //   226: astore_0
    //   227: iconst_1
    //   228: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	paramContext	Context
    //   0	229	1	paramBoolean	boolean
    //   0	229	2	paramInt	int
    //   130	35	3	i	int
    //   5	9	4	bool	boolean
    //   25	157	5	localObject	Object
    //   22	165	6	localPackageManager	PackageManager
    //   55	117	7	localPackageInfo	PackageInfo
    // Exception table:
    //   from	to	target	type
    //   186	195	198	android/content/pm/PackageManager$NameNotFoundException
    //   31	43	222	android/content/pm/PackageManager$NameNotFoundException
    //   46	57	226	android/content/pm/PackageManager$NameNotFoundException
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/GooglePlayServicesUtilLight.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */