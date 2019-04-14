package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkEnforcingInputStream
  extends FilterInputStream
{
  private static final int END_OF_STREAM = -1;
  private static final int UNSET = Integer.MIN_VALUE;
  private int availableBytes = Integer.MIN_VALUE;
  
  public MarkEnforcingInputStream(@NonNull InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  private long getBytesToRead(long paramLong)
  {
    if (this.availableBytes == 0) {
      return -1L;
    }
    long l = paramLong;
    if (this.availableBytes != Integer.MIN_VALUE)
    {
      l = paramLong;
      if (paramLong > this.availableBytes) {
        l = this.availableBytes;
      }
    }
    return l;
  }
  
  private void updateAvailableBytesAfterRead(long paramLong)
  {
    if ((this.availableBytes != Integer.MIN_VALUE) && (paramLong != -1L)) {
      this.availableBytes = ((int)(this.availableBytes - paramLong));
    }
  }
  
  public int available()
    throws IOException
  {
    if (this.availableBytes == Integer.MIN_VALUE) {
      return super.available();
    }
    return Math.min(this.availableBytes, super.available());
  }
  
  public void mark(int paramInt)
  {
    try
    {
      super.mark(paramInt);
      this.availableBytes = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int read()
    throws IOException
  {
    if (getBytesToRead(1L) == -1L) {
      return -1;
    }
    int i = super.read();
    updateAvailableBytesAfterRead(1L);
    return i;
  }
  
  public int read(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt2 = (int)getBytesToRead(paramInt2);
    if (paramInt2 == -1) {
      return -1;
    }
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    updateAvailableBytesAfterRead(paramInt1);
    return paramInt1;
  }
  
  public void reset()
    throws IOException
  {
    try
    {
      super.reset();
      this.availableBytes = Integer.MIN_VALUE;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    paramLong = getBytesToRead(paramLong);
    if (paramLong == -1L) {
      return 0L;
    }
    paramLong = super.skip(paramLong);
    updateAvailableBytesAfterRead(paramLong);
    return paramLong;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/MarkEnforcingInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */