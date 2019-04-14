package de.eplus.mappecc.client.android.common.network.box7.performance;

import android.support.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

public class PerformanceTimingFlow
{
  private final PerformanceTimingKey performanceTimingKey;
  private Map<String, String> propertyMap = new HashMap();
  
  public PerformanceTimingFlow(@NonNull PerformanceTimingKey paramPerformanceTimingKey)
  {
    this.performanceTimingKey = paramPerformanceTimingKey;
  }
  
  public PerformanceTimingFlow addProperty(@NonNull String paramString1, String paramString2)
  {
    this.propertyMap.put(paramString1, paramString2);
    return this;
  }
  
  public PerformanceTimingKey getPerformanceTimingKey()
  {
    return this.performanceTimingKey;
  }
  
  public Map<String, String> getPropertyMap()
  {
    return this.propertyMap;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/performance/PerformanceTimingFlow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */