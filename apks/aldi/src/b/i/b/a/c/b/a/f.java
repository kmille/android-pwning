package b.i.b.a.c.b.a;

import b.f.b.j;
import b.f.b.k;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.ay;
import b.i.b.a.c.b.t;
import b.i.b.a.c.b.v;
import b.i.b.a.c.b.y;
import b.i.b.a.c.i.d;
import b.i.b.a.c.l.ad;
import b.w;
import java.util.Collection;
import java.util.Iterator;

public final class f
{
  private static final b.i.b.a.c.f.f a;
  private static final b.i.b.a.c.f.f b;
  private static final b.i.b.a.c.f.f c;
  private static final b.i.b.a.c.f.f d;
  private static final b.i.b.a.c.f.f e;
  private static final b.i.b.a.c.f.b f = new b.i.b.a.c.f.b("kotlin.internal.InlineOnly");
  
  static
  {
    b.i.b.a.c.f.f localf = b.i.b.a.c.f.f.a("message");
    j.a(localf, "Name.identifier(\"message\")");
    a = localf;
    localf = b.i.b.a.c.f.f.a("replaceWith");
    j.a(localf, "Name.identifier(\"replaceWith\")");
    b = localf;
    localf = b.i.b.a.c.f.f.a("level");
    j.a(localf, "Name.identifier(\"level\")");
    c = localf;
    localf = b.i.b.a.c.f.f.a("expression");
    j.a(localf, "Name.identifier(\"expression\")");
    d = localf;
    localf = b.i.b.a.c.f.f.a("imports");
    j.a(localf, "Name.identifier(\"imports\")");
    e = localf;
  }
  
  private static final boolean a(b.i.b.a.c.b.b paramb)
  {
    paramb = paramb.f();
    j.a(paramb, "typeParameters");
    paramb = (Iterable)paramb;
    if ((!(paramb instanceof Collection)) || (!((Collection)paramb).isEmpty()))
    {
      paramb = paramb.iterator();
      while (paramb.hasNext())
      {
        ar localar = (ar)paramb.next();
        j.a(localar, "it");
        if (localar.l()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static final boolean a(v paramv)
  {
    j.b(paramv, "receiver$0");
    j.b(paramv, "receiver$0");
    Object localObject;
    if ((paramv instanceof b.i.b.a.c.b.b))
    {
      localObject = (b.i.b.a.c.b.b)paramv;
      if (!a((b.i.b.a.c.b.b)localObject))
      {
        b.i.b.a.c.b.b localb = d.b((b.i.b.a.c.b.b)localObject);
        j.a(localb, "DescriptorUtils.getDirectMember(this)");
        if (!a(localb))
        {
          j.b(paramv, "receiver$0");
          if ((paramv instanceof t)) {
            if (!b((b.i.b.a.c.b.b)localObject))
            {
              localObject = d.b((b.i.b.a.c.b.b)localObject);
              j.a(localObject, "DescriptorUtils.getDirectMember(this)");
              if (!b((b.i.b.a.c.b.b)localObject)) {}
            }
            else
            {
              boolean bool = ((t)paramv).b();
              if ((w.a) && (!bool)) {
                throw ((Throwable)new AssertionError("Function is not inline: ".concat(String.valueOf(paramv))));
              }
              i = 1;
              break label143;
            }
          }
          i = 0;
          label143:
          if (i == 0) {
            break label152;
          }
        }
      }
      i = 1;
      break label154;
    }
    label152:
    int i = 0;
    label154:
    if (i == 0)
    {
      if ((paramv instanceof t))
      {
        paramv = (t)paramv;
        if ((paramv.C()) && (paramv.b()))
        {
          localObject = paramv.k();
          j.a(localObject, "valueParameters");
          localObject = (Iterable)localObject;
          if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
          {
            localObject = ((Iterable)localObject).iterator();
            while (((Iterator)localObject).hasNext()) {
              if (((au)((Iterator)localObject).next()).p())
              {
                i = 1;
                break label265;
              }
            }
          }
          i = 0;
          label265:
          if (i != 0) {
            break label288;
          }
          if (j.a(paramv.j(), ay.a)) {
            return true;
          }
        }
      }
      return false;
    }
    label288:
    return true;
  }
  
  private static final boolean b(b.i.b.a.c.b.b paramb)
  {
    return paramb.r().b(f);
  }
  
  static final class a
    extends k
    implements b.f.a.b<y, ad>
  {
    a(b.i.b.a.c.a.g paramg)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */