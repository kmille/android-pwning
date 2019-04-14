package com.bumptech.glide.load.resource.bitmap;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream
  extends FilterInputStream
{
  private volatile byte[] buf;
  private final ArrayPool byteArrayPool;
  private int count;
  private int marklimit;
  private int markpos = -1;
  private int pos;
  
  public RecyclableBufferedInputStream(@NonNull InputStream paramInputStream, @NonNull ArrayPool paramArrayPool)
  {
    this(paramInputStream, paramArrayPool, 65536);
  }
  
  @VisibleForTesting
  RecyclableBufferedInputStream(@NonNull InputStream paramInputStream, @NonNull ArrayPool paramArrayPool, int paramInt)
  {
    super(paramInputStream);
    this.byteArrayPool = paramArrayPool;
    this.buf = ((byte[])paramArrayPool.get(paramInt, byte[].class));
  }
  
  private int fillbuf(InputStream paramInputStream, byte[] paramArrayOfByte)
    throws IOException
  {
    if ((this.markpos != -1) && (this.pos - this.markpos < this.marklimit))
    {
      byte[] arrayOfByte;
      if ((this.markpos == 0) && (this.marklimit > paramArrayOfByte.length) && (this.count == paramArrayOfByte.length))
      {
        j = paramArrayOfByte.length * 2;
        i = j;
        if (j > this.marklimit) {
          i = this.marklimit;
        }
        arrayOfByte = (byte[])this.byteArrayPool.get(i, byte[].class);
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
        this.buf = arrayOfByte;
        this.byteArrayPool.put(paramArrayOfByte);
      }
      else
      {
        arrayOfByte = paramArrayOfByte;
        if (this.markpos > 0)
        {
          System.arraycopy(paramArrayOfByte, this.markpos, paramArrayOfByte, 0, paramArrayOfByte.length - this.markpos);
          arrayOfByte = paramArrayOfByte;
        }
      }
      this.pos -= this.markpos;
      this.markpos = 0;
      this.count = 0;
      int j = paramInputStream.read(arrayOfByte, this.pos, arrayOfByte.length - this.pos);
      if (j <= 0) {
        i = this.pos;
      } else {
        i = this.pos + j;
      }
      this.count = i;
      return j;
    }
    int i = paramInputStream.read(paramArrayOfByte);
    if (i > 0)
    {
      this.markpos = -1;
      this.pos = 0;
      this.count = i;
    }
    return i;
  }
  
  private static IOException streamClosed()
    throws IOException
  {
    throw new IOException("BufferedInputStream is closed");
  }
  
  public int available()
    throws IOException
  {
    try
    {
      InputStream localInputStream = this.in;
      if ((this.buf != null) && (localInputStream != null))
      {
        int i = this.count;
        int j = this.pos;
        int k = localInputStream.available();
        return i - j + k;
      }
      throw streamClosed();
    }
    finally {}
  }
  
  public void close()
    throws IOException
  {
    if (this.buf != null)
    {
      this.byteArrayPool.put(this.buf);
      this.buf = null;
    }
    InputStream localInputStream = this.in;
    this.in = null;
    if (localInputStream != null) {
      localInputStream.close();
    }
  }
  
  public void fixMarkLimit()
  {
    try
    {
      this.marklimit = this.buf.length;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void mark(int paramInt)
  {
    try
    {
      this.marklimit = Math.max(this.marklimit, paramInt);
      this.markpos = this.pos;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.buf;
      Object localObject1 = this.in;
      if ((arrayOfByte != null) && (localObject1 != null))
      {
        int i;
        if (this.pos >= this.count)
        {
          i = fillbuf((InputStream)localObject1, arrayOfByte);
          if (i == -1) {
            return -1;
          }
        }
        localObject1 = arrayOfByte;
        if (arrayOfByte != this.buf)
        {
          localObject1 = this.buf;
          if (localObject1 == null) {
            throw streamClosed();
          }
        }
        if (this.count - this.pos > 0)
        {
          i = this.pos;
          this.pos = (i + 1);
          i = localObject1[i];
          return i & 0xFF;
        }
        return -1;
      }
      throw streamClosed();
    }
    finally {}
  }
  
  public int read(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    for (;;)
    {
      int i;
      int j;
      try
      {
        Object localObject1 = this.buf;
        if (localObject1 != null)
        {
          if (paramInt2 == 0) {
            return 0;
          }
          InputStream localInputStream = this.in;
          if (localInputStream != null)
          {
            if (this.pos < this.count)
            {
              if (this.count - this.pos >= paramInt2) {
                i = paramInt2;
              } else {
                i = this.count - this.pos;
              }
              System.arraycopy(localObject1, this.pos, paramArrayOfByte, paramInt1, i);
              this.pos += i;
              if (i != paramInt2)
              {
                j = localInputStream.available();
                if (j != 0)
                {
                  j = paramInt1 + i;
                  paramInt1 = paramInt2 - i;
                  i = j;
                  continue;
                }
              }
              return i;
            }
            else
            {
              j = paramInt2;
              i = paramInt1;
              paramInt1 = j;
            }
            if ((this.markpos == -1) && (paramInt1 >= localObject1.length))
            {
              int k = localInputStream.read(paramArrayOfByte, i, paramInt1);
              j = k;
              if (k == -1)
              {
                i = paramInt1;
                if (paramInt1 == paramInt2) {
                  return -1;
                }
                return paramInt2 - i;
              }
            }
            else
            {
              j = fillbuf(localInputStream, (byte[])localObject1);
              if (j == -1)
              {
                i = paramInt1;
                if (paramInt1 != paramInt2) {
                  continue;
                }
                return -1;
              }
              Object localObject2 = localObject1;
              if (localObject1 != this.buf)
              {
                localObject2 = this.buf;
                if (localObject2 == null) {
                  throw streamClosed();
                }
              }
              if (this.count - this.pos >= paramInt1) {
                j = paramInt1;
              } else {
                j = this.count - this.pos;
              }
              System.arraycopy(localObject2, this.pos, paramArrayOfByte, i, j);
              this.pos += j;
              localObject1 = localObject2;
            }
            paramInt1 -= j;
            if (paramInt1 == 0) {
              return paramInt2;
            }
            if (localInputStream.available() == 0)
            {
              i = paramInt1;
              continue;
            }
          }
          else
          {
            throw streamClosed();
          }
        }
        else
        {
          throw streamClosed();
        }
      }
      finally {}
      i += j;
    }
  }
  
  public void release()
  {
    try
    {
      if (this.buf != null)
      {
        this.byteArrayPool.put(this.buf);
        this.buf = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void reset()
    throws IOException
  {
    try
    {
      if (this.buf != null)
      {
        if (-1 != this.markpos)
        {
          this.pos = this.markpos;
          return;
        }
        StringBuilder localStringBuilder = new StringBuilder("Mark has been invalidated, pos: ");
        localStringBuilder.append(this.pos);
        localStringBuilder.append(" markLimit: ");
        localStringBuilder.append(this.marklimit);
        throw new InvalidMarkException(localStringBuilder.toString());
      }
      throw new IOException("Stream is closed");
    }
    finally {}
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    if (paramLong < 1L) {
      return 0L;
    }
    try
    {
      byte[] arrayOfByte = this.buf;
      if (arrayOfByte != null)
      {
        InputStream localInputStream = this.in;
        if (localInputStream != null)
        {
          if (this.count - this.pos >= paramLong)
          {
            this.pos = ((int)(this.pos + paramLong));
            return paramLong;
          }
          long l1 = this.count - this.pos;
          this.pos = this.count;
          if ((this.markpos != -1) && (paramLong <= this.marklimit))
          {
            int i = fillbuf(localInputStream, arrayOfByte);
            if (i == -1) {
              return l1;
            }
            if (this.count - this.pos >= paramLong - l1)
            {
              this.pos = ((int)(this.pos + paramLong - l1));
              return paramLong;
            }
            paramLong = this.count;
            long l2 = this.pos;
            this.pos = this.count;
            return l1 + paramLong - l2;
          }
          paramLong = localInputStream.skip(paramLong - l1);
          return l1 + paramLong;
        }
        throw streamClosed();
      }
      throw streamClosed();
    }
    finally {}
  }
  
  static class InvalidMarkException
    extends IOException
  {
    private static final long serialVersionUID = -4338378848813561757L;
    
    InvalidMarkException(String paramString)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */