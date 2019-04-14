package b.i.b.a.c.i.e;

import b.a.v;
import b.f.b.k;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class e
  extends i
{
  private final b.i.b.a.c.k.f a;
  protected final b.i.b.a.c.b.e c;
  
  public e(b.i.b.a.c.k.i parami, b.i.b.a.c.b.e parame)
  {
    this.c = parame;
    this.a = parami.a((b.f.a.a)new a(this));
  }
  
  private final List<l> c()
  {
    return (List)b.i.b.a.c.k.h.a(this.a, b[0]);
  }
  
  public final Collection<ah> a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    Object localObject1 = (Iterable)c();
    parama = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof ah)) {
        parama.add(localObject2);
      }
    }
    localObject1 = (Iterable)parama;
    parama = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (b.f.b.j.a(((ah)localObject2).i(), paramf)) {
        parama.add(localObject2);
      }
    }
    return (Collection)parama;
  }
  
  public final Collection<l> a(d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    if (!paramd.a(d.d.a)) {}
    for (paramd = (List)v.a;; paramd = c()) {
      return (Collection)paramd;
    }
  }
  
  protected abstract List<t> a();
  
  public final Collection<al> b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    Object localObject1 = (Iterable)c();
    parama = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof al)) {
        parama.add(localObject2);
      }
    }
    localObject1 = (Iterable)parama;
    parama = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (b.f.b.j.a(((al)localObject2).i(), paramf)) {
        parama.add(localObject2);
      }
    }
    return (Collection)parama;
  }
  
  static final class a
    extends k
    implements b.f.a.a<List<? extends l>>
  {
    a(e parame)
    {
      super();
    }
  }
  
  public static final class b
    extends b.i.b.a.c.i.h
  {
    b(ArrayList paramArrayList) {}
    
    public final void a(b.i.b.a.c.b.b paramb)
    {
      b.f.b.j.b(paramb, "fakeOverride");
      b.i.b.a.c.i.j.a(paramb, null);
      this.b.add(paramb);
    }
    
    public final void a(b.i.b.a.c.b.b paramb1, b.i.b.a.c.b.b paramb2)
    {
      b.f.b.j.b(paramb1, "fromSuper");
      b.f.b.j.b(paramb2, "fromCurrent");
      StringBuilder localStringBuilder = new StringBuilder("Conflict in scope of ");
      localStringBuilder.append(this.a.c);
      localStringBuilder.append(": ");
      localStringBuilder.append(paramb1);
      localStringBuilder.append(" vs ");
      localStringBuilder.append(paramb2);
      throw ((Throwable)new IllegalStateException(localStringBuilder.toString().toString()));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */