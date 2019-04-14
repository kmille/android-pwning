package b.a;

import b.f.b.a.a;
import b.j;
import java.util.Enumeration;
import java.util.Iterator;

@j(a={1, 1, 13}, b={"\000\016\n\000\n\002\020(\n\000\n\002\030\002\n\000\032\037\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\002¨\006\004"}, c={"iterator", "", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"}, d=1)
public class n
  extends m
{
  @j(a={1, 1, 13}, b={"\000\023\n\000\n\002\020(\n\000\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\002\032\0020\003H\002J\016\020\004\032\0028\000H\002¢\006\002\020\005¨\006\006"}, c={"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
  public static final class a
    implements a, Iterator<T>
  {
    public a(Enumeration<T> paramEnumeration) {}
    
    public final boolean hasNext()
    {
      return this.a.hasMoreElements();
    }
    
    public final T next()
    {
      return (T)this.a.nextElement();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */