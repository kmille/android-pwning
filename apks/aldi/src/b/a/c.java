package b.a;

import b.f.b.a.e;
import b.j;
import java.util.AbstractList;
import java.util.List;

@j(a={1, 1, 13}, b={"\000 \n\002\030\002\n\000\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\b\n\002\b\007\b'\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\007\b\004¢\006\002\020\004J\035\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0028\000H&¢\006\002\020\nJ\025\020\013\032\0028\0002\006\020\007\032\0020\bH&¢\006\002\020\fJ\036\020\r\032\0028\0002\006\020\007\032\0020\b2\006\020\t\032\0028\000H¦\002¢\006\002\020\016¨\006\017"}, c={"Lkotlin/collections/AbstractMutableList;", "E", "", "Ljava/util/AbstractList;", "()V", "add", "", "index", "", "element", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public abstract class c<E>
  extends AbstractList<E>
  implements e, List<E>
{
  public abstract int a();
  
  public abstract E a(int paramInt);
  
  public final E remove(int paramInt)
  {
    return (E)a(paramInt);
  }
  
  public final int size()
  {
    return a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */