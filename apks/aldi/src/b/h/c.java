package b.h;

import b.j;

@j(a={1, 1, 13}, b={"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\030\000 \0242\0020\0012\b\022\004\022\0020\0030\002:\001\024B\025\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\021\020\n\032\0020\0132\006\020\f\032\0020\003H\002J\023\020\r\032\0020\0132\b\020\016\032\004\030\0010\017H\002J\b\020\020\032\0020\003H\026J\b\020\021\032\0020\013H\026J\b\020\022\032\0020\023H\026R\024\020\005\032\0020\0038VX\004¢\006\006\032\004\b\007\020\bR\024\020\004\032\0020\0038VX\004¢\006\006\032\004\b\t\020\b¨\006\025"}, c={"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
public final class c
  extends a
{
  public static final a e = new a((byte)0);
  private static final c f = new c(1, 0);
  
  public c(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2, 1);
  }
  
  public final boolean a()
  {
    return this.a > this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof c)) {
      if ((!a()) || (!((c)paramObject).a()))
      {
        int i = this.a;
        paramObject = (c)paramObject;
        if ((i != ((a)paramObject).a) || (this.b != ((a)paramObject).b)) {}
      }
      else
      {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (a()) {
      return -1;
    }
    return this.a * 31 + this.b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("..");
    localStringBuilder.append(this.b);
    return localStringBuilder.toString();
  }
  
  @j(a={1, 1, 13}, b={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, c={"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"})
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */