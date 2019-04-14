package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.util.Set;

public final class zace
  extends zac
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private static Api.AbstractClientBuilder<? extends zad, SignInOptions> zakh = zaa.zapg;
  private final Context mContext;
  private final Handler mHandler;
  private Set<Scope> mScopes;
  private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zaau;
  private ClientSettings zaes;
  private zad zaga;
  private zach zaki;
  
  @WorkerThread
  public zace(Context paramContext, Handler paramHandler, @NonNull ClientSettings paramClientSettings)
  {
    this(paramContext, paramHandler, paramClientSettings, zakh);
  }
  
  @WorkerThread
  public zace(Context paramContext, Handler paramHandler, @NonNull ClientSettings paramClientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> paramAbstractClientBuilder)
  {
    this.mContext = paramContext;
    this.mHandler = paramHandler;
    this.zaes = ((ClientSettings)Preconditions.checkNotNull(paramClientSettings, "ClientSettings must not be null"));
    this.mScopes = paramClientSettings.getRequiredScopes();
    this.zaau = paramAbstractClientBuilder;
  }
  
  @WorkerThread
  private final void zac(zaj paramzaj)
  {
    Object localObject2 = paramzaj.getConnectionResult();
    Object localObject1 = localObject2;
    if (((ConnectionResult)localObject2).isSuccess())
    {
      paramzaj = paramzaj.zacw();
      localObject1 = paramzaj.getConnectionResult();
      if (!((ConnectionResult)localObject1).isSuccess())
      {
        paramzaj = String.valueOf(localObject1);
        localObject2 = new StringBuilder(String.valueOf(paramzaj).length() + 48);
        ((StringBuilder)localObject2).append("Sign-in succeeded with resolve account failure: ");
        ((StringBuilder)localObject2).append(paramzaj);
        Log.wtf("SignInCoordinator", ((StringBuilder)localObject2).toString(), new Exception());
      }
    }
    else
    {
      this.zaki.zag((ConnectionResult)localObject1);
    }
    for (;;)
    {
      this.zaga.disconnect();
      return;
      this.zaki.zaa(paramzaj.getAccountAccessor(), this.mScopes);
    }
  }
  
  @WorkerThread
  public final void onConnected(@Nullable Bundle paramBundle)
  {
    this.zaga.zaa(this);
  }
  
  @WorkerThread
  public final void onConnectionFailed(@NonNull ConnectionResult paramConnectionResult)
  {
    this.zaki.zag(paramConnectionResult);
  }
  
  @WorkerThread
  public final void onConnectionSuspended(int paramInt)
  {
    this.zaga.disconnect();
  }
  
  @WorkerThread
  public final void zaa(zach paramzach)
  {
    if (this.zaga != null) {
      this.zaga.disconnect();
    }
    this.zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(this)));
    this.zaga = ((zad)this.zaau.buildClient(this.mContext, this.mHandler.getLooper(), this.zaes, this.zaes.getSignInOptions(), this, this));
    this.zaki = paramzach;
    if ((this.mScopes != null) && (!this.mScopes.isEmpty()))
    {
      this.zaga.connect();
      return;
    }
    this.mHandler.post(new zacf(this));
  }
  
  @BinderThread
  public final void zab(zaj paramzaj)
  {
    this.mHandler.post(new zacg(this, paramzaj));
  }
  
  public final zad zabq()
  {
    return this.zaga;
  }
  
  public final void zabs()
  {
    if (this.zaga != null) {
      this.zaga.disconnect();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */