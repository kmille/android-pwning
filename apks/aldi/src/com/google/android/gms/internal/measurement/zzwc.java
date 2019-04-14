package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzwc
  extends zzacd<zzwc>
{
  public long zzboa = 0L;
  public zzl zzbob = null;
  public zzi zzpv = null;
  
  public zzwc()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzwc)) {
      return false;
    }
    paramObject = (zzwc)paramObject;
    if (this.zzboa != ((zzwc)paramObject).zzboa) {
      return false;
    }
    if (this.zzpv == null)
    {
      if (((zzwc)paramObject).zzpv != null) {
        return false;
      }
    }
    else if (!this.zzpv.equals(((zzwc)paramObject).zzpv)) {
      return false;
    }
    if (this.zzbob == null)
    {
      if (((zzwc)paramObject).zzbob != null) {
        return false;
      }
    }
    else if (!this.zzbob.equals(((zzwc)paramObject).zzbob)) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzwc)paramObject).zzbzd);
    }
    if (((zzwc)paramObject).zzbzd != null) {
      return ((zzwc)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int n = getClass().getName().hashCode();
    int i1 = (int)(this.zzboa ^ this.zzboa >>> 32);
    Object localObject = this.zzpv;
    int m = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((zzi)localObject).hashCode();
    }
    localObject = this.zzbob;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((zzl)localObject).hashCode();
    }
    int k = m;
    if (this.zzbzd != null) {
      if (this.zzbzd.isEmpty()) {
        k = m;
      } else {
        k = this.zzbzd.hashCode();
      }
    }
    return ((((n + 527) * 31 + i1) * 31 + i) * 31 + j) * 31 + k;
  }
  
  protected final int zza()
  {
    int j = super.zza() + zzacb.zzc(1, this.zzboa);
    int i = j;
    if (this.zzpv != null) {
      i = j + zzacb.zzb(2, this.zzpv);
    }
    j = i;
    if (this.zzbob != null) {
      j = i + zzacb.zzb(3, this.zzbob);
    }
    return j;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    paramzzacb.zzb(1, this.zzboa);
    if (this.zzpv != null) {
      paramzzacb.zza(2, this.zzpv);
    }
    if (this.zzbob != null) {
      paramzzacb.zza(3, this.zzbob);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */