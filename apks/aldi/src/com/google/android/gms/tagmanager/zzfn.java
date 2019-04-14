package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzfn
  extends zzfm
{
  private static final Object zzbdu = new Object();
  private static zzfn zzbef;
  private boolean connected = true;
  private zzcc zzbbo = new zzfo(this);
  private Context zzbdv;
  private zzcb zzbdw;
  private volatile zzby zzbdx;
  private int zzbdy = 1800000;
  private boolean zzbdz = true;
  private boolean zzbea = false;
  private boolean zzbeb = true;
  private zzfq zzbec;
  private zzdn zzbed;
  private boolean zzbee = false;
  
  private final boolean isPowerSaveMode()
  {
    return (this.zzbee) || (!this.connected) || (this.zzbdy <= 0);
  }
  
  public static zzfn zzpc()
  {
    if (zzbef == null) {
      zzbef = new zzfn();
    }
    return zzbef;
  }
  
  public final void dispatch()
  {
    try
    {
      if (!this.zzbea)
      {
        zzdi.v("Dispatch call queued. Dispatch will run once initialization is complete.");
        this.zzbdz = true;
        return;
      }
      this.zzbdx.zzh(new zzfp(this));
      return;
    }
    finally {}
  }
  
  final void zza(Context paramContext, zzby paramzzby)
  {
    try
    {
      Context localContext = this.zzbdv;
      if (localContext != null) {
        return;
      }
      this.zzbdv = paramContext.getApplicationContext();
      if (this.zzbdx == null) {
        this.zzbdx = paramzzby;
      }
      return;
    }
    finally {}
  }
  
  @VisibleForTesting
  final void zza(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      boolean bool = isPowerSaveMode();
      this.zzbee = paramBoolean1;
      this.connected = paramBoolean2;
      paramBoolean1 = isPowerSaveMode();
      if (paramBoolean1 == bool) {
        return;
      }
      if (isPowerSaveMode())
      {
        this.zzbec.cancel();
        zzdi.v("PowerSaveMode initiated.");
        return;
      }
      this.zzbec.zzh(this.zzbdy);
      zzdi.v("PowerSaveMode terminated.");
      return;
    }
    finally {}
  }
  
  public final void zzp(boolean paramBoolean)
  {
    try
    {
      zza(this.zzbee, paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzpb()
  {
    try
    {
      if (!isPowerSaveMode()) {
        this.zzbec.zzpf();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final zzcb zzpd()
  {
    try
    {
      if (this.zzbdw == null) {
        if (this.zzbdv != null) {
          this.zzbdw = new zzeb(this.zzbbo, this.zzbdv);
        } else {
          throw new IllegalStateException("Cant get a store unless we have a context");
        }
      }
      if (this.zzbec == null)
      {
        this.zzbec = new zzfr(this, null);
        if (this.zzbdy > 0) {
          this.zzbec.zzh(this.zzbdy);
        }
      }
      this.zzbea = true;
      if (this.zzbdz)
      {
        dispatch();
        this.zzbdz = false;
      }
      if ((this.zzbed == null) && (this.zzbeb))
      {
        this.zzbed = new zzdn(this);
        localObject1 = this.zzbed;
        Context localContext = this.zzbdv;
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        localContext.registerReceiver((BroadcastReceiver)localObject1, localIntentFilter);
        localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("com.google.analytics.RADIO_POWERED");
        localIntentFilter.addCategory(localContext.getPackageName());
        localContext.registerReceiver((BroadcastReceiver)localObject1, localIntentFilter);
      }
      Object localObject1 = this.zzbdw;
      return (zzcb)localObject1;
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */