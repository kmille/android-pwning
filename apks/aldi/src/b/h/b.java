package b.h;

import b.a.ab;
import b.j;
import java.util.NoSuchElementException;

@j(a={1, 1, 13}, b={"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\005\b\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\t\020\b\032\0020\tH\002J\b\020\r\032\0020\003H\026R\016\020\007\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000R\016\020\n\032\0020\003X\016¢\006\002\n\000R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\016"}, c={"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"})
public final class b
  extends ab
{
  private final int a;
  private boolean b;
  private int c;
  private final int d;
  
  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramInt3;
    this.a = paramInt2;
    paramInt3 = this.d;
    boolean bool = false;
    if (paramInt3 > 0)
    {
      if (paramInt1 > paramInt2) {}
    }
    else {
      while (paramInt1 >= paramInt2)
      {
        bool = true;
        break;
      }
    }
    this.b = bool;
    if (!this.b) {
      paramInt1 = this.a;
    }
    this.c = paramInt1;
  }
  
  public final int a()
  {
    int i = this.c;
    if (i == this.a)
    {
      if (this.b)
      {
        this.b = false;
        return i;
      }
      throw ((Throwable)new NoSuchElementException());
    }
    this.c += this.d;
    return i;
  }
  
  public final boolean hasNext()
  {
    return this.b;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */