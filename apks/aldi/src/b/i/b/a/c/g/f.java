package b.i.b.a.c.g;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class f
{
  private final byte[] a;
  private final int b;
  private int c;
  private int d = 0;
  private final OutputStream e;
  
  private f(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    this.e = paramOutputStream;
    this.a = paramArrayOfByte;
    this.c = 0;
    this.b = paramArrayOfByte.length;
  }
  
  public static int a(m paramm)
  {
    int i = paramm.b();
    return f(i) + i;
  }
  
  public static f a(OutputStream paramOutputStream, int paramInt)
  {
    return new f(paramOutputStream, new byte[paramInt]);
  }
  
  private void a(byte paramByte)
    throws IOException
  {
    if (this.c == this.b) {
      b();
    }
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = paramByte;
    this.d += 1;
  }
  
  private void a(d paramd, int paramInt)
    throws IOException
  {
    if (this.b - this.c >= paramInt)
    {
      paramd.b(this.a, 0, this.c, paramInt);
      this.c += paramInt;
    }
    else
    {
      int i = this.b - this.c;
      paramd.b(this.a, 0, this.c, i);
      int j = i + 0;
      paramInt -= i;
      this.c = this.b;
      this.d += i;
      b();
      if (paramInt <= this.b)
      {
        paramd.b(this.a, j, 0, paramInt);
        this.c = paramInt;
      }
      else
      {
        paramd.a(this.e, j, paramInt);
      }
    }
    this.d += paramInt;
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
    throws IOException
  {
    if (this.b - this.c >= paramInt)
    {
      System.arraycopy(paramArrayOfByte, 0, this.a, this.c, paramInt);
      this.c += paramInt;
    }
    else
    {
      int i = this.b - this.c;
      System.arraycopy(paramArrayOfByte, 0, this.a, this.c, i);
      int j = i + 0;
      paramInt -= i;
      this.c = this.b;
      this.d += i;
      b();
      if (paramInt <= this.b)
      {
        System.arraycopy(paramArrayOfByte, j, this.a, 0, paramInt);
        this.c = paramInt;
      }
      else
      {
        this.e.write(paramArrayOfByte, j, paramInt);
      }
    }
    this.d += paramInt;
  }
  
  public static int b(int paramInt, d paramd)
  {
    return d(paramInt) + b(paramd);
  }
  
  public static int b(long paramLong)
  {
    return d(2) + d(f(paramLong));
  }
  
  public static int b(d paramd)
  {
    return f(paramd.a()) + paramd.a();
  }
  
  public static int b(q paramq)
  {
    int i = paramq.f();
    return f(i) + i;
  }
  
  public static int b(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int i = f(paramString.length);
      int j = paramString.length;
      return i + j;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported.", paramString);
    }
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    return f(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  private void b()
    throws IOException
  {
    if (this.e != null)
    {
      this.e.write(this.a, 0, this.c);
      this.c = 0;
      return;
    }
    throw new a();
  }
  
  public static int c(int paramInt)
  {
    if (paramInt >= 0) {
      return f(paramInt);
    }
    return 10;
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    return d(paramInt1) + c(paramInt2);
  }
  
  public static int c(int paramInt, q paramq)
  {
    return d(paramInt) + b(paramq);
  }
  
  public static int d(int paramInt)
  {
    return f(z.a(paramInt, 0));
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    return d(paramInt1) + c(paramInt2);
  }
  
  public static int d(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0xFFFFFFF800000000 & paramLong) == 0L) {
      return 5;
    }
    if ((0xFFFFFC0000000000 & paramLong) == 0L) {
      return 6;
    }
    if ((0xFFFE000000000000 & paramLong) == 0L) {
      return 7;
    }
    if ((0xFF00000000000000 & paramLong) == 0L) {
      return 8;
    }
    if ((paramLong & 0x8000000000000000) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public static int f(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static long f(long paramLong)
  {
    return paramLong >> 63 ^ paramLong << 1;
  }
  
  public static int h(int paramInt)
  {
    return paramInt >> 31 ^ paramInt << 1;
  }
  
  public final void a()
    throws IOException
  {
    if (this.e != null) {
      b();
    }
  }
  
  public final void a(double paramDouble)
    throws IOException
  {
    e(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(float paramFloat)
    throws IOException
  {
    g(Float.floatToRawIntBits(paramFloat));
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      e(paramInt);
      return;
    }
    c(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
    throws IOException
  {
    e(paramInt1, 0);
    a(paramInt2);
  }
  
  public final void a(int paramInt, d paramd)
    throws IOException
  {
    e(paramInt, 2);
    a(paramd);
  }
  
  public final void a(int paramInt, q paramq)
    throws IOException
  {
    e(paramInt, 2);
    a(paramq);
  }
  
  public final void a(long paramLong)
    throws IOException
  {
    c(f(paramLong));
  }
  
  public final void a(d paramd)
    throws IOException
  {
    e(paramd.a());
    c(paramd);
  }
  
  public final void a(q paramq)
    throws IOException
  {
    e(paramq.f());
    paramq.a(this);
  }
  
  public final void a(String paramString)
    throws IOException
  {
    paramString = paramString.getBytes("UTF-8");
    e(paramString.length);
    a(paramString, paramString.length);
  }
  
  public final void a(boolean paramBoolean)
    throws IOException
  {
    e(3, 0);
    b(paramBoolean);
  }
  
  public final void a(byte[] paramArrayOfByte)
    throws IOException
  {
    e(paramArrayOfByte.length);
    a(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public final void b(int paramInt)
    throws IOException
  {
    e(h(paramInt));
  }
  
  public final void b(int paramInt1, int paramInt2)
    throws IOException
  {
    e(paramInt1, 0);
    a(paramInt2);
  }
  
  public final void b(int paramInt, q paramq)
    throws IOException
  {
    e(1, 3);
    e(2, 0);
    e(paramInt);
    a(3, paramq);
    e(1, 4);
  }
  
  public final void b(boolean paramBoolean)
    throws IOException
  {
    a((byte)paramBoolean);
  }
  
  public final void c(long paramLong)
    throws IOException
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        a((byte)(int)paramLong);
        return;
      }
      a((byte)((int)paramLong & 0x7F | 0x80));
      paramLong >>>= 7;
    }
  }
  
  public final void c(d paramd)
    throws IOException
  {
    a(paramd, paramd.a());
  }
  
  public final void e(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        a((byte)paramInt);
        return;
      }
      a((byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }
  
  public final void e(int paramInt1, int paramInt2)
    throws IOException
  {
    e(z.a(paramInt1, paramInt2));
  }
  
  public final void e(long paramLong)
    throws IOException
  {
    a((byte)((int)paramLong & 0xFF));
    a((byte)((int)(paramLong >> 8) & 0xFF));
    a((byte)((int)(paramLong >> 16) & 0xFF));
    a((byte)((int)(paramLong >> 24) & 0xFF));
    a((byte)((int)(paramLong >> 32) & 0xFF));
    a((byte)((int)(paramLong >> 40) & 0xFF));
    a((byte)((int)(paramLong >> 48) & 0xFF));
    a((byte)((int)(paramLong >> 56) & 0xFF));
  }
  
  public final void g(int paramInt)
    throws IOException
  {
    a((byte)(paramInt & 0xFF));
    a((byte)(paramInt >> 8 & 0xFF));
    a((byte)(paramInt >> 16 & 0xFF));
    a((byte)(paramInt >> 24 & 0xFF));
  }
  
  public static final class a
    extends IOException
  {
    a()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */