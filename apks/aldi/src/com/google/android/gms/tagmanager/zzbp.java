package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

@VisibleForTesting
final class zzbp
  extends zzbq
{
  private static final String ID = zza.zzr.toString();
  private final zzfb zzaxo;
  
  public zzbp(zzfb paramzzfb)
  {
    super(ID, new String[0]);
    this.zzaxo = paramzzfb;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    paramMap = this.zzaxo.zzor();
    if (paramMap == null) {
      return zzgj.zzpo();
    }
    return zzgj.zzj(paramMap);
  }
  
  public final boolean zzmj()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */