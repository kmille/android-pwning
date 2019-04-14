package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;

final class zaf
  implements BaseGmsClient.BaseConnectionCallbacks
{
  zaf(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks) {}
  
  public final void onConnected(@Nullable Bundle paramBundle)
  {
    this.zaoi.onConnected(paramBundle);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.zaoi.onConnectionSuspended(paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */