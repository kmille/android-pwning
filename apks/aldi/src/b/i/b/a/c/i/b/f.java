package b.i.b.a.c.i.b;

import b.f.b.j;
import b.i.b.a.c.b.y;
import b.i.b.a.c.l.w;

public abstract class f<T>
{
  private final T a;
  
  public f(T paramT)
  {
    this.a = paramT;
  }
  
  public abstract w a(y paramy);
  
  public T a()
  {
    return (T)this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((f)this != paramObject)
    {
      Object localObject2 = a();
      boolean bool = paramObject instanceof f;
      Object localObject1 = null;
      if (!bool) {
        paramObject = null;
      }
      f localf = (f)paramObject;
      paramObject = localObject1;
      if (localf != null) {
        paramObject = localf.a();
      }
      if (!j.a(localObject2, paramObject)) {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = a();
    if (localObject != null) {
      return localObject.hashCode();
    }
    return 0;
  }
  
  public String toString()
  {
    return String.valueOf(a());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */