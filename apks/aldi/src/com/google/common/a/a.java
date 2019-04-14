package com.google.common.a;

import com.google.common.base.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class a
  extends c
{
  private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
  
  public final f a(byte[] paramArrayOfByte)
  {
    j.a(paramArrayOfByte);
    a(paramArrayOfByte, paramArrayOfByte.length);
    return this;
  }
  
  protected abstract void a(byte paramByte);
  
  protected void a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    while (i < paramInt + 0)
    {
      a(paramArrayOfByte[i]);
      i += 1;
    }
  }
  
  public final f b(byte paramByte)
  {
    a(paramByte);
    return this;
  }
  
  public final f b(byte[] paramArrayOfByte, int paramInt)
  {
    j.a(0, paramInt + 0, paramArrayOfByte.length);
    a(paramArrayOfByte, paramInt);
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */