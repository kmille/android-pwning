package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.util.List;

public class zzd
{
  private static final String[] ACCEPTABLE_ACCOUNT_TYPES = { "com.google", "com.google.work", "cn.google" };
  public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
  public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
  public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
  public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
  @SuppressLint({"InlinedApi"})
  public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
  @SuppressLint({"InlinedApi"})
  public static final String KEY_CALLER_UID = "callerUid";
  public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
  public static final String WORK_ACCOUNT_TYPE = "com.google.work";
  private static final ComponentName zzm = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  private static final Logger zzn = new Logger("Auth", new String[] { "GoogleAuthUtil" });
  
  public static void clearToken(Context paramContext, String paramString)
    throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
  {
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    ensurePlayServicesAvailable(paramContext, 8400000);
    Bundle localBundle = new Bundle();
    String str = paramContext.getApplicationInfo().packageName;
    localBundle.putString("clientPackageName", str);
    if (!localBundle.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
      localBundle.putString(KEY_ANDROID_PACKAGE_NAME, str);
    }
    paramString = new zzf(paramString, localBundle);
    zza(paramContext, zzm, paramString);
  }
  
  private static void ensurePlayServicesAvailable(Context paramContext, int paramInt)
    throws GoogleAuthException
  {
    try
    {
      GooglePlayServicesUtilLight.ensurePlayServicesAvailable(paramContext.getApplicationContext(), paramInt);
      return;
    }
    catch (GooglePlayServicesNotAvailableException paramContext)
    {
      throw new GoogleAuthException(paramContext.getMessage());
    }
    catch (GooglePlayServicesRepairableException paramContext)
    {
      throw new GooglePlayServicesAvailabilityException(paramContext.getConnectionStatusCode(), paramContext.getMessage(), paramContext.getIntent());
    }
  }
  
  public static List<AccountChangeEvent> getAccountChangeEvents(Context paramContext, int paramInt, String paramString)
    throws GoogleAuthException, IOException
  {
    Preconditions.checkNotEmpty(paramString, "accountName must be provided");
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    ensurePlayServicesAvailable(paramContext, 8400000);
    paramString = new zzg(paramString, paramInt);
    return (List)zza(paramContext, zzm, paramString);
  }
  
  public static String getAccountId(Context paramContext, String paramString)
    throws GoogleAuthException, IOException
  {
    Preconditions.checkNotEmpty(paramString, "accountName must be provided");
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    ensurePlayServicesAvailable(paramContext, 8400000);
    return getToken(paramContext, paramString, "^^_account_id_^^", new Bundle());
  }
  
  public static String getToken(Context paramContext, Account paramAccount, String paramString)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    return getToken(paramContext, paramAccount, paramString, new Bundle());
  }
  
  public static String getToken(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    zzb(paramAccount);
    return zzb(paramContext, paramAccount, paramString, paramBundle).zzb();
  }
  
  @Deprecated
  public static String getToken(Context paramContext, String paramString1, String paramString2)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    return getToken(paramContext, new Account(paramString1, "com.google"), paramString2);
  }
  
  @Deprecated
  public static String getToken(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    return getToken(paramContext, new Account(paramString1, "com.google"), paramString2, paramBundle);
  }
  
  @Deprecated
  @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
  public static void invalidateToken(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
  
  @TargetApi(23)
  public static Bundle removeAccount(Context paramContext, Account paramAccount)
    throws GoogleAuthException, IOException
  {
    Preconditions.checkNotNull(paramContext);
    zzb(paramAccount);
    ensurePlayServicesAvailable(paramContext, 8400000);
    paramAccount = new zzh(paramAccount);
    return (Bundle)zza(paramContext, zzm, paramAccount);
  }
  
  @TargetApi(26)
  public static Boolean requestGoogleAccountsAccess(Context paramContext)
    throws GoogleAuthException, IOException
  {
    Preconditions.checkNotNull(paramContext);
    ensurePlayServicesAvailable(paramContext, 11400000);
    zzi localzzi = new zzi(paramContext.getApplicationInfo().packageName);
    return (Boolean)zza(paramContext, zzm, localzzi);
  }
  
  /* Error */
  private static <T> T zza(Context paramContext, ComponentName paramComponentName, zzj<T> paramzzj)
    throws IOException, GoogleAuthException
  {
    // Byte code:
    //   0: new 250	com/google/android/gms/common/BlockingServiceConnection
    //   3: dup
    //   4: invokespecial 251	com/google/android/gms/common/BlockingServiceConnection:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: invokestatic 257	com/google/android/gms/common/internal/GmsClientSupervisor:getInstance	(Landroid/content/Context;)Lcom/google/android/gms/common/internal/GmsClientSupervisor;
    //   12: astore_0
    //   13: aload_0
    //   14: aload_1
    //   15: aload_3
    //   16: ldc 68
    //   18: invokevirtual 261	com/google/android/gms/common/internal/GmsClientSupervisor:bindService	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   21: ifeq +73 -> 94
    //   24: aload_2
    //   25: aload_3
    //   26: invokevirtual 265	com/google/android/gms/common/BlockingServiceConnection:getService	()Landroid/os/IBinder;
    //   29: invokeinterface 270 2 0
    //   34: astore_2
    //   35: aload_0
    //   36: aload_1
    //   37: aload_3
    //   38: ldc 68
    //   40: invokevirtual 274	com/google/android/gms/common/internal/GmsClientSupervisor:unbindService	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   43: aload_2
    //   44: areturn
    //   45: astore_2
    //   46: goto +38 -> 84
    //   49: astore_2
    //   50: getstatic 73	com/google/android/gms/auth/zzd:zzn	Lcom/google/android/gms/common/logging/Logger;
    //   53: ldc 68
    //   55: iconst_2
    //   56: anewarray 4	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: ldc_w 276
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: aload_2
    //   68: aastore
    //   69: invokevirtual 280	com/google/android/gms/common/logging/Logger:i	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: new 84	java/io/IOException
    //   75: dup
    //   76: ldc_w 276
    //   79: aload_2
    //   80: invokespecial 283	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   83: athrow
    //   84: aload_0
    //   85: aload_1
    //   86: aload_3
    //   87: ldc 68
    //   89: invokevirtual 274	com/google/android/gms/common/internal/GmsClientSupervisor:unbindService	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   92: aload_2
    //   93: athrow
    //   94: new 84	java/io/IOException
    //   97: dup
    //   98: ldc_w 285
    //   101: invokespecial 286	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	paramContext	Context
    //   0	105	1	paramComponentName	ComponentName
    //   0	105	2	paramzzj	zzj<T>
    //   7	80	3	localBlockingServiceConnection	com.google.android.gms.common.BlockingServiceConnection
    // Exception table:
    //   from	to	target	type
    //   24	35	45	finally
    //   50	84	45	finally
    //   24	35	49	android/os/RemoteException
    //   24	35	49	java/lang/InterruptedException
  }
  
  private static <T> T zza(T paramT)
    throws IOException
  {
    if (paramT != null) {
      return paramT;
    }
    zzn.w("GoogleAuthUtil", new Object[] { "Binder call returned null." });
    throw new IOException("Service unavailable.");
  }
  
  public static TokenData zzb(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
    throws IOException, UserRecoverableAuthException, GoogleAuthException
  {
    Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
    Preconditions.checkNotEmpty(paramString, "Scope cannot be empty or null.");
    zzb(paramAccount);
    ensurePlayServicesAvailable(paramContext, 8400000);
    if (paramBundle == null) {
      paramBundle = new Bundle();
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    String str = paramContext.getApplicationInfo().packageName;
    paramBundle.putString("clientPackageName", str);
    if (TextUtils.isEmpty(paramBundle.getString(KEY_ANDROID_PACKAGE_NAME))) {
      paramBundle.putString(KEY_ANDROID_PACKAGE_NAME, str);
    }
    paramBundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    paramAccount = new zze(paramAccount, paramString, paramBundle);
    return (TokenData)zza(paramContext, zzm, paramAccount);
  }
  
  private static void zzb(Account paramAccount)
  {
    if (paramAccount != null)
    {
      if (!TextUtils.isEmpty(paramAccount.name))
      {
        String[] arrayOfString = ACCEPTABLE_ACCOUNT_TYPES;
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          if (arrayOfString[i].equals(paramAccount.type)) {
            return;
          }
          i += 1;
        }
        throw new IllegalArgumentException("Account type not supported");
      }
      throw new IllegalArgumentException("Account name cannot be empty!");
    }
    throw new IllegalArgumentException("Account cannot be null");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */