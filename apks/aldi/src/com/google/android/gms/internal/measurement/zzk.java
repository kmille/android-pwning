package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzk
  extends zzacd<zzk>
{
  private static volatile zzk[] zzpr;
  public String name = "";
  private zzm zzps = null;
  public zzg zzpt = null;
  
  public zzk()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  public static zzk[] zzf()
  {
    if (zzpr == null) {
      synchronized (zzach.zzbzn)
      {
        if (zzpr == null) {
          zzpr = new zzk[0];
        }
      }
    }
    return zzpr;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzk)) {
      return false;
    }
    paramObject = (zzk)paramObject;
    if (this.name == null)
    {
      if (((zzk)paramObject).name != null) {
        return false;
      }
    }
    else if (!this.name.equals(((zzk)paramObject).name)) {
      return false;
    }
    if (this.zzps == null)
    {
      if (((zzk)paramObject).zzps != null) {
        return false;
      }
    }
    else if (!this.zzps.equals(((zzk)paramObject).zzps)) {
      return false;
    }
    if (this.zzpt == null)
    {
      if (((zzk)paramObject).zzpt != null) {
        return false;
      }
    }
    else if (!this.zzpt.equals(((zzk)paramObject).zzpt)) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzk)paramObject).zzbzd);
    }
    if (((zzk)paramObject).zzbzd != null) {
      return ((zzk)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i1 = getClass().getName().hashCode();
    Object localObject = this.name;
    int n = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = this.name.hashCode();
    }
    localObject = this.zzps;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((zzm)localObject).hashCode();
    }
    localObject = this.zzpt;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((zzg)localObject).hashCode();
    }
    int m = n;
    if (this.zzbzd != null) {
      if (this.zzbzd.isEmpty()) {
        m = n;
      } else {
        m = this.zzbzd.hashCode();
      }
    }
    return ((((i1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + m;
  }
  
  protected final int zza()
  {
    int j = super.zza();
    int i = j;
    if (this.name != null)
    {
      i = j;
      if (!this.name.equals("")) {
        i = j + zzacb.zzc(1, this.name);
      }
    }
    j = i;
    if (this.zzps != null) {
      j = i + zzacb.zzb(2, this.zzps);
    }
    i = j;
    if (this.zzpt != null) {
      i = j + zzacb.zzb(3, this.zzpt);
    }
    return i;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    if ((this.name != null) && (!this.name.equals(""))) {
      paramzzacb.zzb(1, this.name);
    }
    if (this.zzps != null) {
      paramzzacb.zza(2, this.zzps);
    }
    if (this.zzpt != null) {
      paramzzacb.zza(3, this.zzpt);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */