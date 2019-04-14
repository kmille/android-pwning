package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.internal.auth-api-phone.zzj;

public final class SmsRetriever
{
  public static final String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
  public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
  public static final String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
  
  public static SmsRetrieverClient getClient(@NonNull Activity paramActivity)
  {
    return new zzj(paramActivity);
  }
  
  public static SmsRetrieverClient getClient(@NonNull Context paramContext)
  {
    return new zzj(paramContext);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/phone/SmsRetriever.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */