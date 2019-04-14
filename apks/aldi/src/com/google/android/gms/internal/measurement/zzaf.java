package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzaf
  extends zzi<zzaf>
{
  public String zzur;
  public String zzus;
  public String zzut;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("network", this.zzur);
    localHashMap.put("action", this.zzus);
    localHashMap.put("target", this.zzut);
    return zza(localHashMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */