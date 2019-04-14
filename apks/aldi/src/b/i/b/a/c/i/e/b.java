package b.i.b.a.c.i.e;

import b.a.x;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.i;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class b
  implements h
{
  public static final a a = new a((byte)0);
  private final String b;
  private final List<h> c;
  
  public b(String paramString, List<? extends h> paramList)
  {
    this.b = paramString;
    this.c = paramList;
  }
  
  public final Collection<ah> a(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    Object localObject = this.c;
    if (((List)localObject).isEmpty()) {
      return (Collection)x.a;
    }
    Collection localCollection = null;
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection = b.i.b.a.c.m.b.a.a(localCollection, ((h)((Iterator)localObject).next()).a(paramf, parama));
    }
    paramf = localCollection;
    if (localCollection == null) {
      paramf = (Collection)x.a;
    }
    return paramf;
  }
  
  public final Collection<l> a(d paramd, b.f.a.b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    Object localObject = this.c;
    if (((List)localObject).isEmpty()) {
      return (Collection)x.a;
    }
    Collection localCollection = null;
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection = b.i.b.a.c.m.b.a.a(localCollection, ((h)((Iterator)localObject).next()).a(paramd, paramb));
    }
    paramd = localCollection;
    if (localCollection == null) {
      paramd = (Collection)x.a;
    }
    return paramd;
  }
  
  public final Collection<al> b(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    Object localObject = this.c;
    if (((List)localObject).isEmpty()) {
      return (Collection)x.a;
    }
    Collection localCollection = null;
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection = b.i.b.a.c.m.b.a.a(localCollection, ((h)((Iterator)localObject).next()).b(paramf, parama));
    }
    paramf = localCollection;
    if (localCollection == null) {
      paramf = (Collection)x.a;
    }
    return paramf;
  }
  
  public final b.i.b.a.c.b.h c(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    Iterator localIterator = this.c.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      b.i.b.a.c.b.h localh = ((h)localIterator.next()).c(paramf, parama);
      if (localh != null) {
        if (((localh instanceof i)) && (((i)localh).o()))
        {
          if (localObject == null) {
            localObject = localh;
          }
        }
        else {
          return localh;
        }
      }
    }
    return (b.i.b.a.c.b.h)localObject;
  }
  
  public final Set<f> j_()
  {
    Object localObject = (Iterable)this.c;
    Collection localCollection = (Collection)new LinkedHashSet();
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      b.a.j.a(localCollection, (Iterable)((h)((Iterator)localObject).next()).j_());
    }
    return (Set)localCollection;
  }
  
  public final Set<f> l_()
  {
    Object localObject = (Iterable)this.c;
    Collection localCollection = (Collection)new LinkedHashSet();
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      b.a.j.a(localCollection, (Iterable)((h)((Iterator)localObject).next()).l_());
    }
    return (Set)localCollection;
  }
  
  public final String toString()
  {
    return this.b;
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */