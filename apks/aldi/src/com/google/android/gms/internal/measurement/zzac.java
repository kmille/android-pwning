package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzac
  extends zzi<zzac>
{
  public String zzua;
  public boolean zzub;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("description", this.zzua);
    localHashMap.put("fatal", Boolean.valueOf(this.zzub));
    return zza(localHashMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */