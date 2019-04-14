package b.i.b.a.c.d.a;

import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.ag;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.l;
import b.i.b.a.c.f.f;
import b.i.b.a.c.l.a.q;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.w;
import java.util.List;
import java.util.Set;

public final class t
{
  public static final <T extends b.i.b.a.c.b.b> T a(T paramT)
  {
    j.b(paramT, "receiver$0");
    Object localObject = c.a;
    if (!c.a().contains(paramT.i()))
    {
      localObject = e.a;
      if (!e.a().contains(b.i.b.a.c.i.c.a.a(paramT).i())) {
        return null;
      }
    }
    if ((!(paramT instanceof ah)) && (!(paramT instanceof ag))) {
      if (!(paramT instanceof al)) {}
    }
    for (localObject = b.a;; localObject = a.a)
    {
      return b.i.b.a.c.i.c.a.a(paramT, (b.f.a.b)localObject);
      return null;
    }
  }
  
  static final r a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    f localf = f.a(paramString2);
    j.a(localf, "Name.identifier(name)");
    Object localObject = b.i.b.a.c.d.b.t.a;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString2);
    ((StringBuilder)localObject).append('(');
    ((StringBuilder)localObject).append(paramString3);
    ((StringBuilder)localObject).append(')');
    ((StringBuilder)localObject).append(paramString4);
    return new r(localf, b.i.b.a.c.d.b.t.a(paramString1, ((StringBuilder)localObject).toString()));
  }
  
  static final b.i.b.a.c.f.b a(b.i.b.a.c.f.b paramb, String paramString)
  {
    paramb = paramb.a(f.a(paramString));
    j.a(paramb, "child(Name.identifier(name))");
    return paramb;
  }
  
  static final b.i.b.a.c.f.b a(b.i.b.a.c.f.c paramc, String paramString)
  {
    paramc = paramc.a(f.a(paramString)).b();
    j.a(paramc, "child(Name.identifier(name)).toSafe()");
    return paramc;
  }
  
  public static final boolean a(b.i.b.a.c.b.e parame, b.i.b.a.c.b.a parama)
  {
    j.b(parame, "receiver$0");
    j.b(parama, "specialCallableDescriptor");
    parama = parama.a();
    if (parama != null)
    {
      ad localad = ((b.i.b.a.c.b.e)parama).h();
      j.a(localad, "(specialCallableDescript…ssDescriptor).defaultType");
      int i;
      do
      {
        do
        {
          parama = b.i.b.a.c.i.d.a(parame);
          if (parama == null) {
            break;
          }
          parame = parama;
        } while ((parama instanceof b.i.b.a.c.d.a.b.d));
        if (q.a((w)parama.h(), (w)localad) != null) {
          i = 1;
        } else {
          i = 0;
        }
        parame = parama;
      } while (i == 0);
      return !g.a((l)parama);
    }
    throw new b.r("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
  }
  
  public static final boolean b(b.i.b.a.c.b.b paramb)
  {
    j.b(paramb, "receiver$0");
    return a(paramb) != null;
  }
  
  public static final <T extends b.i.b.a.c.b.b> T c(T paramT)
  {
    j.b(paramT, "receiver$0");
    Object localObject = a(paramT);
    if (localObject != null) {
      return (T)localObject;
    }
    localObject = d.a;
    localObject = paramT.i();
    j.a(localObject, "name");
    if (!d.a((f)localObject)) {
      return null;
    }
    return b.i.b.a.c.i.c.a.a(paramT, (b.f.a.b)c.a);
  }
  
  public static final String d(b.i.b.a.c.b.b paramb)
  {
    j.b(paramb, "callableMemberDescriptor");
    paramb = f(paramb);
    if (paramb != null)
    {
      paramb = b.i.b.a.c.i.c.a.a(paramb);
      if (paramb == null) {
        return null;
      }
      Object localObject;
      if ((paramb instanceof ah))
      {
        localObject = e.a;
        return e.b(paramb);
      }
      if ((paramb instanceof al))
      {
        localObject = c.a;
        paramb = c.a((al)paramb);
        if (paramb != null) {
          return paramb.a;
        }
      }
    }
    return null;
  }
  
  public static final boolean e(b.i.b.a.c.b.b paramb)
  {
    j.b(paramb, "receiver$0");
    j.b(paramb, "receiver$0");
    return ((b.i.b.a.c.i.c.a.a(paramb).a() instanceof b.i.b.a.c.d.a.b.d)) || (g.a((l)paramb));
  }
  
  private static final b.i.b.a.c.b.b f(b.i.b.a.c.b.b paramb)
  {
    if (g.a((l)paramb)) {
      return a(paramb);
    }
    return null;
  }
  
  static final class a
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
  
  static final class b
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    public static final b a = new b();
    
    b()
    {
      super();
    }
  }
  
  static final class c
    extends k
    implements b.f.a.b<b.i.b.a.c.b.b, Boolean>
  {
    public static final c a = new c();
    
    c()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */