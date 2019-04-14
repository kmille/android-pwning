package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.PermissionChecker;

class AndroidPermissionService
{
  int checkSelfPermission(@NonNull Context paramContext, @NonNull String paramString)
  {
    return PermissionChecker.checkSelfPermission(paramContext, paramString);
  }
  
  void requestPermissions(@Nullable Activity paramActivity, @NonNull String[] paramArrayOfString, int paramInt)
  {
    if (paramActivity == null) {
      return;
    }
    ActivityCompat.requestPermissions(paramActivity, paramArrayOfString, paramInt);
  }
  
  boolean shouldShowRequestPermissionRationale(@Nullable Activity paramActivity, @NonNull String paramString)
  {
    if (paramActivity == null) {
      return false;
    }
    return ActivityCompat.shouldShowRequestPermissionRationale(paramActivity, paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/AndroidPermissionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */