package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.Pools.Pool;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EngineJob<R>
  implements DecodeJob.Callback<R>, FactoryPools.Poolable
{
  private static final EngineResourceFactory DEFAULT_FACTORY = new EngineResourceFactory();
  private static final Handler MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper(), new MainThreadCallback());
  private static final int MSG_CANCELLED = 3;
  private static final int MSG_COMPLETE = 1;
  private static final int MSG_EXCEPTION = 2;
  private final GlideExecutor animationExecutor;
  private final List<ResourceCallback> cbs = new ArrayList(2);
  private DataSource dataSource;
  private DecodeJob<R> decodeJob;
  private final GlideExecutor diskCacheExecutor;
  private EngineResource<?> engineResource;
  private final EngineResourceFactory engineResourceFactory;
  private GlideException exception;
  private boolean hasLoadFailed;
  private boolean hasResource;
  private List<ResourceCallback> ignoredCallbacks;
  private boolean isCacheable;
  private volatile boolean isCancelled;
  private Key key;
  private final EngineJobListener listener;
  private boolean onlyRetrieveFromCache;
  private final Pools.Pool<EngineJob<?>> pool;
  private Resource<?> resource;
  private final GlideExecutor sourceExecutor;
  private final GlideExecutor sourceUnlimitedExecutor;
  private final StateVerifier stateVerifier = StateVerifier.newInstance();
  private boolean useAnimationPool;
  private boolean useUnlimitedSourceGeneratorPool;
  
  EngineJob(GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, EngineJobListener paramEngineJobListener, Pools.Pool<EngineJob<?>> paramPool)
  {
    this(paramGlideExecutor1, paramGlideExecutor2, paramGlideExecutor3, paramGlideExecutor4, paramEngineJobListener, paramPool, DEFAULT_FACTORY);
  }
  
  @VisibleForTesting
  EngineJob(GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, EngineJobListener paramEngineJobListener, Pools.Pool<EngineJob<?>> paramPool, EngineResourceFactory paramEngineResourceFactory)
  {
    this.diskCacheExecutor = paramGlideExecutor1;
    this.sourceExecutor = paramGlideExecutor2;
    this.sourceUnlimitedExecutor = paramGlideExecutor3;
    this.animationExecutor = paramGlideExecutor4;
    this.listener = paramEngineJobListener;
    this.pool = paramPool;
    this.engineResourceFactory = paramEngineResourceFactory;
  }
  
  private void addIgnoredCallback(ResourceCallback paramResourceCallback)
  {
    if (this.ignoredCallbacks == null) {
      this.ignoredCallbacks = new ArrayList(2);
    }
    if (!this.ignoredCallbacks.contains(paramResourceCallback)) {
      this.ignoredCallbacks.add(paramResourceCallback);
    }
  }
  
  private GlideExecutor getActiveSourceExecutor()
  {
    if (this.useUnlimitedSourceGeneratorPool) {
      return this.sourceUnlimitedExecutor;
    }
    if (this.useAnimationPool) {
      return this.animationExecutor;
    }
    return this.sourceExecutor;
  }
  
  private boolean isInIgnoredCallbacks(ResourceCallback paramResourceCallback)
  {
    return (this.ignoredCallbacks != null) && (this.ignoredCallbacks.contains(paramResourceCallback));
  }
  
  private void release(boolean paramBoolean)
  {
    Util.assertMainThread();
    this.cbs.clear();
    this.key = null;
    this.engineResource = null;
    this.resource = null;
    if (this.ignoredCallbacks != null) {
      this.ignoredCallbacks.clear();
    }
    this.hasLoadFailed = false;
    this.isCancelled = false;
    this.hasResource = false;
    this.decodeJob.release(paramBoolean);
    this.decodeJob = null;
    this.exception = null;
    this.dataSource = null;
    this.pool.release(this);
  }
  
  void addCallback(ResourceCallback paramResourceCallback)
  {
    Util.assertMainThread();
    this.stateVerifier.throwIfRecycled();
    if (this.hasResource)
    {
      paramResourceCallback.onResourceReady(this.engineResource, this.dataSource);
      return;
    }
    if (this.hasLoadFailed)
    {
      paramResourceCallback.onLoadFailed(this.exception);
      return;
    }
    this.cbs.add(paramResourceCallback);
  }
  
  void cancel()
  {
    if ((!this.hasLoadFailed) && (!this.hasResource))
    {
      if (this.isCancelled) {
        return;
      }
      this.isCancelled = true;
      this.decodeJob.cancel();
      this.listener.onEngineJobCancelled(this, this.key);
    }
  }
  
  @NonNull
  public StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
  
  void handleCancelledOnMainThread()
  {
    this.stateVerifier.throwIfRecycled();
    if (this.isCancelled)
    {
      this.listener.onEngineJobCancelled(this, this.key);
      release(false);
      return;
    }
    throw new IllegalStateException("Not cancelled");
  }
  
  void handleExceptionOnMainThread()
  {
    this.stateVerifier.throwIfRecycled();
    if (this.isCancelled)
    {
      release(false);
      return;
    }
    if (!this.cbs.isEmpty())
    {
      if (!this.hasLoadFailed)
      {
        this.hasLoadFailed = true;
        this.listener.onEngineJobComplete(this, this.key, null);
        Iterator localIterator = this.cbs.iterator();
        while (localIterator.hasNext())
        {
          ResourceCallback localResourceCallback = (ResourceCallback)localIterator.next();
          if (!isInIgnoredCallbacks(localResourceCallback)) {
            localResourceCallback.onLoadFailed(this.exception);
          }
        }
        release(false);
        return;
      }
      throw new IllegalStateException("Already failed once");
    }
    throw new IllegalStateException("Received an exception without any callbacks to notify");
  }
  
  void handleResultOnMainThread()
  {
    this.stateVerifier.throwIfRecycled();
    if (this.isCancelled) {
      this.resource.recycle();
    }
    for (;;)
    {
      release(false);
      return;
      if (this.cbs.isEmpty()) {
        break label185;
      }
      if (this.hasResource) {
        break;
      }
      this.engineResource = this.engineResourceFactory.build(this.resource, this.isCacheable);
      this.hasResource = true;
      this.engineResource.acquire();
      this.listener.onEngineJobComplete(this, this.key, this.engineResource);
      int j = this.cbs.size();
      int i = 0;
      while (i < j)
      {
        ResourceCallback localResourceCallback = (ResourceCallback)this.cbs.get(i);
        if (!isInIgnoredCallbacks(localResourceCallback))
        {
          this.engineResource.acquire();
          localResourceCallback.onResourceReady(this.engineResource, this.dataSource);
        }
        i += 1;
      }
      this.engineResource.release();
    }
    throw new IllegalStateException("Already have resource");
    label185:
    throw new IllegalStateException("Received a resource without any callbacks to notify");
  }
  
  @VisibleForTesting
  EngineJob<R> init(Key paramKey, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.key = paramKey;
    this.isCacheable = paramBoolean1;
    this.useUnlimitedSourceGeneratorPool = paramBoolean2;
    this.useAnimationPool = paramBoolean3;
    this.onlyRetrieveFromCache = paramBoolean4;
    return this;
  }
  
  boolean isCancelled()
  {
    return this.isCancelled;
  }
  
  public void onLoadFailed(GlideException paramGlideException)
  {
    this.exception = paramGlideException;
    MAIN_THREAD_HANDLER.obtainMessage(2, this).sendToTarget();
  }
  
  public void onResourceReady(Resource<R> paramResource, DataSource paramDataSource)
  {
    this.resource = paramResource;
    this.dataSource = paramDataSource;
    MAIN_THREAD_HANDLER.obtainMessage(1, this).sendToTarget();
  }
  
  boolean onlyRetrieveFromCache()
  {
    return this.onlyRetrieveFromCache;
  }
  
  void removeCallback(ResourceCallback paramResourceCallback)
  {
    Util.assertMainThread();
    this.stateVerifier.throwIfRecycled();
    if ((!this.hasResource) && (!this.hasLoadFailed))
    {
      this.cbs.remove(paramResourceCallback);
      if (this.cbs.isEmpty()) {
        cancel();
      }
      return;
    }
    addIgnoredCallback(paramResourceCallback);
  }
  
  public void reschedule(DecodeJob<?> paramDecodeJob)
  {
    getActiveSourceExecutor().execute(paramDecodeJob);
  }
  
  public void start(DecodeJob<R> paramDecodeJob)
  {
    this.decodeJob = paramDecodeJob;
    GlideExecutor localGlideExecutor;
    if (paramDecodeJob.willDecodeFromCache()) {
      localGlideExecutor = this.diskCacheExecutor;
    } else {
      localGlideExecutor = getActiveSourceExecutor();
    }
    localGlideExecutor.execute(paramDecodeJob);
  }
  
  @VisibleForTesting
  static class EngineResourceFactory
  {
    public <R> EngineResource<R> build(Resource<R> paramResource, boolean paramBoolean)
    {
      return new EngineResource(paramResource, paramBoolean, true);
    }
  }
  
  static class MainThreadCallback
    implements Handler.Callback
  {
    public boolean handleMessage(Message paramMessage)
    {
      Object localObject = (EngineJob)paramMessage.obj;
      switch (paramMessage.what)
      {
      default: 
        localObject = new StringBuilder("Unrecognized message: ");
        ((StringBuilder)localObject).append(paramMessage.what);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      case 3: 
        ((EngineJob)localObject).handleCancelledOnMainThread();
        break;
      case 2: 
        ((EngineJob)localObject).handleExceptionOnMainThread();
        break;
      case 1: 
        ((EngineJob)localObject).handleResultOnMainThread();
      }
      return true;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/EngineJob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */