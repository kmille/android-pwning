package b.i.b.a.c.j.a;

import b.a.ac;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.aj;
import b.i.b.a.c.b.ak;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.c.aa;
import b.i.b.a.c.b.c.ai;
import b.i.b.a.c.b.c.o;
import b.i.b.a.c.b.c.p;
import b.i.b.a.c.b.c.z;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.a.ab;
import b.i.b.a.c.e.a.ai;
import b.i.b.a.c.e.a.ao;
import b.i.b.a.c.e.a.e;
import b.i.b.a.c.e.a.o;
import b.i.b.a.c.e.a.q;
import b.i.b.a.c.e.a.r;
import b.i.b.a.c.e.a.u;
import b.i.b.a.c.e.a.b.c;
import b.i.b.a.c.j.a.a.f.a;
import b.i.b.a.c.j.a.a.m;
import b.i.b.a.c.l.ad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class q
{
  private final c a;
  private final k b;
  
  public q(k paramk)
  {
    this.b = paramk;
    this.a = new c(this.b.c.c, this.b.c.l);
  }
  
  private static int a(int paramInt)
  {
    return (paramInt & 0x3F) + (paramInt >> 8 << 6);
  }
  
  private final b.i.b.a.c.b.a.g a(final a.u paramu, final boolean paramBoolean)
  {
    if (!b.i.b.a.c.e.a.b.b.a(paramu.b).booleanValue())
    {
      paramu = b.i.b.a.c.b.a.g.a;
      return g.a.a();
    }
    return (b.i.b.a.c.b.a.g)new m(this.b.c.b, (b.f.a.a)new b(this, paramBoolean, paramu));
  }
  
  private final b.i.b.a.c.b.a.g a(final b.i.b.a.c.g.q paramq, int paramInt, final a parama)
  {
    if (!b.i.b.a.c.e.a.b.b.a(paramInt).booleanValue())
    {
      paramq = b.i.b.a.c.b.a.g.a;
      return g.a.a();
    }
    return (b.i.b.a.c.b.a.g)new m(this.b.c.b, (b.f.a.a)new a(this, paramq, parama));
  }
  
  private final b.i.b.a.c.b.a.g a(final b.i.b.a.c.g.q paramq, final a parama)
  {
    return (b.i.b.a.c.b.a.g)new b.i.b.a.c.j.a.a.a(this.b.c.b, (b.f.a.a)new c(this, paramq, parama));
  }
  
  private final ak a()
  {
    l locall = this.b.e;
    Object localObject = locall;
    if (!(locall instanceof e)) {
      localObject = null;
    }
    localObject = (e)localObject;
    if (localObject != null) {
      return ((e)localObject).w();
    }
    return null;
  }
  
  private final s a(l paraml)
  {
    if ((paraml instanceof b.i.b.a.c.b.ab)) {
      return (s)new s.b(((b.i.b.a.c.b.ab)paraml).c(), this.b.d, this.b.f, (am)this.b.h);
    }
    if ((paraml instanceof b.i.b.a.c.j.a.a.d)) {
      return (s)((b.i.b.a.c.j.a.a.d)paraml).c;
    }
    return null;
  }
  
  private final List<au> a(List<a.ai> paramList, final b.i.b.a.c.g.q paramq, final a parama)
  {
    Object localObject1 = this.b.e;
    if (localObject1 != null)
    {
      final b.i.b.a.c.b.a locala = (b.i.b.a.c.b.a)localObject1;
      localObject1 = locala.a();
      b.f.b.j.a(localObject1, "callableDescriptor.containingDeclaration");
      final s locals = a((l)localObject1);
      localObject1 = (Iterable)paramList;
      paramList = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
      Iterator localIterator = ((Iterable)localObject1).iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        localObject1 = localIterator.next();
        if (i < 0) {
          b.a.j.a();
        }
        final Object localObject2 = (a.ai)localObject1;
        int j;
        if (((a.ai)localObject2).c()) {
          j = ((a.ai)localObject2).b;
        } else {
          j = 0;
        }
        if (locals != null)
        {
          localObject1 = b.i.b.a.c.e.a.b.b.a(j);
          b.f.b.j.a(localObject1, "Flags.HAS_ANNOTATIONS.get(flags)");
          if (((Boolean)localObject1).booleanValue())
          {
            localObject1 = (b.i.b.a.c.b.a.g)new m(this.b.c.b, (b.f.a.a)new e(i, (a.ai)localObject2, this, locals, paramq, parama, locala));
            break label220;
          }
        }
        localObject1 = b.i.b.a.c.b.a.g.a;
        localObject1 = g.a.a();
        label220:
        b.i.b.a.c.f.f localf = r.b(this.b.d, ((a.ai)localObject2).c);
        b.i.b.a.c.l.w localw = this.b.a.a(b.i.b.a.c.e.a.g.a((a.ai)localObject2, this.b.f));
        Object localObject3 = b.i.b.a.c.e.a.b.C.a(j);
        b.f.b.j.a(localObject3, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
        boolean bool1 = ((Boolean)localObject3).booleanValue();
        localObject3 = b.i.b.a.c.e.a.b.D.a(j);
        b.f.b.j.a(localObject3, "Flags.IS_CROSSINLINE.get(flags)");
        boolean bool2 = ((Boolean)localObject3).booleanValue();
        localObject3 = b.i.b.a.c.e.a.b.E.a(j);
        b.f.b.j.a(localObject3, "Flags.IS_NOINLINE.get(flags)");
        boolean bool3 = ((Boolean)localObject3).booleanValue();
        localObject2 = b.i.b.a.c.e.a.g.b((a.ai)localObject2, this.b.f);
        if (localObject2 != null) {}
        for (localObject2 = this.b.a.a((a.aa)localObject2);; localObject2 = null) {
          break;
        }
        localObject3 = am.b;
        b.f.b.j.a(localObject3, "SourceElement.NO_SOURCE");
        paramList.add(new ai(locala, null, i, (b.i.b.a.c.b.a.g)localObject1, localf, localw, bool1, bool2, bool3, (b.i.b.a.c.l.w)localObject2, (am)localObject3));
        i += 1;
      }
      return b.a.j.i((Iterable)paramList);
    }
    throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
  }
  
  private static void a(b.i.b.a.c.j.a.a.j paramj, ak paramak1, ak paramak2, List<? extends ar> paramList, List<? extends au> paramList1, b.i.b.a.c.l.w paramw, b.i.b.a.c.b.w paramw1, az paramaz, Map<? extends b.i.b.a.c.b.a.a<?>, ?> paramMap)
  {
    paramj.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, paramMap, f.a.a);
  }
  
  public final ah a(final a.u paramu)
  {
    b.f.b.j.b(paramu, "proto");
    if (paramu.c()) {}
    for (int i = paramu.b;; i = a(paramu.c)) {
      break;
    }
    Object localObject1 = this.b.e;
    Object localObject3 = (b.i.b.a.c.g.q)paramu;
    Object localObject2 = a((b.i.b.a.c.g.q)localObject3, i, a.b);
    Object localObject4 = t.a;
    localObject4 = t.a((a.r)b.i.b.a.c.e.a.b.d.b(i));
    final Object localObject5 = t.a;
    localObject5 = t.a((a.ao)b.i.b.a.c.e.a.b.c.b(i));
    Object localObject6 = b.i.b.a.c.e.a.b.t.a(i);
    b.f.b.j.a(localObject6, "Flags.IS_VAR.get(flags)");
    boolean bool1 = ((Boolean)localObject6).booleanValue();
    localObject6 = r.b(this.b.d, paramu.d);
    Object localObject7 = t.a;
    localObject7 = t.a((a.q)b.i.b.a.c.e.a.b.l.b(i));
    Object localObject8 = b.i.b.a.c.e.a.b.x.a(i);
    b.f.b.j.a(localObject8, "Flags.IS_LATEINIT.get(flags)");
    boolean bool2 = ((Boolean)localObject8).booleanValue();
    localObject8 = b.i.b.a.c.e.a.b.w.a(i);
    b.f.b.j.a(localObject8, "Flags.IS_CONST.get(flags)");
    boolean bool3 = ((Boolean)localObject8).booleanValue();
    localObject8 = b.i.b.a.c.e.a.b.z.a(i);
    b.f.b.j.a(localObject8, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
    boolean bool4 = ((Boolean)localObject8).booleanValue();
    localObject8 = b.i.b.a.c.e.a.b.A.a(i);
    b.f.b.j.a(localObject8, "Flags.IS_DELEGATED.get(flags)");
    boolean bool5 = ((Boolean)localObject8).booleanValue();
    localObject8 = b.i.b.a.c.e.a.b.B.a(i);
    b.f.b.j.a(localObject8, "Flags.IS_EXPECT_PROPERTY.get(flags)");
    localObject5 = new b.i.b.a.c.j.a.a.i((l)localObject1, null, (b.i.b.a.c.b.a.g)localObject2, (b.i.b.a.c.b.w)localObject4, (az)localObject5, bool1, (b.i.b.a.c.f.f)localObject6, (b.i.b.a.c.b.b.a)localObject7, bool2, bool3, bool4, bool5, ((Boolean)localObject8).booleanValue(), paramu, this.b.d, this.b.f, this.b.g, this.b.h);
    localObject1 = this.b;
    localObject2 = (l)localObject5;
    localObject4 = paramu.g;
    b.f.b.j.a(localObject4, "proto.typeParameterList");
    localObject6 = k.a((k)localObject1, (l)localObject2, (List)localObject4);
    localObject1 = b.i.b.a.c.e.a.b.u.a(i);
    b.f.b.j.a(localObject1, "Flags.HAS_GETTER.get(flags)");
    bool1 = ((Boolean)localObject1).booleanValue();
    if ((bool1) && (b.i.b.a.c.e.a.g.a(paramu)))
    {
      localObject1 = a((b.i.b.a.c.g.q)localObject3, a.c);
    }
    else
    {
      localObject1 = b.i.b.a.c.b.a.g.a;
      localObject1 = g.a.a();
    }
    localObject2 = ((k)localObject6).a.a(b.i.b.a.c.e.a.g.a(paramu, this.b.f));
    localObject7 = ((k)localObject6).a.a();
    localObject8 = a();
    Object localObject9 = b.i.b.a.c.e.a.g.b(paramu, this.b.f);
    localObject4 = null;
    if (localObject9 != null)
    {
      localObject9 = ((k)localObject6).a.a((a.aa)localObject9);
      if (localObject9 != null)
      {
        localObject1 = b.i.b.a.c.i.c.a((b.i.b.a.c.b.a)localObject5, (b.i.b.a.c.l.w)localObject9, (b.i.b.a.c.b.a.g)localObject1);
        break label532;
      }
    }
    localObject1 = null;
    label532:
    ((b.i.b.a.c.j.a.a.i)localObject5).a((b.i.b.a.c.l.w)localObject2, (List)localObject7, (ak)localObject8, (ak)localObject1);
    localObject1 = b.i.b.a.c.e.a.b.b.a(i);
    b.f.b.j.a(localObject1, "Flags.HAS_ANNOTATIONS.get(flags)");
    int j = b.i.b.a.c.e.a.b.a(((Boolean)localObject1).booleanValue(), (a.ao)b.i.b.a.c.e.a.b.c.b(i), (a.r)b.i.b.a.c.e.a.b.d.b(i));
    if (bool1)
    {
      int k;
      if (paramu.p()) {
        k = paramu.k;
      } else {
        k = j;
      }
      localObject1 = b.i.b.a.c.e.a.b.F.a(k);
      b.f.b.j.a(localObject1, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
      bool1 = ((Boolean)localObject1).booleanValue();
      localObject1 = b.i.b.a.c.e.a.b.G.a(k);
      b.f.b.j.a(localObject1, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
      bool2 = ((Boolean)localObject1).booleanValue();
      localObject1 = b.i.b.a.c.e.a.b.H.a(k);
      b.f.b.j.a(localObject1, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
      bool3 = ((Boolean)localObject1).booleanValue();
      localObject1 = a((b.i.b.a.c.g.q)localObject3, k, a.c);
      if (bool1)
      {
        localObject2 = (ah)localObject5;
        localObject7 = t.a;
        localObject7 = t.a((a.r)b.i.b.a.c.e.a.b.d.b(k));
        localObject8 = t.a;
        localObject1 = new aa((ah)localObject2, (b.i.b.a.c.b.a.g)localObject1, (b.i.b.a.c.b.w)localObject7, t.a((a.ao)b.i.b.a.c.e.a.b.c.b(k)), bool1 ^ true, bool2, bool3, ((z)localObject5).e, null, am.b);
      }
      else
      {
        localObject1 = b.i.b.a.c.i.c.a((ah)localObject5, (b.i.b.a.c.b.a.g)localObject1);
        b.f.b.j.a(localObject1, "DescriptorFactory.create…er(property, annotations)");
      }
      ((aa)localObject1).a(((b.i.b.a.c.j.a.a.i)localObject5).g());
      localObject2 = localObject1;
    }
    else
    {
      localObject2 = null;
    }
    localObject7 = b.i.b.a.c.e.a.b.v.a(i);
    b.f.b.j.a(localObject7, "Flags.HAS_SETTER.get(flags)");
    localObject1 = localObject4;
    if (((Boolean)localObject7).booleanValue())
    {
      if (paramu.q()) {
        j = paramu.l;
      }
      localObject1 = b.i.b.a.c.e.a.b.F.a(j);
      b.f.b.j.a(localObject1, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
      bool1 = ((Boolean)localObject1).booleanValue();
      localObject1 = b.i.b.a.c.e.a.b.G.a(j);
      b.f.b.j.a(localObject1, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
      bool2 = ((Boolean)localObject1).booleanValue();
      localObject1 = b.i.b.a.c.e.a.b.H.a(j);
      b.f.b.j.a(localObject1, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
      bool3 = ((Boolean)localObject1).booleanValue();
      localObject7 = a((b.i.b.a.c.g.q)localObject3, j, a.d);
      if (bool1)
      {
        localObject4 = new b/i/b/a/c/b/c/ab;
        localObject8 = (ah)localObject5;
        localObject1 = t.a;
        localObject9 = t.a((a.r)b.i.b.a.c.e.a.b.d.b(j));
        localObject1 = t.a;
        az localaz = t.a((a.ao)b.i.b.a.c.e.a.b.c.b(j));
        b.i.b.a.c.b.b.a locala = ((z)localObject5).e;
        am localam = am.b;
        localObject1 = localObject4;
        ((b.i.b.a.c.b.c.ab)localObject1).<init>((ah)localObject8, (b.i.b.a.c.b.a.g)localObject7, (b.i.b.a.c.b.w)localObject9, localaz, bool1 ^ true, bool2, bool3, locala, null, localam);
        ((b.i.b.a.c.b.c.ab)localObject4).a((au)b.a.j.g(k.a((k)localObject6, (l)localObject4, (List)b.a.v.a).b.a(b.a.j.a(paramu.j), (b.i.b.a.c.g.q)localObject3, a.d)));
      }
      else
      {
        localObject1 = (ah)localObject5;
        localObject3 = b.i.b.a.c.b.a.g.a;
        localObject1 = b.i.b.a.c.i.c.a((ah)localObject1, (b.i.b.a.c.b.a.g)localObject7, g.a.a());
        b.f.b.j.a(localObject1, "DescriptorFactory.create…ptor */\n                )");
      }
    }
    localObject3 = b.i.b.a.c.e.a.b.y.a(i);
    b.f.b.j.a(localObject3, "Flags.HAS_CONSTANT.get(flags)");
    if (((Boolean)localObject3).booleanValue()) {
      ((b.i.b.a.c.j.a.a.i)localObject5).a(this.b.c.b.b((b.f.a.a)new d(this, paramu, (b.i.b.a.c.j.a.a.i)localObject5)));
    }
    localObject1 = (aj)localObject1;
    localObject3 = a(paramu, false);
    localObject4 = (ah)localObject5;
    ((b.i.b.a.c.j.a.a.i)localObject5).a((aa)localObject2, (aj)localObject1, (b.i.b.a.c.b.r)new o((b.i.b.a.c.b.a.g)localObject3, (ah)localObject4), (b.i.b.a.c.b.r)new o(a(paramu, true), (ah)localObject4), f.a.a);
    return (ah)localObject4;
  }
  
  public final al a(a.o paramo)
  {
    b.f.b.j.b(paramo, "proto");
    if (paramo.c()) {}
    for (int i = paramo.b;; i = a(paramo.c)) {
      break;
    }
    Object localObject3 = (b.i.b.a.c.g.q)paramo;
    Object localObject4 = a((b.i.b.a.c.g.q)localObject3, i, a.a);
    if (b.i.b.a.c.e.a.g.a(paramo)) {}
    for (Object localObject1 = a((b.i.b.a.c.g.q)localObject3, a.a);; localObject1 = g.a.a())
    {
      break;
      localObject1 = b.i.b.a.c.b.a.g.a;
    }
    if (b.f.b.j.a(b.i.b.a.c.i.c.a.b(this.b.e).a(r.b(this.b.d, paramo.d)), v.a)) {
      localObject2 = b.i.b.a.c.e.a.i.b;
    }
    for (Object localObject2 = b.i.b.a.c.e.a.i.a();; localObject2 = this.b.g) {
      break;
    }
    Object localObject5 = this.b.e;
    Object localObject6 = r.b(this.b.d, paramo.d);
    Object localObject7 = t.a;
    localObject2 = new b.i.b.a.c.j.a.a.j((l)localObject5, (b.i.b.a.c.b.a.g)localObject4, (b.i.b.a.c.f.f)localObject6, t.a((a.q)b.i.b.a.c.e.a.b.l.b(i)), paramo, this.b.d, this.b.f, (b.i.b.a.c.e.a.i)localObject2, this.b.h);
    localObject4 = this.b;
    localObject5 = (l)localObject2;
    localObject6 = paramo.g;
    b.f.b.j.a(localObject6, "proto.typeParameterList");
    localObject6 = k.a((k)localObject4, (l)localObject5, (List)localObject6);
    localObject4 = b.i.b.a.c.e.a.g.b(paramo, this.b.f);
    if (localObject4 != null)
    {
      localObject4 = ((k)localObject6).a.a((a.aa)localObject4);
      if (localObject4 != null)
      {
        localObject1 = b.i.b.a.c.i.c.a((b.i.b.a.c.b.a)localObject2, (b.i.b.a.c.l.w)localObject4, (b.i.b.a.c.b.a.g)localObject1);
        break label315;
      }
    }
    localObject1 = null;
    label315:
    localObject4 = a();
    localObject5 = ((k)localObject6).a.a();
    localObject7 = ((k)localObject6).b;
    Object localObject8 = paramo.j;
    b.f.b.j.a(localObject8, "proto.valueParameterList");
    localObject3 = ((q)localObject7).a((List)localObject8, (b.i.b.a.c.g.q)localObject3, a.a);
    localObject6 = ((k)localObject6).a.a(b.i.b.a.c.e.a.g.a(paramo, this.b.f));
    localObject7 = t.a;
    localObject7 = t.a((a.r)b.i.b.a.c.e.a.b.d.b(i));
    localObject8 = t.a;
    localObject8 = t.a((a.ao)b.i.b.a.c.e.a.b.c.b(i));
    Map localMap = ac.a();
    Boolean localBoolean = b.i.b.a.c.e.a.b.r.a(i);
    b.f.b.j.a(localBoolean, "Flags.IS_SUSPEND.get(flags)");
    localBoolean.booleanValue();
    a((b.i.b.a.c.j.a.a.j)localObject2, (ak)localObject1, (ak)localObject4, (List)localObject5, (List)localObject3, (b.i.b.a.c.l.w)localObject6, (b.i.b.a.c.b.w)localObject7, (az)localObject8, localMap);
    localObject1 = b.i.b.a.c.e.a.b.m.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_OPERATOR.get(flags)");
    ((p)localObject2).j = ((Boolean)localObject1).booleanValue();
    localObject1 = b.i.b.a.c.e.a.b.n.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_INFIX.get(flags)");
    ((p)localObject2).k = ((Boolean)localObject1).booleanValue();
    localObject1 = b.i.b.a.c.e.a.b.q.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
    ((p)localObject2).l = ((Boolean)localObject1).booleanValue();
    localObject1 = b.i.b.a.c.e.a.b.o.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_INLINE.get(flags)");
    ((p)localObject2).m = ((Boolean)localObject1).booleanValue();
    localObject1 = b.i.b.a.c.e.a.b.p.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_TAILREC.get(flags)");
    ((p)localObject2).n = ((Boolean)localObject1).booleanValue();
    localObject1 = b.i.b.a.c.e.a.b.r.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_SUSPEND.get(flags)");
    ((p)localObject2).s = ((Boolean)localObject1).booleanValue();
    localObject1 = b.i.b.a.c.e.a.b.s.a(i);
    b.f.b.j.a(localObject1, "Flags.IS_EXPECT_FUNCTION.get(flags)");
    ((p)localObject2).o = ((Boolean)localObject1).booleanValue();
    this.b.c.m.a(paramo, (b.i.b.a.c.b.t)localObject2, this.b.f, this.b.a);
    return (al)localObject2;
  }
  
  public final aq a(a.ab paramab)
  {
    b.f.b.j.b(paramab, "proto");
    Object localObject1 = b.i.b.a.c.b.a.g.a;
    localObject1 = paramab.i;
    b.f.b.j.a(localObject1, "proto.annotationList");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (b.i.b.a.c.e.a.a)((Iterator)localObject2).next();
      localObject4 = this.a;
      b.f.b.j.a(localObject3, "it");
      ((Collection)localObject1).add(((c)localObject4).a((b.i.b.a.c.e.a.a)localObject3, this.b.d));
    }
    localObject1 = g.a.a((List)localObject1);
    localObject2 = t.a;
    localObject2 = t.a((a.ao)b.i.b.a.c.e.a.b.c.b(paramab.b));
    localObject2 = new b.i.b.a.c.j.a.a.k(this.b.c.b, this.b.e, (b.i.b.a.c.b.a.g)localObject1, r.b(this.b.d, paramab.c), (az)localObject2, paramab, this.b.d, this.b.f, this.b.g, this.b.h);
    localObject1 = this.b;
    Object localObject3 = (l)localObject2;
    Object localObject4 = paramab.d;
    b.f.b.j.a(localObject4, "proto.typeParameterList");
    localObject4 = k.a((k)localObject1, (l)localObject3, (List)localObject4);
    localObject3 = ((k)localObject4).a.a();
    Object localObject5 = ((k)localObject4).a;
    localObject1 = this.b.f;
    b.f.b.j.b(paramab, "receiver$0");
    b.f.b.j.b(localObject1, "typeTable");
    if (paramab.g())
    {
      localObject1 = paramab.e;
      b.f.b.j.a(localObject1, "underlyingType");
    }
    else
    {
      if (!paramab.k()) {
        break label434;
      }
      localObject1 = ((b.i.b.a.c.e.a.h)localObject1).a(paramab.f);
    }
    localObject1 = ((w)localObject5).b((a.aa)localObject1);
    localObject4 = ((k)localObject4).a;
    localObject5 = this.b.f;
    b.f.b.j.b(paramab, "receiver$0");
    b.f.b.j.b(localObject5, "typeTable");
    if (paramab.l())
    {
      paramab = paramab.g;
      b.f.b.j.a(paramab, "expandedType");
    }
    else
    {
      if (!paramab.m()) {
        break label417;
      }
      paramab = ((b.i.b.a.c.e.a.h)localObject5).a(paramab.h);
    }
    ((b.i.b.a.c.j.a.a.k)localObject2).a((List)localObject3, (ad)localObject1, ((w)localObject4).b(paramab), f.a.a);
    return (aq)localObject2;
    label417:
    throw ((Throwable)new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString()));
    label434:
    throw ((Throwable)new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString()));
  }
  
  public final b.i.b.a.c.b.d a(a.e parame, boolean paramBoolean)
  {
    b.f.b.j.b(parame, "proto");
    Object localObject1 = this.b.e;
    if (localObject1 != null)
    {
      localObject1 = (e)localObject1;
      Object localObject2 = (b.i.b.a.c.g.q)parame;
      b.i.b.a.c.j.a.a.c localc = new b.i.b.a.c.j.a.a.c((e)localObject1, a((b.i.b.a.c.g.q)localObject2, parame.b, a.a), paramBoolean, b.i.b.a.c.b.b.a.a, parame, this.b.d, this.b.f, this.b.g, this.b.h);
      Object localObject3 = k.a(this.b, (l)localc, (List)b.a.v.a).b;
      List localList = parame.c;
      b.f.b.j.a(localList, "proto.valueParameterList");
      localObject2 = ((q)localObject3).a(localList, (b.i.b.a.c.g.q)localObject2, a.a);
      localObject3 = t.a;
      localc.a((List)localObject2, t.a((a.ao)b.i.b.a.c.e.a.b.c.b(parame.b)));
      localc.f = ((b.i.b.a.c.l.w)((e)localObject1).h());
      b.f.b.j.a(localc.e, "descriptor.valueParameters");
      b.f.b.j.a(localc.c, "descriptor.typeParameters");
      localc.g();
      localc.a(f.a.a);
      return (b.i.b.a.c.b.d)localc;
    }
    throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.a.c>>
  {
    a(q paramq, b.i.b.a.c.g.q paramq1, a parama)
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.a.c>>
  {
    b(q paramq, boolean paramBoolean, a.u paramu)
    {
      super();
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.a.c>>
  {
    c(q paramq, b.i.b.a.c.g.q paramq1, a parama)
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.a<b.i.b.a.c.i.b.f<?>>
  {
    d(q paramq, a.u paramu, b.i.b.a.c.j.a.a.i parami)
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.a.c>>
  {
    e(int paramInt, a.ai paramai, q paramq, s params, b.i.b.a.c.g.q paramq1, a parama, b.i.b.a.c.b.a parama1)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */