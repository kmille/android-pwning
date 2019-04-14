package com.google.android.gms.tagmanager;

import android.util.LruCache;

final class zzdc
  extends LruCache<K, V>
{
  zzdc(zzdb paramzzdb, int paramInt, zzs paramzzs)
  {
    super(paramInt);
  }
  
  protected final int sizeOf(K paramK, V paramV)
  {
    return this.zzbbh.sizeOf(paramK, paramV);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */