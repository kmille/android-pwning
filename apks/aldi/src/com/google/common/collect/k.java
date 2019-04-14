package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.Nullable;

class k<K, V>
  extends b<K, V>
  implements Serializable
{
  final K g;
  final V h;
  
  k(@Nullable K paramK, @Nullable V paramV)
  {
    this.g = paramK;
    this.h = paramV;
  }
  
  @Nullable
  public final K getKey()
  {
    return (K)this.g;
  }
  
  @Nullable
  public final V getValue()
  {
    return (V)this.h;
  }
  
  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */