package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.iid.zze;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
public class GcmListenerService
  extends zze
{
  static void zzd(Bundle paramBundle)
  {
    paramBundle = paramBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      String str = (String)paramBundle.next();
      if ((str != null) && (str.startsWith("google.c."))) {
        paramBundle.remove();
      }
    }
  }
  
  public void handleIntent(Intent paramIntent)
  {
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
    {
      paramIntent = String.valueOf(paramIntent.getAction());
      if (paramIntent.length() != 0)
      {
        "Unknown intent action: ".concat(paramIntent);
        return;
      }
      new String("Unknown intent action: ");
      return;
    }
    Object localObject2 = paramIntent.getStringExtra("message_type");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "gcm";
    }
    int i = -1;
    int k = ((String)localObject1).hashCode();
    int j = 0;
    if (k != -2062414158)
    {
      if (k != 102161)
      {
        if (k != 814694033)
        {
          if ((k == 814800675) && (((String)localObject1).equals("send_event"))) {
            i = 2;
          }
        }
        else if (((String)localObject1).equals("send_error")) {
          i = 3;
        }
      }
      else if (((String)localObject1).equals("gcm")) {
        i = 0;
      }
    }
    else if (((String)localObject1).equals("deleted_messages")) {
      i = 1;
    }
    switch (i)
    {
    default: 
      paramIntent = String.valueOf(localObject1);
      if (paramIntent.length() != 0)
      {
        "Received message with unknown type: ".concat(paramIntent);
        return;
      }
      break;
    case 3: 
      localObject2 = paramIntent.getStringExtra("google.message_id");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = paramIntent.getStringExtra("message_id");
      }
      onSendError((String)localObject1, paramIntent.getStringExtra("error"));
      return;
    case 2: 
      onMessageSent(paramIntent.getStringExtra("google.message_id"));
      return;
    case 1: 
      onDeletedMessages();
      return;
    case 0: 
      localObject2 = paramIntent.getExtras();
      ((Bundle)localObject2).remove("message_type");
      ((Bundle)localObject2).remove("android.support.content.wakelockid");
      if ((!"1".equals(zzd.zzd((Bundle)localObject2, "gcm.n.e"))) && (zzd.zzd((Bundle)localObject2, "gcm.n.icon") == null)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        i = j;
        if (!((KeyguardManager)getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
          k = Process.myPid();
          paramIntent = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses();
          i = j;
          if (paramIntent != null)
          {
            paramIntent = paramIntent.iterator();
            do
            {
              i = j;
              if (!paramIntent.hasNext()) {
                break;
              }
              localObject1 = (ActivityManager.RunningAppProcessInfo)paramIntent.next();
            } while (((ActivityManager.RunningAppProcessInfo)localObject1).pid != k);
            i = j;
            if (((ActivityManager.RunningAppProcessInfo)localObject1).importance == 100) {
              i = 1;
            }
          }
        }
        if (i == 0)
        {
          zzd.zzd(this).zze((Bundle)localObject2);
          return;
        }
        Bundle localBundle = new Bundle();
        Iterator localIterator = ((Bundle)localObject2).keySet().iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (String)localIterator.next();
          String str = ((Bundle)localObject2).getString((String)localObject1);
          paramIntent = (Intent)localObject1;
          if (((String)localObject1).startsWith("gcm.notification.")) {
            paramIntent = ((String)localObject1).replace("gcm.notification.", "gcm.n.");
          }
          if (paramIntent.startsWith("gcm.n."))
          {
            if (!"gcm.n.e".equals(paramIntent)) {
              localBundle.putString(paramIntent.substring(6), str);
            }
            localIterator.remove();
          }
        }
        paramIntent = localBundle.getString("sound2");
        if (paramIntent != null)
        {
          localBundle.remove("sound2");
          localBundle.putString("sound", paramIntent);
        }
        if (!localBundle.isEmpty()) {
          ((Bundle)localObject2).putBundle("notification", localBundle);
        }
      }
      paramIntent = ((Bundle)localObject2).getString("from");
      ((Bundle)localObject2).remove("from");
      zzd((Bundle)localObject2);
      onMessageReceived(paramIntent, (Bundle)localObject2);
      return;
    }
    new String("Received message with unknown type: ");
  }
  
  public void onDeletedMessages() {}
  
  public void onMessageReceived(String paramString, Bundle paramBundle) {}
  
  public void onMessageSent(String paramString) {}
  
  public void onSendError(String paramString1, String paramString2) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/GcmListenerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */