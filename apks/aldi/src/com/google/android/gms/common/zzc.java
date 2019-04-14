package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
final class zzc
{
  private static volatile com.google.android.gms.common.internal.zzm zzn;
  private static final Object zzo = new Object();
  private static Context zzp;
  
  static zzm zza(String paramString, zze paramzze, boolean paramBoolean)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      paramString = zzb(paramString, paramzze, paramBoolean);
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  static void zza(Context paramContext)
  {
    try
    {
      if ((zzp == null) && (paramContext != null))
      {
        zzp = paramContext.getApplicationContext();
        return;
      }
      return;
    }
    finally {}
  }
  
  private static zzm zzb(String paramString, zze paramzze, boolean paramBoolean)
  {
    try
    {
      if (zzn == null)
      {
        Preconditions.checkNotNull(zzp);
        synchronized (zzo)
        {
          if (zzn == null) {
            zzn = zzn.zzc(DynamiteModule.load(zzp, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
          }
        }
      }
      Preconditions.checkNotNull(zzp);
      ??? = new zzk(paramString, paramzze, paramBoolean);
      try
      {
        boolean bool = zzn.zza((zzk)???, ObjectWrapper.wrap(zzp.getPackageManager()));
        if (bool) {
          return zzm.zze();
        }
        return zzm.zza(new zzd(paramBoolean, paramString, paramzze));
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
        return zzm.zza("module call", paramString);
      }
      return zzm.zza(paramString, paramzze);
    }
    catch (DynamiteModule.LoadingException paramzze)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramzze);
      paramString = String.valueOf(paramzze.getMessage());
      if (paramString.length() != 0) {
        paramString = "module init: ".concat(paramString);
      } else {
        paramString = new String("module init: ");
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */