package b.i.b.a.c.a;

import b.d;
import b.i.b.a.c.b.aa;
import b.i.b.a.c.b.y;
import b.i.b.a.c.c.a.c;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.h;
import b.k.l;

public final class i
{
  public static final b b = new b((byte)0);
  private final d c;
  private final a d;
  private final a e;
  private final a f;
  private final a g;
  private final a h;
  private final a i;
  private final a j;
  private final aa k;
  
  public i(y paramy, aa paramaa)
  {
    this.k = paramaa;
    this.c = b.e.a(b.i.b, (b.f.a.a)new c(paramy));
    this.d = new a(1);
    this.e = new a(1);
    this.f = new a(2);
    this.g = new a(3);
    this.h = new a(1);
    this.i = new a(2);
    this.j = new a(3);
  }
  
  public final b.i.b.a.c.b.e a()
  {
    Object localObject1 = this.d;
    Object localObject2 = a[1];
    b.f.b.j.b(this, "types");
    b.f.b.j.b(localObject2, "property");
    localObject2 = l.d(((b.i.k)localObject2).g());
    int m = ((a)localObject1).a;
    f localf = f.a((String)localObject2);
    b.f.b.j.a(localf, "Name.identifier(className)");
    localObject2 = ((h)this.c.a()).c(localf, (b.i.b.a.c.c.a.a)c.h);
    localObject1 = localObject2;
    if (!(localObject2 instanceof b.i.b.a.c.b.e)) {
      localObject1 = null;
    }
    localObject2 = (b.i.b.a.c.b.e)localObject1;
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = this.k.a(new b.i.b.a.c.f.a(j.a(), localf), b.a.j.a(Integer.valueOf(m)));
    }
    return (b.i.b.a.c.b.e)localObject1;
  }
  
  static final class a
  {
    final int a;
    
    public a(int paramInt)
    {
      this.a = paramInt;
    }
  }
  
  public static final class b {}
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<h>
  {
    c(y paramy)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */