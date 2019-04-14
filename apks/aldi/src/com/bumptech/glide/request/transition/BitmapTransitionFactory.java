package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

public class BitmapTransitionFactory
  extends BitmapContainerTransitionFactory<Bitmap>
{
  public BitmapTransitionFactory(@NonNull TransitionFactory<Drawable> paramTransitionFactory)
  {
    super(paramTransitionFactory);
  }
  
  @NonNull
  protected Bitmap getBitmap(@NonNull Bitmap paramBitmap)
  {
    return paramBitmap;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/BitmapTransitionFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */