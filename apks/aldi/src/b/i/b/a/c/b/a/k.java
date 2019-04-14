package b.i.b.a.c.b.a;

import b.a.e;
import b.j.h;
import b.j.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k
  implements g
{
  private final List<g> b;
  
  public k(List<? extends g> paramList)
  {
    this.b = paramList;
  }
  
  public k(g... paramVarArgs)
  {
    this(e.g(paramVarArgs));
  }
  
  public final c a(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    paramb = i.e(b.a.j.n((Iterable)this.b), (b.f.a.b)new a(paramb));
    b.f.b.j.b(paramb, "receiver$0");
    paramb = paramb.a();
    if (!paramb.hasNext()) {
      paramb = null;
    } else {
      paramb = paramb.next();
    }
    return (c)paramb;
  }
  
  public final boolean a()
  {
    Object localObject = (Iterable)this.b;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (!((g)((Iterator)localObject).next()).a()) {
          return false;
        }
      }
    }
    return true;
  }
  
  public final boolean b(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    Iterator localIterator = b.a.j.n((Iterable)this.b).a();
    while (localIterator.hasNext()) {
      if (((g)localIterator.next()).b(paramb)) {
        return true;
      }
    }
    return false;
  }
  
  public final Iterator<c> iterator()
  {
    return i.c(b.a.j.n((Iterable)this.b), (b.f.a.b)b.a).a();
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.b<g, c>
  {
    a(b.i.b.a.c.f.b paramb)
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<g, h<? extends c>>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */