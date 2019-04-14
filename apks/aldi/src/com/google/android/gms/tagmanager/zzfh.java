package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzacj;
import com.google.android.gms.internal.measurement.zzm;

final class zzfh
{
  private zzdz<zzm> zzbdm;
  private zzm zzbdn;
  
  public zzfh(zzdz<zzm> paramzzdz, zzm paramzzm)
  {
    this.zzbdm = paramzzdz;
    this.zzbdn = paramzzm;
  }
  
  public final int getSize()
  {
    int j = ((zzm)this.zzbdm.getObject()).zzwa();
    int i;
    if (this.zzbdn == null) {
      i = 0;
    } else {
      i = this.zzbdn.zzwa();
    }
    return j + i;
  }
  
  public final zzdz<zzm> zzot()
  {
    return this.zzbdm;
  }
  
  public final zzm zzou()
  {
    return this.zzbdn;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */