package b.a;

import b.f.b.a.a;
import b.f.b.f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@b.j(a={1, 1, 13}, b={"\000\\\n\002\030\002\n\002\020 \n\002\020\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\036\n\002\b\002\n\002\020\000\n\002\b\006\n\002\020(\n\002\b\002\n\002\020*\n\002\b\005\n\002\020\016\n\000\bÀ\002\030\0002\b\022\004\022\0020\0020\0012\0060\003j\002`\0042\0060\005j\002`\006B\007\b\002¢\006\002\020\007J\021\020\016\032\0020\0172\006\020\020\032\0020\002H\002J\026\020\021\032\0020\0172\f\020\022\032\b\022\004\022\0020\0020\023H\026J\023\020\024\032\0020\0172\b\020\025\032\004\030\0010\026H\002J\021\020\027\032\0020\0022\006\020\030\032\0020\013H\002J\b\020\031\032\0020\013H\026J\020\020\032\032\0020\0132\006\020\020\032\0020\002H\026J\b\020\033\032\0020\017H\026J\017\020\034\032\b\022\004\022\0020\0020\035H\002J\020\020\036\032\0020\0132\006\020\020\032\0020\002H\026J\016\020\037\032\b\022\004\022\0020\0020 H\026J\026\020\037\032\b\022\004\022\0020\0020 2\006\020\030\032\0020\013H\026J\b\020!\032\0020\026H\002J\036\020\"\032\b\022\004\022\0020\0020\0012\006\020#\032\0020\0132\006\020$\032\0020\013H\026J\b\020%\032\0020&H\026R\016\020\b\032\0020\tXT¢\006\002\n\000R\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\r¨\006'"}, c={"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "readResolve", "subList", "fromIndex", "toIndex", "toString", "", "kotlin-stdlib"})
public final class v
  implements a, Serializable, List, RandomAccess
{
  public static final v a = new v();
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
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
    return ((paramObject instanceof List)) && (((List)paramObject).isEmpty());
  }
  
  public final int hashCode()
  {
    return 1;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return -1;
    }
    b.f.b.j.b((Void)paramObject, "element");
    return -1;
  }
  
  public final boolean isEmpty()
  {
    return true;
  }
  
  public final Iterator iterator()
  {
    return (Iterator)u.a;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return -1;
    }
    b.f.b.j.b((Void)paramObject, "element");
    return -1;
  }
  
  public final ListIterator listIterator()
  {
    return (ListIterator)u.a;
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    if (paramInt == 0) {
      return (ListIterator)u.a;
    }
    throw ((Throwable)new IndexOutOfBoundsException("Index: ".concat(String.valueOf(paramInt))));
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
  
  public final List subList(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return (List)this;
    }
    StringBuilder localStringBuilder = new StringBuilder("fromIndex: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", toIndex: ");
    localStringBuilder.append(paramInt2);
    throw ((Throwable)new IndexOutOfBoundsException(localStringBuilder.toString()));
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


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */