package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

final class zzm
  implements zzn
{
  private final PendingIntent zzat;
  private final Context zzk;
  
  zzm(Context paramContext)
  {
    this.zzk = paramContext;
    this.zzat = PendingIntent.getBroadcast(paramContext, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
  }
  
  private final Intent zzh(String paramString)
  {
    Intent localIntent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("app", this.zzat);
    localIntent.putExtra("source", 4);
    localIntent.putExtra("source_version", 12451000);
    localIntent.putExtra("scheduler_action", paramString);
    return localIntent;
  }
  
  public final boolean zzd(ComponentName paramComponentName)
  {
    Intent localIntent = zzh("CANCEL_ALL");
    localIntent.putExtra("component", paramComponentName);
    this.zzk.sendBroadcast(localIntent);
    return true;
  }
  
  public final boolean zzd(ComponentName paramComponentName, String paramString)
  {
    Intent localIntent = zzh("CANCEL_TASK");
    localIntent.putExtra("component", paramComponentName);
    localIntent.putExtra("tag", paramString);
    this.zzk.sendBroadcast(localIntent);
    return true;
  }
  
  public final boolean zzd(Task paramTask)
  {
    Intent localIntent = zzh("SCHEDULE_TASK");
    Bundle localBundle = new Bundle();
    paramTask.toBundle(localBundle);
    localIntent.putExtras(localBundle);
    this.zzk.sendBroadcast(localIntent);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */