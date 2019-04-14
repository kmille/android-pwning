package com.google.common.io;

import com.google.common.base.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class c
{
  private static final OutputStream a = new OutputStream()
  {
    public final String toString()
    {
      return "ByteStreams.nullOutputStream()";
    }
    
    public final void write(int paramAnonymousInt) {}
    
    public final void write(byte[] paramAnonymousArrayOfByte)
    {
      j.a(paramAnonymousArrayOfByte);
    }
    
    public final void write(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      j.a(paramAnonymousArrayOfByte);
    }
  };
  
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    j.a(paramInputStream);
    j.a(paramOutputStream);
    byte[] arrayOfByte = new byte[' '];
    int i;
    for (long l = 0L;; l += i)
    {
      i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    return l;
  }
  
  public static byte[] a(InputStream paramInputStream)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, paramInputStream.available()));
    a(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */