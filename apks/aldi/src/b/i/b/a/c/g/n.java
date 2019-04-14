package b.i.b.a.c.g;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class n
  extends AbstractList<String>
  implements o, RandomAccess
{
  public static final o a = new n().b();
  private final List<Object> b;
  
  public n()
  {
    this.b = new ArrayList();
  }
  
  public n(o paramo)
  {
    this.b = new ArrayList(paramo.size());
    addAll(paramo);
  }
  
  private static String a(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof d)) {
      return ((d)paramObject).e();
    }
    return j.b((byte[])paramObject);
  }
  
  public final d a(int paramInt)
  {
    Object localObject = this.b.get(paramInt);
    d locald;
    if ((localObject instanceof d)) {
      locald = (d)localObject;
    } else if ((localObject instanceof String)) {
      locald = d.a((String)localObject);
    } else {
      locald = d.a((byte[])localObject);
    }
    if (locald != localObject) {
      this.b.set(paramInt, locald);
    }
    return locald;
  }
  
  public final List<?> a()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public final void a(d paramd)
  {
    this.b.add(paramd);
    this.modCount += 1;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection)
  {
    Object localObject = paramCollection;
    if ((paramCollection instanceof o)) {
      localObject = ((o)paramCollection).a();
    }
    boolean bool = this.b.addAll(paramInt, (Collection)localObject);
    this.modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection<? extends String> paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final o b()
  {
    return new x(this);
  }
  
  public final void clear()
  {
    this.b.clear();
    this.modCount += 1;
  }
  
  public final int size()
  {
    return this.b.size();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/g/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */