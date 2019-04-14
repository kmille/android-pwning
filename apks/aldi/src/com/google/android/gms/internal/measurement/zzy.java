package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzy
  extends zzi<zzy>
{
  private final Map<String, Object> zzsm = new HashMap();
  
  public final void set(String paramString1, String paramString2)
  {
    Preconditions.checkNotEmpty(paramString1);
    String str = paramString1;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.startsWith("&")) {
        str = paramString1.substring(1);
      }
    }
    Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
    this.zzsm.put(str, paramString2);
  }
  
  public final String toString()
  {
    return zza(this.zzsm);
  }
  
  public final Map<String, Object> zzas()
  {
    return Collections.unmodifiableMap(this.zzsm);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */