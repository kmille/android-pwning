package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Locale;
import java.util.Map;

@VisibleForTesting
public final class zzdd
  extends zzbq
{
  private static final String ID = zza.zzv.toString();
  
  public zzdd()
  {
    super(ID, new String[0]);
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    paramMap = Locale.getDefault();
    if (paramMap == null) {
      return zzgj.zzpo();
    }
    paramMap = paramMap.getLanguage();
    if (paramMap == null) {
      return zzgj.zzpo();
    }
    return zzgj.zzj(paramMap.toLowerCase());
  }
  
  public final boolean zzmj()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */