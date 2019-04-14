package b.a;

import b.f.b.a.a;
import b.j;
import java.util.ListIterator;

@j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\002\020*\n\002\020\001\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\003\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\t\020\004\032\0020\005H\002J\b\020\006\032\0020\005H\026J\t\020\007\032\0020\002H\002J\b\020\b\032\0020\tH\026J\b\020\n\032\0020\002H\026J\b\020\013\032\0020\tH\026¨\006\f"}, c={"Lkotlin/collections/EmptyIterator;", "", "", "()V", "hasNext", "", "hasPrevious", "next", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"})
public final class u
  implements a, ListIterator
{
  public static final u a = new u();
  
  public final boolean hasNext()
  {
    return false;
  }
  
  public final boolean hasPrevious()
  {
    return false;
  }
  
  public final int nextIndex()
  {
    return 0;
  }
  
  public final int previousIndex()
  {
    return -1;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */