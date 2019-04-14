package com.bumptech.glide.load;

import android.support.annotation.Nullable;
import java.io.IOException;

public final class HttpException
  extends IOException
{
  public static final int UNKNOWN = -1;
  private static final long serialVersionUID = 1L;
  private final int statusCode;
  
  public HttpException(int paramInt)
  {
    this("Http request failed with status code: ".concat(String.valueOf(paramInt)), paramInt);
  }
  
  public HttpException(String paramString)
  {
    this(paramString, -1);
  }
  
  public HttpException(String paramString, int paramInt)
  {
    this(paramString, paramInt, null);
  }
  
  public HttpException(String paramString, int paramInt, @Nullable Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.statusCode = paramInt;
  }
  
  public final int getStatusCode()
  {
    return this.statusCode;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/HttpException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */