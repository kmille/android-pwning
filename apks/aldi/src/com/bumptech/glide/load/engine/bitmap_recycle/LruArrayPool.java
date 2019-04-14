package com.bumptech.glide.load.engine.bitmap_recycle;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public final class LruArrayPool
  implements ArrayPool
{
  private static final int DEFAULT_SIZE = 4194304;
  @VisibleForTesting
  static final int MAX_OVER_SIZE_MULTIPLE = 8;
  private static final int SINGLE_ARRAY_MAX_SIZE_DIVISOR = 2;
  private final Map<Class<?>, ArrayAdapterInterface<?>> adapters = new HashMap();
  private int currentSize;
  private final GroupedLinkedMap<Key, Object> groupedMap = new GroupedLinkedMap();
  private final KeyPool keyPool = new KeyPool();
  private final int maxSize;
  private final Map<Class<?>, NavigableMap<Integer, Integer>> sortedSizes = new HashMap();
  
  @VisibleForTesting
  public LruArrayPool()
  {
    this.maxSize = 4194304;
  }
  
  public LruArrayPool(int paramInt)
  {
    this.maxSize = paramInt;
  }
  
  private void decrementArrayOfSize(int paramInt, Class<?> paramClass)
  {
    paramClass = getSizesForAdapter(paramClass);
    Integer localInteger = (Integer)paramClass.get(Integer.valueOf(paramInt));
    if (localInteger != null)
    {
      if (localInteger.intValue() == 1)
      {
        paramClass.remove(Integer.valueOf(paramInt));
        return;
      }
      paramClass.put(Integer.valueOf(paramInt), Integer.valueOf(localInteger.intValue() - 1));
      return;
    }
    paramClass = new StringBuilder("Tried to decrement empty size, size: ");
    paramClass.append(paramInt);
    paramClass.append(", this: ");
    paramClass.append(this);
    throw new NullPointerException(paramClass.toString());
  }
  
  private void evict()
  {
    evictToSize(this.maxSize);
  }
  
  private void evictToSize(int paramInt)
  {
    while (this.currentSize > paramInt)
    {
      Object localObject = this.groupedMap.removeLast();
      Preconditions.checkNotNull(localObject);
      ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromObject(localObject);
      this.currentSize -= localArrayAdapterInterface.getArrayLength(localObject) * localArrayAdapterInterface.getElementSizeInBytes();
      decrementArrayOfSize(localArrayAdapterInterface.getArrayLength(localObject), localObject.getClass());
      if (Log.isLoggable(localArrayAdapterInterface.getTag(), 2))
      {
        localArrayAdapterInterface.getTag();
        new StringBuilder("evicted: ").append(localArrayAdapterInterface.getArrayLength(localObject));
      }
    }
  }
  
  private <T> ArrayAdapterInterface<T> getAdapterFromObject(T paramT)
  {
    return getAdapterFromType(paramT.getClass());
  }
  
  private <T> ArrayAdapterInterface<T> getAdapterFromType(Class<T> paramClass)
  {
    Object localObject = (ArrayAdapterInterface)this.adapters.get(paramClass);
    if (localObject == null)
    {
      if (paramClass.equals(int[].class))
      {
        localObject = new IntegerArrayAdapter();
      }
      else
      {
        if (!paramClass.equals(byte[].class)) {
          break label69;
        }
        localObject = new ByteArrayAdapter();
      }
      this.adapters.put(paramClass, localObject);
      return (ArrayAdapterInterface<T>)localObject;
      label69:
      localObject = new StringBuilder("No array pool found for: ");
      ((StringBuilder)localObject).append(paramClass.getSimpleName());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    return (ArrayAdapterInterface<T>)localObject;
  }
  
  @Nullable
  private <T> T getArrayForKey(Key paramKey)
  {
    return (T)this.groupedMap.get(paramKey);
  }
  
  private <T> T getForKey(Key paramKey, Class<T> paramClass)
  {
    ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromType(paramClass);
    Object localObject = getArrayForKey(paramKey);
    if (localObject != null)
    {
      this.currentSize -= localArrayAdapterInterface.getArrayLength(localObject) * localArrayAdapterInterface.getElementSizeInBytes();
      decrementArrayOfSize(localArrayAdapterInterface.getArrayLength(localObject), paramClass);
    }
    paramClass = (Class<T>)localObject;
    if (localObject == null)
    {
      if (Log.isLoggable(localArrayAdapterInterface.getTag(), 2))
      {
        localArrayAdapterInterface.getTag();
        paramClass = new StringBuilder("Allocated ");
        paramClass.append(paramKey.size);
        paramClass.append(" bytes");
      }
      paramClass = localArrayAdapterInterface.newArray(paramKey.size);
    }
    return paramClass;
  }
  
  private NavigableMap<Integer, Integer> getSizesForAdapter(Class<?> paramClass)
  {
    NavigableMap localNavigableMap = (NavigableMap)this.sortedSizes.get(paramClass);
    Object localObject = localNavigableMap;
    if (localNavigableMap == null)
    {
      localObject = new TreeMap();
      this.sortedSizes.put(paramClass, localObject);
    }
    return (NavigableMap<Integer, Integer>)localObject;
  }
  
  private boolean isNoMoreThanHalfFull()
  {
    return (this.currentSize == 0) || (this.maxSize / this.currentSize >= 2);
  }
  
  private boolean isSmallEnoughForReuse(int paramInt)
  {
    return paramInt <= this.maxSize / 2;
  }
  
  private boolean mayFillRequest(int paramInt, Integer paramInteger)
  {
    return (paramInteger != null) && ((isNoMoreThanHalfFull()) || (paramInteger.intValue() <= paramInt * 8));
  }
  
  public final void clearMemory()
  {
    try
    {
      evictToSize(0);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final <T> T get(int paramInt, Class<T> paramClass)
  {
    try
    {
      Object localObject = (Integer)getSizesForAdapter(paramClass).ceilingKey(Integer.valueOf(paramInt));
      if (mayFillRequest(paramInt, (Integer)localObject)) {
        localObject = this.keyPool.get(((Integer)localObject).intValue(), paramClass);
      } else {
        localObject = this.keyPool.get(paramInt, paramClass);
      }
      paramClass = getForKey((Key)localObject, paramClass);
      return paramClass;
    }
    finally {}
  }
  
  final int getCurrentSize()
  {
    Iterator localIterator1 = this.sortedSizes.keySet().iterator();
    int i = 0;
    if (localIterator1.hasNext())
    {
      Class localClass = (Class)localIterator1.next();
      Iterator localIterator2 = ((NavigableMap)this.sortedSizes.get(localClass)).keySet().iterator();
      int j = i;
      for (;;)
      {
        i = j;
        if (!localIterator2.hasNext()) {
          break;
        }
        Integer localInteger = (Integer)localIterator2.next();
        ArrayAdapterInterface localArrayAdapterInterface = getAdapterFromType(localClass);
        j += localInteger.intValue() * ((Integer)((NavigableMap)this.sortedSizes.get(localClass)).get(localInteger)).intValue() * localArrayAdapterInterface.getElementSizeInBytes();
      }
    }
    return i;
  }
  
  public final <T> T getExact(int paramInt, Class<T> paramClass)
  {
    try
    {
      paramClass = getForKey(this.keyPool.get(paramInt, paramClass), paramClass);
      return paramClass;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  public final <T> void put(T paramT)
  {
    try
    {
      Object localObject2 = paramT.getClass();
      Object localObject1 = getAdapterFromType((Class)localObject2);
      int i = ((ArrayAdapterInterface)localObject1).getArrayLength(paramT);
      int j = ((ArrayAdapterInterface)localObject1).getElementSizeInBytes() * i;
      boolean bool = isSmallEnoughForReuse(j);
      if (!bool) {
        return;
      }
      localObject1 = this.keyPool.get(i, (Class)localObject2);
      this.groupedMap.put((Poolable)localObject1, paramT);
      paramT = getSizesForAdapter((Class)localObject2);
      localObject2 = (Integer)paramT.get(Integer.valueOf(((Key)localObject1).size));
      int k = ((Key)localObject1).size;
      i = 1;
      if (localObject2 != null) {
        i = 1 + ((Integer)localObject2).intValue();
      }
      paramT.put(Integer.valueOf(k), Integer.valueOf(i));
      this.currentSize += j;
      evict();
      return;
    }
    finally {}
  }
  
  @Deprecated
  public final <T> void put(T paramT, Class<T> paramClass)
  {
    put(paramT);
  }
  
  public final void trimMemory(int paramInt)
  {
    if (paramInt >= 40) {
      try
      {
        clearMemory();
        return;
      }
      finally
      {
        break label44;
      }
    }
    if ((paramInt >= 20) || (paramInt == 15)) {
      evictToSize(this.maxSize / 2);
    }
    return;
    label44:
    throw ((Throwable)localObject);
  }
  
  static final class Key
    implements Poolable
  {
    private Class<?> arrayClass;
    private final LruArrayPool.KeyPool pool;
    int size;
    
    Key(LruArrayPool.KeyPool paramKeyPool)
    {
      this.pool = paramKeyPool;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof Key))
      {
        paramObject = (Key)paramObject;
        if ((this.size == ((Key)paramObject).size) && (this.arrayClass == ((Key)paramObject).arrayClass)) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      int j = this.size;
      int i;
      if (this.arrayClass != null) {
        i = this.arrayClass.hashCode();
      } else {
        i = 0;
      }
      return j * 31 + i;
    }
    
    final void init(int paramInt, Class<?> paramClass)
    {
      this.size = paramInt;
      this.arrayClass = paramClass;
    }
    
    public final void offer()
    {
      this.pool.offer(this);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("Key{size=");
      localStringBuilder.append(this.size);
      localStringBuilder.append("array=");
      localStringBuilder.append(this.arrayClass);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  static final class KeyPool
    extends BaseKeyPool<LruArrayPool.Key>
  {
    protected final LruArrayPool.Key create()
    {
      return new LruArrayPool.Key(this);
    }
    
    final LruArrayPool.Key get(int paramInt, Class<?> paramClass)
    {
      LruArrayPool.Key localKey = (LruArrayPool.Key)get();
      localKey.init(paramInt, paramClass);
      return localKey;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */