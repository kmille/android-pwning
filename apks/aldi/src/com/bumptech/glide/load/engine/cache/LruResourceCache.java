package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

public class LruResourceCache
  extends LruCache<Key, Resource<?>>
  implements MemoryCache
{
  private MemoryCache.ResourceRemovedListener listener;
  
  public LruResourceCache(long paramLong)
  {
    super(paramLong);
  }
  
  protected int getSize(@Nullable Resource<?> paramResource)
  {
    if (paramResource == null) {
      return super.getSize(null);
    }
    return paramResource.getSize();
  }
  
  protected void onItemEvicted(@NonNull Key paramKey, @Nullable Resource<?> paramResource)
  {
    if ((this.listener != null) && (paramResource != null)) {
      this.listener.onResourceRemoved(paramResource);
    }
  }
  
  public void setResourceRemovedListener(@NonNull MemoryCache.ResourceRemovedListener paramResourceRemovedListener)
  {
    this.listener = paramResourceRemovedListener;
  }
  
  @SuppressLint({"InlinedApi"})
  public void trimMemory(int paramInt)
  {
    if (paramInt >= 40)
    {
      clearMemory();
      return;
    }
    if ((paramInt >= 20) || (paramInt == 15)) {
      trimToSize(getMaxSize() / 2L);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/LruResourceCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */