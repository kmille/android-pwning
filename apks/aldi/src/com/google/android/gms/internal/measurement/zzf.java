package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzf
  extends zzacd<zzf>
{
  private static volatile zzf[] zznx;
  public String zzny = "";
  public long zznz = 0L;
  public long zzoa = 2147483647L;
  public boolean zzob = false;
  public long zzoc = 0L;
  
  public zzf()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public static zzf[] zzc()
  {
    if (zznx == null) {
      synchronized (zzach.zzbzn)
      {
        if (zznx == null) {
          zznx = new zzf[0];
        }
      }
    }
    return zznx;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzf)) {
      return false;
    }
    paramObject = (zzf)paramObject;
    if (this.zzny == null)
    {
      if (((zzf)paramObject).zzny != null) {
        return false;
      }
    }
    else if (!this.zzny.equals(((zzf)paramObject).zzny)) {
      return false;
    }
    if (this.zznz != ((zzf)paramObject).zznz) {
      return false;
    }
    if (this.zzoa != ((zzf)paramObject).zzoa) {
      return false;
    }
    if (this.zzob != ((zzf)paramObject).zzob) {
      return false;
    }
    if (this.zzoc != ((zzf)paramObject).zzoc) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzf)paramObject).zzbzd);
    }
    if (((zzf)paramObject).zzbzd != null) {
      return ((zzf)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int n = getClass().getName().hashCode();
    String str = this.zzny;
    int m = 0;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = this.zzny.hashCode();
    }
    int i1 = (int)(this.zznz ^ this.zznz >>> 32);
    int i2 = (int)(this.zzoa ^ this.zzoa >>> 32);
    int j;
    if (this.zzob) {
      j = 1231;
    } else {
      j = 1237;
    }
    int i3 = (int)(this.zzoc ^ this.zzoc >>> 32);
    int k = m;
    if (this.zzbzd != null) {
      if (this.zzbzd.isEmpty()) {
        k = m;
      } else {
        k = this.zzbzd.hashCode();
      }
    }
    return ((((((n + 527) * 31 + i) * 31 + i1) * 31 + i2) * 31 + j) * 31 + i3) * 31 + k;
  }
  
  protected final int zza()
  {
    int j = super.zza();
    int i = j;
    if (this.zzny != null)
    {
      i = j;
      if (!this.zzny.equals("")) {
        i = j + zzacb.zzc(1, this.zzny);
      }
    }
    j = i;
    if (this.zznz != 0L) {
      j = i + zzacb.zzc(2, this.zznz);
    }
    i = j;
    if (this.zzoa != 2147483647L) {
      i = j + zzacb.zzc(3, this.zzoa);
    }
    j = i;
    if (this.zzob) {
      j = i + (zzacb.zzaq(4) + 1);
    }
    i = j;
    if (this.zzoc != 0L) {
      i = j + zzacb.zzc(5, this.zzoc);
    }
    return i;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    if ((this.zzny != null) && (!this.zzny.equals(""))) {
      paramzzacb.zzb(1, this.zzny);
    }
    if (this.zznz != 0L) {
      paramzzacb.zzb(2, this.zznz);
    }
    if (this.zzoa != 2147483647L) {
      paramzzacb.zzb(3, this.zzoa);
    }
    if (this.zzob) {
      paramzzacb.zza(4, this.zzob);
    }
    if (this.zzoc != 0L) {
      paramzzacb.zzb(5, this.zzoc);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */