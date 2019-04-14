package com.google.common.cache;

import com.google.common.base.j;
import java.util.AbstractMap.SimpleImmutableEntry;
import javax.annotation.Nullable;

public final class c<K, V>
  extends AbstractMap.SimpleImmutableEntry<K, V>
{
  private final b a;
  
  private c(@Nullable K paramK, @Nullable V paramV, b paramb)
  {
    super(paramK, paramV);
    this.a = ((b)j.a(paramb));
  }
  
  public static <K, V> c<K, V> a(@Nullable K paramK, @Nullable V paramV, b paramb)
  {
    return new c(paramK, paramV, paramb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/cache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */