package com.google.android.gms.gcm;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class zzd
{
  static zzd zzj;
  private final Context zzk;
  private String zzl;
  private final AtomicInteger zzm = new AtomicInteger((int)SystemClock.elapsedRealtime());
  
  private zzd(Context paramContext)
  {
    this.zzk = paramContext.getApplicationContext();
  }
  
  static zzd zzd(Context paramContext)
  {
    try
    {
      if (zzj == null) {
        zzj = new zzd(paramContext);
      }
      paramContext = zzj;
      return paramContext;
    }
    finally {}
  }
  
  static String zzd(Bundle paramBundle, String paramString)
  {
    String str2 = paramBundle.getString(paramString);
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString(paramString.replace("gcm.n.", "gcm.notification."));
    }
    return str1;
  }
  
  private final Bundle zze()
  {
    try
    {
      localApplicationInfo = this.zzk.getPackageManager().getApplicationInfo(this.zzk.getPackageName(), 128);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      ApplicationInfo localApplicationInfo;
      for (;;) {}
    }
    localApplicationInfo = null;
    if ((localApplicationInfo != null) && (localApplicationInfo.metaData != null)) {
      return localApplicationInfo.metaData;
    }
    return Bundle.EMPTY;
  }
  
  private final String zze(Bundle paramBundle, String paramString)
  {
    String str1 = zzd(paramBundle, paramString);
    if (!TextUtils.isEmpty(str1)) {
      return str1;
    }
    str1 = String.valueOf(paramString);
    String str2 = String.valueOf("_loc_key");
    if (str2.length() != 0) {
      str1 = str1.concat(str2);
    } else {
      str1 = new String(str1);
    }
    str2 = zzd(paramBundle, str1);
    if (TextUtils.isEmpty(str2)) {
      return null;
    }
    Resources localResources = this.zzk.getResources();
    int j = localResources.getIdentifier(str2, "string", this.zzk.getPackageName());
    if (j == 0)
    {
      paramBundle = String.valueOf(paramString);
      paramString = String.valueOf("_loc_key");
      if (paramString.length() != 0) {
        paramBundle = paramBundle.concat(paramString);
      } else {
        paramBundle = new String(paramBundle);
      }
      paramBundle = paramBundle.substring(6);
      paramString = new StringBuilder(String.valueOf(paramBundle).length() + 49 + String.valueOf(str2).length());
      paramString.append(paramBundle);
      paramString.append(" resource not found: ");
      paramString.append(str2);
      paramString.append(" Default value will be used.");
      return null;
    }
    str1 = String.valueOf(paramString);
    Object localObject = String.valueOf("_loc_args");
    if (((String)localObject).length() != 0) {
      str1 = str1.concat((String)localObject);
    } else {
      str1 = new String(str1);
    }
    str1 = zzd(paramBundle, str1);
    if (TextUtils.isEmpty(str1)) {
      return localResources.getString(j);
    }
    try
    {
      paramBundle = new JSONArray(str1);
      localObject = new String[paramBundle.length()];
      int i = 0;
      while (i < localObject.length)
      {
        localObject[i] = paramBundle.opt(i);
        i += 1;
      }
      paramBundle = localResources.getString(j, (Object[])localObject);
      return paramBundle;
    }
    catch (JSONException paramBundle)
    {
      for (;;) {}
    }
    catch (MissingFormatArgumentException paramBundle)
    {
      for (;;) {}
    }
    paramBundle = new StringBuilder(String.valueOf(str2).length() + 58 + String.valueOf(str1).length());
    paramBundle.append("Missing format argument for ");
    paramBundle.append(str2);
    paramBundle.append(": ");
    paramBundle.append(str1);
    for (paramString = " Default value will be used.";; paramString = "  Default value will be used.")
    {
      paramBundle.append(paramString);
      return null;
      paramBundle = String.valueOf(paramString);
      paramString = String.valueOf("_loc_args");
      if (paramString.length() != 0) {
        paramBundle = paramBundle.concat(paramString);
      } else {
        paramBundle = new String(paramBundle);
      }
      paramString = paramBundle.substring(6);
      paramBundle = new StringBuilder(String.valueOf(paramString).length() + 41 + String.valueOf(str1).length());
      paramBundle.append("Malformed ");
      paramBundle.append(paramString);
      paramBundle.append(": ");
      paramBundle.append(str1);
    }
  }
  
  final boolean zze(Bundle paramBundle)
  {
    Object localObject1 = zze(paramBundle, "gcm.n.title");
    Object localObject3 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      localObject3 = this.zzk.getApplicationInfo().loadLabel(this.zzk.getPackageManager());
    }
    String str1 = zze(paramBundle, "gcm.n.body");
    localObject1 = zzd(paramBundle, "gcm.n.icon");
    int i;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject2 = this.zzk.getResources();
      i = ((Resources)localObject2).getIdentifier((String)localObject1, "drawable", this.zzk.getPackageName());
      if (i == 0)
      {
        i = ((Resources)localObject2).getIdentifier((String)localObject1, "mipmap", this.zzk.getPackageName());
        if (i == 0)
        {
          localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 57);
          ((StringBuilder)localObject2).append("Icon resource ");
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(" not found. Notification will use app icon.");
        }
      }
    }
    else
    {
      i = this.zzk.getApplicationInfo().icon;
      if (i == 0) {
        i = 17301651;
      }
    }
    String str2 = zzd(paramBundle, "gcm.n.color");
    localObject1 = zzd(paramBundle, "gcm.n.sound2");
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject5 = null;
    if (bool)
    {
      localObject1 = null;
    }
    else if ((!"default".equals(localObject1)) && (this.zzk.getResources().getIdentifier((String)localObject1, "raw", this.zzk.getPackageName()) != 0))
    {
      localObject2 = this.zzk.getPackageName();
      localObject4 = new StringBuilder(String.valueOf(localObject2).length() + 24 + String.valueOf(localObject1).length());
      ((StringBuilder)localObject4).append("android.resource://");
      ((StringBuilder)localObject4).append((String)localObject2);
      ((StringBuilder)localObject4).append("/raw/");
      ((StringBuilder)localObject4).append((String)localObject1);
      localObject1 = Uri.parse(((StringBuilder)localObject4).toString());
    }
    else
    {
      localObject1 = RingtoneManager.getDefaultUri(2);
    }
    Object localObject2 = zzd(paramBundle, "gcm.n.click_action");
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject2 = new Intent((String)localObject2);
      ((Intent)localObject2).setPackage(this.zzk.getPackageName());
      ((Intent)localObject2).setFlags(268435456);
    }
    else
    {
      localObject4 = this.zzk.getPackageManager().getLaunchIntentForPackage(this.zzk.getPackageName());
      localObject2 = localObject4;
      if (localObject4 == null)
      {
        localObject4 = null;
        break label538;
      }
    }
    Object localObject4 = new Bundle(paramBundle);
    GcmListenerService.zzd((Bundle)localObject4);
    ((Intent)localObject2).putExtras((Bundle)localObject4);
    localObject4 = ((Bundle)localObject4).keySet().iterator();
    Object localObject6;
    while (((Iterator)localObject4).hasNext())
    {
      localObject6 = (String)((Iterator)localObject4).next();
      if ((((String)localObject6).startsWith("gcm.n.")) || (((String)localObject6).startsWith("gcm.notification."))) {
        ((Intent)localObject2).removeExtra((String)localObject6);
      }
    }
    localObject4 = PendingIntent.getActivity(this.zzk, this.zzm.getAndIncrement(), (Intent)localObject2, 1073741824);
    label538:
    if ((PlatformVersion.isAtLeastO()) && (this.zzk.getApplicationInfo().targetSdkVersion >= 26))
    {
      localObject2 = zzd(paramBundle, "gcm.n.android_channel_id");
      if (!PlatformVersion.isAtLeastO())
      {
        localObject2 = localObject5;
      }
      else
      {
        localObject5 = (NotificationManager)this.zzk.getSystemService(NotificationManager.class);
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          if (((NotificationManager)localObject5).getNotificationChannel((String)localObject2) == null)
          {
            localObject6 = new StringBuilder(String.valueOf(localObject2).length() + 122);
            ((StringBuilder)localObject6).append("Notification Channel requested (");
            ((StringBuilder)localObject6).append((String)localObject2);
            ((StringBuilder)localObject6).append(") has not been created by the app. Manifest configuration, or default, value will be used.");
          }
        }
        else
        {
          if (this.zzl != null) {}
          for (;;)
          {
            localObject2 = this.zzl;
            break;
            this.zzl = zze().getString("com.google.android.gms.gcm.default_notification_channel_id");
            if ((TextUtils.isEmpty(this.zzl)) || (((NotificationManager)localObject5).getNotificationChannel(this.zzl) == null))
            {
              if (((NotificationManager)localObject5).getNotificationChannel("fcm_fallback_notification_channel") == null) {
                ((NotificationManager)localObject5).createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.zzk.getString(R.string.gcm_fallback_notification_channel_label), 3));
              }
              this.zzl = "fcm_fallback_notification_channel";
            }
          }
        }
      }
      localObject5 = new Notification.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        ((Notification.Builder)localObject5).setContentTitle((CharSequence)localObject3);
      }
      if (!TextUtils.isEmpty(str1))
      {
        ((Notification.Builder)localObject5).setContentText(str1);
        ((Notification.Builder)localObject5).setStyle(new Notification.BigTextStyle().bigText(str1));
      }
      if (!TextUtils.isEmpty(str2)) {
        ((Notification.Builder)localObject5).setColor(Color.parseColor(str2));
      }
      if (localObject1 != null) {
        ((Notification.Builder)localObject5).setSound((Uri)localObject1);
      }
      if (localObject4 != null) {
        ((Notification.Builder)localObject5).setContentIntent((PendingIntent)localObject4);
      }
      if (localObject2 != null) {
        ((Notification.Builder)localObject5).setChannelId((String)localObject2);
      }
      localObject1 = ((Notification.Builder)localObject5).build();
    }
    else
    {
      localObject2 = new NotificationCompat.Builder(this.zzk).setAutoCancel(true).setSmallIcon(i);
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        ((NotificationCompat.Builder)localObject2).setContentTitle((CharSequence)localObject3);
      }
      if (!TextUtils.isEmpty(str1)) {
        ((NotificationCompat.Builder)localObject2).setContentText(str1);
      }
      if (!TextUtils.isEmpty(str2)) {
        ((NotificationCompat.Builder)localObject2).setColor(Color.parseColor(str2));
      }
      if (localObject1 != null) {
        ((NotificationCompat.Builder)localObject2).setSound((Uri)localObject1);
      }
      if (localObject4 != null) {
        ((NotificationCompat.Builder)localObject2).setContentIntent((PendingIntent)localObject4);
      }
      localObject1 = ((NotificationCompat.Builder)localObject2).build();
    }
    localObject2 = zzd(paramBundle, "gcm.n.tag");
    Log.isLoggable("GcmNotification", 3);
    localObject3 = (NotificationManager)this.zzk.getSystemService("notification");
    paramBundle = (Bundle)localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      long l = SystemClock.uptimeMillis();
      paramBundle = new StringBuilder(37);
      paramBundle.append("GCM-Notification:");
      paramBundle.append(l);
      paramBundle = paramBundle.toString();
    }
    ((NotificationManager)localObject3).notify(paramBundle, 0, (Notification)localObject1);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */