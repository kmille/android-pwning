package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ModelToResourceClassCache
{
  private final ArrayMap<MultiClassKey, List<Class<?>>> registeredResourceClassCache = new ArrayMap();
  private final AtomicReference<MultiClassKey> resourceClassKeyRef = new AtomicReference();
  
  public void clear()
  {
    synchronized (this.registeredResourceClassCache)
    {
      this.registeredResourceClassCache.clear();
      return;
    }
  }
  
  @Nullable
  public List<Class<?>> get(@NonNull Class<?> paramClass1, @NonNull Class<?> arg2)
  {
    Object localObject = (MultiClassKey)this.resourceClassKeyRef.getAndSet(null);
    if (localObject == null)
    {
      paramClass1 = new MultiClassKey(paramClass1, ???);
    }
    else
    {
      ((MultiClassKey)localObject).set(paramClass1, ???);
      paramClass1 = (Class<?>)localObject;
    }
    synchronized (this.registeredResourceClassCache)
    {
      localObject = (List)this.registeredResourceClassCache.get(paramClass1);
      this.resourceClassKeyRef.set(paramClass1);
      return (List<Class<?>>)localObject;
    }
  }
  
  public void put(@NonNull Class<?> paramClass1, @NonNull Class<?> paramClass2, @NonNull List<Class<?>> paramList)
  {
    synchronized (this.registeredResourceClassCache)
    {
      this.registeredResourceClassCache.put(new MultiClassKey(paramClass1, paramClass2), paramList);
      return;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/provider/ModelToResourceClassCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */