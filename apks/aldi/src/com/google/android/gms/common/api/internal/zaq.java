package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;

public final class zaq
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final Api<?> mApi;
  private final boolean zaeb;
  private zar zaec;
  
  public zaq(Api<?> paramApi, boolean paramBoolean)
  {
    this.mApi = paramApi;
    this.zaeb = paramBoolean;
  }
  
  private final void zav()
  {
    Preconditions.checkNotNull(this.zaec, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
  }
  
  public final void onConnected(@Nullable Bundle paramBundle)
  {
    zav();
    this.zaec.onConnected(paramBundle);
  }
  
  public final void onConnectionFailed(@NonNull ConnectionResult paramConnectionResult)
  {
    zav();
    this.zaec.zaa(paramConnectionResult, this.mApi, this.zaeb);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    zav();
    this.zaec.onConnectionSuspended(paramInt);
  }
  
  public final void zaa(zar paramzar)
  {
    this.zaec = paramzar;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */