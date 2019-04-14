package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ApiException
  extends Exception
{
  protected final Status mStatus;
  
  public ApiException(@NonNull Status paramStatus)
  {
    super(localStringBuilder.toString());
    this.mStatus = paramStatus;
  }
  
  public int getStatusCode()
  {
    return this.mStatus.getStatusCode();
  }
  
  @Deprecated
  @Nullable
  public String getStatusMessage()
  {
    return this.mStatus.getStatusMessage();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/ApiException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */