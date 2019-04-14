package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzwg;
import com.google.android.gms.internal.measurement.zzwk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzfi
{
  private final Set<zzwk> zzbde = new HashSet();
  private final Map<zzwk, List<zzwg>> zzbdo = new HashMap();
  private final Map<zzwk, List<zzwg>> zzbdp = new HashMap();
  private final Map<zzwk, List<String>> zzbdq = new HashMap();
  private final Map<zzwk, List<String>> zzbdr = new HashMap();
  private zzwg zzbds;
  
  public final void zza(zzwk paramzzwk)
  {
    this.zzbde.add(paramzzwk);
  }
  
  public final void zza(zzwk paramzzwk, zzwg paramzzwg)
  {
    List localList = (List)this.zzbdo.get(paramzzwk);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this.zzbdo.put(paramzzwk, localObject);
    }
    ((List)localObject).add(paramzzwg);
  }
  
  public final void zza(zzwk paramzzwk, String paramString)
  {
    List localList = (List)this.zzbdq.get(paramzzwk);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this.zzbdq.put(paramzzwk, localObject);
    }
    ((List)localObject).add(paramString);
  }
  
  public final void zzb(zzwg paramzzwg)
  {
    this.zzbds = paramzzwg;
  }
  
  public final void zzb(zzwk paramzzwk, zzwg paramzzwg)
  {
    List localList = (List)this.zzbdp.get(paramzzwk);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this.zzbdp.put(paramzzwk, localObject);
    }
    ((List)localObject).add(paramzzwg);
  }
  
  public final void zzb(zzwk paramzzwk, String paramString)
  {
    List localList = (List)this.zzbdr.get(paramzzwk);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this.zzbdr.put(paramzzwk, localObject);
    }
    ((List)localObject).add(paramString);
  }
  
  public final Set<zzwk> zzov()
  {
    return this.zzbde;
  }
  
  public final Map<zzwk, List<zzwg>> zzow()
  {
    return this.zzbdo;
  }
  
  public final Map<zzwk, List<String>> zzox()
  {
    return this.zzbdq;
  }
  
  public final Map<zzwk, List<String>> zzoy()
  {
    return this.zzbdr;
  }
  
  public final Map<zzwk, List<zzwg>> zzoz()
  {
    return this.zzbdp;
  }
  
  public final zzwg zzpa()
  {
    return this.zzbds;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */