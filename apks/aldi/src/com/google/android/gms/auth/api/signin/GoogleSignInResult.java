package com.google.android.gms.auth.api.signin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult
  implements Result
{
  private Status mStatus;
  private GoogleSignInAccount zzaz;
  
  public GoogleSignInResult(@Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull Status paramStatus)
  {
    this.zzaz = paramGoogleSignInAccount;
    this.mStatus = paramStatus;
  }
  
  @Nullable
  public GoogleSignInAccount getSignInAccount()
  {
    return this.zzaz;
  }
  
  @NonNull
  public Status getStatus()
  {
    return this.mStatus;
  }
  
  public boolean isSuccess()
  {
    return this.mStatus.isSuccess();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */