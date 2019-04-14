package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

public class RequestOptions
  implements Cloneable
{
  private static final int DISK_CACHE_STRATEGY = 4;
  private static final int ERROR_ID = 32;
  private static final int ERROR_PLACEHOLDER = 16;
  private static final int FALLBACK = 8192;
  private static final int FALLBACK_ID = 16384;
  private static final int IS_CACHEABLE = 256;
  private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
  private static final int OVERRIDE = 512;
  private static final int PLACEHOLDER = 64;
  private static final int PLACEHOLDER_ID = 128;
  private static final int PRIORITY = 8;
  private static final int RESOURCE_CLASS = 4096;
  private static final int SIGNATURE = 1024;
  private static final int SIZE_MULTIPLIER = 2;
  private static final int THEME = 32768;
  private static final int TRANSFORMATION = 2048;
  private static final int TRANSFORMATION_ALLOWED = 65536;
  private static final int TRANSFORMATION_REQUIRED = 131072;
  private static final int UNSET = -1;
  private static final int USE_ANIMATION_POOL = 1048576;
  private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
  @Nullable
  private static RequestOptions centerCropOptions;
  @Nullable
  private static RequestOptions centerInsideOptions;
  @Nullable
  private static RequestOptions circleCropOptions;
  @Nullable
  private static RequestOptions fitCenterOptions;
  @Nullable
  private static RequestOptions noAnimationOptions;
  @Nullable
  private static RequestOptions noTransformOptions;
  @Nullable
  private static RequestOptions skipMemoryCacheFalseOptions;
  @Nullable
  private static RequestOptions skipMemoryCacheTrueOptions;
  @NonNull
  private DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
  private int errorId;
  @Nullable
  private Drawable errorPlaceholder;
  @Nullable
  private Drawable fallbackDrawable;
  private int fallbackId;
  private int fields;
  private boolean isAutoCloneEnabled;
  private boolean isCacheable = true;
  private boolean isLocked;
  private boolean isScaleOnlyOrNoTransform = true;
  private boolean isTransformationAllowed = true;
  private boolean isTransformationRequired;
  private boolean onlyRetrieveFromCache;
  @NonNull
  private Options options = new Options();
  private int overrideHeight = -1;
  private int overrideWidth = -1;
  @Nullable
  private Drawable placeholderDrawable;
  private int placeholderId;
  @NonNull
  private Priority priority = Priority.NORMAL;
  @NonNull
  private Class<?> resourceClass = Object.class;
  @NonNull
  private Key signature = EmptySignature.obtain();
  private float sizeMultiplier = 1.0F;
  @Nullable
  private Resources.Theme theme;
  @NonNull
  private Map<Class<?>, Transformation<?>> transformations = new CachedHashCodeArrayMap();
  private boolean useAnimationPool;
  private boolean useUnlimitedSourceGeneratorsPool;
  
  @CheckResult
  @NonNull
  public static RequestOptions bitmapTransform(@NonNull Transformation<Bitmap> paramTransformation)
  {
    return new RequestOptions().transform(paramTransformation);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions centerCropTransform()
  {
    if (centerCropOptions == null) {
      centerCropOptions = new RequestOptions().centerCrop().autoClone();
    }
    return centerCropOptions;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions centerInsideTransform()
  {
    if (centerInsideOptions == null) {
      centerInsideOptions = new RequestOptions().centerInside().autoClone();
    }
    return centerInsideOptions;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions circleCropTransform()
  {
    if (circleCropOptions == null) {
      circleCropOptions = new RequestOptions().circleCrop().autoClone();
    }
    return circleCropOptions;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions decodeTypeOf(@NonNull Class<?> paramClass)
  {
    return new RequestOptions().decode(paramClass);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy paramDiskCacheStrategy)
  {
    return new RequestOptions().diskCacheStrategy(paramDiskCacheStrategy);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions downsampleOf(@NonNull DownsampleStrategy paramDownsampleStrategy)
  {
    return new RequestOptions().downsample(paramDownsampleStrategy);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat paramCompressFormat)
  {
    return new RequestOptions().encodeFormat(paramCompressFormat);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions encodeQualityOf(@IntRange(from=0L, to=100L) int paramInt)
  {
    return new RequestOptions().encodeQuality(paramInt);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions errorOf(@DrawableRes int paramInt)
  {
    return new RequestOptions().error(paramInt);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions errorOf(@Nullable Drawable paramDrawable)
  {
    return new RequestOptions().error(paramDrawable);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions fitCenterTransform()
  {
    if (fitCenterOptions == null) {
      fitCenterOptions = new RequestOptions().fitCenter().autoClone();
    }
    return fitCenterOptions;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions formatOf(@NonNull DecodeFormat paramDecodeFormat)
  {
    return new RequestOptions().format(paramDecodeFormat);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions frameOf(@IntRange(from=0L) long paramLong)
  {
    return new RequestOptions().frame(paramLong);
  }
  
  private boolean isSet(int paramInt)
  {
    return isSet(this.fields, paramInt);
  }
  
  private static boolean isSet(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) != 0;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions noAnimation()
  {
    if (noAnimationOptions == null) {
      noAnimationOptions = new RequestOptions().dontAnimate().autoClone();
    }
    return noAnimationOptions;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions noTransformation()
  {
    if (noTransformOptions == null) {
      noTransformOptions = new RequestOptions().dontTransform().autoClone();
    }
    return noTransformOptions;
  }
  
  @CheckResult
  @NonNull
  public static <T> RequestOptions option(@NonNull Option<T> paramOption, @NonNull T paramT)
  {
    return new RequestOptions().set(paramOption, paramT);
  }
  
  @NonNull
  private RequestOptions optionalScaleOnlyTransform(@NonNull DownsampleStrategy paramDownsampleStrategy, @NonNull Transformation<Bitmap> paramTransformation)
  {
    return scaleOnlyTransform(paramDownsampleStrategy, paramTransformation, false);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions overrideOf(@IntRange(from=0L) int paramInt)
  {
    return overrideOf(paramInt, paramInt);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions overrideOf(@IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2)
  {
    return new RequestOptions().override(paramInt1, paramInt2);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions placeholderOf(@DrawableRes int paramInt)
  {
    return new RequestOptions().placeholder(paramInt);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions placeholderOf(@Nullable Drawable paramDrawable)
  {
    return new RequestOptions().placeholder(paramDrawable);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions priorityOf(@NonNull Priority paramPriority)
  {
    return new RequestOptions().priority(paramPriority);
  }
  
  @NonNull
  private RequestOptions scaleOnlyTransform(@NonNull DownsampleStrategy paramDownsampleStrategy, @NonNull Transformation<Bitmap> paramTransformation)
  {
    return scaleOnlyTransform(paramDownsampleStrategy, paramTransformation, true);
  }
  
  @NonNull
  private RequestOptions scaleOnlyTransform(@NonNull DownsampleStrategy paramDownsampleStrategy, @NonNull Transformation<Bitmap> paramTransformation, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramDownsampleStrategy = transform(paramDownsampleStrategy, paramTransformation);
    } else {
      paramDownsampleStrategy = optionalTransform(paramDownsampleStrategy, paramTransformation);
    }
    paramDownsampleStrategy.isScaleOnlyOrNoTransform = true;
    return paramDownsampleStrategy;
  }
  
  @NonNull
  private RequestOptions selfOrThrowIfLocked()
  {
    if (!this.isLocked) {
      return this;
    }
    throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions signatureOf(@NonNull Key paramKey)
  {
    return new RequestOptions().signature(paramKey);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions sizeMultiplierOf(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    return new RequestOptions().sizeMultiplier(paramFloat);
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions skipMemoryCacheOf(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (skipMemoryCacheTrueOptions == null) {
        skipMemoryCacheTrueOptions = new RequestOptions().skipMemoryCache(true).autoClone();
      }
      return skipMemoryCacheTrueOptions;
    }
    if (skipMemoryCacheFalseOptions == null) {
      skipMemoryCacheFalseOptions = new RequestOptions().skipMemoryCache(false).autoClone();
    }
    return skipMemoryCacheFalseOptions;
  }
  
  @CheckResult
  @NonNull
  public static RequestOptions timeoutOf(@IntRange(from=0L) int paramInt)
  {
    return new RequestOptions().timeout(paramInt);
  }
  
  @NonNull
  private RequestOptions transform(@NonNull Transformation<Bitmap> paramTransformation, boolean paramBoolean)
  {
    for (RequestOptions localRequestOptions = this; localRequestOptions.isAutoCloneEnabled; localRequestOptions = localRequestOptions.clone()) {}
    DrawableTransformation localDrawableTransformation = new DrawableTransformation(paramTransformation, paramBoolean);
    localRequestOptions.transform(Bitmap.class, paramTransformation, paramBoolean);
    localRequestOptions.transform(Drawable.class, localDrawableTransformation, paramBoolean);
    localRequestOptions.transform(BitmapDrawable.class, localDrawableTransformation.asBitmapDrawable(), paramBoolean);
    localRequestOptions.transform(GifDrawable.class, new GifDrawableTransformation(paramTransformation), paramBoolean);
    return localRequestOptions.selfOrThrowIfLocked();
  }
  
  @NonNull
  private <T> RequestOptions transform(@NonNull Class<T> paramClass, @NonNull Transformation<T> paramTransformation, boolean paramBoolean)
  {
    for (RequestOptions localRequestOptions = this; localRequestOptions.isAutoCloneEnabled; localRequestOptions = localRequestOptions.clone()) {}
    Preconditions.checkNotNull(paramClass);
    Preconditions.checkNotNull(paramTransformation);
    localRequestOptions.transformations.put(paramClass, paramTransformation);
    localRequestOptions.fields |= 0x800;
    localRequestOptions.isTransformationAllowed = true;
    localRequestOptions.fields |= 0x10000;
    localRequestOptions.isScaleOnlyOrNoTransform = false;
    if (paramBoolean)
    {
      localRequestOptions.fields |= 0x20000;
      localRequestOptions.isTransformationRequired = true;
    }
    return localRequestOptions.selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions apply(@NonNull RequestOptions paramRequestOptions)
  {
    if (this.isAutoCloneEnabled) {
      return clone().apply(paramRequestOptions);
    }
    if (isSet(paramRequestOptions.fields, 2)) {
      this.sizeMultiplier = paramRequestOptions.sizeMultiplier;
    }
    if (isSet(paramRequestOptions.fields, 262144)) {
      this.useUnlimitedSourceGeneratorsPool = paramRequestOptions.useUnlimitedSourceGeneratorsPool;
    }
    if (isSet(paramRequestOptions.fields, 1048576)) {
      this.useAnimationPool = paramRequestOptions.useAnimationPool;
    }
    if (isSet(paramRequestOptions.fields, 4)) {
      this.diskCacheStrategy = paramRequestOptions.diskCacheStrategy;
    }
    if (isSet(paramRequestOptions.fields, 8)) {
      this.priority = paramRequestOptions.priority;
    }
    if (isSet(paramRequestOptions.fields, 16))
    {
      this.errorPlaceholder = paramRequestOptions.errorPlaceholder;
      this.errorId = 0;
      this.fields &= 0xFFFFFFDF;
    }
    if (isSet(paramRequestOptions.fields, 32))
    {
      this.errorId = paramRequestOptions.errorId;
      this.errorPlaceholder = null;
      this.fields &= 0xFFFFFFEF;
    }
    if (isSet(paramRequestOptions.fields, 64))
    {
      this.placeholderDrawable = paramRequestOptions.placeholderDrawable;
      this.placeholderId = 0;
      this.fields &= 0xFF7F;
    }
    if (isSet(paramRequestOptions.fields, 128))
    {
      this.placeholderId = paramRequestOptions.placeholderId;
      this.placeholderDrawable = null;
      this.fields &= 0xFFFFFFBF;
    }
    if (isSet(paramRequestOptions.fields, 256)) {
      this.isCacheable = paramRequestOptions.isCacheable;
    }
    if (isSet(paramRequestOptions.fields, 512))
    {
      this.overrideWidth = paramRequestOptions.overrideWidth;
      this.overrideHeight = paramRequestOptions.overrideHeight;
    }
    if (isSet(paramRequestOptions.fields, 1024)) {
      this.signature = paramRequestOptions.signature;
    }
    if (isSet(paramRequestOptions.fields, 4096)) {
      this.resourceClass = paramRequestOptions.resourceClass;
    }
    if (isSet(paramRequestOptions.fields, 8192))
    {
      this.fallbackDrawable = paramRequestOptions.fallbackDrawable;
      this.fallbackId = 0;
      this.fields &= 0xBFFF;
    }
    if (isSet(paramRequestOptions.fields, 16384))
    {
      this.fallbackId = paramRequestOptions.fallbackId;
      this.fallbackDrawable = null;
      this.fields &= 0xDFFF;
    }
    if (isSet(paramRequestOptions.fields, 32768)) {
      this.theme = paramRequestOptions.theme;
    }
    if (isSet(paramRequestOptions.fields, 65536)) {
      this.isTransformationAllowed = paramRequestOptions.isTransformationAllowed;
    }
    if (isSet(paramRequestOptions.fields, 131072)) {
      this.isTransformationRequired = paramRequestOptions.isTransformationRequired;
    }
    if (isSet(paramRequestOptions.fields, 2048))
    {
      this.transformations.putAll(paramRequestOptions.transformations);
      this.isScaleOnlyOrNoTransform = paramRequestOptions.isScaleOnlyOrNoTransform;
    }
    if (isSet(paramRequestOptions.fields, 524288)) {
      this.onlyRetrieveFromCache = paramRequestOptions.onlyRetrieveFromCache;
    }
    if (!this.isTransformationAllowed)
    {
      this.transformations.clear();
      this.fields &= 0xF7FF;
      this.isTransformationRequired = false;
      this.fields &= 0xFFFDFFFF;
      this.isScaleOnlyOrNoTransform = true;
    }
    this.fields |= paramRequestOptions.fields;
    this.options.putAll(paramRequestOptions.options);
    return selfOrThrowIfLocked();
  }
  
  @NonNull
  public RequestOptions autoClone()
  {
    if ((this.isLocked) && (!this.isAutoCloneEnabled)) {
      throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
    this.isAutoCloneEnabled = true;
    return lock();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions centerCrop()
  {
    return transform(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions centerInside()
  {
    return scaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions circleCrop()
  {
    return transform(DownsampleStrategy.CENTER_INSIDE, new CircleCrop());
  }
  
  @CheckResult
  public RequestOptions clone()
  {
    try
    {
      RequestOptions localRequestOptions = (RequestOptions)super.clone();
      localRequestOptions.options = new Options();
      localRequestOptions.options.putAll(this.options);
      localRequestOptions.transformations = new CachedHashCodeArrayMap();
      localRequestOptions.transformations.putAll(this.transformations);
      localRequestOptions.isLocked = false;
      localRequestOptions.isAutoCloneEnabled = false;
      return localRequestOptions;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
  
  @CheckResult
  @NonNull
  public RequestOptions decode(@NonNull Class<?> paramClass)
  {
    if (this.isAutoCloneEnabled) {
      return clone().decode(paramClass);
    }
    this.resourceClass = ((Class)Preconditions.checkNotNull(paramClass));
    this.fields |= 0x1000;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions disallowHardwareConfig()
  {
    return set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy paramDiskCacheStrategy)
  {
    if (this.isAutoCloneEnabled) {
      return clone().diskCacheStrategy(paramDiskCacheStrategy);
    }
    this.diskCacheStrategy = ((DiskCacheStrategy)Preconditions.checkNotNull(paramDiskCacheStrategy));
    this.fields |= 0x4;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions dontAnimate()
  {
    return set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions dontTransform()
  {
    if (this.isAutoCloneEnabled) {
      return clone().dontTransform();
    }
    this.transformations.clear();
    this.fields &= 0xF7FF;
    this.isTransformationRequired = false;
    this.fields &= 0xFFFDFFFF;
    this.isTransformationAllowed = false;
    this.fields |= 0x10000;
    this.isScaleOnlyOrNoTransform = true;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions downsample(@NonNull DownsampleStrategy paramDownsampleStrategy)
  {
    return set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(paramDownsampleStrategy));
  }
  
  @CheckResult
  @NonNull
  public RequestOptions encodeFormat(@NonNull Bitmap.CompressFormat paramCompressFormat)
  {
    return set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(paramCompressFormat));
  }
  
  @CheckResult
  @NonNull
  public RequestOptions encodeQuality(@IntRange(from=0L, to=100L) int paramInt)
  {
    return set(BitmapEncoder.COMPRESSION_QUALITY, Integer.valueOf(paramInt));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof RequestOptions))
    {
      paramObject = (RequestOptions)paramObject;
      if ((Float.compare(((RequestOptions)paramObject).sizeMultiplier, this.sizeMultiplier) == 0) && (this.errorId == ((RequestOptions)paramObject).errorId) && (Util.bothNullOrEqual(this.errorPlaceholder, ((RequestOptions)paramObject).errorPlaceholder)) && (this.placeholderId == ((RequestOptions)paramObject).placeholderId) && (Util.bothNullOrEqual(this.placeholderDrawable, ((RequestOptions)paramObject).placeholderDrawable)) && (this.fallbackId == ((RequestOptions)paramObject).fallbackId) && (Util.bothNullOrEqual(this.fallbackDrawable, ((RequestOptions)paramObject).fallbackDrawable)) && (this.isCacheable == ((RequestOptions)paramObject).isCacheable) && (this.overrideHeight == ((RequestOptions)paramObject).overrideHeight) && (this.overrideWidth == ((RequestOptions)paramObject).overrideWidth) && (this.isTransformationRequired == ((RequestOptions)paramObject).isTransformationRequired) && (this.isTransformationAllowed == ((RequestOptions)paramObject).isTransformationAllowed) && (this.useUnlimitedSourceGeneratorsPool == ((RequestOptions)paramObject).useUnlimitedSourceGeneratorsPool) && (this.onlyRetrieveFromCache == ((RequestOptions)paramObject).onlyRetrieveFromCache) && (this.diskCacheStrategy.equals(((RequestOptions)paramObject).diskCacheStrategy)) && (this.priority == ((RequestOptions)paramObject).priority) && (this.options.equals(((RequestOptions)paramObject).options)) && (this.transformations.equals(((RequestOptions)paramObject).transformations)) && (this.resourceClass.equals(((RequestOptions)paramObject).resourceClass)) && (Util.bothNullOrEqual(this.signature, ((RequestOptions)paramObject).signature)) && (Util.bothNullOrEqual(this.theme, ((RequestOptions)paramObject).theme))) {
        return true;
      }
    }
    return false;
  }
  
  @CheckResult
  @NonNull
  public RequestOptions error(@DrawableRes int paramInt)
  {
    if (this.isAutoCloneEnabled) {
      return clone().error(paramInt);
    }
    this.errorId = paramInt;
    this.fields |= 0x20;
    this.errorPlaceholder = null;
    this.fields &= 0xFFFFFFEF;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions error(@Nullable Drawable paramDrawable)
  {
    if (this.isAutoCloneEnabled) {
      return clone().error(paramDrawable);
    }
    this.errorPlaceholder = paramDrawable;
    this.fields |= 0x10;
    this.errorId = 0;
    this.fields &= 0xFFFFFFDF;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions fallback(@DrawableRes int paramInt)
  {
    if (this.isAutoCloneEnabled) {
      return clone().fallback(paramInt);
    }
    this.fallbackId = paramInt;
    this.fields |= 0x4000;
    this.fallbackDrawable = null;
    this.fields &= 0xDFFF;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions fallback(@Nullable Drawable paramDrawable)
  {
    if (this.isAutoCloneEnabled) {
      return clone().fallback(paramDrawable);
    }
    this.fallbackDrawable = paramDrawable;
    this.fields |= 0x2000;
    this.fallbackId = 0;
    this.fields &= 0xBFFF;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions fitCenter()
  {
    return scaleOnlyTransform(DownsampleStrategy.FIT_CENTER, new FitCenter());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions format(@NonNull DecodeFormat paramDecodeFormat)
  {
    Preconditions.checkNotNull(paramDecodeFormat);
    return set(Downsampler.DECODE_FORMAT, paramDecodeFormat).set(GifOptions.DECODE_FORMAT, paramDecodeFormat);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions frame(@IntRange(from=0L) long paramLong)
  {
    return set(VideoDecoder.TARGET_FRAME, Long.valueOf(paramLong));
  }
  
  @NonNull
  public final DiskCacheStrategy getDiskCacheStrategy()
  {
    return this.diskCacheStrategy;
  }
  
  public final int getErrorId()
  {
    return this.errorId;
  }
  
  @Nullable
  public final Drawable getErrorPlaceholder()
  {
    return this.errorPlaceholder;
  }
  
  @Nullable
  public final Drawable getFallbackDrawable()
  {
    return this.fallbackDrawable;
  }
  
  public final int getFallbackId()
  {
    return this.fallbackId;
  }
  
  public final boolean getOnlyRetrieveFromCache()
  {
    return this.onlyRetrieveFromCache;
  }
  
  @NonNull
  public final Options getOptions()
  {
    return this.options;
  }
  
  public final int getOverrideHeight()
  {
    return this.overrideHeight;
  }
  
  public final int getOverrideWidth()
  {
    return this.overrideWidth;
  }
  
  @Nullable
  public final Drawable getPlaceholderDrawable()
  {
    return this.placeholderDrawable;
  }
  
  public final int getPlaceholderId()
  {
    return this.placeholderId;
  }
  
  @NonNull
  public final Priority getPriority()
  {
    return this.priority;
  }
  
  @NonNull
  public final Class<?> getResourceClass()
  {
    return this.resourceClass;
  }
  
  @NonNull
  public final Key getSignature()
  {
    return this.signature;
  }
  
  public final float getSizeMultiplier()
  {
    return this.sizeMultiplier;
  }
  
  @Nullable
  public final Resources.Theme getTheme()
  {
    return this.theme;
  }
  
  @NonNull
  public final Map<Class<?>, Transformation<?>> getTransformations()
  {
    return this.transformations;
  }
  
  public final boolean getUseAnimationPool()
  {
    return this.useAnimationPool;
  }
  
  public final boolean getUseUnlimitedSourceGeneratorsPool()
  {
    return this.useUnlimitedSourceGeneratorsPool;
  }
  
  public int hashCode()
  {
    int i = Util.hashCode(this.sizeMultiplier);
    i = Util.hashCode(this.errorId, i);
    i = Util.hashCode(this.errorPlaceholder, i);
    i = Util.hashCode(this.placeholderId, i);
    i = Util.hashCode(this.placeholderDrawable, i);
    i = Util.hashCode(this.fallbackId, i);
    i = Util.hashCode(this.fallbackDrawable, i);
    i = Util.hashCode(this.isCacheable, i);
    i = Util.hashCode(this.overrideHeight, i);
    i = Util.hashCode(this.overrideWidth, i);
    i = Util.hashCode(this.isTransformationRequired, i);
    i = Util.hashCode(this.isTransformationAllowed, i);
    i = Util.hashCode(this.useUnlimitedSourceGeneratorsPool, i);
    i = Util.hashCode(this.onlyRetrieveFromCache, i);
    i = Util.hashCode(this.diskCacheStrategy, i);
    i = Util.hashCode(this.priority, i);
    i = Util.hashCode(this.options, i);
    i = Util.hashCode(this.transformations, i);
    i = Util.hashCode(this.resourceClass, i);
    i = Util.hashCode(this.signature, i);
    return Util.hashCode(this.theme, i);
  }
  
  protected boolean isAutoCloneEnabled()
  {
    return this.isAutoCloneEnabled;
  }
  
  public final boolean isDiskCacheStrategySet()
  {
    return isSet(4);
  }
  
  public final boolean isLocked()
  {
    return this.isLocked;
  }
  
  public final boolean isMemoryCacheable()
  {
    return this.isCacheable;
  }
  
  public final boolean isPrioritySet()
  {
    return isSet(8);
  }
  
  boolean isScaleOnlyOrNoTransform()
  {
    return this.isScaleOnlyOrNoTransform;
  }
  
  public final boolean isSkipMemoryCacheSet()
  {
    return isSet(256);
  }
  
  public final boolean isTransformationAllowed()
  {
    return this.isTransformationAllowed;
  }
  
  public final boolean isTransformationRequired()
  {
    return this.isTransformationRequired;
  }
  
  public final boolean isTransformationSet()
  {
    return isSet(2048);
  }
  
  public final boolean isValidOverride()
  {
    return Util.isValidDimensions(this.overrideWidth, this.overrideHeight);
  }
  
  @NonNull
  public RequestOptions lock()
  {
    this.isLocked = true;
    return this;
  }
  
  @CheckResult
  @NonNull
  public RequestOptions onlyRetrieveFromCache(boolean paramBoolean)
  {
    if (this.isAutoCloneEnabled) {
      return clone().onlyRetrieveFromCache(paramBoolean);
    }
    this.onlyRetrieveFromCache = paramBoolean;
    this.fields |= 0x80000;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions optionalCenterCrop()
  {
    return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions optionalCenterInside()
  {
    return optionalScaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions optionalCircleCrop()
  {
    return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, new CircleCrop());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions optionalFitCenter()
  {
    return optionalScaleOnlyTransform(DownsampleStrategy.FIT_CENTER, new FitCenter());
  }
  
  @CheckResult
  @NonNull
  public RequestOptions optionalTransform(@NonNull Transformation<Bitmap> paramTransformation)
  {
    return transform(paramTransformation, false);
  }
  
  @NonNull
  final RequestOptions optionalTransform(@NonNull DownsampleStrategy paramDownsampleStrategy, @NonNull Transformation<Bitmap> paramTransformation)
  {
    for (RequestOptions localRequestOptions = this; localRequestOptions.isAutoCloneEnabled; localRequestOptions = localRequestOptions.clone()) {}
    localRequestOptions.downsample(paramDownsampleStrategy);
    return localRequestOptions.transform(paramTransformation, false);
  }
  
  @CheckResult
  @NonNull
  public <T> RequestOptions optionalTransform(@NonNull Class<T> paramClass, @NonNull Transformation<T> paramTransformation)
  {
    return transform(paramClass, paramTransformation, false);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions override(int paramInt)
  {
    return override(paramInt, paramInt);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions override(int paramInt1, int paramInt2)
  {
    if (this.isAutoCloneEnabled) {
      return clone().override(paramInt1, paramInt2);
    }
    this.overrideWidth = paramInt1;
    this.overrideHeight = paramInt2;
    this.fields |= 0x200;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions placeholder(@DrawableRes int paramInt)
  {
    if (this.isAutoCloneEnabled) {
      return clone().placeholder(paramInt);
    }
    this.placeholderId = paramInt;
    this.fields |= 0x80;
    this.placeholderDrawable = null;
    this.fields &= 0xFFFFFFBF;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions placeholder(@Nullable Drawable paramDrawable)
  {
    if (this.isAutoCloneEnabled) {
      return clone().placeholder(paramDrawable);
    }
    this.placeholderDrawable = paramDrawable;
    this.fields |= 0x40;
    this.placeholderId = 0;
    this.fields &= 0xFF7F;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions priority(@NonNull Priority paramPriority)
  {
    if (this.isAutoCloneEnabled) {
      return clone().priority(paramPriority);
    }
    this.priority = ((Priority)Preconditions.checkNotNull(paramPriority));
    this.fields |= 0x8;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public <T> RequestOptions set(@NonNull Option<T> paramOption, @NonNull T paramT)
  {
    if (this.isAutoCloneEnabled) {
      return clone().set(paramOption, paramT);
    }
    Preconditions.checkNotNull(paramOption);
    Preconditions.checkNotNull(paramT);
    this.options.set(paramOption, paramT);
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions signature(@NonNull Key paramKey)
  {
    if (this.isAutoCloneEnabled) {
      return clone().signature(paramKey);
    }
    this.signature = ((Key)Preconditions.checkNotNull(paramKey));
    this.fields |= 0x400;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions sizeMultiplier(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    if (this.isAutoCloneEnabled) {
      return clone().sizeMultiplier(paramFloat);
    }
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F))
    {
      this.sizeMultiplier = paramFloat;
      this.fields |= 0x2;
      return selfOrThrowIfLocked();
    }
    throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
  }
  
  @CheckResult
  @NonNull
  public RequestOptions skipMemoryCache(boolean paramBoolean)
  {
    if (this.isAutoCloneEnabled) {
      return clone().skipMemoryCache(true);
    }
    this.isCacheable = (paramBoolean ^ true);
    this.fields |= 0x100;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions theme(@Nullable Resources.Theme paramTheme)
  {
    if (this.isAutoCloneEnabled) {
      return clone().theme(paramTheme);
    }
    this.theme = paramTheme;
    this.fields |= 0x8000;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions timeout(@IntRange(from=0L) int paramInt)
  {
    return set(HttpGlideUrlLoader.TIMEOUT, Integer.valueOf(paramInt));
  }
  
  @CheckResult
  @NonNull
  public RequestOptions transform(@NonNull Transformation<Bitmap> paramTransformation)
  {
    return transform(paramTransformation, true);
  }
  
  @CheckResult
  @NonNull
  final RequestOptions transform(@NonNull DownsampleStrategy paramDownsampleStrategy, @NonNull Transformation<Bitmap> paramTransformation)
  {
    for (RequestOptions localRequestOptions = this; localRequestOptions.isAutoCloneEnabled; localRequestOptions = localRequestOptions.clone()) {}
    localRequestOptions.downsample(paramDownsampleStrategy);
    return localRequestOptions.transform(paramTransformation);
  }
  
  @CheckResult
  @NonNull
  public <T> RequestOptions transform(@NonNull Class<T> paramClass, @NonNull Transformation<T> paramTransformation)
  {
    return transform(paramClass, paramTransformation, true);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions transforms(@NonNull Transformation<Bitmap>... paramVarArgs)
  {
    return transform(new MultiTransformation(paramVarArgs), true);
  }
  
  @CheckResult
  @NonNull
  public RequestOptions useAnimationPool(boolean paramBoolean)
  {
    if (this.isAutoCloneEnabled) {
      return clone().useAnimationPool(paramBoolean);
    }
    this.useAnimationPool = paramBoolean;
    this.fields |= 0x100000;
    return selfOrThrowIfLocked();
  }
  
  @CheckResult
  @NonNull
  public RequestOptions useUnlimitedSourceGeneratorsPool(boolean paramBoolean)
  {
    if (this.isAutoCloneEnabled) {
      return clone().useUnlimitedSourceGeneratorsPool(paramBoolean);
    }
    this.useUnlimitedSourceGeneratorsPool = paramBoolean;
    this.fields |= 0x40000;
    return selfOrThrowIfLocked();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/RequestOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */