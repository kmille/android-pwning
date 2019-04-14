package com.bumptech.glide.load.engine.cache;

import java.io.File;

public class DiskLruCacheFactory
  implements DiskCache.Factory
{
  private final CacheDirectoryGetter cacheDirectoryGetter;
  private final long diskCacheSize;
  
  public DiskLruCacheFactory(CacheDirectoryGetter paramCacheDirectoryGetter, long paramLong)
  {
    this.diskCacheSize = paramLong;
    this.cacheDirectoryGetter = paramCacheDirectoryGetter;
  }
  
  public DiskLruCacheFactory(String paramString, long paramLong)
  {
    this(new CacheDirectoryGetter()
    {
      public File getCacheDirectory()
      {
        return new File(DiskLruCacheFactory.this);
      }
    }, paramLong);
  }
  
  public DiskLruCacheFactory(String paramString1, final String paramString2, long paramLong)
  {
    this(new CacheDirectoryGetter()
    {
      public File getCacheDirectory()
      {
        return new File(DiskLruCacheFactory.this, paramString2);
      }
    }, paramLong);
  }
  
  public DiskCache build()
  {
    File localFile = this.cacheDirectoryGetter.getCacheDirectory();
    if (localFile == null) {
      return null;
    }
    if ((!localFile.mkdirs()) && ((!localFile.exists()) || (!localFile.isDirectory()))) {
      return null;
    }
    return DiskLruCacheWrapper.create(localFile, this.diskCacheSize);
  }
  
  public static abstract interface CacheDirectoryGetter
  {
    public abstract File getCacheDirectory();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/DiskLruCacheFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */