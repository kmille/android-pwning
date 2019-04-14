package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.BitmapTransitionFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class BitmapTransitionOptions
  extends TransitionOptions<BitmapTransitionOptions, Bitmap>
{
  @NonNull
  public static BitmapTransitionOptions with(@NonNull TransitionFactory<Bitmap> paramTransitionFactory)
  {
    return (BitmapTransitionOptions)new BitmapTransitionOptions().transition(paramTransitionFactory);
  }
  
  @NonNull
  public static BitmapTransitionOptions withCrossFade()
  {
    return new BitmapTransitionOptions().crossFade();
  }
  
  @NonNull
  public static BitmapTransitionOptions withCrossFade(int paramInt)
  {
    return new BitmapTransitionOptions().crossFade(paramInt);
  }
  
  @NonNull
  public static BitmapTransitionOptions withCrossFade(@NonNull DrawableCrossFadeFactory.Builder paramBuilder)
  {
    return new BitmapTransitionOptions().crossFade(paramBuilder);
  }
  
  @NonNull
  public static BitmapTransitionOptions withCrossFade(@NonNull DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    return new BitmapTransitionOptions().crossFade(paramDrawableCrossFadeFactory);
  }
  
  @NonNull
  public static BitmapTransitionOptions withWrapped(@NonNull TransitionFactory<Drawable> paramTransitionFactory)
  {
    return new BitmapTransitionOptions().transitionUsing(paramTransitionFactory);
  }
  
  @NonNull
  public final BitmapTransitionOptions crossFade()
  {
    return crossFade(new DrawableCrossFadeFactory.Builder());
  }
  
  @NonNull
  public final BitmapTransitionOptions crossFade(int paramInt)
  {
    return crossFade(new DrawableCrossFadeFactory.Builder(paramInt));
  }
  
  @NonNull
  public final BitmapTransitionOptions crossFade(@NonNull DrawableCrossFadeFactory.Builder paramBuilder)
  {
    return transitionUsing(paramBuilder.build());
  }
  
  @NonNull
  public final BitmapTransitionOptions crossFade(@NonNull DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    return transitionUsing(paramDrawableCrossFadeFactory);
  }
  
  @NonNull
  public final BitmapTransitionOptions transitionUsing(@NonNull TransitionFactory<Drawable> paramTransitionFactory)
  {
    return (BitmapTransitionOptions)transition(new BitmapTransitionFactory(paramTransitionFactory));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/BitmapTransitionOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */