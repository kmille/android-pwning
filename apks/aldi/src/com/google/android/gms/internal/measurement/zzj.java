package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzj
  extends zzacd<zzj>
{
  private static volatile zzj[] zzox;
  public int[] zzoy = zzacm.zzbvp;
  public int[] zzoz = zzacm.zzbvp;
  public int[] zzpa = zzacm.zzbvp;
  public int[] zzpb = zzacm.zzbvp;
  public int[] zzpc = zzacm.zzbvp;
  public int[] zzpd = zzacm.zzbvp;
  public int[] zzpe = zzacm.zzbvp;
  public int[] zzpf = zzacm.zzbvp;
  public int[] zzpg = zzacm.zzbvp;
  public int[] zzph = zzacm.zzbvp;
  
  public zzj()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public static zzj[] zze()
  {
    if (zzox == null) {
      synchronized (zzach.zzbzn)
      {
        if (zzox == null) {
          zzox = new zzj[0];
        }
      }
    }
    return zzox;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzj)) {
      return false;
    }
    paramObject = (zzj)paramObject;
    if (!zzach.equals(this.zzoy, ((zzj)paramObject).zzoy)) {
      return false;
    }
    if (!zzach.equals(this.zzoz, ((zzj)paramObject).zzoz)) {
      return false;
    }
    if (!zzach.equals(this.zzpa, ((zzj)paramObject).zzpa)) {
      return false;
    }
    if (!zzach.equals(this.zzpb, ((zzj)paramObject).zzpb)) {
      return false;
    }
    if (!zzach.equals(this.zzpc, ((zzj)paramObject).zzpc)) {
      return false;
    }
    if (!zzach.equals(this.zzpd, ((zzj)paramObject).zzpd)) {
      return false;
    }
    if (!zzach.equals(this.zzpe, ((zzj)paramObject).zzpe)) {
      return false;
    }
    if (!zzach.equals(this.zzpf, ((zzj)paramObject).zzpf)) {
      return false;
    }
    if (!zzach.equals(this.zzpg, ((zzj)paramObject).zzpg)) {
      return false;
    }
    if (!zzach.equals(this.zzph, ((zzj)paramObject).zzph)) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzj)paramObject).zzbzd);
    }
    if (((zzj)paramObject).zzbzd != null) {
      return ((zzj)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    int k = zzach.hashCode(this.zzoy);
    int m = zzach.hashCode(this.zzoz);
    int n = zzach.hashCode(this.zzpa);
    int i1 = zzach.hashCode(this.zzpb);
    int i2 = zzach.hashCode(this.zzpc);
    int i3 = zzach.hashCode(this.zzpd);
    int i4 = zzach.hashCode(this.zzpe);
    int i5 = zzach.hashCode(this.zzpf);
    int i6 = zzach.hashCode(this.zzpg);
    int i7 = zzach.hashCode(this.zzph);
    int i;
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      i = this.zzbzd.hashCode();
    } else {
      i = 0;
    }
    return (((((((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i;
  }
  
  protected final int zza()
  {
    int k = super.zza();
    int[] arrayOfInt = this.zzoy;
    int m = 0;
    int i = k;
    if (arrayOfInt != null)
    {
      i = k;
      if (this.zzoy.length > 0)
      {
        i = 0;
        j = 0;
        while (i < this.zzoy.length)
        {
          j += zzacb.zzao(this.zzoy[i]);
          i += 1;
        }
        i = k + j + this.zzoy.length * 1;
      }
    }
    int j = i;
    if (this.zzoz != null)
    {
      j = i;
      if (this.zzoz.length > 0)
      {
        j = 0;
        k = 0;
        while (j < this.zzoz.length)
        {
          k += zzacb.zzao(this.zzoz[j]);
          j += 1;
        }
        j = i + k + this.zzoz.length * 1;
      }
    }
    i = j;
    if (this.zzpa != null)
    {
      i = j;
      if (this.zzpa.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.zzpa.length)
        {
          k += zzacb.zzao(this.zzpa[i]);
          i += 1;
        }
        i = j + k + this.zzpa.length * 1;
      }
    }
    j = i;
    if (this.zzpb != null)
    {
      j = i;
      if (this.zzpb.length > 0)
      {
        j = 0;
        k = 0;
        while (j < this.zzpb.length)
        {
          k += zzacb.zzao(this.zzpb[j]);
          j += 1;
        }
        j = i + k + this.zzpb.length * 1;
      }
    }
    i = j;
    if (this.zzpc != null)
    {
      i = j;
      if (this.zzpc.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.zzpc.length)
        {
          k += zzacb.zzao(this.zzpc[i]);
          i += 1;
        }
        i = j + k + this.zzpc.length * 1;
      }
    }
    j = i;
    if (this.zzpd != null)
    {
      j = i;
      if (this.zzpd.length > 0)
      {
        j = 0;
        k = 0;
        while (j < this.zzpd.length)
        {
          k += zzacb.zzao(this.zzpd[j]);
          j += 1;
        }
        j = i + k + this.zzpd.length * 1;
      }
    }
    i = j;
    if (this.zzpe != null)
    {
      i = j;
      if (this.zzpe.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.zzpe.length)
        {
          k += zzacb.zzao(this.zzpe[i]);
          i += 1;
        }
        i = j + k + this.zzpe.length * 1;
      }
    }
    j = i;
    if (this.zzpf != null)
    {
      j = i;
      if (this.zzpf.length > 0)
      {
        j = 0;
        k = 0;
        while (j < this.zzpf.length)
        {
          k += zzacb.zzao(this.zzpf[j]);
          j += 1;
        }
        j = i + k + this.zzpf.length * 1;
      }
    }
    i = j;
    if (this.zzpg != null)
    {
      i = j;
      if (this.zzpg.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.zzpg.length)
        {
          k += zzacb.zzao(this.zzpg[i]);
          i += 1;
        }
        i = j + k + this.zzpg.length * 1;
      }
    }
    j = i;
    if (this.zzph != null)
    {
      j = i;
      if (this.zzph.length > 0)
      {
        k = 0;
        j = m;
        while (j < this.zzph.length)
        {
          k += zzacb.zzao(this.zzph[j]);
          j += 1;
        }
        j = i + k + this.zzph.length * 1;
      }
    }
    return j;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    int[] arrayOfInt = this.zzoy;
    int j = 0;
    int i;
    if ((arrayOfInt != null) && (this.zzoy.length > 0))
    {
      i = 0;
      while (i < this.zzoy.length)
      {
        paramzzacb.zze(1, this.zzoy[i]);
        i += 1;
      }
    }
    if ((this.zzoz != null) && (this.zzoz.length > 0))
    {
      i = 0;
      while (i < this.zzoz.length)
      {
        paramzzacb.zze(2, this.zzoz[i]);
        i += 1;
      }
    }
    if ((this.zzpa != null) && (this.zzpa.length > 0))
    {
      i = 0;
      while (i < this.zzpa.length)
      {
        paramzzacb.zze(3, this.zzpa[i]);
        i += 1;
      }
    }
    if ((this.zzpb != null) && (this.zzpb.length > 0))
    {
      i = 0;
      while (i < this.zzpb.length)
      {
        paramzzacb.zze(4, this.zzpb[i]);
        i += 1;
      }
    }
    if ((this.zzpc != null) && (this.zzpc.length > 0))
    {
      i = 0;
      while (i < this.zzpc.length)
      {
        paramzzacb.zze(5, this.zzpc[i]);
        i += 1;
      }
    }
    if ((this.zzpd != null) && (this.zzpd.length > 0))
    {
      i = 0;
      while (i < this.zzpd.length)
      {
        paramzzacb.zze(6, this.zzpd[i]);
        i += 1;
      }
    }
    if ((this.zzpe != null) && (this.zzpe.length > 0))
    {
      i = 0;
      while (i < this.zzpe.length)
      {
        paramzzacb.zze(7, this.zzpe[i]);
        i += 1;
      }
    }
    if ((this.zzpf != null) && (this.zzpf.length > 0))
    {
      i = 0;
      while (i < this.zzpf.length)
      {
        paramzzacb.zze(8, this.zzpf[i]);
        i += 1;
      }
    }
    if ((this.zzpg != null) && (this.zzpg.length > 0))
    {
      i = 0;
      while (i < this.zzpg.length)
      {
        paramzzacb.zze(9, this.zzpg[i]);
        i += 1;
      }
    }
    if ((this.zzph != null) && (this.zzph.length > 0))
    {
      i = j;
      while (i < this.zzph.length)
      {
        paramzzacb.zze(10, this.zzph[i]);
        i += 1;
      }
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */