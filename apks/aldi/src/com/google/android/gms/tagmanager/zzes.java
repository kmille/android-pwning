package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzes
  implements zzag
{
  private boolean closed;
  private final String zzaxm;
  private String zzaym;
  private zzdh<zzl> zzbcn;
  private zzal zzbco;
  private final ScheduledExecutorService zzbcq;
  private final zzev zzbcr;
  private ScheduledFuture<?> zzbcs;
  private final Context zzqx;
  
  public zzes(Context paramContext, String paramString, zzal paramzzal)
  {
    this(paramContext, paramString, paramzzal, null, null);
  }
  
  @VisibleForTesting
  private zzes(Context paramContext, String paramString, zzal paramzzal, zzew paramzzew, zzev paramzzev)
  {
    this.zzbco = paramzzal;
    this.zzqx = paramContext;
    this.zzaxm = paramString;
    this.zzbcq = new zzet(this).zzoo();
    this.zzbcr = new zzeu(this);
  }
  
  private final void zzon()
  {
    try
    {
      boolean bool = this.closed;
      if (!bool) {
        return;
      }
      throw new IllegalStateException("called method after closed");
    }
    finally {}
  }
  
  public final void release()
  {
    try
    {
      zzon();
      if (this.zzbcs != null) {
        this.zzbcs.cancel(false);
      }
      this.zzbcq.shutdown();
      this.closed = true;
      return;
    }
    finally {}
  }
  
  public final void zza(long paramLong, String paramString)
  {
    try
    {
      Object localObject1 = this.zzaxm;
      Object localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 55);
      ((StringBuilder)localObject2).append("loadAfterDelay: containerId=");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" delay=");
      ((StringBuilder)localObject2).append(paramLong);
      zzdi.v(((StringBuilder)localObject2).toString());
      zzon();
      if (this.zzbcn != null)
      {
        if (this.zzbcs != null) {
          this.zzbcs.cancel(false);
        }
        localObject1 = this.zzbcq;
        localObject2 = this.zzbcr.zza(this.zzbco);
        ((zzer)localObject2).zza(this.zzbcn);
        ((zzer)localObject2).zzct(this.zzaym);
        ((zzer)localObject2).zzdl(paramString);
        this.zzbcs = ((ScheduledExecutorService)localObject1).schedule((Runnable)localObject2, paramLong, TimeUnit.MILLISECONDS);
        return;
      }
      throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
    }
    finally {}
  }
  
  public final void zza(zzdh<zzl> paramzzdh)
  {
    try
    {
      zzon();
      this.zzbcn = paramzzdh;
      return;
    }
    finally
    {
      paramzzdh = finally;
      throw paramzzdh;
    }
  }
  
  public final void zzct(String paramString)
  {
    try
    {
      zzon();
      this.zzaym = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */