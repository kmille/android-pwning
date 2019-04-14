package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzaz
  implements ServiceConnection
{
  private volatile zzci zzwp;
  private volatile boolean zzwq;
  
  protected zzaz(zzax paramzzax) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceConnected");
    if (paramIBinder == null) {
      try
      {
        this.zzwo.zzu("Service connected with null binder");
        localObject = null;
      }
      finally
      {
        try
        {
          notifyAll();
          return;
        }
        finally {}
        paramComponentName = finally;
        break label239;
      }
    }
    Object localObject;
    paramComponentName = null;
    IInterface localIInterface = null;
    ComponentName localComponentName = paramComponentName;
    try
    {
      str = paramIBinder.getInterfaceDescriptor();
      localComponentName = paramComponentName;
      if (!"com.google.android.gms.analytics.internal.IAnalyticsService".equals(str)) {
        break label132;
      }
      if (paramIBinder == null)
      {
        paramComponentName = localIInterface;
      }
      else
      {
        localComponentName = paramComponentName;
        localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
        localComponentName = paramComponentName;
        if ((localIInterface instanceof zzci))
        {
          localComponentName = paramComponentName;
          paramComponentName = (zzci)localIInterface;
        }
        else
        {
          localComponentName = paramComponentName;
          paramComponentName = new zzcj(paramIBinder);
        }
      }
    }
    catch (RemoteException paramComponentName)
    {
      for (;;)
      {
        String str;
      }
    }
    localComponentName = paramComponentName;
    this.zzwo.zzq("Bound to IAnalyticsService interface");
    break label162;
    label132:
    localComponentName = paramComponentName;
    this.zzwo.zze("Got binder with a wrong descriptor", str);
    paramComponentName = (ComponentName)localObject;
    break label162;
    this.zzwo.zzu("Service connect failed to get IAnalyticsService");
    paramComponentName = localComponentName;
    label162:
    if (paramComponentName == null) {}
    try
    {
      ConnectionTracker.getInstance().unbindService(this.zzwo.getContext(), zzax.zza(this.zzwo));
    }
    catch (IllegalArgumentException paramComponentName)
    {
      label239:
      for (;;) {}
    }
    if (!this.zzwq)
    {
      this.zzwo.zzt("onServiceConnected received after the timeout limit");
      this.zzwo.zzbw().zza(new zzba(this, paramComponentName));
    }
    else
    {
      this.zzwp = paramComponentName;
    }
    notifyAll();
    return;
    notifyAll();
    throw paramComponentName;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
    this.zzwo.zzbw().zza(new zzbb(this, paramComponentName));
  }
  
  public final zzci zzcw()
  {
    zzk.zzab();
    Object localObject1 = new Intent("com.google.android.gms.analytics.service.START");
    ((Intent)localObject1).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
    Context localContext = this.zzwo.getContext();
    ((Intent)localObject1).putExtra("app_package_name", localContext.getPackageName());
    ConnectionTracker localConnectionTracker = ConnectionTracker.getInstance();
    for (;;)
    {
      try
      {
        this.zzwp = null;
        this.zzwq = true;
        boolean bool = localConnectionTracker.bindService(localContext, (Intent)localObject1, zzax.zza(this.zzwo), 129);
        this.zzwo.zza("Bind to service requested", Boolean.valueOf(bool));
        if (!bool)
        {
          this.zzwq = false;
          return null;
        }
      }
      finally {}
      try
      {
        wait(((Long)zzcc.zzzu.get()).longValue());
      }
      catch (InterruptedException localInterruptedException) {}
    }
    this.zzwo.zzt("Wait for service connect was interrupted");
    this.zzwq = false;
    localObject1 = this.zzwp;
    this.zzwp = null;
    if (localObject1 == null) {
      this.zzwo.zzu("Successfully bound to service but never got onServiceConnected callback");
    }
    return (zzci)localObject1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */