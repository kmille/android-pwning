package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException
  extends UnsupportedOperationException
{
  private final Feature zzar;
  
  @KeepForSdk
  public UnsupportedApiCallException(Feature paramFeature)
  {
    this.zzar = paramFeature;
  }
  
  public final String getMessage()
  {
    String str = String.valueOf(this.zzar);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
    localStringBuilder.append("Missing ");
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/UnsupportedApiCallException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */