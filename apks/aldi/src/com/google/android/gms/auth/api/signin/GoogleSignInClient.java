package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

public class GoogleSignInClient
  extends GoogleApi<GoogleSignInOptions>
{
  private static final zzc zzar = new zzc(null);
  @VisibleForTesting
  private static int zzas = zzd.zzau;
  
  GoogleSignInClient(@NonNull Activity paramActivity, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(paramActivity, Auth.GOOGLE_SIGN_IN_API, paramGoogleSignInOptions, new ApiExceptionMapper());
  }
  
  GoogleSignInClient(@NonNull Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(paramContext, Auth.GOOGLE_SIGN_IN_API, paramGoogleSignInOptions, new ApiExceptionMapper());
  }
  
  private final int zze()
  {
    try
    {
      if (zzas == zzd.zzau)
      {
        Context localContext = getApplicationContext();
        GoogleApiAvailability localGoogleApiAvailability = GoogleApiAvailability.getInstance();
        i = localGoogleApiAvailability.isGooglePlayServicesAvailable(localContext, 12451000);
        if (i == 0) {
          i = zzd.zzax;
        }
        for (;;)
        {
          zzas = i;
          break;
          if ((localGoogleApiAvailability.getErrorResolutionIntent(localContext, i, null) == null) && (DynamiteModule.getLocalVersion(localContext, "com.google.android.gms.auth.api.fallback") != 0)) {
            i = zzd.zzaw;
          } else {
            i = zzd.zzav;
          }
        }
      }
      int i = zzas;
      return i;
    }
    finally {}
  }
  
  @NonNull
  public Intent getSignInIntent()
  {
    Context localContext = getApplicationContext();
    switch (zzc.zzat[(zze() - 1)])
    {
    default: 
      return zzh.zze(localContext, (GoogleSignInOptions)getApiOptions());
    case 2: 
      return zzh.zzc(localContext, (GoogleSignInOptions)getApiOptions());
    }
    return zzh.zzd(localContext, (GoogleSignInOptions)getApiOptions());
  }
  
  public Task<Void> revokeAccess()
  {
    GoogleApiClient localGoogleApiClient = asGoogleApiClient();
    Context localContext = getApplicationContext();
    boolean bool;
    if (zze() == zzd.zzaw) {
      bool = true;
    } else {
      bool = false;
    }
    return PendingResultUtil.toVoidTask(zzh.zzd(localGoogleApiClient, localContext, bool));
  }
  
  public Task<Void> signOut()
  {
    GoogleApiClient localGoogleApiClient = asGoogleApiClient();
    Context localContext = getApplicationContext();
    boolean bool;
    if (zze() == zzd.zzaw) {
      bool = true;
    } else {
      bool = false;
    }
    return PendingResultUtil.toVoidTask(zzh.zzc(localGoogleApiClient, localContext, bool));
  }
  
  public Task<GoogleSignInAccount> silentSignIn()
  {
    GoogleApiClient localGoogleApiClient = asGoogleApiClient();
    Context localContext = getApplicationContext();
    GoogleSignInOptions localGoogleSignInOptions = (GoogleSignInOptions)getApiOptions();
    boolean bool;
    if (zze() == zzd.zzaw) {
      bool = true;
    } else {
      bool = false;
    }
    return PendingResultUtil.toTask(zzh.zzc(localGoogleApiClient, localContext, localGoogleSignInOptions, bool), zzar);
  }
  
  static final class zzc
    implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount>
  {}
  
  @VisibleForTesting
  static enum zzd
  {
    public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0()
    {
      return (int[])zzay.clone();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */