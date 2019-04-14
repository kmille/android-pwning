package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;

@TargetApi(12)
final class zzdb<K, V>
  implements zzp<K, V>
{
  private LruCache<K, V> zzbbg;
  
  zzdb(int paramInt, zzs<K, V> paramzzs)
  {
    this.zzbbg = new zzdc(this, 1048576, paramzzs);
  }
  
  public final V get(K paramK)
  {
    return (V)this.zzbbg.get(paramK);
  }
  
  public final void zza(K paramK, V paramV)
  {
    this.zzbbg.put(paramK, paramV);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzdb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */