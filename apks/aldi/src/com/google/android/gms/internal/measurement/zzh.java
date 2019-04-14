package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzh
  extends zzacd<zzh>
{
  private static volatile zzh[] zzog;
  public int key = 0;
  public int value = 0;
  
  public zzh()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public static zzh[] zzd()
  {
    if (zzog == null) {
      synchronized (zzach.zzbzn)
      {
        if (zzog == null) {
          zzog = new zzh[0];
        }
      }
    }
    return zzog;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzh)) {
      return false;
    }
    paramObject = (zzh)paramObject;
    if (this.key != ((zzh)paramObject).key) {
      return false;
    }
    if (this.value != ((zzh)paramObject).value) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzh)paramObject).zzbzd);
    }
    if (((zzh)paramObject).zzbzd != null) {
      return ((zzh)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    int k = this.key;
    int m = this.value;
    int i;
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      i = this.zzbzd.hashCode();
    } else {
      i = 0;
    }
    return (((j + 527) * 31 + k) * 31 + m) * 31 + i;
  }
  
  protected final int zza()
  {
    return super.zza() + zzacb.zzf(1, this.key) + zzacb.zzf(2, this.value);
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    paramzzacb.zze(1, this.key);
    paramzzacb.zze(2, this.value);
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */