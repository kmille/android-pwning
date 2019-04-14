package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.signin.zad;
import java.util.concurrent.locks.Lock;

final class zaat
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private zaat(zaak paramzaak) {}
  
  public final void onConnected(Bundle paramBundle)
  {
    zaak.zaf(this.zagi).zaa(new zaar(this.zagi));
  }
  
  public final void onConnectionFailed(@NonNull ConnectionResult paramConnectionResult)
  {
    zaak.zac(this.zagi).lock();
    try
    {
      if (zaak.zab(this.zagi, paramConnectionResult))
      {
        zaak.zai(this.zagi);
        zaak.zaj(this.zagi);
      }
      else
      {
        zaak.zaa(this.zagi, paramConnectionResult);
      }
      return;
    }
    finally
    {
      zaak.zac(this.zagi).unlock();
    }
  }
  
  public final void onConnectionSuspended(int paramInt) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */