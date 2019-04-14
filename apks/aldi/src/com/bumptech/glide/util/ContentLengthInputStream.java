package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ContentLengthInputStream
  extends FilterInputStream
{
  private static final String TAG = "ContentLengthStream";
  private static final int UNKNOWN = -1;
  private final long contentLength;
  private int readSoFar;
  
  private ContentLengthInputStream(@NonNull InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.contentLength = paramLong;
  }
  
  private int checkReadSoFarOrThrow(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      this.readSoFar += paramInt;
      return paramInt;
    }
    if (this.contentLength - this.readSoFar <= 0L) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder("Failed to read all expected data, expected: ");
    localStringBuilder.append(this.contentLength);
    localStringBuilder.append(", but read: ");
    localStringBuilder.append(this.readSoFar);
    throw new IOException(localStringBuilder.toString());
  }
  
  @NonNull
  public static InputStream obtain(@NonNull InputStream paramInputStream, long paramLong)
  {
    return new ContentLengthInputStream(paramInputStream, paramLong);
  }
  
  @NonNull
  public static InputStream obtain(@NonNull InputStream paramInputStream, @Nullable String paramString)
  {
    return obtain(paramInputStream, parseContentLength(paramString));
  }
  
  private static int parseContentLength(@Nullable String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {}
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    Log.isLoggable("ContentLengthStream", 3);
    return -1;
  }
  
  public final int available()
    throws IOException
  {
    try
    {
      long l = Math.max(this.contentLength - this.readSoFar, this.in.available());
      int i = (int)l;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int read()
    throws IOException
  {
    for (;;)
    {
      try
      {
        int j = super.read();
        if (j >= 0)
        {
          i = 1;
          checkReadSoFarOrThrow(i);
          return j;
        }
      }
      finally {}
      int i = -1;
    }
  }
  
  public final int read(byte[] paramArrayOfByte)
    throws IOException
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      paramInt1 = checkReadSoFarOrThrow(super.read(paramArrayOfByte, paramInt1, paramInt2));
      return paramInt1;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/ContentLengthInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */