package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GlideContext
  extends ContextWrapper
{
  @VisibleForTesting
  static final TransitionOptions<?, ?> DEFAULT_TRANSITION_OPTIONS = new GenericTransitionOptions();
  private final ArrayPool arrayPool;
  private final RequestOptions defaultRequestOptions;
  private final Map<Class<?>, TransitionOptions<?, ?>> defaultTransitionOptions;
  private final Engine engine;
  private final ImageViewTargetFactory imageViewTargetFactory;
  private final int logLevel;
  private final Handler mainHandler;
  private final Registry registry;
  
  public GlideContext(@NonNull Context paramContext, @NonNull ArrayPool paramArrayPool, @NonNull Registry paramRegistry, @NonNull ImageViewTargetFactory paramImageViewTargetFactory, @NonNull RequestOptions paramRequestOptions, @NonNull Map<Class<?>, TransitionOptions<?, ?>> paramMap, @NonNull Engine paramEngine, int paramInt)
  {
    super(paramContext.getApplicationContext());
    this.arrayPool = paramArrayPool;
    this.registry = paramRegistry;
    this.imageViewTargetFactory = paramImageViewTargetFactory;
    this.defaultRequestOptions = paramRequestOptions;
    this.defaultTransitionOptions = paramMap;
    this.engine = paramEngine;
    this.logLevel = paramInt;
    this.mainHandler = new Handler(Looper.getMainLooper());
  }
  
  @NonNull
  public <X> ViewTarget<ImageView, X> buildImageViewTarget(@NonNull ImageView paramImageView, @NonNull Class<X> paramClass)
  {
    return this.imageViewTargetFactory.buildTarget(paramImageView, paramClass);
  }
  
  @NonNull
  public ArrayPool getArrayPool()
  {
    return this.arrayPool;
  }
  
  public RequestOptions getDefaultRequestOptions()
  {
    return this.defaultRequestOptions;
  }
  
  @NonNull
  public <T> TransitionOptions<?, T> getDefaultTransitionOptions(@NonNull Class<T> paramClass)
  {
    TransitionOptions localTransitionOptions = (TransitionOptions)this.defaultTransitionOptions.get(paramClass);
    Object localObject = localTransitionOptions;
    if (localTransitionOptions == null)
    {
      Iterator localIterator = this.defaultTransitionOptions.entrySet().iterator();
      for (;;)
      {
        localObject = localTransitionOptions;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        if (((Class)((Map.Entry)localObject).getKey()).isAssignableFrom(paramClass)) {
          localTransitionOptions = (TransitionOptions)((Map.Entry)localObject).getValue();
        }
      }
    }
    paramClass = (Class<T>)localObject;
    if (localObject == null) {
      paramClass = DEFAULT_TRANSITION_OPTIONS;
    }
    return paramClass;
  }
  
  @NonNull
  public Engine getEngine()
  {
    return this.engine;
  }
  
  public int getLogLevel()
  {
    return this.logLevel;
  }
  
  @NonNull
  public Handler getMainHandler()
  {
    return this.mainHandler;
  }
  
  @NonNull
  public Registry getRegistry()
  {
    return this.registry;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/GlideContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */