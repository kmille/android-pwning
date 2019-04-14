package b.i.b.a.c.d.a.c;

import b.f.b.j;
import b.i.b.a.c.b.a.c;
import b.i.b.a.c.d.a.e.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  public static final d a(h paramh, b.i.b.a.c.b.a.g paramg)
  {
    j.b(paramh, "receiver$0");
    j.b(paramg, "additionalAnnotations");
    if (paramh.c.p.a) {
      return paramh.a();
    }
    paramg = (Iterable)paramg;
    Object localObject2 = (Collection)new ArrayList();
    Object localObject3 = paramg.iterator();
    int j;
    b.i.b.a.c.d.a.f.h localh;
    for (;;)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      j = 0;
      i = 0;
      if (!bool) {
        break;
      }
      localObject1 = (c)((Iterator)localObject3).next();
      Object localObject4 = paramh.c.p;
      j.b(localObject1, "annotationDescriptor");
      bool = ((b.i.b.a.c.d.a.a)localObject4).b.a();
      localh = null;
      if (bool) {}
      Object localObject5;
      Object localObject6;
      do
      {
        do
        {
          paramg = null;
          break;
          paramg = (k)b.i.b.a.c.d.a.b.b().get(((c)localObject1).b());
        } while (paramg == null);
        localObject5 = paramg.a;
        localObject6 = paramg.b;
        paramg = ((b.i.b.a.c.d.a.a)localObject4).c((c)localObject1);
        if (paramg != b.i.b.a.c.n.g.a) {
          i = 1;
        }
        if (i == 0) {
          paramg = null;
        }
      } while (paramg == null);
      paramg = new k(b.i.b.a.c.d.a.f.h.a((b.i.b.a.c.d.a.f.h)localObject5, paramg.a()), (Collection)localObject6);
      if (paramg == null)
      {
        paramg = ((b.i.b.a.c.d.a.a)localObject4).b((c)localObject1);
        if (paramg == null)
        {
          paramg = localh;
        }
        else
        {
          localObject6 = paramg.a;
          localObject5 = paramg.a();
          paramg = ((b.i.b.a.c.d.a.a)localObject4).d((c)localObject1);
          localObject1 = paramg;
          if (paramg == null) {
            localObject1 = ((b.i.b.a.c.d.a.a)localObject4).c((c)localObject6);
          }
          if (((b.i.b.a.c.n.g)localObject1).b())
          {
            paramg = localh;
          }
          else
          {
            localObject4 = paramh.c.q.a((c)localObject6);
            paramg = localh;
            if (localObject4 != null)
            {
              paramg = b.i.b.a.c.d.a.f.h.a((b.i.b.a.c.d.a.f.h)localObject4, ((b.i.b.a.c.n.g)localObject1).a());
              if (paramg == null) {
                paramg = localh;
              } else {
                paramg = new k(paramg, (Collection)localObject5);
              }
            }
          }
        }
      }
      if (paramg != null) {
        ((Collection)localObject2).add(paramg);
      }
    }
    Object localObject1 = (List)localObject2;
    if (((List)localObject1).isEmpty()) {
      return paramh.a();
    }
    paramg = paramh.a();
    if (paramg != null)
    {
      paramg = paramg.a;
      if (paramg != null)
      {
        paramg = new EnumMap(paramg);
        break label421;
      }
    }
    paramg = new EnumMap(b.i.b.a.c.d.a.a.a.class);
    label421:
    localObject1 = ((List)localObject1).iterator();
    int i = j;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (k)((Iterator)localObject1).next();
      localh = ((k)localObject2).a;
      localObject2 = ((k)localObject2).b.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (b.i.b.a.c.d.a.a.a)((Iterator)localObject2).next();
        ((Map)paramg).put(localObject3, localh);
        i = 1;
      }
    }
    if (i == 0) {
      return paramh.a();
    }
    return new d(paramg);
  }
  
  public static final h a(h paramh, b.i.b.a.c.b.l paraml, x paramx, int paramInt)
  {
    j.b(paramh, "receiver$0");
    j.b(paraml, "containingDeclaration");
    j.b(paramx, "typeParameterOwner");
    return a(paramh, paraml, paramx, paramInt, paramh.e);
  }
  
  private static final h a(h paramh, b.i.b.a.c.b.l paraml, x paramx, int paramInt, b.d<d> paramd)
  {
    b localb = paramh.c;
    if (paramx != null) {
      paramh = (m)new i(paramh, paraml, paramx, paramInt);
    } else {
      paramh = paramh.d;
    }
    return new h(localb, paramh, paramd);
  }
  
  public static final h b(h paramh, final b.i.b.a.c.b.a.g paramg)
  {
    j.b(paramh, "receiver$0");
    j.b(paramg, "additionalAnnotations");
    if (paramg.a()) {
      return paramh;
    }
    return new h(paramh.c, paramh.d, b.e.a(b.i.c, (b.f.a.a)new b(paramh, paramg)));
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.a<d>
  {
    a(h paramh, b.i.b.a.c.b.g paramg)
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.a<d>
  {
    b(h paramh, b.i.b.a.c.b.a.g paramg)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */