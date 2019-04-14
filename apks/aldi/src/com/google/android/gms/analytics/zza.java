package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzbe;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzby;
import java.util.List;
import java.util.ListIterator;

@VisibleForTesting
public class zza
  extends zzj<zza>
{
  private final zzat zzqm;
  private boolean zzqn;
  
  @VisibleForTesting
  public zza(zzat paramzzat)
  {
    super(paramzzat.zzbw(), paramzzat.zzbt());
    this.zzqm = paramzzat;
  }
  
  public final void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    this.zzqn = paramBoolean;
  }
  
  protected final void zza(zzg paramzzg)
  {
    paramzzg = (zzad)paramzzg.zzb(zzad.class);
    if (TextUtils.isEmpty(paramzzg.zzaz())) {
      paramzzg.setClientId(this.zzqm.zzcn().zzdn());
    }
    if ((this.zzqn) && (TextUtils.isEmpty(paramzzg.zzbb())))
    {
      zzah localzzah = this.zzqm.zzcm();
      paramzzg.zzm(localzzah.zzbj());
      paramzzg.zza(localzzah.zzbc());
    }
  }
  
  public final void zza(String paramString)
  {
    Preconditions.checkNotEmpty(paramString);
    Uri localUri = zzb.zzb(paramString);
    ListIterator localListIterator = this.zzry.zzq().listIterator();
    while (localListIterator.hasNext()) {
      if (localUri.equals(((zzo)localListIterator.next()).zzk())) {
        localListIterator.remove();
      }
    }
    this.zzry.zzq().add(new zzb(this.zzqm, paramString));
  }
  
  @VisibleForTesting
  final zzat zzh()
  {
    return this.zzqm;
  }
  
  public final zzg zzi()
  {
    zzg localzzg = this.zzry.zzo();
    localzzg.zza(this.zzqm.zzce().zzdb());
    localzzg.zza(this.zzqm.zzcf().zzeg());
    zzd(localzzg);
    return localzzg;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */