package com.google.common.collect;

import com.google.common.base.j;
import java.util.NoSuchElementException;

abstract class a<E>
  extends ac<E>
{
  private final int a;
  private int b;
  
  protected a(int paramInt1, int paramInt2)
  {
    j.b(paramInt2, paramInt1);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  protected abstract E a(int paramInt);
  
  public final boolean hasNext()
  {
    return this.b < this.a;
  }
  
  public final boolean hasPrevious()
  {
    return this.b > 0;
  }
  
  public final E next()
  {
    if (hasNext())
    {
      int i = this.b;
      this.b = (i + 1);
      return (E)a(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return this.b;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      int i = this.b - 1;
      this.b = i;
      return (E)a(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return this.b - 1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */