package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

public class Credentials
{
  public static CredentialsClient getClient(@NonNull Activity paramActivity)
  {
    return new CredentialsClient(paramActivity, CredentialsOptions.DEFAULT);
  }
  
  public static CredentialsClient getClient(@NonNull Activity paramActivity, @NonNull CredentialsOptions paramCredentialsOptions)
  {
    return new CredentialsClient(paramActivity, paramCredentialsOptions);
  }
  
  public static CredentialsClient getClient(@NonNull Context paramContext)
  {
    return new CredentialsClient(paramContext, CredentialsOptions.DEFAULT);
  }
  
  public static CredentialsClient getClient(@NonNull Context paramContext, @NonNull CredentialsOptions paramCredentialsOptions)
  {
    return new CredentialsClient(paramContext, paramCredentialsOptions);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credentials.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */