package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.v4.util.Pools.Pool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Factory;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;

final class LockedResource<Z>
  implements Resource<Z>, FactoryPools.Poolable
{
  private static final Pools.Pool<LockedResource<?>> POOL = FactoryPools.threadSafe(20, new FactoryPools.Factory()
  {
    public LockedResource<?> create()
    {
      return new LockedResource();
    }
  });
  private boolean isLocked;
  private boolean isRecycled;
  private final StateVerifier stateVerifier = StateVerifier.newInstance();
  private Resource<Z> toWrap;
  
  private void init(Resource<Z> paramResource)
  {
    this.isRecycled = false;
    this.isLocked = true;
    this.toWrap = paramResource;
  }
  
  @NonNull
  static <Z> LockedResource<Z> obtain(Resource<Z> paramResource)
  {
    LockedResource localLockedResource = (LockedResource)Preconditions.checkNotNull((LockedResource)POOL.acquire());
    localLockedResource.init(paramResource);
    return localLockedResource;
  }
  
  private void release()
  {
    this.toWrap = null;
    POOL.release(this);
  }
  
  @NonNull
  public final Z get()
  {
    return (Z)this.toWrap.get();
  }
  
  @NonNull
  public final Class<Z> getResourceClass()
  {
    return this.toWrap.getResourceClass();
  }
  
  public final int getSize()
  {
    return this.toWrap.getSize();
  }
  
  @NonNull
  public final StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
  
  public final void recycle()
  {
    try
    {
      this.stateVerifier.throwIfRecycled();
      this.isRecycled = true;
      if (!this.isLocked)
      {
        this.toWrap.recycle();
        release();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void unlock()
  {
    try
    {
      this.stateVerifier.throwIfRecycled();
      if (this.isLocked)
      {
        this.isLocked = false;
        if (this.isRecycled) {
          recycle();
        }
        return;
      }
      throw new IllegalStateException("Already unlocked");
    }
    finally {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/LockedResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */