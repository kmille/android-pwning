package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzaz
  extends zzgh
{
  private static final String ID = zza.zzaq.toString();
  private static final String VALUE = zzb.zznh.toString();
  private static final String zzazq = zzb.zzfd.toString();
  private final DataLayer zzaxn;
  
  public zzaz(DataLayer paramDataLayer)
  {
    super(ID, new String[] { VALUE });
    this.zzaxn = paramDataLayer;
  }
  
  public final void zzg(Map<String, zzm> paramMap)
  {
    Object localObject1 = (zzm)paramMap.get(VALUE);
    if ((localObject1 != null) && (localObject1 != zzgj.zzpi()))
    {
      localObject1 = zzgj.zzh((zzm)localObject1);
      if ((localObject1 instanceof List))
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          if ((localObject2 instanceof Map))
          {
            localObject2 = (Map)localObject2;
            this.zzaxn.push((Map)localObject2);
          }
        }
      }
    }
    paramMap = (zzm)paramMap.get(zzazq);
    if (paramMap != null)
    {
      if (paramMap == zzgj.zzpi()) {
        return;
      }
      paramMap = zzgj.zzc(paramMap);
      if (paramMap != zzgj.zzpn()) {
        this.zzaxn.zzcu(paramMap);
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */