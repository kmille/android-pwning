package b.a;

import b.f.b.a.a;
import b.f.b.b;
import b.f.b.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@b.j(a={1, 1, 13}, b={"\000.\n\002\030\002\n\000\n\002\020\036\n\000\n\002\020\021\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\f\n\002\020(\n\000\n\002\020\000\n\000\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\035\022\016\020\003\032\n\022\006\b\001\022\0028\0000\004\022\006\020\005\032\0020\006¢\006\002\020\007J\026\020\020\032\0020\0062\006\020\021\032\0028\000H\002¢\006\002\020\022J\026\020\023\032\0020\0062\f\020\024\032\b\022\004\022\0028\0000\002H\026J\b\020\025\032\0020\006H\026J\017\020\026\032\b\022\004\022\0028\0000\027H\002J\025\020\030\032\f\022\b\b\001\022\004\030\0010\0310\004¢\006\002\020\016R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\005\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\033\020\003\032\n\022\006\b\001\022\0028\0000\004¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\032"}, c={"Lkotlin/collections/ArrayAsCollection;", "T", "", "values", "", "isVarargs", "", "([Ljava/lang/Object;Z)V", "()Z", "size", "", "getSize", "()I", "getValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "contains", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "isEmpty", "iterator", "", "toArray", "", "kotlin-stdlib"})
final class d<T>
  implements a, Collection<T>
{
  private final T[] a;
  private final boolean b;
  
  public d(T[] paramArrayOfT)
  {
    this.a = paramArrayOfT;
    this.b = false;
  }
  
  public final boolean add(T paramT)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection<? extends T> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean contains(Object paramObject)
  {
    return e.a(this.a, paramObject);
  }
  
  public final boolean containsAll(Collection<? extends Object> paramCollection)
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
  
  public final boolean isEmpty()
  {
    return this.a.length == 0;
  }
  
  public final Iterator<T> iterator()
  {
    return b.a(this.a);
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final Object[] toArray()
  {
    Object[] arrayOfObject = this.a;
    boolean bool = this.b;
    b.f.b.j.b(arrayOfObject, "receiver$0");
    if ((bool) && (b.f.b.j.a(arrayOfObject.getClass(), Object[].class))) {
      return arrayOfObject;
    }
    arrayOfObject = Arrays.copyOf(arrayOfObject, arrayOfObject.length, Object[].class);
    b.f.b.j.a(arrayOfObject, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return f.a(this, paramArrayOfT);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */