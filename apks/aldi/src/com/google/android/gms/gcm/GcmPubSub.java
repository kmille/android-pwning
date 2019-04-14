package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public class GcmPubSub
{
  private static GcmPubSub zzn;
  private static final Pattern zzp = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
  private InstanceID zzo;
  
  private GcmPubSub(Context paramContext)
  {
    this.zzo = InstanceID.getInstance(paramContext);
  }
  
  @Deprecated
  public static GcmPubSub getInstance(Context paramContext)
  {
    try
    {
      if (zzn == null)
      {
        GoogleCloudMessaging.zze(paramContext);
        zzn = new GcmPubSub(paramContext);
      }
      paramContext = zzn;
      return paramContext;
    }
    finally {}
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void subscribe(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    if ((paramString1 != null) && (!paramString1.isEmpty()))
    {
      if ((paramString2 != null) && (zzp.matcher(paramString2).matches()))
      {
        Bundle localBundle = paramBundle;
        if (paramBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putString("gcm.topic", paramString2);
        this.zzo.getToken(paramString1, paramString2, localBundle);
        return;
      }
      paramString1 = String.valueOf(paramString2);
      if (paramString1.length() != 0) {
        paramString1 = "Invalid topic name: ".concat(paramString1);
      } else {
        paramString1 = new String("Invalid topic name: ");
      }
      throw new IllegalArgumentException(paramString1);
    }
    paramString1 = String.valueOf(paramString1);
    if (paramString1.length() != 0) {
      paramString1 = "Invalid appInstanceToken: ".concat(paramString1);
    } else {
      paramString1 = new String("Invalid appInstanceToken: ");
    }
    throw new IllegalArgumentException(paramString1);
  }
  
  @Deprecated
  @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
  public void unsubscribe(String paramString1, String paramString2)
    throws IOException
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("gcm.topic", paramString2);
    this.zzo.zzd(paramString1, paramString2, localBundle);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/GcmPubSub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */