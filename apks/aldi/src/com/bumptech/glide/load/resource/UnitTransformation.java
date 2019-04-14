package com.bumptech.glide.load.resource;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

public final class UnitTransformation<T>
  implements Transformation<T>
{
  private static final Transformation<?> TRANSFORMATION = new UnitTransformation();
  
  @NonNull
  public static <T> UnitTransformation<T> get()
  {
    return (UnitTransformation)TRANSFORMATION;
  }
  
  @NonNull
  public final Resource<T> transform(@NonNull Context paramContext, @NonNull Resource<T> paramResource, int paramInt1, int paramInt2)
  {
    return paramResource;
  }
  
  public final void updateDiskCacheKey(@NonNull MessageDigest paramMessageDigest) {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/UnitTransformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */