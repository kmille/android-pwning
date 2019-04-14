package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.auth.api.signin.internal.zzp;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GoogleSignIn
{
  @NonNull
  public static GoogleSignInAccount getAccountForExtension(@NonNull Context paramContext, @NonNull GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    Preconditions.checkNotNull(paramContext, "please provide a valid Context object");
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "please provide valid GoogleSignInOptionsExtension");
    GoogleSignInAccount localGoogleSignInAccount = getLastSignedInAccount(paramContext);
    paramContext = localGoogleSignInAccount;
    if (localGoogleSignInAccount == null) {
      paramContext = GoogleSignInAccount.createDefault();
    }
    return paramContext.requestExtraScopes(zzc(paramGoogleSignInOptionsExtension.getImpliedScopes()));
  }
  
  @NonNull
  public static GoogleSignInAccount getAccountForScopes(@NonNull Context paramContext, @NonNull Scope paramScope, Scope... paramVarArgs)
  {
    Preconditions.checkNotNull(paramContext, "please provide a valid Context object");
    Preconditions.checkNotNull(paramScope, "please provide at least one valid scope");
    GoogleSignInAccount localGoogleSignInAccount = getLastSignedInAccount(paramContext);
    paramContext = localGoogleSignInAccount;
    if (localGoogleSignInAccount == null) {
      paramContext = GoogleSignInAccount.createDefault();
    }
    paramContext.requestExtraScopes(new Scope[] { paramScope });
    paramContext.requestExtraScopes(paramVarArgs);
    return paramContext;
  }
  
  public static GoogleSignInClient getClient(@NonNull Activity paramActivity, @NonNull GoogleSignInOptions paramGoogleSignInOptions)
  {
    return new GoogleSignInClient(paramActivity, (GoogleSignInOptions)Preconditions.checkNotNull(paramGoogleSignInOptions));
  }
  
  public static GoogleSignInClient getClient(@NonNull Context paramContext, @NonNull GoogleSignInOptions paramGoogleSignInOptions)
  {
    return new GoogleSignInClient(paramContext, (GoogleSignInOptions)Preconditions.checkNotNull(paramGoogleSignInOptions));
  }
  
  @Nullable
  public static GoogleSignInAccount getLastSignedInAccount(Context paramContext)
  {
    return zzp.zzd(paramContext).zzh();
  }
  
  public static Task<GoogleSignInAccount> getSignedInAccountFromIntent(@Nullable Intent paramIntent)
  {
    paramIntent = zzh.getSignInResultFromIntent(paramIntent);
    if (paramIntent == null) {
      return Tasks.forException(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
    }
    if ((paramIntent.getStatus().isSuccess()) && (paramIntent.getSignInAccount() != null)) {
      return Tasks.forResult(paramIntent.getSignInAccount());
    }
    return Tasks.forException(ApiExceptionUtil.fromStatus(paramIntent.getStatus()));
  }
  
  public static boolean hasPermissions(@Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
    return hasPermissions(paramGoogleSignInAccount, zzc(paramGoogleSignInOptionsExtension.getImpliedScopes()));
  }
  
  public static boolean hasPermissions(@Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull Scope... paramVarArgs)
  {
    if (paramGoogleSignInAccount == null) {
      return false;
    }
    HashSet localHashSet = new HashSet();
    Collections.addAll(localHashSet, paramVarArgs);
    return paramGoogleSignInAccount.getGrantedScopes().containsAll(localHashSet);
  }
  
  public static void requestPermissions(@NonNull Activity paramActivity, int paramInt, @Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    Preconditions.checkNotNull(paramActivity, "Please provide a non-null Activity");
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
    requestPermissions(paramActivity, paramInt, paramGoogleSignInAccount, zzc(paramGoogleSignInOptionsExtension.getImpliedScopes()));
  }
  
  public static void requestPermissions(@NonNull Activity paramActivity, int paramInt, @Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull Scope... paramVarArgs)
  {
    Preconditions.checkNotNull(paramActivity, "Please provide a non-null Activity");
    Preconditions.checkNotNull(paramVarArgs, "Please provide at least one scope");
    paramActivity.startActivityForResult(zzc(paramActivity, paramGoogleSignInAccount, paramVarArgs), paramInt);
  }
  
  public static void requestPermissions(@NonNull Fragment paramFragment, int paramInt, @Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    Preconditions.checkNotNull(paramFragment, "Please provide a non-null Fragment");
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
    requestPermissions(paramFragment, paramInt, paramGoogleSignInAccount, zzc(paramGoogleSignInOptionsExtension.getImpliedScopes()));
  }
  
  public static void requestPermissions(@NonNull Fragment paramFragment, int paramInt, @Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull Scope... paramVarArgs)
  {
    Preconditions.checkNotNull(paramFragment, "Please provide a non-null Fragment");
    Preconditions.checkNotNull(paramVarArgs, "Please provide at least one scope");
    paramFragment.startActivityForResult(zzc(paramFragment.getActivity(), paramGoogleSignInAccount, paramVarArgs), paramInt);
  }
  
  @NonNull
  private static Intent zzc(@NonNull Activity paramActivity, @Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull Scope... paramVarArgs)
  {
    GoogleSignInOptions.Builder localBuilder = new GoogleSignInOptions.Builder();
    if (paramVarArgs.length > 0) {
      localBuilder.requestScopes(paramVarArgs[0], paramVarArgs);
    }
    if ((paramGoogleSignInAccount != null) && (!TextUtils.isEmpty(paramGoogleSignInAccount.getEmail()))) {
      localBuilder.setAccountName(paramGoogleSignInAccount.getEmail());
    }
    return new GoogleSignInClient(paramActivity, localBuilder.build()).getSignInIntent();
  }
  
  @NonNull
  private static Scope[] zzc(@Nullable List<Scope> paramList)
  {
    if (paramList == null) {
      return new Scope[0];
    }
    return (Scope[])paramList.toArray(new Scope[paramList.size()]);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignIn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */