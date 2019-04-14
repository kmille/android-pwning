package b.i.b.a.c.a.a;

import b.f.a.m;
import b.f.b.k;
import b.i.b.a.c.b.a.g.a;
import b.i.b.a.c.b.ad;
import b.i.b.a.c.b.am;
import b.i.b.a.c.b.ap;
import b.i.b.a.c.b.ap.a;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.az;
import b.i.b.a.c.b.c.ah;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.y;
import b.i.b.a.c.i.e.h;
import b.i.b.a.c.k.i;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.ba;
import b.i.b.a.c.l.x;
import b.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b
  extends b.i.b.a.c.b.c.a
{
  final List<b.i.b.a.c.b.ar> a;
  final b b;
  final int c;
  private final a g;
  private final d h;
  private final i i;
  private final b.i.b.a.c.b.ab j;
  
  public b(final i parami, b.i.b.a.c.b.ab paramab, b paramb, int paramInt)
  {
    super(parami, paramb.a(paramInt));
    this.i = parami;
    this.j = paramab;
    this.b = paramb;
    this.c = paramInt;
    this.g = new a();
    this.h = new d(this.i, this);
    parami = new ArrayList();
    paramab = new k(parami)
    {
      public final void a(ba paramAnonymousba, String paramAnonymousString)
      {
        b.f.b.j.b(paramAnonymousba, "variance");
        b.f.b.j.b(paramAnonymousString, "name");
        ArrayList localArrayList = parami;
        l locall = (l)this.a;
        g.a locala = b.i.b.a.c.b.a.g.a;
        localArrayList.add(ah.a(locall, g.a.a(), paramAnonymousba, b.i.b.a.c.f.f.a(paramAnonymousString), parami.size()));
      }
    };
    Object localObject = (Iterable)new b.h.c(1, this.c);
    paramb = (Collection)new ArrayList(b.a.j.a((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramInt = ((b.a.ab)localObject).a();
      paramab.a(ba.b, "P".concat(String.valueOf(paramInt)));
      paramb.add(u.a);
    }
    paramab.a(ba.c, "R");
    this.a = b.a.j.i((Iterable)parami);
  }
  
  public final an c()
  {
    return (an)this.g;
  }
  
  public final b.i.b.a.c.b.w d_()
  {
    return b.i.b.a.c.b.w.d;
  }
  
  public final b.i.b.a.c.b.f g()
  {
    return b.i.b.a.c.b.f.b;
  }
  
  public final az j()
  {
    az localaz = ay.e;
    b.f.b.j.a(localaz, "Visibilities.PUBLIC");
    return localaz;
  }
  
  public final boolean k()
  {
    return false;
  }
  
  public final boolean l()
  {
    return false;
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final boolean n()
  {
    return false;
  }
  
  public final boolean o()
  {
    return false;
  }
  
  public final boolean p()
  {
    return false;
  }
  
  public final boolean q()
  {
    return false;
  }
  
  public final b.i.b.a.c.b.a.g r()
  {
    g.a locala = b.i.b.a.c.b.a.g.a;
    return g.a.a();
  }
  
  public final am s()
  {
    am localam = am.b;
    b.f.b.j.a(localam, "SourceElement.NO_SOURCE");
    return localam;
  }
  
  public final String toString()
  {
    String str = this.d.a;
    b.f.b.j.a(str, "name.asString()");
    return str;
  }
  
  public final List<b.i.b.a.c.b.ar> u()
  {
    return this.a;
  }
  
  final class a
    extends b.i.b.a.c.l.b
  {
    public a()
    {
      super();
    }
    
    private final b.i.b.a.c.a.c a(b.i.b.a.c.f.b paramb)
    {
      Object localObject1 = (Iterable)b.a(this.a).b().a(paramb).f();
      paramb = (Collection)new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        if ((localObject2 instanceof b.i.b.a.c.a.c)) {
          paramb.add(localObject2);
        }
      }
      return (b.i.b.a.c.a.c)b.a.j.c((List)paramb);
    }
    
    public final Collection<b.i.b.a.c.l.w> a()
    {
      final ArrayList localArrayList = new ArrayList(2);
      a locala = new a(this, localArrayList);
      Object localObject1 = this.a.b;
      Object localObject2;
      String str;
      switch (c.a[localObject1.ordinal()])
      {
      default: 
        localObject1 = b.a(this.a);
        localObject2 = b.i.b.a.c.f.f.a(this.a.b.f);
        str = "Name.identifier(functionKind.classNamePrefix)";
      }
      for (;;)
      {
        b.f.b.j.a(localObject2, str);
        locala.a((b.i.b.a.c.b.ab)localObject1, (b.i.b.a.c.f.f)localObject2);
        break;
        localObject1 = b.a(this.a);
        localObject2 = b.i.b.a.c.f.f.a("KFunction");
        str = "Name.identifier(\"KFunction\")";
        continue;
        localObject1 = b.i.b.a.c.a.g.c;
        b.f.b.j.a(localObject1, "BUILT_INS_PACKAGE_FQ_NAME");
        localObject1 = (b.i.b.a.c.b.ab)a((b.i.b.a.c.f.b)localObject1);
        localObject2 = b.i.b.a.c.f.f.a("Function");
        str = "Name.identifier(\"Function\")";
      }
      localObject1 = this.a.b;
      switch (c.b[localObject1.ordinal()])
      {
      default: 
        break;
      case 2: 
        localObject1 = b.i.b.a.c.i.d.c;
        b.f.b.j.a(localObject1, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        localObject1 = (b.i.b.a.c.b.ab)a((b.i.b.a.c.f.b)localObject1);
        localObject2 = b.b.b;
        break;
      case 1: 
        localObject1 = b.i.b.a.c.a.g.c;
        b.f.b.j.a(localObject1, "BUILT_INS_PACKAGE_FQ_NAME");
        localObject1 = (b.i.b.a.c.b.ab)a((b.i.b.a.c.f.b)localObject1);
        localObject2 = b.b.a;
      }
      locala.a((b.i.b.a.c.b.ab)localObject1, ((b.b)localObject2).a(this.a.c));
      return (Collection)b.a.j.i((Iterable)localArrayList);
    }
    
    public final List<b.i.b.a.c.b.ar> b()
    {
      return b.b(this.a);
    }
    
    public final boolean e()
    {
      return true;
    }
    
    public final ap f()
    {
      return (ap)ap.a.a;
    }
    
    public final String toString()
    {
      return this.a.toString();
    }
    
    static final class a
      extends k
      implements m<b.i.b.a.c.b.ab, b.i.b.a.c.f.f, u>
    {
      a(b.a parama, ArrayList paramArrayList)
      {
        super();
      }
      
      public final void a(b.i.b.a.c.b.ab paramab, b.i.b.a.c.f.f paramf)
      {
        b.f.b.j.b(paramab, "packageFragment");
        b.f.b.j.b(paramf, "name");
        Object localObject2 = paramab.c_().c(paramf, (b.i.b.a.c.c.a.a)b.i.b.a.c.c.a.c.d);
        Object localObject1 = localObject2;
        if (!(localObject2 instanceof e)) {
          localObject1 = null;
        }
        localObject1 = (e)localObject1;
        if (localObject1 != null)
        {
          paramab = ((e)localObject1).c();
          b.f.b.j.a(paramab, "descriptor.typeConstructor");
          paramf = (Iterable)b.a.j.c(this.a.b(), paramab.b().size());
          paramab = (Collection)new ArrayList(b.a.j.a(paramf));
          paramf = paramf.iterator();
          while (paramf.hasNext()) {
            paramab.add(new b.i.b.a.c.l.ar((b.i.b.a.c.l.w)((b.i.b.a.c.b.ar)paramf.next()).h()));
          }
          paramab = (List)paramab;
          paramf = localArrayList;
          localObject2 = b.i.b.a.c.b.a.g.a;
          paramf.add(x.a(g.a.a(), (e)localObject1, paramab));
          return;
        }
        localObject1 = new StringBuilder("Class ");
        ((StringBuilder)localObject1).append(paramf);
        ((StringBuilder)localObject1).append(" not found in ");
        ((StringBuilder)localObject1).append(paramab);
        throw ((Throwable)new IllegalStateException(((StringBuilder)localObject1).toString().toString()));
      }
    }
  }
  
  public static enum b
  {
    public static final a g = new a((byte)0);
    public final b.i.b.a.c.f.b e;
    public final String f;
    
    static
    {
      Object localObject1 = b.i.b.a.c.a.g.c;
      b.f.b.j.a(localObject1, "BUILT_INS_PACKAGE_FQ_NAME");
      localObject1 = new b("Function", 0, (b.i.b.a.c.f.b)localObject1, "Function");
      a = (b)localObject1;
      Object localObject2 = b.i.b.a.c.i.d.c;
      b.f.b.j.a(localObject2, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
      localObject2 = new b("SuspendFunction", 1, (b.i.b.a.c.f.b)localObject2, "SuspendFunction");
      b = (b)localObject2;
      b localb1 = new b("KFunction", 2, b.i.b.a.c.a.j.a(), "KFunction");
      c = localb1;
      b localb2 = new b("KSuspendFunction", 3, b.i.b.a.c.a.j.a(), "KSuspendFunction");
      d = localb2;
      h = new b[] { localObject1, localObject2, localb1, localb2 };
    }
    
    private b(b.i.b.a.c.f.b paramb, String paramString)
    {
      this.e = paramb;
      this.f = paramString;
    }
    
    public final b.i.b.a.c.f.f a(int paramInt)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.f);
      ((StringBuilder)localObject).append(paramInt);
      localObject = b.i.b.a.c.f.f.a(((StringBuilder)localObject).toString());
      b.f.b.j.a(localObject, "Name.identifier(\"$classNamePrefix$arity\")");
      return (b.i.b.a.c.f.f)localObject;
    }
    
    public static final class a {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */