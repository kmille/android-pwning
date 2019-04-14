package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.stats.GCoreWakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zze
  extends Service
{
  private final Object lock = new Object();
  @VisibleForTesting
  final ExecutorService zzax = Executors.newSingleThreadExecutor();
  private Binder zzay;
  private int zzaz;
  private int zzba = 0;
  
  private final void zzf(Intent arg1)
  {
    if (??? != null) {
      GCoreWakefulBroadcastReceiver.completeWakefulIntent(???);
    }
    synchronized (this.lock)
    {
      this.zzba -= 1;
      if (this.zzba == 0) {
        stopSelfResult(this.zzaz);
      }
      return;
    }
  }
  
  public abstract void handleIntent(Intent paramIntent);
  
  public final IBinder onBind(Intent paramIntent)
  {
    try
    {
      Log.isLoggable("EnhancedIntentService", 3);
      if (this.zzay == null) {
        this.zzay = new zzi(this);
      }
      paramIntent = this.zzay;
      return paramIntent;
    }
    finally {}
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (this.lock)
    {
      this.zzaz = paramInt2;
      this.zzba += 1;
      if (paramIntent == null)
      {
        zzf(paramIntent);
        return 2;
      }
      this.zzax.execute(new zzf(this, paramIntent, paramIntent));
      return 3;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */