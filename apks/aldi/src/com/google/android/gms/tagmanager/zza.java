package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zza
{
  private static Object zzaxa = new Object();
  private static zza zzaxb;
  private final Clock clock;
  private volatile boolean closed = false;
  private volatile long zzawt = 900000L;
  private volatile long zzawu = 30000L;
  private volatile long zzawv;
  private volatile long zzaww;
  private final Thread zzawx;
  private final Object zzawy = new Object();
  private zzd zzawz = new zzb(this);
  private final Context zzqx;
  private volatile AdvertisingIdClient.Info zzuz;
  
  private zza(Context paramContext)
  {
    this(paramContext, null, DefaultClock.getInstance());
  }
  
  @VisibleForTesting
  private zza(Context paramContext, zzd paramzzd, Clock paramClock)
  {
    this.clock = paramClock;
    paramzzd = paramContext;
    if (paramContext != null) {
      paramzzd = paramContext.getApplicationContext();
    }
    this.zzqx = paramzzd;
    this.zzawv = this.clock.currentTimeMillis();
    this.zzawx = new Thread(new zzc(this));
  }
  
  public static zza zzh(Context paramContext)
  {
    if (zzaxb == null) {
      synchronized (zzaxa)
      {
        if (zzaxb == null)
        {
          paramContext = new zza(paramContext);
          zzaxb = paramContext;
          paramContext.zzawx.start();
        }
      }
    }
    return zzaxb;
  }
  
  private final void zzme()
  {
    try
    {
      try
      {
        if (!this.closed)
        {
          zzmf();
          wait(500L);
        }
      }
      finally
      {
        break label30;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      label30:
      for (;;) {}
    }
    return;
    throw ((Throwable)localObject);
  }
  
  private final void zzmf()
  {
    if (this.clock.currentTimeMillis() - this.zzawv > this.zzawu) {
      synchronized (this.zzawy)
      {
        this.zzawy.notify();
        this.zzawv = this.clock.currentTimeMillis();
        return;
      }
    }
  }
  
  private final void zzmg()
  {
    if (this.clock.currentTimeMillis() - this.zzaww > 3600000L) {
      this.zzuz = null;
    }
  }
  
  private final void zzmh()
  {
    Process.setThreadPriority(10);
    while (!this.closed)
    {
      ??? = this.zzawz.zzmi();
      if (??? != null)
      {
        this.zzuz = ((AdvertisingIdClient.Info)???);
        this.zzaww = this.clock.currentTimeMillis();
        zzdi.zzcz("Obtained fresh AdvertisingId info from GmsCore.");
      }
      label85:
      try
      {
        notifyAll();
      }
      finally {}
      try
      {
        synchronized (this.zzawy)
        {
          this.zzawy.wait(this.zzawt);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label85;
      }
      zzdi.zzcz("sleep interrupted in AdvertiserDataPoller thread; continuing");
    }
  }
  
  @VisibleForTesting
  public final void close()
  {
    this.closed = true;
    this.zzawx.interrupt();
  }
  
  public final boolean isLimitAdTrackingEnabled()
  {
    if (this.zzuz == null) {
      zzme();
    } else {
      zzmf();
    }
    zzmg();
    if (this.zzuz == null) {
      return true;
    }
    return this.zzuz.isLimitAdTrackingEnabled();
  }
  
  public final String zzmd()
  {
    if (this.zzuz == null) {
      zzme();
    } else {
      zzmf();
    }
    zzmg();
    if (this.zzuz == null) {
      return null;
    }
    return this.zzuz.getId();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */