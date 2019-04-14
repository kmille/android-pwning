package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.SignInOptions;

@KeepForSdk
public class SignInClientImpl
  extends GmsClient<zaf>
  implements com.google.android.gms.signin.zad
{
  private final ClientSettings zaes;
  private Integer zaod;
  private final boolean zary = true;
  private final Bundle zarz;
  
  private SignInClientImpl(Context paramContext, Looper paramLooper, boolean paramBoolean, ClientSettings paramClientSettings, Bundle paramBundle, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 44, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zaes = paramClientSettings;
    this.zarz = paramBundle;
    this.zaod = paramClientSettings.getClientSessionId();
  }
  
  public SignInClientImpl(Context paramContext, Looper paramLooper, boolean paramBoolean, ClientSettings paramClientSettings, SignInOptions paramSignInOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext, paramLooper, true, paramClientSettings, createBundleFromClientSettings(paramClientSettings), paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  @KeepForSdk
  public static Bundle createBundleFromClientSettings(ClientSettings paramClientSettings)
  {
    SignInOptions localSignInOptions = paramClientSettings.getSignInOptions();
    Integer localInteger = paramClientSettings.getClientSessionId();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", paramClientSettings.getAccount());
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    if (localSignInOptions != null)
    {
      localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", localSignInOptions.isOfflineAccessRequested());
      localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", localSignInOptions.isIdTokenRequested());
      localBundle.putString("com.google.android.gms.signin.internal.serverClientId", localSignInOptions.getServerClientId());
      localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
      localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", localSignInOptions.isForceCodeForRefreshToken());
      localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", localSignInOptions.getHostedDomain());
      localBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", localSignInOptions.waitForAccessTokenRefresh());
      if (localSignInOptions.getAuthApiSignInModuleVersion() != null) {
        localBundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", localSignInOptions.getAuthApiSignInModuleVersion().longValue());
      }
      if (localSignInOptions.getRealClientLibraryVersion() != null) {
        localBundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", localSignInOptions.getRealClientLibraryVersion().longValue());
      }
    }
    return localBundle;
  }
  
  public final void connect()
  {
    connect(new BaseGmsClient.LegacyClientCallbackAdapter(this));
  }
  
  public Bundle getGetServiceRequestExtraArgs()
  {
    String str = this.zaes.getRealClientPackageName();
    if (!getContext().getPackageName().equals(str)) {
      this.zarz.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zaes.getRealClientPackageName());
    }
    return this.zarz;
  }
  
  public int getMinApkVersion()
  {
    return 12451000;
  }
  
  public String getServiceDescriptor()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public String getStartServiceAction()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  public boolean requiresSignIn()
  {
    return this.zary;
  }
  
  public final void zaa(IAccountAccessor paramIAccountAccessor, boolean paramBoolean)
  {
    try
    {
      ((zaf)getService()).zaa(paramIAccountAccessor, this.zaod.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException paramIAccountAccessor) {}
  }
  
  public final void zaa(zad paramzad)
  {
    Preconditions.checkNotNull(paramzad, "Expecting a valid ISignInCallbacks");
    try
    {
      Account localAccount = this.zaes.getAccountOrDefault();
      Object localObject = null;
      if ("<<default account>>".equals(localAccount.name)) {
        localObject = Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount();
      }
      localObject = new ResolveAccountRequest(localAccount, this.zaod.intValue(), (GoogleSignInAccount)localObject);
      ((zaf)getService()).zaa(new zah((ResolveAccountRequest)localObject), paramzad);
      return;
    }
    catch (RemoteException localRemoteException) {}
    try
    {
      paramzad.zab(new zaj(8));
      return;
    }
    catch (RemoteException paramzad)
    {
      for (;;) {}
    }
    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException);
  }
  
  public final void zacv()
  {
    try
    {
      ((zaf)getService()).zam(this.zaod.intValue());
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/signin/internal/SignInClientImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */