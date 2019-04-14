package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import java.util.Collections;
import java.util.Map;

final class zabo
  implements Runnable
{
  zabo(GoogleApiManager.zac paramzac, ConnectionResult paramConnectionResult) {}
  
  public final void run()
  {
    if (this.zaiy.isSuccess())
    {
      GoogleApiManager.zac.zaa(this.zajf, true);
      if (GoogleApiManager.zac.zaa(this.zajf).requiresSignIn())
      {
        GoogleApiManager.zac.zab(this.zajf);
        return;
      }
    }
    try
    {
      GoogleApiManager.zac.zaa(this.zajf).getRemoteService(null, Collections.emptySet());
      return;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
    ((GoogleApiManager.zaa)GoogleApiManager.zaj(this.zajf.zail).get(GoogleApiManager.zac.zac(this.zajf))).onConnectionFailed(new ConnectionResult(10));
    return;
    ((GoogleApiManager.zaa)GoogleApiManager.zaj(this.zajf.zail).get(GoogleApiManager.zac.zac(this.zajf))).onConnectionFailed(this.zaiy);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */