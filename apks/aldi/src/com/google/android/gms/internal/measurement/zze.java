package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zze
  extends zzacd<zze>
{
  private static volatile zze[] zzns;
  private int name = 0;
  public int[] zznt = zzacm.zzbvp;
  private int zznu = 0;
  private boolean zznv = false;
  private boolean zznw = false;
  
  public zze()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public static zze[] zzb()
  {
    if (zzns == null) {
      synchronized (zzach.zzbzn)
      {
        if (zzns == null) {
          zzns = new zze[0];
        }
      }
    }
    return zzns;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zze)) {
      return false;
    }
    paramObject = (zze)paramObject;
    if (!zzach.equals(this.zznt, ((zze)paramObject).zznt)) {
      return false;
    }
    if (this.zznu != ((zze)paramObject).zznu) {
      return false;
    }
    if (this.name != ((zze)paramObject).name) {
      return false;
    }
    if (this.zznv != ((zze)paramObject).zznv) {
      return false;
    }
    if (this.zznw != ((zze)paramObject).zznw) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zze)paramObject).zzbzd);
    }
    if (((zze)paramObject).zzbzd != null) {
      return ((zze)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int m = getClass().getName().hashCode();
    int n = zzach.hashCode(this.zznt);
    int i1 = this.zznu;
    int i2 = this.name;
    boolean bool = this.zznv;
    int j = 1237;
    int i;
    if (bool) {
      i = 1231;
    } else {
      i = 1237;
    }
    if (this.zznw) {
      j = 1231;
    }
    int k;
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      k = this.zzbzd.hashCode();
    } else {
      k = 0;
    }
    return ((((((m + 527) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i) * 31 + j) * 31 + k;
  }
  
  protected final int zza()
  {
    int j = super.zza();
    int i = j;
    if (this.zznw) {
      i = j + (zzacb.zzaq(1) + 1);
    }
    int k = i + zzacb.zzf(2, this.zznu);
    i = k;
    if (this.zznt != null)
    {
      i = k;
      if (this.zznt.length > 0)
      {
        i = 0;
        j = 0;
        while (i < this.zznt.length)
        {
          j += zzacb.zzao(this.zznt[i]);
          i += 1;
        }
        i = k + j + this.zznt.length * 1;
      }
    }
    j = i;
    if (this.name != 0) {
      j = i + zzacb.zzf(4, this.name);
    }
    i = j;
    if (this.zznv) {
      i = j + (zzacb.zzaq(6) + 1);
    }
    return i;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    if (this.zznw) {
      paramzzacb.zza(1, this.zznw);
    }
    paramzzacb.zze(2, this.zznu);
    if ((this.zznt != null) && (this.zznt.length > 0))
    {
      int i = 0;
      while (i < this.zznt.length)
      {
        paramzzacb.zze(3, this.zznt[i]);
        i += 1;
      }
    }
    if (this.name != 0) {
      paramzzacb.zze(4, this.name);
    }
    if (this.zznv) {
      paramzzacb.zza(6, this.zznv);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */