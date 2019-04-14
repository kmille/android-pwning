package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzag
  extends zzi<zzag>
{
  public String mCategory;
  public String zzuu;
  public long zzuv;
  public String zzuw;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("variableName", this.zzuu);
    localHashMap.put("timeInMillis", Long.valueOf(this.zzuv));
    localHashMap.put("category", this.mCategory);
    localHashMap.put("label", this.zzuw);
    return zza(localHashMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */