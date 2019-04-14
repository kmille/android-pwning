package com.google.android.gms.tagmanager;

import java.util.Map;

final class zzga
  implements DataLayer.zzb
{
  zzga(TagManager paramTagManager) {}
  
  public final void zzf(Map<String, Object> paramMap)
  {
    paramMap = paramMap.get("event");
    if (paramMap != null) {
      TagManager.zza(this.zzbeo, paramMap.toString());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */