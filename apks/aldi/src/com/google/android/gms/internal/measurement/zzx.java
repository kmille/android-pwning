package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import com.google.android.gms.analytics.zzi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzx
  extends zzi<zzx>
{
  private Map<Integer, Double> zzts = new HashMap(4);
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.zzts.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = String.valueOf(localEntry.getKey());
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 6);
      localStringBuilder.append("metric");
      localStringBuilder.append(str);
      localHashMap.put(localStringBuilder.toString(), localEntry.getValue());
    }
    return zza(localHashMap);
  }
  
  public final Map<Integer, Double> zzar()
  {
    return Collections.unmodifiableMap(this.zzts);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */