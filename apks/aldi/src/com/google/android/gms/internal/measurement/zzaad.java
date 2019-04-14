package com.google.android.gms.internal.measurement;

public class zzaad
{
  private static final zzzn zzbvd = ;
  private zzzb zzbve;
  private volatile zzaaq zzbvf;
  private volatile zzzb zzbvg;
  
  private final zzaaq zzb(zzaaq paramzzaaq)
  {
    if (this.zzbvf == null) {
      for (;;)
      {
        try
        {
          if (this.zzbvf == null) {}
        }
        finally {}
        try
        {
          this.zzbvf = paramzzaaq;
          this.zzbvg = zzzb.zzbte;
        }
        catch (zzzy localzzzy)
        {
          continue;
        }
        this.zzbvf = paramzzaaq;
        this.zzbvg = zzzb.zzbte;
      }
    }
    return this.zzbvf;
  }
  
  private final zzzb zzue()
  {
    if (this.zzbvg != null) {
      return this.zzbvg;
    }
    try
    {
      if (this.zzbvg != null)
      {
        localzzzb = this.zzbvg;
        return localzzzb;
      }
      if (this.zzbvf == null) {}
      for (zzzb localzzzb = zzzb.zzbte;; localzzzb = this.zzbvf.zzue())
      {
        this.zzbvg = localzzzb;
        break;
      }
      localzzzb = this.zzbvg;
      return localzzzb;
    }
    finally {}
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzaad)) {
      return false;
    }
    paramObject = (zzaad)paramObject;
    zzaaq localzzaaq1 = this.zzbvf;
    zzaaq localzzaaq2 = ((zzaad)paramObject).zzbvf;
    if ((localzzaaq1 == null) && (localzzaaq2 == null)) {
      return zzue().equals(((zzaad)paramObject).zzue());
    }
    if ((localzzaaq1 != null) && (localzzaaq2 != null)) {
      return localzzaaq1.equals(localzzaaq2);
    }
    if (localzzaaq1 != null) {
      return localzzaaq1.equals(((zzaad)paramObject).zzb(localzzaaq1.zzuo()));
    }
    return zzb(localzzaaq2.zzuo()).equals(localzzaaq2);
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public final zzaaq zzc(zzaaq paramzzaaq)
  {
    zzaaq localzzaaq = this.zzbvf;
    this.zzbve = null;
    this.zzbvg = null;
    this.zzbvf = paramzzaaq;
    return localzzaaq;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */