package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

public final class zzwg
{
  private final zzm zzbdn;
  private final Map<String, zzm> zzbmv;
  
  private zzwg(Map<String, zzm> paramMap, zzm paramzzm)
  {
    this.zzbmv = paramMap;
    this.zzbdn = paramzzm;
  }
  
  public static zzwh zzrx()
  {
    return new zzwh(null);
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(Collections.unmodifiableMap(this.zzbmv));
    String str2 = String.valueOf(this.zzbdn);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 32 + String.valueOf(str2).length());
    localStringBuilder.append("Properties: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" pushAfterEvaluate: ");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final void zza(String paramString, zzm paramzzm)
  {
    this.zzbmv.put(paramString, paramzzm);
  }
  
  public final zzm zzou()
  {
    return this.zzbdn;
  }
  
  public final Map<String, zzm> zzrg()
  {
    return Collections.unmodifiableMap(this.zzbmv);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */