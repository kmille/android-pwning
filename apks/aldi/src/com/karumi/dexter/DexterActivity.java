package com.karumi.dexter;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback;
import android.view.Window;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public final class DexterActivity
  extends Activity
  implements ActivityCompat.OnRequestPermissionsResultCallback
{
  private boolean isTargetSdkUnderAndroidM()
  {
    boolean bool = false;
    try
    {
      int i = getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.targetSdkVersion;
      if (i < 23) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Dexter.onActivityReady(this);
    getWindow().addFlags(16);
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
    Dexter.onActivityDestroyed();
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    Dexter.onActivityReady(this);
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    if (isTargetSdkUnderAndroidM())
    {
      localLinkedList2.addAll(Arrays.asList(paramArrayOfString));
    }
    else
    {
      paramInt = 0;
      while (paramInt < paramArrayOfString.length)
      {
        String str = paramArrayOfString[paramInt];
        switch (paramArrayOfInt[paramInt])
        {
        default: 
          break;
        case 0: 
          localLinkedList1.add(str);
          break;
        case -2: 
        case -1: 
          localLinkedList2.add(str);
        }
        paramInt += 1;
      }
    }
    Dexter.onPermissionsRequested(localLinkedList1, localLinkedList2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/karumi/dexter/DexterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */