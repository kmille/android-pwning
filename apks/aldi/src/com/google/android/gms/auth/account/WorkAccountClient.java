package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.tasks.Task;

public class WorkAccountClient
  extends GoogleApi<Api.ApiOptions.NoOptions>
{
  private final WorkAccountApi zzac = new zzh();
  
  WorkAccountClient(@NonNull Activity paramActivity)
  {
    super(paramActivity, WorkAccount.API, null, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  WorkAccountClient(@NonNull Context paramContext)
  {
    super(paramContext, WorkAccount.API, null, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  public Task<Account> addWorkAccount(String paramString)
  {
    return PendingResultUtil.toTask(this.zzac.addWorkAccount(asGoogleApiClient(), paramString), new zzg(this));
  }
  
  public Task<Void> removeWorkAccount(Account paramAccount)
  {
    return PendingResultUtil.toVoidTask(this.zzac.removeWorkAccount(asGoogleApiClient(), paramAccount));
  }
  
  public Task<Void> setWorkAuthenticatorEnabled(boolean paramBoolean)
  {
    return PendingResultUtil.toVoidTask(this.zzac.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), paramBoolean));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/account/WorkAccountClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */