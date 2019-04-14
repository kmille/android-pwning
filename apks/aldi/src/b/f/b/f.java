package b.f.b;

import b.r;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collection<*>;
import java.util.Iterator;

@b.j(a={1, 1, 13}, b={"\0002\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\036\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032#\020\006\032\n\022\006\022\004\030\0010\0020\0012\n\020\007\032\006\022\002\b\0030\bH\007¢\006\004\b\t\020\n\0325\020\006\032\n\022\006\022\004\030\0010\0020\0012\n\020\007\032\006\022\002\b\0030\b2\020\020\013\032\f\022\006\022\004\030\0010\002\030\0010\001H\007¢\006\004\b\t\020\f\032~\020\r\032\n\022\006\022\004\030\0010\0020\0012\n\020\007\032\006\022\002\b\0030\b2\024\020\016\032\020\022\f\022\n\022\006\022\004\030\0010\0020\0010\0172\032\020\020\032\026\022\004\022\0020\005\022\f\022\n\022\006\022\004\030\0010\0020\0010\0212(\020\022\032$\022\f\022\n\022\006\022\004\030\0010\0020\001\022\004\022\0020\005\022\f\022\n\022\006\022\004\030\0010\0020\0010\023H\b¢\006\002\020\024\"\030\020\000\032\n\022\006\022\004\030\0010\0020\001X\004¢\006\004\n\002\020\003\"\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\025"}, c={"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"})
public final class f
{
  private static final Object[] a = new Object[0];
  
  public static final Object[] a(Collection<?> paramCollection)
  {
    j.b(paramCollection, "collection");
    int i = paramCollection.size();
    if (i == 0) {
      return a;
    }
    Iterator localIterator = paramCollection.iterator();
    if (!localIterator.hasNext()) {
      return a;
    }
    paramCollection = new Object[i];
    i = 0;
    for (;;)
    {
      int j = i + 1;
      paramCollection[i] = localIterator.next();
      Object localObject;
      if (j >= paramCollection.length)
      {
        if (!localIterator.hasNext()) {
          return paramCollection;
        }
        int k = j * 3 + 1 >>> 1;
        i = k;
        if (k <= j) {
          if (j < 2147483645) {
            i = 2147483645;
          } else {
            throw ((Throwable)new OutOfMemoryError());
          }
        }
        localObject = Arrays.copyOf(paramCollection, i);
        j.a(localObject, "Arrays.copyOf(result, newSize)");
      }
      else
      {
        localObject = paramCollection;
        if (!localIterator.hasNext())
        {
          paramCollection = Arrays.copyOf(paramCollection, j);
          j.a(paramCollection, "Arrays.copyOf(result, size)");
          return paramCollection;
        }
      }
      i = j;
      paramCollection = (Collection<?>)localObject;
    }
  }
  
  public static final Object[] a(Collection<?> paramCollection, Object[] paramArrayOfObject)
  {
    j.b(paramCollection, "collection");
    if (paramArrayOfObject != null)
    {
      int j = paramCollection.size();
      int i = 0;
      if (j == 0)
      {
        if (paramArrayOfObject.length > 0) {
          paramArrayOfObject[0] = null;
        }
        return paramArrayOfObject;
      }
      Iterator localIterator = paramCollection.iterator();
      if (!localIterator.hasNext())
      {
        if (paramArrayOfObject.length > 0) {
          paramArrayOfObject[0] = null;
        }
        return paramArrayOfObject;
      }
      if (j <= paramArrayOfObject.length)
      {
        paramCollection = paramArrayOfObject;
      }
      else
      {
        paramCollection = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), j);
        if (paramCollection == null) {
          break label231;
        }
      }
      Object localObject;
      for (paramCollection = (Object[])paramCollection;; paramCollection = (Collection<?>)localObject)
      {
        j = i + 1;
        paramCollection[i] = localIterator.next();
        if (j >= paramCollection.length)
        {
          if (!localIterator.hasNext()) {
            return paramCollection;
          }
          int k = j * 3 + 1 >>> 1;
          i = k;
          if (k <= j) {
            if (j < 2147483645) {
              i = 2147483645;
            } else {
              throw ((Throwable)new OutOfMemoryError());
            }
          }
          localObject = Arrays.copyOf(paramCollection, i);
          j.a(localObject, "Arrays.copyOf(result, newSize)");
        }
        else
        {
          localObject = paramCollection;
          if (!localIterator.hasNext())
          {
            if (paramCollection == paramArrayOfObject)
            {
              paramArrayOfObject[j] = null;
              return paramArrayOfObject;
            }
            paramCollection = Arrays.copyOf(paramCollection, j);
            j.a(paramCollection, "Arrays.copyOf(result, size)");
            return paramCollection;
          }
        }
        i = j;
      }
      label231:
      throw new r("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
    throw ((Throwable)new NullPointerException());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/f/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */