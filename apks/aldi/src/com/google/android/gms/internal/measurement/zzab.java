package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzab
  extends zzi<zzab>
{
  private String category;
  private String label;
  private long value;
  private String zztz;
  
  public final String getAction()
  {
    return this.zztz;
  }
  
  public final String getLabel()
  {
    return this.label;
  }
  
  public final long getValue()
  {
    return this.value;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("category", this.category);
    localHashMap.put("action", this.zztz);
    localHashMap.put("label", this.label);
    localHashMap.put("value", Long.valueOf(this.value));
    return zza(localHashMap);
  }
  
  public final String zzax()
  {
    return this.category;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */