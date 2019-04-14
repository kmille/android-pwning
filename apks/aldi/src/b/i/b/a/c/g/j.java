package b.i.b.a.c.g;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class j
{
  public static final byte[] a;
  public static final ByteBuffer b;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    a = arrayOfByte;
    b = ByteBuffer.wrap(arrayOfByte);
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return y.a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "UTF-8");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new RuntimeException("UTF-8 not supported?", paramArrayOfByte);
    }
  }
  
  public static abstract interface a
  {
    public abstract int a();
  }
  
  public static abstract interface b<T extends j.a>
  {
    public abstract T a(int paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */