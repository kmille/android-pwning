package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public class PreviewActivity
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      super.onCreate(paramBundle);
      zzdi.zzcz("Preview activity");
      paramBundle = getIntent().getData();
      if (!TagManager.getInstance(this).zzb(paramBundle))
      {
        paramBundle = String.valueOf(paramBundle);
        localObject = new StringBuilder(String.valueOf(paramBundle).length() + 73);
        ((StringBuilder)localObject).append("Cannot preview the app with the uri: ");
        ((StringBuilder)localObject).append(paramBundle);
        ((StringBuilder)localObject).append(". Launching current version instead.");
        paramBundle = ((StringBuilder)localObject).toString();
        zzdi.zzab(paramBundle);
        localObject = new AlertDialog.Builder(this).create();
        ((AlertDialog)localObject).setTitle("Preview failure");
        ((AlertDialog)localObject).setMessage(paramBundle);
        ((AlertDialog)localObject).setButton(-1, "Continue", new zzeg(this));
        ((AlertDialog)localObject).show();
      }
      Object localObject = getPackageManager().getLaunchIntentForPackage(getPackageName());
      if (localObject != null)
      {
        paramBundle = String.valueOf(getPackageName());
        if (paramBundle.length() != 0) {
          paramBundle = "Invoke the launch activity for package name: ".concat(paramBundle);
        } else {
          paramBundle = new String("Invoke the launch activity for package name: ");
        }
        zzdi.zzcz(paramBundle);
        startActivity((Intent)localObject);
        return;
      }
      paramBundle = String.valueOf(getPackageName());
      if (paramBundle.length() != 0) {
        paramBundle = "No launch activity found for package name: ".concat(paramBundle);
      } else {
        paramBundle = new String("No launch activity found for package name: ");
      }
      zzdi.zzcz(paramBundle);
      return;
    }
    catch (Exception paramBundle)
    {
      paramBundle = String.valueOf(paramBundle.getMessage());
      if (paramBundle.length() != 0) {
        paramBundle = "Calling preview threw an exception: ".concat(paramBundle);
      } else {
        paramBundle = new String("Calling preview threw an exception: ");
      }
      zzdi.e(paramBundle);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/PreviewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */