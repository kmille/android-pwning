package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RequestBuilder<TranscodeType>
  implements ModelTypes<RequestBuilder<TranscodeType>>, Cloneable
{
  protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
  private final Context context;
  private final RequestOptions defaultRequestOptions;
  @Nullable
  private RequestBuilder<TranscodeType> errorBuilder;
  private final Glide glide;
  private final GlideContext glideContext;
  private boolean isDefaultTransitionOptionsSet = true;
  private boolean isModelSet;
  private boolean isThumbnailBuilt;
  @Nullable
  private Object model;
  @Nullable
  private List<RequestListener<TranscodeType>> requestListeners;
  private final RequestManager requestManager;
  @NonNull
  protected RequestOptions requestOptions;
  @Nullable
  private Float thumbSizeMultiplier;
  @Nullable
  private RequestBuilder<TranscodeType> thumbnailBuilder;
  private final Class<TranscodeType> transcodeClass;
  @NonNull
  private TransitionOptions<?, ? super TranscodeType> transitionOptions;
  
  protected RequestBuilder(Glide paramGlide, RequestManager paramRequestManager, Class<TranscodeType> paramClass, Context paramContext)
  {
    this.glide = paramGlide;
    this.requestManager = paramRequestManager;
    this.transcodeClass = paramClass;
    this.defaultRequestOptions = paramRequestManager.getDefaultRequestOptions();
    this.context = paramContext;
    this.transitionOptions = paramRequestManager.getDefaultTransitionOptions(paramClass);
    this.requestOptions = this.defaultRequestOptions;
    this.glideContext = paramGlide.getGlideContext();
  }
  
  protected RequestBuilder(Class<TranscodeType> paramClass, RequestBuilder<?> paramRequestBuilder)
  {
    this(paramRequestBuilder.glide, paramRequestBuilder.requestManager, paramClass, paramRequestBuilder.context);
    this.model = paramRequestBuilder.model;
    this.isModelSet = paramRequestBuilder.isModelSet;
    this.requestOptions = paramRequestBuilder.requestOptions;
  }
  
  private Request buildRequest(Target<TranscodeType> paramTarget, @Nullable RequestListener<TranscodeType> paramRequestListener, RequestOptions paramRequestOptions)
  {
    return buildRequestRecursive(paramTarget, paramRequestListener, null, this.transitionOptions, paramRequestOptions.getPriority(), paramRequestOptions.getOverrideWidth(), paramRequestOptions.getOverrideHeight(), paramRequestOptions);
  }
  
  private Request buildRequestRecursive(Target<TranscodeType> paramTarget, @Nullable RequestListener<TranscodeType> paramRequestListener, @Nullable RequestCoordinator paramRequestCoordinator, TransitionOptions<?, ? super TranscodeType> paramTransitionOptions, Priority paramPriority, int paramInt1, int paramInt2, RequestOptions paramRequestOptions)
  {
    Object localObject1;
    if (this.errorBuilder != null)
    {
      localObject1 = new ErrorRequestCoordinator(paramRequestCoordinator);
      paramRequestCoordinator = (RequestCoordinator)localObject1;
    }
    else
    {
      Object localObject2 = null;
      localObject1 = paramRequestCoordinator;
      paramRequestCoordinator = (RequestCoordinator)localObject2;
    }
    paramTransitionOptions = buildThumbnailRequestRecursive(paramTarget, paramRequestListener, (RequestCoordinator)localObject1, paramTransitionOptions, paramPriority, paramInt1, paramInt2, paramRequestOptions);
    if (paramRequestCoordinator == null) {
      return paramTransitionOptions;
    }
    int k = this.errorBuilder.requestOptions.getOverrideWidth();
    int m = this.errorBuilder.requestOptions.getOverrideHeight();
    int j = k;
    int i = m;
    if (Util.isValidDimensions(paramInt1, paramInt2))
    {
      j = k;
      i = m;
      if (!this.errorBuilder.requestOptions.isValidOverride())
      {
        j = paramRequestOptions.getOverrideWidth();
        i = paramRequestOptions.getOverrideHeight();
      }
    }
    paramRequestCoordinator.setRequests(paramTransitionOptions, this.errorBuilder.buildRequestRecursive(paramTarget, paramRequestListener, paramRequestCoordinator, this.errorBuilder.transitionOptions, this.errorBuilder.requestOptions.getPriority(), j, i, this.errorBuilder.requestOptions));
    return paramRequestCoordinator;
  }
  
  private Request buildThumbnailRequestRecursive(Target<TranscodeType> paramTarget, RequestListener<TranscodeType> paramRequestListener, @Nullable RequestCoordinator paramRequestCoordinator, TransitionOptions<?, ? super TranscodeType> paramTransitionOptions, Priority paramPriority, int paramInt1, int paramInt2, RequestOptions paramRequestOptions)
  {
    if (this.thumbnailBuilder != null)
    {
      if (!this.isThumbnailBuilt)
      {
        Object localObject = this.thumbnailBuilder.transitionOptions;
        if (this.thumbnailBuilder.isDefaultTransitionOptionsSet) {
          localObject = paramTransitionOptions;
        }
        if (this.thumbnailBuilder.requestOptions.isPrioritySet()) {}
        for (Priority localPriority = this.thumbnailBuilder.requestOptions.getPriority();; localPriority = getThumbnailPriority(paramPriority)) {
          break;
        }
        int k = this.thumbnailBuilder.requestOptions.getOverrideWidth();
        int m = this.thumbnailBuilder.requestOptions.getOverrideHeight();
        int j = k;
        int i = m;
        if (Util.isValidDimensions(paramInt1, paramInt2))
        {
          j = k;
          i = m;
          if (!this.thumbnailBuilder.requestOptions.isValidOverride())
          {
            j = paramRequestOptions.getOverrideWidth();
            i = paramRequestOptions.getOverrideHeight();
          }
        }
        paramRequestCoordinator = new ThumbnailRequestCoordinator(paramRequestCoordinator);
        paramTransitionOptions = obtainRequest(paramTarget, paramRequestListener, paramRequestOptions, paramRequestCoordinator, paramTransitionOptions, paramPriority, paramInt1, paramInt2);
        this.isThumbnailBuilt = true;
        paramTarget = this.thumbnailBuilder.buildRequestRecursive(paramTarget, paramRequestListener, paramRequestCoordinator, (TransitionOptions)localObject, localPriority, j, i, this.thumbnailBuilder.requestOptions);
        this.isThumbnailBuilt = false;
        paramRequestCoordinator.setRequests(paramTransitionOptions, paramTarget);
        return paramRequestCoordinator;
      }
      throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
    }
    if (this.thumbSizeMultiplier != null)
    {
      paramRequestCoordinator = new ThumbnailRequestCoordinator(paramRequestCoordinator);
      paramRequestCoordinator.setRequests(obtainRequest(paramTarget, paramRequestListener, paramRequestOptions, paramRequestCoordinator, paramTransitionOptions, paramPriority, paramInt1, paramInt2), obtainRequest(paramTarget, paramRequestListener, paramRequestOptions.clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), paramRequestCoordinator, paramTransitionOptions, getThumbnailPriority(paramPriority), paramInt1, paramInt2));
      return paramRequestCoordinator;
    }
    return obtainRequest(paramTarget, paramRequestListener, paramRequestOptions, paramRequestCoordinator, paramTransitionOptions, paramPriority, paramInt1, paramInt2);
  }
  
  @NonNull
  private Priority getThumbnailPriority(@NonNull Priority paramPriority)
  {
    switch (paramPriority)
    {
    default: 
      paramPriority = new StringBuilder("unknown priority: ");
      paramPriority.append(this.requestOptions.getPriority());
      throw new IllegalArgumentException(paramPriority.toString());
    case ???: 
    case ???: 
      return Priority.IMMEDIATE;
    case ???: 
      return Priority.HIGH;
    }
    return Priority.NORMAL;
  }
  
  private <Y extends Target<TranscodeType>> Y into(@NonNull Y paramY, @Nullable RequestListener<TranscodeType> paramRequestListener, @NonNull RequestOptions paramRequestOptions)
  {
    Util.assertMainThread();
    Preconditions.checkNotNull(paramY);
    if (this.isModelSet)
    {
      paramRequestOptions = paramRequestOptions.autoClone();
      paramRequestListener = buildRequest(paramY, paramRequestListener, paramRequestOptions);
      Request localRequest = paramY.getRequest();
      if ((paramRequestListener.isEquivalentTo(localRequest)) && (!isSkipMemoryCacheWithCompletePreviousRequest(paramRequestOptions, localRequest)))
      {
        paramRequestListener.recycle();
        if (!((Request)Preconditions.checkNotNull(localRequest)).isRunning()) {
          localRequest.begin();
        }
        return paramY;
      }
      this.requestManager.clear(paramY);
      paramY.setRequest(paramRequestListener);
      this.requestManager.track(paramY, paramRequestListener);
      return paramY;
    }
    throw new IllegalArgumentException("You must call #load() before calling #into()");
  }
  
  private boolean isSkipMemoryCacheWithCompletePreviousRequest(RequestOptions paramRequestOptions, Request paramRequest)
  {
    return (!paramRequestOptions.isMemoryCacheable()) && (paramRequest.isComplete());
  }
  
  @NonNull
  private RequestBuilder<TranscodeType> loadGeneric(@Nullable Object paramObject)
  {
    this.model = paramObject;
    this.isModelSet = true;
    return this;
  }
  
  private Request obtainRequest(Target<TranscodeType> paramTarget, RequestListener<TranscodeType> paramRequestListener, RequestOptions paramRequestOptions, RequestCoordinator paramRequestCoordinator, TransitionOptions<?, ? super TranscodeType> paramTransitionOptions, Priority paramPriority, int paramInt1, int paramInt2)
  {
    return SingleRequest.obtain(this.context, this.glideContext, this.model, this.transcodeClass, paramRequestOptions, paramInt1, paramInt2, paramPriority, paramTarget, paramRequestListener, this.requestListeners, paramRequestCoordinator, this.glideContext.getEngine(), paramTransitionOptions.getTransitionFactory());
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> addListener(@Nullable RequestListener<TranscodeType> paramRequestListener)
  {
    if (paramRequestListener != null)
    {
      if (this.requestListeners == null) {
        this.requestListeners = new ArrayList();
      }
      this.requestListeners.add(paramRequestListener);
    }
    return this;
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> apply(@NonNull RequestOptions paramRequestOptions)
  {
    Preconditions.checkNotNull(paramRequestOptions);
    this.requestOptions = getMutableOptions().apply(paramRequestOptions);
    return this;
  }
  
  @CheckResult
  public RequestBuilder<TranscodeType> clone()
  {
    try
    {
      RequestBuilder localRequestBuilder = (RequestBuilder)super.clone();
      localRequestBuilder.requestOptions = localRequestBuilder.requestOptions.clone();
      localRequestBuilder.transitionOptions = localRequestBuilder.transitionOptions.clone();
      return localRequestBuilder;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
  
  @Deprecated
  @CheckResult
  public FutureTarget<File> downloadOnly(int paramInt1, int paramInt2)
  {
    return getDownloadOnlyRequest().submit(paramInt1, paramInt2);
  }
  
  @Deprecated
  @CheckResult
  public <Y extends Target<File>> Y downloadOnly(@NonNull Y paramY)
  {
    return getDownloadOnlyRequest().into(paramY);
  }
  
  @NonNull
  public RequestBuilder<TranscodeType> error(@Nullable RequestBuilder<TranscodeType> paramRequestBuilder)
  {
    this.errorBuilder = paramRequestBuilder;
    return this;
  }
  
  @CheckResult
  @NonNull
  protected RequestBuilder<File> getDownloadOnlyRequest()
  {
    return new RequestBuilder(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
  }
  
  @NonNull
  protected RequestOptions getMutableOptions()
  {
    if (this.defaultRequestOptions == this.requestOptions) {
      return this.requestOptions.clone();
    }
    return this.requestOptions;
  }
  
  @Deprecated
  public FutureTarget<TranscodeType> into(int paramInt1, int paramInt2)
  {
    return submit(paramInt1, paramInt2);
  }
  
  @NonNull
  public <Y extends Target<TranscodeType>> Y into(@NonNull Y paramY)
  {
    return into(paramY, null);
  }
  
  @NonNull
  <Y extends Target<TranscodeType>> Y into(@NonNull Y paramY, @Nullable RequestListener<TranscodeType> paramRequestListener)
  {
    return into(paramY, paramRequestListener, getMutableOptions());
  }
  
  @NonNull
  public ViewTarget<ImageView, TranscodeType> into(@NonNull ImageView paramImageView)
  {
    Util.assertMainThread();
    Preconditions.checkNotNull(paramImageView);
    RequestOptions localRequestOptions2 = this.requestOptions;
    RequestOptions localRequestOptions1 = localRequestOptions2;
    if (!localRequestOptions2.isTransformationSet())
    {
      localRequestOptions1 = localRequestOptions2;
      if (localRequestOptions2.isTransformationAllowed())
      {
        localRequestOptions1 = localRequestOptions2;
        if (paramImageView.getScaleType() != null) {
          switch (2.$SwitchMap$android$widget$ImageView$ScaleType[paramImageView.getScaleType().ordinal()])
          {
          default: 
            localRequestOptions1 = localRequestOptions2;
            break;
          case 3: 
          case 4: 
          case 5: 
            localRequestOptions1 = localRequestOptions2.clone().optionalFitCenter();
            break;
          case 2: 
          case 6: 
            localRequestOptions1 = localRequestOptions2.clone().optionalCenterInside();
            break;
          case 1: 
            localRequestOptions1 = localRequestOptions2.clone().optionalCenterCrop();
          }
        }
      }
    }
    return (ViewTarget)into(this.glideContext.buildImageViewTarget(paramImageView, this.transcodeClass), null, localRequestOptions1);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> listener(@Nullable RequestListener<TranscodeType> paramRequestListener)
  {
    this.requestListeners = null;
    return addListener(paramRequestListener);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable Bitmap paramBitmap)
  {
    return loadGeneric(paramBitmap).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable Drawable paramDrawable)
  {
    return loadGeneric(paramDrawable).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable Uri paramUri)
  {
    return loadGeneric(paramUri);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable File paramFile)
  {
    return loadGeneric(paramFile);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@DrawableRes @Nullable @RawRes Integer paramInteger)
  {
    return loadGeneric(paramInteger).apply(RequestOptions.signatureOf(ApplicationVersionSignature.obtain(this.context)));
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable Object paramObject)
  {
    return loadGeneric(paramObject);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable String paramString)
  {
    return loadGeneric(paramString);
  }
  
  @Deprecated
  @CheckResult
  public RequestBuilder<TranscodeType> load(@Nullable URL paramURL)
  {
    return loadGeneric(paramURL);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> load(@Nullable byte[] paramArrayOfByte)
  {
    Object localObject = loadGeneric(paramArrayOfByte);
    paramArrayOfByte = (byte[])localObject;
    if (!((RequestBuilder)localObject).requestOptions.isDiskCacheStrategySet()) {
      paramArrayOfByte = ((RequestBuilder)localObject).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }
    localObject = paramArrayOfByte;
    if (!paramArrayOfByte.requestOptions.isSkipMemoryCacheSet()) {
      localObject = paramArrayOfByte.apply(RequestOptions.skipMemoryCacheOf(true));
    }
    return (RequestBuilder<TranscodeType>)localObject;
  }
  
  @NonNull
  public Target<TranscodeType> preload()
  {
    return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
  }
  
  @NonNull
  public Target<TranscodeType> preload(int paramInt1, int paramInt2)
  {
    return into(PreloadTarget.obtain(this.requestManager, paramInt1, paramInt2));
  }
  
  @NonNull
  public FutureTarget<TranscodeType> submit()
  {
    return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
  }
  
  @NonNull
  public FutureTarget<TranscodeType> submit(int paramInt1, int paramInt2)
  {
    final RequestFutureTarget localRequestFutureTarget = new RequestFutureTarget(this.glideContext.getMainHandler(), paramInt1, paramInt2);
    if (Util.isOnBackgroundThread())
    {
      this.glideContext.getMainHandler().post(new Runnable()
      {
        public void run()
        {
          if (!localRequestFutureTarget.isCancelled()) {
            RequestBuilder.this.into(localRequestFutureTarget, localRequestFutureTarget);
          }
        }
      });
      return localRequestFutureTarget;
    }
    into(localRequestFutureTarget, localRequestFutureTarget);
    return localRequestFutureTarget;
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> thumbnail(float paramFloat)
  {
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F))
    {
      this.thumbSizeMultiplier = Float.valueOf(paramFloat);
      return this;
    }
    throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType> paramRequestBuilder)
  {
    this.thumbnailBuilder = paramRequestBuilder;
    return this;
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType>... paramVarArgs)
  {
    Object localObject2 = null;
    if ((paramVarArgs != null) && (paramVarArgs.length != 0))
    {
      int i = paramVarArgs.length - 1;
      while (i >= 0)
      {
        RequestBuilder<TranscodeType> localRequestBuilder = paramVarArgs[i];
        Object localObject1 = localObject2;
        if (localRequestBuilder != null) {
          if (localObject2 == null) {
            localObject1 = localRequestBuilder;
          } else {
            localObject1 = localRequestBuilder.thumbnail((RequestBuilder)localObject2);
          }
        }
        i -= 1;
        localObject2 = localObject1;
      }
      return thumbnail((RequestBuilder)localObject2);
    }
    return thumbnail(null);
  }
  
  @CheckResult
  @NonNull
  public RequestBuilder<TranscodeType> transition(@NonNull TransitionOptions<?, ? super TranscodeType> paramTransitionOptions)
  {
    this.transitionOptions = ((TransitionOptions)Preconditions.checkNotNull(paramTransitionOptions));
    this.isDefaultTransitionOptionsSet = false;
    return this;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/RequestBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */