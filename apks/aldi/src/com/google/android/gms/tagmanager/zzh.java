package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzh
  extends zzbq
{
  private static final String ID = zza.zzah.toString();
  private static final String zzaxe = zzb.zzfi.toString();
  private static final String zzaxf = zzb.zzfl.toString();
  private final Context zzqx;
  
  public zzh(Context paramContext)
  {
    super(ID, new String[] { zzaxf });
    this.zzqx = paramContext;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject = (zzm)paramMap.get(zzaxf);
    if (localObject == null) {
      return zzgj.zzpo();
    }
    String str2 = zzgj.zzc((zzm)localObject);
    paramMap = (zzm)paramMap.get(zzaxe);
    if (paramMap != null) {
      localObject = zzgj.zzc(paramMap);
    } else {
      localObject = null;
    }
    Context localContext = this.zzqx;
    String str1 = (String)zzcw.zzbas.get(str2);
    paramMap = str1;
    if (str1 == null)
    {
      paramMap = localContext.getSharedPreferences("gtm_click_referrers", 0);
      if (paramMap != null) {}
      for (paramMap = paramMap.getString(str2, "");; paramMap = "") {
        break;
      }
      zzcw.zzbas.put(str2, paramMap);
    }
    paramMap = zzcw.zzt(paramMap, (String)localObject);
    if (paramMap != null) {
      return zzgj.zzj(paramMap);
    }
    return zzgj.zzpo();
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */