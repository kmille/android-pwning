package b.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@b.j(a={1, 1, 13}, b={"\0008\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\002\b\b\n\002\020(\n\002\b\002\n\002\020*\n\002\b\b\b'\030\000 \034*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\004\034\035\036\037B\007\b\004¢\006\002\020\004J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002J\026\020\r\032\0028\0002\006\020\016\032\0020\006H¦\002¢\006\002\020\017J\b\020\020\032\0020\006H\026J\025\020\021\032\0020\0062\006\020\022\032\0028\000H\026¢\006\002\020\023J\017\020\024\032\b\022\004\022\0028\0000\025H\002J\025\020\026\032\0020\0062\006\020\022\032\0028\000H\026¢\006\002\020\023J\016\020\027\032\b\022\004\022\0028\0000\030H\026J\026\020\027\032\b\022\004\022\0028\0000\0302\006\020\016\032\0020\006H\026J\036\020\031\032\b\022\004\022\0028\0000\0032\006\020\032\032\0020\0062\006\020\033\032\0020\006H\026R\022\020\005\032\0020\006X¦\004¢\006\006\032\004\b\007\020\b¨\006 "}, c={"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"})
public abstract class b<E>
  extends a<E>
  implements b.f.b.a.a, List<E>
{
  public static final a a = new a((byte)0);
  
  public void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == (b)this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    Object localObject = (Collection)this;
    paramObject = (Collection)paramObject;
    b.f.b.j.b(localObject, "c");
    b.f.b.j.b(paramObject, "other");
    if (((Collection)localObject).size() != ((Collection)paramObject).size()) {
      return false;
    }
    paramObject = ((Collection)paramObject).iterator();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      if ((b.f.b.j.a(((Iterator)localObject).next(), ((Iterator)paramObject).next()) ^ true)) {
        return false;
      }
    }
    return true;
  }
  
  public abstract E get(int paramInt);
  
  public int hashCode()
  {
    Object localObject1 = (Collection)this;
    b.f.b.j.b(localObject1, "c");
    localObject1 = ((Collection)localObject1).iterator();
    int j;
    for (int i = 1; ((Iterator)localObject1).hasNext(); i = i * 31 + j)
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if (localObject2 != null) {
        j = localObject2.hashCode();
      } else {
        j = 0;
      }
    }
    return i;
  }
  
  public int indexOf(Object paramObject)
  {
    Iterator localIterator = iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      if (b.f.b.j.a(localIterator.next(), paramObject)) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  public Iterator<E> iterator()
  {
    return (Iterator)new b();
  }
  
  public int lastIndexOf(Object paramObject)
  {
    ListIterator localListIterator = listIterator(size());
    while (localListIterator.hasPrevious()) {
      if (b.f.b.j.a(localListIterator.previous(), paramObject)) {
        return localListIterator.nextIndex();
      }
    }
    return -1;
  }
  
  public ListIterator<E> listIterator()
  {
    return (ListIterator)new c(0);
  }
  
  public ListIterator<E> listIterator(int paramInt)
  {
    return (ListIterator)new c(paramInt);
  }
  
  public E remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public List<E> subList(int paramInt1, int paramInt2)
  {
    return (List)new d(this, paramInt1, paramInt2);
  }
  
  @b.j(a={1, 1, 13}, b={"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\b\n\002\b\t\n\002\020\013\n\000\n\002\020\036\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\035\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\000¢\006\002\b\bJ\035\020\t\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\000¢\006\002\b\nJ%\020\013\032\0020\0042\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\007\032\0020\006H\000¢\006\002\b\016J%\020\017\032\0020\0202\n\020\021\032\006\022\002\b\0030\0222\n\020\023\032\006\022\002\b\0030\022H\000¢\006\002\b\024J\031\020\025\032\0020\0062\n\020\021\032\006\022\002\b\0030\022H\000¢\006\002\b\026¨\006\027"}, c={"Lkotlin/collections/AbstractList$Companion;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"})
  public static final class a {}
  
  @b.j(a={1, 1, 13}, b={"\000\034\n\002\030\002\n\002\020(\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\003\b\004\030\0002\b\022\004\022\0028\0000\001B\005¢\006\002\020\002J\t\020\t\032\0020\nH\002J\016\020\013\032\0028\000H\002¢\006\002\020\fR\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\b¨\006\r"}, c={"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
  class b
    implements b.f.b.a.a, Iterator<E>
  {
    int a;
    
    public boolean hasNext()
    {
      return this.a < this.b.size();
    }
    
    public E next()
    {
      if (hasNext())
      {
        b localb = this.b;
        int i = this.a;
        this.a = (i + 1);
        return (E)localb.get(i);
      }
      throw ((Throwable)new NoSuchElementException());
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020*\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\005\b\004\030\0002\f0\001R\b\022\004\022\0028\0000\0022\b\022\004\022\0028\0000\003B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\b\020\007\032\0020\bH\026J\b\020\t\032\0020\005H\026J\r\020\n\032\0028\000H\026¢\006\002\020\013J\b\020\f\032\0020\005H\026¨\006\r"}, c={"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"})
  final class c
    extends b<E>.b
    implements b.f.b.a.a, ListIterator<E>
  {
    public c()
    {
      super();
      b.a locala = b.a;
      int j = b.this.size();
      int i;
      if ((i >= 0) && (i <= j))
      {
        this.a = i;
        return;
      }
      this$1 = new StringBuilder("index: ");
      b.this.append(i);
      b.this.append(", size: ");
      b.this.append(j);
      throw ((Throwable)new IndexOutOfBoundsException(b.this.toString()));
    }
    
    public final void add(E paramE)
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean hasPrevious()
    {
      return this.a > 0;
    }
    
    public final int nextIndex()
    {
      return this.a;
    }
    
    public final E previous()
    {
      if (hasPrevious())
      {
        b localb = b.this;
        this.a -= 1;
        return (E)localb.get(this.a);
      }
      throw ((Throwable)new NoSuchElementException());
    }
    
    public final int previousIndex()
    {
      return this.a - 1;
    }
    
    public final void set(E paramE)
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
  
  @b.j(a={1, 1, 13}, b={"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\n\b\002\030\000*\006\b\001\020\001 \0012\b\022\004\022\002H\0010\0022\0060\003j\002`\004B#\022\f\020\005\032\b\022\004\022\0028\0010\002\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\026\020\016\032\0028\0012\006\020\017\032\0020\007H\002¢\006\002\020\020R\016\020\n\032\0020\007X\016¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0028\0010\002X\004¢\006\002\n\000R\024\020\013\032\0020\0078VX\004¢\006\006\032\004\b\f\020\r¨\006\021"}, c={"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"})
  static final class d<E>
    extends b<E>
    implements RandomAccess
  {
    private int b;
    private final b<E> c;
    private final int d;
    
    public d(b<? extends E> paramb, int paramInt1, int paramInt2)
    {
      this.c = paramb;
      this.d = paramInt1;
      paramInt1 = this.d;
      int i = this.c.size();
      if ((paramInt1 >= 0) && (paramInt2 <= i))
      {
        if (paramInt1 <= paramInt2)
        {
          this.b = (paramInt2 - this.d);
          return;
        }
        paramb = new StringBuilder("fromIndex: ");
        paramb.append(paramInt1);
        paramb.append(" > toIndex: ");
        paramb.append(paramInt2);
        throw ((Throwable)new IllegalArgumentException(paramb.toString()));
      }
      paramb = new StringBuilder("fromIndex: ");
      paramb.append(paramInt1);
      paramb.append(", toIndex: ");
      paramb.append(paramInt2);
      paramb.append(", size: ");
      paramb.append(i);
      throw ((Throwable)new IndexOutOfBoundsException(paramb.toString()));
    }
    
    public final int a()
    {
      return this.b;
    }
    
    public final E get(int paramInt)
    {
      int i = this.b;
      if ((paramInt >= 0) && (paramInt < i)) {
        return (E)this.c.get(this.d + paramInt);
      }
      StringBuilder localStringBuilder = new StringBuilder("index: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", size: ");
      localStringBuilder.append(i);
      throw ((Throwable)new IndexOutOfBoundsException(localStringBuilder.toString()));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */