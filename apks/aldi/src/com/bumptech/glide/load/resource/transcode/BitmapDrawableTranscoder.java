package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

public class BitmapDrawableTranscoder
  implements ResourceTranscoder<Bitmap, BitmapDrawable>
{
  private final Resources resources;
  
  public BitmapDrawableTranscoder(@NonNull Context paramContext)
  {
    this(paramContext.getResources());
  }
  
  public BitmapDrawableTranscoder(@NonNull Resources paramResources)
  {
    this.resources = ((Resources)Preconditions.checkNotNull(paramResources));
  }
  
  @Deprecated
  public BitmapDrawableTranscoder(@NonNull Resources paramResources, BitmapPool paramBitmapPool)
  {
    this(paramResources);
  }
  
  @Nullable
  public Resource<BitmapDrawable> transcode(@NonNull Resource<Bitmap> paramResource, @NonNull Options paramOptions)
  {
    return LazyBitmapDrawableResource.obtain(this.resources, paramResource);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/transcode/BitmapDrawableTranscoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */