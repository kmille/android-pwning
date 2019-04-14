package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.NavigableMap;

@RequiresApi(19)
final class SizeStrategy
  implements LruPoolStrategy
{
  private static final int MAX_SIZE_MULTIPLE = 8;
  private final GroupedLinkedMap<Key, Bitmap> groupedMap = new GroupedLinkedMap();
  private final KeyPool keyPool = new KeyPool();
  private final NavigableMap<Integer, Integer> sortedSizes = new PrettyPrintTreeMap();
  
  private void decrementBitmapOfSize(Integer paramInteger)
  {
    Integer localInteger = (Integer)this.sortedSizes.get(paramInteger);
    if (localInteger.intValue() == 1)
    {
      this.sortedSizes.remove(paramInteger);
      return;
    }
    this.sortedSizes.put(paramInteger, Integer.valueOf(localInteger.intValue() - 1));
  }
  
  static String getBitmapString(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(paramInt);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  private static String getBitmapString(Bitmap paramBitmap)
  {
    return getBitmapString(Util.getBitmapByteSize(paramBitmap));
  }
  
  @Nullable
  public final Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    int i = Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig);
    Key localKey = this.keyPool.get(i);
    Integer localInteger = (Integer)this.sortedSizes.ceilingKey(Integer.valueOf(i));
    Object localObject = localKey;
    if (localInteger != null)
    {
      localObject = localKey;
      if (localInteger.intValue() != i)
      {
        localObject = localKey;
        if (localInteger.intValue() <= i * 8)
        {
          this.keyPool.offer(localKey);
          localObject = this.keyPool.get(localInteger.intValue());
        }
      }
    }
    localObject = (Bitmap)this.groupedMap.get((Poolable)localObject);
    if (localObject != null)
    {
      ((Bitmap)localObject).reconfigure(paramInt1, paramInt2, paramConfig);
      decrementBitmapOfSize(localInteger);
    }
    return (Bitmap)localObject;
  }
  
  public final int getSize(Bitmap paramBitmap)
  {
    return Util.getBitmapByteSize(paramBitmap);
  }
  
  public final String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getBitmapString(Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig));
  }
  
  public final String logBitmap(Bitmap paramBitmap)
  {
    return getBitmapString(paramBitmap);
  }
  
  public final void put(Bitmap paramBitmap)
  {
    int i = Util.getBitmapByteSize(paramBitmap);
    Key localKey = this.keyPool.get(i);
    this.groupedMap.put(localKey, paramBitmap);
    paramBitmap = (Integer)this.sortedSizes.get(Integer.valueOf(localKey.size));
    NavigableMap localNavigableMap = this.sortedSizes;
    int j = localKey.size;
    i = 1;
    if (paramBitmap != null) {
      i = 1 + paramBitmap.intValue();
    }
    localNavigableMap.put(Integer.valueOf(j), Integer.valueOf(i));
  }
  
  @Nullable
  public final Bitmap removeLast()
  {
    Bitmap localBitmap = (Bitmap)this.groupedMap.removeLast();
    if (localBitmap != null) {
      decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(localBitmap)));
    }
    return localBitmap;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("SizeStrategy:\n  ");
    localStringBuilder.append(this.groupedMap);
    localStringBuilder.append("\n  SortedSizes");
    localStringBuilder.append(this.sortedSizes);
    return localStringBuilder.toString();
  }
  
  @VisibleForTesting
  static final class Key
    implements Poolable
  {
    private final SizeStrategy.KeyPool pool;
    int size;
    
    Key(SizeStrategy.KeyPool paramKeyPool)
    {
      this.pool = paramKeyPool;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof Key))
      {
        paramObject = (Key)paramObject;
        if (this.size == ((Key)paramObject).size) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return this.size;
    }
    
    public final void init(int paramInt)
    {
      this.size = paramInt;
    }
    
    public final void offer()
    {
      this.pool.offer(this);
    }
    
    public final String toString()
    {
      return SizeStrategy.getBitmapString(this.size);
    }
  }
  
  @VisibleForTesting
  static class KeyPool
    extends BaseKeyPool<SizeStrategy.Key>
  {
    protected SizeStrategy.Key create()
    {
      return new SizeStrategy.Key(this);
    }
    
    public SizeStrategy.Key get(int paramInt)
    {
      SizeStrategy.Key localKey = (SizeStrategy.Key)super.get();
      localKey.init(paramInt);
      return localKey;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/SizeStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */