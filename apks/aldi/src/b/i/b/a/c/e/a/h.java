package b.i.b.a.c.e.a;

import b.i.b.a.c.e.a.aa;
import b.i.b.a.c.e.a.aa.c;
import b.i.b.a.c.e.a.ag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h
{
  private final List<a.aa> a;
  
  public h(a.ag paramag)
  {
    Object localObject = paramag.b;
    if (paramag.c())
    {
      int j = paramag.c;
      paramag = paramag.b;
      b.f.b.j.a(paramag, "typeTable.typeList");
      paramag = (Iterable)paramag;
      Collection localCollection = (Collection)new ArrayList(b.a.j.a(paramag));
      int i = 0;
      Iterator localIterator = paramag.iterator();
      while (localIterator.hasNext())
      {
        paramag = localIterator.next();
        if (i < 0) {
          b.a.j.a();
        }
        localObject = (a.aa)paramag;
        paramag = (a.ag)localObject;
        if (i >= j) {
          paramag = ((a.aa)localObject).v().a(true).g();
        }
        localCollection.add(paramag);
        i += 1;
      }
      paramag = (List)localCollection;
    }
    else
    {
      b.f.b.j.a(localObject, "originalTypes");
      paramag = (a.ag)localObject;
    }
    this.a = paramag;
  }
  
  public final a.aa a(int paramInt)
  {
    return (a.aa)this.a.get(paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */