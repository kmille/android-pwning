package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class zzax
  implements ProxyApi.SpatulaHeaderResult
{
  private Status mStatus;
  private String zzci;
  
  public zzax(@Nonnull Status paramStatus)
  {
    this.mStatus = ((Status)Preconditions.checkNotNull(paramStatus));
  }
  
  public zzax(@Nonnull String paramString)
  {
    this.zzci = ((String)Preconditions.checkNotNull(paramString));
    this.mStatus = Status.RESULT_SUCCESS;
  }
  
  @Nullable
  public final String getSpatulaHeader()
  {
    return this.zzci;
  }
  
  @Nullable
  public final Status getStatus()
  {
    return this.mStatus;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */