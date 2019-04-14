package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

final class zzgl
  extends zzbq
{
  private static final String ID = zza.zzas.toString();
  private static final String zzbaa = zzb.zzef.toString();
  
  public zzgl()
  {
    super(ID, new String[] { zzbaa });
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    return zzgj.zzj(zzgj.zzc((zzm)paramMap.get(zzbaa)).toUpperCase());
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */