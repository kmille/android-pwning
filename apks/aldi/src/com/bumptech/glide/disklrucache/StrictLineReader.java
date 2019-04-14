package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StrictLineReader
  implements Closeable
{
  private static final byte CR = 13;
  private static final byte LF = 10;
  private byte[] buf;
  private final Charset charset;
  private int end;
  private final InputStream in;
  private int pos;
  
  public StrictLineReader(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream != null) && (paramCharset != null))
    {
      if (paramInt >= 0)
      {
        if (paramCharset.equals(Util.US_ASCII))
        {
          this.in = paramInputStream;
          this.charset = paramCharset;
          this.buf = new byte[paramInt];
          return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
      }
      throw new IllegalArgumentException("capacity <= 0");
    }
    throw new NullPointerException();
  }
  
  public StrictLineReader(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void fillBuf()
    throws IOException
  {
    int i = this.in.read(this.buf, 0, this.buf.length);
    if (i != -1)
    {
      this.pos = 0;
      this.end = i;
      return;
    }
    throw new EOFException();
  }
  
  public void close()
    throws IOException
  {
    synchronized (this.in)
    {
      if (this.buf != null)
      {
        this.buf = null;
        this.in.close();
      }
      return;
    }
  }
  
  public boolean hasUnterminatedLine()
  {
    return this.end == -1;
  }
  
  public String readLine()
    throws IOException
  {
    for (;;)
    {
      int i;
      synchronized (this.in)
      {
        if (this.buf != null)
        {
          if (this.pos >= this.end) {
            fillBuf();
          }
          i = this.pos;
          Object localObject1;
          if (i != this.end)
          {
            if (this.buf[i] != 10) {
              break label270;
            }
            if (i != this.pos)
            {
              localObject1 = this.buf;
              j = i - 1;
              if (localObject1[j] == 13)
              {
                localObject1 = new String(this.buf, this.pos, j - this.pos, this.charset.name());
                this.pos = (i + 1);
                return (String)localObject1;
              }
            }
          }
          else
          {
            localObject1 = new ByteArrayOutputStream(this.end - this.pos + 80)
            {
              public String toString()
              {
                int i;
                if ((this.count > 0) && (this.buf[(this.count - 1)] == 13)) {
                  i = this.count - 1;
                } else {
                  i = this.count;
                }
                try
                {
                  String str = new String(this.buf, 0, i, StrictLineReader.this.charset.name());
                  return str;
                }
                catch (UnsupportedEncodingException localUnsupportedEncodingException)
                {
                  throw new AssertionError(localUnsupportedEncodingException);
                }
              }
            };
            ((ByteArrayOutputStream)localObject1).write(this.buf, this.pos, this.end - this.pos);
            this.end = -1;
            fillBuf();
            i = this.pos;
            if (i == this.end) {
              continue;
            }
            if (this.buf[i] != 10) {
              break label277;
            }
            if (i != this.pos) {
              ((ByteArrayOutputStream)localObject1).write(this.buf, this.pos, i - this.pos);
            }
            this.pos = (i + 1);
            localObject1 = ((ByteArrayOutputStream)localObject1).toString();
            return (String)localObject1;
          }
        }
        else
        {
          throw new IOException("LineReader is closed");
        }
      }
      int j = i;
      continue;
      label270:
      i += 1;
      continue;
      label277:
      i += 1;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/disklrucache/StrictLineReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */