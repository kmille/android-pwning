package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public final class zzwh
{
  private zzm zzbdn;
  private final Map<String, zzm> zzbmv = new HashMap();
  
  public final zzwh zzb(String paramString, zzm paramzzm)
  {
    this.zzbmv.put(paramString, paramzzm);
    return this;
  }
  
  public final zzwh zzm(zzm paramzzm)
  {
    this.zzbdn = paramzzm;
    return this;
  }
  
  public final zzwg zzry()
  {
    return new zzwg(this.zzbmv, this.zzbdn, null);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */