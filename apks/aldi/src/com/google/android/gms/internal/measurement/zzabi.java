package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzabi
  implements Comparable<zzabi>, Map.Entry<K, V>
{
  private V value;
  private final K zzbwl;
  
  zzabi(K paramK, V paramV)
  {
    this.zzbwl = paramV;
    Object localObject;
    this.value = localObject;
  }
  
  zzabi(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
  }
  
  private static boolean equals(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    return (equals(this.zzbwl, ((Map.Entry)paramObject).getKey())) && (equals(this.value, ((Map.Entry)paramObject).getValue()));
  }
  
  public final V getValue()
  {
    return (V)this.value;
  }
  
  public final int hashCode()
  {
    Comparable localComparable = this.zzbwl;
    int j = 0;
    int i;
    if (localComparable == null) {
      i = 0;
    } else {
      i = this.zzbwl.hashCode();
    }
    if (this.value != null) {
      j = this.value.hashCode();
    }
    return i ^ j;
  }
  
  public final V setValue(V paramV)
  {
    zzabd.zza(this.zzbwm);
    Object localObject = this.value;
    this.value = paramV;
    return (V)localObject;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.zzbwl);
    String str2 = String.valueOf(this.value);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
    localStringBuilder.append(str1);
    localStringBuilder.append("=");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */