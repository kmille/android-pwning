package com.bumptech.glide.load.engine;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

class EngineResource<Z>
  implements Resource<Z>
{
  private int acquired;
  private final boolean isCacheable;
  private final boolean isRecyclable;
  private boolean isRecycled;
  private Key key;
  private ResourceListener listener;
  private final Resource<Z> resource;
  
  EngineResource(Resource<Z> paramResource, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.resource = ((Resource)Preconditions.checkNotNull(paramResource));
    this.isCacheable = paramBoolean1;
    this.isRecyclable = paramBoolean2;
  }
  
  void acquire()
  {
    if (!this.isRecycled)
    {
      if (Looper.getMainLooper().equals(Looper.myLooper()))
      {
        this.acquired += 1;
        return;
      }
      throw new IllegalThreadStateException("Must call acquire on the main thread");
    }
    throw new IllegalStateException("Cannot acquire a recycled resource");
  }
  
  @NonNull
  public Z get()
  {
    return (Z)this.resource.get();
  }
  
  Resource<Z> getResource()
  {
    return this.resource;
  }
  
  @NonNull
  public Class<Z> getResourceClass()
  {
    return this.resource.getResourceClass();
  }
  
  public int getSize()
  {
    return this.resource.getSize();
  }
  
  boolean isCacheable()
  {
    return this.isCacheable;
  }
  
  public void recycle()
  {
    if (this.acquired <= 0)
    {
      if (!this.isRecycled)
      {
        this.isRecycled = true;
        if (this.isRecyclable) {
          this.resource.recycle();
        }
        return;
      }
      throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
    }
    throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
  }
  
  void release()
  {
    if (this.acquired > 0)
    {
      if (Looper.getMainLooper().equals(Looper.myLooper()))
      {
        int i = this.acquired - 1;
        this.acquired = i;
        if (i == 0) {
          this.listener.onResourceReleased(this.key, this);
        }
        return;
      }
      throw new IllegalThreadStateException("Must call release on the main thread");
    }
    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
  }
  
  void setResourceListener(Key paramKey, ResourceListener paramResourceListener)
  {
    this.key = paramKey;
    this.listener = paramResourceListener;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("EngineResource{isCacheable=");
    localStringBuilder.append(this.isCacheable);
    localStringBuilder.append(", listener=");
    localStringBuilder.append(this.listener);
    localStringBuilder.append(", key=");
    localStringBuilder.append(this.key);
    localStringBuilder.append(", acquired=");
    localStringBuilder.append(this.acquired);
    localStringBuilder.append(", isRecycled=");
    localStringBuilder.append(this.isRecycled);
    localStringBuilder.append(", resource=");
    localStringBuilder.append(this.resource);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  static abstract interface ResourceListener
  {
    public abstract void onResourceReleased(Key paramKey, EngineResource<?> paramEngineResource);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/EngineResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */