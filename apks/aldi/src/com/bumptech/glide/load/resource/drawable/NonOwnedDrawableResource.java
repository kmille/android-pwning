package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;

final class NonOwnedDrawableResource
  extends DrawableResource<Drawable>
{
  private NonOwnedDrawableResource(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  @Nullable
  static Resource<Drawable> newInstance(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      return new NonOwnedDrawableResource(paramDrawable);
    }
    return null;
  }
  
  @NonNull
  public final Class<Drawable> getResourceClass()
  {
    return this.drawable.getClass();
  }
  
  public final int getSize()
  {
    return Math.max(1, this.drawable.getIntrinsicWidth() * this.drawable.getIntrinsicHeight() * 4);
  }
  
  public final void recycle() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/drawable/NonOwnedDrawableResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */