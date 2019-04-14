package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzaab<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, zzzz> zzbvb;
  
  private zzaab(Map.Entry<K, zzzz> paramEntry)
  {
    this.zzbvb = paramEntry;
  }
  
  public final K getKey()
  {
    return (K)this.zzbvb.getKey();
  }
  
  public final Object getValue()
  {
    if ((zzzz)this.zzbvb.getValue() == null) {
      return null;
    }
    return zzzz.zzud();
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof zzaaq)) {
      return ((zzzz)this.zzbvb.getValue()).zzc((zzaaq)paramObject);
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */