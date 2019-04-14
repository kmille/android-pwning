package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class BitmapImageViewTarget
  extends ImageViewTarget<Bitmap>
{
  public BitmapImageViewTarget(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  @Deprecated
  public BitmapImageViewTarget(ImageView paramImageView, boolean paramBoolean)
  {
    super(paramImageView, paramBoolean);
  }
  
  protected void setResource(Bitmap paramBitmap)
  {
    ((ImageView)this.view).setImageBitmap(paramBitmap);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/BitmapImageViewTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */