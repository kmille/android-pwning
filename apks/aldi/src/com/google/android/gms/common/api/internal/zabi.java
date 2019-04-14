package com.google.android.gms.common.api.internal;

import android.os.Handler;

final class zabi
  implements BackgroundDetector.BackgroundStateChangeListener
{
  zabi(GoogleApiManager paramGoogleApiManager) {}
  
  public final void onBackgroundStateChanged(boolean paramBoolean)
  {
    GoogleApiManager.zaa(this.zail).sendMessage(GoogleApiManager.zaa(this.zail).obtainMessage(1, Boolean.valueOf(paramBoolean)));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */