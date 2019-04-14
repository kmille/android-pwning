package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ApplicationVersionSignature
{
  private static final ConcurrentMap<String, Key> PACKAGE_NAME_TO_KEY = new ConcurrentHashMap();
  private static final String TAG = "AppVersionSignature";
  
  @Nullable
  private static PackageInfo getPackageInfo(@NonNull Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      StringBuilder localStringBuilder = new StringBuilder("Cannot resolve info for");
      localStringBuilder.append(paramContext.getPackageName());
      Log.e("AppVersionSignature", localStringBuilder.toString(), localNameNotFoundException);
    }
    return null;
  }
  
  @NonNull
  private static String getVersionCode(@Nullable PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo != null) {
      return String.valueOf(paramPackageInfo.versionCode);
    }
    return UUID.randomUUID().toString();
  }
  
  @NonNull
  public static Key obtain(@NonNull Context paramContext)
  {
    String str = paramContext.getPackageName();
    Key localKey2 = (Key)PACKAGE_NAME_TO_KEY.get(str);
    Key localKey1 = localKey2;
    if (localKey2 == null)
    {
      paramContext = obtainVersionSignature(paramContext);
      localKey1 = (Key)PACKAGE_NAME_TO_KEY.putIfAbsent(str, paramContext);
      if (localKey1 == null) {
        return paramContext;
      }
    }
    return localKey1;
  }
  
  @NonNull
  private static Key obtainVersionSignature(@NonNull Context paramContext)
  {
    return new ObjectKey(getVersionCode(getPackageInfo(paramContext)));
  }
  
  @VisibleForTesting
  static void reset()
  {
    PACKAGE_NAME_TO_KEY.clear();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/signature/ApplicationVersionSignature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */