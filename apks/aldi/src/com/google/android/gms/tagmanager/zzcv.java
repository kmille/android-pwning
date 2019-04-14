package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzcv
  extends zzbq
{
  private static final String ID = zza.zzam.toString();
  private static final String zzaxe = zzb.zzfi.toString();
  private final Context zzqx;
  
  public zzcv(Context paramContext)
  {
    super(ID, new String[0]);
    this.zzqx = paramContext;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    if ((zzm)paramMap.get(zzaxe) != null) {
      paramMap = zzgj.zzc((zzm)paramMap.get(zzaxe));
    } else {
      paramMap = null;
    }
    paramMap = zzcw.zzg(this.zzqx, paramMap);
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzcv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */