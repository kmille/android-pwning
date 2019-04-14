package b.i.b.a.c.i.b;

import b.i.b.a.c.b.y;
import b.i.b.a.c.l.ad;
import b.i.b.a.c.l.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class g
{
  public static final g a = new g();
  
  private final b a(List<?> paramList, b.i.b.a.c.a.h paramh)
  {
    Object localObject1 = (Iterable)b.a.j.i((Iterable)paramList);
    paramList = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      localObject2 = ((g)this).a(localObject2);
      if (localObject2 != null) {
        paramList.add(localObject2);
      }
    }
    return new b((List)paramList, (b.f.a.b)new b(paramh));
  }
  
  public static b a(List<? extends f<?>> paramList, w paramw)
  {
    b.f.b.j.b(paramList, "value");
    b.f.b.j.b(paramw, "type");
    return new b(paramList, (b.f.a.b)new a(paramw));
  }
  
  public final f<?> a(Object paramObject)
  {
    if ((paramObject instanceof Byte)) {
      paramObject = new d(((Number)paramObject).byteValue());
    }
    for (;;)
    {
      return (f)paramObject;
      if ((paramObject instanceof Short))
      {
        paramObject = new r(((Number)paramObject).shortValue());
      }
      else if ((paramObject instanceof Integer))
      {
        paramObject = new l(((Number)paramObject).intValue());
      }
      else if ((paramObject instanceof Long))
      {
        paramObject = new p(((Number)paramObject).longValue());
      }
      else if ((paramObject instanceof Character))
      {
        paramObject = new e(((Character)paramObject).charValue());
      }
      else if ((paramObject instanceof Float))
      {
        paramObject = new k(((Number)paramObject).floatValue());
      }
      else if ((paramObject instanceof Double))
      {
        paramObject = new h(((Number)paramObject).doubleValue());
      }
      else if ((paramObject instanceof Boolean))
      {
        paramObject = new c(((Boolean)paramObject).booleanValue());
      }
      else
      {
        if (!(paramObject instanceof String)) {
          break;
        }
        paramObject = new s((String)paramObject);
      }
    }
    List localList;
    if ((paramObject instanceof byte[]))
    {
      localList = b.a.e.a((byte[])paramObject);
      paramObject = b.i.b.a.c.a.h.c;
    }
    for (paramObject = a(localList, (b.i.b.a.c.a.h)paramObject);; paramObject = new q())
    {
      return (f)paramObject;
      if ((paramObject instanceof short[]))
      {
        localList = b.a.e.a((short[])paramObject);
        paramObject = b.i.b.a.c.a.h.d;
        break;
      }
      if ((paramObject instanceof int[]))
      {
        localList = b.a.e.b((int[])paramObject);
        paramObject = b.i.b.a.c.a.h.e;
        break;
      }
      if ((paramObject instanceof long[]))
      {
        localList = b.a.e.a((long[])paramObject);
        paramObject = b.i.b.a.c.a.h.g;
        break;
      }
      if ((paramObject instanceof char[]))
      {
        localList = b.a.e.b((char[])paramObject);
        paramObject = b.i.b.a.c.a.h.b;
        break;
      }
      if ((paramObject instanceof float[]))
      {
        localList = b.a.e.a((float[])paramObject);
        paramObject = b.i.b.a.c.a.h.f;
        break;
      }
      if ((paramObject instanceof double[]))
      {
        localList = b.a.e.a((double[])paramObject);
        paramObject = b.i.b.a.c.a.h.h;
        break;
      }
      if ((paramObject instanceof boolean[]))
      {
        localList = b.a.e.a((boolean[])paramObject);
        paramObject = b.i.b.a.c.a.h.a;
        break;
      }
      if (paramObject != null) {
        break label424;
      }
    }
    label424:
    return null;
  }
  
  static final class a
    extends b.f.b.k
    implements b.f.a.b<y, w>
  {
    a(w paramw)
    {
      super();
    }
  }
  
  static final class b
    extends b.f.b.k
    implements b.f.a.b<y, ad>
  {
    b(b.i.b.a.c.a.h paramh)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */