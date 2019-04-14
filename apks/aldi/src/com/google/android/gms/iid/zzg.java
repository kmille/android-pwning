package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzg
{
  final Intent intent;
  private final BroadcastReceiver.PendingResult zzbe;
  private boolean zzbf = false;
  private final ScheduledFuture<?> zzbg;
  
  zzg(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.intent = paramIntent;
    this.zzbe = paramPendingResult;
    this.zzbg = paramScheduledExecutorService.schedule(new zzh(this, paramIntent), 9500L, TimeUnit.MILLISECONDS);
  }
  
  final void finish()
  {
    try
    {
      if (!this.zzbf)
      {
        this.zzbe.finish();
        this.zzbg.cancel(false);
        this.zzbf = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */