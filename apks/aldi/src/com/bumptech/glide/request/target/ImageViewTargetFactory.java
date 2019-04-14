package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.widget.ImageView;

public class ImageViewTargetFactory
{
  @NonNull
  public <Z> ViewTarget<ImageView, Z> buildTarget(@NonNull ImageView paramImageView, @NonNull Class<Z> paramClass)
  {
    if (Bitmap.class.equals(paramClass)) {
      return new BitmapImageViewTarget(paramImageView);
    }
    if (Drawable.class.isAssignableFrom(paramClass)) {
      return new DrawableImageViewTarget(paramImageView);
    }
    paramImageView = new StringBuilder("Unhandled class: ");
    paramImageView.append(paramClass);
    paramImageView.append(", try .as*(Class).transcode(ResourceTranscoder)");
    throw new IllegalArgumentException(paramImageView.toString());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/target/ImageViewTargetFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */