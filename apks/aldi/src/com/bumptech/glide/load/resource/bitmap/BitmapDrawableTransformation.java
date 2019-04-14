package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

@Deprecated
public class BitmapDrawableTransformation
  implements Transformation<BitmapDrawable>
{
  private final Transformation<Drawable> wrapped;
  
  public BitmapDrawableTransformation(Transformation<Bitmap> paramTransformation)
  {
    this.wrapped = ((Transformation)Preconditions.checkNotNull(new DrawableTransformation(paramTransformation, false)));
  }
  
  private static Resource<BitmapDrawable> convertToBitmapDrawableResource(Resource<Drawable> paramResource)
  {
    if ((paramResource.get() instanceof BitmapDrawable)) {
      return paramResource;
    }
    StringBuilder localStringBuilder = new StringBuilder("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: ");
    localStringBuilder.append(paramResource.get());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private static Resource<Drawable> convertToDrawableResource(Resource<BitmapDrawable> paramResource)
  {
    return paramResource;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof BitmapDrawableTransformation))
    {
      paramObject = (BitmapDrawableTransformation)paramObject;
      return this.wrapped.equals(((BitmapDrawableTransformation)paramObject).wrapped);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.wrapped.hashCode();
  }
  
  @NonNull
  public Resource<BitmapDrawable> transform(@NonNull Context paramContext, @NonNull Resource<BitmapDrawable> paramResource, int paramInt1, int paramInt2)
  {
    paramResource = convertToDrawableResource(paramResource);
    return convertToBitmapDrawableResource(this.wrapped.transform(paramContext, paramResource, paramInt1, paramInt2));
  }
  
  public void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest)
  {
    this.wrapped.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/BitmapDrawableTransformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */