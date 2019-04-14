package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

final class zzt
  implements ServiceConnection
{
  @GuardedBy("this")
  int state = 0;
  final Messenger zzcc = new Messenger(new Handler(Looper.getMainLooper(), new zzu(this)));
  zzy zzcd;
  @GuardedBy("this")
  final Queue<zzz<?>> zzce = new ArrayDeque();
  @GuardedBy("this")
  final SparseArray<zzz<?>> zzcf = new SparseArray();
  
  private zzt(zzr paramzzr) {}
  
  private final void zzr()
  {
    zzr.zze(this.zzcg).execute(new zzw(this));
  }
  
  /* Error */
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 91
    //   4: iconst_2
    //   5: invokestatic 97	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   8: pop
    //   9: aload_2
    //   10: ifnonnull +13 -> 23
    //   13: aload_0
    //   14: iconst_0
    //   15: ldc 99
    //   17: invokevirtual 103	com/google/android/gms/iid/zzt:zzd	(ILjava/lang/String;)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: new 105	com/google/android/gms/iid/zzy
    //   27: dup
    //   28: aload_2
    //   29: invokespecial 108	com/google/android/gms/iid/zzy:<init>	(Landroid/os/IBinder;)V
    //   32: putfield 110	com/google/android/gms/iid/zzt:zzcd	Lcom/google/android/gms/iid/zzy;
    //   35: aload_0
    //   36: iconst_2
    //   37: putfield 32	com/google/android/gms/iid/zzt:state	I
    //   40: aload_0
    //   41: invokespecial 112	com/google/android/gms/iid/zzt:zzr	()V
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: astore_1
    //   48: aload_0
    //   49: iconst_0
    //   50: aload_1
    //   51: invokevirtual 116	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   54: invokevirtual 103	com/google/android/gms/iid/zzt:zzd	(ILjava/lang/String;)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	zzt
    //   0	65	1	paramComponentName	ComponentName
    //   0	65	2	paramIBinder	android.os.IBinder
    // Exception table:
    //   from	to	target	type
    //   23	35	47	android/os/RemoteException
    //   2	9	60	finally
    //   13	20	60	finally
    //   23	35	60	finally
    //   35	44	60	finally
    //   48	57	60	finally
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    try
    {
      Log.isLoggable("MessengerIpcClient", 2);
      zzd(2, "Service disconnected");
      return;
    }
    finally
    {
      paramComponentName = finally;
      throw paramComponentName;
    }
  }
  
  final void zzd(int paramInt, String paramString)
  {
    for (;;)
    {
      try
      {
        Object localObject;
        if (Log.isLoggable("MessengerIpcClient", 3))
        {
          localObject = String.valueOf(paramString);
          if (((String)localObject).length() != 0) {
            "Disconnected: ".concat((String)localObject);
          } else {
            new String("Disconnected: ");
          }
        }
        switch (this.state)
        {
        case 4: 
          continue;
          return;
        case 3: 
          this.state = 4;
          return;
        case 1: 
        case 2: 
          Log.isLoggable("MessengerIpcClient", 2);
          this.state = 4;
          ConnectionTracker.getInstance().unbindService(zzr.zzd(this.zzcg), this);
          paramString = new zzaa(paramInt, paramString);
          localObject = this.zzce.iterator();
          if (((Iterator)localObject).hasNext())
          {
            ((zzz)((Iterator)localObject).next()).zzd(paramString);
          }
          else
          {
            this.zzce.clear();
            paramInt = 0;
            if (paramInt < this.zzcf.size())
            {
              ((zzz)this.zzcf.valueAt(paramInt)).zzd(paramString);
              paramInt += 1;
            }
            else
            {
              this.zzcf.clear();
              return;
            }
          }
          break;
        case 0: 
          throw new IllegalStateException();
          paramInt = this.state;
          paramString = new StringBuilder(26);
          paramString.append("Unknown state: ");
          paramString.append(paramInt);
          throw new IllegalStateException(paramString.toString());
        }
      }
      finally {}
    }
  }
  
  final boolean zzd(Message paramMessage)
  {
    int i = paramMessage.arg1;
    Object localObject;
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      localObject = new StringBuilder(41);
      ((StringBuilder)localObject).append("Received response to request: ");
      ((StringBuilder)localObject).append(i);
    }
    try
    {
      localObject = (zzz)this.zzcf.get(i);
      if (localObject == null)
      {
        paramMessage = new StringBuilder(50);
        paramMessage.append("Received response for unknown request: ");
        paramMessage.append(i);
        return true;
      }
      this.zzcf.remove(i);
      zzs();
      paramMessage = paramMessage.getData();
      if (paramMessage.getBoolean("unsupported", false))
      {
        ((zzz)localObject).zzd(new zzaa(4, "Not supported by GmsCore"));
        return true;
      }
      ((zzz)localObject).zzh(paramMessage);
      return true;
    }
    finally {}
  }
  
  final boolean zze(zzz paramzzz)
  {
    for (;;)
    {
      try
      {
        switch (this.state)
        {
        case 3: 
          break;
        case 4: 
          return false;
        case 2: 
          this.zzce.add(paramzzz);
          zzr();
          return true;
        case 1: 
          this.zzce.add(paramzzz);
          return true;
        case 0: 
          this.zzce.add(paramzzz);
          if (this.state != 0) {
            break label248;
          }
          bool = true;
          Preconditions.checkState(bool);
          Log.isLoggable("MessengerIpcClient", 2);
          this.state = 1;
          paramzzz = new Intent("com.google.android.c2dm.intent.REGISTER");
          paramzzz.setPackage("com.google.android.gms");
          if (!ConnectionTracker.getInstance().bindService(zzr.zzd(this.zzcg), paramzzz, this, 1)) {
            zzd(0, "Unable to bind to service");
          } else {
            zzr.zze(this.zzcg).schedule(new zzv(this), 30L, TimeUnit.SECONDS);
          }
          return true;
          int i = this.state;
          paramzzz = new StringBuilder(26);
          paramzzz.append("Unknown state: ");
          paramzzz.append(i);
          throw new IllegalStateException(paramzzz.toString());
        }
      }
      finally {}
      continue;
      label248:
      boolean bool = false;
    }
  }
  
  final void zzg(int paramInt)
  {
    try
    {
      zzz localzzz = (zzz)this.zzcf.get(paramInt);
      if (localzzz != null)
      {
        StringBuilder localStringBuilder = new StringBuilder(31);
        localStringBuilder.append("Timing out request: ");
        localStringBuilder.append(paramInt);
        this.zzcf.remove(paramInt);
        localzzz.zzd(new zzaa(3, "Timed out waiting for response"));
        zzs();
      }
      return;
    }
    finally {}
  }
  
  final void zzs()
  {
    try
    {
      if ((this.state == 2) && (this.zzce.isEmpty()) && (this.zzcf.size() == 0))
      {
        Log.isLoggable("MessengerIpcClient", 2);
        this.state = 3;
        ConnectionTracker.getInstance().unbindService(zzr.zzd(this.zzcg), this);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void zzt()
  {
    try
    {
      if (this.state == 1) {
        zzd(1, "Timed out while binding");
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */