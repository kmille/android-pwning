package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Map;

@VisibleForTesting
final class zzas
  extends zzbq
{
  private static final String ID = zza.zzi.toString();
  private static final String NAME = zzb.zzjk.toString();
  private static final String zzazf = zzb.zzgp.toString();
  private final DataLayer zzaxn;
  
  public zzas(DataLayer paramDataLayer)
  {
    super(ID, new String[] { NAME });
    this.zzaxn = paramDataLayer;
  }
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject = this.zzaxn.get(zzgj.zzc((zzm)paramMap.get(NAME)));
    if (localObject == null)
    {
      paramMap = (zzm)paramMap.get(zzazf);
      if (paramMap != null) {
        return paramMap;
      }
      return zzgj.zzpo();
    }
    return zzgj.zzj(localObject);
  }
  
  public final boolean zzmj()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */