package com.google.common.collect;

import com.google.common.base.j;
import java.io.Serializable;
import javax.annotation.Nullable;

public abstract class g<C extends Comparable>
  implements Serializable, Comparable<g<C>>
{
  final C a;
  
  g(@Nullable C paramC)
  {
    this.a = paramC;
  }
  
  static <C extends Comparable> g<C> a()
  {
    return c.c();
  }
  
  static <C extends Comparable> g<C> b()
  {
    return a.c();
  }
  
  static <C extends Comparable> g<C> b(C paramC)
  {
    return new d(paramC);
  }
  
  static <C extends Comparable> g<C> c(C paramC)
  {
    return new b(paramC);
  }
  
  public int a(g<C> paramg)
  {
    if (paramg == c.c()) {
      return 1;
    }
    if (paramg == a.c()) {
      return -1;
    }
    int i = t.b(this.a, paramg.a);
    if (i != 0) {
      return i;
    }
    boolean bool = this instanceof b;
    if (bool == paramg instanceof b) {
      return 0;
    }
    if (bool) {
      return 1;
    }
    return -1;
  }
  
  abstract void a(StringBuilder paramStringBuilder);
  
  public abstract boolean a(C paramC);
  
  abstract void b(StringBuilder paramStringBuilder);
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof g)) {
      paramObject = (g)paramObject;
    }
    try
    {
      int i = a((g)paramObject);
      return i == 0;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public abstract int hashCode();
  
  static final class a
    extends g<Comparable<?>>
  {
    private static final a b = new a();
    
    private a()
    {
      super();
    }
    
    public final int a(g<Comparable<?>> paramg)
    {
      if (paramg == this) {
        return 0;
      }
      return 1;
    }
    
    final void a(StringBuilder paramStringBuilder)
    {
      throw new AssertionError();
    }
    
    final boolean a(Comparable<?> paramComparable)
    {
      return false;
    }
    
    final void b(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append("+∞)");
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(this);
    }
    
    public final String toString()
    {
      return "+∞";
    }
  }
  
  static final class b<C extends Comparable>
    extends g<C>
  {
    b(C paramC)
    {
      super();
    }
    
    final void a(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append('(');
      paramStringBuilder.append(this.a);
    }
    
    final boolean a(C paramC)
    {
      return t.b(this.a, paramC) < 0;
    }
    
    final void b(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append(this.a);
      paramStringBuilder.append(']');
    }
    
    public final int hashCode()
    {
      return this.a.hashCode() ^ 0xFFFFFFFF;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("/");
      localStringBuilder.append(this.a);
      localStringBuilder.append("\\");
      return localStringBuilder.toString();
    }
  }
  
  static final class c
    extends g<Comparable<?>>
  {
    private static final c b = new c();
    
    private c()
    {
      super();
    }
    
    public final int a(g<Comparable<?>> paramg)
    {
      if (paramg == this) {
        return 0;
      }
      return -1;
    }
    
    final void a(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append("(-∞");
    }
    
    final boolean a(Comparable<?> paramComparable)
    {
      return true;
    }
    
    final void b(StringBuilder paramStringBuilder)
    {
      throw new AssertionError();
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(this);
    }
    
    public final String toString()
    {
      return "-∞";
    }
  }
  
  static final class d<C extends Comparable>
    extends g<C>
  {
    d(C paramC)
    {
      super();
    }
    
    final void a(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append('[');
      paramStringBuilder.append(this.a);
    }
    
    final boolean a(C paramC)
    {
      return t.b(this.a, paramC) <= 0;
    }
    
    final void b(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append(this.a);
      paramStringBuilder.append(')');
    }
    
    public final int hashCode()
    {
      return this.a.hashCode();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("\\");
      localStringBuilder.append(this.a);
      localStringBuilder.append("/");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */