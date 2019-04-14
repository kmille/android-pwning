package a.a.d.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class f
{
  private final Method a;
  private final List<Class> b;
  
  public f(Method paramMethod, Set<Class> paramSet)
  {
    this.a = paramMethod;
    this.b = new ArrayList(paramSet.size());
    paramMethod = this.a.getParameterTypes();
    int j = paramMethod.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramMethod[i];
      if (paramSet.contains(localObject))
      {
        this.b.add(localObject);
        i += 1;
      }
      else
      {
        throw new IllegalArgumentException("Cannot auto inject type: ".concat(String.valueOf(localObject)));
      }
    }
  }
  
  public final void a(Object paramObject, a parama)
    throws InvocationTargetException, IllegalAccessException
  {
    Object[] arrayOfObject = new Object[this.a.getParameterTypes().length];
    int i = 0;
    while (i < arrayOfObject.length)
    {
      arrayOfObject[i] = parama.a((Class)this.b.get(i));
      i += 1;
    }
    this.a.invoke(paramObject, arrayOfObject);
  }
  
  public static abstract interface a
  {
    public abstract Object a(Class paramClass);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/d/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */