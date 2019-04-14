package b.i.b.a.c.d.a.c.b;

import b.f.b.k;
import b.i.b.a.c.b.aa;
import b.i.b.a.c.d.a.a.l;
import b.i.b.a.c.d.a.c.h;
import b.i.b.a.c.d.a.c.m;
import b.i.b.a.c.d.a.e.u;
import b.i.b.a.c.d.a.e.v;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private final h a;
  private final m b;
  
  public c(h paramh, m paramm)
  {
    this.a = paramh;
    this.b = paramm;
  }
  
  private final b.i.b.a.c.b.e a(b.i.b.a.c.d.a.e.j paramj, a parama, b.i.b.a.c.f.b paramb)
  {
    if ((parama.c) && (b.f.b.j.a(paramb, d.a()))) {
      return this.a.c.o.a();
    }
    b.i.b.a.c.a.b.c localc = b.i.b.a.c.a.b.c.b;
    paramb = b.i.b.a.c.a.b.c.a(paramb, this.a.c.n.b());
    if (paramb == null) {
      return null;
    }
    if ((b.i.b.a.c.a.b.c.b(paramb)) && ((parama.b == b.c) || (parama.a == l.a) || (a(paramj, paramb)))) {
      return b.i.b.a.c.a.b.c.d(paramb);
    }
    return paramb;
  }
  
  private final ad a(b.i.b.a.c.d.a.e.j paramj, a parama, ad paramad)
  {
    Object localObject1;
    if (paramad != null)
    {
      localObject2 = paramad.r();
      localObject1 = localObject2;
      if (localObject2 != null) {}
    }
    else
    {
      localObject1 = (b.i.b.a.c.b.a.g)new b.i.b.a.c.d.a.c.e(this.a, (b.i.b.a.c.d.a.e.d)paramj);
    }
    an localan = b(paramj, parama);
    Object localObject2 = null;
    if (localan == null) {
      return null;
    }
    boolean bool = a(parama);
    if (paramad != null) {
      localObject2 = paramad.f();
    }
    if ((b.f.b.j.a(localObject2, localan)) && (!paramj.d()) && (bool)) {
      return paramad.b(true);
    }
    return x.a((b.i.b.a.c.b.a.g)localObject1, localan, a(paramj, parama, localan), bool);
  }
  
  private final an a(b.i.b.a.c.d.a.e.j paramj)
  {
    paramj = b.i.b.a.c.f.a.a(new b.i.b.a.c.f.b(paramj.e()));
    b.f.b.j.a(paramj, "ClassId.topLevel(FqName(…classifierQualifiedName))");
    paramj = this.a.c.d.a().l.a(paramj, b.a.j.a(Integer.valueOf(0))).c();
    b.f.b.j.a(paramj, "c.components.deserialize…istOf(0)).typeConstructor");
    return paramj;
  }
  
  private final ap a(v paramv, a parama, b.i.b.a.c.b.ar paramar)
  {
    if ((paramv instanceof b.i.b.a.c.d.a.e.z))
    {
      paramv = (b.i.b.a.c.d.a.e.z)paramv;
      v localv = paramv.a();
      if (paramv.b()) {
        paramv = ba.c;
      } else {
        paramv = ba.b;
      }
      if ((localv != null) && (!a(paramv, paramar))) {
        return b.i.b.a.c.l.c.a.a(a(localv, d.a(l.b, false, null, 3)), paramv, paramar);
      }
      return d.a(paramar, parama);
    }
    return (ap)new b.i.b.a.c.l.ar(ba.a, a(paramv, parama));
  }
  
  private final b.i.b.a.c.l.w a(b.i.b.a.c.d.a.e.j paramj, a parama)
  {
    c localc = new c(paramj);
    int i;
    if ((!parama.c) && (parama.a != l.a)) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool = paramj.d();
    if ((!bool) && (i == 0))
    {
      paramj = a(paramj, parama, null);
      if (paramj != null) {
        return (b.i.b.a.c.l.w)paramj;
      }
    }
    ad localad;
    for (paramj = localc.b();; paramj = x.a(localad, paramj))
    {
      return (b.i.b.a.c.l.w)paramj;
      localad = a(paramj, parama.a(b.c), null);
      if (localad == null) {
        break;
      }
      paramj = a(paramj, parama.a(b.b), localad);
      if (paramj == null) {
        break;
      }
      if (bool) {
        return (b.i.b.a.c.l.w)new g(localad, paramj);
      }
    }
  }
  
  private final List<ap> a(b.i.b.a.c.d.a.e.j paramj, final a parama, final an paraman)
  {
    final boolean bool = paramj.d();
    int i;
    if ((!bool) && ((!paramj.c().isEmpty()) || (paraman.b().isEmpty()))) {
      i = 0;
    } else {
      i = 1;
    }
    Object localObject1 = paraman.b();
    b.f.b.j.a(localObject1, "constructor.parameters");
    Object localObject2;
    Object localObject3;
    if (i != 0)
    {
      paramj = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(b.a.j.a(paramj));
      localObject2 = paramj.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (b.i.b.a.c.b.ar)((Iterator)localObject2).next();
        b.i.b.a.c.l.z localz = new b.i.b.a.c.l.z(this.a.c.a, (b.f.a.a)new b((b.i.b.a.c.b.ar)localObject3, this, parama, paraman, bool));
        paramj = e.a;
        b.f.b.j.a(localObject3, "parameter");
        if (bool) {
          paramj = parama;
        } else {
          paramj = parama.a(b.a);
        }
        ((Collection)localObject1).add(e.a((b.i.b.a.c.b.ar)localObject3, paramj, (b.i.b.a.c.l.w)localz));
      }
      return b.a.j.i((Iterable)localObject1);
    }
    if (((List)localObject1).size() != paramj.c().size())
    {
      parama = (Iterable)localObject1;
      paramj = (Collection)new ArrayList(b.a.j.a(parama));
      parama = parama.iterator();
      while (parama.hasNext())
      {
        paraman = (b.i.b.a.c.b.ar)parama.next();
        b.f.b.j.a(paraman, "p");
        paramj.add(new b.i.b.a.c.l.ar((b.i.b.a.c.l.w)p.c(paraman.i().a)));
      }
      return b.a.j.i((Iterable)paramj);
    }
    parama = b.a.j.l((Iterable)paramj.c());
    paramj = (Collection)new ArrayList(b.a.j.a(parama));
    parama = parama.iterator();
    while (parama.hasNext())
    {
      paraman = (b.a.y)parama.next();
      int j = paraman.a;
      paraman = (v)paraman.b;
      if (j < ((List)localObject1).size()) {
        i = 1;
      } else {
        i = 0;
      }
      if ((b.w.a) && (i == 0))
      {
        paramj = new StringBuilder("Argument index should be less then type parameters count, but ");
        paramj.append(j);
        paramj.append(" > ");
        paramj.append(((List)localObject1).size());
        throw ((Throwable)new AssertionError(paramj.toString()));
      }
      localObject2 = (b.i.b.a.c.b.ar)((List)localObject1).get(j);
      localObject3 = d.a(l.b, false, null, 3);
      b.f.b.j.a(localObject2, "parameter");
      paramj.add(a(paraman, (a)localObject3, (b.i.b.a.c.b.ar)localObject2));
    }
    return b.a.j.i((Iterable)paramj);
  }
  
  private static boolean a(a parama)
  {
    if (parama.b == b.c) {
      return false;
    }
    return (!parama.c) && (parama.a != l.a);
  }
  
  private static boolean a(b.i.b.a.c.d.a.e.j paramj, b.i.b.a.c.b.e parame)
  {
    a locala = a.a;
    if (!a.a((v)b.a.j.f(paramj.c()))) {
      return false;
    }
    paramj = b.i.b.a.c.a.b.c.b;
    paramj = b.i.b.a.c.a.b.c.d(parame).c();
    b.f.b.j.a(paramj, "JavaToKotlinClassMap.con…         .typeConstructor");
    paramj = paramj.b();
    b.f.b.j.a(paramj, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
    paramj = (b.i.b.a.c.b.ar)b.a.j.f(paramj);
    if (paramj != null)
    {
      paramj = paramj.k();
      if (paramj == null) {
        return false;
      }
      b.f.b.j.a(paramj, "JavaToKotlinClassMap.con….variance ?: return false");
      if (paramj != ba.c) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(ba paramba, b.i.b.a.c.b.ar paramar)
  {
    if (paramar.k() == ba.a) {
      return false;
    }
    return paramba != paramar.k();
  }
  
  private final an b(b.i.b.a.c.d.a.e.j paramj, a parama)
  {
    Object localObject = paramj.b();
    if (localObject == null) {
      return a(paramj);
    }
    if ((localObject instanceof b.i.b.a.c.d.a.e.g))
    {
      b.i.b.a.c.d.a.e.g localg = (b.i.b.a.c.d.a.e.g)localObject;
      b.i.b.a.c.f.b localb = localg.b();
      if (localb != null)
      {
        localObject = a(paramj, parama, localb);
        parama = (a)localObject;
        if (localObject == null) {
          parama = this.a.c.j.a(localg);
        }
        if (parama != null)
        {
          parama = parama.c();
          if (parama != null) {
            return parama;
          }
        }
        return a(paramj);
      }
      throw ((Throwable)new AssertionError("Class type should have a FQ name: ".concat(String.valueOf(localObject))));
    }
    if ((localObject instanceof b.i.b.a.c.d.a.e.w))
    {
      paramj = this.b.a((b.i.b.a.c.d.a.e.w)localObject);
      if (paramj != null) {
        return paramj.c();
      }
      return null;
    }
    throw ((Throwable)new IllegalStateException("Unknown classifier kind: ".concat(String.valueOf(localObject))));
  }
  
  public final b.i.b.a.c.l.w a(b.i.b.a.c.d.a.e.f paramf, a parama, boolean paramBoolean)
  {
    b.f.b.j.b(paramf, "arrayType");
    b.f.b.j.b(parama, "attr");
    Object localObject = paramf.a();
    if (!(localObject instanceof u)) {
      paramf = null;
    } else {
      paramf = (b.i.b.a.c.d.a.e.f)localObject;
    }
    paramf = (u)paramf;
    if (paramf != null) {
      paramf = paramf.a();
    } else {
      paramf = null;
    }
    if (paramf != null)
    {
      paramf = this.a.c.n.b().b(paramf);
      b.f.b.j.a(paramf, "c.module.builtIns.getPri…KotlinType(primitiveType)");
      if (parama.c) {
        return (b.i.b.a.c.l.w)paramf;
      }
      paramf = x.a(paramf, paramf.b(true));
    }
    for (;;)
    {
      return (b.i.b.a.c.l.w)paramf;
      localObject = a((v)localObject, d.a(l.b, parama.c, null, 2));
      if (parama.c)
      {
        if (paramBoolean) {
          paramf = ba.c;
        } else {
          paramf = ba.a;
        }
        paramf = this.a.c.n.b().a(paramf, (b.i.b.a.c.l.w)localObject);
        b.f.b.j.a(paramf, "c.module.builtIns.getArr…ctionKind, componentType)");
      }
      else
      {
        paramf = this.a.c.n.b().a(ba.a, (b.i.b.a.c.l.w)localObject);
        b.f.b.j.a(paramf, "c.module.builtIns.getArr…INVARIANT, componentType)");
        paramf = x.a(paramf, this.a.c.n.b().a(ba.c, (b.i.b.a.c.l.w)localObject).b(true));
      }
    }
  }
  
  public final b.i.b.a.c.l.w a(v paramv, a parama)
  {
    b.f.b.j.b(paramv, "javaType");
    b.f.b.j.b(parama, "attr");
    if ((paramv instanceof u))
    {
      paramv = ((u)paramv).a();
      if (paramv != null) {
        paramv = this.a.c.n.b().a(paramv);
      } else {
        paramv = this.a.c.n.b().i();
      }
      b.f.b.j.a(paramv, "if (primitiveType != nul….module.builtIns.unitType");
      return (b.i.b.a.c.l.w)paramv;
    }
    if ((paramv instanceof b.i.b.a.c.d.a.e.j)) {
      return a((b.i.b.a.c.d.a.e.j)paramv, parama);
    }
    if ((paramv instanceof b.i.b.a.c.d.a.e.f)) {
      return a((b.i.b.a.c.d.a.e.f)paramv, parama, false);
    }
    if ((paramv instanceof b.i.b.a.c.d.a.e.z))
    {
      paramv = ((b.i.b.a.c.d.a.e.z)paramv).a();
      if (paramv != null)
      {
        paramv = a(paramv, parama);
        if (paramv != null) {
          return paramv;
        }
      }
      paramv = this.a.c.n.b().h();
      b.f.b.j.a(paramv, "c.module.builtIns.defaultBound");
      return (b.i.b.a.c.l.w)paramv;
    }
    throw ((Throwable)new UnsupportedOperationException("Unsupported type: ".concat(String.valueOf(paramv))));
  }
  
  static final class a
    extends k
    implements b.f.a.b<v, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
    
    public static boolean a(v paramv)
    {
      v localv = paramv;
      if (!(paramv instanceof b.i.b.a.c.d.a.e.z)) {
        localv = null;
      }
      paramv = (b.i.b.a.c.d.a.e.z)localv;
      return (paramv != null) && (paramv.a() != null) && (!paramv.b());
    }
  }
  
  static final class b
    extends k
    implements b.f.a.a<b.i.b.a.c.l.w>
  {
    b(b.i.b.a.c.b.ar paramar, c paramc, a parama, an paraman, boolean paramBoolean)
    {
      super();
    }
  }
  
  static final class c
    extends k
    implements b.f.a.a<ad>
  {
    c(b.i.b.a.c.d.a.e.j paramj)
    {
      super();
    }
    
    public final ad b()
    {
      Object localObject = new StringBuilder("Unresolved java class ");
      ((StringBuilder)localObject).append(this.a.f());
      localObject = p.c(((StringBuilder)localObject).toString());
      b.f.b.j.a(localObject, "ErrorUtils.createErrorTy…vaType.presentableText}\")");
      return (ad)localObject;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */