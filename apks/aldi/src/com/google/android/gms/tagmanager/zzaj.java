package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

@VisibleForTesting
final class zzaj
  extends zzbq
{
  private static final String ID = zza.zzj.toString();
  private final String version;
  
  public zzaj(String paramString)
  {
    super(ID, new String[0]);
    this.version = paramString;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    if (this.version == null) {
      return zzgj.zzpo();
    }
    return zzgj.zzj(this.version);
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */