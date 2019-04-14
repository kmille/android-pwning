package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzl
  extends zzacd<zzl>
{
  public zzk[] zzpu = zzk.zzf();
  public zzi zzpv = null;
  public String zzpw = "";
  
  public zzl()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzl)) {
      return false;
    }
    paramObject = (zzl)paramObject;
    if (!zzach.equals(this.zzpu, ((zzl)paramObject).zzpu)) {
      return false;
    }
    if (this.zzpv == null)
    {
      if (((zzl)paramObject).zzpv != null) {
        return false;
      }
    }
    else if (!this.zzpv.equals(((zzl)paramObject).zzpv)) {
      return false;
    }
    if (this.zzpw == null)
    {
      if (((zzl)paramObject).zzpw != null) {
        return false;
      }
    }
    else if (!this.zzpw.equals(((zzl)paramObject).zzpw)) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzl)paramObject).zzbzd);
    }
    if (((zzl)paramObject).zzbzd != null) {
      return ((zzl)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int n = getClass().getName().hashCode();
    int i1 = zzach.hashCode(this.zzpu);
    zzi localzzi = this.zzpv;
    int m = 0;
    int i;
    if (localzzi == null) {
      i = 0;
    } else {
      i = localzzi.hashCode();
    }
    int j;
    if (this.zzpw == null) {
      j = 0;
    } else {
      j = this.zzpw.hashCode();
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
    int i = super.zza();
    int j = i;
    if (this.zzpu != null)
    {
      j = i;
      if (this.zzpu.length > 0)
      {
        int k = 0;
        for (;;)
        {
          j = i;
          if (k >= this.zzpu.length) {
            break;
          }
          zzk localzzk = this.zzpu[k];
          j = i;
          if (localzzk != null) {
            j = i + zzacb.zzb(1, localzzk);
          }
          k += 1;
          i = j;
        }
      }
    }
    i = j;
    if (this.zzpv != null) {
      i = j + zzacb.zzb(2, this.zzpv);
    }
    j = i;
    if (this.zzpw != null)
    {
      j = i;
      if (!this.zzpw.equals("")) {
        j = i + zzacb.zzc(3, this.zzpw);
      }
    }
    return j;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    if ((this.zzpu != null) && (this.zzpu.length > 0))
    {
      int i = 0;
      while (i < this.zzpu.length)
      {
        zzk localzzk = this.zzpu[i];
        if (localzzk != null) {
          paramzzacb.zza(1, localzzk);
        }
        i += 1;
      }
    }
    if (this.zzpv != null) {
      paramzzacb.zza(2, this.zzpv);
    }
    if ((this.zzpw != null) && (!this.zzpw.equals(""))) {
      paramzzacb.zzb(3, this.zzpw);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */