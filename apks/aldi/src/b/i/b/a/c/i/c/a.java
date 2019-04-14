package b.i.b.a.c.i.c;

import b.f.a.m;
import b.f.b.k;
import b.f.b.u.a;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ag;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.y;
import b.i.b.a.c.i.e.j.a;
import b.i.b.a.c.l.an;
import b.i.b.a.c.n.b.a;
import b.i.b.a.c.n.b.b;
import b.r;
import b.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public final class a
{
  private static final b.i.b.a.c.f.f a;
  
  static
  {
    b.i.b.a.c.f.f localf = b.i.b.a.c.f.f.a("value");
    b.f.b.j.a(localf, "Name.identifier(\"value\")");
    a = localf;
  }
  
  public static final b.i.b.a.c.b.b a(b.i.b.a.c.b.b paramb)
  {
    b.f.b.j.b(paramb, "receiver$0");
    b.i.b.a.c.b.b localb = paramb;
    if ((paramb instanceof ag))
    {
      paramb = ((ag)paramb).v();
      b.f.b.j.a(paramb, "correspondingProperty");
      localb = (b.i.b.a.c.b.b)paramb;
    }
    return localb;
  }
  
  public static final e a(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "receiver$0");
    b.i.b.a.c.b.h localh = paramc.a().f().c();
    paramc = localh;
    if (!(localh instanceof e)) {
      paramc = null;
    }
    return (e)paramc;
  }
  
  public static final e a(e parame)
  {
    b.f.b.j.b(parame, "receiver$0");
    parame = parame.h().f().i_().iterator();
    while (parame.hasNext())
    {
      Object localObject = (b.i.b.a.c.l.w)parame.next();
      if (!g.p((b.i.b.a.c.l.w)localObject))
      {
        localObject = ((b.i.b.a.c.l.w)localObject).f().c();
        if (b.i.b.a.c.i.d.m((l)localObject))
        {
          if (localObject != null) {
            return (e)localObject;
          }
          throw new r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
      }
    }
    return null;
  }
  
  public static final e a(y paramy, b.i.b.a.c.f.b paramb, b.i.b.a.c.c.a.a parama)
  {
    b.f.b.j.b(paramy, "receiver$0");
    b.f.b.j.b(paramb, "topLevelClassFqName");
    b.f.b.j.b(parama, "location");
    boolean bool = paramb.a();
    if ((b.w.a) && (!(bool ^ true))) {
      throw ((Throwable)new AssertionError("Assertion failed"));
    }
    b.i.b.a.c.f.b localb = paramb.b();
    b.f.b.j.a(localb, "topLevelClassFqName.parent()");
    paramy = paramy.a(localb).c();
    paramb = paramb.b.d();
    b.f.b.j.a(paramb, "topLevelClassFqName.shortName()");
    paramb = paramy.c(paramb, parama);
    paramy = paramb;
    if (!(paramb instanceof e)) {
      paramy = null;
    }
    return (e)paramy;
  }
  
  public static final b.i.b.a.c.f.a a(b.i.b.a.c.b.h paramh)
  {
    if (paramh != null)
    {
      Object localObject = paramh.a();
      if (localObject != null)
      {
        if ((localObject instanceof ab)) {
          return new b.i.b.a.c.f.a(((ab)localObject).c(), paramh.i());
        }
        if ((localObject instanceof b.i.b.a.c.b.i))
        {
          localObject = a((b.i.b.a.c.b.h)localObject);
          if (localObject != null) {
            return ((b.i.b.a.c.f.a)localObject).a(paramh.i());
          }
        }
      }
    }
    return null;
  }
  
  public static final b.i.b.a.c.f.c a(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    paraml = b.i.b.a.c.i.d.c(paraml);
    b.f.b.j.a(paraml, "DescriptorUtils.getFqName(this)");
    return paraml;
  }
  
  public static final boolean a(au paramau)
  {
    b.f.b.j.b(paramau, "receiver$0");
    paramau = b.i.b.a.c.n.b.a((Collection)b.a.j.a(paramau), (b.b)b.a, (b.f.a.b)c.c);
    b.f.b.j.a(paramau, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
    return paramau.booleanValue();
  }
  
  public static final b.i.b.a.c.f.b b(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    paraml = b.i.b.a.c.i.d.d(paraml);
    b.f.b.j.a(paraml, "DescriptorUtils.getFqNameSafe(this)");
    return paraml;
  }
  
  public static final b.i.b.a.c.i.b.f<?> b(b.i.b.a.c.b.a.c paramc)
  {
    b.f.b.j.b(paramc, "receiver$0");
    return (b.i.b.a.c.i.b.f)b.a.j.c((Iterable)paramc.c().values());
  }
  
  public static final Collection<e> b(e parame)
  {
    b.f.b.j.b(parame, "sealedClass");
    if (parame.d_() != b.i.b.a.c.b.w.b) {
      return (Collection)b.a.v.a;
    }
    final LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a locala = new a(parame, localLinkedHashSet);
    l locall = parame.a();
    b.f.b.j.a(locall, "sealedClass.containingDeclaration");
    if ((locall instanceof ab)) {
      locala.a(((ab)locall).c_(), false);
    }
    parame = parame.v();
    b.f.b.j.a(parame, "sealedClass.unsubstitutedInnerClassesScope");
    locala.a(parame, true);
    return (Collection)localLinkedHashSet;
  }
  
  public static final y c(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    paraml = b.i.b.a.c.i.d.f(paraml);
    b.f.b.j.a(paraml, "DescriptorUtils.getContainingModule(this)");
    return paraml;
  }
  
  public static final g d(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    return c(paraml).b();
  }
  
  public static final b.j.h<l> e(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    b.f.b.j.b(paraml, "receiver$0");
    paraml = b.j.i.a(paraml, (b.f.a.b)f.a);
    b.f.b.j.b(paraml, "receiver$0");
    if ((paraml instanceof b.j.c)) {
      return ((b.j.c)paraml).b();
    }
    return (b.j.h)new b.j.b(paraml, 1);
  }
  
  public static final b.i.b.a.c.f.b f(l paraml)
  {
    b.f.b.j.b(paraml, "receiver$0");
    paraml = a(paraml);
    if (!paraml.a()) {
      paraml = null;
    }
    if (paraml != null) {
      return paraml.b();
    }
    return null;
  }
  
  static final class a
    extends k
    implements m<b.i.b.a.c.i.e.h, Boolean, u>
  {
    a(e parame, LinkedHashSet paramLinkedHashSet)
    {
      super();
    }
    
    public final void a(b.i.b.a.c.i.e.h paramh, boolean paramBoolean)
    {
      b.f.b.j.b(paramh, "scope");
      paramh = j.a.a(paramh, b.i.b.a.c.i.e.d.h, null, 2).iterator();
      while (paramh.hasNext())
      {
        Object localObject2 = (l)paramh.next();
        if ((localObject2 instanceof e))
        {
          Object localObject1 = (e)localObject2;
          if (b.i.b.a.c.i.d.a((e)localObject1, this.a)) {
            localLinkedHashSet.add(localObject2);
          }
          if (paramBoolean)
          {
            localObject2 = (a)this;
            localObject1 = ((e)localObject1).v();
            b.f.b.j.a(localObject1, "descriptor.unsubstitutedInnerClassesScope");
            ((a)localObject2).a((b.i.b.a.c.i.e.h)localObject1, paramBoolean);
          }
        }
      }
    }
  }
  
  static final class b<N>
    implements b.b<N>
  {
    public static final b a = new b();
  }
  
  static final class c
    extends b.f.b.i
    implements b.f.a.b<au, Boolean>
  {
    public static final c c = new c();
    
    c()
    {
      super();
    }
    
    public final b.i.d f()
    {
      return b.f.b.v.a(au.class);
    }
    
    public final String g()
    {
      return "declaresDefaultValue";
    }
    
    public final String h()
    {
      return "declaresDefaultValue()Z";
    }
  }
  
  static final class d<N>
    implements b.b<N>
  {}
  
  public static final class e
    extends b.a<b.i.b.a.c.b.b, b.i.b.a.c.b.b>
  {
    e(u.a parama, b.f.a.b paramb) {}
  }
  
  static final class f
    extends k
    implements b.f.a.b<l, l>
  {
    public static final f a = new f();
    
    f()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */