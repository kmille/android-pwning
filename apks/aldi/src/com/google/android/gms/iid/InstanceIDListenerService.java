package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

@Deprecated
public class InstanceIDListenerService
  extends zze
{
  static void zzd(Context paramContext, zzak paramzzak)
  {
    paramzzak.zzx();
    paramzzak = new Intent("com.google.android.gms.iid.InstanceID");
    paramzzak.putExtra("CMD", "RST");
    paramzzak.setClassName(paramContext, "com.google.android.gms.gcm.GcmReceiver");
    paramContext.sendBroadcast(paramzzak);
  }
  
  public void handleIntent(Intent paramIntent)
  {
    if (!"com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction())) {
      return;
    }
    Object localObject = null;
    String str = paramIntent.getStringExtra("subtype");
    if (str != null)
    {
      localObject = new Bundle();
      ((Bundle)localObject).putString("subtype", str);
    }
    localObject = InstanceID.getInstance(this, (Bundle)localObject);
    paramIntent = paramIntent.getStringExtra("CMD");
    if (Log.isLoggable("InstanceID", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(paramIntent).length());
      localStringBuilder.append("Service command. subtype:");
      localStringBuilder.append(str);
      localStringBuilder.append(" command:");
      localStringBuilder.append(paramIntent);
    }
    if ("RST".equals(paramIntent)) {
      ((InstanceID)localObject).zzm();
    }
    for (;;)
    {
      onTokenRefresh();
      return;
      if (!"RST_FULL".equals(paramIntent)) {
        break;
      }
      if (InstanceID.zzn().isEmpty()) {
        return;
      }
      InstanceID.zzn().zzx();
    }
    if ("SYNC".equals(paramIntent))
    {
      InstanceID.zzn().zzi(String.valueOf(str).concat("|T|"));
      onTokenRefresh();
    }
  }
  
  public void onTokenRefresh() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/InstanceIDListenerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */