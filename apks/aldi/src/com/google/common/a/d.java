package com.google.common.a;

import com.google.common.base.j;
import java.io.Serializable;
import javax.annotation.Nullable;

public abstract class d
{
  private static final char[] a = "0123456789abcdef".toCharArray();
  
  static d a(byte[] paramArrayOfByte)
  {
    return new a(paramArrayOfByte);
  }
  
  public abstract int a();
  
  abstract boolean a(d paramd);
  
  public abstract int b();
  
  public abstract byte[] c();
  
  byte[] d()
  {
    return c();
  }
  
  public final boolean equals(@Nullable Object paramObject)
  {
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      if ((a() == ((d)paramObject).a()) && (a((d)paramObject))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (a() >= 32) {
      return b();
    }
    byte[] arrayOfByte = d();
    int j = arrayOfByte[0] & 0xFF;
    int i = 1;
    while (i < arrayOfByte.length)
    {
      j |= (arrayOfByte[i] & 0xFF) << i * 8;
      i += 1;
    }
    return j;
  }
  
  public final String toString()
  {
    byte[] arrayOfByte = d();
    StringBuilder localStringBuilder = new StringBuilder(arrayOfByte.length * 2);
    int j = arrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfByte[i];
      localStringBuilder.append(a[(k >> 4 & 0xF)]);
      localStringBuilder.append(a[(k & 0xF)]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  static final class a
    extends d
    implements Serializable
  {
    final byte[] a;
    
    a(byte[] paramArrayOfByte)
    {
      this.a = ((byte[])j.a(paramArrayOfByte));
    }
    
    public final int a()
    {
      return this.a.length * 8;
    }
    
    final boolean a(d paramd)
    {
      if (this.a.length != paramd.d().length) {
        return false;
      }
      int i = 0;
      boolean bool2 = true;
      while (i < this.a.length)
      {
        boolean bool1;
        if (this.a[i] == paramd.d()[i]) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        bool2 &= bool1;
        i += 1;
      }
      return bool2;
    }
    
    public final int b()
    {
      int i;
      if (this.a.length >= 4) {
        i = 1;
      } else {
        i = 0;
      }
      int j = this.a.length;
      if (i != 0) {
        return this.a[0] & 0xFF | (this.a[1] & 0xFF) << 8 | (this.a[2] & 0xFF) << 16 | (this.a[3] & 0xFF) << 24;
      }
      throw new IllegalStateException(j.a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] { Integer.valueOf(j) }));
    }
    
    public final byte[] c()
    {
      return (byte[])this.a.clone();
    }
    
    final byte[] d()
    {
      return this.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */