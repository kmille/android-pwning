package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzai
  extends zzar
{
  private final zzbf zzve;
  
  public zzai(zzat paramzzat, zzav paramzzav)
  {
    super(paramzzat);
    Preconditions.checkNotNull(paramzzav);
    this.zzve = new zzbf(paramzzat, paramzzav);
  }
  
  final void onServiceConnected()
  {
    zzk.zzab();
    this.zzve.onServiceConnected();
  }
  
  public final void setLocalDispatchPeriod(int paramInt)
  {
    zzch();
    zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(paramInt));
    zzbw().zza(new zzaj(this, paramInt));
  }
  
  public final void start()
  {
    this.zzve.start();
  }
  
  public final long zza(zzaw paramzzaw)
  {
    zzch();
    Preconditions.checkNotNull(paramzzaw);
    zzk.zzab();
    long l = this.zzve.zza(paramzzaw, true);
    if (l == 0L) {
      this.zzve.zzb(paramzzaw);
    }
    return l;
  }
  
  public final void zza(zzca paramzzca)
  {
    zzch();
    zzbw().zza(new zzao(this, paramzzca));
  }
  
  public final void zza(zzch paramzzch)
  {
    Preconditions.checkNotNull(paramzzch);
    zzch();
    zzb("Hit delivery requested", paramzzch);
    zzbw().zza(new zzam(this, paramzzch));
  }
  
  public final void zza(String paramString, Runnable paramRunnable)
  {
    Preconditions.checkNotEmpty(paramString, "campaign param can't be empty");
    zzbw().zza(new zzal(this, paramString, paramRunnable));
  }
  
  protected final void zzac()
  {
    this.zzve.zzm();
  }
  
  public final void zzbn()
  {
    zzch();
    zzbw().zza(new zzan(this));
  }
  
  public final void zzbo()
  {
    zzch();
    Context localContext = getContext();
    if ((zzct.zza(localContext)) && (zzcu.zze(localContext)))
    {
      Intent localIntent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localIntent.setComponent(new ComponentName(localContext, "com.google.android.gms.analytics.AnalyticsService"));
      localContext.startService(localIntent);
      return;
    }
    zza(null);
  }
  
  public final boolean zzbp()
  {
    zzch();
    Future localFuture = zzbw().zza(new zzap(this));
    try
    {
      localFuture.get(4L, TimeUnit.SECONDS);
      return true;
    }
    catch (TimeoutException localTimeoutException)
    {
      zzd("syncDispatchLocalHits timed out", localTimeoutException);
      return false;
    }
    catch (ExecutionException localExecutionException)
    {
      zze("syncDispatchLocalHits failed", localExecutionException);
      return false;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzd("syncDispatchLocalHits interrupted", localInterruptedException);
    }
    return false;
  }
  
  public final void zzbq()
  {
    zzch();
    zzk.zzab();
    zzbf localzzbf = this.zzve;
    zzk.zzab();
    localzzbf.zzch();
    localzzbf.zzq("Service disconnected");
  }
  
  final void zzbr()
  {
    zzk.zzab();
    this.zzve.zzbr();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */