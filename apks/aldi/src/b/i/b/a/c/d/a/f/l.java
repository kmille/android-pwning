package b.i.b.a.c.d.a.f;

import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.b.a;
import b.i.b.a.c.b.c.y;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.d.a.a.a;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ax;
import b.i.b.a.c.l.az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l
{
  private final b.i.b.a.c.d.a.a a;
  private final b.i.b.a.c.n.e b;
  
  public l(b.i.b.a.c.d.a.a parama, b.i.b.a.c.n.e parame)
  {
    this.a = parama;
    this.b = parame;
  }
  
  private final <D extends b.i.b.a.c.b.b> D a(D paramD, b.i.b.a.c.d.a.c.h paramh)
  {
    if (!(paramD instanceof b.i.b.a.c.d.a.b.b)) {
      return paramD;
    }
    b.i.b.a.c.d.a.b.b localb = (b.i.b.a.c.d.a.b.b)paramD;
    if (localb.t() == b.a.b)
    {
      localObject1 = localb.n();
      b.f.b.j.a(localObject1, "original");
      if (((b.i.b.a.c.b.b)localObject1).m().size() == 1) {
        return paramD;
      }
    }
    b.i.b.a.c.d.a.c.h localh = b.i.b.a.c.d.a.c.a.b(paramh, paramD.r());
    if ((paramD instanceof b.i.b.a.c.d.a.b.f))
    {
      paramh = (b.i.b.a.c.d.a.b.f)paramD;
      localObject1 = paramh.k;
      if ((localObject1 != null) && (!((y)localObject1).a))
      {
        paramh = paramh.k;
        if (paramh == null) {
          b.f.b.j.a();
        }
        b.f.b.j.a(paramh, "getter!!");
        paramh = (b.i.b.a.c.b.b)paramh;
        break label133;
      }
    }
    paramh = paramD;
    label133:
    if (localb.d() != null)
    {
      if (!(paramh instanceof b.i.b.a.c.b.t)) {
        localObject1 = null;
      } else {
        localObject1 = paramh;
      }
      localObject1 = (b.i.b.a.c.b.t)localObject1;
      if (localObject1 != null) {
        localObject1 = (au)((b.i.b.a.c.b.t)localObject1).a(b.i.b.a.c.d.a.b.e.a);
      } else {
        localObject1 = null;
      }
      localObject2 = a(paramD, (au)localObject1, localh, (b.f.a.b)d.a).a(null);
    }
    else
    {
      localObject2 = null;
    }
    if (!(paramD instanceof b.i.b.a.c.d.a.b.e)) {
      localObject1 = null;
    } else {
      localObject1 = paramD;
    }
    Object localObject1 = (b.i.b.a.c.d.a.b.e)localObject1;
    if (localObject1 != null)
    {
      localObject3 = b.i.b.a.c.d.b.t.a;
      localObject3 = ((b.i.b.a.c.d.a.b.e)localObject1).a();
      if (localObject3 != null)
      {
        localObject1 = b.i.b.a.c.d.b.t.a((b.i.b.a.c.b.e)localObject3, b.i.b.a.c.d.b.r.a((b.i.b.a.c.b.t)localObject1, false, false, 3));
        if (localObject1 != null)
        {
          localObject3 = (j)i.a().get(localObject1);
          break label321;
        }
      }
      else
      {
        throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
      }
    }
    Object localObject3 = null;
    label321:
    if (localObject3 != null)
    {
      if (((j)localObject3).b.size() == localb.k().size()) {
        i = 1;
      } else {
        i = 0;
      }
      if ((b.w.a) && (i == 0))
      {
        paramh = new StringBuilder("Predefined enhancement info for ");
        paramh.append(paramD);
        paramh.append(" has ");
        paramh.append(((j)localObject3).b.size());
        paramh.append(", but ");
        paramh.append(localb.k().size());
        paramh.append(" expected");
        throw ((Throwable)new AssertionError(paramh.toString()));
      }
    }
    localObject1 = paramh.k();
    b.f.b.j.a(localObject1, "annotationOwnerForMember.valueParameters");
    localObject1 = (Iterable)localObject1;
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      au localau = (au)localIterator.next();
      localObject4 = a(paramD, localau, localh, (b.f.a.b)new f(localau));
      if (localObject3 != null)
      {
        localObject1 = ((j)localObject3).b;
        if (localObject1 != null)
        {
          localObject1 = (r)b.a.j.b((List)localObject1, localau.c());
          break label588;
        }
      }
      localObject1 = null;
      label588:
      a locala = ((b)localObject4).a((r)localObject1);
      if (locala.b)
      {
        localObject4 = locala.a;
      }
      else
      {
        b.f.b.j.a(localau, "p");
        localObject4 = localau.y();
        b.f.b.j.a(localObject4, "p.type");
      }
      b.f.b.j.a(localau, "p");
      b.f.b.j.b(localau, "receiver$0");
      localObject1 = localau.r();
      Object localObject5 = b.i.b.a.c.d.a.p.n;
      b.f.b.j.a(localObject5, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
      localObject1 = ((b.i.b.a.c.b.a.g)localObject1).a((b.i.b.a.c.f.b)localObject5);
      if (localObject1 != null)
      {
        localObject5 = b.i.b.a.c.i.c.a.b((b.i.b.a.c.b.a.c)localObject1);
        if (localObject5 != null)
        {
          localObject1 = localObject5;
          if (!(localObject5 instanceof b.i.b.a.c.i.b.s)) {
            localObject1 = null;
          }
          localObject1 = (b.i.b.a.c.i.b.s)localObject1;
          if (localObject1 != null)
          {
            localObject1 = (String)((b.i.b.a.c.i.b.s)localObject1).a();
            if (localObject1 != null)
            {
              localObject1 = (b.i.b.a.c.d.a.b.a)new b.i.b.a.c.d.a.b.h((String)localObject1);
              break label813;
            }
          }
        }
      }
      localObject1 = localau.r();
      localObject5 = b.i.b.a.c.d.a.p.o;
      b.f.b.j.a(localObject5, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
      if (((b.i.b.a.c.b.a.g)localObject1).b((b.i.b.a.c.f.b)localObject5)) {
        localObject1 = (b.i.b.a.c.d.a.b.a)b.i.b.a.c.d.a.b.g.a;
      } else {
        localObject1 = null;
      }
      label813:
      boolean bool1;
      if ((localObject1 instanceof b.i.b.a.c.d.a.b.h))
      {
        if (b.i.b.a.c.d.a.u.a((b.i.b.a.c.l.w)localObject4, ((b.i.b.a.c.d.a.b.h)localObject1).a) != null) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
      else if (b.f.b.j.a(localObject1, b.i.b.a.c.d.a.b.g.a))
      {
        bool1 = av.f((b.i.b.a.c.l.w)localObject4);
      }
      else
      {
        if (localObject1 != null) {
          break label977;
        }
        bool1 = localau.h();
      }
      if ((bool1) && (localau.m().isEmpty())) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      boolean bool2;
      if ((!locala.b) && (bool1 == localau.h())) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      localCollection.add(new c(locala.a, bool1, bool2, locala.c));
      continue;
      label977:
      throw new b.k();
    }
    localObject1 = (List)localCollection;
    Object localObject4 = (b.i.b.a.c.b.a.a)paramh;
    if (!(paramD instanceof ah)) {
      paramh = null;
    } else {
      paramh = paramD;
    }
    paramh = (ah)paramh;
    if ((paramh != null) && (b.i.b.a.c.d.a.c.a.c.a(paramh) == true)) {
      paramh = a.a.c;
    } else {
      paramh = a.a.a;
    }
    localObject4 = a(paramD, (b.i.b.a.c.b.a.a)localObject4, true, localh, paramh, (b.f.a.b)e.a);
    if (localObject3 != null) {
      paramh = ((j)localObject3).a;
    } else {
      paramh = null;
    }
    localObject3 = ((b)localObject4).a(paramh);
    if (((localObject2 == null) || (((a)localObject2).c != true)) && (!((a)localObject3).c))
    {
      paramh = (Iterable)localObject1;
      if (!((Collection)paramh).isEmpty())
      {
        paramh = paramh.iterator();
        while (paramh.hasNext()) {
          if (((c)paramh.next()).c)
          {
            i = 1;
            break label1161;
          }
        }
      }
      i = 0;
      label1161:
      if (i == 0)
      {
        i = 0;
        break label1175;
      }
    }
    int i = 1;
    label1175:
    if (((localObject2 == null) || (((a)localObject2).b != true)) && (!((a)localObject3).b))
    {
      paramh = (Iterable)localObject1;
      if (!((Collection)paramh).isEmpty())
      {
        paramh = paramh.iterator();
        while (paramh.hasNext()) {
          if (((c)paramh.next()).b)
          {
            j = 1;
            break label1255;
          }
        }
      }
      int j = 0;
      label1255:
      if ((j == 0) && (i == 0)) {
        return paramD;
      }
    }
    if (i != 0) {
      paramD = b.q.a(b.i.b.a.c.i.a.a(), new b.i.b.a.c.d.a.g((b.i.b.a.c.b.l)paramD));
    } else {
      paramD = null;
    }
    if (localObject2 != null) {
      paramh = ((a)localObject2).a;
    } else {
      paramh = null;
    }
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (c)((Iterator)localObject2).next();
      ((Collection)localObject1).add(new b.i.b.a.c.d.a.b.j(((a)localObject4).a, ((c)localObject4).d));
    }
    paramD = localb.a(paramh, (List)localObject1, ((a)localObject3).a, paramD);
    if (paramD != null) {
      return (b.i.b.a.c.b.b)paramD;
    }
    throw new b.r("null cannot be cast to non-null type D");
  }
  
  private final b a(b.i.b.a.c.b.b paramb, b.i.b.a.c.b.a.a parama, boolean paramBoolean, b.i.b.a.c.d.a.c.h paramh, a.a parama1, b.f.a.b<? super b.i.b.a.c.b.b, ? extends b.i.b.a.c.l.w> paramb1)
  {
    b.i.b.a.c.l.w localw = (b.i.b.a.c.l.w)paramb1.a(paramb);
    Collection localCollection = paramb.m();
    b.f.b.j.a(localCollection, "this.overriddenDescriptors");
    Object localObject = (Iterable)localCollection;
    localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      b.i.b.a.c.b.b localb = (b.i.b.a.c.b.b)((Iterator)localObject).next();
      b.f.b.j.a(localb, "it");
      localCollection.add((b.i.b.a.c.l.w)paramb1.a(localb));
    }
    return new b(parama, localw, (Collection)localCollection, paramBoolean, b.i.b.a.c.d.a.c.a.b(paramh, ((b.i.b.a.c.l.w)paramb1.a(paramb)).r()), parama1);
  }
  
  private final b a(b.i.b.a.c.b.b paramb, au paramau, b.i.b.a.c.d.a.c.h paramh, b.f.a.b<? super b.i.b.a.c.b.b, ? extends b.i.b.a.c.l.w> paramb1)
  {
    b.i.b.a.c.b.a.a locala = (b.i.b.a.c.b.a.a)paramau;
    if (paramau != null)
    {
      paramau = b.i.b.a.c.d.a.c.a.b(paramh, paramau.r());
      if (paramau != null) {
        break label33;
      }
    }
    paramau = paramh;
    label33:
    return a(paramb, locala, false, paramau, a.a.b, paramb1);
  }
  
  private static h b(b.i.b.a.c.b.a.c paramc)
  {
    b.i.b.a.c.i.b.f localf = b.i.b.a.c.i.c.a.b(paramc);
    paramc = localf;
    if (!(localf instanceof b.i.b.a.c.i.b.i)) {
      paramc = null;
    }
    paramc = (b.i.b.a.c.i.b.i)paramc;
    if (paramc == null) {
      return new h(g.b);
    }
    paramc = paramc.a.a;
    int i = paramc.hashCode();
    if (i != 73135176)
    {
      if (i != 74175084)
      {
        if (i != 433141802)
        {
          if (i != 1933739535) {
            return null;
          }
          if (!paramc.equals("ALWAYS")) {
            break label155;
          }
          return new h(g.b);
        }
        if (!paramc.equals("UNKNOWN")) {
          break label155;
        }
        return new h(g.c);
      }
      if (!paramc.equals("NEVER")) {
        break label155;
      }
    }
    else
    {
      if (!paramc.equals("MAYBE")) {
        break label155;
      }
    }
    return new h(g.a);
    label155:
    return null;
  }
  
  private final h c(b.i.b.a.c.b.a.c paramc)
  {
    b.i.b.a.c.f.b localb = paramc.b();
    if (localb == null) {
      return null;
    }
    if (b.i.b.a.c.d.a.q.a().contains(localb)) {
      return new h(g.a);
    }
    if (b.i.b.a.c.d.a.q.d().contains(localb)) {
      return new h(g.b);
    }
    if (b.f.b.j.a(localb, b.i.b.a.c.d.a.q.b())) {
      return b(paramc);
    }
    if ((b.f.b.j.a(localb, b.i.b.a.c.d.a.q.e())) && (this.b.e)) {
      return new h(g.a);
    }
    if ((b.f.b.j.a(localb, b.i.b.a.c.d.a.q.f())) && (this.b.e)) {
      return new h(g.b);
    }
    if (b.f.b.j.a(localb, b.i.b.a.c.d.a.q.h())) {
      return new h(g.b, true);
    }
    if (b.f.b.j.a(localb, b.i.b.a.c.d.a.q.g())) {
      return new h(g.a, true);
    }
    return null;
  }
  
  public final h a(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "annotationDescriptor");
    Object localObject = c(paramc);
    if (localObject != null) {
      return (h)localObject;
    }
    localObject = this.a.a(paramc);
    if (localObject == null) {
      return null;
    }
    paramc = this.a.c(paramc);
    if (paramc.b()) {
      return null;
    }
    localObject = c((b.i.b.a.c.b.a.c)localObject);
    if (localObject != null) {
      return h.a((h)localObject, paramc.a());
    }
    return null;
  }
  
  public final <D extends b.i.b.a.c.b.b> Collection<D> a(b.i.b.a.c.d.a.c.h paramh, Collection<? extends D> paramCollection)
  {
    b.f.b.j.b(paramh, "c");
    b.f.b.j.b(paramCollection, "platformSignatures");
    Object localObject = (Iterable)paramCollection;
    paramCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramCollection.add(a((b.i.b.a.c.b.b)((Iterator)localObject).next(), paramh));
    }
    return (Collection)paramCollection;
  }
  
  static class a
  {
    final b.i.b.a.c.l.w a;
    final boolean b;
    final boolean c;
    
    public a(b.i.b.a.c.l.w paramw, boolean paramBoolean1, boolean paramBoolean2)
    {
      this.a = paramw;
      this.b = paramBoolean1;
      this.c = paramBoolean2;
    }
  }
  
  final class b
  {
    private final b.i.b.a.c.b.a.a b;
    private final b.i.b.a.c.l.w c;
    private final Collection<b.i.b.a.c.l.w> d;
    private final boolean e;
    private final b.i.b.a.c.d.a.c.h f;
    private final a.a g;
    
    public b(b.i.b.a.c.l.w paramw, Collection<? extends b.i.b.a.c.l.w> paramCollection, boolean paramBoolean, b.i.b.a.c.d.a.c.h paramh, a.a parama)
    {
      this.b = paramw;
      this.c = paramCollection;
      this.d = paramBoolean;
      this.e = paramh;
      this.f = parama;
      this.g = ((a.a)localObject);
    }
    
    private final b.f.a.b<Integer, d> a()
    {
      Object localObject2 = (Iterable)this.d;
      Object localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Collection)localObject1).add(b((b.i.b.a.c.l.w)((Iterator)localObject2).next()));
      }
      localObject2 = (List)localObject1;
      List localList = b(this.c);
      if (this.e)
      {
        localObject1 = (Iterable)this.d;
        if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
        {
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (b.i.b.a.c.l.w)((Iterator)localObject1).next();
            if ((b.i.b.a.c.l.a.c.a.b((b.i.b.a.c.l.w)localObject3, this.c) ^ true))
            {
              i = 1;
              break label181;
            }
          }
        }
        i = 0;
        label181:
        if (i != 0)
        {
          i = 1;
          break label192;
        }
      }
      int i = 0;
      label192:
      if (i != 0) {
        j = 1;
      } else {
        j = localList.size();
      }
      Object localObject3 = new d[j];
      int m = localObject3.length;
      int j = 0;
      while (j < m)
      {
        boolean bool;
        if (j == 0) {
          bool = true;
        } else {
          bool = false;
        }
        int k;
        if ((!bool) && (i != 0)) {
          k = 0;
        } else {
          k = 1;
        }
        if ((b.w.a) && (k == 0)) {
          throw ((Throwable)new AssertionError("Only head type constructors should be computed"));
        }
        localObject1 = (p)localList.get(j);
        b.i.b.a.c.l.w localw = ((p)localObject1).a;
        d locald = ((p)localObject1).b;
        localObject1 = (Iterable)localObject2;
        Collection localCollection = (Collection)new ArrayList();
        Iterator localIterator = ((Iterable)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (p)b.a.j.b((List)localIterator.next(), j);
          if (localObject1 != null) {
            localObject1 = ((p)localObject1).a;
          } else {
            localObject1 = null;
          }
          if (localObject1 != null) {
            localCollection.add(localObject1);
          }
        }
        localObject3[j] = a(localw, (Collection)(List)localCollection, locald, bool);
        j += 1;
      }
      return (b.f.a.b)new a((d[])localObject3);
    }
    
    private static d a(b.i.b.a.c.l.w paramw)
    {
      if (b.i.b.a.c.l.t.a(paramw))
      {
        localObject1 = b.i.b.a.c.l.t.b(paramw);
        localObject1 = new b.m(((b.i.b.a.c.l.q)localObject1).a, ((b.i.b.a.c.l.q)localObject1).b);
      }
      else
      {
        localObject1 = new b.m(paramw, paramw);
      }
      Object localObject2 = (b.i.b.a.c.l.w)((b.m)localObject1).a;
      b.i.b.a.c.l.w localw = (b.i.b.a.c.l.w)((b.m)localObject1).b;
      Object localObject1 = b.i.b.a.c.a.b.c.b;
      boolean bool = ((b.i.b.a.c.l.w)localObject2).c();
      e locale = null;
      if (bool) {
        localObject1 = g.a;
      } else if (!localw.c()) {
        localObject1 = g.b;
      } else {
        localObject1 = null;
      }
      b.f.b.j.b(localObject2, "type");
      localObject2 = av.g((b.i.b.a.c.l.w)localObject2);
      int j = 1;
      int i;
      if ((localObject2 != null) && (b.i.b.a.c.a.b.c.b((b.i.b.a.c.b.e)localObject2))) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        locale = e.a;
      }
      else
      {
        b.f.b.j.b(localw, "type");
        localObject2 = av.g(localw);
        if ((localObject2 != null) && (b.i.b.a.c.a.b.c.a((b.i.b.a.c.b.e)localObject2))) {
          i = j;
        } else {
          i = 0;
        }
        if (i != 0) {
          locale = e.b;
        }
      }
      return new d((g)localObject1, locale, paramw.i() instanceof f);
    }
    
    private final d a(b.i.b.a.c.l.w paramw, Collection<? extends b.i.b.a.c.l.w> paramCollection, d paramd, boolean paramBoolean)
    {
      paramCollection = (Iterable)paramCollection;
      Object localObject1 = (Collection)new ArrayList(b.a.j.a(paramCollection));
      Object localObject2 = paramCollection.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Collection)localObject1).add(a((b.i.b.a.c.l.w)((Iterator)localObject2).next()));
      }
      Iterable localIterable = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList();
      localObject2 = localIterable.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((d)((Iterator)localObject2).next()).b;
        if (localObject3 != null) {
          ((Collection)localObject1).add(localObject3);
        }
      }
      Set localSet1 = b.a.j.k((Iterable)localObject1);
      localObject1 = (Collection)new ArrayList();
      localObject2 = localIterable.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((d)((Iterator)localObject2).next()).a;
        if (localObject3 != null) {
          ((Collection)localObject1).add(localObject3);
        }
      }
      Set localSet2 = b.a.j.k((Iterable)localObject1);
      localObject2 = (Collection)new ArrayList();
      Object localObject3 = paramCollection.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        paramCollection = (b.i.b.a.c.l.w)((Iterator)localObject3).next();
        b.f.b.j.b(paramCollection, "receiver$0");
        localObject1 = ax.a(paramCollection);
        if (localObject1 != null) {
          paramCollection = (Collection<? extends b.i.b.a.c.l.w>)localObject1;
        }
        paramCollection = a(paramCollection).a;
        if (paramCollection != null) {
          ((Collection)localObject2).add(paramCollection);
        }
      }
      Set localSet3 = b.a.j.k((Iterable)localObject2);
      paramd = a(paramw, paramBoolean, paramd);
      boolean bool1 = paramd.d;
      boolean bool2 = true;
      localObject1 = null;
      if ((bool1 ^ true)) {
        paramw = paramd;
      } else {
        paramw = null;
      }
      if (paramw != null) {
        paramw = paramw.a;
      } else {
        paramw = null;
      }
      g localg = paramd.a;
      if ((this.e) && (paramBoolean)) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      localObject2 = n.a(localSet2, paramw, bool1);
      paramCollection = (Collection<? extends b.i.b.a.c.l.w>)localObject1;
      int i;
      if (localObject2 != null)
      {
        localObject3 = this.b;
        paramCollection = (Collection<? extends b.i.b.a.c.l.w>)localObject3;
        if (!(localObject3 instanceof au)) {
          paramCollection = null;
        }
        paramCollection = (au)paramCollection;
        if (paramCollection != null) {
          paramCollection = paramCollection.m_();
        } else {
          paramCollection = null;
        }
        if (paramCollection != null) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (paramBoolean) && (localObject2 == g.a)) {
          i = 1;
        } else {
          i = 0;
        }
        paramCollection = (Collection<? extends b.i.b.a.c.l.w>)localObject1;
        if (i == 0) {
          paramCollection = (Collection<? extends b.i.b.a.c.l.w>)localObject2;
        }
      }
      localObject1 = (e)n.a(localSet1, e.b, e.a, paramd.b, bool1);
      if ((localg == paramw) && (!(b.f.b.j.a(localSet3, localSet2) ^ true))) {
        i = 0;
      } else {
        i = 1;
      }
      if (!paramd.c)
      {
        if (!((Collection)localIterable).isEmpty())
        {
          paramw = localIterable.iterator();
          while (paramw.hasNext()) {
            if (((d)paramw.next()).c)
            {
              j = 1;
              break label626;
            }
          }
        }
        int j = 0;
        label626:
        if (j == 0)
        {
          paramBoolean = false;
          break label643;
        }
      }
      paramBoolean = true;
      label643:
      if ((paramCollection == null) && (i != 0)) {
        return n.a(n.a(localSet3, localg, bool1), (e)localObject1, true, paramBoolean);
      }
      if (paramCollection == null) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      return n.a(paramCollection, (e)localObject1, bool1, paramBoolean);
    }
    
    private final d a(b.i.b.a.c.l.w paramw, boolean paramBoolean, d paramd)
    {
      if ((paramBoolean) && (this.b != null)) {
        localObject1 = b.i.b.a.c.b.a.i.a(this.b.r(), paramw.r());
      } else {
        localObject1 = paramw.r();
      }
      Object localObject2 = new d((b.i.b.a.c.b.a.g)localObject1);
      Object localObject3 = e.a;
      g localg = null;
      if (paramBoolean)
      {
        paramd = this.f.a();
        if (paramd != null) {
          paramd = paramd.a(this.g);
        } else {
          paramd = null;
        }
      }
      Object localObject1 = (Iterable)localObject1;
      l locall = l.this;
      Iterator localIterator = ((Iterable)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = locall.a((b.i.b.a.c.b.a.c)localIterator.next());
        if (localObject1 != null) {
          break label147;
        }
      }
      localObject1 = null;
      label147:
      if (localObject1 == null)
      {
        if ((paramd != null) && (paramd.a != null)) {
          paramd = new h(paramd.a, paramd.d);
        } else {
          paramd = null;
        }
      }
      else {
        paramd = (d)localObject1;
      }
      if (paramd != null) {
        localObject1 = paramd.a;
      } else {
        localObject1 = null;
      }
      localObject2 = (e)((e)localObject3).a(((d)localObject2).a(b.i.b.a.c.d.a.q.i(), e.a), ((d)localObject2).a(b.i.b.a.c.d.a.q.j(), e.b));
      if (paramd != null) {
        localg = paramd.a;
      }
      localObject3 = g.b;
      boolean bool2 = false;
      if ((localg == localObject3) && (b.i.b.a.c.l.c.a.e(paramw))) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      boolean bool1 = bool2;
      if (paramd != null)
      {
        bool1 = bool2;
        if (paramd.b == true) {
          bool1 = true;
        }
      }
      return new d((g)localObject1, (e)localObject2, paramBoolean, bool1);
    }
    
    private final List<p> b(b.i.b.a.c.l.w paramw)
    {
      ArrayList localArrayList = new ArrayList(1);
      new f(localArrayList).a(paramw, this.f);
      return (List)localArrayList;
    }
    
    public final l.a a(r paramr)
    {
      final b.f.a.b localb = a();
      if (paramr != null) {
        paramr = (b.f.a.b)new b(paramr, localb);
      } else {
        paramr = null;
      }
      boolean bool = av.a(this.c, (b.f.a.b)c.a);
      b.i.b.a.c.l.w localw = this.c;
      Object localObject = paramr;
      if (paramr == null) {
        localObject = localb;
      }
      paramr = s.a(localw, (b.f.a.b)localObject);
      if (paramr != null) {
        return new l.a(paramr, true, bool);
      }
      return new l.a(this.c, false, bool);
    }
    
    static final class a
      extends b.f.b.k
      implements b.f.a.b<Integer, d>
    {
      a(d[] paramArrayOfd)
      {
        super();
      }
    }
    
    static final class b
      extends b.f.b.k
      implements b.f.a.b<Integer, d>
    {
      b(r paramr, b.f.a.b paramb)
      {
        super();
      }
    }
    
    static final class c
      extends b.f.b.k
      implements b.f.a.b<az, Boolean>
    {
      public static final c a = new c();
      
      c()
      {
        super();
      }
    }
    
    static final class d
      extends b.f.b.k
      implements b.f.a.m<List<? extends b.i.b.a.c.f.b>, T, T>
    {
      d(b.i.b.a.c.b.a.g paramg)
      {
        super();
      }
      
      public final <T> T a(List<b.i.b.a.c.f.b> paramList, T paramT)
      {
        b.f.b.j.b(paramList, "receiver$0");
        b.f.b.j.b(paramT, "qualifier");
        paramList = (Iterable)paramList;
        boolean bool = paramList instanceof Collection;
        int j = 1;
        if ((!bool) || (!((Collection)paramList).isEmpty()))
        {
          paramList = paramList.iterator();
          while (paramList.hasNext())
          {
            b.i.b.a.c.f.b localb = (b.i.b.a.c.f.b)paramList.next();
            if (this.a.a(localb) != null) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              i = j;
              break label103;
            }
          }
        }
        int i = 0;
        label103:
        if (i != 0) {
          return paramT;
        }
        return null;
      }
    }
    
    static final class e
      extends b.f.b.k
      implements b.f.a.m<T, T, T>
    {
      public static final e a = new e();
      
      e()
      {
        super();
      }
      
      public final <T> T a(T paramT1, T paramT2)
      {
        if ((paramT1 != null) && (paramT2 != null) && (!b.f.b.j.a(paramT1, paramT2))) {
          return null;
        }
        if (paramT1 == null) {
          return paramT2;
        }
        return paramT1;
      }
    }
    
    static final class f
      extends b.f.b.k
      implements b.f.a.m<b.i.b.a.c.l.w, b.i.b.a.c.d.a.c.h, b.u>
    {
      f(ArrayList paramArrayList)
      {
        super();
      }
      
      public final void a(b.i.b.a.c.l.w paramw, b.i.b.a.c.d.a.c.h paramh)
      {
        b.f.b.j.b(paramw, "type");
        b.f.b.j.b(paramh, "ownerContext");
        b.i.b.a.c.d.a.c.h localh = b.i.b.a.c.d.a.c.a.b(paramh, paramw.r());
        Object localObject = this.a;
        paramh = localh.a();
        if (paramh != null) {
          paramh = paramh.a(a.a.d);
        } else {
          paramh = null;
        }
        ((ArrayList)localObject).add(new p(paramw, paramh));
        paramw = paramw.a().iterator();
        while (paramw.hasNext())
        {
          paramh = (ap)paramw.next();
          if (paramh.a())
          {
            localObject = this.a;
            paramh = paramh.c();
            b.f.b.j.a(paramh, "arg.type");
            ((ArrayList)localObject).add(new p(paramh, null));
          }
          else
          {
            localObject = (f)this;
            paramh = paramh.c();
            b.f.b.j.a(paramh, "arg.type");
            ((f)localObject).a(paramh, localh);
          }
        }
      }
    }
  }
  
  static final class c
    extends l.a
  {
    final boolean d;
    
    public c(b.i.b.a.c.l.w paramw, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      super(paramBoolean2, paramBoolean3);
      this.d = paramBoolean1;
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.b.b, b.i.b.a.c.l.w>
  {
    public static final d a = new d();
    
    d()
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.b.b, b.i.b.a.c.l.w>
  {
    public static final e a = new e();
    
    e()
    {
      super();
    }
  }
  
  static final class f
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.b.b, b.i.b.a.c.l.w>
  {
    f(au paramau)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */