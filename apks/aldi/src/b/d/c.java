package b.d;

import b.j;

@j(a={1, 1, 13}, b={"\000\022\n\000\n\002\020\b\n\002\b\003\n\002\020\t\n\002\b\006\032 \020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\001H\002\032 \020\000\032\0020\0052\006\020\002\032\0020\0052\006\020\003\032\0020\0052\006\020\004\032\0020\005H\002\032 \020\006\032\0020\0012\006\020\007\032\0020\0012\006\020\b\032\0020\0012\006\020\t\032\0020\001H\001\032 \020\006\032\0020\0052\006\020\007\032\0020\0052\006\020\b\032\0020\0052\006\020\t\032\0020\005H\001\032\030\020\n\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\001H\002\032\030\020\n\032\0020\0052\006\020\002\032\0020\0052\006\020\003\032\0020\005H\002¨\006\013"}, c={"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"})
public final class c
{
  private static final int a(int paramInt1, int paramInt2)
  {
    paramInt1 %= paramInt2;
    if (paramInt1 >= 0) {
      return paramInt1;
    }
    return paramInt1 + paramInt2;
  }
  
  public static final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(a(paramInt1, paramInt3) - a(paramInt2, paramInt3), paramInt3);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */