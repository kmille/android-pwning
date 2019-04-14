package b.i.b.a.c.d.a.c.a;

import b.a.ac;
import b.a.v;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.c.ai;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.w.a;
import b.i.b.a.c.d.a.b.e;
import b.i.b.a.c.d.a.e.n;
import b.i.b.a.c.d.a.e.x;
import b.i.b.a.c.d.a.p;
import b.i.b.a.c.i.b.s;
import b.i.b.a.c.i.e.c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class k
  extends b.i.b.a.c.i.e.i
{
  private final b.i.b.a.c.k.f<Collection<b.i.b.a.c.b.l>> a;
  private final b.i.b.a.c.k.c<b.i.b.a.c.f.f, Collection<al>> b;
  final b.i.b.a.c.k.f<b> d;
  final b.i.b.a.c.d.a.c.h e;
  private final b.i.b.a.c.k.f g;
  private final b.i.b.a.c.k.f h;
  private final b.i.b.a.c.k.f i;
  private final b.i.b.a.c.k.c<b.i.b.a.c.f.f, List<ah>> j;
  
  public k(b.i.b.a.c.d.a.c.h paramh)
  {
    this.e = paramh;
    this.a = this.e.c.a.a((b.f.a.a)new c(this), (List)v.a);
    this.d = this.e.c.a.a((b.f.a.a)new e(this));
    this.b = this.e.c.a.a((b.f.a.b)new g(this));
    this.g = this.e.c.a.a((b.f.a.a)new f(this));
    this.h = this.e.c.a.a((b.f.a.a)new i(this));
    this.i = this.e.c.a.a((b.f.a.a)new d(this));
    this.j = this.e.c.a.a((b.f.a.b)new h(this));
  }
  
  protected static b a(b.i.b.a.c.d.a.c.h paramh, t paramt, List<? extends b.i.b.a.c.d.a.e.y> paramList)
  {
    b.f.b.j.b(paramh, "c");
    b.f.b.j.b(paramt, "function");
    b.f.b.j.b(paramList, "jValueParameters");
    Set localSet = (Set)new LinkedHashSet();
    Object localObject1 = b.a.j.l((Iterable)paramList);
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    boolean bool1 = false;
    while (localIterator.hasNext())
    {
      localObject1 = (b.a.y)localIterator.next();
      int m = ((b.a.y)localObject1).a;
      b.i.b.a.c.d.a.e.y localy = (b.i.b.a.c.d.a.e.y)((b.a.y)localObject1).b;
      b.i.b.a.c.b.a.g localg = b.i.b.a.c.d.a.c.f.a(paramh, (b.i.b.a.c.d.a.e.d)localy);
      Object localObject4 = b.i.b.a.c.d.a.c.b.d.a(b.i.b.a.c.d.a.a.l.b, false, null, 3);
      localObject1 = p.m;
      b.f.b.j.a(localObject1, "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME");
      localObject1 = localg.a((b.i.b.a.c.f.b)localObject1);
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = b.i.b.a.c.i.c.a.b((b.i.b.a.c.b.a.c)localObject1);
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (!(localObject2 instanceof s)) {
            localObject1 = null;
          }
          localObject1 = (s)localObject1;
          if (localObject1 != null)
          {
            localObject1 = (String)((s)localObject1).a();
            break label215;
          }
        }
      }
      localObject1 = null;
      label215:
      boolean bool3 = localy.d();
      boolean bool2 = true;
      if (bool3)
      {
        localObject3 = localy.c();
        localObject2 = localObject3;
        if (!(localObject3 instanceof b.i.b.a.c.d.a.e.f)) {
          localObject2 = null;
        }
        localObject2 = (b.i.b.a.c.d.a.e.f)localObject2;
        if (localObject2 != null)
        {
          localObject2 = paramh.b.a((b.i.b.a.c.d.a.e.f)localObject2, (b.i.b.a.c.d.a.c.b.a)localObject4, true);
          localObject2 = b.q.a(localObject2, paramh.c.n.b().a((b.i.b.a.c.l.w)localObject2));
        }
        else
        {
          throw ((Throwable)new AssertionError("Vararg parameter should be an array: ".concat(String.valueOf(localy))));
        }
      }
      else
      {
        localObject2 = b.q.a(paramh.b.a(localy.c(), (b.i.b.a.c.d.a.c.b.a)localObject4), null);
      }
      Object localObject3 = (b.i.b.a.c.l.w)((b.m)localObject2).a;
      localObject4 = (b.i.b.a.c.l.w)((b.m)localObject2).b;
      if ((b.f.b.j.a(paramt.i().a, "equals")) && (paramList.size() == 1) && (b.f.b.j.a(paramh.c.n.b().h(), localObject3)))
      {
        localObject1 = b.i.b.a.c.f.f.a("other");
      }
      else
      {
        if (localObject1 != null)
        {
          int k;
          if (((CharSequence)localObject1).length() > 0) {
            k = 1;
          } else {
            k = 0;
          }
          if ((k != 0) && (localSet.add(localObject1)))
          {
            localObject1 = b.i.b.a.c.f.f.a((String)localObject1);
            break label532;
          }
        }
        localObject2 = localy.b();
        if (localObject2 == null) {
          bool1 = bool2;
        }
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = b.i.b.a.c.f.f.a("p".concat(String.valueOf(m)));
        }
      }
      label532:
      b.f.b.j.a(localObject1, "if (function.name.asStri…(\"p$index\")\n            }");
      localCollection.add(new ai((b.i.b.a.c.b.a)paramt, null, m, localg, (b.i.b.a.c.f.f)localObject1, (b.i.b.a.c.l.w)localObject3, false, false, false, (b.i.b.a.c.l.w)localObject4, (am)paramh.c.i.a((b.i.b.a.c.d.a.e.l)localy)));
    }
    return new b(b.a.j.i((Iterable)localCollection), bool1);
  }
  
  protected static b.i.b.a.c.l.w a(b.i.b.a.c.d.a.e.q paramq, b.i.b.a.c.d.a.c.h paramh)
  {
    b.f.b.j.b(paramq, "method");
    b.f.b.j.b(paramh, "c");
    boolean bool = paramq.d().g();
    b.i.b.a.c.d.a.c.b.a locala = b.i.b.a.c.d.a.c.b.d.a(b.i.b.a.c.d.a.a.l.b, bool, null, 2);
    return paramh.b.a(paramq.r_(), locala);
  }
  
  private static boolean a(n paramn)
  {
    return (paramn.n()) && (paramn.m());
  }
  
  protected final e a(b.i.b.a.c.d.a.e.q paramq)
  {
    b.f.b.j.b(paramq, "method");
    Object localObject1 = b.i.b.a.c.d.a.c.f.a(this.e, (b.i.b.a.c.d.a.e.d)paramq);
    e locale = e.a(e(), (b.i.b.a.c.b.a.g)localObject1, paramq.p(), (am)this.e.c.i.a((b.i.b.a.c.d.a.e.l)paramq));
    b.f.b.j.a(locale, "JavaMethodDescriptor.cre….source(method)\n        )");
    b.i.b.a.c.d.a.c.h localh = b.i.b.a.c.d.a.c.a.a(this.e, (b.i.b.a.c.b.l)locale, (x)paramq, 0);
    Object localObject2 = (Iterable)paramq.q();
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (b.i.b.a.c.d.a.e.w)((Iterator)localObject2).next();
      localObject3 = localh.d.a((b.i.b.a.c.d.a.e.w)localObject3);
      if (localObject3 == null) {
        b.f.b.j.a();
      }
      ((Collection)localObject1).add(localObject3);
    }
    localObject1 = (List)localObject1;
    localObject2 = a(localh, (t)locale, paramq.b());
    Object localObject3 = a(paramq, (List)localObject1, a(paramq, localh), ((b)localObject2).a);
    localObject1 = ((a)localObject3).b;
    if (localObject1 != null)
    {
      localObject4 = (b.i.b.a.c.b.a)locale;
      localObject5 = b.i.b.a.c.b.a.g.a;
    }
    for (localObject1 = b.i.b.a.c.i.c.a((b.i.b.a.c.b.a)localObject4, (b.i.b.a.c.l.w)localObject1, g.a.a());; localObject1 = null) {
      break;
    }
    Object localObject4 = d();
    Object localObject5 = ((a)localObject3).d;
    List localList = ((a)localObject3).c;
    b.i.b.a.c.l.w localw = ((a)localObject3).a;
    Object localObject6 = b.i.b.a.c.b.w.e;
    localObject6 = w.a.a(paramq.l(), paramq.n() ^ true);
    az localaz = paramq.o();
    if (((a)localObject3).b != null) {}
    for (paramq = ac.a(b.q.a(e.a, b.a.j.c(((b)localObject2).a)));; paramq = ac.a()) {
      break;
    }
    locale.a((ak)localObject1, (ak)localObject4, (List)localObject5, localList, localw, (b.i.b.a.c.b.w)localObject6, localaz, paramq);
    locale.a(((a)localObject3).e, ((b)localObject2).b);
    if ((((Collection)((a)localObject3).f).isEmpty() ^ true)) {
      localh.c.e.a();
    }
    return locale;
  }
  
  protected abstract a a(b.i.b.a.c.d.a.e.q paramq, List<? extends ar> paramList, b.i.b.a.c.l.w paramw, List<? extends au> paramList1);
  
  public Collection<ah> a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    if (!l_().contains(paramf)) {}
    for (paramf = (List)v.a;; paramf = this.j.a(paramf)) {
      return (Collection)paramf;
    }
  }
  
  public Collection<b.i.b.a.c.b.l> a(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    return (Collection)this.a.b_();
  }
  
  protected final List<b.i.b.a.c.b.l> a(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramd, "kindFilter");
    b.f.b.j.b(paramb, "nameFilter");
    b.f.b.j.b(parama, "location");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Object localObject = b.i.b.a.c.i.e.d.m;
    b.i.b.a.c.f.f localf;
    if (paramd.a(b.i.b.a.c.i.e.d.i()))
    {
      localObject = c(paramd, paramb).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localf = (b.i.b.a.c.f.f)((Iterator)localObject).next();
        if (((Boolean)paramb.a(localf)).booleanValue()) {
          b.i.b.a.c.n.a.a((Collection)localLinkedHashSet, c(localf, parama));
        }
      }
    }
    localObject = b.i.b.a.c.i.e.d.m;
    if ((paramd.a(b.i.b.a.c.i.e.d.f())) && (!paramd.b.contains(c.a.a)))
    {
      localObject = b(paramd, paramb).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localf = (b.i.b.a.c.f.f)((Iterator)localObject).next();
        if (((Boolean)paramb.a(localf)).booleanValue()) {
          localLinkedHashSet.addAll(b(localf, parama));
        }
      }
    }
    localObject = b.i.b.a.c.i.e.d.m;
    if ((paramd.a(b.i.b.a.c.i.e.d.g())) && (!paramd.b.contains(c.a.a)))
    {
      paramd = a(paramd).iterator();
      while (paramd.hasNext())
      {
        localObject = (b.i.b.a.c.f.f)paramd.next();
        if (((Boolean)paramb.a(localObject)).booleanValue()) {
          localLinkedHashSet.addAll(a((b.i.b.a.c.f.f)localObject, parama));
        }
      }
    }
    return b.a.j.i((Iterable)localLinkedHashSet);
  }
  
  protected abstract Set<b.i.b.a.c.f.f> a(b.i.b.a.c.i.e.d paramd);
  
  protected abstract void a(b.i.b.a.c.f.f paramf, Collection<ah> paramCollection);
  
  protected abstract void a(Collection<al> paramCollection, b.i.b.a.c.f.f paramf);
  
  protected boolean a(e parame)
  {
    b.f.b.j.b(parame, "receiver$0");
    return true;
  }
  
  public Collection<al> b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    if (!j_().contains(paramf)) {}
    for (paramf = (List)v.a;; paramf = this.b.a(paramf)) {
      return (Collection)paramf;
    }
  }
  
  protected abstract Set<b.i.b.a.c.f.f> b(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb);
  
  protected abstract b c();
  
  protected abstract Set<b.i.b.a.c.f.f> c(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb);
  
  protected abstract ak d();
  
  protected abstract b.i.b.a.c.b.l e();
  
  public final Set<b.i.b.a.c.f.f> j_()
  {
    return (Set)b.i.b.a.c.k.h.a(this.g, c[0]);
  }
  
  public final Set<b.i.b.a.c.f.f> l_()
  {
    return (Set)b.i.b.a.c.k.h.a(this.h, c[1]);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Lazy scope for ");
    localStringBuilder.append(e());
    return localStringBuilder.toString();
  }
  
  protected static final class a
  {
    final b.i.b.a.c.l.w a;
    final b.i.b.a.c.l.w b;
    final List<au> c;
    final List<ar> d;
    final boolean e;
    final List<String> f;
    
    public a(b.i.b.a.c.l.w paramw1, b.i.b.a.c.l.w paramw2, List<? extends au> paramList, List<? extends ar> paramList1, boolean paramBoolean, List<String> paramList2)
    {
      this.a = paramw1;
      this.b = paramw2;
      this.c = paramList;
      this.d = paramList1;
      this.e = paramBoolean;
      this.f = paramList2;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((b.f.b.j.a(this.a, ((a)paramObject).a)) && (b.f.b.j.a(this.b, ((a)paramObject).b)) && (b.f.b.j.a(this.c, ((a)paramObject).c)) && (b.f.b.j.a(this.d, ((a)paramObject).d)))
          {
            int i;
            if (this.e == ((a)paramObject).e) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (b.f.b.j.a(this.f, ((a)paramObject).f))) {
              return true;
            }
          }
        }
        return false;
      }
      return true;
    }
    
    public final int hashCode()
    {
      throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MethodSignatureData(returnType=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", receiverType=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", valueParameters=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", typeParameters=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", hasStableParameterNames=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", errors=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  protected static final class b
  {
    final List<au> a;
    final boolean b;
    
    public b(List<? extends au> paramList, boolean paramBoolean)
    {
      this.a = paramList;
      this.b = paramBoolean;
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.l>>
  {
    c(k paramk)
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    d(k paramk)
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.a<b>
  {
    e(k paramk)
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    f(k paramk)
    {
      super();
    }
  }
  
  static final class g
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.f.f, List<? extends al>>
  {
    g(k paramk)
    {
      super();
    }
  }
  
  static final class h
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.f.f, List<? extends ah>>
  {
    h(k paramk)
    {
      super();
    }
  }
  
  static final class i
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    i(k paramk)
    {
      super();
    }
  }
  
  static final class j
    extends b.f.b.k
    implements b.f.a.a<b.i.b.a.c.i.b.f<?>>
  {
    j(k paramk, n paramn, z paramz)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */