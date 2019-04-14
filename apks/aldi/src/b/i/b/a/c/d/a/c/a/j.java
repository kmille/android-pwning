package b.i.b.a.c.d.a.c.a;

import b.a.v;
import b.a.x;
import b.f.b.k;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.c.a.c;
import b.i.b.a.c.d.a.e.aa;
import b.i.b.a.c.d.a.e.t;
import b.i.b.a.c.f.f;
import b.i.b.a.c.k.i;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class j
  extends m
{
  final h a;
  private final b.i.b.a.c.k.g<Set<String>> b;
  private final b.i.b.a.c.k.d<a, e> g;
  private final t h;
  
  public j(final b.i.b.a.c.d.a.c.h paramh, t paramt, h paramh1)
  {
    super(paramh);
    this.h = paramt;
    this.a = paramh1;
    this.b = paramh.c.a.b((b.f.a.a)new d(this, paramh));
    this.g = paramh.c.a.b((b.f.a.b)new c(this, paramh));
  }
  
  final e a(f paramf, b.i.b.a.c.d.a.e.g paramg)
  {
    if (!b.i.b.a.c.f.h.b(paramf)) {
      return null;
    }
    Set localSet = (Set)this.b.b_();
    if ((paramg == null) && (localSet != null) && (!localSet.contains(paramf.a))) {
      return null;
    }
    return (e)this.g.a(new a(paramf, paramg));
  }
  
  public final Collection<ah> a(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return (Collection)v.a;
  }
  
  public final Collection<l> a(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    return (Collection)a(paramd, paramb, (b.i.b.a.c.c.a.a)c.m);
  }
  
  protected final Set<f> a(b.i.b.a.c.i.e.d paramd)
  {
    b.f.b.j.b(paramd, "kindFilter");
    return (Set)x.a;
  }
  
  protected final void a(Collection<al> paramCollection, f paramf)
  {
    b.f.b.j.b(paramCollection, "result");
    b.f.b.j.b(paramf, "name");
  }
  
  protected final Set<f> b(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    return (Set)x.a;
  }
  
  protected final b c()
  {
    return (b)b.a.a;
  }
  
  protected final Set<f> c(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    Object localObject = b.i.b.a.c.i.e.d.m;
    if (!paramd.a(b.i.b.a.c.i.e.d.b())) {
      return (Set)x.a;
    }
    paramd = (Set)this.b.b_();
    if (paramd != null)
    {
      paramb = (Iterable)paramd;
      paramd = (Collection)new HashSet();
      paramb = paramb.iterator();
      while (paramb.hasNext()) {
        paramd.add(f.a((String)paramb.next()));
      }
      return (Set)paramd;
    }
    localObject = this.h;
    paramd = paramb;
    if (paramb == null) {
      paramd = b.i.b.a.c.n.d.a();
    }
    paramd = (Iterable)((t)localObject).a(paramd);
    paramb = (Collection)new LinkedHashSet();
    localObject = paramd.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramd = (b.i.b.a.c.d.a.e.g)((Iterator)localObject).next();
      if (aa.a == 0) {
        paramd = null;
      } else {
        paramd = paramd.p();
      }
      if (paramd != null) {
        paramb.add(paramd);
      }
    }
    return (Set)paramb;
  }
  
  public final e e(f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    return a(paramf, null);
  }
  
  static final class a
  {
    final f a;
    final b.i.b.a.c.d.a.e.g b;
    
    public a(f paramf, b.i.b.a.c.d.a.e.g paramg)
    {
      this.a = paramf;
      this.b = paramg;
    }
    
    public final boolean equals(Object paramObject)
    {
      return ((paramObject instanceof a)) && (b.f.b.j.a(this.a, ((a)paramObject).a));
    }
    
    public final int hashCode()
    {
      return this.a.hashCode();
    }
  }
  
  static abstract class b
  {
    public static final class a
      extends j.b
    {
      final e a;
      
      public a(e parame)
      {
        super();
        this.a = parame;
      }
    }
    
    public static final class b
      extends j.b
    {
      public static final b a = new b();
      
      private b()
      {
        super();
      }
    }
    
    public static final class c
      extends j.b
    {
      public static final c a = new c();
      
      private c()
      {
        super();
      }
    }
  }
  
  static final class c
    extends k
    implements b.f.a.b<j.a, e>
  {
    c(j paramj, b.i.b.a.c.d.a.c.h paramh)
    {
      super();
    }
  }
  
  static final class d
    extends k
    implements b.f.a.a<Set<? extends String>>
  {
    d(j paramj, b.i.b.a.c.d.a.c.h paramh)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */