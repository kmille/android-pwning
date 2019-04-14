package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

final class ActiveResources
{
  private static final int MSG_CLEAN_REF = 1;
  @VisibleForTesting
  final Map<Key, ResourceWeakReference> activeEngineResources = new HashMap();
  @Nullable
  private volatile DequeuedResourceCallback cb;
  @Nullable
  private Thread cleanReferenceQueueThread;
  private final boolean isActiveResourceRetentionAllowed;
  private volatile boolean isShutdown;
  private EngineResource.ResourceListener listener;
  private final Handler mainHandler = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public boolean handleMessage(Message paramAnonymousMessage)
    {
      if (paramAnonymousMessage.what == 1)
      {
        ActiveResources.this.cleanupActiveReference((ActiveResources.ResourceWeakReference)paramAnonymousMessage.obj);
        return true;
      }
      return false;
    }
  });
  @Nullable
  private ReferenceQueue<EngineResource<?>> resourceReferenceQueue;
  
  ActiveResources(boolean paramBoolean)
  {
    this.isActiveResourceRetentionAllowed = paramBoolean;
  }
  
  private ReferenceQueue<EngineResource<?>> getReferenceQueue()
  {
    if (this.resourceReferenceQueue == null)
    {
      this.resourceReferenceQueue = new ReferenceQueue();
      this.cleanReferenceQueueThread = new Thread(new Runnable()
      {
        public void run()
        {
          Process.setThreadPriority(10);
          ActiveResources.this.cleanReferenceQueue();
        }
      }, "glide-active-resources");
      this.cleanReferenceQueueThread.start();
    }
    return this.resourceReferenceQueue;
  }
  
  final void activate(Key paramKey, EngineResource<?> paramEngineResource)
  {
    paramEngineResource = new ResourceWeakReference(paramKey, paramEngineResource, getReferenceQueue(), this.isActiveResourceRetentionAllowed);
    paramKey = (ResourceWeakReference)this.activeEngineResources.put(paramKey, paramEngineResource);
    if (paramKey != null) {
      paramKey.reset();
    }
  }
  
  final void cleanReferenceQueue()
  {
    while (!this.isShutdown)
    {
      try
      {
        Object localObject = (ResourceWeakReference)this.resourceReferenceQueue.remove();
        this.mainHandler.obtainMessage(1, localObject).sendToTarget();
        localObject = this.cb;
        if (localObject == null) {
          continue;
        }
        ((DequeuedResourceCallback)localObject).onResourceDequeued();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      Thread.currentThread().interrupt();
    }
  }
  
  final void cleanupActiveReference(@NonNull ResourceWeakReference paramResourceWeakReference)
  {
    Util.assertMainThread();
    this.activeEngineResources.remove(paramResourceWeakReference.key);
    if (paramResourceWeakReference.isCacheable)
    {
      if (paramResourceWeakReference.resource == null) {
        return;
      }
      EngineResource localEngineResource = new EngineResource(paramResourceWeakReference.resource, true, false);
      localEngineResource.setResourceListener(paramResourceWeakReference.key, this.listener);
      this.listener.onResourceReleased(paramResourceWeakReference.key, localEngineResource);
    }
  }
  
  final void deactivate(Key paramKey)
  {
    paramKey = (ResourceWeakReference)this.activeEngineResources.remove(paramKey);
    if (paramKey != null) {
      paramKey.reset();
    }
  }
  
  @Nullable
  final EngineResource<?> get(Key paramKey)
  {
    paramKey = (ResourceWeakReference)this.activeEngineResources.get(paramKey);
    if (paramKey == null) {
      return null;
    }
    EngineResource localEngineResource = (EngineResource)paramKey.get();
    if (localEngineResource == null) {
      cleanupActiveReference(paramKey);
    }
    return localEngineResource;
  }
  
  @VisibleForTesting
  final void setDequeuedResourceCallback(DequeuedResourceCallback paramDequeuedResourceCallback)
  {
    this.cb = paramDequeuedResourceCallback;
  }
  
  final void setListener(EngineResource.ResourceListener paramResourceListener)
  {
    this.listener = paramResourceListener;
  }
  
  @VisibleForTesting
  final void shutdown()
  {
    this.isShutdown = true;
    if (this.cleanReferenceQueueThread == null) {
      return;
    }
    this.cleanReferenceQueueThread.interrupt();
    try
    {
      this.cleanReferenceQueueThread.join(TimeUnit.SECONDS.toMillis(5L));
      if (!this.cleanReferenceQueueThread.isAlive()) {
        return;
      }
      throw new RuntimeException("Failed to join in time");
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    Thread.currentThread().interrupt();
  }
  
  @VisibleForTesting
  static abstract interface DequeuedResourceCallback
  {
    public abstract void onResourceDequeued();
  }
  
  @VisibleForTesting
  static final class ResourceWeakReference
    extends WeakReference<EngineResource<?>>
  {
    final boolean isCacheable;
    final Key key;
    @Nullable
    Resource<?> resource;
    
    ResourceWeakReference(@NonNull Key paramKey, @NonNull EngineResource<?> paramEngineResource, @NonNull ReferenceQueue<? super EngineResource<?>> paramReferenceQueue, boolean paramBoolean)
    {
      super(paramReferenceQueue);
      this.key = ((Key)Preconditions.checkNotNull(paramKey));
      if ((paramEngineResource.isCacheable()) && (paramBoolean)) {
        paramKey = (Resource)Preconditions.checkNotNull(paramEngineResource.getResource());
      } else {
        paramKey = null;
      }
      this.resource = paramKey;
      this.isCacheable = paramEngineResource.isCacheable();
    }
    
    final void reset()
    {
      this.resource = null;
      clear();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/ActiveResources.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */