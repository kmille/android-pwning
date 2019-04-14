package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@VisibleForTesting
public final class zzwi
{
  private final String version;
  private final List<zzwk> zzbmt;
  private final Map<String, List<zzwg>> zzbmu;
  private final int zzow;
  
  private zzwi(List<zzwk> paramList, Map<String, List<zzwg>> paramMap, String paramString, int paramInt)
  {
    this.zzbmt = Collections.unmodifiableList(paramList);
    this.zzbmu = Collections.unmodifiableMap(paramMap);
    this.version = paramString;
    this.zzow = paramInt;
  }
  
  public static zzwj zzrz()
  {
    return new zzwj(null);
  }
  
  public final String getVersion()
  {
    return this.version;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.zzbmt);
    String str2 = String.valueOf(this.zzbmu);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 17 + String.valueOf(str2).length());
    localStringBuilder.append("Rules: ");
    localStringBuilder.append(str1);
    localStringBuilder.append("  Macros: ");
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final List<zzwk> zzre()
  {
    return this.zzbmt;
  }
  
  public final Map<String, List<zzwg>> zzsa()
  {
    return this.zzbmu;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */