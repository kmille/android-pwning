package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import java.util.Map;

public final class zzv
  extends zzi<zzv>
{
  private String name;
  private String zzno;
  private String zztj;
  private String zztk;
  private String zztl;
  private String zztm;
  private String zztn;
  private String zzto;
  private String zztp;
  private String zztq;
  
  public final String getId()
  {
    return this.zzno;
  }
  
  public final String getName()
  {
    return this.name;
  }
  
  public final String getSource()
  {
    return this.zztj;
  }
  
  public final void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", this.name);
    localHashMap.put("source", this.zztj);
    localHashMap.put("medium", this.zztk);
    localHashMap.put("keyword", this.zztl);
    localHashMap.put("content", this.zztm);
    localHashMap.put("id", this.zzno);
    localHashMap.put("adNetworkId", this.zztn);
    localHashMap.put("gclid", this.zzto);
    localHashMap.put("dclid", this.zztp);
    localHashMap.put("aclid", this.zztq);
    return zza(localHashMap);
  }
  
  public final String zzaj()
  {
    return this.zztk;
  }
  
  public final String zzak()
  {
    return this.zztl;
  }
  
  public final String zzal()
  {
    return this.zztm;
  }
  
  public final String zzam()
  {
    return this.zztn;
  }
  
  public final String zzan()
  {
    return this.zzto;
  }
  
  public final String zzao()
  {
    return this.zztp;
  }
  
  public final String zzap()
  {
    return this.zztq;
  }
  
  public final void zzc(String paramString)
  {
    this.zztj = paramString;
  }
  
  public final void zzd(String paramString)
  {
    this.zztk = paramString;
  }
  
  public final void zze(String paramString)
  {
    this.zztl = paramString;
  }
  
  public final void zzf(String paramString)
  {
    this.zztm = paramString;
  }
  
  public final void zzg(String paramString)
  {
    this.zzno = paramString;
  }
  
  public final void zzh(String paramString)
  {
    this.zztn = paramString;
  }
  
  public final void zzi(String paramString)
  {
    this.zzto = paramString;
  }
  
  public final void zzj(String paramString)
  {
    this.zztp = paramString;
  }
  
  public final void zzk(String paramString)
  {
    this.zztq = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */