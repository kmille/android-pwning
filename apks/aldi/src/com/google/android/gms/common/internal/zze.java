package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class zze
  extends GmsClientSupervisor
  implements Handler.Callback
{
  private final Handler mHandler;
  @GuardedBy("mConnectionStatus")
  private final HashMap<GmsClientSupervisor.zza, zzf> zzdu = new HashMap();
  private final Context zzdv;
  private final ConnectionTracker zzdw;
  private final long zzdx;
  private final long zzdy;
  
  zze(Context paramContext)
  {
    this.zzdv = paramContext.getApplicationContext();
    this.mHandler = new com.google.android.gms.internal.common.zze(paramContext.getMainLooper(), this);
    this.zzdw = ConnectionTracker.getInstance();
    this.zzdx = 5000L;
    this.zzdy = 300000L;
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 1: 
      synchronized (this.zzdu)
      {
        GmsClientSupervisor.zza localzza = (GmsClientSupervisor.zza)paramMessage.obj;
        zzf localzzf = (zzf)this.zzdu.get(localzza);
        if ((localzzf != null) && (localzzf.getState() == 3))
        {
          paramMessage = String.valueOf(localzza);
          ??? = new StringBuilder(String.valueOf(paramMessage).length() + 47);
          ((StringBuilder)???).append("Timeout waiting for ServiceConnection callback ");
          ((StringBuilder)???).append(paramMessage);
          Log.wtf("GmsClientSupervisor", ((StringBuilder)???).toString(), new Exception());
          ??? = localzzf.getComponentName();
          paramMessage = (Message)???;
          if (??? == null) {
            paramMessage = localzza.getComponentName();
          }
          ??? = paramMessage;
          if (paramMessage == null) {
            ??? = new ComponentName(localzza.getPackage(), "unknown");
          }
          localzzf.onServiceDisconnected((ComponentName)???);
        }
        return true;
      }
    }
    synchronized (this.zzdu)
    {
      paramMessage = (GmsClientSupervisor.zza)paramMessage.obj;
      ??? = (zzf)this.zzdu.get(paramMessage);
      if ((??? != null) && (((zzf)???).zzr()))
      {
        if (((zzf)???).isBound()) {
          ((zzf)???).zzf("GmsClientSupervisor");
        }
        this.zzdu.remove(paramMessage);
      }
      return true;
    }
  }
  
  protected final boolean zza(GmsClientSupervisor.zza paramzza, ServiceConnection paramServiceConnection, String paramString)
  {
    Preconditions.checkNotNull(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      zzf localzzf;
      synchronized (this.zzdu)
      {
        localzzf = (zzf)this.zzdu.get(paramzza);
        if (localzzf == null)
        {
          localzzf = new zzf(this, paramzza);
          localzzf.zza(paramServiceConnection, paramString);
          localzzf.zze(paramString);
          this.zzdu.put(paramzza, localzzf);
          paramzza = localzzf;
        }
        else
        {
          this.mHandler.removeMessages(0, paramzza);
          if (localzzf.zza(paramServiceConnection)) {
            continue;
          }
          localzzf.zza(paramServiceConnection, paramString);
        }
        switch (localzzf.getState())
        {
        case 2: 
          localzzf.zze(paramString);
          paramzza = localzzf;
          break;
        case 1: 
          paramServiceConnection.onServiceConnected(localzzf.getComponentName(), localzzf.getBinder());
          paramzza = localzzf;
          boolean bool = paramzza.isBound();
          return bool;
          paramzza = String.valueOf(paramzza);
          paramServiceConnection = new StringBuilder(String.valueOf(paramzza).length() + 81);
          paramServiceConnection.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
          paramServiceConnection.append(paramzza);
          throw new IllegalStateException(paramServiceConnection.toString());
        }
      }
      paramzza = localzzf;
    }
  }
  
  protected final void zzb(GmsClientSupervisor.zza paramzza, ServiceConnection paramServiceConnection, String paramString)
  {
    Preconditions.checkNotNull(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.zzdu)
    {
      zzf localzzf = (zzf)this.zzdu.get(paramzza);
      if (localzzf != null)
      {
        if (localzzf.zza(paramServiceConnection))
        {
          localzzf.zzb(paramServiceConnection, paramString);
          if (localzzf.zzr())
          {
            paramzza = this.mHandler.obtainMessage(0, paramzza);
            this.mHandler.sendMessageDelayed(paramzza, this.zzdx);
          }
          return;
        }
        paramzza = String.valueOf(paramzza);
        paramServiceConnection = new StringBuilder(String.valueOf(paramzza).length() + 76);
        paramServiceConnection.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
        paramServiceConnection.append(paramzza);
        throw new IllegalStateException(paramServiceConnection.toString());
      }
      paramzza = String.valueOf(paramzza);
      paramServiceConnection = new StringBuilder(String.valueOf(paramzza).length() + 50);
      paramServiceConnection.append("Nonexistent connection status for service config: ");
      paramServiceConnection.append(paramzza);
      throw new IllegalStateException(paramServiceConnection.toString());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */