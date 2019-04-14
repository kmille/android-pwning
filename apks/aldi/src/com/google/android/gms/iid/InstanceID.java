package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
public class InstanceID
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String ERROR_TIMEOUT = "TIMEOUT";
  private static Map<String, InstanceID> zzbq = new ArrayMap();
  private static long zzbr = TimeUnit.DAYS.toSeconds(7L);
  private static zzak zzbs;
  private static zzaf zzbt;
  private static String zzbu;
  private String zzbv = "";
  private Context zzk;
  
  private InstanceID(Context paramContext, String paramString)
  {
    this.zzk = paramContext.getApplicationContext();
    this.zzbv = paramString;
  }
  
  @Deprecated
  public static InstanceID getInstance(Context paramContext)
  {
    return getInstance(paramContext, null);
  }
  
  @KeepForSdk
  public static InstanceID getInstance(Context paramContext, Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = "";
    }
    for (;;)
    {
      try
      {
        paramBundle = paramBundle.getString("subtype");
      }
      finally
      {
        Context localContext;
        continue;
      }
      localContext = paramContext.getApplicationContext();
      if (zzbs == null)
      {
        paramContext = localContext.getPackageName();
        paramBundle = new StringBuilder(String.valueOf(paramContext).length() + 73);
        paramBundle.append("Instance ID SDK is deprecated, ");
        paramBundle.append(paramContext);
        paramBundle.append(" should update to use Firebase Instance ID");
        zzbs = new zzak(localContext);
        zzbt = new zzaf(localContext);
      }
      zzbu = Integer.toString(zzg(localContext));
      paramBundle = (InstanceID)zzbq.get(localObject);
      paramContext = paramBundle;
      if (paramBundle == null)
      {
        paramContext = new InstanceID(localContext, (String)localObject);
        zzbq.put(localObject, paramContext);
      }
      return paramContext;
      throw paramContext;
      Object localObject = paramBundle;
      if (paramBundle == null) {
        localObject = "";
      }
    }
  }
  
  private final KeyPair getKeyPair()
  {
    return zzbs.zzj(this.zzbv).getKeyPair();
  }
  
  static String zzd(KeyPair paramKeyPair)
  {
    paramKeyPair = paramKeyPair.getPublic().getEncoded();
    try
    {
      paramKeyPair = MessageDigest.getInstance("SHA1").digest(paramKeyPair);
      paramKeyPair[0] = ((byte)((paramKeyPair[0] & 0xF) + 112));
      paramKeyPair = Base64.encodeToString(paramKeyPair, 0, 8, 11);
      return paramKeyPair;
    }
    catch (NoSuchAlgorithmException paramKeyPair)
    {
      for (;;) {}
    }
    return null;
  }
  
  static int zzg(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramContext).length() + 38);
      localStringBuilder.append("Never happens: can't find own package ");
      localStringBuilder.append(paramContext);
    }
    return 0;
  }
  
  static String zzh(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramContext).length() + 38);
      localStringBuilder.append("Never happens: can't find own package ");
      localStringBuilder.append(paramContext);
    }
    return null;
  }
  
  public static zzak zzn()
  {
    return zzbs;
  }
  
  @Deprecated
  public void deleteInstanceID()
    throws IOException
  {
    zzd("*", "*", null);
    zzm();
  }
  
  @Deprecated
  public void deleteToken(String paramString1, String paramString2)
    throws IOException
  {
    zzd(paramString1, paramString2, null);
  }
  
  @Deprecated
  public long getCreationTime()
  {
    return zzbs.zzj(this.zzbv).getCreationTime();
  }
  
  @Deprecated
  public String getId()
  {
    return zzd(getKeyPair());
  }
  
  @KeepForSdk
  public String getSubtype()
  {
    return this.zzbv;
  }
  
  @Deprecated
  public String getToken(String paramString1, String paramString2)
    throws IOException
  {
    return getToken(paramString1, paramString2, null);
  }
  
  @Deprecated
  public String getToken(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    if (Looper.getMainLooper() != Looper.myLooper())
    {
      Object localObject = null;
      String str = zzbs.get("appVersion");
      int j = 1;
      int i = j;
      if (str != null) {
        if (!str.equals(zzbu))
        {
          i = j;
        }
        else
        {
          str = zzbs.get("lastToken");
          if (str == null)
          {
            i = j;
          }
          else
          {
            long l = Long.parseLong(str);
            if (System.currentTimeMillis() / 1000L - Long.valueOf(l).longValue() > zzbr) {
              i = j;
            } else {
              i = 0;
            }
          }
        }
      }
      if (i == 0) {
        localObject = zzbs.zze(this.zzbv, paramString1, paramString2);
      }
      if (localObject == null)
      {
        localObject = paramBundle;
        if (paramBundle == null) {
          localObject = new Bundle();
        }
        localObject = zze(paramString1, paramString2, (Bundle)localObject);
        paramBundle = (Bundle)localObject;
        if (localObject != null)
        {
          zzbs.zzd(this.zzbv, paramString1, paramString2, (String)localObject, zzbu);
          return (String)localObject;
        }
      }
      else
      {
        paramBundle = (Bundle)localObject;
      }
      return paramBundle;
    }
    throw new IOException("MAIN_THREAD");
  }
  
  public final void zzd(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    if (Looper.getMainLooper() != Looper.myLooper())
    {
      zzbs.zzf(this.zzbv, paramString1, paramString2);
      Bundle localBundle = paramBundle;
      if (paramBundle == null) {
        localBundle = new Bundle();
      }
      localBundle.putString("sender", paramString1);
      if (paramString2 != null) {
        localBundle.putString("scope", paramString2);
      }
      localBundle.putString("subscription", paramString1);
      localBundle.putString("delete", "1");
      localBundle.putString("X-delete", "1");
      if ("".equals(this.zzbv)) {
        paramString2 = paramString1;
      } else {
        paramString2 = this.zzbv;
      }
      localBundle.putString("subtype", paramString2);
      if (!"".equals(this.zzbv)) {
        paramString1 = this.zzbv;
      }
      localBundle.putString("X-subtype", paramString1);
      zzaf.zzi(zzbt.zzd(localBundle, getKeyPair()));
      return;
    }
    throw new IOException("MAIN_THREAD");
  }
  
  public final String zze(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    if (paramString2 != null) {
      paramBundle.putString("scope", paramString2);
    }
    paramBundle.putString("sender", paramString1);
    if ("".equals(this.zzbv)) {
      paramString2 = paramString1;
    } else {
      paramString2 = this.zzbv;
    }
    if (!paramBundle.containsKey("legacy.register"))
    {
      paramBundle.putString("subscription", paramString1);
      paramBundle.putString("subtype", paramString2);
      paramBundle.putString("X-subscription", paramString1);
      paramBundle.putString("X-subtype", paramString2);
    }
    paramString1 = zzaf.zzi(zzbt.zzd(paramBundle, getKeyPair()));
    if ((!"RST".equals(paramString1)) && (!paramString1.startsWith("RST|"))) {
      return paramString1;
    }
    InstanceIDListenerService.zzd(this.zzk, zzbs);
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  final void zzm()
  {
    zzbs.zzk(this.zzbv);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/InstanceID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */