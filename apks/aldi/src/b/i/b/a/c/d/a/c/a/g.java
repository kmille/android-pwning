package b.i.b.a.c.d.a.c.a;

import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.c.aa;
import b.i.b.a.c.b.c.ad;
import b.i.b.a.c.b.c.y;
import b.i.b.a.c.b.t.a;
import b.i.b.a.c.d.a.e.n;
import b.i.b.a.c.d.a.e.q;
import b.i.b.a.c.d.a.e.x;
import b.i.b.a.c.d.a.m.a;
import b.i.b.a.c.d.a.o;
import b.i.b.a.c.d.a.s;
import b.i.b.a.c.d.b.r;
import b.i.b.a.c.i.j.a;
import b.i.b.a.c.i.j.a.a;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.c.n.i.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g
  extends k
{
  final b.i.b.a.c.k.f<List<b.i.b.a.c.b.d>> a;
  final b.i.b.a.c.b.e b;
  private final b.i.b.a.c.k.f<Set<b.i.b.a.c.f.f>> g;
  private final b.i.b.a.c.k.f<Map<b.i.b.a.c.f.f, n>> h;
  private final b.i.b.a.c.k.d<b.i.b.a.c.f.f, b.i.b.a.c.b.c.g> i;
  private final b.i.b.a.c.d.a.e.g j;
  
  public g(final b.i.b.a.c.d.a.c.h paramh, b.i.b.a.c.b.e parame, b.i.b.a.c.d.a.e.g paramg)
  {
    super(paramh);
    this.b = parame;
    this.j = paramg;
    this.a = paramh.c.a.a((b.f.a.a)new f(this, paramh));
    this.g = paramh.c.a.a((b.f.a.a)new i(this));
    this.h = paramh.c.a.a((b.f.a.a)new g(this));
    this.i = paramh.c.a.b((b.f.a.b)new j(this, paramh));
  }
  
  private final al a(ah paramah, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    Object localObject1 = paramah.b();
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = (b.i.b.a.c.b.ai)b.i.b.a.c.d.a.t.a((b.i.b.a.c.b.b)localObject1);
    } else {
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      localObject2 = b.i.b.a.c.d.a.e.a;
      localObject2 = b.i.b.a.c.d.a.e.b((b.i.b.a.c.b.b)localObject1);
    }
    if ((localObject2 != null) && (!b.i.b.a.c.d.a.t.a(this.b, (b.i.b.a.c.b.a)localObject1))) {
      return a(paramah, (String)localObject2, paramb);
    }
    localObject1 = o.c(paramah.i().a);
    b.f.b.j.a(localObject1, "JvmAbi.getterName(name.asString())");
    return a(paramah, (String)localObject1, paramb);
  }
  
  private static al a(ah paramah, String paramString, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    paramString = b.i.b.a.c.f.f.a(paramString);
    b.f.b.j.a(paramString, "Name.identifier(getterName)");
    paramb = ((Iterable)paramb.a(paramString)).iterator();
    while (paramb.hasNext())
    {
      paramString = (al)paramb.next();
      if (paramString.k().size() == 0)
      {
        b.i.b.a.c.l.a.c localc = b.i.b.a.c.l.a.c.a;
        b.i.b.a.c.l.w localw = paramString.g();
        boolean bool;
        if (localw == null) {
          bool = false;
        } else {
          bool = localc.a(localw, paramah.y());
        }
        if (bool) {}
      }
      else
      {
        paramString = null;
      }
      if (paramString != null) {
        return paramString;
      }
    }
    return null;
  }
  
  private static al a(al paramal, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    if (!paramal.C()) {
      return null;
    }
    Object localObject = paramal.i();
    b.f.b.j.a(localObject, "descriptor.name");
    localObject = ((Iterable)paramb.a(localObject)).iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramb = e((al)((Iterator)localObject).next());
      if ((paramb == null) || (!a((b.i.b.a.c.b.a)paramb, (b.i.b.a.c.b.a)paramal))) {
        paramb = null;
      }
      if (paramb != null) {
        return paramb;
      }
    }
    return null;
  }
  
  private static al a(al paramal, b.i.b.a.c.b.a parama, Collection<? extends al> paramCollection)
  {
    paramCollection = (Iterable)paramCollection;
    boolean bool = paramCollection instanceof Collection;
    int m = 0;
    if ((!bool) || (!((Collection)paramCollection).isEmpty()))
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        al localal = (al)paramCollection.next();
        if (((b.f.b.j.a(paramal, localal) ^ true)) && (localal.x() == null) && (a((b.i.b.a.c.b.a)localal, parama))) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0)
        {
          k = m;
          break label110;
        }
      }
    }
    int k = 1;
    label110:
    if (k != 0) {
      return paramal;
    }
    paramal = paramal.D().d().f();
    if (paramal == null) {
      b.f.b.j.a();
    }
    return (al)paramal;
  }
  
  private static al a(al paramal, b.i.b.a.c.f.f paramf)
  {
    paramal = paramal.D();
    paramal.a(paramf);
    paramal.a();
    paramal.b();
    paramal = paramal.f();
    if (paramal == null) {
      b.f.b.j.a();
    }
    return (al)paramal;
  }
  
  private final Set<al> a(b.i.b.a.c.f.f paramf)
  {
    Object localObject1 = this.b.c();
    b.f.b.j.a(localObject1, "ownerDescriptor.typeConstructor");
    localObject1 = ((an)localObject1).i_();
    b.f.b.j.a(localObject1, "ownerDescriptor.typeConstructor.supertypes");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      b.a.j.a((Collection)localObject1, (Iterable)((b.i.b.a.c.l.w)((Iterator)localObject2).next()).b().b(paramf, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.o));
    }
    return (Set)localObject1;
  }
  
  private final void a(b.i.b.a.c.f.f paramf, Collection<? extends al> paramCollection1, Collection<? extends al> paramCollection2, Collection<al> paramCollection, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    Iterator localIterator = paramCollection2.iterator();
    while (localIterator.hasNext())
    {
      al localal = (al)localIterator.next();
      paramCollection2 = (al)b.i.b.a.c.d.a.t.a((b.i.b.a.c.b.b)localal);
      Object localObject2 = null;
      Object localObject1;
      if (paramCollection2 != null)
      {
        do
        {
          while (!((Iterator)localObject1).hasNext())
          {
            localObject1 = b.i.b.a.c.d.a.t.d((b.i.b.a.c.b.b)paramCollection2);
            if (localObject1 == null) {
              b.f.b.j.a();
            }
            localObject1 = b.i.b.a.c.f.f.a((String)localObject1);
            b.f.b.j.a(localObject1, "Name.identifier(nameInJava)");
            localObject1 = ((Collection)paramb.a(localObject1)).iterator();
          }
          localObject3 = a((al)((Iterator)localObject1).next(), paramf);
        } while (!a(paramCollection2, (b.i.b.a.c.b.t)localObject3));
        paramCollection2 = a((al)localObject3, (b.i.b.a.c.b.a)paramCollection2, paramCollection1);
      }
      else
      {
        paramCollection2 = null;
      }
      b.i.b.a.c.n.a.a(paramCollection, paramCollection2);
      Object localObject3 = b.i.b.a.c.d.a.d.a((b.i.b.a.c.b.t)localal);
      if (localObject3 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        paramCollection2 = ((b.i.b.a.c.b.t)localObject3).i();
        b.f.b.j.a(paramCollection2, "overridden.name");
        localObject1 = ((Iterable)paramb.a(paramCollection2)).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramCollection2 = ((Iterator)localObject1).next();
          if (b((al)paramCollection2, (b.i.b.a.c.b.t)localObject3)) {
            break label253;
          }
        }
        paramCollection2 = null;
        label253:
        localObject1 = (al)paramCollection2;
        if (localObject1 != null)
        {
          paramCollection2 = ((al)localObject1).D();
          Object localObject4 = ((b.i.b.a.c.b.t)localObject3).k();
          b.f.b.j.a(localObject4, "overridden.valueParameters");
          Object localObject5 = (Iterable)localObject4;
          localObject4 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject5));
          localObject5 = ((Iterable)localObject5).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            au localau = (au)((Iterator)localObject5).next();
            b.f.b.j.a(localau, "it");
            b.i.b.a.c.l.w localw = localau.y();
            b.f.b.j.a(localw, "it.type");
            ((Collection)localObject4).add(new b.i.b.a.c.d.a.b.j(localw, localau.h()));
          }
          localObject4 = (Collection)localObject4;
          localObject1 = ((al)localObject1).k();
          b.f.b.j.a(localObject1, "override.valueParameters");
          paramCollection2.a(b.i.b.a.c.d.a.b.i.a((Collection)localObject4, (Collection)localObject1, (b.i.b.a.c.b.a)localObject3));
          paramCollection2.a();
          paramCollection2.b();
          paramCollection2 = (al)paramCollection2.f();
        }
        else
        {
          paramCollection2 = null;
        }
        localObject1 = localObject2;
        if (paramCollection2 != null)
        {
          if (!((g)this).a(paramCollection2)) {
            paramCollection2 = null;
          }
          localObject1 = localObject2;
          if (paramCollection2 != null) {
            localObject1 = a(paramCollection2, (b.i.b.a.c.b.a)localObject3, paramCollection1);
          }
        }
      }
      b.i.b.a.c.n.a.a(paramCollection, localObject1);
      b.i.b.a.c.n.a.a(paramCollection, a(localal, paramb));
    }
  }
  
  private final void a(Collection<al> paramCollection, Collection<? extends al> paramCollection1, boolean paramBoolean)
  {
    paramCollection1 = b.i.b.a.c.d.a.a.a.a(paramCollection1, paramCollection, this.b, this.e.c.f);
    b.f.b.j.a(paramCollection1, "resolveOverridesForNonSt…s.errorReporter\n        )");
    if (!paramBoolean)
    {
      paramCollection.addAll(paramCollection1);
      return;
    }
    paramCollection1 = (Iterable)paramCollection1;
    List localList = b.a.j.b(paramCollection, paramCollection1);
    Collection localCollection = (Collection)new ArrayList(b.a.j.a(paramCollection1));
    Iterator localIterator = paramCollection1.iterator();
    while (localIterator.hasNext())
    {
      paramCollection1 = (al)localIterator.next();
      al localal = (al)b.i.b.a.c.d.a.t.c((b.i.b.a.c.b.b)paramCollection1);
      if (localal != null)
      {
        b.f.b.j.a(paramCollection1, "resolvedOverride");
        paramCollection1 = a(paramCollection1, (b.i.b.a.c.b.a)localal, (Collection)localList);
      }
      localCollection.add(paramCollection1);
    }
    paramCollection.addAll((Collection)localCollection);
  }
  
  private final void a(List<au> paramList, b.i.b.a.c.b.k paramk, int paramInt, q paramq, b.i.b.a.c.l.w paramw1, b.i.b.a.c.l.w paramw2)
  {
    b.i.b.a.c.b.a locala = (b.i.b.a.c.b.a)paramk;
    paramk = b.i.b.a.c.b.a.g.a;
    b.i.b.a.c.b.a.g localg = b.i.b.a.c.b.a.g.a.a();
    b.i.b.a.c.f.f localf = paramq.p();
    paramw1 = av.d(paramw1);
    b.f.b.j.a(paramw1, "TypeUtils.makeNotNullable(returnType)");
    boolean bool = paramq.e();
    if (paramw2 != null) {}
    for (paramk = av.d(paramw2);; paramk = null) {
      break;
    }
    paramList.add(new b.i.b.a.c.b.c.ai(locala, null, paramInt, localg, localf, paramw1, bool, false, false, paramk, (am)this.e.c.i.a((b.i.b.a.c.d.a.e.l)paramq)));
  }
  
  private final void a(Set<? extends ah> paramSet, Collection<ah> paramCollection, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      b.i.b.a.c.d.a.b.f localf = d((ah)paramSet.next(), paramb);
      if (localf != null) {
        paramCollection.add(localf);
      }
    }
  }
  
  private static boolean a(b.i.b.a.c.b.a parama1, b.i.b.a.c.b.a parama2)
  {
    Object localObject = b.i.b.a.c.i.j.a.a(parama2, parama1, true);
    b.f.b.j.a(localObject, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
    localObject = ((j.a)localObject).a;
    b.f.b.j.a(localObject, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
    if (localObject == j.a.a.a)
    {
      localObject = b.i.b.a.c.d.a.m.a;
      if (!m.a.a(parama2, parama1)) {
        return true;
      }
    }
    return false;
  }
  
  private final boolean a(final al paramal)
  {
    Object localObject1 = paramal.i();
    b.f.b.j.a(localObject1, "function.name");
    localObject1 = (Iterable)s.a((b.i.b.a.c.f.f)localObject1);
    if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Iterable)b((b.i.b.a.c.f.f)((Iterator)localObject1).next());
        if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
        {
          localObject2 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            ah localah = (ah)((Iterator)localObject2).next();
            if ((c(localah, (b.f.a.b)new h(this, paramal))) && ((localah.z()) || (!o.b(paramal.i().a)))) {
              k = 1;
            } else {
              k = 0;
            }
            if (k != 0)
            {
              k = 1;
              break label191;
            }
          }
        }
        k = 0;
        label191:
        if (k != 0)
        {
          k = 1;
          break label202;
        }
      }
    }
    int k = 0;
    label202:
    if (k != 0) {
      return false;
    }
    return (!c(paramal)) && (!b(paramal)) && (!d(paramal));
  }
  
  private static boolean a(al paramal, b.i.b.a.c.b.t paramt)
  {
    Object localObject = b.i.b.a.c.d.a.c.a;
    localObject = paramt;
    if (b.i.b.a.c.d.a.c.c(paramal)) {
      localObject = paramt.w();
    }
    b.f.b.j.a(localObject, "if (superDescriptor.isRe…iginal else subDescriptor");
    return a((b.i.b.a.c.b.a)localObject, (b.i.b.a.c.b.a)paramal);
  }
  
  private static al b(ah paramah, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    Object localObject1 = b.i.b.a.c.f.f.a(o.d(paramah.i().a));
    b.f.b.j.a(localObject1, "Name.identifier(JvmAbi.s…terName(name.asString()))");
    localObject1 = ((Iterable)paramb.a(localObject1)).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramb = (al)((Iterator)localObject1).next();
      if (paramb.k().size() == 1)
      {
        Object localObject2 = paramb.g();
        if ((localObject2 != null) && (b.i.b.a.c.a.g.s((b.i.b.a.c.l.w)localObject2)))
        {
          localObject2 = b.i.b.a.c.l.a.c.a;
          Object localObject3 = paramb.k();
          b.f.b.j.a(localObject3, "descriptor.valueParameters");
          localObject3 = b.a.j.g((List)localObject3);
          b.f.b.j.a(localObject3, "descriptor.valueParameters.single()");
          if (((b.i.b.a.c.l.a.c)localObject2).b(((au)localObject3).y(), paramah.y())) {
            break label159;
          }
        }
      }
      paramb = null;
      label159:
      if (paramb != null) {
        return paramb;
      }
    }
    return null;
  }
  
  private final Set<ah> b(b.i.b.a.c.f.f paramf)
  {
    Object localObject1 = this.b.c();
    b.f.b.j.a(localObject1, "ownerDescriptor.typeConstructor");
    localObject1 = ((an)localObject1).i_();
    b.f.b.j.a(localObject1, "ownerDescriptor.typeConstructor.supertypes");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Iterable)((b.i.b.a.c.l.w)((Iterator)localObject2).next()).b().a(paramf, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.o);
      Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext()) {
        localCollection.add((ah)((Iterator)localObject3).next());
      }
      b.a.j.a((Collection)localObject1, (Iterable)localCollection);
    }
    return b.a.j.k((Iterable)localObject1);
  }
  
  private final boolean b(al paramal)
  {
    Object localObject1 = b.i.b.a.c.d.a.d.a;
    localObject1 = paramal.i();
    b.f.b.j.a(localObject1, "name");
    if (!b.i.b.a.c.d.a.d.a((b.i.b.a.c.f.f)localObject1)) {
      return false;
    }
    localObject1 = paramal.i();
    b.f.b.j.a(localObject1, "name");
    Object localObject2 = (Iterable)a((b.i.b.a.c.f.f)localObject1);
    localObject1 = (Collection)new ArrayList();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      b.i.b.a.c.b.t localt = b.i.b.a.c.d.a.d.a((b.i.b.a.c.b.t)((Iterator)localObject2).next());
      if (localt != null) {
        ((Collection)localObject1).add(localt);
      }
    }
    localObject1 = (Iterable)localObject1;
    if (!((Collection)localObject1).isEmpty())
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        if (b(paramal, (b.i.b.a.c.b.t)((Iterator)localObject1).next())) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static boolean b(al paramal, b.i.b.a.c.b.t paramt)
  {
    String str = r.a((b.i.b.a.c.b.t)paramal, false, false, 2);
    b.i.b.a.c.b.t localt = paramt.w();
    b.f.b.j.a(localt, "builtinWithErasedParameters.original");
    return (b.f.b.j.a(str, r.a(localt, false, false, 2))) && (!a((b.i.b.a.c.b.a)paramal, (b.i.b.a.c.b.a)paramt));
  }
  
  private final boolean c(ah paramah, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    if (c.a(paramah)) {
      return false;
    }
    al localal = a(paramah, paramb);
    paramb = b(paramah, paramb);
    if (localal == null) {
      return false;
    }
    if (!paramah.z()) {
      return true;
    }
    return (paramb != null) && (paramb.d_() == localal.d_());
  }
  
  private final boolean c(al paramal)
  {
    Object localObject1 = b.i.b.a.c.d.a.c.a;
    localObject1 = paramal.i();
    b.f.b.j.a(localObject1, "name");
    localObject1 = (Iterable)b.i.b.a.c.d.a.c.b((b.i.b.a.c.f.f)localObject1);
    if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (b.i.b.a.c.f.f)((Iterator)localObject1).next();
        Object localObject4 = (Iterable)a((b.i.b.a.c.f.f)localObject2);
        Object localObject3 = (Collection)new ArrayList();
        localObject4 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          Object localObject5 = ((Iterator)localObject4).next();
          if (b.i.b.a.c.d.a.t.b((b.i.b.a.c.b.b)localObject5)) {
            ((Collection)localObject3).add(localObject5);
          }
        }
        localObject3 = (List)localObject3;
        if (!((List)localObject3).isEmpty())
        {
          localObject2 = a(paramal, (b.i.b.a.c.f.f)localObject2);
          localObject3 = (Iterable)localObject3;
          if (!((Collection)localObject3).isEmpty())
          {
            localObject3 = ((Iterable)localObject3).iterator();
            while (((Iterator)localObject3).hasNext()) {
              if (a((al)((Iterator)localObject3).next(), (b.i.b.a.c.b.t)localObject2))
              {
                k = 1;
                break label242;
              }
            }
          }
        }
        int k = 0;
        label242:
        if (k != 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  private final b.i.b.a.c.d.a.b.f d(ah paramah, b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    boolean bool = c(paramah, paramb);
    StringBuilder localStringBuilder = null;
    Object localObject1 = null;
    if (!bool) {
      return null;
    }
    al localal = a(paramah, paramb);
    if (localal == null) {
      b.f.b.j.a();
    }
    if (paramah.z())
    {
      localObject2 = b(paramah, paramb);
      paramb = (b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>>)localObject2;
      if (localObject2 == null)
      {
        b.f.b.j.a();
        paramb = (b.f.a.b<? super b.i.b.a.c.f.f, ? extends Collection<? extends al>>)localObject2;
      }
    }
    else
    {
      paramb = null;
    }
    int k;
    if ((paramb != null) && (paramb.d_() != localal.d_())) {
      k = 0;
    } else {
      k = 1;
    }
    if ((b.w.a) && (k == 0))
    {
      localStringBuilder = new StringBuilder("Different accessors modalities when creating overrides for ");
      localStringBuilder.append(paramah);
      localStringBuilder.append(" in ");
      localStringBuilder.append(this.b);
      localStringBuilder.append("for getter is ");
      localStringBuilder.append(localal.d_());
      localStringBuilder.append(", but for setter is ");
      paramah = (ah)localObject1;
      if (paramb != null) {
        paramah = paramb.d_();
      }
      localStringBuilder.append(paramah);
      throw ((Throwable)new AssertionError(localStringBuilder.toString()));
    }
    localObject1 = (b.i.b.a.c.b.l)this.b;
    Object localObject2 = b.i.b.a.c.b.a.g.a;
    localObject2 = b.i.b.a.c.b.a.g.a.a();
    Object localObject3 = localal.d_();
    az localaz = localal.j();
    if (paramb != null) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = b.i.b.a.c.d.a.b.f.a((b.i.b.a.c.b.l)localObject1, (b.i.b.a.c.b.a.g)localObject2, (b.i.b.a.c.b.w)localObject3, localaz, bool, paramah.i(), localal.s(), false);
    b.f.b.j.a(localObject1, "JavaPropertyDescriptor.c…inal = */ false\n        )");
    paramah = localal.g();
    if (paramah == null) {
      b.f.b.j.a();
    }
    ((b.i.b.a.c.d.a.b.f)localObject1).a(paramah, (List)b.a.v.a, d(), null);
    localObject3 = (ah)localObject1;
    localObject2 = b.i.b.a.c.i.c.a((ah)localObject3, localal.r(), false, localal.s());
    ((y)localObject2).h = ((b.i.b.a.c.b.t)localal);
    ((aa)localObject2).a(((b.i.b.a.c.d.a.b.f)localObject1).y());
    b.f.b.j.a(localObject2, "DescriptorFactory.create…escriptor.type)\n        }");
    paramah = localStringBuilder;
    if (paramb != null)
    {
      paramah = paramb.k();
      b.f.b.j.a(paramah, "setterMethod.valueParameters");
      paramah = (au)b.a.j.d(paramah);
      if (paramah != null)
      {
        paramah = b.i.b.a.c.i.c.a((ah)localObject3, paramb.r(), paramah.r(), false, paramb.j(), paramb.s());
        paramah.h = ((b.i.b.a.c.b.t)paramb);
      }
      else
      {
        throw ((Throwable)new AssertionError("No parameter found for ".concat(String.valueOf(paramb))));
      }
    }
    ((b.i.b.a.c.d.a.b.f)localObject1).a((aa)localObject2, (aj)paramah);
    return (b.i.b.a.c.d.a.b.f)localObject1;
  }
  
  private final boolean d(al paramal)
  {
    al localal1 = e(paramal);
    if (localal1 == null) {
      return false;
    }
    paramal = paramal.i();
    b.f.b.j.a(paramal, "name");
    paramal = (Iterable)a(paramal);
    if (!((Collection)paramal).isEmpty())
    {
      paramal = paramal.iterator();
      while (paramal.hasNext())
      {
        al localal2 = (al)paramal.next();
        int k;
        if ((localal2.C()) && (a((b.i.b.a.c.b.a)localal1, (b.i.b.a.c.b.a)localal2))) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static al e(al paramal)
  {
    Object localObject1 = paramal.k();
    b.f.b.j.a(localObject1, "valueParameters");
    Object localObject2 = (au)b.a.j.f((List)localObject1);
    if (localObject2 != null)
    {
      localObject1 = ((au)localObject2).y().f().c();
      if (localObject1 != null)
      {
        localObject1 = b.i.b.a.c.i.c.a.a((b.i.b.a.c.b.l)localObject1);
        if (localObject1 != null)
        {
          if (!((b.i.b.a.c.f.c)localObject1).a()) {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            localObject1 = ((b.i.b.a.c.f.c)localObject1).b();
            break label83;
          }
        }
      }
      localObject1 = null;
      label83:
      if (b.i.b.a.c.a.k.a((b.i.b.a.c.f.b)localObject1, false)) {
        localObject1 = localObject2;
      } else {
        localObject1 = null;
      }
      if (localObject1 == null) {
        return null;
      }
      localObject2 = paramal.D();
      paramal = paramal.k();
      b.f.b.j.a(paramal, "valueParameters");
      paramal = (al)((t.a)localObject2).a(b.a.j.i(paramal)).a(((ap)((au)localObject1).y().a().get(0)).c()).f();
      localObject1 = (ad)paramal;
      if (localObject1 != null) {
        ((b.i.b.a.c.b.c.p)localObject1).s = true;
      }
      return paramal;
    }
    return null;
  }
  
  protected final k.a a(q paramq, List<? extends ar> paramList, b.i.b.a.c.l.w paramw, List<? extends au> paramList1)
  {
    b.f.b.j.b(paramq, "method");
    b.f.b.j.b(paramList, "methodTypeParameters");
    b.f.b.j.b(paramw, "returnType");
    b.f.b.j.b(paramList1, "valueParameters");
    Object localObject = this.e.c.e.a(paramw, paramList1, paramList);
    b.f.b.j.a(localObject, "c.components.signaturePr…dTypeParameters\n        )");
    paramq = ((b.i.b.a.c.d.a.a.k.a)localObject).a;
    b.f.b.j.a(paramq, "propagated.returnType");
    paramList = ((b.i.b.a.c.d.a.a.k.a)localObject).b;
    paramw = ((b.i.b.a.c.d.a.a.k.a)localObject).c;
    b.f.b.j.a(paramw, "propagated.valueParameters");
    paramList1 = ((b.i.b.a.c.d.a.a.k.a)localObject).d;
    b.f.b.j.a(paramList1, "propagated.typeParameters");
    boolean bool = ((b.i.b.a.c.d.a.a.k.a)localObject).f;
    localObject = ((b.i.b.a.c.d.a.a.k.a)localObject).e;
    b.f.b.j.a(localObject, "propagated.errors");
    return new k.a(paramq, paramList, paramw, paramList1, bool, (List)localObject);
  }
  
  public final Collection<ah> a(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    d(paramf, parama);
    return super.a(paramf, parama);
  }
  
  protected final Set<b.i.b.a.c.f.f> a(b.i.b.a.c.i.e.d paramd)
  {
    b.f.b.j.b(paramd, "kindFilter");
    if (this.j.g()) {
      return j_();
    }
    paramd = new LinkedHashSet((Collection)((b)this.d.b_()).b());
    Object localObject = this.b.c();
    b.f.b.j.a(localObject, "ownerDescriptor.typeConstructor");
    localObject = ((an)localObject).i_();
    b.f.b.j.a(localObject, "ownerDescriptor.typeConstructor.supertypes");
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Iterable localIterable = (Iterable)((b.i.b.a.c.l.w)((Iterator)localObject).next()).b().l_();
      b.a.j.a((Collection)paramd, localIterable);
    }
    return (Set)paramd;
  }
  
  protected final void a(b.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(paramCollection, "result");
    if (this.j.g())
    {
      localObject1 = (q)b.a.j.f((Iterable)((b)this.d.b_()).a(paramf));
      if (localObject1 != null)
      {
        Object localObject2 = b.i.b.a.c.b.w.a;
        Object localObject3 = b.i.b.a.c.d.a.c.f.a(this.e, (b.i.b.a.c.d.a.e.d)localObject1);
        localObject2 = b.i.b.a.c.d.a.b.f.a((b.i.b.a.c.b.l)this.b, (b.i.b.a.c.b.a.g)localObject3, (b.i.b.a.c.b.w)localObject2, ((q)localObject1).o(), false, ((q)localObject1).p(), (am)this.e.c.i.a((b.i.b.a.c.d.a.e.l)localObject1), false);
        b.f.b.j.a(localObject2, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        localObject3 = (ah)localObject2;
        b.i.b.a.c.b.a.g.a locala = b.i.b.a.c.b.a.g.a;
        localObject3 = b.i.b.a.c.i.c.a((ah)localObject3, b.i.b.a.c.b.a.g.a.a());
        b.f.b.j.a(localObject3, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
        ((b.i.b.a.c.d.a.b.f)localObject2).a((aa)localObject3, null);
        localObject1 = a((q)localObject1, b.i.b.a.c.d.a.c.a.a(this.e, (b.i.b.a.c.b.l)localObject2, (x)localObject1, 0));
        ((b.i.b.a.c.d.a.b.f)localObject2).a((b.i.b.a.c.l.w)localObject1, (List)b.a.v.a, d(), null);
        ((aa)localObject3).a((b.i.b.a.c.l.w)localObject1);
        paramCollection.add(localObject2);
      }
    }
    paramf = b(paramf);
    if (paramf.isEmpty()) {
      return;
    }
    Object localObject1 = b.i.b.a.c.n.i.a;
    localObject1 = i.b.a();
    a(paramf, paramCollection, (b.f.a.b)new d(this));
    a(paramf, (Collection)localObject1, (b.f.a.b)new e(this));
    paramf = b.i.b.a.c.d.a.a.a.a((Collection)b.a.ai.a(paramf, (Iterable)localObject1), paramCollection, this.b, this.e.c.f);
    b.f.b.j.a(paramf, "resolveOverridesForNonSt…rorReporter\n            )");
    paramCollection.addAll(paramf);
  }
  
  protected final void a(Collection<al> paramCollection, b.i.b.a.c.f.f paramf)
  {
    b.f.b.j.b(paramCollection, "result");
    b.f.b.j.b(paramf, "name");
    Object localObject1 = a(paramf);
    Object localObject2 = b.i.b.a.c.d.a.c.a;
    if (!b.i.b.a.c.d.a.c.a(paramf))
    {
      localObject2 = b.i.b.a.c.d.a.d.a;
      if (!b.i.b.a.c.d.a.d.a(paramf))
      {
        localObject2 = (Iterable)localObject1;
        if (!((Collection)localObject2).isEmpty())
        {
          localObject3 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject3).hasNext()) {
            if (((b.i.b.a.c.b.t)((Iterator)localObject3).next()).C())
            {
              k = 0;
              break label109;
            }
          }
        }
        int k = 1;
        label109:
        if (k != 0)
        {
          paramf = (Collection)new ArrayList();
          localObject1 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = ((Iterator)localObject1).next();
            if (a((al)localObject2)) {
              paramf.add(localObject2);
            }
          }
          a(paramCollection, (Collection)paramf, false);
          return;
        }
      }
    }
    localObject2 = b.i.b.a.c.n.i.a;
    localObject2 = i.b.a();
    Object localObject3 = b.i.b.a.c.d.a.a.a.a((Collection)localObject1, (Collection)b.a.v.a, this.b, b.i.b.a.c.j.a.m.b);
    b.f.b.j.a(localObject3, "resolveOverridesForNonSt…rter.DO_NOTHING\n        )");
    g localg = (g)this;
    a(paramf, paramCollection, (Collection)localObject3, paramCollection, (b.f.a.b)new b(localg));
    a(paramf, paramCollection, (Collection)localObject3, (Collection)localObject2, (b.f.a.b)new c(localg));
    localObject1 = (Iterable)localObject1;
    paramf = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = ((Iterator)localObject1).next();
      if (a((al)localObject3)) {
        paramf.add(localObject3);
      }
    }
    a(paramCollection, (Collection)b.a.j.b((Collection)paramf, (Iterable)localObject2), true);
  }
  
  protected final boolean a(b.i.b.a.c.d.a.b.e parame)
  {
    b.f.b.j.b(parame, "receiver$0");
    if (this.j.g()) {
      return false;
    }
    return a((al)parame);
  }
  
  public final Collection<al> b(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    d(paramf, parama);
    return super.b(paramf, parama);
  }
  
  public final b.i.b.a.c.b.h c(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    d(paramf, parama);
    return (b.i.b.a.c.b.h)this.i.a(paramf);
  }
  
  protected final Set<b.i.b.a.c.f.f> c(b.i.b.a.c.i.e.d paramd, b.f.a.b<? super b.i.b.a.c.f.f, Boolean> paramb)
  {
    b.f.b.j.b(paramd, "kindFilter");
    return b.a.ai.a((Set)this.g.b_(), (Iterable)((Map)this.h.b_()).keySet());
  }
  
  protected final ak d()
  {
    return b.i.b.a.c.i.d.a((b.i.b.a.c.b.l)this.b);
  }
  
  public final void d(b.i.b.a.c.f.f paramf, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramf, "name");
    b.f.b.j.b(parama, "location");
    b.i.b.a.c.c.a.a(this.e.c.m, parama, this.b, paramf);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Lazy Java member scope for ");
    localStringBuilder.append(this.j.b());
    return localStringBuilder.toString();
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.d.a.e.p, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.i
    implements b.f.a.b<b.i.b.a.c.f.f, Collection<? extends al>>
  {
    b(g paramg)
    {
      super();
    }
    
    public final b.i.d f()
    {
      return b.f.b.v.a(g.class);
    }
    
    public final String g()
    {
      return "searchMethodsByNameWithoutBuiltinMagic";
    }
    
    public final String h()
    {
      return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }
  }
  
  static final class c
    extends b.f.b.i
    implements b.f.a.b<b.i.b.a.c.f.f, Collection<? extends al>>
  {
    c(g paramg)
    {
      super();
    }
    
    public final b.i.d f()
    {
      return b.f.b.v.a(g.class);
    }
    
    public final String g()
    {
      return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }
    
    public final String h()
    {
      return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.f.f, Collection<? extends al>>
  {
    d(g paramg)
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.f.f, Collection<? extends al>>
  {
    e(g paramg)
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.d>>
  {
    f(g paramg, b.i.b.a.c.d.a.c.h paramh)
    {
      super();
    }
  }
  
  static final class g
    extends b.f.b.k
    implements b.f.a.a<Map<b.i.b.a.c.f.f, ? extends n>>
  {
    g(g paramg)
    {
      super();
    }
  }
  
  static final class h
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.f.f, Collection<? extends al>>
  {
    h(g paramg, al paramal)
    {
      super();
    }
  }
  
  static final class i
    extends b.f.b.k
    implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
  {
    i(g paramg)
    {
      super();
    }
  }
  
  static final class j
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.f.f, b.i.b.a.c.b.c.g>
  {
    j(g paramg, b.i.b.a.c.d.a.c.h paramh)
    {
      super();
    }
    
    static final class a
      extends b.f.b.k
      implements b.f.a.a<Set<? extends b.i.b.a.c.f.f>>
    {
      a(g.j paramj)
      {
        super();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */