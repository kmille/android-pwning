package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import android.support.annotation.Nullable;
import java.io.File;

public final class ExternalPreferredCacheDiskCacheFactory
  extends DiskLruCacheFactory
{
  public ExternalPreferredCacheDiskCacheFactory(Context paramContext)
  {
    this(paramContext, "image_manager_disk_cache", 262144000L);
  }
  
  public ExternalPreferredCacheDiskCacheFactory(Context paramContext, long paramLong)
  {
    this(paramContext, "image_manager_disk_cache", paramLong);
  }
  
  public ExternalPreferredCacheDiskCacheFactory(Context paramContext, final String paramString, long paramLong)
  {
    super(new DiskLruCacheFactory.CacheDirectoryGetter()
    {
      @Nullable
      private File getInternalCacheDirectory()
      {
        File localFile = ExternalPreferredCacheDiskCacheFactory.this.getCacheDir();
        if (localFile == null) {
          return null;
        }
        if (paramString != null) {
          return new File(localFile, paramString);
        }
        return localFile;
      }
      
      public File getCacheDirectory()
      {
        File localFile1 = getInternalCacheDirectory();
        if ((localFile1 != null) && (localFile1.exists())) {
          return localFile1;
        }
        File localFile2 = ExternalPreferredCacheDiskCacheFactory.this.getExternalCacheDir();
        if (localFile2 != null)
        {
          if (!localFile2.canWrite()) {
            return localFile1;
          }
          if (paramString != null) {
            return new File(localFile2, paramString);
          }
          return localFile2;
        }
        return localFile1;
      }
    }, paramLong);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/ExternalPreferredCacheDiskCacheFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */