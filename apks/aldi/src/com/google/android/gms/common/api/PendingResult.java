package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public abstract class PendingResult<R extends Result>
{
  @KeepForSdk
  public void addStatusListener(@NonNull StatusListener paramStatusListener)
  {
    throw new UnsupportedOperationException();
  }
  
  @NonNull
  public abstract R await();
  
  @NonNull
  public abstract R await(long paramLong, @NonNull TimeUnit paramTimeUnit);
  
  public abstract void cancel();
  
  public abstract boolean isCanceled();
  
  public abstract void setResultCallback(@NonNull ResultCallback<? super R> paramResultCallback);
  
  public abstract void setResultCallback(@NonNull ResultCallback<? super R> paramResultCallback, long paramLong, @NonNull TimeUnit paramTimeUnit);
  
  @NonNull
  public <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    throw new UnsupportedOperationException();
  }
  
  @Nullable
  public Integer zam()
  {
    throw new UnsupportedOperationException();
  }
  
  @KeepForSdk
  public static abstract interface StatusListener
  {
    @KeepForSdk
    public abstract void onComplete(Status paramStatus);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/PendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */