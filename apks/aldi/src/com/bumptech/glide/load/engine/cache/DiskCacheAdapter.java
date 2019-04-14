package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

public class DiskCacheAdapter
  implements DiskCache
{
  public void clear() {}
  
  public void delete(Key paramKey) {}
  
  public File get(Key paramKey)
  {
    return null;
  }
  
  public void put(Key paramKey, DiskCache.Writer paramWriter) {}
  
  public static final class Factory
    implements DiskCache.Factory
  {
    public final DiskCache build()
    {
      return new DiskCacheAdapter();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/DiskCacheAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */