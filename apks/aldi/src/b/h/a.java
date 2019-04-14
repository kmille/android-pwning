package b.h;

import b.d.c;
import b.j;

@j(a={1, 1, 13}, b={"\000,\n\002\030\002\n\002\020\034\n\002\020\b\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\026\030\000 \0272\b\022\004\022\0020\0020\001:\001\027B\037\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\002\022\006\020\005\032\0020\002¢\006\002\020\006J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\002H\026J\b\020\022\032\0020\016H\026J\t\020\023\032\0020\024H\002J\b\020\025\032\0020\026H\026R\021\020\007\032\0020\002¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\002¢\006\b\n\000\032\004\b\013\020\tR\021\020\005\032\0020\002¢\006\b\n\000\032\004\b\f\020\t¨\006\030"}, c={"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"})
public class a
  implements b.f.b.a.a, Iterable<Integer>
{
  public static final a d = new a((byte)0);
  public final int a;
  public final int b;
  public final int c;
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 != 0)
    {
      if (paramInt3 != Integer.MIN_VALUE)
      {
        this.a = paramInt1;
        if (paramInt3 > 0)
        {
          if (paramInt1 < paramInt2) {
            paramInt2 -= c.a(paramInt2, paramInt1, paramInt3);
          }
        }
        else
        {
          if (paramInt3 >= 0) {
            break label76;
          }
          if (paramInt1 > paramInt2) {
            paramInt2 += c.a(paramInt1, paramInt2, -paramInt3);
          }
        }
        this.b = paramInt2;
        this.c = paramInt3;
        return;
        label76:
        throw ((Throwable)new IllegalArgumentException("Step is zero."));
      }
      throw ((Throwable)new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation."));
    }
    throw ((Throwable)new IllegalArgumentException("Step must be non-zero."));
  }
  
  public boolean a()
  {
    if (this.c > 0) {
      return this.a > this.b;
    }
    return this.a < this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      if ((!a()) || (!((a)paramObject).a()))
      {
        int i = this.a;
        paramObject = (a)paramObject;
        if ((i != ((a)paramObject).a) || (this.b != ((a)paramObject).b) || (this.c != ((a)paramObject).c)) {}
      }
      else
      {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    if (a()) {
      return -1;
    }
    return (this.a * 31 + this.b) * 31 + this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder;
    if (this.c > 0)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.a);
      localStringBuilder.append("..");
      localStringBuilder.append(this.b);
      localStringBuilder.append(" step ");
    }
    for (int i = this.c;; i = -this.c)
    {
      localStringBuilder.append(i);
      return localStringBuilder.toString();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.a);
      localStringBuilder.append(" downTo ");
      localStringBuilder.append(this.b);
      localStringBuilder.append(" step ");
    }
  }
  
  @j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\006¨\006\t"}, c={"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"})
  public static final class a
  {
    public static a a(int paramInt1, int paramInt2, int paramInt3)
    {
      return new a(paramInt1, paramInt2, paramInt3);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */