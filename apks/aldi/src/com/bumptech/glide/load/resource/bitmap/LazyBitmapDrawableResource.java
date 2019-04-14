package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

public final class LazyBitmapDrawableResource
  implements Initializable, Resource<BitmapDrawable>
{
  private final Resource<Bitmap> bitmapResource;
  private final Resources resources;
  
  private LazyBitmapDrawableResource(@NonNull Resources paramResources, @NonNull Resource<Bitmap> paramResource)
  {
    this.resources = ((Resources)Preconditions.checkNotNull(paramResources));
    this.bitmapResource = ((Resource)Preconditions.checkNotNull(paramResource));
  }
  
  @Nullable
  public static Resource<BitmapDrawable> obtain(@NonNull Resources paramResources, @Nullable Resource<Bitmap> paramResource)
  {
    if (paramResource == null) {
      return null;
    }
    return new LazyBitmapDrawableResource(paramResources, paramResource);
  }
  
  @Deprecated
  public static LazyBitmapDrawableResource obtain(Context paramContext, Bitmap paramBitmap)
  {
    return (LazyBitmapDrawableResource)obtain(paramContext.getResources(), BitmapResource.obtain(paramBitmap, Glide.get(paramContext).getBitmapPool()));
  }
  
  @Deprecated
  public static LazyBitmapDrawableResource obtain(Resources paramResources, BitmapPool paramBitmapPool, Bitmap paramBitmap)
  {
    return (LazyBitmapDrawableResource)obtain(paramResources, BitmapResource.obtain(paramBitmap, paramBitmapPool));
  }
  
  @NonNull
  public final BitmapDrawable get()
  {
    return new BitmapDrawable(this.resources, (Bitmap)this.bitmapResource.get());
  }
  
  @NonNull
  public final Class<BitmapDrawable> getResourceClass()
  {
    return BitmapDrawable.class;
  }
  
  public final int getSize()
  {
    return this.bitmapResource.getSize();
  }
  
  public final void initialize()
  {
    if ((this.bitmapResource instanceof Initializable)) {
      ((Initializable)this.bitmapResource).initialize();
    }
  }
  
  public final void recycle()
  {
    this.bitmapResource.recycle();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/LazyBitmapDrawableResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */