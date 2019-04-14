package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class zzh
{
  private static Logger zzbd = new Logger("GoogleSignInCommon", new String[0]);
  
  @Nullable
  public static GoogleSignInResult getSignInResultFromIntent(Intent paramIntent)
  {
    if ((paramIntent != null) && ((paramIntent.hasExtra("googleSignInStatus")) || (paramIntent.hasExtra("googleSignInAccount"))))
    {
      GoogleSignInAccount localGoogleSignInAccount = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
      paramIntent = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
      if (localGoogleSignInAccount != null) {
        paramIntent = Status.RESULT_SUCCESS;
      }
      return new GoogleSignInResult(localGoogleSignInAccount, paramIntent);
    }
    return null;
  }
  
  public static Intent zzc(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzbd.d("getSignInIntent()", new Object[0]);
    paramGoogleSignInOptions = new SignInConfiguration(paramContext.getPackageName(), paramGoogleSignInOptions);
    Intent localIntent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.setClass(paramContext, SignInHubActivity.class);
    paramContext = new Bundle();
    paramContext.putParcelable("config", paramGoogleSignInOptions);
    localIntent.putExtra("config", paramContext);
    return localIntent;
  }
  
  public static OptionalPendingResult<GoogleSignInResult> zzc(GoogleApiClient paramGoogleApiClient, Context paramContext, GoogleSignInOptions paramGoogleSignInOptions, boolean paramBoolean)
  {
    zzbd.d("silentSignIn()", new Object[0]);
    zzbd.d("getEligibleSavedSignInResult()", new Object[0]);
    Preconditions.checkNotNull(paramGoogleSignInOptions);
    Object localObject = zzp.zzd(paramContext).zzi();
    if (localObject != null)
    {
      Account localAccount1 = ((GoogleSignInOptions)localObject).getAccount();
      Account localAccount2 = paramGoogleSignInOptions.getAccount();
      boolean bool;
      if (localAccount1 == null)
      {
        if (localAccount2 == null) {
          bool = true;
        } else {
          bool = false;
        }
      }
      else {
        bool = localAccount1.equals(localAccount2);
      }
      if ((bool) && (!paramGoogleSignInOptions.isServerAuthCodeRequested()) && ((!paramGoogleSignInOptions.isIdTokenRequested()) || ((((GoogleSignInOptions)localObject).isIdTokenRequested()) && (paramGoogleSignInOptions.getServerClientId().equals(((GoogleSignInOptions)localObject).getServerClientId())))) && (new HashSet(((GoogleSignInOptions)localObject).getScopes()).containsAll(new HashSet(paramGoogleSignInOptions.getScopes()))))
      {
        localObject = zzp.zzd(paramContext).zzh();
        if ((localObject != null) && (!((GoogleSignInAccount)localObject).isExpired()))
        {
          localObject = new GoogleSignInResult((GoogleSignInAccount)localObject, Status.RESULT_SUCCESS);
          break label202;
        }
      }
    }
    localObject = null;
    label202:
    if (localObject != null)
    {
      zzbd.d("Eligible saved sign in result found", new Object[0]);
      return PendingResults.immediatePendingResult((Result)localObject, paramGoogleApiClient);
    }
    if (paramBoolean) {
      return PendingResults.immediatePendingResult(new GoogleSignInResult(null, new Status(4)), paramGoogleApiClient);
    }
    zzbd.d("trySilentSignIn()", new Object[0]);
    return new OptionalPendingResultImpl(paramGoogleApiClient.enqueue(new zzi(paramGoogleApiClient, paramContext, paramGoogleSignInOptions)));
  }
  
  public static PendingResult<Status> zzc(GoogleApiClient paramGoogleApiClient, Context paramContext, boolean paramBoolean)
  {
    zzbd.d("Signing out", new Object[0]);
    zzc(paramContext);
    if (paramBoolean) {
      return PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, paramGoogleApiClient);
    }
    return paramGoogleApiClient.execute(new zzk(paramGoogleApiClient));
  }
  
  private static void zzc(Context paramContext)
  {
    zzp.zzd(paramContext).clear();
    paramContext = GoogleApiClient.getAllClients().iterator();
    while (paramContext.hasNext()) {
      ((GoogleApiClient)paramContext.next()).maybeSignOut();
    }
    GoogleApiManager.reportSignOut();
  }
  
  public static Intent zzd(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzbd.d("getFallbackSignInIntent()", new Object[0]);
    paramContext = zzc(paramContext, paramGoogleSignInOptions);
    paramContext.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
    return paramContext;
  }
  
  public static PendingResult<Status> zzd(GoogleApiClient paramGoogleApiClient, Context paramContext, boolean paramBoolean)
  {
    zzbd.d("Revoking access", new Object[0]);
    String str = Storage.getInstance(paramContext).getSavedRefreshToken();
    zzc(paramContext);
    if (paramBoolean) {
      return zzd.zzc(str);
    }
    return paramGoogleApiClient.execute(new zzm(paramGoogleApiClient));
  }
  
  public static Intent zze(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzbd.d("getNoImplementationSignInIntent()", new Object[0]);
    paramContext = zzc(paramContext, paramGoogleSignInOptions);
    paramContext.setAction("com.google.android.gms.auth.NO_IMPL");
    return paramContext;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */