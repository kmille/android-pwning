package de.eplus.mappecc.client.android.common.network.box7.performance;

import android.support.annotation.NonNull;

public abstract interface IPerformanceTimingManager
{
  public abstract void finish(int paramInt);
  
  public abstract void finishUserInteraction();
  
  public abstract void startUserInteraction(@NonNull PerformanceTimingFlow paramPerformanceTimingFlow);
  
  public abstract void startUserInteraction(@NonNull PerformanceTimingKey paramPerformanceTimingKey);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/performance/IPerformanceTimingManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */