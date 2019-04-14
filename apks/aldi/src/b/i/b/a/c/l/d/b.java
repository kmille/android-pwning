package b.i.b.a.c.l.d;

import b.i.b.a.c.a.g;
import b.i.b.a.c.b.l;
import b.i.b.a.c.h.c.a;
import b.i.b.a.c.h.i;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ao;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.as;
import b.i.b.a.c.l.at;
import b.i.b.a.c.l.au;
import b.i.b.a.c.l.av;
import b.i.b.a.c.l.ax;
import b.i.b.a.c.l.az;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.t;
import b.i.b.a.c.l.x;
import b.m;
import b.r;
import b.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final ap a(ap paramap)
  {
    au localau = au.a((as)new c());
    b.f.b.j.a(localau, "TypeSubstitutor.create(o…ojection\n        }\n    })");
    return localau.a(paramap);
  }
  
  public static final ap a(ap paramap, boolean paramBoolean)
  {
    if (paramap == null) {
      return null;
    }
    if (paramap.a()) {
      return paramap;
    }
    b.i.b.a.c.l.w localw = paramap.c();
    b.f.b.j.a(localw, "typeProjection.type");
    if (!av.a(localw, (b.f.a.b)b.a)) {
      return paramap;
    }
    ba localba = paramap.b();
    b.f.b.j.a(localba, "typeProjection.projectionKind");
    if (localba == ba.c) {}
    for (paramap = new b.i.b.a.c.l.ar(localba, (b.i.b.a.c.l.w)a(localw).b);; paramap = new b.i.b.a.c.l.ar(localba, (b.i.b.a.c.l.w)a(localw).a))
    {
      return (ap)paramap;
      if (!paramBoolean) {
        break;
      }
    }
    return a(paramap);
  }
  
  private static final a<d> a(d paramd)
  {
    Object localObject1 = a(paramd.b);
    b.i.b.a.c.l.w localw1 = (b.i.b.a.c.l.w)((a)localObject1).a;
    localObject1 = (b.i.b.a.c.l.w)((a)localObject1).b;
    Object localObject2 = a(paramd.c);
    b.i.b.a.c.l.w localw2 = (b.i.b.a.c.l.w)((a)localObject2).a;
    localObject2 = (b.i.b.a.c.l.w)((a)localObject2).b;
    return new a(new d(paramd.a, (b.i.b.a.c.l.w)localObject1, localw2), new d(paramd.a, localw1, (b.i.b.a.c.l.w)localObject2));
  }
  
  public static final a<b.i.b.a.c.l.w> a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "type");
    Object localObject1;
    Object localObject2;
    if (t.a(paramw))
    {
      localObject1 = a((b.i.b.a.c.l.w)t.c(paramw));
      localObject2 = a((b.i.b.a.c.l.w)t.d(paramw));
      return new a(ax.a(x.a(t.c((b.i.b.a.c.l.w)((a)localObject1).a), t.d((b.i.b.a.c.l.w)((a)localObject2).a)), paramw), ax.a(x.a(t.c((b.i.b.a.c.l.w)((a)localObject1).b), t.d((b.i.b.a.c.l.w)((a)localObject2).b)), paramw));
    }
    Object localObject4 = paramw.f();
    Object localObject3;
    if (b.i.b.a.c.i.a.a.c.a(paramw))
    {
      if (localObject4 != null)
      {
        localObject3 = ((b.i.b.a.c.i.a.a.b)localObject4).b;
        localObject1 = new a(paramw);
        localObject2 = ((ap)localObject3).c();
        b.f.b.j.a(localObject2, "typeProjection.type");
        localObject2 = ((a)localObject1).a((b.i.b.a.c.l.w)localObject2);
        localObject4 = ((ap)localObject3).b();
        switch (c.b[localObject4.ordinal()])
        {
        default: 
          throw ((Throwable)new AssertionError("Only nontrivial projections should have been captured, not: ".concat(String.valueOf(localObject3))));
        case 2: 
          paramw = b.i.b.a.c.l.c.a.a(paramw).f();
          b.f.b.j.a(paramw, "type.builtIns.nothingType");
          return new a(((a)localObject1).a((b.i.b.a.c.l.w)paramw), localObject2);
        }
        paramw = b.i.b.a.c.l.c.a.a(paramw).h();
        b.f.b.j.a(paramw, "type.builtIns.nullableAnyType");
        return new a(localObject2, paramw);
      }
      throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
    }
    if ((!paramw.a().isEmpty()) && (paramw.a().size() == ((an)localObject4).b().size()))
    {
      localObject3 = new ArrayList();
      localObject2 = new ArrayList();
      localObject1 = (Iterable)paramw.a();
      localObject4 = ((an)localObject4).b();
      b.f.b.j.a(localObject4, "typeConstructor.parameters");
      localObject4 = b.a.j.a((Iterable)localObject1, (Iterable)localObject4).iterator();
      if (((Iterator)localObject4).hasNext())
      {
        localObject1 = (m)((Iterator)localObject4).next();
        Object localObject5 = (ap)((m)localObject1).a;
        localObject1 = (b.i.b.a.c.b.ar)((m)localObject1).b;
        b.f.b.j.a(localObject1, "typeParameter");
        localObject1 = a((ap)localObject5, (b.i.b.a.c.b.ar)localObject1);
        if (((ap)localObject5).a()) {
          ((ArrayList)localObject3).add(localObject1);
        }
        for (;;)
        {
          ((ArrayList)localObject2).add(localObject1);
          break;
          localObject1 = a((d)localObject1);
          localObject5 = (d)((a)localObject1).a;
          localObject1 = (d)((a)localObject1).b;
          ((ArrayList)localObject3).add(localObject5);
        }
      }
      localObject1 = (Iterable)localObject3;
      boolean bool = ((Collection)localObject1).isEmpty();
      int i = 1;
      if (!bool)
      {
        localObject1 = ((Iterable)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          if ((((d)((Iterator)localObject1).next()).a() ^ true)) {
            break label556;
          }
        }
      }
      i = 0;
      label556:
      if (i != 0)
      {
        localObject1 = b.i.b.a.c.l.c.a.a(paramw).f();
        b.f.b.j.a(localObject1, "type.builtIns.nothingType");
        localObject1 = (b.i.b.a.c.l.w)localObject1;
      }
      else
      {
        localObject1 = a(paramw, (List)localObject3);
      }
      return new a(localObject1, a(paramw, (List)localObject2));
    }
    return new a(paramw, paramw);
  }
  
  private static final d a(ap paramap, b.i.b.a.c.b.ar paramar)
  {
    Object localObject = au.a(paramar.k(), paramap);
    switch (c.a[localObject.ordinal()])
    {
    default: 
      throw new b.k();
    case 3: 
      localObject = b.i.b.a.c.i.c.a.d((l)paramar).f();
      b.f.b.j.a(localObject, "typeParameter.builtIns.nothingType");
      localObject = (b.i.b.a.c.l.w)localObject;
      paramap = paramap.c();
      b.f.b.j.a(paramap, "type");
      return new d(paramar, (b.i.b.a.c.l.w)localObject, paramap);
    case 2: 
      paramap = paramap.c();
      b.f.b.j.a(paramap, "type");
      localObject = b.i.b.a.c.i.c.a.d((l)paramar).h();
      b.f.b.j.a(localObject, "typeParameter.builtIns.nullableAnyType");
      return new d(paramar, paramap, (b.i.b.a.c.l.w)localObject);
    }
    localObject = paramap.c();
    b.f.b.j.a(localObject, "type");
    paramap = paramap.c();
    b.f.b.j.a(paramap, "type");
    return new d(paramar, (b.i.b.a.c.l.w)localObject, paramap);
  }
  
  private static final b.i.b.a.c.l.w a(b.i.b.a.c.l.w paramw, List<d> paramList)
  {
    int i;
    if (paramw.a().size() == paramList.size()) {
      i = 1;
    } else {
      i = 0;
    }
    if ((b.w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("Incorrect type arguments ".concat(String.valueOf(paramList))));
    }
    paramList = (Iterable)paramList;
    Object localObject = (Collection)new ArrayList(b.a.j.a(paramList));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (d)localIterator.next();
      boolean bool = paramList.a();
      if ((b.w.a) && (!bool))
      {
        paramw = b.i.b.a.c.h.c.j;
        paramw = c.a.a((b.f.a.b)d.a);
        localObject = new StringBuilder("Only consistent enhanced type projection can be converted to type projection, but [");
        ((StringBuilder)localObject).append(paramw.a((l)paramList.a));
        ((StringBuilder)localObject).append(": <");
        ((StringBuilder)localObject).append(paramw.a(paramList.b));
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramw.a(paramList.c));
        ((StringBuilder)localObject).append(">] was found");
        throw ((Throwable)new AssertionError(((StringBuilder)localObject).toString()));
      }
      e locale = new e(paramList);
      if (b.f.b.j.a(paramList.b, paramList.c))
      {
        paramList = (ap)new b.i.b.a.c.l.ar(paramList.b);
      }
      else
      {
        if ((g.n(paramList.b)) && (paramList.a.k() != ba.b)) {
          paramList = new b.i.b.a.c.l.ar(locale.a(ba.c), paramList.c);
        }
        for (;;)
        {
          paramList = (ap)paramList;
          break;
          if (g.q(paramList.c)) {
            paramList = new b.i.b.a.c.l.ar(locale.a(ba.b), paramList.b);
          } else {
            paramList = new b.i.b.a.c.l.ar(locale.a(ba.c), paramList.c);
          }
        }
      }
      ((Collection)localObject).add(paramList);
    }
    return at.a(paramw, (List)localObject, paramw.r());
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.b<b.i.b.a.c.l.w, b.i.b.a.c.l.w>
  {
    a(b.i.b.a.c.l.w paramw)
    {
      super();
    }
    
    public final b.i.b.a.c.l.w a(b.i.b.a.c.l.w paramw)
    {
      b.f.b.j.b(paramw, "receiver$0");
      paramw = av.b(paramw, this.a.c());
      b.f.b.j.a(paramw, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
      return paramw;
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<az, Boolean>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
  
  public static final class c
    extends ao
  {
    public final ap a(an paraman)
    {
      b.f.b.j.b(paraman, "key");
      an localan = paraman;
      if (!(paraman instanceof b.i.b.a.c.i.a.a.b)) {
        localan = null;
      }
      paraman = (b.i.b.a.c.i.a.a.b)localan;
      if (paraman == null) {
        return null;
      }
      if (paraman.b.a()) {
        return (ap)new b.i.b.a.c.l.ar(ba.c, paraman.b.c());
      }
      return paraman.b;
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.b<i, u>
  {
    public static final d a = new d();
    
    d()
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.b<ba, ba>
  {
    e(d paramd)
    {
      super();
    }
    
    public final ba a(ba paramba)
    {
      b.f.b.j.b(paramba, "variance");
      ba localba = paramba;
      if (paramba == this.a.a.k()) {
        localba = ba.a;
      }
      return localba;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */