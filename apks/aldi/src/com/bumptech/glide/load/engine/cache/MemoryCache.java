package com.bumptech.glide.load.engine.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public abstract interface MemoryCache
{
  public abstract void clearMemory();
  
  public abstract long getCurrentSize();
  
  public abstract long getMaxSize();
  
  @Nullable
  public abstract Resource<?> put(@NonNull Key paramKey, @Nullable Resource<?> paramResource);
  
  @Nullable
  public abstract Resource<?> remove(@NonNull Key paramKey);
  
  public abstract void setResourceRemovedListener(@NonNull ResourceRemovedListener paramResourceRemovedListener);
  
  public abstract void setSizeMultiplier(float paramFloat);
  
  public abstract void trimMemory(int paramInt);
  
  public static abstract interface ResourceRemovedListener
  {
    public abstract void onResourceRemoved(@NonNull Resource<?> paramResource);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/MemoryCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */