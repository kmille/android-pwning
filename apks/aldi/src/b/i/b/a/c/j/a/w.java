package b.i.b.a.c.j.a;

import b.a.ac;
import b.i.b.a.c.b.aa;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.h;
import b.i.b.a.c.b.y;
import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.a.aa.a;
import b.i.b.a.c.e.a.aa.a.b;
import b.i.b.a.c.e.a.ae;
import b.i.b.a.c.e.a.b.a;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.ag;
import b.i.b.a.c.l.ah;
import b.i.b.a.c.l.al;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ap;
import b.i.b.a.c.l.p;
import b.i.b.a.c.l.x;
import b.i.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class w
{
  final k a;
  boolean b;
  private final b.f.a.b<Integer, e> c;
  private final b.f.a.b<Integer, h> d;
  private final Map<Integer, b.i.b.a.c.b.ar> e;
  private final w f;
  private final String g;
  
  private w(k paramk, w paramw, List<a.ae> paramList, String paramString)
  {
    this.a = paramk;
    this.f = paramw;
    this.g = paramString;
    int i = 0;
    this.b = false;
    this.c = ((b.f.a.b)this.a.c.b.b((b.f.a.b)new a(this)));
    this.d = ((b.f.a.b)this.a.c.b.b((b.f.a.b)new d(this)));
    if (paramList.isEmpty())
    {
      paramk = ac.a();
    }
    else
    {
      paramk = new LinkedHashMap();
      paramw = ((Iterable)paramList).iterator();
      while (paramw.hasNext())
      {
        paramList = (a.ae)paramw.next();
        ((Map)paramk).put(Integer.valueOf(paramList.b), new b.i.b.a.c.j.a.a.l(this.a, paramList, i));
        i += 1;
      }
      paramk = (Map)paramk;
    }
    this.e = paramk;
  }
  
  private final ad a(b.i.b.a.c.b.a.g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean)
  {
    int i = paraman.b().size();
    int j = paramList.size();
    Object localObject = null;
    switch (i - j)
    {
    default: 
      break;
    case 1: 
      i = paramList.size() - 1;
      if (i >= 0)
      {
        localObject = paraman.d().c(i);
        b.f.b.j.a(localObject, "functionTypeConstructor.…getSuspendFunction(arity)");
        localObject = ((e)localObject).c();
        b.f.b.j.a(localObject, "functionTypeConstructor.…on(arity).typeConstructor");
        localObject = x.a(paramg, (an)localObject, paramList, paramBoolean);
      }
      break;
    case 0: 
      localObject = b(paramg, paraman, paramList, paramBoolean);
    }
    paramg = (b.i.b.a.c.b.a.g)localObject;
    if (localObject == null)
    {
      paramg = p.a("Bad suspend function in metadata with constructor: ".concat(String.valueOf(paraman)), paramList);
      b.f.b.j.a(paramg, "ErrorUtils.createErrorTy…      arguments\n        )");
    }
    return paramg;
  }
  
  private final ad a(b.i.b.a.c.l.w paramw)
  {
    Object localObject1 = (ap)b.a.j.f(b.i.b.a.c.a.f.f(paramw));
    Object localObject2 = null;
    if (localObject1 != null)
    {
      Object localObject3 = ((ap)localObject1).c();
      if (localObject3 == null) {
        return null;
      }
      b.f.b.j.a(localObject3, "funType.getValueParamete…ll()?.type ?: return null");
      localObject1 = ((b.i.b.a.c.l.w)localObject3).f().c();
      if (localObject1 != null) {
        localObject1 = b.i.b.a.c.i.c.a.b((b.i.b.a.c.b.l)localObject1);
      } else {
        localObject1 = null;
      }
      if ((((b.i.b.a.c.l.w)localObject3).a().size() == 1) && ((b.i.b.a.c.a.k.a((b.i.b.a.c.f.b)localObject1, true)) || (b.i.b.a.c.a.k.a((b.i.b.a.c.f.b)localObject1, false))))
      {
        b.i.b.a.c.l.w localw = ((ap)b.a.j.g(((b.i.b.a.c.l.w)localObject3).a())).c();
        b.f.b.j.a(localw, "continuationArgumentType.arguments.single().type");
        localObject3 = this.a.e;
        localObject1 = localObject3;
        if (!(localObject3 instanceof b.i.b.a.c.b.a)) {
          localObject1 = null;
        }
        localObject3 = (b.i.b.a.c.b.a)localObject1;
        localObject1 = localObject2;
        if (localObject3 != null) {
          localObject1 = b.i.b.a.c.i.c.a.f((b.i.b.a.c.b.l)localObject3);
        }
        if (b.f.b.j.a(localObject1, v.a)) {
          return a(paramw, localw);
        }
        this.b = this.b;
        return a(paramw, localw);
      }
      return (ad)paramw;
    }
    return null;
  }
  
  private static ad a(b.i.b.a.c.l.w paramw1, b.i.b.a.c.l.w paramw2)
  {
    b.i.b.a.c.a.g localg = b.i.b.a.c.l.c.a.a(paramw1);
    b.i.b.a.c.b.a.g localg1 = paramw1.r();
    b.i.b.a.c.l.w localw = b.i.b.a.c.a.f.d(paramw1);
    Object localObject = (Iterable)b.a.j.i(b.i.b.a.c.a.f.f(paramw1));
    Collection localCollection = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localCollection.add(((ap)((Iterator)localObject).next()).c());
    }
    return b.i.b.a.c.a.f.a(localg, localg1, localw, (List)localCollection, paramw2, true).b(paramw1.c());
  }
  
  private final an a(int paramInt)
  {
    w localw = this;
    do
    {
      localObject = (b.i.b.a.c.b.ar)localw.e.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        an localan = ((b.i.b.a.c.b.ar)localObject).c();
        localObject = localan;
        if (localan != null) {
          break;
        }
      }
      localw = localw.f;
    } while (localw != null);
    Object localObject = null;
    return (an)localObject;
  }
  
  private final ap a(b.i.b.a.c.b.ar paramar, a.aa.a parama)
  {
    if (parama.b == a.aa.a.b.d) {
      if (paramar == null)
      {
        paramar = this.a.c.c.b().h();
        b.f.b.j.a(paramar, "c.components.moduleDescr….builtIns.nullableAnyType");
      }
    }
    for (paramar = new al((b.i.b.a.c.l.w)paramar);; paramar = new b.i.b.a.c.l.ar((b.i.b.a.c.l.w)p.c("No type recorded")))
    {
      return (ap)paramar;
      return (ap)new ah(paramar);
      paramar = t.a;
      paramar = parama.b;
      b.f.b.j.a(paramar, "typeArgumentProto.projection");
      paramar = t.a(paramar);
      parama = b.i.b.a.c.e.a.g.a(parama, this.a.f);
      if (parama != null) {
        break;
      }
    }
    return (ap)new b.i.b.a.c.l.ar(paramar, a(parama));
  }
  
  private final ad b(int paramInt)
  {
    if (r.a(this.a.d, paramInt).c) {}
    return null;
  }
  
  private final ad b(b.i.b.a.c.b.a.g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean)
  {
    paramg = (b.i.b.a.c.l.w)x.a(paramg, paraman, paramList, paramBoolean);
    if (!b.i.b.a.c.a.f.a(paramg)) {
      return null;
    }
    return a(paramg);
  }
  
  private final an c(final a.aa paramaa)
  {
    Object localObject3 = new e(this, paramaa);
    Object localObject2;
    if (paramaa.m())
    {
      localObject2 = (e)this.c.a(Integer.valueOf(paramaa.g));
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = ((e)localObject3).a(paramaa.g);
      }
      localObject1 = ((e)localObject1).c();
      paramaa = "(classDescriptors(proto.…assName)).typeConstructor";
    }
    for (;;)
    {
      b.f.b.j.a(localObject1, paramaa);
      return (an)localObject1;
      if (paramaa.n())
      {
        localObject2 = a(paramaa.h);
        localObject1 = localObject2;
        if (localObject2 != null) {
          return localObject1;
        }
        localObject1 = new StringBuilder("Unknown type parameter ");
        ((StringBuilder)localObject1).append(paramaa.h);
        localObject1 = p.e(((StringBuilder)localObject1).toString());
        paramaa = "ErrorUtils.createErrorTy… ${proto.typeParameter}\")";
      }
      else if (paramaa.o())
      {
        localObject1 = this.a.e;
        localObject2 = this.a.d.a(paramaa.i);
        localObject3 = ((Iterable)a()).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          paramaa = ((Iterator)localObject3).next();
          if (b.f.b.j.a(((b.i.b.a.c.b.ar)paramaa).i().a, localObject2)) {
            break label217;
          }
        }
        paramaa = null;
        label217:
        paramaa = (b.i.b.a.c.b.ar)paramaa;
        if (paramaa != null)
        {
          paramaa = paramaa.c();
          if (paramaa != null) {
            return paramaa;
          }
        }
        paramaa = new StringBuilder("Deserialized type parameter ");
        paramaa.append((String)localObject2);
        paramaa.append(" in ");
        paramaa.append(localObject1);
        localObject1 = p.e(paramaa.toString());
        paramaa = "ErrorUtils.createErrorTy…ter $name in $container\")";
      }
      else
      {
        if (!paramaa.p()) {
          break;
        }
        localObject2 = (h)this.d.a(Integer.valueOf(paramaa.j));
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = (h)((e)localObject3).a(paramaa.j);
        }
        localObject1 = ((h)localObject1).c();
        paramaa = "(typeAliasDescriptors(pr…iasName)).typeConstructor";
      }
    }
    Object localObject1 = p.e("Unknown type");
    b.f.b.j.a(localObject1, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
    return (an)localObject1;
  }
  
  public final b.i.b.a.c.l.w a(a.aa paramaa)
  {
    b.f.b.j.b(paramaa, "proto");
    if (paramaa.g())
    {
      String str = this.a.d.a(paramaa.d);
      ad localad = b(paramaa);
      Object localObject = b.i.b.a.c.e.a.g.a(paramaa, this.a.f);
      if (localObject == null) {
        b.f.b.j.a();
      }
      localObject = b((a.aa)localObject);
      return this.a.c.j.a(paramaa, str, localad, (ad)localObject);
    }
    return (b.i.b.a.c.l.w)b(paramaa);
  }
  
  public final List<b.i.b.a.c.b.ar> a()
  {
    return b.a.j.i((Iterable)this.e.values());
  }
  
  public final ad b(final a.aa paramaa)
  {
    b.f.b.j.b(paramaa, "proto");
    if (paramaa.m()) {}
    for (int i = paramaa.g;; i = paramaa.j)
    {
      b(i);
      break;
      if (!paramaa.p()) {
        break;
      }
    }
    Object localObject1 = c(paramaa);
    if (p.a((b.i.b.a.c.b.l)((an)localObject1).c()))
    {
      paramaa = p.a(localObject1.toString(), (an)localObject1);
      b.f.b.j.a(paramaa, "ErrorUtils.createErrorTy….toString(), constructor)");
      return paramaa;
    }
    b.i.b.a.c.j.a.a.a locala = new b.i.b.a.c.j.a.a.a(this.a.c.b, (b.f.a.a)new c(this, paramaa));
    Object localObject3 = (Iterable)new b(this).a(paramaa);
    Object localObject2 = (Collection)new ArrayList(b.a.j.a((Iterable)localObject3));
    i = 0;
    localObject3 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      Object localObject4 = ((Iterator)localObject3).next();
      if (i < 0) {
        b.a.j.a();
      }
      localObject4 = (a.aa.a)localObject4;
      List localList = ((an)localObject1).b();
      b.f.b.j.a(localList, "constructor.parameters");
      ((Collection)localObject2).add(a((b.i.b.a.c.b.ar)b.a.j.b(localList, i), (a.aa.a)localObject4));
      i += 1;
    }
    localObject2 = b.a.j.i((Iterable)localObject2);
    localObject3 = b.i.b.a.c.e.a.b.a.a(paramaa.o);
    b.f.b.j.a(localObject3, "Flags.SUSPEND_TYPE.get(proto.flags)");
    if (((Boolean)localObject3).booleanValue()) {
      localObject1 = a((b.i.b.a.c.b.a.g)locala, (an)localObject1, (List)localObject2, paramaa.c);
    } else {
      localObject1 = x.a((b.i.b.a.c.b.a.g)locala, (an)localObject1, (List)localObject2, paramaa.c);
    }
    paramaa = b.i.b.a.c.e.a.g.c(paramaa, this.a.f);
    if (paramaa == null) {
      return (ad)localObject1;
    }
    return ag.a((ad)localObject1, b(paramaa));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.g);
    Object localObject;
    if (this.f == null)
    {
      localObject = "";
    }
    else
    {
      localObject = new StringBuilder(". Child of ");
      ((StringBuilder)localObject).append(this.f.g);
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.b<Integer, e>
  {
    a(w paramw)
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<a.aa, List<? extends a.aa.a>>
  {
    b(w paramw)
    {
      super();
    }
    
    public final List<a.aa.a> a(a.aa paramaa)
    {
      b.f.b.j.b(paramaa, "receiver$0");
      Object localObject = paramaa.b;
      b.f.b.j.a(localObject, "argumentList");
      Collection localCollection = (Collection)localObject;
      paramaa = b.i.b.a.c.e.a.g.b(paramaa, this.a.a.f);
      if (paramaa != null) {
        paramaa = a(paramaa);
      } else {
        paramaa = null;
      }
      localObject = paramaa;
      if (paramaa == null) {
        localObject = (List)b.a.v.a;
      }
      return b.a.j.b(localCollection, (Iterable)localObject);
    }
  }
  
  static final class c
    extends b.f.b.k
    implements b.f.a.a<List<? extends b.i.b.a.c.b.a.c>>
  {
    c(w paramw, a.aa paramaa)
    {
      super();
    }
  }
  
  static final class d
    extends b.f.b.k
    implements b.f.a.b<Integer, h>
  {
    d(w paramw)
    {
      super();
    }
  }
  
  static final class e
    extends b.f.b.k
    implements b.f.a.b<Integer, e>
  {
    e(w paramw, a.aa paramaa)
    {
      super();
    }
    
    public final e a(int paramInt)
    {
      b.i.b.a.c.f.a locala = r.a(this.a.a.d, paramInt);
      List localList = b.j.i.d(b.j.i.d(b.j.i.a(paramaa, (b.f.a.b)new b(this)), (b.f.a.b)c.a));
      paramInt = b.j.i.e(b.j.i.a(locala, (b.f.a.b)a.c));
      while (localList.size() < paramInt) {
        localList.add(Integer.valueOf(0));
      }
      return this.a.a.c.l.a(locala, localList);
    }
    
    static final class a
      extends b.f.b.i
      implements b.f.a.b<b.i.b.a.c.f.a, b.i.b.a.c.f.a>
    {
      public static final a c = new a();
      
      a()
      {
        super();
      }
      
      public final d f()
      {
        return b.f.b.v.a(b.i.b.a.c.f.a.class);
      }
      
      public final String g()
      {
        return "getOuterClassId";
      }
      
      public final String h()
      {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
      }
    }
    
    static final class b
      extends b.f.b.k
      implements b.f.a.b<a.aa, a.aa>
    {
      b(w.e parame)
      {
        super();
      }
    }
    
    static final class c
      extends b.f.b.k
      implements b.f.a.b<a.aa, Integer>
    {
      public static final c a = new c();
      
      c()
      {
        super();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/j/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */