package b.i.b.a.c.b.c;

import b.i.b.a.c.b.ab;
import b.i.b.a.c.b.ac;
import b.i.b.a.c.f.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class i
  implements ac
{
  private final List<ac> a;
  
  public i(List<? extends ac> paramList)
  {
    this.a = paramList;
  }
  
  public final Collection<b.i.b.a.c.f.b> a(b.i.b.a.c.f.b paramb, b.f.a.b<? super f, Boolean> paramb1)
  {
    b.f.b.j.b(paramb, "fqName");
    b.f.b.j.b(paramb1, "nameFilter");
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localHashSet.addAll(((ac)localIterator.next()).a(paramb, paramb1));
    }
    return (Collection)localHashSet;
  }
  
  public final List<ab> a(b.i.b.a.c.f.b paramb)
  {
    b.f.b.j.b(paramb, "fqName");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localArrayList.addAll((Collection)((ac)localIterator.next()).a(paramb));
    }
    return b.a.j.i((Iterable)localArrayList);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */