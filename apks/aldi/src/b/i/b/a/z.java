package b.i.b.a;

import b.f.a.a;
import java.lang.ref.SoftReference;

public final class z
{
  public static <T> a<T> a(T paramT, a<T> parama)
  {
    return new a(paramT, parama);
  }
  
  public static <T> b<T> a(a<T> parama)
  {
    return new b(parama);
  }
  
  public static final class a<T>
    extends z.c<T>
  {
    private final a<T> a;
    private SoftReference<Object> b = null;
    
    public a(T paramT, a<T> parama)
    {
      this.a = parama;
      if (paramT != null) {
        this.b = new SoftReference(a(paramT));
      }
    }
    
    public final T a()
    {
      Object localObject = this.b;
      if (localObject != null)
      {
        localObject = ((SoftReference)localObject).get();
        if (localObject != null) {
          return (T)b(localObject);
        }
      }
      localObject = this.a.b_();
      this.b = new SoftReference(a(localObject));
      return (T)localObject;
    }
  }
  
  public static final class b<T>
    extends z.c<T>
  {
    private final a<T> a;
    private Object b = null;
    
    public b(a<T> parama)
    {
      this.a = parama;
    }
    
    public final T a()
    {
      Object localObject = this.b;
      if (localObject != null) {
        return (T)b(localObject);
      }
      localObject = this.a.b_();
      this.b = a(localObject);
      return (T)localObject;
    }
  }
  
  public static abstract class c<T>
  {
    private static final Object a = new Object() {};
    
    protected static Object a(T paramT)
    {
      Object localObject = paramT;
      if (paramT == null) {
        localObject = a;
      }
      return localObject;
    }
    
    protected static T b(Object paramObject)
    {
      Object localObject = paramObject;
      if (paramObject == a) {
        localObject = null;
      }
      return (T)localObject;
    }
    
    public abstract T a();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */