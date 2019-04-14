package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

public class ModelCache<A, B>
{
  private static final int DEFAULT_SIZE = 250;
  private final LruCache<ModelKey<A>, B> cache;
  
  public ModelCache()
  {
    this(250L);
  }
  
  public ModelCache(long paramLong)
  {
    this.cache = new LruCache(paramLong)
    {
      protected void onItemEvicted(@NonNull ModelCache.ModelKey<A> paramAnonymousModelKey, @Nullable B paramAnonymousB)
      {
        paramAnonymousModelKey.release();
      }
    };
  }
  
  public void clear()
  {
    this.cache.clearMemory();
  }
  
  @Nullable
  public B get(A paramA, int paramInt1, int paramInt2)
  {
    paramA = ModelKey.get(paramA, paramInt1, paramInt2);
    Object localObject = this.cache.get(paramA);
    paramA.release();
    return (B)localObject;
  }
  
  public void put(A paramA, int paramInt1, int paramInt2, B paramB)
  {
    paramA = ModelKey.get(paramA, paramInt1, paramInt2);
    this.cache.put(paramA, paramB);
  }
  
  @VisibleForTesting
  static final class ModelKey<A>
  {
    private static final Queue<ModelKey<?>> KEY_QUEUE = Util.createQueue(0);
    private int height;
    private A model;
    private int width;
    
    static <A> ModelKey<A> get(A paramA, int paramInt1, int paramInt2)
    {
      synchronized (KEY_QUEUE)
      {
        ModelKey localModelKey = (ModelKey)KEY_QUEUE.poll();
        ??? = localModelKey;
        if (localModelKey == null) {
          ??? = new ModelKey();
        }
        ((ModelKey)???).init(paramA, paramInt1, paramInt2);
        return (ModelKey<A>)???;
      }
    }
    
    private void init(A paramA, int paramInt1, int paramInt2)
    {
      this.model = paramA;
      this.width = paramInt1;
      this.height = paramInt2;
    }
    
    public final boolean equals(Object paramObject)
    {
      if ((paramObject instanceof ModelKey))
      {
        paramObject = (ModelKey)paramObject;
        if ((this.width == ((ModelKey)paramObject).width) && (this.height == ((ModelKey)paramObject).height) && (this.model.equals(((ModelKey)paramObject).model))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return (this.height * 31 + this.width) * 31 + this.model.hashCode();
    }
    
    public final void release()
    {
      synchronized (KEY_QUEUE)
      {
        KEY_QUEUE.offer(this);
        return;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/model/ModelCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */