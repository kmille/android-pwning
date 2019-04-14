package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
final class zzam
  extends zzbq
{
  private static final String ID = zza.zzs.toString();
  private static final String zzaxg = zzb.zzds.toString();
  private static final String zzayu = zzb.zzia.toString();
  private final zzan zzayv;
  
  public zzam(zzan paramzzan)
  {
    super(ID, new String[] { zzayu });
    this.zzayv = paramzzan;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    String str = zzgj.zzc((zzm)paramMap.get(zzayu));
    Object localObject = new HashMap();
    paramMap = (zzm)paramMap.get(zzaxg);
    if (paramMap != null)
    {
      paramMap = zzgj.zzh(paramMap);
      if (!(paramMap instanceof Map)) {
        paramMap = "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.";
      }
    }
    for (;;)
    {
      zzdi.zzab(paramMap);
      return zzgj.zzpo();
      paramMap = ((Map)paramMap).entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        ((Map)localObject).put(localEntry.getKey().toString(), localEntry.getValue());
      }
      try
      {
        paramMap = zzgj.zzj(this.zzayv.zza(str, (Map)localObject));
        return paramMap;
      }
      catch (Exception paramMap)
      {
        paramMap = paramMap.getMessage();
        localObject = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(paramMap).length());
        ((StringBuilder)localObject).append("Custom macro/tag ");
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(" threw exception ");
        ((StringBuilder)localObject).append(paramMap);
        paramMap = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  public final boolean zzmj()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */