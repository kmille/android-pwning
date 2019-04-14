package com.google.android.gms.auth.api.accounttransfer;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

public class AccountTransferException
  extends ApiException
{
  public AccountTransferException(@NonNull Status paramStatus)
  {
    super(paramStatus);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/AccountTransferException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */