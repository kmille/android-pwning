package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract interface SuccessContinuation<TResult, TContinuationResult>
{
  @NonNull
  public abstract Task<TContinuationResult> then(@Nullable TResult paramTResult)
    throws Exception;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/SuccessContinuation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */