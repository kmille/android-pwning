package b.i.b.a.c.b.c;

import b.a.v;
import b.f.b.j;
import b.i.b.a.c.b.ad;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.y;
import b.i.b.a.c.f.c;
import b.i.b.a.c.f.f;
import b.i.b.a.c.i.e.c.b;
import b.i.b.a.c.i.e.d;
import b.i.b.a.c.i.e.i;
import b.i.b.a.c.n.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ae
  extends i
{
  private final y a;
  private final b.i.b.a.c.f.b b;
  
  public ae(y paramy, b.i.b.a.c.f.b paramb)
  {
    this.a = paramy;
    this.b = paramb;
  }
  
  public final Collection<l> a(d paramd, b.f.a.b<? super f, Boolean> paramb)
  {
    j.b(paramd, "kindFilter");
    j.b(paramb, "nameFilter");
    Object localObject1 = d.m;
    if (!paramd.a(d.e())) {}
    while ((this.b.b.a.isEmpty()) && (paramd.b.contains(c.b.a))) {
      return (Collection)v.a;
    }
    paramd = this.a.a(this.b, paramb);
    ArrayList localArrayList = new ArrayList(paramd.size());
    Iterator localIterator = paramd.iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = ((b.i.b.a.c.f.b)localIterator.next()).b.d();
      j.a(localObject2, "subFqName.shortName()");
      if (((Boolean)paramb.a(localObject2)).booleanValue())
      {
        Collection localCollection = (Collection)localArrayList;
        j.b(localObject2, "name");
        boolean bool = ((f)localObject2).b;
        paramd = null;
        if (!bool)
        {
          localObject1 = this.a;
          localObject2 = this.b.a((f)localObject2);
          j.a(localObject2, "fqName.child(name)");
          localObject1 = ((y)localObject1).a((b.i.b.a.c.f.b)localObject2);
          if (!((ad)localObject1).g()) {
            paramd = (d)localObject1;
          }
        }
        a.a(localCollection, paramd);
      }
    }
    return (Collection)localArrayList;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */