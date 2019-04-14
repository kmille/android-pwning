package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;

class AttributeStrategy
  implements LruPoolStrategy
{
  private final GroupedLinkedMap<Key, Bitmap> groupedMap = new GroupedLinkedMap();
  private final KeyPool keyPool = new KeyPool();
  
  static String getBitmapString(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("x");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append("], ");
    localStringBuilder.append(paramConfig);
    return localStringBuilder.toString();
  }
  
  private static String getBitmapString(Bitmap paramBitmap)
  {
    return getBitmapString(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
  }
  
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    paramConfig = this.keyPool.get(paramInt1, paramInt2, paramConfig);
    return (Bitmap)this.groupedMap.get(paramConfig);
  }
  
  public int getSize(Bitmap paramBitmap)
  {
    return Util.getBitmapByteSize(paramBitmap);
  }
  
  public String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getBitmapString(paramInt1, paramInt2, paramConfig);
  }
  
  public String logBitmap(Bitmap paramBitmap)
  {
    return getBitmapString(paramBitmap);
  }
  
  public void put(Bitmap paramBitmap)
  {
    Key localKey = this.keyPool.get(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    this.groupedMap.put(localKey, paramBitmap);
  }
  
  public Bitmap removeLast()
  {
    return (Bitmap)this.groupedMap.removeLast();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AttributeStrategy:\n  ");
    localStringBuilder.append(this.groupedMap);
    return localStringBuilder.toString();
  }
  
  @VisibleForTesting
  static class Key
    implements Poolable
  {
    private Bitmap.Config config;
    private int height;
    private final AttributeStrategy.KeyPool pool;
    private int width;
    
    public Key(AttributeStrategy.KeyPool paramKeyPool)
    {
      this.pool = paramKeyPool;
    }
    
    public boolean equals(Object paramObject)
    {
      if ((paramObject instanceof Key))
      {
        paramObject = (Key)paramObject;
        if ((this.width == ((Key)paramObject).width) && (this.height == ((Key)paramObject).height) && (this.config == ((Key)paramObject).config)) {
          return true;
        }
      }
      return false;
    }
    
    public int hashCode()
    {
      int j = this.width;
      int k = this.height;
      int i;
      if (this.config != null) {
        i = this.config.hashCode();
      } else {
        i = 0;
      }
      return (j * 31 + k) * 31 + i;
    }
    
    public void init(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
    {
      this.width = paramInt1;
      this.height = paramInt2;
      this.config = paramConfig;
    }
    
    public void offer()
    {
      this.pool.offer(this);
    }
    
    public String toString()
    {
      return AttributeStrategy.getBitmapString(this.width, this.height, this.config);
    }
  }
  
  @VisibleForTesting
  static class KeyPool
    extends BaseKeyPool<AttributeStrategy.Key>
  {
    protected AttributeStrategy.Key create()
    {
      return new AttributeStrategy.Key(this);
    }
    
    AttributeStrategy.Key get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
    {
      AttributeStrategy.Key localKey = (AttributeStrategy.Key)get();
      localKey.init(paramInt1, paramInt2, paramConfig);
      return localKey;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/AttributeStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */