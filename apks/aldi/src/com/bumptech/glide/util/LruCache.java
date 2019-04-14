package com.bumptech.glide.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LruCache<T, Y>
{
  private final Map<T, Y> cache = new LinkedHashMap(100, 0.75F, true);
  private long currentSize;
  private final long initialMaxSize;
  private long maxSize;
  
  public LruCache(long paramLong)
  {
    this.initialMaxSize = paramLong;
    this.maxSize = paramLong;
  }
  
  private void evict()
  {
    trimToSize(this.maxSize);
  }
  
  public void clearMemory()
  {
    trimToSize(0L);
  }
  
  public boolean contains(@NonNull T paramT)
  {
    try
    {
      boolean bool = this.cache.containsKey(paramT);
      return bool;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  @Nullable
  public Y get(@NonNull T paramT)
  {
    try
    {
      paramT = this.cache.get(paramT);
      return paramT;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  protected int getCount()
  {
    try
    {
      int i = this.cache.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getCurrentSize()
  {
    try
    {
      long l = this.currentSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected int getSize(@Nullable Y paramY)
  {
    return 1;
  }
  
  protected void onItemEvicted(@NonNull T paramT, @Nullable Y paramY) {}
  
  @Nullable
  public Y put(@NonNull T paramT, @Nullable Y paramY)
  {
    try
    {
      long l = getSize(paramY);
      if (l >= this.maxSize)
      {
        onItemEvicted(paramT, paramY);
        return null;
      }
      if (paramY != null) {
        this.currentSize += l;
      }
      Object localObject = this.cache.put(paramT, paramY);
      if (localObject != null)
      {
        this.currentSize -= getSize(localObject);
        if (!localObject.equals(paramY)) {
          onItemEvicted(paramT, localObject);
        }
      }
      evict();
      return (Y)localObject;
    }
    finally {}
  }
  
  @Nullable
  public Y remove(@NonNull T paramT)
  {
    try
    {
      paramT = this.cache.remove(paramT);
      if (paramT != null) {
        this.currentSize -= getSize(paramT);
      }
      return paramT;
    }
    finally {}
  }
  
  public void setSizeMultiplier(float paramFloat)
  {
    if (paramFloat >= 0.0F) {}
    try
    {
      this.maxSize = Math.round((float)this.initialMaxSize * paramFloat);
      evict();
      return;
    }
    finally {}
    throw new IllegalArgumentException("Multiplier must be >= 0");
  }
  
  protected void trimToSize(long paramLong)
  {
    try
    {
      while (this.currentSize > paramLong)
      {
        Iterator localIterator = this.cache.entrySet().iterator();
        Object localObject3 = (Map.Entry)localIterator.next();
        Object localObject2 = ((Map.Entry)localObject3).getValue();
        this.currentSize -= getSize(localObject2);
        localObject3 = ((Map.Entry)localObject3).getKey();
        localIterator.remove();
        onItemEvicted(localObject3, localObject2);
      }
      return;
    }
    finally
    {
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/util/LruCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */