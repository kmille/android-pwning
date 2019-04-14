package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

abstract class zzdy
  extends zzef
{
  public zzdy(String paramString)
  {
    super(paramString);
  }
  
  protected final boolean zza(zzm paramzzm1, zzm paramzzm2, Map<String, zzm> paramMap)
  {
    paramzzm1 = zzgj.zzd(paramzzm1);
    paramzzm2 = zzgj.zzd(paramzzm2);
    if ((paramzzm1 != zzgj.zzpm()) && (paramzzm2 != zzgj.zzpm())) {
      return zza(paramzzm1, paramzzm2, paramMap);
    }
    return false;
  }
  
  protected abstract boolean zza(zzgi paramzzgi1, zzgi paramzzgi2, Map<String, zzm> paramMap);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */