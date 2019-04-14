package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzm;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzbq
{
  private final Set<String> zzbae;
  private final String zzqc;
  
  public zzbq(String paramString, String... paramVarArgs)
  {
    this.zzqc = paramString;
    this.zzbae = new HashSet(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      paramString = paramVarArgs[i];
      this.zzbae.add(paramString);
      i += 1;
    }
  }
  
  final boolean zza(Set<String> paramSet)
  {
    return paramSet.containsAll(this.zzbae);
  }
  
  public abstract zzm zze(Map<String, zzm> paramMap);
  
  public abstract boolean zzmj();
  
  public String zzns()
  {
    return this.zzqc;
  }
  
  public Set<String> zznt()
  {
    return this.zzbae;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */