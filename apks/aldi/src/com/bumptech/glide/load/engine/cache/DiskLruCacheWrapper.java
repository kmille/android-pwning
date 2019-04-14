package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.disklrucache.DiskLruCache.Editor;
import com.bumptech.glide.disklrucache.DiskLruCache.Value;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;

public class DiskLruCacheWrapper
  implements DiskCache
{
  private static final int APP_VERSION = 1;
  private static final String TAG = "DiskLruCacheWrapper";
  private static final int VALUE_COUNT = 1;
  private static DiskLruCacheWrapper wrapper;
  private final File directory;
  private DiskLruCache diskLruCache;
  private final long maxSize;
  private final SafeKeyGenerator safeKeyGenerator;
  private final DiskCacheWriteLocker writeLocker = new DiskCacheWriteLocker();
  
  @Deprecated
  protected DiskLruCacheWrapper(File paramFile, long paramLong)
  {
    this.directory = paramFile;
    this.maxSize = paramLong;
    this.safeKeyGenerator = new SafeKeyGenerator();
  }
  
  public static DiskCache create(File paramFile, long paramLong)
  {
    return new DiskLruCacheWrapper(paramFile, paramLong);
  }
  
  @Deprecated
  public static DiskCache get(File paramFile, long paramLong)
  {
    try
    {
      if (wrapper == null) {
        wrapper = new DiskLruCacheWrapper(paramFile, paramLong);
      }
      paramFile = wrapper;
      return paramFile;
    }
    finally {}
  }
  
  private DiskLruCache getDiskCache()
    throws IOException
  {
    try
    {
      if (this.diskLruCache == null) {
        this.diskLruCache = DiskLruCache.open(this.directory, 1, 1, this.maxSize);
      }
      DiskLruCache localDiskLruCache = this.diskLruCache;
      return localDiskLruCache;
    }
    finally {}
  }
  
  private void resetDiskCache()
  {
    try
    {
      this.diskLruCache = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void clear()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 72	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:getDiskCache	()Lcom/bumptech/glide/disklrucache/DiskLruCache;
    //   6: invokevirtual 75	com/bumptech/glide/disklrucache/DiskLruCache:delete	()V
    //   9: aload_0
    //   10: invokespecial 77	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:resetDiskCache	()V
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: goto +17 -> 34
    //   20: ldc 13
    //   22: iconst_5
    //   23: invokestatic 83	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   26: pop
    //   27: aload_0
    //   28: invokespecial 77	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:resetDiskCache	()V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: invokespecial 77	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:resetDiskCache	()V
    //   38: aload_1
    //   39: athrow
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore_1
    //   46: goto -26 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	DiskLruCacheWrapper
    //   16	23	1	localObject1	Object
    //   40	4	1	localObject2	Object
    //   45	1	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   2	9	16	finally
    //   20	27	16	finally
    //   9	13	40	finally
    //   27	31	40	finally
    //   34	40	40	finally
    //   2	9	45	java/io/IOException
  }
  
  public void delete(Key paramKey)
  {
    paramKey = this.safeKeyGenerator.getSafeKey(paramKey);
    try
    {
      getDiskCache().remove(paramKey);
      return;
    }
    catch (IOException paramKey)
    {
      for (;;) {}
    }
    Log.isLoggable("DiskLruCacheWrapper", 5);
  }
  
  public File get(Key paramKey)
  {
    String str = this.safeKeyGenerator.getSafeKey(paramKey);
    if (Log.isLoggable("DiskLruCacheWrapper", 2))
    {
      StringBuilder localStringBuilder = new StringBuilder("Get: Obtained: ");
      localStringBuilder.append(str);
      localStringBuilder.append(" for for Key: ");
      localStringBuilder.append(paramKey);
    }
    try
    {
      paramKey = getDiskCache().get(str);
      if (paramKey == null) {
        break label75;
      }
      paramKey = paramKey.getFile(0);
      return paramKey;
    }
    catch (IOException paramKey)
    {
      label75:
      for (;;) {}
    }
    Log.isLoggable("DiskLruCacheWrapper", 5);
    return null;
  }
  
  public void put(Key paramKey, DiskCache.Writer paramWriter)
  {
    str = this.safeKeyGenerator.getSafeKey(paramKey);
    this.writeLocker.acquire(str);
    for (;;)
    {
      try
      {
        if (Log.isLoggable("DiskLruCacheWrapper", 2))
        {
          localObject = new StringBuilder("Put: Obtained: ");
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(" for for Key: ");
          ((StringBuilder)localObject).append(paramKey);
        }
      }
      finally
      {
        Object localObject;
        this.writeLocker.release(str);
      }
      try
      {
        paramKey = getDiskCache();
        localObject = paramKey.get(str);
        if (localObject != null)
        {
          this.writeLocker.release(str);
          return;
        }
        paramKey = paramKey.edit(str);
        if (paramKey != null) {}
        try
        {
          if (paramWriter.write(paramKey.getFile(0))) {
            paramKey.commit();
          }
          paramKey.abortUnlessCommitted();
        }
        finally
        {
          paramKey.abortUnlessCommitted();
        }
      }
      catch (IOException paramKey)
      {
        continue;
      }
      Log.isLoggable("DiskLruCacheWrapper", 5);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */