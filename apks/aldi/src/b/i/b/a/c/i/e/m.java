package b.i.b.a.c.i.e;

import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.w;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class m
  extends a
{
  public static final a a = new a((byte)0);
  private final b b;
  
  private m(b paramb)
  {
    this.b = paramb;
  }
  
  public static final h a(String paramString, Collection<? extends w> paramCollection)
  {
    b.f.b.j.b(paramString, "message");
    b.f.b.j.b(paramCollection, "types");
    Object localObject = (Iterable)paramCollection;
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection.add(((w)((Iterator)localObject).next()).b());
    }
    paramString = new b(paramString, (List)localCollection);
    if (paramCollection.size() <= 1) {
      return (h)paramString;
    }
    return (h)new m(paramString, (byte)0);
  }
  
  public final Collection<ah> a(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return b.i.b.a.c.i.k.a(super.a(paramf, parama), (b.f.a.b)d.a);
  }
  
  public final Collection<l> a(d paramd, b.f.a.b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    Object localObject1 = (Iterable)super.a(paramd, paramb);
    paramd = new ArrayList();
    paramb = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if (((l)localObject2 instanceof b.i.b.a.c.b.a)) {
        paramd.add(localObject2);
      } else {
        paramb.add(localObject2);
      }
    }
    paramb = new b.m(paramd, paramb);
    paramd = (List)paramb.a;
    paramb = (List)paramb.b;
    if (paramd != null) {
      return (Collection)b.a.j.b(b.i.b.a.c.i.k.a((Collection)paramd, (b.f.a.b)b.a), (Iterable)paramb);
    }
    throw new r("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
  }
  
  public final Collection<al> b(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return b.i.b.a.c.i.k.a(super.b(paramf, parama), (b.f.a.b)c.a);
  }
  
  public static final class a {}
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.b.a, b.i.b.a.c.b.a>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.b<al, al>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.b<ah, ah>
  {
    public static final d a = new d();
    
    d()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */