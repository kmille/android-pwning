package com.google.android.gms.common.api;

import android.support.annotation.NonNull;

public class Response<T extends Result>
{
  private T zzao;
  
  public Response() {}
  
  protected Response(@NonNull T paramT)
  {
    this.zzao = paramT;
  }
  
  @NonNull
  protected T getResult()
  {
    return this.zzao;
  }
  
  public void setResult(@NonNull T paramT)
  {
    this.zzao = paramT;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */