package com.google.android.gms.auth.api.accounttransfer;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AuthenticatorTransferCompletionStatus
{
  public static final int COMPLETED_FAILURE = 2;
  public static final int COMPLETED_SUCCESS = 1;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/AuthenticatorTransferCompletionStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */