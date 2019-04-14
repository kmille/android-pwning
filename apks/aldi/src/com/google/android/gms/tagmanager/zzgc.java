package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class zzgc
  implements ComponentCallbacks2
{
  zzgc(TagManager paramTagManager) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if (paramInt == 20) {
      this.zzbeo.dispatch();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */