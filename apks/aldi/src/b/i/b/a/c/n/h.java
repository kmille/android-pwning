package b.i.b.a.c.n;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class h<E>
  extends AbstractList<E>
  implements RandomAccess
{
  private int a;
  private Object b;
  
  public final void add(int paramInt, E paramE)
  {
    if ((paramInt >= 0) && (paramInt <= this.a))
    {
      if (this.a == 0)
      {
        this.b = paramE;
      }
      else if ((this.a == 1) && (paramInt == 0))
      {
        this.b = new Object[] { paramE, this.b };
      }
      else
      {
        Object[] arrayOfObject1 = new Object[this.a + 1];
        if (this.a == 1)
        {
          arrayOfObject1[0] = this.b;
        }
        else
        {
          Object[] arrayOfObject2 = (Object[])this.b;
          System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, paramInt);
          System.arraycopy(arrayOfObject2, paramInt, arrayOfObject1, paramInt + 1, this.a - paramInt);
        }
        arrayOfObject1[paramInt] = paramE;
        this.b = arrayOfObject1;
      }
      this.a += 1;
      this.modCount += 1;
      return;
    }
    paramE = new StringBuilder("Index: ");
    paramE.append(paramInt);
    paramE.append(", Size: ");
    paramE.append(this.a);
    throw new IndexOutOfBoundsException(paramE.toString());
  }
  
  public final boolean add(E paramE)
  {
    if (this.a == 0)
    {
      this.b = paramE;
    }
    else if (this.a == 1)
    {
      this.b = new Object[] { this.b, paramE };
    }
    else
    {
      Object[] arrayOfObject2 = (Object[])this.b;
      int k = arrayOfObject2.length;
      Object[] arrayOfObject1 = arrayOfObject2;
      if (this.a >= k)
      {
        int i = k * 3 / 2 + 1;
        int j = this.a + 1;
        if (i < j) {
          i = j;
        }
        arrayOfObject1 = new Object[i];
        this.b = arrayOfObject1;
        System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, k);
      }
      arrayOfObject1[this.a] = paramE;
    }
    this.a += 1;
    this.modCount += 1;
    return true;
  }
  
  public final void clear()
  {
    this.b = null;
    this.a = 0;
    this.modCount += 1;
  }
  
  public final E get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.a))
    {
      if (this.a == 1) {
        return (E)this.b;
      }
      return (E)((Object[])this.b)[paramInt];
    }
    StringBuilder localStringBuilder = new StringBuilder("Index: ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size: ");
    localStringBuilder.append(this.a);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final Iterator<E> iterator()
  {
    if (this.a == 0) {
      return a.a();
    }
    if (this.a == 1) {
      return new b();
    }
    return super.iterator();
  }
  
  public final E remove(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.a))
    {
      if (this.a == 1)
      {
        localObject = this.b;
        this.b = null;
      }
      else
      {
        Object[] arrayOfObject = (Object[])this.b;
        localObject = arrayOfObject[paramInt];
        if (this.a == 2)
        {
          this.b = arrayOfObject[(1 - paramInt)];
        }
        else
        {
          int i = this.a - paramInt - 1;
          if (i > 0) {
            System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i);
          }
          arrayOfObject[(this.a - 1)] = null;
        }
      }
      this.a -= 1;
      this.modCount += 1;
      return (E)localObject;
    }
    Object localObject = new StringBuilder("Index: ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(", Size: ");
    ((StringBuilder)localObject).append(this.a);
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public final E set(int paramInt, E paramE)
  {
    if ((paramInt >= 0) && (paramInt < this.a))
    {
      if (this.a == 1)
      {
        localObject = this.b;
        this.b = paramE;
        return (E)localObject;
      }
      Object localObject = (Object[])this.b;
      E ? = localObject[paramInt];
      localObject[paramInt] = paramE;
      return ?;
    }
    paramE = new StringBuilder("Index: ");
    paramE.append(paramInt);
    paramE.append(", Size: ");
    paramE.append(this.a);
    throw new IndexOutOfBoundsException(paramE.toString());
  }
  
  public final int size()
  {
    return this.a;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    int i = paramArrayOfT.length;
    if (this.a == 1)
    {
      if (i != 0)
      {
        paramArrayOfT[0] = this.b;
      }
      else
      {
        paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), 1);
        paramArrayOfT[0] = this.b;
        return paramArrayOfT;
      }
    }
    else
    {
      if (i < this.a) {
        return (Object[])Arrays.copyOf((Object[])this.b, this.a, paramArrayOfT.getClass());
      }
      if (this.a != 0) {
        System.arraycopy(this.b, 0, paramArrayOfT, 0, this.a);
      }
    }
    if (i > this.a) {
      paramArrayOfT[this.a] = null;
    }
    return paramArrayOfT;
  }
  
  static final class a<T>
    implements Iterator<T>
  {
    private static final a a = new a();
    
    public static <T> a<T> a()
    {
      return a;
    }
    
    public final boolean hasNext()
    {
      return false;
    }
    
    public final T next()
    {
      throw new NoSuchElementException();
    }
    
    public final void remove()
    {
      throw new IllegalStateException();
    }
  }
  
  final class b
    extends h.c<E>
  {
    private final int b = h.a(h.this);
    
    public b()
    {
      super();
    }
    
    protected final E a()
    {
      return (E)h.b(h.this);
    }
    
    protected final void b()
    {
      if (h.c(h.this) == this.b) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder("ModCount: ");
      localStringBuilder.append(h.d(h.this));
      localStringBuilder.append("; expected: ");
      localStringBuilder.append(this.b);
      throw new ConcurrentModificationException(localStringBuilder.toString());
    }
    
    public final void remove()
    {
      b();
      h.this.clear();
    }
  }
  
  static abstract class c<T>
    implements Iterator<T>
  {
    private boolean a;
    
    protected abstract T a();
    
    protected abstract void b();
    
    public final boolean hasNext()
    {
      return !this.a;
    }
    
    public final T next()
    {
      if (!this.a)
      {
        this.a = true;
        b();
        return (T)a();
      }
      throw new NoSuchElementException();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */