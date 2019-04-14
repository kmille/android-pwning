package b.i.b.a.c.g;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

final class u
  extends d
{
  private static final int[] a;
  private final int d;
  private final d e;
  private final d f;
  private final int g;
  private final int h;
  private int i = 0;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    int k = 1;
    for (;;)
    {
      int m = k;
      if (j <= 0) {
        break;
      }
      localArrayList.add(Integer.valueOf(j));
      k = j;
      j = m + j;
    }
    localArrayList.add(Integer.valueOf(Integer.MAX_VALUE));
    a = new int[localArrayList.size()];
    j = 0;
    while (j < a.length)
    {
      a[j] = ((Integer)localArrayList.get(j)).intValue();
      j += 1;
    }
  }
  
  private u(d paramd1, d paramd2)
  {
    this.e = paramd1;
    this.f = paramd2;
    this.g = paramd1.a();
    this.d = (this.g + paramd2.a());
    this.h = (Math.max(paramd1.i(), paramd2.i()) + 1);
  }
  
  static d a(d paramd1, d paramd2)
  {
    Object localObject2;
    if ((paramd1 instanceof u)) {
      localObject2 = (u)paramd1;
    } else {
      localObject2 = null;
    }
    Object localObject1 = paramd1;
    if (paramd2.a() != 0)
    {
      localObject1 = paramd2;
      int j;
      if (paramd1.a() != 0)
      {
        j = paramd1.a() + paramd2.a();
        if (j < 128) {
          return b(paramd1, paramd2);
        }
        if ((localObject2 == null) || (((u)localObject2).f.a() + paramd2.a() >= 128)) {
          break label114;
        }
        paramd1 = b(((u)localObject2).f, paramd2);
      }
      for (localObject1 = new u(((u)localObject2).e, paramd1);; localObject1 = new u(((u)localObject2).e, paramd1))
      {
        return (d)localObject1;
        label114:
        if ((localObject2 == null) || (((u)localObject2).e.i() <= ((u)localObject2).f.i()) || (((u)localObject2).h <= paramd2.i())) {
          break;
        }
        paramd1 = new u(((u)localObject2).f, paramd2);
      }
      int k = Math.max(paramd1.i(), paramd2.i());
      if (j >= a[(k + 1)]) {
        return new u(paramd1, paramd2);
      }
      localObject2 = new a((byte)0);
      ((a)localObject2).a(paramd1);
      ((a)localObject2).a(paramd2);
      for (paramd1 = (d)((a)localObject2).a.pop();; paramd1 = new u((d)((a)localObject2).a.pop(), paramd1, (byte)0))
      {
        localObject1 = paramd1;
        if (((a)localObject2).a.isEmpty()) {
          break;
        }
      }
    }
    return (d)localObject1;
  }
  
  private static p b(d paramd1, d paramd2)
  {
    int j = paramd1.a();
    int k = paramd2.a();
    byte[] arrayOfByte = new byte[j + k];
    paramd1.b(arrayOfByte, 0, 0, j);
    paramd2.b(arrayOfByte, 0, j, k);
    return new p(arrayOfByte);
  }
  
  public final int a()
  {
    return this.d;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= this.g) {
      return this.e.a(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= this.g) {
      return this.f.a(paramInt1, paramInt2 - this.g, paramInt3);
    }
    int j = this.g - paramInt2;
    paramInt1 = this.e.a(paramInt1, paramInt2, j);
    return this.f.a(paramInt1, 0, paramInt3 - j);
  }
  
  protected final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt3 <= this.g)
    {
      this.e.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
      return;
    }
    if (paramInt1 >= this.g)
    {
      this.f.a(paramArrayOfByte, paramInt1 - this.g, paramInt2, paramInt3);
      return;
    }
    int j = this.g - paramInt1;
    this.e.a(paramArrayOfByte, paramInt1, paramInt2, j);
    this.f.a(paramArrayOfByte, 0, paramInt2 + j, paramInt3 - j);
  }
  
  protected final int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= this.g) {
      return this.e.b(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= this.g) {
      return this.f.b(paramInt1, paramInt2 - this.g, paramInt3);
    }
    int j = this.g - paramInt2;
    paramInt1 = this.e.b(paramInt1, paramInt2, j);
    return this.f.b(paramInt1, 0, paramInt3 - j);
  }
  
  public final String b(String paramString)
    throws UnsupportedEncodingException
  {
    return new String(d(), paramString);
  }
  
  final void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt1 + paramInt2 <= this.g)
    {
      this.e.b(paramOutputStream, paramInt1, paramInt2);
      return;
    }
    if (paramInt1 >= this.g)
    {
      this.f.b(paramOutputStream, paramInt1 - this.g, paramInt2);
      return;
    }
    int j = this.g - paramInt1;
    this.e.b(paramOutputStream, paramInt1, j);
    this.f.b(paramOutputStream, 0, paramInt2 - j);
  }
  
  public final d.a c()
  {
    return new c((byte)0);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if (this.d != ((d)paramObject).a()) {
      return false;
    }
    if (this.d == 0) {
      return true;
    }
    if (this.i != 0)
    {
      j = ((d)paramObject).k();
      if ((j != 0) && (this.i != j)) {
        return false;
      }
    }
    b localb1 = new b(this, (byte)0);
    p localp = (p)localb1.next();
    b localb2 = new b((d)paramObject, (byte)0);
    paramObject = (p)localb2.next();
    int k = 0;
    int j = 0;
    int m = 0;
    for (;;)
    {
      int i2 = localp.a() - k;
      int n = ((p)paramObject).a() - j;
      int i1 = Math.min(i2, n);
      boolean bool;
      if (k == 0) {
        bool = localp.a((p)paramObject, j, i1);
      } else {
        bool = ((p)paramObject).a(localp, k, i1);
      }
      if (!bool) {
        return false;
      }
      m += i1;
      if (m >= this.d)
      {
        if (m == this.d) {
          return true;
        }
        throw new IllegalStateException();
      }
      if (i1 == i2)
      {
        localp = (p)localb1.next();
        k = 0;
      }
      else
      {
        k += i1;
      }
      if (i1 == n)
      {
        paramObject = (p)localb2.next();
        j = 0;
      }
      else
      {
        j += i1;
      }
    }
  }
  
  public final boolean f()
  {
    int j = this.e.a(0, 0, this.g);
    return this.f.a(j, 0, this.f.a()) == 0;
  }
  
  public final e g()
  {
    return e.a(new d());
  }
  
  public final int hashCode()
  {
    int k = this.i;
    int j = k;
    if (k == 0)
    {
      k = b(this.d, 0, this.d);
      j = k;
      if (k == 0) {
        j = 1;
      }
      this.i = j;
    }
    return j;
  }
  
  protected final int i()
  {
    return this.h;
  }
  
  protected final boolean j()
  {
    return this.d >= a[this.h];
  }
  
  protected final int k()
  {
    return this.i;
  }
  
  static final class a
  {
    final Stack<d> a = new Stack();
    
    private static int a(int paramInt)
    {
      int i = Arrays.binarySearch(u.b(), paramInt);
      paramInt = i;
      if (i < 0) {
        paramInt = -(i + 1) - 1;
      }
      return paramInt;
    }
    
    final void a(d paramd)
    {
      for (;;)
      {
        if (paramd.j())
        {
          int i = a(paramd.a());
          int j = u.b()[(i + 1)];
          if ((!this.a.isEmpty()) && (((d)this.a.peek()).a() < j))
          {
            i = u.b()[i];
            for (localObject = (d)this.a.pop(); (!this.a.isEmpty()) && (((d)this.a.peek()).a() < i); localObject = new u((d)this.a.pop(), (d)localObject, (byte)0)) {}
            for (paramd = new u((d)localObject, paramd, (byte)0); !this.a.isEmpty(); paramd = new u((d)this.a.pop(), paramd, (byte)0))
            {
              i = a(paramd.a());
              i = u.b()[(i + 1)];
              if (((d)this.a.peek()).a() >= i) {
                break;
              }
            }
            this.a.push(paramd);
            return;
          }
          this.a.push(paramd);
          return;
        }
        if (!(paramd instanceof u)) {
          break;
        }
        paramd = (u)paramd;
        a(u.a(paramd));
        paramd = u.b(paramd);
      }
      paramd = String.valueOf(String.valueOf(paramd.getClass()));
      Object localObject = new StringBuilder(paramd.length() + 49);
      ((StringBuilder)localObject).append("Has a new type of ByteString been created? Found ");
      ((StringBuilder)localObject).append(paramd);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
  }
  
  static final class b
    implements Iterator<p>
  {
    private final Stack<u> a = new Stack();
    private p b = a(paramd);
    
    private b(d paramd) {}
    
    private p a(d paramd)
    {
      while ((paramd instanceof u))
      {
        paramd = (u)paramd;
        this.a.push(paramd);
        paramd = u.a(paramd);
      }
      return (p)paramd;
    }
    
    private p b()
    {
      p localp;
      int i;
      do
      {
        if (this.a.isEmpty()) {
          return null;
        }
        localp = a(u.b((u)this.a.pop()));
        if (localp.a() == 0) {
          i = 1;
        } else {
          i = 0;
        }
      } while (i != 0);
      return localp;
    }
    
    public final p a()
    {
      if (this.b != null)
      {
        p localp = this.b;
        this.b = b();
        return localp;
      }
      throw new NoSuchElementException();
    }
    
    public final boolean hasNext()
    {
      return this.b != null;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c
    implements d.a
  {
    int a = u.this.a();
    private final u.b c = new u.b(u.this, (byte)0);
    private d.a d = this.c.a().c();
    
    private c() {}
    
    public final byte a()
    {
      if (!this.d.hasNext()) {
        this.d = this.c.a().c();
      }
      this.a -= 1;
      return this.d.a();
    }
    
    public final boolean hasNext()
    {
      return this.a > 0;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  final class d
    extends InputStream
  {
    private u.b b;
    private p c;
    private int d;
    private int e;
    private int f;
    private int g;
    
    public d()
    {
      a();
    }
    
    private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      int i = paramInt1;
      paramInt1 = paramInt2;
      while (paramInt1 > 0)
      {
        b();
        if (this.c == null)
        {
          if (paramInt1 != paramInt2) {
            break;
          }
          return -1;
        }
        int k = Math.min(this.d - this.e, paramInt1);
        int j = i;
        if (paramArrayOfByte != null)
        {
          this.c.b(paramArrayOfByte, this.e, i, k);
          j = i + k;
        }
        this.e += k;
        paramInt1 -= k;
        i = j;
      }
      return paramInt2 - paramInt1;
    }
    
    private void a()
    {
      this.b = new u.b(u.this, (byte)0);
      this.c = this.b.a();
      this.d = this.c.a();
      this.e = 0;
      this.f = 0;
    }
    
    private void b()
    {
      if ((this.c != null) && (this.e == this.d))
      {
        this.f += this.d;
        this.e = 0;
        if (this.b.hasNext())
        {
          this.c = this.b.a();
          this.d = this.c.a();
          return;
        }
        this.c = null;
        this.d = 0;
      }
    }
    
    public final int available()
      throws IOException
    {
      int i = this.f;
      int j = this.e;
      return u.this.a() - (i + j);
    }
    
    public final void mark(int paramInt)
    {
      this.g = (this.f + this.e);
    }
    
    public final boolean markSupported()
    {
      return true;
    }
    
    public final int read()
      throws IOException
    {
      b();
      if (this.c == null) {
        return -1;
      }
      p localp = this.c;
      int i = this.e;
      this.e = (i + 1);
      return localp.a(i) & 0xFF;
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (paramArrayOfByte != null)
      {
        if ((paramInt1 >= 0) && (paramInt2 >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt1)) {
          return a(paramArrayOfByte, paramInt1, paramInt2);
        }
        throw new IndexOutOfBoundsException();
      }
      throw new NullPointerException();
    }
    
    public final void reset()
    {
      try
      {
        a();
        a(null, 0, this.g);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final long skip(long paramLong)
    {
      if (paramLong >= 0L)
      {
        long l = paramLong;
        if (paramLong > 2147483647L) {
          l = 2147483647L;
        }
        return a(null, 0, (int)l);
      }
      throw new IndexOutOfBoundsException();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */