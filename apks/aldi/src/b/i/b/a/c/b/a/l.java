package b.i.b.a.c.b.a;

import b.f.b.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class l
  implements g
{
  private final g b;
  private final b.f.a.b<b.i.b.a.c.f.b, Boolean> c;
  
  public l(g paramg, b.f.a.b<? super b.i.b.a.c.f.b, Boolean> paramb)
  {
    this.b = paramg;
    this.c = paramb;
  }
  
  private final boolean a(c paramc)
  {
    paramc = paramc.b();
    return (paramc != null) && (((Boolean)this.c.a(paramc)).booleanValue());
  }
  
  public final c a(b.i.b.a.c.f.b paramb)
  {
    j.b(paramb, "fqName");
    if (((Boolean)this.c.a(paramb)).booleanValue()) {
      return this.b.a(paramb);
    }
    return null;
  }
  
  public final boolean a()
  {
    Object localObject = (Iterable)this.b;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        c localc = (c)((Iterator)localObject).next();
        if (((l)this).a(localc)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean b(b.i.b.a.c.f.b paramb)
  {
    j.b(paramb, "fqName");
    if (((Boolean)this.c.a(paramb)).booleanValue()) {
      return this.b.b(paramb);
    }
    return false;
  }
  
  public final Iterator<c> iterator()
  {
    Object localObject1 = (Iterable)this.b;
    Collection localCollection = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      c localc = (c)localObject2;
      if (((l)this).a(localc)) {
        localCollection.add(localObject2);
      }
    }
    return ((List)localCollection).iterator();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */