package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

@RequiresApi(19)
public class SizeConfigStrategy
  implements LruPoolStrategy
{
  private static final Bitmap.Config[] ALPHA_8_IN_CONFIGS = { Bitmap.Config.ALPHA_8 };
  private static final Bitmap.Config[] ARGB_4444_IN_CONFIGS;
  private static final Bitmap.Config[] ARGB_8888_IN_CONFIGS;
  private static final int MAX_SIZE_MULTIPLE = 8;
  private static final Bitmap.Config[] RGBA_F16_IN_CONFIGS;
  private static final Bitmap.Config[] RGB_565_IN_CONFIGS;
  private final GroupedLinkedMap<Key, Bitmap> groupedMap = new GroupedLinkedMap();
  private final KeyPool keyPool = new KeyPool();
  private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> sortedSizes = new HashMap();
  
  static
  {
    Bitmap.Config[] arrayOfConfig2 = new Bitmap.Config[2];
    arrayOfConfig2[0] = Bitmap.Config.ARGB_8888;
    arrayOfConfig2[1] = null;
    Bitmap.Config[] arrayOfConfig1 = arrayOfConfig2;
    if (Build.VERSION.SDK_INT >= 26)
    {
      arrayOfConfig1 = (Bitmap.Config[])Arrays.copyOf(arrayOfConfig2, 3);
      arrayOfConfig1[(arrayOfConfig1.length - 1)] = Bitmap.Config.RGBA_F16;
    }
    ARGB_8888_IN_CONFIGS = arrayOfConfig1;
    RGBA_F16_IN_CONFIGS = arrayOfConfig1;
    RGB_565_IN_CONFIGS = new Bitmap.Config[] { Bitmap.Config.RGB_565 };
    ARGB_4444_IN_CONFIGS = new Bitmap.Config[] { Bitmap.Config.ARGB_4444 };
  }
  
  private void decrementBitmapOfSize(Integer paramInteger, Bitmap paramBitmap)
  {
    Object localObject = getSizesForConfig(paramBitmap.getConfig());
    Integer localInteger = (Integer)((NavigableMap)localObject).get(paramInteger);
    if (localInteger != null)
    {
      if (localInteger.intValue() == 1)
      {
        ((NavigableMap)localObject).remove(paramInteger);
        return;
      }
      ((NavigableMap)localObject).put(paramInteger, Integer.valueOf(localInteger.intValue() - 1));
      return;
    }
    localObject = new StringBuilder("Tried to decrement empty size, size: ");
    ((StringBuilder)localObject).append(paramInteger);
    ((StringBuilder)localObject).append(", removed: ");
    ((StringBuilder)localObject).append(logBitmap(paramBitmap));
    ((StringBuilder)localObject).append(", this: ");
    ((StringBuilder)localObject).append(this);
    throw new NullPointerException(((StringBuilder)localObject).toString());
  }
  
  private Key findBestKey(int paramInt, Bitmap.Config paramConfig)
  {
    Key localKey = this.keyPool.get(paramInt, paramConfig);
    Bitmap.Config[] arrayOfConfig = getInConfigs(paramConfig);
    int j = arrayOfConfig.length;
    int i = 0;
    while (i < j)
    {
      Bitmap.Config localConfig = arrayOfConfig[i];
      Integer localInteger = (Integer)getSizesForConfig(localConfig).ceilingKey(Integer.valueOf(paramInt));
      if ((localInteger != null) && (localInteger.intValue() <= paramInt * 8))
      {
        if ((localInteger.intValue() == paramInt) && (localConfig == null ? paramConfig == null : localConfig.equals(paramConfig))) {
          break;
        }
        this.keyPool.offer(localKey);
        return this.keyPool.get(localInteger.intValue(), localConfig);
      }
      i += 1;
    }
    return localKey;
  }
  
  static String getBitmapString(int paramInt, Bitmap.Config paramConfig)
  {
    StringBuilder localStringBuilder = new StringBuilder("[");
    localStringBuilder.append(paramInt);
    localStringBuilder.append("](");
    localStringBuilder.append(paramConfig);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  private static Bitmap.Config[] getInConfigs(Bitmap.Config paramConfig)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (Bitmap.Config.RGBA_F16.equals(paramConfig))) {
      return RGBA_F16_IN_CONFIGS;
    }
    switch (paramConfig)
    {
    default: 
      return new Bitmap.Config[] { paramConfig };
    case ???: 
      return ALPHA_8_IN_CONFIGS;
    case ???: 
      return ARGB_4444_IN_CONFIGS;
    case ???: 
      return RGB_565_IN_CONFIGS;
    }
    return ARGB_8888_IN_CONFIGS;
  }
  
  private NavigableMap<Integer, Integer> getSizesForConfig(Bitmap.Config paramConfig)
  {
    NavigableMap localNavigableMap = (NavigableMap)this.sortedSizes.get(paramConfig);
    Object localObject = localNavigableMap;
    if (localNavigableMap == null)
    {
      localObject = new TreeMap();
      this.sortedSizes.put(paramConfig, localObject);
    }
    return (NavigableMap<Integer, Integer>)localObject;
  }
  
  @Nullable
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    paramConfig = findBestKey(Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig), paramConfig);
    Bitmap localBitmap = (Bitmap)this.groupedMap.get(paramConfig);
    if (localBitmap != null)
    {
      decrementBitmapOfSize(Integer.valueOf(paramConfig.size), localBitmap);
      if (localBitmap.getConfig() != null) {
        paramConfig = localBitmap.getConfig();
      } else {
        paramConfig = Bitmap.Config.ARGB_8888;
      }
      localBitmap.reconfigure(paramInt1, paramInt2, paramConfig);
    }
    return localBitmap;
  }
  
  public int getSize(Bitmap paramBitmap)
  {
    return Util.getBitmapByteSize(paramBitmap);
  }
  
  public String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getBitmapString(Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig), paramConfig);
  }
  
  public String logBitmap(Bitmap paramBitmap)
  {
    return getBitmapString(Util.getBitmapByteSize(paramBitmap), paramBitmap.getConfig());
  }
  
  public void put(Bitmap paramBitmap)
  {
    int i = Util.getBitmapByteSize(paramBitmap);
    Key localKey = this.keyPool.get(i, paramBitmap.getConfig());
    this.groupedMap.put(localKey, paramBitmap);
    paramBitmap = getSizesForConfig(paramBitmap.getConfig());
    Integer localInteger = (Integer)paramBitmap.get(Integer.valueOf(localKey.size));
    int j = localKey.size;
    i = 1;
    if (localInteger != null) {
      i = 1 + localInteger.intValue();
    }
    paramBitmap.put(Integer.valueOf(j), Integer.valueOf(i));
  }
  
  @Nullable
  public Bitmap removeLast()
  {
    Bitmap localBitmap = (Bitmap)this.groupedMap.removeLast();
    if (localBitmap != null) {
      decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(localBitmap)), localBitmap);
    }
    return localBitmap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("SizeConfigStrategy{groupedMap=");
    localStringBuilder.append(this.groupedMap);
    localStringBuilder.append(", sortedSizes=(");
    Iterator localIterator = this.sortedSizes.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('[');
      localStringBuilder.append(localEntry.getValue());
      localStringBuilder.append("], ");
    }
    if (!this.sortedSizes.isEmpty()) {
      localStringBuilder.replace(localStringBuilder.length() - 2, localStringBuilder.length(), "");
    }
    localStringBuilder.append(")}");
    return localStringBuilder.toString();
  }
  
  @VisibleForTesting
  static final class Key
    implements Poolable
  {
    private Bitmap.Config config;
    private final SizeConfigStrategy.KeyPool pool;
    int size;
    
    public Key(SizeConfigStrategy.KeyPool paramKeyPool)
    {
      this.pool = paramKeyPool;
    }
    
    @VisibleForTesting
    Key(SizeConfigStrategy.KeyPool paramKeyPool, int paramInt, Bitmap.Config paramConfig)
    {
      this(paramKeyPool);
      init(paramInt, paramConfig);
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof Key))
      {
        paramObject = (Key)paramObject;
        if ((this.size == ((Key)paramObject).size) && (Util.bothNullOrEqual(this.config, ((Key)paramObject).config))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      int j = this.size;
      int i;
      if (this.config != null) {
        i = this.config.hashCode();
      } else {
        i = 0;
      }
      return j * 31 + i;
    }
    
    public final void init(int paramInt, Bitmap.Config paramConfig)
    {
      this.size = paramInt;
      this.config = paramConfig;
    }
    
    public final void offer()
    {
      this.pool.offer(this);
    }
    
    public final String toString()
    {
      return SizeConfigStrategy.getBitmapString(this.size, this.config);
    }
  }
  
  @VisibleForTesting
  static class KeyPool
    extends BaseKeyPool<SizeConfigStrategy.Key>
  {
    protected SizeConfigStrategy.Key create()
    {
      return new SizeConfigStrategy.Key(this);
    }
    
    public SizeConfigStrategy.Key get(int paramInt, Bitmap.Config paramConfig)
    {
      SizeConfigStrategy.Key localKey = (SizeConfigStrategy.Key)get();
      localKey.init(paramInt, paramConfig);
      return localKey;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/bitmap_recycle/SizeConfigStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */