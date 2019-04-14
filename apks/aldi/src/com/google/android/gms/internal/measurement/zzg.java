package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzg
  extends zzacd<zzg>
{
  public zzm[] zzod = zzm.zzg();
  public zzm[] zzoe = zzm.zzg();
  public zzf[] zzof = zzf.zzc();
  
  public zzg()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzg)) {
      return false;
    }
    paramObject = (zzg)paramObject;
    if (!zzach.equals(this.zzod, ((zzg)paramObject).zzod)) {
      return false;
    }
    if (!zzach.equals(this.zzoe, ((zzg)paramObject).zzoe)) {
      return false;
    }
    if (!zzach.equals(this.zzof, ((zzg)paramObject).zzof)) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzg)paramObject).zzbzd);
    }
    if (((zzg)paramObject).zzbzd != null) {
      return ((zzg)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    int k = zzach.hashCode(this.zzod);
    int m = zzach.hashCode(this.zzoe);
    int n = zzach.hashCode(this.zzof);
    int i;
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      i = this.zzbzd.hashCode();
    } else {
      i = 0;
    }
    return ((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
  
  protected final int zza()
  {
    int i = super.zza();
    Object localObject = this.zzod;
    int m = 0;
    int j = i;
    if (localObject != null)
    {
      j = i;
      if (this.zzod.length > 0)
      {
        j = 0;
        while (j < this.zzod.length)
        {
          localObject = this.zzod[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(1, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzoe != null)
    {
      i = j;
      if (this.zzoe.length > 0)
      {
        i = j;
        j = 0;
        while (j < this.zzoe.length)
        {
          localObject = this.zzoe[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(2, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    int k = i;
    if (this.zzof != null)
    {
      k = i;
      if (this.zzof.length > 0)
      {
        j = m;
        for (;;)
        {
          k = i;
          if (j >= this.zzof.length) {
            break;
          }
          localObject = this.zzof[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(3, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    return k;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    Object localObject = this.zzod;
    int j = 0;
    int i;
    if ((localObject != null) && (this.zzod.length > 0))
    {
      i = 0;
      while (i < this.zzod.length)
      {
        localObject = this.zzod[i];
        if (localObject != null) {
          paramzzacb.zza(1, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzoe != null) && (this.zzoe.length > 0))
    {
      i = 0;
      while (i < this.zzoe.length)
      {
        localObject = this.zzoe[i];
        if (localObject != null) {
          paramzzacb.zza(2, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzof != null) && (this.zzof.length > 0))
    {
      i = j;
      while (i < this.zzof.length)
      {
        localObject = this.zzof[i];
        if (localObject != null) {
          paramzzacb.zza(3, (zzacj)localObject);
        }
        i += 1;
      }
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */