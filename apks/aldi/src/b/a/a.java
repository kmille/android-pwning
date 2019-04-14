package b.a;

import b.f.a.b;
import b.f.b.f;
import b.f.b.k;
import b.r;
import java.util.Collection;
import java.util.Iterator;

@b.j(a={1, 1, 13}, b={"\0006\n\002\030\002\n\000\n\002\020\036\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020(\n\000\n\002\020\021\n\002\020\000\n\002\b\005\n\002\020\016\n\000\b'\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002B\007\b\004¢\006\002\020\003J\026\020\b\032\0020\t2\006\020\n\032\0028\000H\002¢\006\002\020\013J\026\020\f\032\0020\t2\f\020\r\032\b\022\004\022\0028\0000\002H\026J\b\020\016\032\0020\tH\026J\017\020\017\032\b\022\004\022\0028\0000\020H¦\002J\025\020\021\032\n\022\006\022\004\030\0010\0230\022H\024¢\006\002\020\024J'\020\021\032\b\022\004\022\002H\0250\022\"\004\b\001\020\0252\f\020\026\032\b\022\004\022\002H\0250\022H\024¢\006\002\020\027J\b\020\030\032\0020\031H\026R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007¨\006\032"}, c={"Lkotlin/collections/AbstractCollection;", "E", "", "()V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "kotlin-stdlib"})
public abstract class a<E>
  implements b.f.b.a.a, Collection<E>
{
  public abstract int a();
  
  public boolean add(E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains(Object paramObject)
  {
    if (!((Collection)this).isEmpty())
    {
      Iterator localIterator = iterator();
      while (localIterator.hasNext()) {
        if (b.f.b.j.a(localIterator.next(), paramObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean containsAll(Collection<? extends Object> paramCollection)
  {
    b.f.b.j.b(paramCollection, "elements");
    paramCollection = (Iterable)paramCollection;
    if (!((Collection)paramCollection).isEmpty())
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
    }
    return true;
  }
  
  public boolean isEmpty()
  {
    return size() == 0;
  }
  
  public boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final int size()
  {
    return a();
  }
  
  public Object[] toArray()
  {
    return f.a((Collection)this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    b.f.b.j.b(paramArrayOfT, "array");
    paramArrayOfT = f.a((Collection)this, paramArrayOfT);
    if (paramArrayOfT != null) {
      return paramArrayOfT;
    }
    throw new r("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  public String toString()
  {
    return j.a(this, (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", 0, null, (b)new a(this), 24);
  }
  
  @b.j(a={1, 1, 13}, b={"\000\n\n\000\n\002\020\r\n\002\b\004\020\000\032\0020\001\"\006\b\000\020\002 \0012\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, c={"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"})
  static final class a
    extends k
    implements b<E, CharSequence>
  {
    a(a parama)
    {
      super();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */