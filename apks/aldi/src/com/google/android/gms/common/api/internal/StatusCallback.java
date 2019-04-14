package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

@KeepForSdk
public class StatusCallback
  extends IStatusCallback.Stub
{
  @KeepForSdk
  private final BaseImplementation.ResultHolder<Status> mResultHolder;
  
  @KeepForSdk
  public StatusCallback(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.mResultHolder = paramResultHolder;
  }
  
  @KeepForSdk
  public void onResult(Status paramStatus)
  {
    this.mResultHolder.setResult(paramStatus);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/StatusCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */