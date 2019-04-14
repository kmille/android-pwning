package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzj<T extends zzj>
{
  private final zzk zzrx;
  protected final zzg zzry;
  private final List<zzh> zzrz;
  
  @VisibleForTesting
  protected zzj(zzk paramzzk, Clock paramClock)
  {
    Preconditions.checkNotNull(paramzzk);
    this.zzrx = paramzzk;
    this.zzrz = new ArrayList();
    paramzzk = new zzg(this, paramClock);
    paramzzk.zzx();
    this.zzry = paramzzk;
  }
  
  protected void zza(zzg paramzzg) {}
  
  protected final void zzd(zzg paramzzg)
  {
    Iterator localIterator = this.zzrz.iterator();
    while (localIterator.hasNext()) {
      ((zzh)localIterator.next()).zza(this, paramzzg);
    }
  }
  
  public zzg zzi()
  {
    zzg localzzg = this.zzry.zzo();
    zzd(localzzg);
    return localzzg;
  }
  
  protected final zzk zzy()
  {
    return this.zzrx;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */