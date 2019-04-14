package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzwk
{
  private final List<zzwg> zzbmx;
  private final List<zzwg> zzbmy;
  private final List<zzwg> zzbmz;
  private final List<zzwg> zzbna;
  private final List<zzwg> zzbod;
  private final List<zzwg> zzboe;
  private final List<String> zzbof;
  private final List<String> zzbog;
  private final List<String> zzboh;
  private final List<String> zzboi;
  
  private zzwk(List<zzwg> paramList1, List<zzwg> paramList2, List<zzwg> paramList3, List<zzwg> paramList4, List<zzwg> paramList5, List<zzwg> paramList6, List<String> paramList7, List<String> paramList8, List<String> paramList9, List<String> paramList10)
  {
    this.zzbmx = Collections.unmodifiableList(paramList1);
    this.zzbmy = Collections.unmodifiableList(paramList2);
    this.zzbmz = Collections.unmodifiableList(paramList3);
    this.zzbna = Collections.unmodifiableList(paramList4);
    this.zzbod = Collections.unmodifiableList(paramList5);
    this.zzboe = Collections.unmodifiableList(paramList6);
    this.zzbof = Collections.unmodifiableList(paramList7);
    this.zzbog = Collections.unmodifiableList(paramList8);
    this.zzboh = Collections.unmodifiableList(paramList9);
    this.zzboi = Collections.unmodifiableList(paramList10);
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.zzbmx);
    String str2 = String.valueOf(this.zzbmy);
    String str3 = String.valueOf(this.zzbmz);
    String str4 = String.valueOf(this.zzbna);
    String str5 = String.valueOf(this.zzbod);
    String str6 = String.valueOf(this.zzboe);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 102 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
    localStringBuilder.append("Positive predicates: ");
    localStringBuilder.append(str1);
    localStringBuilder.append("  Negative predicates: ");
    localStringBuilder.append(str2);
    localStringBuilder.append("  Add tags: ");
    localStringBuilder.append(str3);
    localStringBuilder.append("  Remove tags: ");
    localStringBuilder.append(str4);
    localStringBuilder.append("  Add macros: ");
    localStringBuilder.append(str5);
    localStringBuilder.append("  Remove macros: ");
    localStringBuilder.append(str6);
    return localStringBuilder.toString();
  }
  
  public final List<zzwg> zzri()
  {
    return this.zzbmx;
  }
  
  public final List<zzwg> zzrj()
  {
    return this.zzbmy;
  }
  
  public final List<zzwg> zzrk()
  {
    return this.zzbmz;
  }
  
  public final List<zzwg> zzrl()
  {
    return this.zzbna;
  }
  
  public final List<zzwg> zzsc()
  {
    return this.zzbod;
  }
  
  public final List<zzwg> zzsd()
  {
    return this.zzboe;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */