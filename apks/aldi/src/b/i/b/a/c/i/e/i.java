package b.i.b.a.c.i.e;

import b.a.v;
import b.f.a.b;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.aw;
import b.i.b.a.c.b.l;
import b.i.b.a.c.c.a.a;
import b.i.b.a.c.f.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class i
  implements h
{
  public Collection<ah> a(f paramf, a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return (Collection)v.a;
  }
  
  public Collection<l> a(d paramd, b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    return (Collection)v.a;
  }
  
  public Collection<al> b(f paramf, a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return (Collection)v.a;
  }
  
  public b.i.b.a.c.b.h c(f paramf, a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return null;
  }
  
  public void d(f paramf, a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    j localj = (j)this;
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    localj.b(paramf, parama);
  }
  
  public Set<f> j_()
  {
    Object localObject1 = (Iterable)a(d.j, b.i.b.a.c.n.d.a());
    Collection localCollection = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof al)) {
        localCollection.add(localObject2);
      }
    }
    localObject1 = (Iterable)localCollection;
    localCollection = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      localCollection.add(((al)((Iterator)localObject1).next()).i());
    }
    return (Set)localCollection;
  }
  
  public Set<f> l_()
  {
    Object localObject1 = (Iterable)a(d.k, b.i.b.a.c.n.d.a());
    Collection localCollection = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof aw)) {
        localCollection.add(localObject2);
      }
    }
    localObject1 = (Iterable)localCollection;
    localCollection = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      localCollection.add(((aw)((Iterator)localObject1).next()).i());
    }
    return (Set)localCollection;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */