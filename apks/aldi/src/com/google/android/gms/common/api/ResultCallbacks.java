package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResultCallbacks<R extends Result>
  implements ResultCallback<R>
{
  public abstract void onFailure(@NonNull Status paramStatus);
  
  @KeepForSdk
  public final void onResult(@NonNull R paramR)
  {
    Object localObject = paramR.getStatus();
    if (((Status)localObject).isSuccess())
    {
      onSuccess(paramR);
      return;
    }
    onFailure((Status)localObject);
    if ((paramR instanceof Releasable)) {}
    try
    {
      ((Releasable)paramR).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
    paramR = String.valueOf(paramR);
    localObject = new StringBuilder(String.valueOf(paramR).length() + 18);
    ((StringBuilder)localObject).append("Unable to release ");
    ((StringBuilder)localObject).append(paramR);
  }
  
  public abstract void onSuccess(@NonNull R paramR);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/ResultCallbacks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */