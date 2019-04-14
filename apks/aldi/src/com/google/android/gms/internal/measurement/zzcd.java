package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzcd<V>
{
  private final V zzaaa;
  private final GservicesValue<V> zzaab;
  
  private zzcd(GservicesValue<V> paramGservicesValue, V paramV)
  {
    Preconditions.checkNotNull(paramGservicesValue);
    this.zzaab = paramGservicesValue;
    this.zzaaa = paramV;
  }
  
  static zzcd<Float> zza(String paramString, float paramFloat1, float paramFloat2)
  {
    return new zzcd(GservicesValue.value(paramString, Float.valueOf(0.5F)), Float.valueOf(0.5F));
  }
  
  static zzcd<Integer> zza(String paramString, int paramInt1, int paramInt2)
  {
    return new zzcd(GservicesValue.value(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
  }
  
  static zzcd<Long> zza(String paramString, long paramLong1, long paramLong2)
  {
    return new zzcd(GservicesValue.value(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
  }
  
  static zzcd<String> zza(String paramString1, String paramString2, String paramString3)
  {
    return new zzcd(GservicesValue.value(paramString1, paramString3), paramString2);
  }
  
  static zzcd<Boolean> zza(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new zzcd(GservicesValue.value(paramString, paramBoolean2), Boolean.valueOf(paramBoolean1));
  }
  
  public final V get()
  {
    return (V)this.zzaaa;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */