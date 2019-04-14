package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@KeepForSdk
public class AndroidUtilsLight
{
  private static volatile int zzgd = -1;
  
  @TargetApi(24)
  @KeepForSdk
  public static Context getDeviceProtectedStorageContext(Context paramContext)
  {
    Context localContext = paramContext;
    if (PlatformVersion.isAtLeastN())
    {
      localContext = paramContext;
      if (!paramContext.isDeviceProtectedStorage()) {
        localContext = paramContext.createDeviceProtectedStorageContext();
      }
    }
    return localContext;
  }
  
  @KeepForSdk
  public static byte[] getPackageCertificateHashBytes(Context paramContext, String paramString)
    throws PackageManager.NameNotFoundException
  {
    paramContext = Wrappers.packageManager(paramContext).getPackageInfo(paramString, 64);
    if ((paramContext.signatures != null) && (paramContext.signatures.length == 1))
    {
      paramString = zzi("SHA1");
      if (paramString != null) {
        return paramString.digest(paramContext.signatures[0].toByteArray());
      }
    }
    return null;
  }
  
  public static MessageDigest zzi(String paramString)
  {
    int i = 0;
    while (i < 2)
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/AndroidUtilsLight.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */