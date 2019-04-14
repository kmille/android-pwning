package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.Transition.ViewAdapter;

public abstract class ImageViewTarget<Z>
  extends ViewTarget<ImageView, Z>
  implements Transition.ViewAdapter
{
  @Nullable
  private Animatable animatable;
  
  public ImageViewTarget(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  @Deprecated
  public ImageViewTarget(ImageView paramImageView, boolean paramBoolean)
  {
    super(paramImageView, paramBoolean);
  }
  
  private void maybeUpdateAnimatable(@Nullable Z paramZ)
  {
    if ((paramZ instanceof Animatable))
    {
      this.animatable = ((Animatable)paramZ);
      this.animatable.start();
      return;
    }
    this.animatable = null;
  }
  
  private void setResourceInternal(@Nullable Z paramZ)
  {
    setResource(paramZ);
    maybeUpdateAnimatable(paramZ);
  }
  
  @Nullable
  public Drawable getCurrentDrawable()
  {
    return ((ImageView)this.view).getDrawable();
  }
  
  public void onLoadCleared(@Nullable Drawable paramDrawable)
  {
    super.onLoadCleared(paramDrawable);
    if (this.animatable != null) {
      this.animatable.stop();
    }
    setResourceInternal(null);
    setDrawable(paramDrawable);
  }
  
  public void onLoadFailed(@Nullable Drawable paramDrawable)
  {
    super.onLoadFailed(paramDrawable);
    setResourceInternal(null);
    setDrawable(paramDrawable);
  }
  
  public void onLoadStarted(@Nullable Drawable paramDrawable)
  {
    super.onLoadStarted(paramDrawable);
    setResourceInternal(null);
    setDrawable(paramDrawable);
  }
  
  public void onResourceReady(@NonNull Z paramZ, @Nullable Transition<? super Z> paramTransition)
  {
    if ((paramTransition != null) && (paramTransition.transition(paramZ, this)))
    {
      maybeUpdateAnimatable(paramZ);
      return;
    }
    setResourceInternal(paramZ);
  }
  
  public void onStart()
  {
    if (this.animatable != null) {
      this.animatable.start();
    }
  }
  
  public void onStop()
  {
    if (this.animatable != null) {
      this.animatable.stop();
    }
  }
  
  public void setDrawable(Drawable paramDrawable)
  {
    ((ImageView)this.view).setImageDrawable(paramDrawable);
  }
  
  protected abstract void setResource(@Nullable Z paramZ);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/ImageViewTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */