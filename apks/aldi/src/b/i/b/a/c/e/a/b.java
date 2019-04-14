package b.i.b.a.c.e.a;

import b.i.b.a.c.e.a.ao;
import b.i.b.a.c.e.a.c.b;
import b.i.b.a.c.e.a.q;
import b.i.b.a.c.e.a.r;
import b.i.b.a.c.g.j.a;

public final class b
{
  public static final a A;
  public static final a B;
  public static final a C;
  public static final a D;
  public static final a E;
  public static final a F;
  public static final a G;
  public static final a H;
  public static final a I;
  public static final a J;
  public static final a K = c.a();
  public static final a a = ;
  public static final a b;
  public static final c<a.ao> c;
  public static final c<a.r> d;
  public static final c<a.c.b> e;
  public static final a f;
  public static final a g;
  public static final a h;
  public static final a i;
  public static final a j;
  public static final a k;
  public static final c<a.q> l;
  public static final a m;
  public static final a n;
  public static final a o;
  public static final a p;
  public static final a q;
  public static final a r;
  public static final a s;
  public static final a t;
  public static final a u;
  public static final a v;
  public static final a w;
  public static final a x;
  public static final a y;
  public static final a z;
  
  static
  {
    Object localObject = c.a();
    b = (a)localObject;
    localObject = c.a((c)localObject, a.ao.values());
    c = (c)localObject;
    localObject = c.a((c)localObject, a.r.values());
    d = (c)localObject;
    localObject = c.a((c)localObject, a.c.b.values());
    e = (c)localObject;
    localObject = c.a((c)localObject);
    f = (a)localObject;
    localObject = c.a((c)localObject);
    g = (a)localObject;
    localObject = c.a((c)localObject);
    h = (a)localObject;
    localObject = c.a((c)localObject);
    i = (a)localObject;
    j = c.a((c)localObject);
    k = c.a(c);
    localObject = c.a(d, a.q.values());
    l = (c)localObject;
    localObject = c.a((c)localObject);
    m = (a)localObject;
    localObject = c.a((c)localObject);
    n = (a)localObject;
    localObject = c.a((c)localObject);
    o = (a)localObject;
    localObject = c.a((c)localObject);
    p = (a)localObject;
    localObject = c.a((c)localObject);
    q = (a)localObject;
    localObject = c.a((c)localObject);
    r = (a)localObject;
    s = c.a((c)localObject);
    localObject = c.a(l);
    t = (a)localObject;
    localObject = c.a((c)localObject);
    u = (a)localObject;
    localObject = c.a((c)localObject);
    v = (a)localObject;
    localObject = c.a((c)localObject);
    w = (a)localObject;
    localObject = c.a((c)localObject);
    x = (a)localObject;
    localObject = c.a((c)localObject);
    y = (a)localObject;
    localObject = c.a((c)localObject);
    z = (a)localObject;
    localObject = c.a((c)localObject);
    A = (a)localObject;
    B = c.a((c)localObject);
    localObject = c.a(b);
    C = (a)localObject;
    localObject = c.a((c)localObject);
    D = (a)localObject;
    E = c.a((c)localObject);
    localObject = c.a(d);
    F = (a)localObject;
    localObject = c.a((c)localObject);
    G = (a)localObject;
    H = c.a((c)localObject);
    localObject = c.a();
    I = (a)localObject;
    J = c.a((c)localObject);
  }
  
  public static int a(boolean paramBoolean, a.ao paramao, a.r paramr)
  {
    return b.a(Boolean.valueOf(paramBoolean)) | d.a(paramr) | c.a(paramao) | F.a(Boolean.FALSE) | G.a(Boolean.FALSE) | H.a(Boolean.FALSE);
  }
  
  public static final class a
    extends b.c<Boolean>
  {
    public a(int paramInt)
    {
      super(1, (byte)0);
    }
    
    public final int a(Boolean paramBoolean)
    {
      if (paramBoolean.booleanValue()) {
        return 1 << this.a;
      }
      return 0;
    }
    
    public final Boolean a(int paramInt)
    {
      int i = this.a;
      boolean bool = true;
      if ((paramInt & 1 << i) == 0) {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
  }
  
  static final class b<E extends j.a>
    extends b.c<E>
  {
    private final E[] c;
    
    public b(int paramInt, E[] paramArrayOfE)
    {
      super(a(paramArrayOfE), (byte)0);
      this.c = paramArrayOfE;
    }
    
    private static <E> int a(E[] paramArrayOfE)
    {
      int j = paramArrayOfE.length - 1;
      if (j == 0) {
        return 1;
      }
      int i = 31;
      while (i >= 0)
      {
        if ((1 << i & j) != 0) {
          return i + 1;
        }
        i -= 1;
      }
      StringBuilder localStringBuilder = new StringBuilder("Empty enum: ");
      localStringBuilder.append(paramArrayOfE.getClass());
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public static abstract class c<E>
  {
    public final int a;
    public final int b;
    
    private c(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    public static b.a a()
    {
      return new b.a(0);
    }
    
    public static b.a a(c<?> paramc)
    {
      return new b.a(paramc.a + paramc.b);
    }
    
    public static <E extends j.a> c<E> a(c<?> paramc, E[] paramArrayOfE)
    {
      return new b.b(paramc.a + paramc.b, paramArrayOfE);
    }
    
    public abstract int a(E paramE);
    
    public abstract E b(int paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */