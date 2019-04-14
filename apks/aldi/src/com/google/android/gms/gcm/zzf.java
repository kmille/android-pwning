package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

final class zzf
  extends Handler
{
  zzf(GoogleCloudMessaging paramGoogleCloudMessaging, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage != null) {
      Object localObject = paramMessage.obj;
    }
    paramMessage = (Intent)paramMessage.obj;
    if ("com.google.android.c2dm.intent.REGISTRATION".equals(paramMessage.getAction()))
    {
      GoogleCloudMessaging.zzd(this.zzai).add(paramMessage);
      return;
    }
    if (!GoogleCloudMessaging.zzd(this.zzai, paramMessage))
    {
      paramMessage.setPackage(GoogleCloudMessaging.zze(this.zzai).getPackageName());
      GoogleCloudMessaging.zze(this.zzai).sendBroadcast(paramMessage);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/gcm/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */