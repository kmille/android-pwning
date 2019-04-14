package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzc
{
  public static final class zza
    extends zzacd<zza>
  {
    public static final zzace<zzm, zza> zzpi = zzace.zza(11, zza.class, 810L);
    private static final zza[] zzpj = new zza[0];
    public int[] zzpk = zzacm.zzbvp;
    public int[] zzpl = zzacm.zzbvp;
    public int[] zzpm = zzacm.zzbvp;
    private int zzpn = 0;
    public int[] zzpo = zzacm.zzbvp;
    public int zzpp = 0;
    private int zzpq = 0;
    
    public zza()
    {
      this.zzbzd = null;
      this.zzbzo = -1;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof zza)) {
        return false;
      }
      paramObject = (zza)paramObject;
      if (!zzach.equals(this.zzpk, ((zza)paramObject).zzpk)) {
        return false;
      }
      if (!zzach.equals(this.zzpl, ((zza)paramObject).zzpl)) {
        return false;
      }
      if (!zzach.equals(this.zzpm, ((zza)paramObject).zzpm)) {
        return false;
      }
      if (this.zzpn != ((zza)paramObject).zzpn) {
        return false;
      }
      if (!zzach.equals(this.zzpo, ((zza)paramObject).zzpo)) {
        return false;
      }
      if (this.zzpp != ((zza)paramObject).zzpp) {
        return false;
      }
      if (this.zzpq != ((zza)paramObject).zzpq) {
        return false;
      }
      if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
        return this.zzbzd.equals(((zza)paramObject).zzbzd);
      }
      if (((zza)paramObject).zzbzd != null) {
        return ((zza)paramObject).zzbzd.isEmpty();
      }
      return true;
    }
    
    public final int hashCode()
    {
      int j = getClass().getName().hashCode();
      int k = zzach.hashCode(this.zzpk);
      int m = zzach.hashCode(this.zzpl);
      int n = zzach.hashCode(this.zzpm);
      int i1 = this.zzpn;
      int i2 = zzach.hashCode(this.zzpo);
      int i3 = this.zzpp;
      int i4 = this.zzpq;
      int i;
      if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
        i = this.zzbzd.hashCode();
      } else {
        i = 0;
      }
      return ((((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i;
    }
    
    protected final int zza()
    {
      int k = super.zza();
      int[] arrayOfInt = this.zzpk;
      int m = 0;
      int i = k;
      if (arrayOfInt != null)
      {
        i = k;
        if (this.zzpk.length > 0)
        {
          i = 0;
          j = 0;
          while (i < this.zzpk.length)
          {
            j += zzacb.zzao(this.zzpk[i]);
            i += 1;
          }
          i = k + j + this.zzpk.length * 1;
        }
      }
      int j = i;
      if (this.zzpl != null)
      {
        j = i;
        if (this.zzpl.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.zzpl.length)
          {
            k += zzacb.zzao(this.zzpl[j]);
            j += 1;
          }
          j = i + k + this.zzpl.length * 1;
        }
      }
      k = j;
      if (this.zzpm != null)
      {
        k = j;
        if (this.zzpm.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.zzpm.length)
          {
            k += zzacb.zzao(this.zzpm[i]);
            i += 1;
          }
          k = j + k + this.zzpm.length * 1;
        }
      }
      i = k;
      if (this.zzpn != 0) {
        i = k + zzacb.zzf(4, this.zzpn);
      }
      j = i;
      if (this.zzpo != null)
      {
        j = i;
        if (this.zzpo.length > 0)
        {
          k = 0;
          j = m;
          while (j < this.zzpo.length)
          {
            k += zzacb.zzao(this.zzpo[j]);
            j += 1;
          }
          j = i + k + this.zzpo.length * 1;
        }
      }
      i = j;
      if (this.zzpp != 0) {
        i = j + zzacb.zzf(6, this.zzpp);
      }
      j = i;
      if (this.zzpq != 0) {
        j = i + zzacb.zzf(7, this.zzpq);
      }
      return j;
    }
    
    public final void zza(zzacb paramzzacb)
      throws IOException
    {
      int[] arrayOfInt = this.zzpk;
      int j = 0;
      int i;
      if ((arrayOfInt != null) && (this.zzpk.length > 0))
      {
        i = 0;
        while (i < this.zzpk.length)
        {
          paramzzacb.zze(1, this.zzpk[i]);
          i += 1;
        }
      }
      if ((this.zzpl != null) && (this.zzpl.length > 0))
      {
        i = 0;
        while (i < this.zzpl.length)
        {
          paramzzacb.zze(2, this.zzpl[i]);
          i += 1;
        }
      }
      if ((this.zzpm != null) && (this.zzpm.length > 0))
      {
        i = 0;
        while (i < this.zzpm.length)
        {
          paramzzacb.zze(3, this.zzpm[i]);
          i += 1;
        }
      }
      if (this.zzpn != 0) {
        paramzzacb.zze(4, this.zzpn);
      }
      if ((this.zzpo != null) && (this.zzpo.length > 0))
      {
        i = j;
        while (i < this.zzpo.length)
        {
          paramzzacb.zze(5, this.zzpo[i]);
          i += 1;
        }
      }
      if (this.zzpp != 0) {
        paramzzacb.zze(6, this.zzpp);
      }
      if (this.zzpq != 0) {
        paramzzacb.zze(7, this.zzpq);
      }
      super.zza(paramzzacb);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */