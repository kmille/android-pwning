package com.google.common.io;

import com.google.common.base.j;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public final class e
{
  private static long a(Reader paramReader, StringBuilder paramStringBuilder)
    throws IOException
  {
    j.a(paramReader);
    j.a(paramStringBuilder);
    char[] arrayOfChar = new char['ࠀ'];
    int i;
    for (long l = 0L;; l += i)
    {
      i = paramReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      paramStringBuilder.append(arrayOfChar, 0, i);
    }
    return l;
  }
  
  private static long a(Readable paramReadable, Appendable paramAppendable)
    throws IOException
  {
    if ((paramReadable instanceof Reader)) {
      return a((Reader)paramReadable, (StringBuilder)paramAppendable);
    }
    j.a(paramReadable);
    j.a(paramAppendable);
    long l = 0L;
    CharBuffer localCharBuffer = CharBuffer.allocate(2048);
    while (paramReadable.read(localCharBuffer) != -1)
    {
      localCharBuffer.flip();
      paramAppendable.append(localCharBuffer);
      l += localCharBuffer.remaining();
      localCharBuffer.clear();
    }
    return l;
  }
  
  public static StringBuilder a(Readable paramReadable)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramReadable instanceof Reader))
    {
      a((Reader)paramReadable, localStringBuilder);
      return localStringBuilder;
    }
    a(paramReadable, localStringBuilder);
    return localStringBuilder;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/io/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */