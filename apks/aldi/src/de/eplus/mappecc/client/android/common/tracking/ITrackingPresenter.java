package de.eplus.mappecc.client.android.common.tracking;

import android.support.annotation.NonNull;
import java.util.Map;

public abstract interface ITrackingPresenter
{
  @NonNull
  public abstract Map<String, Object> getTrackingData();
  
  @NonNull
  public abstract TrackingScreen getTrackingScreen();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/tracking/ITrackingPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */