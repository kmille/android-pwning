package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

@SuppressLint({"StaticFieldLeak"})
public class zzat
{
  private static volatile zzat zzvp;
  private final Clock clock;
  private final Context zzqx;
  private final Context zzvq;
  private final zzbu zzvr;
  private final zzcm zzvs;
  private final zzk zzvt;
  private final zzai zzvu;
  private final zzbz zzvv;
  private final zzde zzvw;
  private final zzcq zzvx;
  private final GoogleAnalytics zzvy;
  private final zzbl zzvz;
  private final zzah zzwa;
  private final zzbe zzwb;
  private final zzby zzwc;
  
  private zzat(zzav paramzzav)
  {
    Object localObject1 = paramzzav.getApplicationContext();
    Preconditions.checkNotNull(localObject1, "Application context can't be null");
    Object localObject2 = paramzzav.zzci();
    Preconditions.checkNotNull(localObject2);
    this.zzqx = ((Context)localObject1);
    this.zzvq = ((Context)localObject2);
    this.clock = DefaultClock.getInstance();
    this.zzvr = new zzbu(this);
    localObject2 = new zzcm(this);
    ((zzar)localObject2).zzm();
    this.zzvs = ((zzcm)localObject2);
    localObject2 = zzbu();
    Object localObject3 = zzas.VERSION;
    Object localObject4 = new StringBuilder(String.valueOf(localObject3).length() + 134);
    ((StringBuilder)localObject4).append("Google Analytics ");
    ((StringBuilder)localObject4).append((String)localObject3);
    ((StringBuilder)localObject4).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    ((zzaq)localObject2).zzs(((StringBuilder)localObject4).toString());
    localObject2 = new zzcq(this);
    ((zzar)localObject2).zzm();
    this.zzvx = ((zzcq)localObject2);
    localObject2 = new zzde(this);
    ((zzar)localObject2).zzm();
    this.zzvw = ((zzde)localObject2);
    paramzzav = new zzai(this, paramzzav);
    localObject2 = new zzbl(this);
    localObject3 = new zzah(this);
    localObject4 = new zzbe(this);
    zzby localzzby = new zzby(this);
    localObject1 = zzk.zzb((Context)localObject1);
    ((zzk)localObject1).zza(new zzau(this));
    this.zzvt = ((zzk)localObject1);
    localObject1 = new GoogleAnalytics(this);
    ((zzar)localObject2).zzm();
    this.zzvz = ((zzbl)localObject2);
    ((zzar)localObject3).zzm();
    this.zzwa = ((zzah)localObject3);
    ((zzar)localObject4).zzm();
    this.zzwb = ((zzbe)localObject4);
    localzzby.zzm();
    this.zzwc = localzzby;
    localObject2 = new zzbz(this);
    ((zzar)localObject2).zzm();
    this.zzvv = ((zzbz)localObject2);
    paramzzav.zzm();
    this.zzvu = paramzzav;
    ((GoogleAnalytics)localObject1).zzm();
    this.zzvy = ((GoogleAnalytics)localObject1);
    paramzzav.start();
  }
  
  private static void zza(zzar paramzzar)
  {
    Preconditions.checkNotNull(paramzzar, "Analytics service not created/initialized");
    Preconditions.checkArgument(paramzzar.isInitialized(), "Analytics service not initialized");
  }
  
  public static zzat zzc(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    if (zzvp == null) {
      try
      {
        if (zzvp == null)
        {
          Clock localClock = DefaultClock.getInstance();
          long l1 = localClock.elapsedRealtime();
          paramContext = new zzat(new zzav(paramContext));
          zzvp = paramContext;
          GoogleAnalytics.zzn();
          l1 = localClock.elapsedRealtime() - l1;
          long l2 = ((Long)zzcc.zzzz.get()).longValue();
          if (l1 > l2) {
            paramContext.zzbu().zzc("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
          }
        }
      }
      finally {}
    }
    return zzvp;
  }
  
  public final Context getContext()
  {
    return this.zzqx;
  }
  
  public final Clock zzbt()
  {
    return this.clock;
  }
  
  public final zzcm zzbu()
  {
    zza(this.zzvs);
    return this.zzvs;
  }
  
  public final zzbu zzbv()
  {
    return this.zzvr;
  }
  
  public final zzk zzbw()
  {
    Preconditions.checkNotNull(this.zzvt);
    return this.zzvt;
  }
  
  public final zzai zzby()
  {
    zza(this.zzvu);
    return this.zzvu;
  }
  
  public final zzbz zzbz()
  {
    zza(this.zzvv);
    return this.zzvv;
  }
  
  public final zzde zzca()
  {
    zza(this.zzvw);
    return this.zzvw;
  }
  
  public final zzcq zzcb()
  {
    zza(this.zzvx);
    return this.zzvx;
  }
  
  public final zzbe zzce()
  {
    zza(this.zzwb);
    return this.zzwb;
  }
  
  public final zzby zzcf()
  {
    return this.zzwc;
  }
  
  public final Context zzci()
  {
    return this.zzvq;
  }
  
  public final zzcm zzcj()
  {
    return this.zzvs;
  }
  
  public final GoogleAnalytics zzck()
  {
    Preconditions.checkNotNull(this.zzvy);
    Preconditions.checkArgument(this.zzvy.isInitialized(), "Analytics instance not initialized");
    return this.zzvy;
  }
  
  public final zzcq zzcl()
  {
    if ((this.zzvx != null) && (this.zzvx.isInitialized())) {
      return this.zzvx;
    }
    return null;
  }
  
  public final zzah zzcm()
  {
    zza(this.zzwa);
    return this.zzwa;
  }
  
  public final zzbl zzcn()
  {
    zza(this.zzvz);
    return this.zzvz;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */