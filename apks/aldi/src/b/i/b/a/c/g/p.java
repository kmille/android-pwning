package b.i.b.a.c.g;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;

class p
  extends d
{
  private int a = 0;
  protected final byte[] d;
  
  p(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  private static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    paramInt1 = paramInt2;
    while (paramInt1 < paramInt2 + paramInt3)
    {
      i = i * 31 + paramArrayOfByte[paramInt1];
      paramInt1 += 1;
    }
    return i;
  }
  
  public byte a(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public int a()
  {
    return this.d.length;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = b() + paramInt2;
    byte[] arrayOfByte = this.d;
    int m = paramInt3 + paramInt2;
    paramInt3 = paramInt2;
    if (paramInt1 != 0)
    {
      if (paramInt2 >= m) {
        return paramInt1;
      }
      int n = (byte)paramInt1;
      if (n < -32)
      {
        if (n >= -62)
        {
          paramInt1 = paramInt2 + 1;
          if (arrayOfByte[paramInt2] <= -65) {
            break label307;
          }
        }
        return -1;
      }
      if (n < -16)
      {
        i = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
        paramInt3 = paramInt2;
        paramInt1 = i;
        if (i == 0)
        {
          paramInt3 = paramInt2 + 1;
          paramInt1 = arrayOfByte[paramInt2];
          if (paramInt3 >= m) {
            return y.a(n, paramInt1);
          }
        }
        if ((paramInt1 <= -65) && ((n != -32) || (paramInt1 >= -96)) && ((n != -19) || (paramInt1 < -96)))
        {
          paramInt1 = paramInt3 + 1;
          if (arrayOfByte[paramInt3] <= -65) {
            break label307;
          }
        }
        return -1;
      }
      paramInt3 = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
      int i = 0;
      if (paramInt3 == 0)
      {
        j = paramInt2 + 1;
        int k = arrayOfByte[paramInt2];
        paramInt3 = k;
        paramInt2 = i;
        paramInt1 = j;
        if (j >= m) {
          return y.a(n, k);
        }
      }
      else
      {
        i = (byte)(paramInt1 >> 16);
        paramInt1 = paramInt2;
        paramInt2 = i;
      }
      int j = paramInt2;
      i = paramInt1;
      if (paramInt2 == 0)
      {
        i = paramInt1 + 1;
        j = arrayOfByte[paramInt1];
        if (i >= m) {
          return y.a(n, paramInt3, j);
        }
      }
      if ((paramInt3 <= -65) && ((n << 28) + (paramInt3 + 112) >> 30 == 0) && (j <= -65))
      {
        paramInt3 = i + 1;
        if (arrayOfByte[i] <= -65) {}
      }
      else
      {
        return -1;
      }
    }
    paramInt1 = paramInt3;
    label307:
    return y.b(arrayOfByte, paramInt1, m);
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.d, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  final boolean a(p paramp, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramp.a())
    {
      if (paramInt1 + paramInt2 <= paramp.a())
      {
        byte[] arrayOfByte1 = this.d;
        byte[] arrayOfByte2 = paramp.d;
        int j = b();
        i = b();
        paramInt1 = paramp.b() + paramInt1;
        while (i < j + paramInt2)
        {
          if (arrayOfByte1[i] != arrayOfByte2[paramInt1]) {
            return false;
          }
          i += 1;
          paramInt1 += 1;
        }
        return true;
      }
      int i = paramp.a();
      paramp = new StringBuilder(59);
      paramp.append("Ran off end of other: ");
      paramp.append(paramInt1);
      paramp.append(", ");
      paramp.append(paramInt2);
      paramp.append(", ");
      paramp.append(i);
      throw new IllegalArgumentException(paramp.toString());
    }
    paramInt1 = a();
    paramp = new StringBuilder(40);
    paramp.append("Length too large: ");
    paramp.append(paramInt2);
    paramp.append(paramInt1);
    throw new IllegalArgumentException(paramp.toString());
  }
  
  protected int b()
  {
    return 0;
  }
  
  protected final int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, this.d, b() + paramInt2, paramInt3);
  }
  
  public final String b(String paramString)
    throws UnsupportedEncodingException
  {
    return new String(this.d, b(), a(), paramString);
  }
  
  final void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
    throws IOException
  {
    paramOutputStream.write(this.d, b() + paramInt1, paramInt2);
  }
  
  public d.a c()
  {
    return new a((byte)0);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    if (a() != ((d)paramObject).a()) {
      return false;
    }
    if (a() == 0) {
      return true;
    }
    if ((paramObject instanceof p)) {
      return a((p)paramObject, 0, a());
    }
    if ((paramObject instanceof u)) {
      return paramObject.equals(this);
    }
    paramObject = String.valueOf(String.valueOf(paramObject.getClass()));
    StringBuilder localStringBuilder = new StringBuilder(((String)paramObject).length() + 49);
    localStringBuilder.append("Has a new type of ByteString been created? Found ");
    localStringBuilder.append((String)paramObject);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final boolean f()
  {
    int i = b();
    return y.a(this.d, i, a() + i);
  }
  
  public final e g()
  {
    return e.a(this);
  }
  
  public int hashCode()
  {
    int j = this.a;
    int i = j;
    if (j == 0)
    {
      i = a();
      j = b(i, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.a = i;
    }
    return i;
  }
  
  protected final int i()
  {
    return 0;
  }
  
  protected final boolean j()
  {
    return true;
  }
  
  protected final int k()
  {
    return this.a;
  }
  
  final class a
    implements d.a
  {
    private int b = 0;
    private final int c = p.this.a();
    
    private a() {}
    
    public final byte a()
    {
      try
      {
        byte[] arrayOfByte = p.this.d;
        int i = this.b;
        this.b = (i + 1);
        byte b1 = arrayOfByte[i];
        return b1;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        throw new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
      }
    }
    
    public final boolean hasNext()
    {
      return this.b < this.c;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */