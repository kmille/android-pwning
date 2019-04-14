package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzi
  extends zzacd<zzi>
{
  public String version = "";
  private String[] zzoh = zzacm.zzbzx;
  public String[] zzoi = zzacm.zzbzx;
  public zzm[] zzoj = zzm.zzg();
  public zzh[] zzok = zzh.zzd();
  public zze[] zzol = zze.zzb();
  public zze[] zzom = zze.zzb();
  public zze[] zzon = zze.zzb();
  public zzj[] zzoo = zzj.zze();
  private String zzop = "";
  private String zzoq = "";
  private String zzor = "0";
  private zzd zzos = null;
  private float zzot = 0.0F;
  private boolean zzou = false;
  private String[] zzov = zzacm.zzbzx;
  public int zzow = 0;
  
  public zzi()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzi)) {
      return false;
    }
    paramObject = (zzi)paramObject;
    if (!zzach.equals(this.zzoh, ((zzi)paramObject).zzoh)) {
      return false;
    }
    if (!zzach.equals(this.zzoi, ((zzi)paramObject).zzoi)) {
      return false;
    }
    if (!zzach.equals(this.zzoj, ((zzi)paramObject).zzoj)) {
      return false;
    }
    if (!zzach.equals(this.zzok, ((zzi)paramObject).zzok)) {
      return false;
    }
    if (!zzach.equals(this.zzol, ((zzi)paramObject).zzol)) {
      return false;
    }
    if (!zzach.equals(this.zzom, ((zzi)paramObject).zzom)) {
      return false;
    }
    if (!zzach.equals(this.zzon, ((zzi)paramObject).zzon)) {
      return false;
    }
    if (!zzach.equals(this.zzoo, ((zzi)paramObject).zzoo)) {
      return false;
    }
    if (this.zzop == null)
    {
      if (((zzi)paramObject).zzop != null) {
        return false;
      }
    }
    else if (!this.zzop.equals(((zzi)paramObject).zzop)) {
      return false;
    }
    if (this.zzoq == null)
    {
      if (((zzi)paramObject).zzoq != null) {
        return false;
      }
    }
    else if (!this.zzoq.equals(((zzi)paramObject).zzoq)) {
      return false;
    }
    if (this.zzor == null)
    {
      if (((zzi)paramObject).zzor != null) {
        return false;
      }
    }
    else if (!this.zzor.equals(((zzi)paramObject).zzor)) {
      return false;
    }
    if (this.version == null)
    {
      if (((zzi)paramObject).version != null) {
        return false;
      }
    }
    else if (!this.version.equals(((zzi)paramObject).version)) {
      return false;
    }
    if (this.zzos == null)
    {
      if (((zzi)paramObject).zzos != null) {
        return false;
      }
    }
    else if (!this.zzos.equals(((zzi)paramObject).zzos)) {
      return false;
    }
    if (Float.floatToIntBits(this.zzot) != Float.floatToIntBits(((zzi)paramObject).zzot)) {
      return false;
    }
    if (this.zzou != ((zzi)paramObject).zzou) {
      return false;
    }
    if (!zzach.equals(this.zzov, ((zzi)paramObject).zzov)) {
      return false;
    }
    if (this.zzow != ((zzi)paramObject).zzow) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzi)paramObject).zzbzd);
    }
    if (((zzi)paramObject).zzbzd != null) {
      return ((zzi)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i4 = getClass().getName().hashCode();
    int i5 = zzach.hashCode(this.zzoh);
    int i6 = zzach.hashCode(this.zzoi);
    int i7 = zzach.hashCode(this.zzoj);
    int i8 = zzach.hashCode(this.zzok);
    int i9 = zzach.hashCode(this.zzol);
    int i10 = zzach.hashCode(this.zzom);
    int i11 = zzach.hashCode(this.zzon);
    int i12 = zzach.hashCode(this.zzoo);
    Object localObject = this.zzop;
    int i3 = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = this.zzop.hashCode();
    }
    int j;
    if (this.zzoq == null) {
      j = 0;
    } else {
      j = this.zzoq.hashCode();
    }
    int k;
    if (this.zzor == null) {
      k = 0;
    } else {
      k = this.zzor.hashCode();
    }
    int m;
    if (this.version == null) {
      m = 0;
    } else {
      m = this.version.hashCode();
    }
    localObject = this.zzos;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((zzd)localObject).hashCode();
    }
    int i13 = Float.floatToIntBits(this.zzot);
    int i1;
    if (this.zzou) {
      i1 = 1231;
    } else {
      i1 = 1237;
    }
    int i14 = zzach.hashCode(this.zzov);
    int i15 = this.zzow;
    int i2 = i3;
    if (this.zzbzd != null) {
      if (this.zzbzd.isEmpty()) {
        i2 = i3;
      } else {
        i2 = this.zzbzd.hashCode();
      }
    }
    return ((((((((((((((((((i4 + 527) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i13) * 31 + i1) * 31 + i14) * 31 + i15) * 31 + i2;
  }
  
  protected final int zza()
  {
    int i1 = super.zza();
    Object localObject = this.zzoi;
    int i2 = 0;
    int i = i1;
    int n;
    int m;
    if (localObject != null)
    {
      i = i1;
      if (this.zzoi.length > 0)
      {
        i = 0;
        j = 0;
        for (k = 0; i < this.zzoi.length; k = m)
        {
          localObject = this.zzoi[i];
          n = j;
          m = k;
          if (localObject != null)
          {
            m = k + 1;
            n = j + zzacb.zzfr((String)localObject);
          }
          i += 1;
          j = n;
        }
        i = i1 + j + k * 1;
      }
    }
    int j = i;
    if (this.zzoj != null)
    {
      j = i;
      if (this.zzoj.length > 0)
      {
        j = 0;
        while (j < this.zzoj.length)
        {
          localObject = this.zzoj[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(2, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzok != null)
    {
      i = j;
      if (this.zzok.length > 0)
      {
        i = j;
        j = 0;
        while (j < this.zzok.length)
        {
          localObject = this.zzok[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(3, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    j = i;
    if (this.zzol != null)
    {
      j = i;
      if (this.zzol.length > 0)
      {
        j = 0;
        while (j < this.zzol.length)
        {
          localObject = this.zzol[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(4, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzom != null)
    {
      i = j;
      if (this.zzom.length > 0)
      {
        i = j;
        j = 0;
        while (j < this.zzom.length)
        {
          localObject = this.zzom[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(5, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    j = i;
    if (this.zzon != null)
    {
      j = i;
      if (this.zzon.length > 0)
      {
        j = 0;
        while (j < this.zzon.length)
        {
          localObject = this.zzon[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(6, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzoo != null)
    {
      i = j;
      if (this.zzoo.length > 0)
      {
        i = j;
        j = 0;
        while (j < this.zzoo.length)
        {
          localObject = this.zzoo[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(7, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    j = i;
    if (this.zzop != null)
    {
      j = i;
      if (!this.zzop.equals("")) {
        j = i + zzacb.zzc(9, this.zzop);
      }
    }
    i = j;
    if (this.zzoq != null)
    {
      i = j;
      if (!this.zzoq.equals("")) {
        i = j + zzacb.zzc(10, this.zzoq);
      }
    }
    j = i;
    if (this.zzor != null)
    {
      j = i;
      if (!this.zzor.equals("0")) {
        j = i + zzacb.zzc(12, this.zzor);
      }
    }
    i = j;
    if (this.version != null)
    {
      i = j;
      if (!this.version.equals("")) {
        i = j + zzacb.zzc(13, this.version);
      }
    }
    j = i;
    if (this.zzos != null) {
      j = i + zzacb.zzb(14, this.zzos);
    }
    i = j;
    if (Float.floatToIntBits(this.zzot) != Float.floatToIntBits(0.0F)) {
      i = j + (zzacb.zzaq(15) + 4);
    }
    j = i;
    if (this.zzov != null)
    {
      j = i;
      if (this.zzov.length > 0)
      {
        j = 0;
        k = 0;
        for (m = 0; j < this.zzov.length; m = n)
        {
          localObject = this.zzov[j];
          i1 = k;
          n = m;
          if (localObject != null)
          {
            n = m + 1;
            i1 = k + zzacb.zzfr((String)localObject);
          }
          j += 1;
          k = i1;
        }
        j = i + k + m * 2;
      }
    }
    int k = j;
    if (this.zzow != 0) {
      k = j + zzacb.zzf(17, this.zzow);
    }
    i = k;
    if (this.zzou) {
      i = k + (zzacb.zzaq(18) + 1);
    }
    j = i;
    if (this.zzoh != null)
    {
      j = i;
      if (this.zzoh.length > 0)
      {
        k = 0;
        m = 0;
        j = i2;
        while (j < this.zzoh.length)
        {
          localObject = this.zzoh[j];
          i1 = k;
          n = m;
          if (localObject != null)
          {
            n = m + 1;
            i1 = k + zzacb.zzfr((String)localObject);
          }
          j += 1;
          k = i1;
          m = n;
        }
        j = i + k + m * 2;
      }
    }
    return j;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    Object localObject = this.zzoi;
    int j = 0;
    int i;
    if ((localObject != null) && (this.zzoi.length > 0))
    {
      i = 0;
      while (i < this.zzoi.length)
      {
        localObject = this.zzoi[i];
        if (localObject != null) {
          paramzzacb.zzb(1, (String)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzoj != null) && (this.zzoj.length > 0))
    {
      i = 0;
      while (i < this.zzoj.length)
      {
        localObject = this.zzoj[i];
        if (localObject != null) {
          paramzzacb.zza(2, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzok != null) && (this.zzok.length > 0))
    {
      i = 0;
      while (i < this.zzok.length)
      {
        localObject = this.zzok[i];
        if (localObject != null) {
          paramzzacb.zza(3, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzol != null) && (this.zzol.length > 0))
    {
      i = 0;
      while (i < this.zzol.length)
      {
        localObject = this.zzol[i];
        if (localObject != null) {
          paramzzacb.zza(4, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzom != null) && (this.zzom.length > 0))
    {
      i = 0;
      while (i < this.zzom.length)
      {
        localObject = this.zzom[i];
        if (localObject != null) {
          paramzzacb.zza(5, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzon != null) && (this.zzon.length > 0))
    {
      i = 0;
      while (i < this.zzon.length)
      {
        localObject = this.zzon[i];
        if (localObject != null) {
          paramzzacb.zza(6, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzoo != null) && (this.zzoo.length > 0))
    {
      i = 0;
      while (i < this.zzoo.length)
      {
        localObject = this.zzoo[i];
        if (localObject != null) {
          paramzzacb.zza(7, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzop != null) && (!this.zzop.equals(""))) {
      paramzzacb.zzb(9, this.zzop);
    }
    if ((this.zzoq != null) && (!this.zzoq.equals(""))) {
      paramzzacb.zzb(10, this.zzoq);
    }
    if ((this.zzor != null) && (!this.zzor.equals("0"))) {
      paramzzacb.zzb(12, this.zzor);
    }
    if ((this.version != null) && (!this.version.equals(""))) {
      paramzzacb.zzb(13, this.version);
    }
    if (this.zzos != null) {
      paramzzacb.zza(14, this.zzos);
    }
    if (Float.floatToIntBits(this.zzot) != Float.floatToIntBits(0.0F)) {
      paramzzacb.zza(15, this.zzot);
    }
    if ((this.zzov != null) && (this.zzov.length > 0))
    {
      i = 0;
      while (i < this.zzov.length)
      {
        localObject = this.zzov[i];
        if (localObject != null) {
          paramzzacb.zzb(16, (String)localObject);
        }
        i += 1;
      }
    }
    if (this.zzow != 0) {
      paramzzacb.zze(17, this.zzow);
    }
    if (this.zzou) {
      paramzzacb.zza(18, this.zzou);
    }
    if ((this.zzoh != null) && (this.zzoh.length > 0))
    {
      i = j;
      while (i < this.zzoh.length)
      {
        localObject = this.zzoh[i];
        if (localObject != null) {
          paramzzacb.zzb(19, (String)localObject);
        }
        i += 1;
      }
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */