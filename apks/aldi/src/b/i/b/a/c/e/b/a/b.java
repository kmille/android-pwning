package b.i.b.a.c.e.b.a;

import b.f.b.j;
import b.w;

public class b
{
  private static final boolean b;
  
  static
  {
    try
    {
      str = System.getProperty("kotlin.jvm.serialization.use8to7");
    }
    catch (SecurityException localSecurityException)
    {
      String str;
      for (;;) {}
    }
    str = null;
    b = "true".equals(str);
  }
  
  private static void a(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] + Byte.MAX_VALUE & 0x7F));
      i += 1;
    }
  }
  
  public static byte[] a(String[] paramArrayOfString)
  {
    Object localObject = paramArrayOfString;
    if (paramArrayOfString.length > 0)
    {
      int n = 0;
      localObject = paramArrayOfString;
      if (!paramArrayOfString[0].isEmpty())
      {
        int i = paramArrayOfString[0].charAt(0);
        if (i == 0)
        {
          paramArrayOfString = b(paramArrayOfString);
          j.b(paramArrayOfString, "strings");
          int k = paramArrayOfString.length;
          i = 0;
          int j = 0;
          while (i < k)
          {
            j += paramArrayOfString[i].length();
            i += 1;
          }
          localObject = new byte[j];
          int i1 = paramArrayOfString.length;
          j = 0;
          for (i = 0; j < i1; i = k)
          {
            String str = paramArrayOfString[j];
            int i2 = str.length() - 1;
            k = i;
            if (i2 >= 0)
            {
              k = 0;
              int m;
              for (;;)
              {
                m = i + 1;
                localObject[i] = ((byte)str.charAt(k));
                if (k == i2) {
                  break;
                }
                k += 1;
                i = m;
              }
              k = m;
            }
            j += 1;
          }
          j = n;
          if (i == localObject.length) {
            j = 1;
          }
          if (w.a)
          {
            if (j != 0) {
              return (byte[])localObject;
            }
            throw ((Throwable)new AssertionError("Should have reached the end"));
          }
          return (byte[])localObject;
        }
        localObject = paramArrayOfString;
        if (i == 65535) {
          localObject = b(paramArrayOfString);
        }
      }
    }
    paramArrayOfString = c((String[])localObject);
    a(paramArrayOfString);
    return b(paramArrayOfString);
  }
  
  private static byte[] b(byte[] paramArrayOfByte)
  {
    int n = paramArrayOfByte.length * 7 / 8;
    byte[] arrayOfByte = new byte[n];
    int k = 0;
    int j = 0;
    int i = 0;
    while (k < n)
    {
      int i1 = paramArrayOfByte[j];
      j += 1;
      int i2 = paramArrayOfByte[j];
      int m = i + 1;
      arrayOfByte[k] = ((byte)(((i1 & 0xFF) >>> i) + ((i2 & (1 << m) - 1) << 7 - i)));
      if (i == 6)
      {
        j += 1;
        i = 0;
      }
      else
      {
        i = m;
      }
      k += 1;
    }
    return arrayOfByte;
  }
  
  private static String[] b(String[] paramArrayOfString)
  {
    paramArrayOfString = (String[])paramArrayOfString.clone();
    paramArrayOfString[0] = paramArrayOfString[0].substring(1);
    return paramArrayOfString;
  }
  
  private static byte[] c(String[] paramArrayOfString)
  {
    int k = paramArrayOfString.length;
    int i = 0;
    int j = 0;
    while (i < k)
    {
      localObject = paramArrayOfString[i];
      if ((!a) && (((String)localObject).length() > 65535))
      {
        paramArrayOfString = new StringBuilder("String is too long: ");
        paramArrayOfString.append(((String)localObject).length());
        throw new AssertionError(paramArrayOfString.toString());
      }
      j += ((String)localObject).length();
      i += 1;
    }
    Object localObject = new byte[j];
    int m = paramArrayOfString.length;
    j = 0;
    i = 0;
    while (j < m)
    {
      String str = paramArrayOfString[j];
      int n = str.length();
      k = 0;
      while (k < n)
      {
        localObject[i] = ((byte)str.charAt(k));
        k += 1;
        i += 1;
      }
      j += 1;
    }
    return (byte[])localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */