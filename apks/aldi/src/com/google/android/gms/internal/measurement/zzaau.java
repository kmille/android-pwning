package com.google.android.gms.internal.measurement;

final class zzaau<T>
  implements zzaba<T>
{
  private final zzaaq zzbvr;
  private final zzabo<?, ?> zzbvs;
  private final boolean zzbvt;
  private final zzzo<?> zzbvu;
  
  private zzaau(zzabo<?, ?> paramzzabo, zzzo<?> paramzzzo, zzaaq paramzzaaq)
  {
    this.zzbvs = paramzzabo;
    this.zzbvt = paramzzzo.zza(paramzzaaq);
    this.zzbvu = paramzzzo;
    this.zzbvr = paramzzaaq;
  }
  
  static <T> zzaau<T> zza(zzabo<?, ?> paramzzabo, zzzo<?> paramzzzo, zzaaq paramzzaaq)
  {
    return new zzaau(paramzzabo, paramzzzo, paramzzaaq);
  }
  
  public final boolean equals(T paramT1, T paramT2)
  {
    if (!this.zzbvs.zzu(paramT1).equals(this.zzbvs.zzu(paramT2))) {
      return false;
    }
    if (this.zzbvt) {
      return this.zzbvu.zzs(paramT1).equals(this.zzbvu.zzs(paramT2));
    }
    return true;
  }
  
  public final int hashCode(T paramT)
  {
    int j = this.zzbvs.zzu(paramT).hashCode();
    int i = j;
    if (this.zzbvt) {
      i = j * 53 + this.zzbvu.zzs(paramT).hashCode();
    }
    return i;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */