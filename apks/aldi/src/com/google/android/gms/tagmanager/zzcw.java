package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public class zzcw
{
  private static String zzbar;
  @VisibleForTesting
  static Map<String, String> zzbas = new HashMap();
  
  public static void zzdh(String paramString)
  {
    try
    {
      zzbar = paramString;
      return;
    }
    finally {}
  }
  
  static void zzf(Context paramContext, String paramString)
  {
    zzft.zza(paramContext, "gtm_install_referrer", "referrer", paramString);
    zzh(paramContext, paramString);
  }
  
  public static String zzg(Context paramContext, String paramString)
  {
    if (zzbar == null) {}
    for (;;)
    {
      try
      {
        if (zzbar == null)
        {
          paramContext = paramContext.getSharedPreferences("gtm_install_referrer", 0);
          if (paramContext == null) {
            break label65;
          }
          paramContext = paramContext.getString("referrer", "");
          zzbar = paramContext;
        }
      }
      finally {}
      return zzt(zzbar, paramString);
      label65:
      paramContext = "";
    }
  }
  
  public static void zzh(Context paramContext, String paramString)
  {
    String str = zzt(paramString, "conv");
    if ((str != null) && (str.length() > 0))
    {
      zzbas.put(str, paramString);
      zzft.zza(paramContext, "gtm_click_referrers", str, paramString);
    }
  }
  
  public static String zzt(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      if (paramString1.length() > 0) {
        return paramString1;
      }
      return null;
    }
    paramString1 = String.valueOf(paramString1);
    if (paramString1.length() != 0) {
      paramString1 = "http://hostname/?".concat(paramString1);
    } else {
      paramString1 = new String("http://hostname/?");
    }
    return Uri.parse(paramString1).getQueryParameter(paramString2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */