package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.view.View;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RequestManager
  implements ModelTypes<RequestBuilder<Drawable>>, LifecycleListener
{
  private static final RequestOptions DECODE_TYPE_BITMAP = RequestOptions.decodeTypeOf(Bitmap.class).lock();
  private static final RequestOptions DECODE_TYPE_GIF = RequestOptions.decodeTypeOf(GifDrawable.class).lock();
  private static final RequestOptions DOWNLOAD_ONLY_OPTIONS = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
  private final Runnable addSelfToLifecycle = new Runnable()
  {
    public void run()
    {
      RequestManager.this.lifecycle.addListener(RequestManager.this);
    }
  };
  private final ConnectivityMonitor connectivityMonitor;
  protected final Context context;
  protected final Glide glide;
  final Lifecycle lifecycle;
  private final Handler mainHandler = new Handler(Looper.getMainLooper());
  private RequestOptions requestOptions;
  private final RequestTracker requestTracker;
  private final TargetTracker targetTracker = new TargetTracker();
  private final RequestManagerTreeNode treeNode;
  
  public RequestManager(@NonNull Glide paramGlide, @NonNull Lifecycle paramLifecycle, @NonNull RequestManagerTreeNode paramRequestManagerTreeNode, @NonNull Context paramContext)
  {
    this(paramGlide, paramLifecycle, paramRequestManagerTreeNode, new RequestTracker(), paramGlide.getConnectivityMonitorFactory(), paramContext);
  }
  
  RequestManager(Glide paramGlide, Lifecycle paramLifecycle, RequestManagerTreeNode paramRequestManagerTreeNode, RequestTracker paramRequestTracker, ConnectivityMonitorFactory paramConnectivityMonitorFactory, Context paramContext)
  {
    this.glide = paramGlide;
    this.lifecycle = paramLifecycle;
    this.treeNode = paramRequestManagerTreeNode;
    this.requestTracker = paramRequestTracker;
    this.context = paramContext;
    this.connectivityMonitor = paramConnectivityMonitorFactory.build(paramContext.getApplicationContext(), new RequestManagerConnectivityListener(paramRequestTracker));
    if (Util.isOnBackgroundThread()) {
      this.mainHandler.post(this.addSelfToLifecycle);
    } else {
      paramLifecycle.addListener(this);
    }
    paramLifecycle.addListener(this.connectivityMonitor);
    setRequestOptions(paramGlide.getGlideContext().getDefaultRequestOptions());
    paramGlide.registerRequestManager(this);
  }
  
  private void untrackOrDelegate(@NonNull Target<?> paramTarget)
  {
    if ((!untrack(paramTarget)) && (!this.glide.removeFromManagers(paramTarget)) && (paramTarget.getRequest() != null))
    {
      Request localRequest = paramTarget.getRequest();
      paramTarget.setRequest(null);
      localRequest.clear();
    }
  }
  
  private void updateRequestOptions(@NonNull RequestOptions paramRequestOptions)
  {
    this.requestOptions = this.requestOptions.apply(paramRequestOptions);
  }
  
  @NonNull
  public RequestManager applyDefaultRequestOptions(@NonNull RequestOptions paramRequestOptions)
  {
    updateRequestOptions(paramRequestOptions);
    return this;
  }
  
  @CheckResult
  @NonNull
  public <ResourceType> RequestBuilder<ResourceType> as(@NonNull Class<ResourceType> paramClass)
  {
    return new RequestBuilder(this.glide, this, paramClass, this.context);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Bitmap> asBitmap()
  {
    return as(Bitmap.class).apply(DECODE_TYPE_BITMAP);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> asDrawable()
  {
    return as(Drawable.class);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<File> asFile()
  {
    return as(File.class).apply(RequestOptions.skipMemoryCacheOf(true));
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<GifDrawable> asGif()
  {
    return as(GifDrawable.class).apply(DECODE_TYPE_GIF);
  }
  
  public void clear(@NonNull View paramView)
  {
    clear(new ClearTarget(paramView));
  }
  
  public void clear(@Nullable final Target<?> paramTarget)
  {
    if (paramTarget == null) {
      return;
    }
    if (Util.isOnMainThread())
    {
      untrackOrDelegate(paramTarget);
      return;
    }
    this.mainHandler.post(new Runnable()
    {
      public void run()
      {
        RequestManager.this.clear(paramTarget);
      }
    });
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<File> download(@Nullable Object paramObject)
  {
    return downloadOnly().load(paramObject);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<File> downloadOnly()
  {
    return as(File.class).apply(DOWNLOAD_ONLY_OPTIONS);
  }
  
  RequestOptions getDefaultRequestOptions()
  {
    return this.requestOptions;
  }
  
  @NonNull
  <T> TransitionOptions<?, T> getDefaultTransitionOptions(Class<T> paramClass)
  {
    return this.glide.getGlideContext().getDefaultTransitionOptions(paramClass);
  }
  
  public boolean isPaused()
  {
    Util.assertMainThread();
    return this.requestTracker.isPaused();
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable Bitmap paramBitmap)
  {
    return asDrawable().load(paramBitmap);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable Drawable paramDrawable)
  {
    return asDrawable().load(paramDrawable);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable Uri paramUri)
  {
    return asDrawable().load(paramUri);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable File paramFile)
  {
    return asDrawable().load(paramFile);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@DrawableRes @Nullable @RawRes Integer paramInteger)
  {
    return asDrawable().load(paramInteger);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable Object paramObject)
  {
    return asDrawable().load(paramObject);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable String paramString)
  {
    return asDrawable().load(paramString);
  }
  
  @Deprecated
  @CheckResult
  public RequestBuilder<Drawable> load(@Nullable URL paramURL)
  {
    return asDrawable().load(paramURL);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<Drawable> load(@Nullable byte[] paramArrayOfByte)
  {
    return asDrawable().load(paramArrayOfByte);
  }
  
  public void onDestroy()
  {
    this.targetTracker.onDestroy();
    Iterator localIterator = this.targetTracker.getAll().iterator();
    while (localIterator.hasNext()) {
      clear((Target)localIterator.next());
    }
    this.targetTracker.clear();
    this.requestTracker.clearRequests();
    this.lifecycle.removeListener(this);
    this.lifecycle.removeListener(this.connectivityMonitor);
    this.mainHandler.removeCallbacks(this.addSelfToLifecycle);
    this.glide.unregisterRequestManager(this);
  }
  
  public void onStart()
  {
    resumeRequests();
    this.targetTracker.onStart();
  }
  
  public void onStop()
  {
    pauseRequests();
    this.targetTracker.onStop();
  }
  
  public void pauseAllRequests()
  {
    Util.assertMainThread();
    this.requestTracker.pauseAllRequests();
  }
  
  public void pauseRequests()
  {
    Util.assertMainThread();
    this.requestTracker.pauseRequests();
  }
  
  public void pauseRequestsRecursive()
  {
    Util.assertMainThread();
    pauseRequests();
    Iterator localIterator = this.treeNode.getDescendants().iterator();
    while (localIterator.hasNext()) {
      ((RequestManager)localIterator.next()).pauseRequests();
    }
  }
  
  public void resumeRequests()
  {
    Util.assertMainThread();
    this.requestTracker.resumeRequests();
  }
  
  public void resumeRequestsRecursive()
  {
    Util.assertMainThread();
    resumeRequests();
    Iterator localIterator = this.treeNode.getDescendants().iterator();
    while (localIterator.hasNext()) {
      ((RequestManager)localIterator.next()).resumeRequests();
    }
  }
  
  @NonNull
  public RequestManager setDefaultRequestOptions(@NonNull RequestOptions paramRequestOptions)
  {
    setRequestOptions(paramRequestOptions);
    return this;
  }
  
  protected void setRequestOptions(@NonNull RequestOptions paramRequestOptions)
  {
    this.requestOptions = paramRequestOptions.clone().autoClone();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append("{tracker=");
    localStringBuilder.append(this.requestTracker);
    localStringBuilder.append(", treeNode=");
    localStringBuilder.append(this.treeNode);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  void track(@NonNull Target<?> paramTarget, @NonNull Request paramRequest)
  {
    this.targetTracker.track(paramTarget);
    this.requestTracker.runRequest(paramRequest);
  }
  
  boolean untrack(@NonNull Target<?> paramTarget)
  {
    Request localRequest = paramTarget.getRequest();
    if (localRequest == null) {
      return true;
    }
    if (this.requestTracker.clearRemoveAndRecycle(localRequest))
    {
      this.targetTracker.untrack(paramTarget);
      paramTarget.setRequest(null);
      return true;
    }
    return false;
  }
  
  static class ClearTarget
    extends ViewTarget<View, Object>
  {
    ClearTarget(@NonNull View paramView)
    {
      super();
    }
    
    public void onResourceReady(@NonNull Object paramObject, @Nullable Transition<? super Object> paramTransition) {}
  }
  
  static class RequestManagerConnectivityListener
    implements ConnectivityMonitor.ConnectivityListener
  {
    private final RequestTracker requestTracker;
    
    RequestManagerConnectivityListener(@NonNull RequestTracker paramRequestTracker)
    {
      this.requestTracker = paramRequestTracker;
    }
    
    public void onConnectivityChanged(boolean paramBoolean)
    {
      if (paramBoolean) {
        this.requestTracker.restartRequests();
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/RequestManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */