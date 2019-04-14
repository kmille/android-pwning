package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

public class DrawableTransformation
  implements Transformation<Drawable>
{
  private final boolean isRequired;
  private final Transformation<Bitmap> wrapped;
  
  public DrawableTransformation(Transformation<Bitmap> paramTransformation, boolean paramBoolean)
  {
    this.wrapped = paramTransformation;
    this.isRequired = paramBoolean;
  }
  
  private Resource<Drawable> newDrawableResource(Context paramContext, Resource<Bitmap> paramResource)
  {
    return LazyBitmapDrawableResource.obtain(paramContext.getResources(), paramResource);
  }
  
  public Transformation<BitmapDrawable> asBitmapDrawable()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof DrawableTransformation))
    {
      paramObject = (DrawableTransformation)paramObject;
      return this.wrapped.equals(((DrawableTransformation)paramObject).wrapped);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.wrapped.hashCode();
  }
  
  @NonNull
  public Resource<Drawable> transform(@NonNull Context paramContext, @NonNull Resource<Drawable> paramResource, int paramInt1, int paramInt2)
  {
    Object localObject2 = Glide.get(paramContext).getBitmapPool();
    Object localObject1 = (Drawable)paramResource.get();
    localObject2 = DrawableToBitmapConverter.convert((BitmapPool)localObject2, (Drawable)localObject1, paramInt1, paramInt2);
    if (localObject2 == null)
    {
      if (!this.isRequired) {
        return paramResource;
      }
      paramContext = new StringBuilder("Unable to convert ");
      paramContext.append(localObject1);
      paramContext.append(" to a Bitmap");
      throw new IllegalArgumentException(paramContext.toString());
    }
    localObject1 = this.wrapped.transform(paramContext, (Resource)localObject2, paramInt1, paramInt2);
    if (localObject1.equals(localObject2))
    {
      ((Resource)localObject1).recycle();
      return paramResource;
    }
    return newDrawableResource(paramContext, (Resource)localObject1);
  }
  
  public void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    this.wrapped.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/DrawableTransformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */