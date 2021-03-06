package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.internal.auth-api-phone.zzi;
import com.google.android.gms.tasks.Task;

public abstract class SmsRetrieverClient
  extends GoogleApi<Api.ApiOptions.NoOptions>
  implements SmsRetrieverApi
{
  private static final Api<Api.ApiOptions.NoOptions> API = new Api("SmsRetriever.API", CLIENT_BUILDER, CLIENT_KEY);
  private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> CLIENT_BUILDER;
  private static final Api.ClientKey<zzi> CLIENT_KEY = new Api.ClientKey();
  
  static
  {
    CLIENT_BUILDER = new zza();
  }
  
  public SmsRetrieverClient(@NonNull Activity paramActivity)
  {
    super(paramActivity, API, null, new ApiExceptionMapper());
  }
  
  public SmsRetrieverClient(@NonNull Context paramContext)
  {
    super(paramContext, API, null, new ApiExceptionMapper());
  }
  
  public abstract Task<Void> startSmsRetriever();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/phone/SmsRetrieverClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */