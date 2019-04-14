package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzei
  extends zzbq
{
  private static final String ID = zza.zzz.toString();
  private static final String zzbcf = zzb.zzji.toString();
  private static final String zzbcg = zzb.zzjg.toString();
  
  public zzei()
  {
    super(ID, new String[0]);
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject = (zzm)paramMap.get(zzbcf);
    paramMap = (zzm)paramMap.get(zzbcg);
    if ((localObject != null) && (localObject != zzgj.zzpo()) && (paramMap != null) && (paramMap != zzgj.zzpo()))
    {
      localObject = zzgj.zzd((zzm)localObject);
      paramMap = zzgj.zzd(paramMap);
      if ((localObject != zzgj.zzpm()) && (paramMap != zzgj.zzpm()))
      {
        d1 = ((zzgi)localObject).doubleValue();
        d2 = paramMap.doubleValue();
        if (d1 <= d2) {
          break label107;
        }
      }
    }
    double d1 = 0.0D;
    double d2 = 2.147483647E9D;
    label107:
    return zzgj.zzj(Long.valueOf(Math.round(Math.random() * (d2 - d1) + d1)));
  }
  
  public final boolean zzmj()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */