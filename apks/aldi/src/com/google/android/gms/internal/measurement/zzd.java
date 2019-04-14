package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzd
  extends zzacd<zzd>
{
  private int level = 1;
  private int zznq = 0;
  private int zznr = 0;
  
  public zzd()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  private final zzd zza(zzaca paramzzaca)
    throws IOException
  {
    for (;;)
    {
      int i = paramzzaca.zzvl();
      if (i == 0) {
        break;
      }
      int j;
      if (i != 8)
      {
        if (i != 16)
        {
          if (i != 24)
          {
            if (!super.zza(paramzzaca, i)) {
              return this;
            }
          }
          else {
            this.zznr = paramzzaca.zzvn();
          }
        }
        else {
          this.zznq = paramzzaca.zzvn();
        }
      }
      else {
        j = paramzzaca.getPosition();
      }
      try
      {
        int k = paramzzaca.zzvn();
        if ((k > 0) && (k <= 3))
        {
          this.level = k;
          continue;
        }
        StringBuilder localStringBuilder = new StringBuilder(42);
        localStringBuilder.append(k);
        localStringBuilder.append(" is not a valid enum CacheLevel");
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
      paramzzaca.zzam(j);
      zza(paramzzaca, i);
    }
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzd)) {
      return false;
    }
    paramObject = (zzd)paramObject;
    if (this.level != ((zzd)paramObject).level) {
      return false;
    }
    if (this.zznq != ((zzd)paramObject).zznq) {
      return false;
    }
    if (this.zznr != ((zzd)paramObject).zznr) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzd)paramObject).zzbzd);
    }
    if (((zzd)paramObject).zzbzd != null) {
      return ((zzd)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    int k = this.level;
    int m = this.zznq;
    int n = this.zznr;
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
    int j = super.zza();
    int i = j;
    if (this.level != 1) {
      i = j + zzacb.zzf(1, this.level);
    }
    j = i;
    if (this.zznq != 0) {
      j = i + zzacb.zzf(2, this.zznq);
    }
    i = j;
    if (this.zznr != 0) {
      i = j + zzacb.zzf(3, this.zznr);
    }
    return i;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    if (this.level != 1) {
      paramzzacb.zze(1, this.level);
    }
    if (this.zznq != 0) {
      paramzzacb.zze(2, this.zznq);
    }
    if (this.zznr != 0) {
      paramzzacb.zze(3, this.zznr);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */