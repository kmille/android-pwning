package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tagmanager.zzgj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@VisibleForTesting
public final class zzwj
{
  private String version = "";
  private final List<zzwk> zzbmt = new ArrayList();
  private final Map<String, List<zzwg>> zzbmu = new HashMap();
  private int zzow = 0;
  
  public final zzwj zzad(int paramInt)
  {
    this.zzow = paramInt;
    return this;
  }
  
  public final zzwj zzb(zzwk paramzzwk)
  {
    this.zzbmt.add(paramzzwk);
    return this;
  }
  
  public final zzwj zzc(zzwg paramzzwg)
  {
    String str = zzgj.zzc((zzm)paramzzwg.zzrg().get(zzb.zzil.toString()));
    List localList = (List)this.zzbmu.get(str);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this.zzbmu.put(str, localObject);
    }
    ((List)localObject).add(paramzzwg);
    return this;
  }
  
  public final zzwj zzev(String paramString)
  {
    this.version = paramString;
    return this;
  }
  
  public final zzwi zzsb()
  {
    return new zzwi(this.zzbmt, this.zzbmu, this.version, this.zzow, null);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */