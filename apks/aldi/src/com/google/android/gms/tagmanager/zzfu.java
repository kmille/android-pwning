package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

final class zzfu
  implements zzbe
{
  private final String zzaay;
  private final zzfx zzbei;
  private final zzfw zzbej;
  private final Context zzqx;
  
  @VisibleForTesting
  zzfu(Context paramContext, zzfw paramzzfw)
  {
    this(new zzfv(), paramContext, paramzzfw);
  }
  
  @VisibleForTesting
  private zzfu(zzfx paramzzfx, Context paramContext, zzfw paramzzfw)
  {
    this.zzbei = paramzzfx;
    this.zzqx = paramContext.getApplicationContext();
    this.zzbej = paramzzfw;
    paramzzfw = Build.VERSION.RELEASE;
    Locale localLocale = Locale.getDefault();
    paramContext = null;
    if (localLocale == null)
    {
      paramzzfx = paramContext;
    }
    else
    {
      paramzzfx = paramContext;
      if (localLocale.getLanguage() != null) {
        if (localLocale.getLanguage().length() == 0)
        {
          paramzzfx = paramContext;
        }
        else
        {
          paramzzfx = new StringBuilder();
          paramzzfx.append(localLocale.getLanguage().toLowerCase());
          if ((localLocale.getCountry() != null) && (localLocale.getCountry().length() != 0))
          {
            paramzzfx.append("-");
            paramzzfx.append(localLocale.getCountry().toLowerCase());
          }
          paramzzfx = paramzzfx.toString();
        }
      }
    }
    this.zzaay = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { "GoogleTagManager", "4.00", paramzzfw, paramzzfx, Build.MODEL, Build.ID });
  }
  
  @VisibleForTesting
  private static URL zzd(zzbw paramzzbw)
  {
    paramzzbw = paramzzbw.zznw();
    try
    {
      paramzzbw = new URL(paramzzbw);
      return paramzzbw;
    }
    catch (MalformedURLException paramzzbw)
    {
      for (;;) {}
    }
    zzdi.e("Error trying to parse the GTM url.");
    return null;
  }
  
  public final void zze(List<zzbw> paramList)
  {
    int n = Math.min(paramList.size(), 40);
    int m = 0;
    for (j = 1; m < n; j = i)
    {
      zzbw localzzbw = (zzbw)paramList.get(m);
      Object localObject1 = zzd(localzzbw);
      if (localObject1 == null)
      {
        zzdi.zzab("No destination: discarding hit.");
        this.zzbej.zzb(localzzbw);
        i = j;
      }
      else
      {
        k = j;
      }
      for (;;)
      {
        try
        {
          localHttpURLConnection = this.zzbei.zzc((URL)localObject1);
          i = j;
          if (j == 0) {}
        }
        catch (IOException localIOException)
        {
          HttpURLConnection localHttpURLConnection;
          InputStream localInputStream;
          localObject1 = String.valueOf(localIOException.getClass().getSimpleName());
          if (((String)localObject1).length() != 0) {
            localObject1 = "Exception sending hit: ".concat((String)localObject1);
          } else {
            localObject1 = new String("Exception sending hit: ");
          }
          zzdi.zzab((String)localObject1);
          zzdi.zzab(localIOException.getMessage());
          this.zzbej.zzc(localzzbw);
          i = k;
        }
        try
        {
          zzdn.zzp(this.zzqx);
          i = 0;
          j = i;
          localHttpURLConnection.setRequestProperty("User-Agent", this.zzaay);
          j = i;
          k = localHttpURLConnection.getResponseCode();
          j = i;
          localInputStream = localHttpURLConnection.getInputStream();
          if (k == 200) {}
        }
        finally
        {
          Object localObject4 = null;
          i = j;
          continue;
        }
        try
        {
          localObject1 = new StringBuilder(25);
          ((StringBuilder)localObject1).append("Bad response: ");
          ((StringBuilder)localObject1).append(k);
          zzdi.zzab(((StringBuilder)localObject1).toString());
          this.zzbej.zzc(localzzbw);
          continue;
          this.zzbej.zza(localzzbw);
          if (localInputStream != null)
          {
            k = i;
            localInputStream.close();
          }
          k = i;
          localHttpURLConnection.disconnect();
        }
        finally {}
      }
      if (localInputStream != null)
      {
        k = i;
        localInputStream.close();
      }
      int k = i;
      localHttpURLConnection.disconnect();
      k = i;
      throw ((Throwable)localObject1);
      m += 1;
    }
  }
  
  public final boolean zznl()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.zzqx.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      return true;
    }
    zzdi.v("...no network connectivity");
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */