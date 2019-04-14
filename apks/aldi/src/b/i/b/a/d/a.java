package b.i.b.a.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<E>
  implements Iterable<E>
{
  private static final a<Object> d = new a();
  public final E a;
  public final a<E> b;
  public final int c;
  
  private a()
  {
    this.c = 0;
    this.a = null;
    this.b = null;
  }
  
  private a(E paramE, a<E> parama)
  {
    this.a = paramE;
    this.b = parama;
    parama.c += 1;
  }
  
  public static <E> a<E> a()
  {
    return d;
  }
  
  private a<E> b(Object paramObject)
  {
    if (this.c == 0) {
      return this;
    }
    if (this.a.equals(paramObject)) {
      return this.b;
    }
    paramObject = this.b.b(paramObject);
    if (paramObject == this.b) {
      return this;
    }
    return new a(this.a, (a)paramObject);
  }
  
  private E b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= this.c)) {}
    try
    {
      Object localObject = c(paramInt).next();
      return (E)localObject;
    }
    catch (NoSuchElementException localNoSuchElementException)
    {
      for (;;) {}
    }
    throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(paramInt)));
    throw new IndexOutOfBoundsException();
  }
  
  private Iterator<E> c(int paramInt)
  {
    return new a(d(paramInt));
  }
  
  private a<E> d(int paramInt)
  {
    a locala = this;
    while ((paramInt >= 0) && (paramInt <= locala.c))
    {
      if (paramInt == 0) {
        return locala;
      }
      locala = locala.b;
      paramInt -= 1;
    }
    throw new IndexOutOfBoundsException();
  }
  
  public final a<E> a(int paramInt)
  {
    return b(b(paramInt));
  }
  
  public final a<E> a(E paramE)
  {
    return new a(paramE, this);
  }
  
  public final Iterator<E> iterator()
  {
    return c(0);
  }
  
  static final class a<E>
    implements Iterator<E>
  {
    private a<E> a;
    
    public a(a<E> parama)
    {
      this.a = parama;
    }
    
    public final boolean hasNext()
    {
      return a.a(this.a) > 0;
    }
    
    public final E next()
    {
      Object localObject = this.a.a;
      this.a = this.a.b;
      return (E)localObject;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */