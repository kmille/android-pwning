package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zze
  extends zzbq
{
  private static final String ID = com.google.android.gms.internal.measurement.zza.zza.toString();
  private final zza zzaxd;
  
  public zze(Context paramContext)
  {
    this(zza.zzh(paramContext));
  }
  
  @VisibleForTesting
  private zze(zza paramzza)
  {
    super(ID, new String[0]);
    this.zzaxd = paramzza;
    this.zzaxd.zzmd();
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    paramMap = this.zzaxd.zzmd();
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */