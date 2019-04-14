package b.i.b.a.c.n;

import b.a.ac;
import b.a.e;
import b.f.b.a.d;
import b.f.b.b;
import b.f.b.j;
import b.f.b.y;
import b.r;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public final class i<T>
  extends AbstractSet<T>
{
  public static final b a = new b((byte)0);
  private static final int d = 5;
  private Object b;
  private int c;
  
  public static final <T> i<T> a()
  {
    return b.a();
  }
  
  public final boolean add(T paramT)
  {
    if (size() == 0)
    {
      this.b = paramT;
    }
    else
    {
      if (size() == 1)
      {
        if (j.a(this.b, paramT)) {
          return false;
        }
        localObject = new Object[2];
        localObject[0] = this.b;
        localObject[1] = paramT;
        paramT = (T)localObject;
      }
      for (;;)
      {
        this.b = paramT;
        break label212;
        if (size() >= d) {
          break label188;
        }
        localObject = this.b;
        if (localObject == null) {
          break;
        }
        localObject = (Object[])localObject;
        if (e.a((Object[])localObject, paramT)) {
          return false;
        }
        if (size() == d - 1)
        {
          localObject = Arrays.copyOf((Object[])localObject, localObject.length);
          j.b(localObject, "elements");
          localObject = (LinkedHashSet)e.a((Object[])localObject, (Collection)new LinkedHashSet(ac.a(localObject.length)));
          ((LinkedHashSet)localObject).add(paramT);
          paramT = (T)localObject;
        }
        else
        {
          localObject = Arrays.copyOf((Object[])localObject, size() + 1);
          localObject[(localObject.length - 1)] = paramT;
          paramT = (T)localObject;
        }
      }
      throw new r("null cannot be cast to non-null type kotlin.Array<T>");
      label188:
      Object localObject = this.b;
      if (localObject == null) {
        break label224;
      }
      if (!y.a(localObject).add(paramT)) {
        return false;
      }
    }
    label212:
    this.c = (size() + 1);
    return true;
    label224:
    throw new r("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
  }
  
  public final void clear()
  {
    this.b = null;
    this.c = 0;
  }
  
  public final boolean contains(Object paramObject)
  {
    if (size() == 0) {
      return false;
    }
    if (size() == 1) {
      return j.a(this.b, paramObject);
    }
    if (size() < d)
    {
      localObject = this.b;
      if (localObject != null) {
        return e.a((Object[])localObject, paramObject);
      }
      throw new r("null cannot be cast to non-null type kotlin.Array<T>");
    }
    Object localObject = this.b;
    if (localObject != null) {
      return ((Set)localObject).contains(paramObject);
    }
    throw new r("null cannot be cast to non-null type kotlin.collections.Set<T>");
  }
  
  public final Iterator<T> iterator()
  {
    if (size() == 0) {
      return Collections.emptySet().iterator();
    }
    if (size() == 1) {
      return (Iterator)new c(this.b);
    }
    if (size() < d)
    {
      localObject = this.b;
      if (localObject != null) {
        return (Iterator)new a((Object[])localObject);
      }
      throw new r("null cannot be cast to non-null type kotlin.Array<T>");
    }
    Object localObject = this.b;
    if (localObject != null) {
      return y.a(localObject).iterator();
    }
    throw new r("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
  }
  
  static final class a<T>
    implements d, Iterator<T>
  {
    private final Iterator<T> a;
    
    public a(T[] paramArrayOfT)
    {
      this.a = b.a(paramArrayOfT);
    }
    
    public final boolean hasNext()
    {
      return this.a.hasNext();
    }
    
    public final T next()
    {
      return (T)this.a.next();
    }
  }
  
  public static final class b
  {
    public static <T> i<T> a()
    {
      return new i((byte)0);
    }
  }
  
  static final class c<T>
    implements d, Iterator<T>
  {
    private boolean a;
    private final T b;
    
    public c(T paramT)
    {
      this.b = paramT;
      this.a = true;
    }
    
    public final boolean hasNext()
    {
      return this.a;
    }
    
    public final T next()
    {
      if (this.a)
      {
        this.a = false;
        return (T)this.b;
      }
      throw ((Throwable)new NoSuchElementException());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */