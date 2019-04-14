package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public final class zzz
  extends zzi<zzz>
{
  private String zztt;
  public int zztu;
  public int zztv;
  public int zztw;
  public int zztx;
  public int zzty;
  
  public final String getLanguage()
  {
    return this.zztt;
  }
  
  public final void setLanguage(String paramString)
  {
    this.zztt = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("language", this.zztt);
    localHashMap.put("screenColors", Integer.valueOf(this.zztu));
    localHashMap.put("screenWidth", Integer.valueOf(this.zztv));
    localHashMap.put("screenHeight", Integer.valueOf(this.zztw));
    localHashMap.put("viewportWidth", Integer.valueOf(this.zztx));
    localHashMap.put("viewportHeight", Integer.valueOf(this.zzty));
    return zza(localHashMap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */