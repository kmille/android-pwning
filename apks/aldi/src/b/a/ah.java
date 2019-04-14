package b.a;

import b.j;
import java.util.List;

@j(a={1, 1, 13}, b={"\000$\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020!\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\n\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\035\020\n\032\0020\0132\006\020\f\032\0020\0072\006\020\r\032\0028\000H\026¢\006\002\020\016J\b\020\017\032\0020\013H\026J\026\020\020\032\0028\0002\006\020\f\032\0020\007H\002¢\006\002\020\021J\025\020\022\032\0028\0002\006\020\f\032\0020\007H\026¢\006\002\020\021J\036\020\023\032\0028\0002\006\020\f\032\0020\0072\006\020\r\032\0028\000H\002¢\006\002\020\024R\024\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\t¨\006\025"}, c={"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public final class ah<T>
  extends c<T>
{
  private final List<T> a;
  
  public ah(List<T> paramList)
  {
    this.a = paramList;
  }
  
  public final int a()
  {
    return this.a.size();
  }
  
  public final T a(int paramInt)
  {
    return (T)this.a.remove(r.a(this, paramInt));
  }
  
  public final void add(int paramInt, T paramT)
  {
    List localList = this.a;
    int i = size();
    if ((paramInt >= 0) && (i >= paramInt))
    {
      localList.add(size() - paramInt, paramT);
      return;
    }
    paramT = new StringBuilder("Position index ");
    paramT.append(paramInt);
    paramT.append(" must be in range [");
    paramT.append(new b.h.c(0, size()));
    paramT.append("].");
    throw ((Throwable)new IndexOutOfBoundsException(paramT.toString()));
  }
  
  public final void clear()
  {
    this.a.clear();
  }
  
  public final T get(int paramInt)
  {
    return (T)this.a.get(r.a(this, paramInt));
  }
  
  public final T set(int paramInt, T paramT)
  {
    return (T)this.a.set(r.a(this, paramInt), paramT);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/a/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */