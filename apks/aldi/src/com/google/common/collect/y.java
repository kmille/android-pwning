package com.google.common.collect;

import com.google.common.base.j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;

public final class y
{
  static int a(Set<?> paramSet)
  {
    paramSet = paramSet.iterator();
    int j;
    for (int i = 0; paramSet.hasNext(); i = i + j ^ 0xFFFFFFFF ^ 0xFFFFFFFF)
    {
      Object localObject = paramSet.next();
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
    }
    return i;
  }
  
  static boolean a(Set<?> paramSet, @Nullable Object paramObject)
  {
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool = paramSet.containsAll((Collection)paramObject);
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (NullPointerException|ClassCastException paramSet) {}
    return false;
  }
  
  static boolean a(Set<?> paramSet, Iterator<?> paramIterator)
  {
    boolean bool = false;
    while (paramIterator.hasNext()) {
      bool |= paramSet.remove(paramIterator.next());
    }
    return bool;
  }
  
  static abstract class a<E>
    extends AbstractSet<E>
  {
    public boolean removeAll(Collection<?> paramCollection)
    {
      j.a(paramCollection);
      Object localObject = paramCollection;
      if ((paramCollection instanceof q)) {
        localObject = ((q)paramCollection).a();
      }
      if (((localObject instanceof Set)) && (((Collection)localObject).size() > size()))
      {
        paramCollection = iterator();
        j.a(localObject);
        boolean bool = false;
        while (paramCollection.hasNext()) {
          if (((Collection)localObject).contains(paramCollection.next()))
          {
            paramCollection.remove();
            bool = true;
          }
        }
        return bool;
      }
      return y.a(this, ((Collection)localObject).iterator());
    }
    
    public boolean retainAll(Collection<?> paramCollection)
    {
      return super.retainAll((Collection)j.a(paramCollection));
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/collect/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */