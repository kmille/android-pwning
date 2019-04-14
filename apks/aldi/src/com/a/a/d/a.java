package com.a.a.d;

import com.a.a.c.c;

public final class a<T>
  extends c<T>
{
  private final T[] a;
  private int b;
  
  public a(T[] paramArrayOfT)
  {
    this.a = paramArrayOfT;
    this.b = 0;
  }
  
  public final T a()
  {
    Object[] arrayOfObject = this.a;
    int i = this.b;
    this.b = (i + 1);
    return (T)arrayOfObject[i];
  }
  
  public final boolean hasNext()
  {
    return this.b < this.a.length;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/a/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */