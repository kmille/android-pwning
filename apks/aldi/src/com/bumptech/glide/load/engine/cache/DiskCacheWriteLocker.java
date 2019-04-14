package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class DiskCacheWriteLocker
{
  private final Map<String, WriteLock> locks = new HashMap();
  private final WriteLockPool writeLockPool = new WriteLockPool();
  
  final void acquire(String paramString)
  {
    try
    {
      WriteLock localWriteLock2 = (WriteLock)this.locks.get(paramString);
      WriteLock localWriteLock1 = localWriteLock2;
      if (localWriteLock2 == null)
      {
        localWriteLock1 = this.writeLockPool.obtain();
        this.locks.put(paramString, localWriteLock1);
      }
      localWriteLock1.interestedThreads += 1;
      localWriteLock1.lock.lock();
      return;
    }
    finally {}
  }
  
  final void release(String paramString)
  {
    try
    {
      WriteLock localWriteLock = (WriteLock)Preconditions.checkNotNull(this.locks.get(paramString));
      if (localWriteLock.interestedThreads > 0)
      {
        localWriteLock.interestedThreads -= 1;
        if (localWriteLock.interestedThreads == 0)
        {
          localObject = (WriteLock)this.locks.remove(paramString);
          if (localObject.equals(localWriteLock))
          {
            this.writeLockPool.offer((WriteLock)localObject);
          }
          else
          {
            StringBuilder localStringBuilder = new StringBuilder("Removed the wrong lock, expected to remove: ");
            localStringBuilder.append(localWriteLock);
            localStringBuilder.append(", but actually removed: ");
            localStringBuilder.append(localObject);
            localStringBuilder.append(", safeKey: ");
            localStringBuilder.append(paramString);
            throw new IllegalStateException(localStringBuilder.toString());
          }
        }
        localWriteLock.lock.unlock();
        return;
      }
      Object localObject = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(", interestedThreads: ");
      ((StringBuilder)localObject).append(localWriteLock.interestedThreads);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    finally {}
  }
  
  static class WriteLock
  {
    int interestedThreads;
    final Lock lock = new ReentrantLock();
  }
  
  static class WriteLockPool
  {
    private static final int MAX_POOL_SIZE = 10;
    private final Queue<DiskCacheWriteLocker.WriteLock> pool = new ArrayDeque();
    
    DiskCacheWriteLocker.WriteLock obtain()
    {
      synchronized (this.pool)
      {
        DiskCacheWriteLocker.WriteLock localWriteLock = (DiskCacheWriteLocker.WriteLock)this.pool.poll();
        ??? = localWriteLock;
        if (localWriteLock == null) {
          ??? = new DiskCacheWriteLocker.WriteLock();
        }
        return (DiskCacheWriteLocker.WriteLock)???;
      }
    }
    
    void offer(DiskCacheWriteLocker.WriteLock paramWriteLock)
    {
      synchronized (this.pool)
      {
        if (this.pool.size() < 10) {
          this.pool.offer(paramWriteLock);
        }
        return;
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/cache/DiskCacheWriteLocker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */