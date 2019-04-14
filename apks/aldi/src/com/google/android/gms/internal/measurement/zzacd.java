package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzacd<M extends zzacd<M>>
  extends zzacj
{
  protected zzacf zzbzd;
  
  protected int zza()
  {
    zzacf localzzacf = this.zzbzd;
    int j = 0;
    if (localzzacf != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= this.zzbzd.size()) {
          break;
        }
        i += this.zzbzd.zzau(j).zza();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
  
  public final <T> T zza(zzace<M, T> paramzzace)
  {
    if (this.zzbzd == null) {
      return null;
    }
    zzacg localzzacg = this.zzbzd.zzat(paramzzace.tag >>> 3);
    if (localzzacg == null) {
      return null;
    }
    return (T)localzzacg.zzb(paramzzace);
  }
  
  public void zza(zzacb paramzzacb)
    throws IOException
  {
    if (this.zzbzd == null) {
      return;
    }
    int i = 0;
    while (i < this.zzbzd.size())
    {
      this.zzbzd.zzau(i).zza(paramzzacb);
      i += 1;
    }
  }
  
  protected final boolean zza(zzaca paramzzaca, int paramInt)
    throws IOException
  {
    int i = paramzzaca.getPosition();
    if (!paramzzaca.zzak(paramInt)) {
      return false;
    }
    int j = paramInt >>> 3;
    zzacl localzzacl = new zzacl(paramInt, paramzzaca.zzc(i, paramzzaca.getPosition() - i));
    paramzzaca = null;
    if (this.zzbzd == null) {
      this.zzbzd = new zzacf();
    } else {
      paramzzaca = this.zzbzd.zzat(j);
    }
    Object localObject = paramzzaca;
    if (paramzzaca == null)
    {
      localObject = new zzacg();
      this.zzbzd.zza(j, (zzacg)localObject);
    }
    ((zzacg)localObject).zza(localzzacl);
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */