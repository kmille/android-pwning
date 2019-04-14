package b.i.b.a.c.g;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  final byte[] a;
  int b;
  int c;
  int d;
  int e = 64;
  private final boolean f;
  private int g;
  private final InputStream h;
  private int i;
  private boolean j = false;
  private int k;
  private int l = Integer.MAX_VALUE;
  private int m = 67108864;
  private a n = null;
  
  private e(p paramp)
  {
    this.a = paramp.d;
    this.c = paramp.b();
    this.b = (this.c + paramp.a());
    this.k = (-this.c);
    this.h = null;
    this.f = true;
  }
  
  private e(InputStream paramInputStream)
  {
    this.a = new byte['က'];
    this.b = 0;
    this.c = 0;
    this.k = 0;
    this.h = paramInputStream;
    this.f = false;
  }
  
  public static long a(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  static e a(p paramp)
  {
    e locale = new e(paramp);
    try
    {
      locale.b(paramp.a());
      return locale;
    }
    catch (k paramp)
    {
      throw new IllegalArgumentException(paramp);
    }
  }
  
  public static e a(InputStream paramInputStream)
  {
    return new e(paramInputStream);
  }
  
  private void e(int paramInt)
    throws IOException
  {
    if (f(paramInt)) {
      return;
    }
    throw k.a();
  }
  
  private boolean f(int paramInt)
    throws IOException
  {
    while (this.c + paramInt > this.b)
    {
      if (this.k + this.c + paramInt > this.l) {
        return false;
      }
      if (this.h != null)
      {
        int i1 = this.c;
        if (i1 > 0)
        {
          if (this.b > i1)
          {
            localObject = this.a;
            System.arraycopy(localObject, i1, localObject, 0, this.b - i1);
          }
          this.k += i1;
          this.b -= i1;
          this.c = 0;
        }
        i1 = this.h.read(this.a, this.b, this.a.length - this.b);
        if ((i1 != 0) && (i1 >= -1) && (i1 <= this.a.length))
        {
          if (i1 > 0)
          {
            this.b += i1;
            if (this.k + paramInt - this.m <= 0)
            {
              j();
              if (this.b < paramInt) {
                continue;
              }
              return true;
            }
            throw k.h();
          }
        }
        else
        {
          localObject = new StringBuilder(102);
          ((StringBuilder)localObject).append("InputStream#read(byte[]) returned invalid result: ");
          ((StringBuilder)localObject).append(i1);
          ((StringBuilder)localObject).append("\nThe InputStream implementation is buggy.");
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
      }
      return false;
    }
    Object localObject = new StringBuilder(77);
    ((StringBuilder)localObject).append("refillBuffer() called when ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" bytes were already available in buffer");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  private void g(int paramInt)
    throws IOException
  {
    if ((paramInt <= this.b - this.c) && (paramInt >= 0))
    {
      this.c += paramInt;
      return;
    }
    h(paramInt);
  }
  
  private void h(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      if (this.k + this.c + paramInt <= this.l)
      {
        int i1 = this.b - this.c;
        int i2;
        for (this.c = this.b;; this.c = this.b)
        {
          e(1);
          i2 = paramInt - i1;
          if (i2 <= this.b) {
            break;
          }
          i1 += this.b;
        }
        this.c = i2;
        return;
      }
      g(this.l - this.k - this.c);
      throw k.a();
    }
    throw k.b();
  }
  
  private long i()
    throws IOException
  {
    long l1 = 0L;
    int i1 = 0;
    while (i1 < 64)
    {
      int i2 = l();
      l1 |= (i2 & 0x7F) << i1;
      if ((i2 & 0x80) == 0) {
        return l1;
      }
      i1 += 7;
    }
    throw k.c();
  }
  
  private void j()
  {
    this.b += this.g;
    int i1 = this.k + this.b;
    if (i1 > this.l)
    {
      this.g = (i1 - this.l);
      this.b -= this.g;
      return;
    }
    this.g = 0;
  }
  
  private boolean k()
    throws IOException
  {
    return (this.c == this.b) && (!f(1));
  }
  
  private byte l()
    throws IOException
  {
    if (this.c == this.b) {
      e(1);
    }
    byte[] arrayOfByte = this.a;
    int i1 = this.c;
    this.c = (i1 + 1);
    return arrayOfByte[i1];
  }
  
  public final int a()
    throws IOException
  {
    if (k())
    {
      this.i = 0;
      return 0;
    }
    this.i = d();
    if (z.b(this.i) != 0) {
      return this.i;
    }
    throw k.d();
  }
  
  public final <T extends q> T a(s<T> params, g paramg)
    throws IOException
  {
    int i1 = d();
    if (this.d < this.e)
    {
      i1 = b(i1);
      this.d += 1;
      params = (q)params.a(this, paramg);
      a(0);
      this.d -= 1;
      c(i1);
      return params;
    }
    throw k.g();
  }
  
  public final void a(int paramInt)
    throws k
  {
    if (this.i == paramInt) {
      return;
    }
    throw k.e();
  }
  
  public final boolean a(int paramInt, f paramf)
    throws IOException
  {
    int i1;
    switch (z.a(paramInt))
    {
    default: 
      throw k.f();
    case 5: 
      i1 = f();
      paramf.e(paramInt);
      paramf.g(i1);
      return true;
    case 4: 
      return false;
    case 3: 
      paramf.e(paramInt);
      do
      {
        i1 = a();
      } while ((i1 != 0) && (a(i1, paramf)));
      paramInt = z.a(z.b(paramInt), 4);
      a(paramInt);
      paramf.e(paramInt);
      return true;
    case 2: 
      d locald = c();
      paramf.e(paramInt);
      paramf.a(locald);
      return true;
    case 1: 
      l1 = g();
      paramf.e(paramInt);
      paramf.e(l1);
      return true;
    }
    long l1 = e();
    paramf.e(paramInt);
    paramf.c(l1);
    return true;
  }
  
  public final int b(int paramInt)
    throws k
  {
    if (paramInt >= 0)
    {
      paramInt += this.k + this.c;
      int i1 = this.l;
      if (paramInt <= i1)
      {
        this.l = paramInt;
        j();
        return i1;
      }
      throw k.a();
    }
    throw k.b();
  }
  
  public final boolean b()
    throws IOException
  {
    return e() != 0L;
  }
  
  public final d c()
    throws IOException
  {
    int i1 = d();
    if ((i1 <= this.b - this.c) && (i1 > 0))
    {
      Object localObject;
      if ((this.f) && (this.j)) {
        localObject = new c(this.a, this.c, i1);
      } else {
        localObject = d.a(this.a, this.c, i1);
      }
      this.c += i1;
      return (d)localObject;
    }
    if (i1 == 0) {
      return d.b;
    }
    return new p(d(i1));
  }
  
  public final void c(int paramInt)
  {
    this.l = paramInt;
    j();
  }
  
  public final int d()
    throws IOException
  {
    int i2 = this.c;
    if (this.b != i2)
    {
      byte[] arrayOfByte = this.a;
      int i1 = i2 + 1;
      int i3 = arrayOfByte[i2];
      if (i3 >= 0)
      {
        this.c = i1;
        return i3;
      }
      if (this.b - i1 >= 9)
      {
        i2 = i1 + 1;
        i3 ^= arrayOfByte[i1] << 7;
        long l2 = i3;
        long l1;
        if (l2 < 0L)
        {
          l1 = -128L;
          i1 = i2;
          i2 = (int)(l1 ^ l2);
        }
        else
        {
          i1 = i2 + 1;
          i3 ^= arrayOfByte[i2] << 14;
          l1 = i3;
          if (l1 >= 0L) {
            i2 = (int)(0x3F80 ^ l1);
          }
          for (;;)
          {
            break label289;
            i2 = i1 + 1;
            i1 = i3 ^ arrayOfByte[i1] << 21;
            l2 = i1;
            if (l2 < 0L)
            {
              l1 = -2080896L;
              i1 = i2;
              break;
            }
            int i4 = i2 + 1;
            int i5 = arrayOfByte[i2];
            i3 = (int)(i1 ^ i5 << 28 ^ 0xFE03F80);
            i2 = i3;
            i1 = i4;
            if (i5 < 0)
            {
              i5 = i4 + 1;
              i2 = i3;
              i1 = i5;
              if (arrayOfByte[i4] < 0)
              {
                i4 = i5 + 1;
                i2 = i3;
                i1 = i4;
                if (arrayOfByte[i5] < 0)
                {
                  i5 = i4 + 1;
                  i2 = i3;
                  i1 = i5;
                  if (arrayOfByte[i4] < 0)
                  {
                    i4 = i5 + 1;
                    i2 = i3;
                    i1 = i4;
                    if (arrayOfByte[i5] < 0)
                    {
                      i1 = i4 + 1;
                      if (arrayOfByte[i4] < 0) {
                        break label296;
                      }
                      i2 = i3;
                    }
                  }
                }
              }
            }
          }
        }
        label289:
        this.c = i1;
        return i2;
      }
    }
    label296:
    return (int)i();
  }
  
  final byte[] d(int paramInt)
    throws IOException
  {
    if (paramInt <= 0)
    {
      if (paramInt == 0) {
        return j.a;
      }
      throw k.b();
    }
    if (this.k + this.c + paramInt <= this.l)
    {
      if (paramInt < 4096)
      {
        arrayOfByte1 = new byte[paramInt];
        i1 = this.b - this.c;
        System.arraycopy(this.a, this.c, arrayOfByte1, 0, i1);
        this.c = this.b;
        paramInt -= i1;
        if (this.b - this.c < paramInt) {
          e(paramInt);
        }
        System.arraycopy(this.a, 0, arrayOfByte1, i1, paramInt);
        this.c = paramInt;
        return arrayOfByte1;
      }
      int i5 = this.c;
      int i1 = this.b;
      this.k += this.b;
      this.c = 0;
      this.b = 0;
      int i4 = i1 - i5;
      i1 = paramInt - i4;
      Object localObject = new ArrayList();
      while (i1 > 0)
      {
        arrayOfByte1 = new byte[Math.min(i1, 4096)];
        int i2 = 0;
        while (i2 < arrayOfByte1.length)
        {
          int i3;
          if (this.h == null) {
            i3 = -1;
          } else {
            i3 = this.h.read(arrayOfByte1, i2, arrayOfByte1.length - i2);
          }
          if (i3 != -1)
          {
            this.k += i3;
            i2 += i3;
          }
          else
          {
            throw k.a();
          }
        }
        i1 -= arrayOfByte1.length;
        ((List)localObject).add(arrayOfByte1);
      }
      byte[] arrayOfByte1 = new byte[paramInt];
      System.arraycopy(this.a, i5, arrayOfByte1, 0, i4);
      localObject = ((List)localObject).iterator();
      paramInt = i4;
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, arrayOfByte2.length);
        paramInt += arrayOfByte2.length;
      }
      return arrayOfByte1;
    }
    g(this.l - this.k - this.c);
    throw k.a();
  }
  
  public final long e()
    throws IOException
  {
    int i1 = this.c;
    if (this.b != i1)
    {
      byte[] arrayOfByte = this.a;
      int i2 = i1 + 1;
      int i3 = arrayOfByte[i1];
      if (i3 >= 0)
      {
        this.c = i2;
        return i3;
      }
      if (this.b - i2 >= 9)
      {
        i1 = i2 + 1;
        long l1 = i3 ^ arrayOfByte[i2] << 7;
        if (l1 < 0L)
        {
          l1 = 0xFFFFFFFFFFFFFF80 ^ l1;
        }
        else
        {
          i2 = i1 + 1;
          l1 = arrayOfByte[i1] << 14 ^ l1;
          long l2;
          if (l1 >= 0L)
          {
            l2 = 16256L;
            i1 = i2;
            l1 ^= l2;
          }
          else
          {
            i1 = i2 + 1;
            l2 = l1 ^ arrayOfByte[i2] << 21;
            if (l2 < 0L) {
              l1 = -2080896L;
            }
            label155:
            for (l1 ^= l2;; l1 = l2)
            {
              break label352;
              i2 = i1 + 1;
              l1 = l2 ^ arrayOfByte[i1] << 28;
              if (l1 >= 0L)
              {
                l2 = 266354560L;
                i1 = i2;
                break;
              }
              i1 = i2 + 1;
              l2 = l1 ^ arrayOfByte[i2] << 35;
              if (l2 < 0L)
              {
                l1 = -34093383808L;
                break label155;
              }
              i2 = i1 + 1;
              l1 = l2 ^ arrayOfByte[i1] << 42;
              if (l1 >= 0L)
              {
                l2 = 4363953127296L;
                i1 = i2;
                break;
              }
              i1 = i2 + 1;
              l2 = l1 ^ arrayOfByte[i2] << 49;
              if (l2 < 0L)
              {
                l1 = -558586000294016L;
                break label155;
              }
              i2 = i1 + 1;
              l2 = l2 ^ arrayOfByte[i1] << 56 ^ 0xFE03F80FE03F80;
              i1 = i2;
              l1 = l2;
              if (l2 >= 0L) {
                break label352;
              }
              i1 = i2 + 1;
              if (arrayOfByte[i2] < 0L) {
                break label360;
              }
            }
          }
        }
        label352:
        this.c = i1;
        return l1;
      }
    }
    label360:
    return i();
  }
  
  public final int f()
    throws IOException
  {
    int i2 = this.c;
    int i1 = i2;
    if (this.b - i2 < 4)
    {
      e(4);
      i1 = this.c;
    }
    byte[] arrayOfByte = this.a;
    this.c = (i1 + 4);
    i2 = arrayOfByte[i1];
    int i3 = arrayOfByte[(i1 + 1)];
    int i4 = arrayOfByte[(i1 + 2)];
    return (arrayOfByte[(i1 + 3)] & 0xFF) << 24 | i2 & 0xFF | (i3 & 0xFF) << 8 | (i4 & 0xFF) << 16;
  }
  
  public final long g()
    throws IOException
  {
    int i2 = this.c;
    int i1 = i2;
    if (this.b - i2 < 8)
    {
      e(8);
      i1 = this.c;
    }
    byte[] arrayOfByte = this.a;
    this.c = (i1 + 8);
    long l1 = arrayOfByte[i1];
    long l2 = arrayOfByte[(i1 + 1)];
    long l3 = arrayOfByte[(i1 + 2)];
    long l4 = arrayOfByte[(i1 + 3)];
    long l5 = arrayOfByte[(i1 + 4)];
    long l6 = arrayOfByte[(i1 + 5)];
    long l7 = arrayOfByte[(i1 + 6)];
    return (arrayOfByte[(i1 + 7)] & 0xFF) << 56 | l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48;
  }
  
  public final int h()
  {
    if (this.l == Integer.MAX_VALUE) {
      return -1;
    }
    int i1 = this.k;
    int i2 = this.c;
    return this.l - (i1 + i2);
  }
  
  static abstract interface a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */