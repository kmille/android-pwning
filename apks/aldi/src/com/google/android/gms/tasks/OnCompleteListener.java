package com.google.android.gms.tasks;

import android.support.annotation.NonNull;

public abstract interface OnCompleteListener<TResult>
{
  public abstract void onComplete(@NonNull Task<TResult> paramTask);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tasks/OnCompleteListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */