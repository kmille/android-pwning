package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

final class zza
  extends AsyncTask<Void, Void, Integer>
{
  zza(Context paramContext, ProviderInstaller.ProviderInstallListener paramProviderInstallListener) {}
  
  private final Integer zza(Void... paramVarArgs)
  {
    try
    {
      ProviderInstaller.installIfNeeded(this.val$context);
      i = 0;
    }
    catch (GooglePlayServicesNotAvailableException paramVarArgs)
    {
      for (;;)
      {
        i = paramVarArgs.errorCode;
      }
    }
    catch (GooglePlayServicesRepairableException paramVarArgs)
    {
      for (;;)
      {
        int i = paramVarArgs.getConnectionStatusCode();
      }
    }
    return Integer.valueOf(i);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/security/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */