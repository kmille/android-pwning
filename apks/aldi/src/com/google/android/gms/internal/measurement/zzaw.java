package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzaw
{
  private final Map<String, String> zzsm;
  private final String zzud;
  private final long zzwg;
  private final String zzwh;
  private final boolean zzwi;
  private long zzwj;
  
  public zzaw(long paramLong1, String paramString1, String paramString2, boolean paramBoolean, long paramLong2, Map<String, String> paramMap)
  {
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString2);
    this.zzwg = 0L;
    this.zzud = paramString1;
    this.zzwh = paramString2;
    this.zzwi = paramBoolean;
    this.zzwj = paramLong2;
    if (paramMap != null) {}
    for (paramString1 = new HashMap(paramMap);; paramString1 = Collections.emptyMap())
    {
      this.zzsm = paramString1;
      return;
    }
  }
  
  public final String zzaz()
  {
    return this.zzud;
  }
  
  public final void zzb(long paramLong)
  {
    this.zzwj = paramLong;
  }
  
  public final long zzco()
  {
    return this.zzwg;
  }
  
  public final String zzcp()
  {
    return this.zzwh;
  }
  
  public final boolean zzcq()
  {
    return this.zzwi;
  }
  
  public final long zzcr()
  {
    return this.zzwj;
  }
  
  public final Map<String, String> zzcs()
  {
    return this.zzsm;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */