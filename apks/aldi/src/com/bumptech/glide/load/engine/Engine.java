package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.Pools.Pool;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Factory;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Engine
  implements EngineJobListener, EngineResource.ResourceListener, MemoryCache.ResourceRemovedListener
{
  private static final int JOB_POOL_SIZE = 150;
  private static final String TAG = "Engine";
  private static final boolean VERBOSE_IS_LOGGABLE = Log.isLoggable("Engine", 2);
  private final ActiveResources activeResources;
  private final MemoryCache cache;
  private final DecodeJobFactory decodeJobFactory;
  private final LazyDiskCacheProvider diskCacheProvider;
  private final EngineJobFactory engineJobFactory;
  private final Jobs jobs;
  private final EngineKeyFactory keyFactory;
  private final ResourceRecycler resourceRecycler;
  
  @VisibleForTesting
  Engine(MemoryCache paramMemoryCache, DiskCache.Factory paramFactory, GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, Jobs paramJobs, EngineKeyFactory paramEngineKeyFactory, ActiveResources paramActiveResources, EngineJobFactory paramEngineJobFactory, DecodeJobFactory paramDecodeJobFactory, ResourceRecycler paramResourceRecycler, boolean paramBoolean)
  {
    this.cache = paramMemoryCache;
    this.diskCacheProvider = new LazyDiskCacheProvider(paramFactory);
    if (paramActiveResources == null) {
      paramActiveResources = new ActiveResources(paramBoolean);
    }
    this.activeResources = paramActiveResources;
    paramActiveResources.setListener(this);
    if (paramEngineKeyFactory == null) {
      paramEngineKeyFactory = new EngineKeyFactory();
    }
    this.keyFactory = paramEngineKeyFactory;
    if (paramJobs == null) {
      paramJobs = new Jobs();
    }
    this.jobs = paramJobs;
    if (paramEngineJobFactory == null) {
      paramEngineJobFactory = new EngineJobFactory(paramGlideExecutor1, paramGlideExecutor2, paramGlideExecutor3, paramGlideExecutor4, this);
    }
    this.engineJobFactory = paramEngineJobFactory;
    if (paramDecodeJobFactory == null) {
      paramDecodeJobFactory = new DecodeJobFactory(this.diskCacheProvider);
    }
    this.decodeJobFactory = paramDecodeJobFactory;
    if (paramResourceRecycler == null) {
      paramResourceRecycler = new ResourceRecycler();
    }
    this.resourceRecycler = paramResourceRecycler;
    paramMemoryCache.setResourceRemovedListener(this);
  }
  
  public Engine(MemoryCache paramMemoryCache, DiskCache.Factory paramFactory, GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, boolean paramBoolean)
  {
    this(paramMemoryCache, paramFactory, paramGlideExecutor1, paramGlideExecutor2, paramGlideExecutor3, paramGlideExecutor4, null, null, null, null, null, null, paramBoolean);
  }
  
  private EngineResource<?> getEngineResourceFromCache(Key paramKey)
  {
    paramKey = this.cache.remove(paramKey);
    if (paramKey == null) {
      return null;
    }
    if ((paramKey instanceof EngineResource)) {
      return (EngineResource)paramKey;
    }
    return new EngineResource(paramKey, true, true);
  }
  
  @Nullable
  private EngineResource<?> loadFromActiveResources(Key paramKey, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return null;
    }
    paramKey = this.activeResources.get(paramKey);
    if (paramKey != null) {
      paramKey.acquire();
    }
    return paramKey;
  }
  
  private EngineResource<?> loadFromCache(Key paramKey, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return null;
    }
    EngineResource localEngineResource = getEngineResourceFromCache(paramKey);
    if (localEngineResource != null)
    {
      localEngineResource.acquire();
      this.activeResources.activate(paramKey, localEngineResource);
    }
    return localEngineResource;
  }
  
  private static void logWithTimeAndKey(String paramString, long paramLong, Key paramKey)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" in ");
    localStringBuilder.append(LogTime.getElapsedMillis(paramLong));
    localStringBuilder.append("ms, key: ");
    localStringBuilder.append(paramKey);
  }
  
  public void clearDiskCache()
  {
    this.diskCacheProvider.getDiskCache().clear();
  }
  
  public <R> LoadStatus load(GlideContext paramGlideContext, Object paramObject, Key paramKey, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, DiskCacheStrategy paramDiskCacheStrategy, Map<Class<?>, Transformation<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, Options paramOptions, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, ResourceCallback paramResourceCallback)
  {
    
    if (VERBOSE_IS_LOGGABLE) {}
    for (long l = LogTime.getLogTime();; l = 0L) {
      break;
    }
    EngineKey localEngineKey = this.keyFactory.buildKey(paramObject, paramKey, paramInt1, paramInt2, paramMap, paramClass, paramClass1, paramOptions);
    Object localObject = loadFromActiveResources(localEngineKey, paramBoolean3);
    if (localObject != null)
    {
      paramResourceCallback.onResourceReady((Resource)localObject, DataSource.MEMORY_CACHE);
      if (VERBOSE_IS_LOGGABLE) {
        logWithTimeAndKey("Loaded resource from active resources", l, localEngineKey);
      }
      return null;
    }
    localObject = loadFromCache(localEngineKey, paramBoolean3);
    if (localObject != null)
    {
      paramResourceCallback.onResourceReady((Resource)localObject, DataSource.MEMORY_CACHE);
      if (VERBOSE_IS_LOGGABLE) {
        logWithTimeAndKey("Loaded resource from cache", l, localEngineKey);
      }
      return null;
    }
    localObject = this.jobs.get(localEngineKey, paramBoolean6);
    if (localObject != null)
    {
      ((EngineJob)localObject).addCallback(paramResourceCallback);
      if (VERBOSE_IS_LOGGABLE) {
        logWithTimeAndKey("Added to existing load", l, localEngineKey);
      }
      return new LoadStatus(paramResourceCallback, (EngineJob)localObject);
    }
    localObject = this.engineJobFactory.build(localEngineKey, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6);
    paramGlideContext = this.decodeJobFactory.build(paramGlideContext, paramObject, localEngineKey, paramKey, paramInt1, paramInt2, paramClass, paramClass1, paramPriority, paramDiskCacheStrategy, paramMap, paramBoolean1, paramBoolean2, paramBoolean6, paramOptions, (DecodeJob.Callback)localObject);
    this.jobs.put(localEngineKey, (EngineJob)localObject);
    ((EngineJob)localObject).addCallback(paramResourceCallback);
    ((EngineJob)localObject).start(paramGlideContext);
    if (VERBOSE_IS_LOGGABLE) {
      logWithTimeAndKey("Started new load", l, localEngineKey);
    }
    return new LoadStatus(paramResourceCallback, (EngineJob)localObject);
  }
  
  public void onEngineJobCancelled(EngineJob<?> paramEngineJob, Key paramKey)
  {
    Util.assertMainThread();
    this.jobs.removeIfCurrent(paramKey, paramEngineJob);
  }
  
  public void onEngineJobComplete(EngineJob<?> paramEngineJob, Key paramKey, EngineResource<?> paramEngineResource)
  {
    
    if (paramEngineResource != null)
    {
      paramEngineResource.setResourceListener(paramKey, this);
      if (paramEngineResource.isCacheable()) {
        this.activeResources.activate(paramKey, paramEngineResource);
      }
    }
    this.jobs.removeIfCurrent(paramKey, paramEngineJob);
  }
  
  public void onResourceReleased(Key paramKey, EngineResource<?> paramEngineResource)
  {
    Util.assertMainThread();
    this.activeResources.deactivate(paramKey);
    if (paramEngineResource.isCacheable())
    {
      this.cache.put(paramKey, paramEngineResource);
      return;
    }
    this.resourceRecycler.recycle(paramEngineResource);
  }
  
  public void onResourceRemoved(@NonNull Resource<?> paramResource)
  {
    Util.assertMainThread();
    this.resourceRecycler.recycle(paramResource);
  }
  
  public void release(Resource<?> paramResource)
  {
    
    if ((paramResource instanceof EngineResource))
    {
      ((EngineResource)paramResource).release();
      return;
    }
    throw new IllegalArgumentException("Cannot release anything but an EngineResource");
  }
  
  @VisibleForTesting
  public void shutdown()
  {
    this.engineJobFactory.shutdown();
    this.diskCacheProvider.clearDiskCacheIfCreated();
    this.activeResources.shutdown();
  }
  
  @VisibleForTesting
  static class DecodeJobFactory
  {
    private int creationOrder;
    final DecodeJob.DiskCacheProvider diskCacheProvider;
    final Pools.Pool<DecodeJob<?>> pool = FactoryPools.simple(150, new FactoryPools.Factory()
    {
      public DecodeJob<?> create()
      {
        return new DecodeJob(Engine.DecodeJobFactory.this.diskCacheProvider, Engine.DecodeJobFactory.this.pool);
      }
    });
    
    DecodeJobFactory(DecodeJob.DiskCacheProvider paramDiskCacheProvider)
    {
      this.diskCacheProvider = paramDiskCacheProvider;
    }
    
    <R> DecodeJob<R> build(GlideContext paramGlideContext, Object paramObject, EngineKey paramEngineKey, Key paramKey, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, DiskCacheStrategy paramDiskCacheStrategy, Map<Class<?>, Transformation<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Options paramOptions, DecodeJob.Callback<R> paramCallback)
    {
      DecodeJob localDecodeJob = (DecodeJob)Preconditions.checkNotNull((DecodeJob)this.pool.acquire());
      int i = this.creationOrder;
      this.creationOrder = (i + 1);
      return localDecodeJob.init(paramGlideContext, paramObject, paramEngineKey, paramKey, paramInt1, paramInt2, paramClass, paramClass1, paramPriority, paramDiskCacheStrategy, paramMap, paramBoolean1, paramBoolean2, paramBoolean3, paramOptions, paramCallback, i);
    }
  }
  
  @VisibleForTesting
  static class EngineJobFactory
  {
    final GlideExecutor animationExecutor;
    final GlideExecutor diskCacheExecutor;
    final EngineJobListener listener;
    final Pools.Pool<EngineJob<?>> pool = FactoryPools.simple(150, new FactoryPools.Factory()
    {
      public EngineJob<?> create()
      {
        return new EngineJob(Engine.EngineJobFactory.this.diskCacheExecutor, Engine.EngineJobFactory.this.sourceExecutor, Engine.EngineJobFactory.this.sourceUnlimitedExecutor, Engine.EngineJobFactory.this.animationExecutor, Engine.EngineJobFactory.this.listener, Engine.EngineJobFactory.this.pool);
      }
    });
    final GlideExecutor sourceExecutor;
    final GlideExecutor sourceUnlimitedExecutor;
    
    EngineJobFactory(GlideExecutor paramGlideExecutor1, GlideExecutor paramGlideExecutor2, GlideExecutor paramGlideExecutor3, GlideExecutor paramGlideExecutor4, EngineJobListener paramEngineJobListener)
    {
      this.diskCacheExecutor = paramGlideExecutor1;
      this.sourceExecutor = paramGlideExecutor2;
      this.sourceUnlimitedExecutor = paramGlideExecutor3;
      this.animationExecutor = paramGlideExecutor4;
      this.listener = paramEngineJobListener;
    }
    
    private static void shutdownAndAwaitTermination(ExecutorService paramExecutorService)
    {
      paramExecutorService.shutdown();
      try
      {
        if (!paramExecutorService.awaitTermination(5L, TimeUnit.SECONDS))
        {
          paramExecutorService.shutdownNow();
          if (paramExecutorService.awaitTermination(5L, TimeUnit.SECONDS)) {
            return;
          }
          throw new RuntimeException("Failed to shutdown");
        }
        return;
      }
      catch (InterruptedException paramExecutorService)
      {
        throw new RuntimeException(paramExecutorService);
      }
    }
    
    <R> EngineJob<R> build(Key paramKey, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    {
      return ((EngineJob)Preconditions.checkNotNull((EngineJob)this.pool.acquire())).init(paramKey, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
    }
    
    @VisibleForTesting
    void shutdown()
    {
      shutdownAndAwaitTermination(this.diskCacheExecutor);
      shutdownAndAwaitTermination(this.sourceExecutor);
      shutdownAndAwaitTermination(this.sourceUnlimitedExecutor);
      shutdownAndAwaitTermination(this.animationExecutor);
    }
  }
  
  static class LazyDiskCacheProvider
    implements DecodeJob.DiskCacheProvider
  {
    private volatile DiskCache diskCache;
    private final DiskCache.Factory factory;
    
    LazyDiskCacheProvider(DiskCache.Factory paramFactory)
    {
      this.factory = paramFactory;
    }
    
    @VisibleForTesting
    void clearDiskCacheIfCreated()
    {
      try
      {
        DiskCache localDiskCache = this.diskCache;
        if (localDiskCache == null) {
          return;
        }
        this.diskCache.clear();
        return;
      }
      finally {}
    }
    
    public DiskCache getDiskCache()
    {
      if (this.diskCache == null) {
        try
        {
          if (this.diskCache == null) {
            this.diskCache = this.factory.build();
          }
          if (this.diskCache == null) {
            this.diskCache = new DiskCacheAdapter();
          }
        }
        finally {}
      }
      return this.diskCache;
    }
  }
  
  public static class LoadStatus
  {
    private final ResourceCallback cb;
    private final EngineJob<?> engineJob;
    
    LoadStatus(ResourceCallback paramResourceCallback, EngineJob<?> paramEngineJob)
    {
      this.cb = paramResourceCallback;
      this.engineJob = paramEngineJob;
    }
    
    public void cancel()
    {
      this.engineJob.removeCallback(this.cb);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/Engine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */