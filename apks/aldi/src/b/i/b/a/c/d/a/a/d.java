package b.i.b.a.c.d.a.a;

import b.a.ac;
import b.a.x;
import b.f.b.k;
import b.i.b.a.c.a.g;
import b.i.b.a.c.a.g.a;
import b.i.b.a.c.b.a.n;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.a;
import b.i.b.a.c.i.b.i;
import b.i.b.a.c.l.w;
import b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
{
  public static final d a = new d();
  private static final Map<String, EnumSet<n>> b = ac.a(new b.m[] { q.a("PACKAGE", EnumSet.noneOf(n.class)), q.a("TYPE", EnumSet.of((Enum)n.a, (Enum)n.n)), q.a("ANNOTATION_TYPE", EnumSet.of((Enum)n.b)), q.a("TYPE_PARAMETER", EnumSet.of((Enum)n.c)), q.a("FIELD", EnumSet.of((Enum)n.e)), q.a("LOCAL_VARIABLE", EnumSet.of((Enum)n.f)), q.a("PARAMETER", EnumSet.of((Enum)n.g)), q.a("CONSTRUCTOR", EnumSet.of((Enum)n.h)), q.a("METHOD", EnumSet.of((Enum)n.i, (Enum)n.j, (Enum)n.k)), q.a("TYPE_USE", EnumSet.of((Enum)n.l)) });
  private static final Map<String, b.i.b.a.c.b.a.m> c = ac.a(new b.m[] { q.a("RUNTIME", b.i.b.a.c.b.a.m.a), q.a("CLASS", b.i.b.a.c.b.a.m.b), q.a("SOURCE", b.i.b.a.c.b.a.m.c) });
  
  public static b.i.b.a.c.i.b.f<?> a(b.i.b.a.c.d.a.e.b paramb)
  {
    boolean bool = paramb instanceof b.i.b.a.c.d.a.e.m;
    b.i.b.a.c.f.f localf = null;
    if (!bool) {
      paramb = null;
    }
    b.i.b.a.c.d.a.e.m localm = (b.i.b.a.c.d.a.e.m)paramb;
    paramb = localf;
    if (localm != null)
    {
      Object localObject = c;
      paramb = localm.c();
      if (paramb != null) {
        paramb = paramb.a;
      } else {
        paramb = null;
      }
      localObject = (b.i.b.a.c.b.a.m)((Map)localObject).get(paramb);
      paramb = localf;
      if (localObject != null)
      {
        paramb = a.a(g.k.G);
        b.f.b.j.a(paramb, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
        localf = b.i.b.a.c.f.f.a(((b.i.b.a.c.b.a.m)localObject).name());
        b.f.b.j.a(localf, "Name.identifier(retention.name)");
        paramb = new i(paramb, localf);
      }
    }
    return (b.i.b.a.c.i.b.f)paramb;
  }
  
  public static b.i.b.a.c.i.b.f<?> a(List<? extends b.i.b.a.c.d.a.e.b> paramList)
  {
    b.f.b.j.b(paramList, "arguments");
    Object localObject1 = (Iterable)paramList;
    paramList = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof b.i.b.a.c.d.a.e.m)) {
        paramList.add(localObject2);
      }
    }
    paramList = (Iterable)paramList;
    localObject1 = (Collection)new ArrayList();
    Object localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramList = ((b.i.b.a.c.d.a.e.m)((Iterator)localObject2).next()).c();
      if (paramList != null) {
        paramList = paramList.a;
      } else {
        paramList = null;
      }
      paramList = (EnumSet)b.get(paramList);
      if (paramList != null) {}
      for (;;)
      {
        paramList = (Set)paramList;
        break;
        paramList = x.a;
      }
      b.a.j.a((Collection)localObject1, (Iterable)paramList);
    }
    localObject1 = (Iterable)localObject1;
    paramList = (Collection)new ArrayList(b.a.j.a((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject3 = (n)((Iterator)localObject1).next();
      localObject2 = a.a(g.k.F);
      b.f.b.j.a(localObject2, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
      localObject3 = b.i.b.a.c.f.f.a(((n)localObject3).name());
      b.f.b.j.a(localObject3, "Name.identifier(kotlinTarget.name)");
      paramList.add(new i((a)localObject2, (b.i.b.a.c.f.f)localObject3));
    }
    return (b.i.b.a.c.i.b.f)new b.i.b.a.c.i.b.b((List)paramList, (b.f.a.b)a.a);
  }
  
  static final class a
    extends k
    implements b.f.a.b<y, w>
  {
    public static final a a = new a();
    
    a()
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */