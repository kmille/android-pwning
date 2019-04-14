package com.bumptech.glide.util;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;

public final class CachedHashCodeArrayMap<K, V>
  extends ArrayMap<K, V>
{
  private int hashCode;
  
  public final void clear()
  {
    this.hashCode = 0;
    super.clear();
  }
  
  public final int hashCode()
  {
    if (this.hashCode == 0) {
      this.hashCode = super.hashCode();
    }
    return this.hashCode;
  }
  
  public final V put(K paramK, V paramV)
  {
    this.hashCode = 0;
    return (V)super.put(paramK, paramV);
  }
  
  public final void putAll(SimpleArrayMap<? extends K, ? extends V> paramSimpleArrayMap)
  {
    this.hashCode = 0;
    super.putAll(paramSimpleArrayMap);
  }
  
  public final V removeAt(int paramInt)
  {
    this.hashCode = 0;
    return (V)super.removeAt(paramInt);
  }
  
  public final V setValueAt(int paramInt, V paramV)
  {
    this.hashCode = 0;
    return (V)super.setValueAt(paramInt, paramV);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/CachedHashCodeArrayMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */