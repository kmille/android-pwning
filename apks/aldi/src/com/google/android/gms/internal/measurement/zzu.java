package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public final class zzu
  extends zzi<zzu>
{
  private String zztf;
  private String zztg;
  private String zzth;
  private String zzti;
  
  public final void setAppId(String paramString)
  {
    this.zzth = paramString;
  }
  
  public final void setAppInstallerId(String paramString)
  {
    this.zzti = paramString;
  }
  
  public final void setAppName(String paramString)
  {
    this.zztf = paramString;
  }
  
  public final void setAppVersion(String paramString)
  {
    this.zztg = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", this.zztf);
    localHashMap.put("appVersion", this.zztg);
    localHashMap.put("appId", this.zzth);
    localHashMap.put("appInstallerId", this.zzti);
    return zza(localHashMap);
  }
  
  public final void zza(zzu paramzzu)
  {
    if (!TextUtils.isEmpty(this.zztf)) {
      paramzzu.zztf = this.zztf;
    }
    if (!TextUtils.isEmpty(this.zztg)) {
      paramzzu.zztg = this.zztg;
    }
    if (!TextUtils.isEmpty(this.zzth)) {
      paramzzu.zzth = this.zzth;
    }
    if (!TextUtils.isEmpty(this.zzti)) {
      paramzzu.zzti = this.zzti;
    }
  }
  
  public final String zzaf()
  {
    return this.zztf;
  }
  
  public final String zzag()
  {
    return this.zztg;
  }
  
  public final String zzah()
  {
    return this.zzth;
  }
  
  public final String zzai()
  {
    return this.zzti;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */