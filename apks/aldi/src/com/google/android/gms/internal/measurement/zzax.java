package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
public final class zzax
  extends zzar
{
  private final zzaz zzwk;
  private zzci zzwl;
  private final zzbw zzwm;
  private final zzcz zzwn;
  
  protected zzax(zzat paramzzat)
  {
    super(paramzzat);
    this.zzwn = new zzcz(paramzzat.zzbt());
    this.zzwk = new zzaz(this);
    this.zzwm = new zzay(this, paramzzat);
  }
  
  private final void onServiceDisconnected(ComponentName paramComponentName)
  {
    
    if (this.zzwl != null)
    {
      this.zzwl = null;
      zza("Disconnected from device AnalyticsService", paramComponentName);
      zzby().zzbq();
    }
  }
  
  private final void zza(zzci paramzzci)
  {
    zzk.zzab();
    this.zzwl = paramzzci;
    zzcu();
    zzby().onServiceConnected();
  }
  
  private final void zzcu()
  {
    this.zzwn.start();
    this.zzwm.zzh(((Long)zzcc.zzzt.get()).longValue());
  }
  
  private final void zzcv()
  {
    
    if (!isConnected()) {
      return;
    }
    zzq("Inactivity, disconnecting from device AnalyticsService");
    disconnect();
  }
  
  public final boolean connect()
  {
    zzk.zzab();
    zzch();
    if (this.zzwl != null) {
      return true;
    }
    zzci localzzci = this.zzwk.zzcw();
    if (localzzci != null)
    {
      this.zzwl = localzzci;
      zzcu();
      return true;
    }
    return false;
  }
  
  public final void disconnect()
  {
    zzk.zzab();
    zzch();
    try
    {
      ConnectionTracker.getInstance().unbindService(getContext(), this.zzwk);
    }
    catch (IllegalStateException|IllegalArgumentException localIllegalStateException)
    {
      for (;;) {}
    }
    if (this.zzwl != null)
    {
      this.zzwl = null;
      zzby().zzbq();
    }
  }
  
  public final boolean isConnected()
  {
    zzk.zzab();
    zzch();
    return this.zzwl != null;
  }
  
  protected final void zzac() {}
  
  public final boolean zzb(zzch paramzzch)
  {
    Preconditions.checkNotNull(paramzzch);
    zzk.zzab();
    zzch();
    zzci localzzci = this.zzwl;
    if (localzzci == null) {
      return false;
    }
    if (paramzzch.zzep()) {}
    for (String str = zzbu.zzdz();; str = zzbu.zzea()) {
      break;
    }
    List localList = Collections.emptyList();
    try
    {
      localzzci.zza(paramzzch.zzcs(), paramzzch.zzen(), str, localList);
      zzcu();
      return true;
    }
    catch (RemoteException paramzzch)
    {
      for (;;) {}
    }
    zzq("Failed to send hits to AnalyticsService");
    return false;
  }
  
  public final boolean zzct()
  {
    zzk.zzab();
    zzch();
    zzci localzzci = this.zzwl;
    if (localzzci == null) {
      return false;
    }
    try
    {
      localzzci.zzbn();
      zzcu();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    zzq("Failed to clear hits from AnalyticsService");
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */