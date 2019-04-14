package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

public final class zzq
{
  public static PendingIntent zzc(Context paramContext, @Nullable Auth.AuthCredentialsOptions paramAuthCredentialsOptions, HintRequest paramHintRequest)
  {
    Preconditions.checkNotNull(paramContext, "context must not be null");
    Preconditions.checkNotNull(paramHintRequest, "request must not be null");
    paramAuthCredentialsOptions = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
    SafeParcelableSerializer.serializeToIntentExtra(paramHintRequest, paramAuthCredentialsOptions, "com.google.android.gms.credentials.HintRequest");
    return PendingIntent.getActivity(paramContext, 2000, paramAuthCredentialsOptions, 134217728);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api/zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */