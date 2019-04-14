package b.i.b.a.c.d.b;

import b.a.v;
import b.f.b.k;
import b.i.b.a.c.b.am;
import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.a.ae;
import b.i.b.a.c.e.a.ai;
import b.i.b.a.c.e.a.c.b;
import b.i.b.a.c.e.a.k;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.e.a.b.a;
import b.i.b.a.c.e.a.h;
import b.i.b.a.c.e.b.b.e;
import b.i.b.a.c.g.i.c;
import b.i.b.a.c.g.i.f;
import b.i.b.a.c.j.a.s;
import b.i.b.a.c.j.a.s.a;
import b.i.b.a.c.j.a.s.b;
import b.i.b.a.c.l.w;
import b.k.l;
import b.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class a<A, C>
  implements b.i.b.a.c.j.a.b<A, C>
{
  private static final Set<b.i.b.a.c.f.a> c;
  private static final a d = new a((byte)0);
  private final b.i.b.a.c.k.c<n, c<A, C>> a;
  private final m b;
  
  static
  {
    Object localObject = (Iterable)b.a.j.b(new b.i.b.a.c.f.b[] { b.i.b.a.c.d.a.p.a, b.i.b.a.c.d.a.p.d, b.i.b.a.c.d.a.p.e, new b.i.b.a.c.f.b("java.lang.annotation.Target"), new b.i.b.a.c.f.b("java.lang.annotation.Retention"), new b.i.b.a.c.f.b("java.lang.annotation.Documented") });
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection.add(b.i.b.a.c.f.a.a((b.i.b.a.c.f.b)((Iterator)localObject).next()));
    }
    c = b.a.j.k((Iterable)localCollection);
  }
  
  public a(b.i.b.a.c.k.i parami, m paramm)
  {
    this.b = paramm;
    this.a = parami.a((b.f.a.b)new f(this));
  }
  
  private static n a(s params, n paramn)
  {
    if (paramn != null) {
      return paramn;
    }
    if ((params instanceof s.a)) {
      return b((s.a)params);
    }
    return null;
  }
  
  private final n a(s params, boolean paramBoolean1, boolean paramBoolean2, Boolean paramBoolean, boolean paramBoolean3)
  {
    Object localObject;
    if (paramBoolean1)
    {
      if (paramBoolean != null)
      {
        if ((params instanceof s.a))
        {
          localObject = (s.a)params;
          if (((s.a)localObject).e == a.c.b.b)
          {
            params = this.b;
            paramBoolean = ((s.a)localObject).d.a(b.i.b.a.c.f.f.a("DefaultImpls"));
          }
        }
        for (localObject = "container.classId.create…EFAULT_IMPLS_CLASS_NAME))";; localObject = "ClassId.topLevel(FqName(…lName.replace('/', '.')))")
        {
          b.f.b.j.a(paramBoolean, (String)localObject);
          return params.a(paramBoolean);
          if ((!paramBoolean.booleanValue()) || (!(params instanceof s.b))) {
            break;
          }
          localObject = params.c;
          paramBoolean = (Boolean)localObject;
          if (!(localObject instanceof i)) {
            paramBoolean = null;
          }
          paramBoolean = (i)paramBoolean;
          if (paramBoolean != null) {
            paramBoolean = paramBoolean.c;
          } else {
            paramBoolean = null;
          }
          if (paramBoolean == null) {
            break;
          }
          params = this.b;
          paramBoolean = paramBoolean.a;
          b.f.b.j.a(paramBoolean, "facadeClassName.internalName");
          paramBoolean = b.i.b.a.c.f.a.a(new b.i.b.a.c.f.b(l.a(paramBoolean, '/', '.')));
        }
      }
      paramBoolean = new StringBuilder("isConst should not be null for property (container=");
      paramBoolean.append(params);
      paramBoolean.append(')');
      throw ((Throwable)new IllegalStateException(paramBoolean.toString().toString()));
    }
    if ((paramBoolean2) && ((params instanceof s.a)))
    {
      paramBoolean = (s.a)params;
      if (paramBoolean.e == a.c.b.g)
      {
        paramBoolean = paramBoolean.g;
        if ((paramBoolean != null) && ((paramBoolean.e == a.c.b.a) || (paramBoolean.e == a.c.b.c) || ((paramBoolean3) && ((paramBoolean.e == a.c.b.b) || (paramBoolean.e == a.c.b.e))))) {
          return b(paramBoolean);
        }
      }
    }
    if (((params instanceof s.b)) && ((params.c instanceof i)))
    {
      params = params.c;
      if (params != null)
      {
        localObject = (i)params;
        paramBoolean = ((i)localObject).d;
        params = paramBoolean;
        if (paramBoolean == null) {
          params = this.b.a(((i)localObject).c());
        }
        return params;
      }
      throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
    }
    return null;
  }
  
  private static q a(a.u paramu, b.i.b.a.c.e.a.c paramc, h paramh, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject = (i.c)paramu;
    i.f localf = b.i.b.a.c.e.b.b.d;
    b.f.b.j.a(localf, "propertySignature");
    localObject = (b.e)b.i.b.a.c.e.a.f.a((i.c)localObject, localf);
    if (localObject == null) {
      return null;
    }
    if (paramBoolean1)
    {
      localObject = b.i.b.a.c.e.b.a.j.a;
      paramu = b.i.b.a.c.e.b.a.j.a(paramu, paramc, paramh, paramBoolean3);
      if (paramu == null) {
        return null;
      }
      paramc = q.b;
      return q.a.a((b.i.b.a.c.e.b.a.f)paramu);
    }
    if ((paramBoolean2) && (((b.e)localObject).d()))
    {
      paramu = q.b;
      paramu = ((b.e)localObject).c;
      b.f.b.j.a(paramu, "signature.syntheticMethod");
      return q.a.a(paramc, paramu);
    }
    return null;
  }
  
  private static q a(b.i.b.a.c.g.q paramq, b.i.b.a.c.e.a.c paramc, h paramh, b.i.b.a.c.j.a.a parama, boolean paramBoolean)
  {
    if ((paramq instanceof b.i.b.a.c.e.a.e))
    {
      parama = q.b;
      parama = b.i.b.a.c.e.b.a.j.a;
      paramq = b.i.b.a.c.e.b.a.j.a((b.i.b.a.c.e.a.e)paramq, paramc, paramh);
      if (paramq != null) {
        return q.a.a((b.i.b.a.c.e.b.a.f)paramq);
      }
      return null;
    }
    if ((paramq instanceof a.o))
    {
      parama = q.b;
      parama = b.i.b.a.c.e.b.a.j.a;
      paramq = b.i.b.a.c.e.b.a.j.a((a.o)paramq, paramc, paramh);
      if (paramq != null) {
        return q.a.a((b.i.b.a.c.e.b.a.f)paramq);
      }
      return null;
    }
    if ((paramq instanceof a.u))
    {
      Object localObject = (i.c)paramq;
      i.f localf = b.i.b.a.c.e.b.b.d;
      b.f.b.j.a(localf, "propertySignature");
      localObject = (b.e)b.i.b.a.c.e.a.f.a((i.c)localObject, localf);
      if (localObject == null) {
        return null;
      }
      switch (b.a[parama.ordinal()])
      {
      default: 
        return null;
      case 3: 
        return a((a.u)paramq, paramc, paramh, true, true, paramBoolean);
      case 2: 
        if (((b.e)localObject).k())
        {
          paramq = q.b;
          paramq = ((b.e)localObject).e;
          b.f.b.j.a(paramq, "signature.setter");
          return q.a.a(paramc, paramq);
        }
        return null;
      }
      if (((b.e)localObject).g())
      {
        paramq = q.b;
        paramq = ((b.e)localObject).d;
        b.f.b.j.a(paramq, "signature.getter");
        return q.a.a(paramc, paramq);
      }
    }
    return null;
  }
  
  private final List<A> a(s params, q paramq, boolean paramBoolean1, boolean paramBoolean2, Boolean paramBoolean, boolean paramBoolean3)
  {
    params = a(params, a(params, paramBoolean1, paramBoolean2, paramBoolean, paramBoolean3));
    if (params == null) {
      return (List)v.a;
    }
    paramq = (List)((c)this.a.a(params)).a.get(paramq);
    params = paramq;
    if (paramq == null) {
      params = (List)v.a;
    }
    return params;
  }
  
  private final List<A> a(s params, a.u paramu, int paramInt)
  {
    Boolean localBoolean = b.i.b.a.c.e.a.b.w.a(paramu.b);
    b.f.b.j.a(localBoolean, "Flags.IS_CONST.get(proto.flags)");
    boolean bool2 = localBoolean.booleanValue();
    boolean bool3 = b.i.b.a.c.e.b.a.j.a(paramu);
    if (paramInt == b.a)
    {
      paramu = a(paramu, params.a, params.b, false, true, false, 40);
      if (paramu == null) {
        return (List)v.a;
      }
      return a(this, params, paramu, true, Boolean.valueOf(bool2), bool3, 8);
    }
    paramu = a(paramu, params.a, params.b, true, false, false, 48);
    if (paramu == null) {
      return (List)v.a;
    }
    boolean bool4 = l.b((CharSequence)paramu.a, (CharSequence)"$delegate");
    boolean bool1;
    if (paramInt == b.c) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if (bool4 != bool1) {
      return (List)v.a;
    }
    return a(params, paramu, true, true, Boolean.valueOf(bool2), bool3);
  }
  
  private static n b(s.a parama)
  {
    am localam = parama.c;
    parama = localam;
    if (!(localam instanceof p)) {
      parama = null;
    }
    parama = (p)parama;
    if (parama != null) {
      return parama.a;
    }
    return null;
  }
  
  protected abstract n.a a(b.i.b.a.c.f.a parama, am paramam, List<A> paramList);
  
  protected abstract A a(b.i.b.a.c.e.a.a parama, b.i.b.a.c.e.a.c paramc);
  
  public final C a(s params, a.u paramu, w paramw)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramu, "proto");
    b.f.b.j.b(paramw, "expectedType");
    n localn = a(params, a(params, true, true, b.i.b.a.c.e.a.b.w.a(paramu.b), b.i.b.a.c.e.b.a.j.a(paramu)));
    if (localn == null) {
      return null;
    }
    b.i.b.a.c.e.b.a.g localg = localn.c().b;
    Object localObject = e.b;
    localObject = (b.i.b.a.c.e.a.a)e.b();
    b.f.b.j.b(localObject, "version");
    int i = ((b.i.b.a.c.e.a.a)localObject).a;
    int j = ((b.i.b.a.c.e.a.a)localObject).b;
    int k = ((b.i.b.a.c.e.a.a)localObject).c;
    int m = localg.a;
    boolean bool = true;
    if ((m <= i) && ((localg.a < i) || ((localg.b <= j) && ((localg.b < j) || (localg.c < k))))) {
      bool = false;
    }
    params = a((b.i.b.a.c.g.q)paramu, params.a, params.b, b.i.b.a.c.j.a.a.b, bool);
    if (params == null) {
      return null;
    }
    paramu = ((c)this.a.a(localn)).b.get(params);
    if (paramu == null) {
      return null;
    }
    params = b.i.b.a.c.a.m.a;
    params = paramu;
    if (b.i.b.a.c.a.m.a(paramw)) {
      params = a(paramu);
    }
    return params;
  }
  
  protected abstract C a(C paramC);
  
  public final List<A> a(a.aa paramaa, b.i.b.a.c.e.a.c paramc)
  {
    b.f.b.j.b(paramaa, "proto");
    b.f.b.j.b(paramc, "nameResolver");
    paramaa = paramaa.c(b.i.b.a.c.e.b.b.f);
    b.f.b.j.a(paramaa, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
    Object localObject = (Iterable)paramaa;
    paramaa = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      b.i.b.a.c.e.a.a locala = (b.i.b.a.c.e.a.a)((Iterator)localObject).next();
      b.f.b.j.a(locala, "it");
      paramaa.add(a(locala, paramc));
    }
    return (List)paramaa;
  }
  
  public final List<A> a(a.ae paramae, b.i.b.a.c.e.a.c paramc)
  {
    b.f.b.j.b(paramae, "proto");
    b.f.b.j.b(paramc, "nameResolver");
    paramae = paramae.c(b.i.b.a.c.e.b.b.h);
    b.f.b.j.a(paramae, "proto.getExtension(JvmPr….typeParameterAnnotation)");
    Object localObject = (Iterable)paramae;
    paramae = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      b.i.b.a.c.e.a.a locala = (b.i.b.a.c.e.a.a)((Iterator)localObject).next();
      b.f.b.j.a(locala, "it");
      paramae.add(a(locala, paramc));
    }
    return (List)paramae;
  }
  
  public final List<A> a(final s.a parama)
  {
    b.f.b.j.b(parama, "container");
    Object localObject = b(parama);
    if (localObject != null)
    {
      parama = new ArrayList(1);
      n.c localc = (n.c)new e(this, parama);
      b.f.b.j.b(localObject, "kotlinClass");
      ((n)localObject).a(localc);
      return (List)parama;
    }
    localObject = new StringBuilder("Class for loading annotations is not found: ");
    ((StringBuilder)localObject).append(parama.a());
    throw ((Throwable)new IllegalStateException(((StringBuilder)localObject).toString().toString()));
  }
  
  public final List<A> a(s params, a.k paramk)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramk, "proto");
    Object localObject = q.b;
    paramk = params.a.a(paramk.b);
    localObject = ((s.a)params).d.e();
    b.f.b.j.a(localObject, "(container as ProtoConta…Class).classId.asString()");
    return a(this, params, q.a.b(paramk, b.i.b.a.c.e.b.a.c.a((String)localObject)), false, null, false, 60);
  }
  
  public final List<A> a(s params, a.u paramu)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramu, "proto");
    return a(params, paramu, b.b);
  }
  
  public final List<A> a(s params, b.i.b.a.c.g.q paramq, b.i.b.a.c.j.a.a parama)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramq, "proto");
    b.f.b.j.b(parama, "kind");
    if (parama == b.i.b.a.c.j.a.a.b) {
      return a(params, (a.u)paramq, b.a);
    }
    paramq = a(paramq, params.a, params.b, parama);
    if (paramq == null) {
      return (List)v.a;
    }
    return a(this, params, paramq, false, null, false, 60);
  }
  
  public final List<A> a(s params, b.i.b.a.c.g.q paramq, b.i.b.a.c.j.a.a parama, int paramInt, a.ai paramai)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramq, "callableProto");
    b.f.b.j.b(parama, "kind");
    b.f.b.j.b(paramai, "proto");
    parama = a(paramq, params.a, params.b, parama);
    if (parama != null)
    {
      boolean bool = paramq instanceof a.o;
      int i = 0;
      if (bool)
      {
        if (!b.i.b.a.c.e.a.g.a((a.o)paramq)) {}
      }
      else {
        do
        {
          for (;;)
          {
            i = 1;
            break label139;
            if (!(paramq instanceof a.u)) {
              break;
            }
            if (!b.i.b.a.c.e.a.g.a((a.u)paramq)) {
              break label139;
            }
          }
          if (!(paramq instanceof b.i.b.a.c.e.a.e)) {
            break label174;
          }
          if (params == null) {
            break label163;
          }
          paramq = (s.a)params;
          if (paramq.e == a.c.b.c)
          {
            i = 2;
            break;
          }
        } while (paramq.f);
      }
      label139:
      paramq = q.b;
      return a(this, params, q.a.a(parama, paramInt + i), false, null, false, 60);
      label163:
      throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
      label174:
      params = new StringBuilder("Unsupported message: ");
      params.append(paramq.getClass());
      throw ((Throwable)new UnsupportedOperationException(params.toString()));
    }
    return (List)v.a;
  }
  
  public final List<A> b(s params, a.u paramu)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramu, "proto");
    return a(params, paramu, b.c);
  }
  
  public final List<A> b(s params, b.i.b.a.c.g.q paramq, b.i.b.a.c.j.a.a parama)
  {
    b.f.b.j.b(params, "container");
    b.f.b.j.b(paramq, "proto");
    b.f.b.j.b(parama, "kind");
    paramq = a(paramq, params.a, params.b, parama);
    if (paramq != null)
    {
      parama = q.b;
      return a(this, params, q.a.a(paramq, 0), false, null, false, 60);
    }
    return (List)v.a;
  }
  
  static final class a {}
  
  static enum b
  {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
  }
  
  static final class c<A, C>
  {
    final Map<q, List<A>> a;
    final Map<q, C> b;
    
    public c(Map<q, ? extends List<? extends A>> paramMap, Map<q, ? extends C> paramMap1)
    {
      this.a = paramMap;
      this.b = paramMap1;
    }
  }
  
  public static final class d
    implements n.e
  {
    d(HashMap paramHashMap1, HashMap paramHashMap2) {}
    
    public final n.f a(b.i.b.a.c.f.f paramf, String paramString)
    {
      b.f.b.j.b(paramf, "name");
      b.f.b.j.b(paramString, "desc");
      q.a locala = q.b;
      paramf = paramf.a;
      b.f.b.j.a(paramf, "name.asString()");
      return (n.f)new a(q.a.a(paramf, paramString));
    }
    
    public final n.c b(b.i.b.a.c.f.f paramf, String paramString)
    {
      b.f.b.j.b(paramf, "name");
      b.f.b.j.b(paramString, "desc");
      q.a locala = q.b;
      paramf = paramf.a;
      b.f.b.j.a(paramf, "name.asString()");
      return (n.c)new b(q.a.b(paramf, paramString));
    }
    
    public final class a
      extends a.d.b
      implements n.f
    {
      public a()
      {
        super((q)localObject);
      }
      
      public final n.a a(int paramInt, b.i.b.a.c.f.a parama, am paramam)
      {
        b.f.b.j.b(parama, "classId");
        b.f.b.j.b(paramam, "source");
        Object localObject = q.b;
        q localq = q.a.a(this.b, paramInt);
        List localList = (List)a.d.this.b.get(localq);
        localObject = localList;
        if (localList == null)
        {
          localObject = (List)new ArrayList();
          ((Map)a.d.this.b).put(localq, localObject);
        }
        return a.a(a.d.this.a, parama, paramam, (List)localObject);
      }
    }
    
    public class b
      implements n.c
    {
      private final ArrayList<A> a;
      final q b;
      
      public b()
      {
        this.b = ((q)localObject);
        this.a = new ArrayList();
      }
      
      public final n.a a(b.i.b.a.c.f.a parama, am paramam)
      {
        b.f.b.j.b(parama, "classId");
        b.f.b.j.b(paramam, "source");
        return a.a(a.d.this.a, parama, paramam, (List)this.a);
      }
      
      public final void a()
      {
        if ((((Collection)this.a).isEmpty() ^ true)) {
          ((Map)a.d.this.b).put(this.b, this.a);
        }
      }
    }
  }
  
  public static final class e
    implements n.c
  {
    e(ArrayList paramArrayList) {}
    
    public final n.a a(b.i.b.a.c.f.a parama, am paramam)
    {
      b.f.b.j.b(parama, "classId");
      b.f.b.j.b(paramam, "source");
      return a.a(this.a, parama, paramam, (List)parama);
    }
    
    public final void a() {}
  }
  
  static final class f
    extends k
    implements b.f.a.b<n, a.c<? extends A, ? extends C>>
  {
    f(a parama)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */