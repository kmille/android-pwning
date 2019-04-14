package com.google.common.collect;

import com.google.common.base.g;
import com.google.common.base.j;
import com.google.common.c.a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import javax.annotation.Nullable;

public final class Lists
{
  public static <E> ArrayList<E> a()
  {
    return new ArrayList();
  }
  
  public static <E> ArrayList<E> a(Iterable<? extends E> paramIterable)
  {
    j.a(paramIterable);
    if ((paramIterable instanceof Collection)) {
      return new ArrayList((Collection)paramIterable);
    }
    paramIterable = paramIterable.iterator();
    ArrayList localArrayList = new ArrayList();
    o.a(localArrayList, paramIterable);
    return localArrayList;
  }
  
  @SafeVarargs
  public static <E> ArrayList<E> a(E... paramVarArgs)
  {
    j.a(paramVarArgs);
    e.a(1, "arraySize");
    ArrayList localArrayList = new ArrayList(a.a(6L));
    Collections.addAll(localArrayList, paramVarArgs);
    return localArrayList;
  }
  
  static boolean a(List<?> paramList, @Nullable Object paramObject)
  {
    if (paramObject == j.a(paramList)) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    paramObject = (List)paramObject;
    int j = paramList.size();
    if (j != ((List)paramObject).size()) {
      return false;
    }
    if ((paramObject instanceof RandomAccess))
    {
      int i = 0;
      while (i < j)
      {
        if (!g.a(paramList.get(i), ((List)paramObject).get(i))) {
          return false;
        }
        i += 1;
      }
      return true;
    }
    paramList = paramList.iterator();
    paramObject = ((List)paramObject).iterator();
    while (paramList.hasNext()) {
      if ((!((Iterator)paramObject).hasNext()) || (!g.a(paramList.next(), ((Iterator)paramObject).next()))) {
        break label152;
      }
    }
    return !((Iterator)paramObject).hasNext();
  }
  
  static int b(List<?> paramList, @Nullable Object paramObject)
  {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (paramObject == null)
    {
      i = j;
      while (i < k)
      {
        if (paramList.get(i) == null) {
          return i;
        }
        i += 1;
      }
    }
    while (i < k)
    {
      if (paramObject.equals(paramList.get(i))) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  public static <E> LinkedList<E> b()
  {
    return new LinkedList();
  }
  
  static int c(List<?> paramList, @Nullable Object paramObject)
  {
    if (paramObject == null)
    {
      i = paramList.size() - 1;
      while (i >= 0)
      {
        if (paramList.get(i) == null) {
          return i;
        }
        i -= 1;
      }
    }
    int i = paramList.size() - 1;
    while (i >= 0)
    {
      if (paramObject.equals(paramList.get(i))) {
        return i;
      }
      i -= 1;
    }
    return -1;
  }
  
  public static <T> List<T> reverse(List<T> paramList)
  {
    if ((paramList instanceof l)) {
      return ((l)paramList).d();
    }
    if ((paramList instanceof b)) {
      return ((b)paramList).a;
    }
    if ((paramList instanceof RandomAccess)) {
      return new a(paramList);
    }
    return new b(paramList);
  }
  
  static final class a<T>
    extends Lists.b<T>
    implements RandomAccess
  {
    a(List<T> paramList)
    {
      super();
    }
  }
  
  static class b<T>
    extends AbstractList<T>
  {
    final List<T> a;
    
    b(List<T> paramList)
    {
      this.a = ((List)j.a(paramList));
    }
    
    private int a(int paramInt)
    {
      int i = size();
      j.a(paramInt, i);
      return i - 1 - paramInt;
    }
    
    private int b(int paramInt)
    {
      int i = size();
      j.b(paramInt, i);
      return i - paramInt;
    }
    
    public void add(int paramInt, @Nullable T paramT)
    {
      this.a.add(b(paramInt), paramT);
    }
    
    public void clear()
    {
      this.a.clear();
    }
    
    public T get(int paramInt)
    {
      return (T)this.a.get(a(paramInt));
    }
    
    public Iterator<T> iterator()
    {
      return listIterator();
    }
    
    public ListIterator<T> listIterator(int paramInt)
    {
      paramInt = b(paramInt);
      new ListIterator()
      {
        boolean a;
        
        public final void add(T paramAnonymousT)
        {
          this.b.add(paramAnonymousT);
          this.b.previous();
          this.a = false;
        }
        
        public final boolean hasNext()
        {
          return this.b.hasPrevious();
        }
        
        public final boolean hasPrevious()
        {
          return this.b.hasNext();
        }
        
        public final T next()
        {
          if (hasNext())
          {
            this.a = true;
            return (T)this.b.previous();
          }
          throw new NoSuchElementException();
        }
        
        public final int nextIndex()
        {
          return Lists.b.a(Lists.b.this, this.b.nextIndex());
        }
        
        public final T previous()
        {
          if (hasPrevious())
          {
            this.a = true;
            return (T)this.b.next();
          }
          throw new NoSuchElementException();
        }
        
        public final int previousIndex()
        {
          return nextIndex() - 1;
        }
        
        public final void remove()
        {
          j.b(this.a, "no calls to next() since the last call to remove()");
          this.b.remove();
          this.a = false;
        }
        
        public final void set(T paramAnonymousT)
        {
          j.b(this.a);
          this.b.set(paramAnonymousT);
        }
      };
    }
    
    public T remove(int paramInt)
    {
      return (T)this.a.remove(a(paramInt));
    }
    
    protected void removeRange(int paramInt1, int paramInt2)
    {
      subList(paramInt1, paramInt2).clear();
    }
    
    public T set(int paramInt, @Nullable T paramT)
    {
      return (T)this.a.set(a(paramInt), paramT);
    }
    
    public int size()
    {
      return this.a.size();
    }
    
    public List<T> subList(int paramInt1, int paramInt2)
    {
      j.a(paramInt1, paramInt2, size());
      return Lists.reverse(this.a.subList(b(paramInt2), b(paramInt1)));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/Lists.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */