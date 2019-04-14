package com.bumptech.glide.load.engine.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public class MemoryCacheAdapter
  implements MemoryCache
{
  private MemoryCache.ResourceRemovedListener listener;
  
  public void clearMemory() {}
  
  public long getCurrentSize()
  {
    return 0L;
  }
  
  public long getMaxSize()
  {
    return 0L;
  }
  
  @Nullable
  public Resource<?> put(@NonNull Key paramKey, @Nullable Resource<?> paramResource)
  {
    if (paramResource != null) {
      this.listener.onResourceRemoved(paramResource);
    }
    return null;
  }
  
  @Nullable
  public Resource<?> remove(@NonNull Key paramKey)
  {
    return null;
  }
  
  public void setResourceRemovedListener(@NonNull MemoryCache.ResourceRemovedListener paramResourceRemovedListener)
  {
    this.listener = paramResourceRemovedListener;
  }
  
  public void setSizeMultiplier(float paramFloat) {}
  
  public void trimMemory(int paramInt) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/MemoryCacheAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */