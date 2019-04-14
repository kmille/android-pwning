package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@VisibleForTesting
public abstract class zzef
  extends zzbq
{
  private static final String zzbaa = zzb.zzef.toString();
  private static final String zzbbw = zzb.zzeg.toString();
  
  public zzef(String paramString)
  {
    super(paramString, new String[] { zzbaa, zzbbw });
  }
  
  protected abstract boolean zza(zzm paramzzm1, zzm paramzzm2, Map<String, zzm> paramMap);
  
  public final zzm zze(Map<String, zzm> paramMap)
  {
    Object localObject = paramMap.values().iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while ((zzm)((Iterator)localObject).next() != zzgj.zzpo());
    boolean bool;
    for (paramMap = Boolean.FALSE;; paramMap = Boolean.valueOf(bool))
    {
      return zzgj.zzj(paramMap);
      localObject = (zzm)paramMap.get(zzbaa);
      zzm localzzm = (zzm)paramMap.get(zzbbw);
      if ((localObject != null) && (localzzm != null)) {
        bool = zza((zzm)localObject, localzzm, paramMap);
      } else {
        bool = false;
      }
    }
  }
  
  public final boolean zzmj()
  {
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */