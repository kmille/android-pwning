package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzl;

final class zzae
  implements zzdh<zzl>
{
  private zzae(zzy paramzzy) {}
  
  public final void zzmw() {}
  
  public final void zzq(int paramInt)
  {
    if (paramInt == zzcz.zzbbe) {
      zzy.zzc(this.zzayp).zzna();
    }
    synchronized (this.zzayp)
    {
      if (!this.zzayp.isReady())
      {
        zzy localzzy1;
        if (zzy.zzb(this.zzayp) != null) {
          localzzy1 = this.zzayp;
        }
        for (Object localObject2 = zzy.zzb(this.zzayp);; localObject2 = this.zzayp.a_(Status.RESULT_TIMEOUT))
        {
          localzzy1.setResult((Result)localObject2);
          break;
          localzzy1 = this.zzayp;
        }
      }
      long l = zzy.zzc(this.zzayp).zzmz();
      zzy.zza(this.zzayp, l);
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */