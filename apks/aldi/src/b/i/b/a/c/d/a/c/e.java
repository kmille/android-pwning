package b.i.b.a.c.d.a.c;

import b.f.b.k;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.a.g.b;
import b.i.b.a.c.d.a.e.a;
import b.j.f;
import b.j.l.a;
import b.j.l.b;
import b.j.p;
import java.util.Collection;
import java.util.Iterator;

public final class e
  implements b.i.b.a.c.b.a.g
{
  private final b.i.b.a.c.k.d<a, b.i.b.a.c.b.a.c> b;
  private final h c;
  private final b.i.b.a.c.d.a.e.d d;
  
  public e(h paramh, b.i.b.a.c.d.a.e.d paramd)
  {
    this.c = paramh;
    this.d = paramd;
    this.b = this.c.c.a.b((b.f.a.b)new a(this));
  }
  
  public final b.i.b.a.c.b.a.c a(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    Object localObject = this.d.a(paramb);
    if (localObject != null)
    {
      b.i.b.a.c.b.a.c localc = (b.i.b.a.c.b.a.c)((b.f.a.b)this.b).a(localObject);
      localObject = localc;
      if (localc != null) {}
    }
    else
    {
      localObject = b.i.b.a.c.d.a.a.c.a;
      localObject = b.i.b.a.c.d.a.a.c.a(paramb, this.d, this.c);
    }
    return (b.i.b.a.c.b.a.c)localObject;
  }
  
  public final boolean a()
  {
    return this.d.a().isEmpty();
  }
  
  public final boolean b(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    return g.b.b(this, paramb);
  }
  
  public final Iterator<b.i.b.a.c.b.a.c> iterator()
  {
    Object localObject1 = b.j.i.d(b.a.j.n((Iterable)this.d.a()), (b.f.a.b)this.b);
    Object localObject2 = b.i.b.a.c.d.a.a.c.a;
    localObject2 = b.i.b.a.c.a.g.k.y;
    b.f.b.j.a(localObject2, "KotlinBuiltIns.FQ_NAMES.deprecated");
    localObject2 = b.i.b.a.c.d.a.a.c.a((b.i.b.a.c.f.b)localObject2, this.d, this.c);
    b.f.b.j.b(localObject1, "receiver$0");
    localObject2 = b.j.i.a(new b.j.h[] { localObject1, b.j.i.a(new Object[] { localObject2 }) });
    b.f.b.j.b(localObject2, "receiver$0");
    localObject1 = (b.f.a.b)l.a.a;
    if ((localObject2 instanceof p))
    {
      localObject2 = (p)localObject2;
      b.f.b.j.b(localObject1, "iterator");
    }
    for (localObject1 = new f(((p)localObject2).a, ((p)localObject2).b, (b.f.a.b)localObject1);; localObject1 = new f((b.j.h)localObject2, (b.f.a.b)l.b.a, (b.f.a.b)localObject1))
    {
      localObject1 = (b.j.h)localObject1;
      break;
    }
    return b.j.i.b((b.j.h)localObject1).a();
  }
  
  static final class a
    extends k
    implements b.f.a.b<a, b.i.b.a.c.b.a.c>
  {
    a(e parame)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */