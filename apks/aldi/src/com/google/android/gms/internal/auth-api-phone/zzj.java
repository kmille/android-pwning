package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;

public final class zzj
  extends SmsRetrieverClient
{
  public zzj(@NonNull Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public zzj(@NonNull Context paramContext)
  {
    super(paramContext);
  }
  
  public final Task<Void> startSmsRetriever()
  {
    return doWrite(new zzk(this));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth-api-phone/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */