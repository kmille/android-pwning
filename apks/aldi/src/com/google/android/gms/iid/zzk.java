package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class zzk
  implements ServiceConnection
{
  private final Intent zzbl;
  private final ScheduledExecutorService zzbm;
  private final Queue<zzg> zzbn = new ArrayDeque();
  private zzi zzbo;
  private boolean zzbp = false;
  private final Context zzk;
  
  public zzk(Context paramContext, String paramString)
  {
    this(paramContext, paramString, new ScheduledThreadPoolExecutor(0));
  }
  
  @VisibleForTesting
  private zzk(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.zzk = paramContext.getApplicationContext();
    this.zzbl = new Intent(paramString).setPackage(this.zzk.getPackageName());
    this.zzbm = paramScheduledExecutorService;
  }
  
  private final void zzl()
  {
    try
    {
      Log.isLoggable("EnhancedIntentService", 3);
      while (!this.zzbn.isEmpty())
      {
        Log.isLoggable("EnhancedIntentService", 3);
        Object localObject1;
        if ((this.zzbo != null) && (this.zzbo.isBinderAlive()))
        {
          Log.isLoggable("EnhancedIntentService", 3);
          localObject1 = (zzg)this.zzbn.poll();
          this.zzbo.zzd((zzg)localObject1);
        }
        else
        {
          boolean bool;
          if (Log.isLoggable("EnhancedIntentService", 3))
          {
            bool = this.zzbp;
            localObject1 = new StringBuilder(39);
            ((StringBuilder)localObject1).append("binder is dead. start connection? ");
            ((StringBuilder)localObject1).append(bool ^ true);
          }
          if (!this.zzbp)
          {
            this.zzbp = true;
            try
            {
              bool = ConnectionTracker.getInstance().bindService(this.zzk, this.zzbl, this, 65);
              if (bool) {
                return;
              }
              Log.e("EnhancedIntentService", "binding to the service failed");
            }
            catch (SecurityException localSecurityException)
            {
              Log.e("EnhancedIntentService", "Exception while binding the service", localSecurityException);
            }
            while (!this.zzbn.isEmpty()) {
              ((zzg)this.zzbn.poll()).finish();
            }
          }
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.zzbp = false;
      this.zzbo = ((zzi)paramIBinder);
      if (Log.isLoggable("EnhancedIntentService", 3))
      {
        paramComponentName = String.valueOf(paramComponentName);
        paramIBinder = new StringBuilder(String.valueOf(paramComponentName).length() + 20);
        paramIBinder.append("onServiceConnected: ");
        paramIBinder.append(paramComponentName);
      }
      zzl();
      return;
    }
    finally {}
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("EnhancedIntentService", 3))
    {
      paramComponentName = String.valueOf(paramComponentName);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramComponentName).length() + 23);
      localStringBuilder.append("onServiceDisconnected: ");
      localStringBuilder.append(paramComponentName);
    }
    zzl();
  }
  
  public final void zzd(Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    try
    {
      Log.isLoggable("EnhancedIntentService", 3);
      this.zzbn.add(new zzg(paramIntent, paramPendingResult, this.zzbm));
      zzl();
      return;
    }
    finally
    {
      paramIntent = finally;
      throw paramIntent;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */