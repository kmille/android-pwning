package b.a;

import b.f.b.a.a;
import b.f.b.f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@b.j(a={1, 1, 13}, b={"\000L\n\002\030\002\n\002\020\"\n\002\020\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\036\n\002\b\002\n\002\020\000\n\002\b\003\n\002\020(\n\002\b\002\n\002\020\016\n\000\bÀ\002\030\0002\b\022\004\022\0020\0020\0012\0060\003j\002`\004B\007\b\002¢\006\002\020\005J\021\020\f\032\0020\r2\006\020\016\032\0020\002H\002J\026\020\017\032\0020\r2\f\020\020\032\b\022\004\022\0020\0020\021H\026J\023\020\022\032\0020\r2\b\020\023\032\004\030\0010\024H\002J\b\020\025\032\0020\tH\026J\b\020\026\032\0020\rH\026J\017\020\027\032\b\022\004\022\0020\0020\030H\002J\b\020\031\032\0020\024H\002J\b\020\032\032\0020\033H\026R\016\020\006\032\0020\007XT¢\006\002\n\000R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\034"}, c={"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "readResolve", "toString", "", "kotlin-stdlib"})
public final class x
  implements a, Serializable, Set
{
  public static final x a = new x();
  
  public final boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return false;
    }
    b.f.b.j.b((Void)paramObject, "element");
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    b.f.b.j.b(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Set)) && (((Set)paramObject).isEmpty());
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  public final boolean isEmpty()
  {
    return true;
  }
  
  public final Iterator iterator()
  {
    return (Iterator)u.a;
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final Object[] toArray()
  {
    return f.a(this);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return f.a(this, paramArrayOfT);
  }
  
  public final String toString()
  {
    return "[]";
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */