package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

public final class BufferedOutputStream
  extends OutputStream
{
  private ArrayPool arrayPool;
  private byte[] buffer;
  private int index;
  @NonNull
  private final OutputStream out;
  
  public BufferedOutputStream(@NonNull OutputStream paramOutputStream, @NonNull ArrayPool paramArrayPool)
  {
    this(paramOutputStream, paramArrayPool, 65536);
  }
  
  @VisibleForTesting
  BufferedOutputStream(@NonNull OutputStream paramOutputStream, ArrayPool paramArrayPool, int paramInt)
  {
    this.out = paramOutputStream;
    this.arrayPool = paramArrayPool;
    this.buffer = ((byte[])paramArrayPool.get(paramInt, byte[].class));
  }
  
  private void flushBuffer()
    throws IOException
  {
    if (this.index > 0)
    {
      this.out.write(this.buffer, 0, this.index);
      this.index = 0;
    }
  }
  
  private void maybeFlushBuffer()
    throws IOException
  {
    if (this.index == this.buffer.length) {
      flushBuffer();
    }
  }
  
  private void release()
  {
    if (this.buffer != null)
    {
      this.arrayPool.put(this.buffer);
      this.buffer = null;
    }
  }
  
  public final void close()
    throws IOException
  {
    try
    {
      flush();
      this.out.close();
      release();
      return;
    }
    finally
    {
      this.out.close();
    }
  }
  
  public final void flush()
    throws IOException
  {
    flushBuffer();
    this.out.flush();
  }
  
  public final void write(int paramInt)
    throws IOException
  {
    byte[] arrayOfByte = this.buffer;
    int i = this.index;
    this.index = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
    maybeFlushBuffer();
  }
  
  public final void write(@NonNull byte[] paramArrayOfByte)
    throws IOException
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final void write(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = 0;
    int j;
    do
    {
      int k = paramInt2 - i;
      j = paramInt1 + i;
      if ((this.index == 0) && (k >= this.buffer.length))
      {
        this.out.write(paramArrayOfByte, j, k);
        return;
      }
      k = Math.min(k, this.buffer.length - this.index);
      System.arraycopy(paramArrayOfByte, j, this.buffer, this.index, k);
      this.index += k;
      j = i + k;
      maybeFlushBuffer();
      i = j;
    } while (j < paramInt2);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/data/BufferedOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */