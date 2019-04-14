package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzwg;
import com.google.android.gms.internal.measurement.zzwk;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzfe
  implements zzfg
{
  zzfe(zzfb paramzzfb, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4) {}
  
  public final void zza(zzwk paramzzwk, Set<zzwg> paramSet1, Set<zzwg> paramSet2, zzeq paramzzeq)
  {
    List localList = (List)this.zzbdi.get(paramzzwk);
    this.zzbdj.get(paramzzwk);
    if (localList != null)
    {
      paramSet1.addAll(localList);
      paramzzeq.zzoa();
    }
    paramSet1 = (List)this.zzbdk.get(paramzzwk);
    this.zzbdl.get(paramzzwk);
    if (paramSet1 != null)
    {
      paramSet2.addAll(paramSet1);
      paramzzeq.zzob();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */