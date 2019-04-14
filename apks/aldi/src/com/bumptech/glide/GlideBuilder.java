package com.bumptech.glide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.request.RequestOptions;
import java.util.Map;

public final class GlideBuilder
{
  private GlideExecutor animationExecutor;
  private ArrayPool arrayPool;
  private BitmapPool bitmapPool;
  private ConnectivityMonitorFactory connectivityMonitorFactory;
  private RequestOptions defaultRequestOptions = new RequestOptions();
  private final Map<Class<?>, TransitionOptions<?, ?>> defaultTransitionOptions = new ArrayMap();
  private GlideExecutor diskCacheExecutor;
  private DiskCache.Factory diskCacheFactory;
  private Engine engine;
  private boolean isActiveResourceRetentionAllowed;
  private int logLevel = 4;
  private MemoryCache memoryCache;
  private MemorySizeCalculator memorySizeCalculator;
  @Nullable
  private RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
  private GlideExecutor sourceExecutor;
  
  @NonNull
  final Glide build(@NonNull Context paramContext)
  {
    if (this.sourceExecutor == null) {
      this.sourceExecutor = GlideExecutor.newSourceExecutor();
    }
    if (this.diskCacheExecutor == null) {
      this.diskCacheExecutor = GlideExecutor.newDiskCacheExecutor();
    }
    if (this.animationExecutor == null) {
      this.animationExecutor = GlideExecutor.newAnimationExecutor();
    }
    if (this.memorySizeCalculator == null) {
      this.memorySizeCalculator = new MemorySizeCalculator.Builder(paramContext).build();
    }
    if (this.connectivityMonitorFactory == null) {
      this.connectivityMonitorFactory = new DefaultConnectivityMonitorFactory();
    }
    if (this.bitmapPool == null)
    {
      int i = this.memorySizeCalculator.getBitmapPoolSize();
      if (i > 0) {
        this.bitmapPool = new LruBitmapPool(i);
      } else {
        this.bitmapPool = new BitmapPoolAdapter();
      }
    }
    if (this.arrayPool == null) {
      this.arrayPool = new LruArrayPool(this.memorySizeCalculator.getArrayPoolSizeInBytes());
    }
    if (this.memoryCache == null) {
      this.memoryCache = new LruResourceCache(this.memorySizeCalculator.getMemoryCacheSize());
    }
    if (this.diskCacheFactory == null) {
      this.diskCacheFactory = new InternalCacheDiskCacheFactory(paramContext);
    }
    if (this.engine == null) {
      this.engine = new Engine(this.memoryCache, this.diskCacheFactory, this.diskCacheExecutor, this.sourceExecutor, GlideExecutor.newUnlimitedSourceExecutor(), GlideExecutor.newAnimationExecutor(), this.isActiveResourceRetentionAllowed);
    }
    RequestManagerRetriever localRequestManagerRetriever = new RequestManagerRetriever(this.requestManagerFactory);
    return new Glide(paramContext, this.engine, this.memoryCache, this.bitmapPool, this.arrayPool, localRequestManagerRetriever, this.connectivityMonitorFactory, this.logLevel, this.defaultRequestOptions.lock(), this.defaultTransitionOptions);
  }
  
  @NonNull
  public final GlideBuilder setAnimationExecutor(@Nullable GlideExecutor paramGlideExecutor)
  {
    this.animationExecutor = paramGlideExecutor;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setArrayPool(@Nullable ArrayPool paramArrayPool)
  {
    this.arrayPool = paramArrayPool;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setBitmapPool(@Nullable BitmapPool paramBitmapPool)
  {
    this.bitmapPool = paramBitmapPool;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setConnectivityMonitorFactory(@Nullable ConnectivityMonitorFactory paramConnectivityMonitorFactory)
  {
    this.connectivityMonitorFactory = paramConnectivityMonitorFactory;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setDefaultRequestOptions(@Nullable RequestOptions paramRequestOptions)
  {
    this.defaultRequestOptions = paramRequestOptions;
    return this;
  }
  
  @NonNull
  public final <T> GlideBuilder setDefaultTransitionOptions(@NonNull Class<T> paramClass, @Nullable TransitionOptions<?, T> paramTransitionOptions)
  {
    this.defaultTransitionOptions.put(paramClass, paramTransitionOptions);
    return this;
  }
  
  @NonNull
  public final GlideBuilder setDiskCache(@Nullable DiskCache.Factory paramFactory)
  {
    this.diskCacheFactory = paramFactory;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setDiskCacheExecutor(@Nullable GlideExecutor paramGlideExecutor)
  {
    this.diskCacheExecutor = paramGlideExecutor;
    return this;
  }
  
  final GlideBuilder setEngine(Engine paramEngine)
  {
    this.engine = paramEngine;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setIsActiveResourceRetentionAllowed(boolean paramBoolean)
  {
    this.isActiveResourceRetentionAllowed = paramBoolean;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setLogLevel(int paramInt)
  {
    if ((paramInt >= 2) && (paramInt <= 6))
    {
      this.logLevel = paramInt;
      return this;
    }
    throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
  }
  
  @NonNull
  public final GlideBuilder setMemoryCache(@Nullable MemoryCache paramMemoryCache)
  {
    this.memoryCache = paramMemoryCache;
    return this;
  }
  
  @NonNull
  public final GlideBuilder setMemorySizeCalculator(@NonNull MemorySizeCalculator.Builder paramBuilder)
  {
    return setMemorySizeCalculator(paramBuilder.build());
  }
  
  @NonNull
  public final GlideBuilder setMemorySizeCalculator(@Nullable MemorySizeCalculator paramMemorySizeCalculator)
  {
    this.memorySizeCalculator = paramMemorySizeCalculator;
    return this;
  }
  
  final void setRequestManagerFactory(@Nullable RequestManagerRetriever.RequestManagerFactory paramRequestManagerFactory)
  {
    this.requestManagerFactory = paramRequestManagerFactory;
  }
  
  @Deprecated
  public final GlideBuilder setResizeExecutor(@Nullable GlideExecutor paramGlideExecutor)
  {
    return setSourceExecutor(paramGlideExecutor);
  }
  
  @NonNull
  public final GlideBuilder setSourceExecutor(@Nullable GlideExecutor paramGlideExecutor)
  {
    this.sourceExecutor = paramGlideExecutor;
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/GlideBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */