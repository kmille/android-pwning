package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzad
  extends zzi<zzad>
{
  private String zzuc;
  private String zzud;
  private String zzue;
  private String zzuf;
  private boolean zzug;
  private String zzuh;
  private boolean zzui;
  private double zzuj;
  
  public final void setClientId(String paramString)
  {
    this.zzud = paramString;
  }
  
  public final void setUserId(String paramString)
  {
    this.zzue = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hitType", this.zzuc);
    localHashMap.put("clientId", this.zzud);
    localHashMap.put("userId", this.zzue);
    localHashMap.put("androidAdId", this.zzuf);
    localHashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zzug));
    localHashMap.put("sessionControl", this.zzuh);
    localHashMap.put("nonInteraction", Boolean.valueOf(this.zzui));
    localHashMap.put("sampleRate", Double.valueOf(this.zzuj));
    return zza(localHashMap);
  }
  
  public final void zza(boolean paramBoolean)
  {
    this.zzug = paramBoolean;
  }
  
  public final String zzay()
  {
    return this.zzuc;
  }
  
  public final String zzaz()
  {
    return this.zzud;
  }
  
  public final void zzb(boolean paramBoolean)
  {
    this.zzui = true;
  }
  
  public final String zzba()
  {
    return this.zzue;
  }
  
  public final String zzbb()
  {
    return this.zzuf;
  }
  
  public final boolean zzbc()
  {
    return this.zzug;
  }
  
  public final String zzbd()
  {
    return this.zzuh;
  }
  
  public final boolean zzbe()
  {
    return this.zzui;
  }
  
  public final double zzbf()
  {
    return this.zzuj;
  }
  
  public final void zzl(String paramString)
  {
    this.zzuc = paramString;
  }
  
  public final void zzm(String paramString)
  {
    this.zzuf = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */