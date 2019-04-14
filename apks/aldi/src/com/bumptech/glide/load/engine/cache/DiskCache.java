package com.bumptech.glide.load.engine.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.io.File;

public abstract interface DiskCache
{
  public abstract void clear();
  
  public abstract void delete(Key paramKey);
  
  @Nullable
  public abstract File get(Key paramKey);
  
  public abstract void put(Key paramKey, Writer paramWriter);
  
  public static abstract interface Factory
  {
    public static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;
    
    @Nullable
    public abstract DiskCache build();
  }
  
  public static abstract interface Writer
  {
    public abstract boolean write(@NonNull File paramFile);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/DiskCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */