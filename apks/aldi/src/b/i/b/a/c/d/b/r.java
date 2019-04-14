package b.i.b.a.c.d.b;

import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.ai;
import b.i.b.a.c.b.al;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.e;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.d.c;
import b.i.b.a.c.l.av;
import java.util.Iterator;
import java.util.List;

public final class r
{
  public static final j a(b.i.b.a.c.l.w paramw)
  {
    b.f.b.j.b(paramw, "receiver$0");
    return (j)y.a(paramw, (k)l.a, w.l, (u)v.a);
  }
  
  private static String a(b.i.b.a.c.b.t paramt, boolean paramBoolean1, boolean paramBoolean2)
  {
    b.f.b.j.b(paramt, "receiver$0");
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean2)
    {
      if ((paramt instanceof b.i.b.a.c.b.k))
      {
        localObject1 = "<init>";
      }
      else
      {
        localObject1 = paramt.i().a;
        b.f.b.j.a(localObject1, "name.asString()");
      }
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append("(");
    Object localObject1 = paramt.k().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (au)((Iterator)localObject1).next();
      b.f.b.j.a(localObject2, "parameter");
      localObject2 = ((au)localObject2).y();
      b.f.b.j.a(localObject2, "parameter.type");
      a(localStringBuilder, (b.i.b.a.c.l.w)localObject2);
    }
    localStringBuilder.append(")");
    if (paramBoolean1)
    {
      localObject1 = (b.i.b.a.c.b.a)paramt;
      b.f.b.j.b(localObject1, "descriptor");
      paramBoolean1 = localObject1 instanceof b.i.b.a.c.b.k;
      int i = 1;
      if (!paramBoolean1)
      {
        localObject2 = ((b.i.b.a.c.b.a)localObject1).g();
        if (localObject2 == null) {
          b.f.b.j.a();
        }
        if (g.s((b.i.b.a.c.l.w)localObject2))
        {
          localObject2 = ((b.i.b.a.c.b.a)localObject1).g();
          if (localObject2 == null) {
            b.f.b.j.a();
          }
          if ((!av.e((b.i.b.a.c.l.w)localObject2)) && (!(localObject1 instanceof ai))) {}
        }
        else
        {
          i = 0;
        }
      }
      if (i != 0)
      {
        localStringBuilder.append("V");
      }
      else
      {
        paramt = paramt.g();
        if (paramt == null) {
          b.f.b.j.a();
        }
        b.f.b.j.a(paramt, "returnType!!");
        a(localStringBuilder, paramt);
      }
    }
    paramt = localStringBuilder.toString();
    b.f.b.j.a(paramt, "StringBuilder().apply(builderAction).toString()");
    return paramt;
  }
  
  private static final void a(StringBuilder paramStringBuilder, b.i.b.a.c.l.w paramw)
  {
    paramStringBuilder.append(a(paramw));
  }
  
  public static final boolean a(b.i.b.a.c.b.a parama)
  {
    b.f.b.j.b(parama, "f");
    if (!(parama instanceof b.i.b.a.c.b.t)) {
      return false;
    }
    b.i.b.a.c.b.t localt = (b.i.b.a.c.b.t)parama;
    if ((localt.k().size() == 1) && (!b.i.b.a.c.d.a.t.e((b.i.b.a.c.b.b)parama)))
    {
      if ((b.f.b.j.a(localt.i().a, "remove") ^ true)) {
        return false;
      }
      parama = localt.w();
      b.f.b.j.a(parama, "f.original");
      parama = parama.k();
      b.f.b.j.a(parama, "f.original.valueParameters");
      parama = b.a.j.g(parama);
      b.f.b.j.a(parama, "f.original.valueParameters.single()");
      parama = ((au)parama).y();
      b.f.b.j.a(parama, "f.original.valueParameters.single().type");
      parama = a(parama);
      boolean bool = parama instanceof j.c;
      Object localObject = null;
      if (!bool) {
        parama = null;
      }
      j.c localc = (j.c)parama;
      parama = (b.i.b.a.c.b.a)localObject;
      if (localc != null) {
        parama = localc.a;
      }
      if (parama != c.e) {
        return false;
      }
      parama = b.i.b.a.c.d.a.d.a(localt);
      if (parama == null) {
        return false;
      }
      localObject = parama.w();
      b.f.b.j.a(localObject, "overridden.original");
      localObject = ((b.i.b.a.c.b.t)localObject).k();
      b.f.b.j.a(localObject, "overridden.original.valueParameters");
      localObject = b.a.j.g((List)localObject);
      b.f.b.j.a(localObject, "overridden.original.valueParameters.single()");
      localObject = ((au)localObject).y();
      b.f.b.j.a(localObject, "overridden.original.valueParameters.single().type");
      localObject = a((b.i.b.a.c.l.w)localObject);
      parama = parama.a();
      b.f.b.j.a(parama, "overridden.containingDeclaration");
      if ((b.f.b.j.a(b.i.b.a.c.i.c.a.a(parama), g.k.W.b)) && ((localObject instanceof j.b)) && (b.f.b.j.a(((j.b)localObject).a, "java/lang/Object"))) {
        return true;
      }
    }
    return false;
  }
  
  public static final String b(b.i.b.a.c.b.a parama)
  {
    b.f.b.j.b(parama, "receiver$0");
    Object localObject1 = t.a;
    if (b.i.b.a.c.i.d.b((b.i.b.a.c.b.l)parama)) {
      return null;
    }
    Object localObject2 = parama.a();
    localObject1 = localObject2;
    if (!(localObject2 instanceof e)) {
      localObject1 = null;
    }
    localObject2 = (e)localObject1;
    if (localObject2 == null) {
      return null;
    }
    localObject1 = ((e)localObject2).i();
    b.f.b.j.a(localObject1, "classDescriptor.name");
    if (((f)localObject1).b) {
      return null;
    }
    localObject1 = parama.k_();
    parama = (b.i.b.a.c.b.a)localObject1;
    if (!(localObject1 instanceof al)) {
      parama = null;
    }
    parama = (al)parama;
    if (parama == null) {
      return null;
    }
    return t.a((e)localObject2, a((b.i.b.a.c.b.t)parama, false, false, 3));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */