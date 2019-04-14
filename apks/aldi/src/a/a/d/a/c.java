package a.a.d.a;

import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class c
  implements d
{
  private final ConcurrentMap<Class, SoftReference<Object>> a = new ConcurrentHashMap();
  
  public final <T> T a(Class<T> paramClass)
  {
    Object localObject = (SoftReference)this.a.get(paramClass);
    if (localObject != null)
    {
      localObject = ((SoftReference)localObject).get();
      if (localObject != null) {
        return (T)localObject;
      }
    }
    try
    {
      localObject = paramClass.newInstance();
      this.a.putIfAbsent(paramClass, new SoftReference(localObject));
      return (T)localObject;
    }
    catch (IllegalAccessException paramClass)
    {
      throw new RuntimeException(paramClass);
    }
    catch (InstantiationException paramClass)
    {
      throw new RuntimeException(paramClass);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */