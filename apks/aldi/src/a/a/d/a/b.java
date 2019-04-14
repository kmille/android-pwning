package a.a.d.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class b<T extends AccessibleObject, M>
{
  private final ConcurrentMap<Class, ConcurrentMap<Class<? extends Annotation>, Collection<M>>> a = new ConcurrentHashMap();
  
  private Collection<M> b(Class paramClass, Class<? extends Annotation> paramClass1)
  {
    paramClass = (Map)this.a.get(paramClass);
    if (paramClass != null)
    {
      paramClass = (Collection)paramClass.get(paramClass1);
      if (paramClass != null) {
        return paramClass;
      }
    }
    return null;
  }
  
  protected abstract M a(T paramT);
  
  public final Collection<M> a(Class paramClass, Class<? extends Annotation> paramClass1)
  {
    if (paramClass != null)
    {
      Object localObject1 = b(paramClass, paramClass1);
      if (localObject1 != null) {
        return (Collection<M>)localObject1;
      }
      if (b(paramClass, paramClass1) == null)
      {
        LinkedHashSet localLinkedHashSet = new LinkedHashSet();
        localObject1 = a(paramClass);
        int k = localObject1.length;
        int j = 0;
        int i = 0;
        while (i < k)
        {
          localObject2 = localObject1[i];
          if (((AccessibleObject)localObject2).isAnnotationPresent(paramClass1))
          {
            ((AccessibleObject)localObject2).setAccessible(true);
            localLinkedHashSet.add(a((AccessibleObject)localObject2));
          }
          i += 1;
        }
        localLinkedHashSet.addAll(a(paramClass.getSuperclass(), paramClass1));
        localObject1 = paramClass.getInterfaces();
        k = localObject1.length;
        i = j;
        while (i < k)
        {
          localLinkedHashSet.addAll(a(localObject1[i], paramClass1));
          i += 1;
        }
        localObject1 = new ConcurrentHashMap();
        Object localObject2 = (ConcurrentMap)this.a.putIfAbsent(paramClass, localObject1);
        paramClass = (Class)localObject2;
        if (localObject2 == null) {
          paramClass = (Class)localObject1;
        }
        paramClass.put(paramClass1, localLinkedHashSet);
        return localLinkedHashSet;
      }
    }
    return Collections.emptyList();
  }
  
  protected abstract T[] a(Class paramClass);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */