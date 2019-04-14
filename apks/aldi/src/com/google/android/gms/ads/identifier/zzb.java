package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

public final class zzb
{
  private SharedPreferences zzs;
  
  public zzb(Context paramContext)
  {
    try
    {
      paramContext = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
      if (paramContext == null) {
        paramContext = null;
      } else {
        paramContext = paramContext.getSharedPreferences("google_ads_flags", 0);
      }
      this.zzs = paramContext;
      return;
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    this.zzs = null;
  }
  
  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    try
    {
      if (this.zzs == null) {
        return false;
      }
      paramBoolean = this.zzs.getBoolean(paramString, false);
      return paramBoolean;
    }
    catch (Throwable paramString) {}
    return false;
  }
  
  final float getFloat(String paramString, float paramFloat)
  {
    try
    {
      if (this.zzs == null) {
        return 0.0F;
      }
      paramFloat = this.zzs.getFloat(paramString, 0.0F);
      return paramFloat;
    }
    catch (Throwable paramString) {}
    return 0.0F;
  }
  
  final String getString(String paramString1, String paramString2)
  {
    try
    {
      if (this.zzs == null) {
        return paramString2;
      }
      paramString1 = this.zzs.getString(paramString1, paramString2);
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/ads/identifier/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */