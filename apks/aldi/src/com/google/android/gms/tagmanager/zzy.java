package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzi;
import com.google.android.gms.internal.measurement.zzl;
import com.google.android.gms.internal.measurement.zzwc;
import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwi;

public final class zzy
  extends BasePendingResult<ContainerHolder>
{
  private final Clock clock;
  private final String zzaxm;
  private long zzaxr;
  private final Looper zzaxu;
  private final TagManager zzaya;
  private final zzaf zzayd;
  private final zzej zzaye;
  private final int zzayf;
  private final zzai zzayg;
  private zzah zzayh;
  private zzwd zzayi;
  private volatile zzv zzayj;
  private volatile boolean zzayk;
  private zzl zzayl;
  private String zzaym;
  private zzag zzayn;
  private zzac zzayo;
  private final Context zzqx;
  
  @VisibleForTesting
  private zzy(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzah paramzzah, zzag paramzzag, zzwd paramzzwd, Clock paramClock, zzej paramzzej, zzai paramzzai)
  {
    super(localLooper);
    this.zzqx = paramContext;
    this.zzaya = paramTagManager;
    paramContext = paramLooper;
    if (paramLooper == null) {
      paramContext = Looper.getMainLooper();
    }
    this.zzaxu = paramContext;
    this.zzaxm = paramString;
    this.zzayf = paramInt;
    this.zzayh = paramzzah;
    this.zzayn = paramzzag;
    this.zzayi = paramzzwd;
    this.zzayd = new zzaf(this, null);
    this.zzayl = new zzl();
    this.clock = paramClock;
    this.zzaye = paramzzej;
    this.zzayg = paramzzai;
    if (zzmv()) {
      zzcs(zzeh.zzok().zzom());
    }
  }
  
  public zzy(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzal paramzzal)
  {
    this(paramContext, paramTagManager, paramLooper, paramString, paramInt, new zzex(paramContext, paramString), new zzes(paramContext, paramString, paramzzal), new zzwd(paramContext), DefaultClock.getInstance(), new zzdg(1, 5, 900000L, 5000L, "refreshing", DefaultClock.getInstance()), new zzai(paramContext, paramString));
    this.zzayi.zzeu(paramzzal.zznd());
  }
  
  private final void zza(zzl paramzzl)
  {
    try
    {
      if (this.zzayh != null)
      {
        zzwc localzzwc = new zzwc();
        localzzwc.zzboa = this.zzaxr;
        localzzwc.zzpv = new zzi();
        localzzwc.zzbob = paramzzl;
        this.zzayh.zza(localzzwc);
      }
      return;
    }
    finally
    {
      paramzzl = finally;
      throw paramzzl;
    }
  }
  
  private final void zza(zzl paramzzl, long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      paramBoolean = this.zzayk;
      if (isReady())
      {
        zzv localzzv = this.zzayj;
        if (localzzv == null) {
          return;
        }
      }
      this.zzayl = paramzzl;
      this.zzaxr = paramLong;
      long l = this.zzayg.zzmy();
      zzam(Math.max(0L, Math.min(l, this.zzaxr + l - this.clock.currentTimeMillis())));
      paramzzl = new Container(this.zzqx, this.zzaya.getDataLayer(), this.zzaxm, paramLong, paramzzl);
      if (this.zzayj == null) {
        this.zzayj = new zzv(this.zzaya, this.zzaxu, paramzzl, this.zzayd);
      } else {
        this.zzayj.zza(paramzzl);
      }
      if ((!isReady()) && (this.zzayo.zzb(paramzzl))) {
        setResult(this.zzayj);
      }
      return;
    }
    finally
    {
      for (;;) {}
    }
    throw paramzzl;
  }
  
  private final void zzam(long paramLong)
  {
    try
    {
      if (this.zzayn == null)
      {
        zzdi.zzab("Refresh requested, but no network load scheduler.");
        return;
      }
      this.zzayn.zza(paramLong, this.zzayl.zzpw);
      return;
    }
    finally {}
  }
  
  private final boolean zzmv()
  {
    zzeh localzzeh = zzeh.zzok();
    return ((localzzeh.zzol() == zzeh.zza.zzbcc) || (localzzeh.zzol() == zzeh.zza.zzbcd)) && (this.zzaxm.equals(localzzeh.getContainerId()));
  }
  
  private final void zzn(boolean paramBoolean)
  {
    this.zzayh.zza(new zzad(this, null));
    this.zzayn.zza(new zzae(this, null));
    zzwi localzzwi = this.zzayh.zzr(this.zzayf);
    if (localzzwi != null) {
      this.zzayj = new zzv(this.zzaya, this.zzaxu, new Container(this.zzqx, this.zzaya.getDataLayer(), this.zzaxm, 0L, localzzwi), this.zzayd);
    }
    this.zzayo = new zzab(this, paramBoolean);
    if (zzmv())
    {
      this.zzayn.zza(0L, "");
      return;
    }
    this.zzayh.zzmx();
  }
  
  protected final ContainerHolder a_(Status paramStatus)
  {
    if (this.zzayj != null) {
      return this.zzayj;
    }
    if (paramStatus == Status.RESULT_TIMEOUT) {
      zzdi.e("timer expired: setting result to failure");
    }
    return new zzv(paramStatus);
  }
  
  @VisibleForTesting
  final void zzcs(String paramString)
  {
    try
    {
      this.zzaym = paramString;
      if (this.zzayn != null) {
        this.zzayn.zzct(paramString);
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final String zzmp()
  {
    try
    {
      String str = this.zzaym;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzms()
  {
    Object localObject = this.zzayh.zzr(this.zzayf);
    if (localObject != null)
    {
      localObject = new Container(this.zzqx, this.zzaya.getDataLayer(), this.zzaxm, 0L, (zzwi)localObject);
      setResult(new zzv(this.zzaya, this.zzaxu, (Container)localObject, new zzaa(this)));
    }
    else
    {
      zzdi.e("Default was requested, but no default container was found");
      setResult(a_(new Status(10, "Default was requested, but no default container was found", null)));
    }
    this.zzayn = null;
    this.zzayh = null;
  }
  
  public final void zzmt()
  {
    zzn(false);
  }
  
  public final void zzmu()
  {
    zzn(true);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */