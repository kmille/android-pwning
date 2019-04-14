package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzp
  implements Result
{
  private final Status mStatus;
  
  public zzp(Status paramStatus)
  {
    this.mStatus = paramStatus;
  }
  
  public final Status getStatus()
  {
    return this.mStatus;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */