package com.google.common.a;

import com.google.common.base.j;
import java.nio.charset.Charset;

abstract class c
  implements f
{
  public final f a(CharSequence paramCharSequence, Charset paramCharset)
  {
    return a(paramCharSequence.toString().getBytes(paramCharset));
  }
  
  public f a(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public f b(byte[] paramArrayOfByte, int paramInt)
  {
    int j = paramArrayOfByte.length;
    int i = 0;
    j.a(0, paramInt + 0, j);
    while (i < paramInt)
    {
      b(paramArrayOfByte[(i + 0)]);
      i += 1;
    }
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */