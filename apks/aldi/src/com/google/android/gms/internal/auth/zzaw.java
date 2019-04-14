package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class zzaw
  implements ProxyApi.ProxyResult
{
  private Status mStatus;
  private ProxyResponse zzch;
  
  public zzaw(ProxyResponse paramProxyResponse)
  {
    this.zzch = paramProxyResponse;
    this.mStatus = Status.RESULT_SUCCESS;
  }
  
  public zzaw(Status paramStatus)
  {
    this.mStatus = paramStatus;
  }
  
  public final ProxyResponse getResponse()
  {
    return this.zzch;
  }
  
  public final Status getStatus()
  {
    return this.mStatus;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/auth/zzaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */