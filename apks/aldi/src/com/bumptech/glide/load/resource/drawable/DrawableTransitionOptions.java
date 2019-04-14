package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class DrawableTransitionOptions
  extends TransitionOptions<DrawableTransitionOptions, Drawable>
{
  @NonNull
  public static DrawableTransitionOptions with(@NonNull TransitionFactory<Drawable> paramTransitionFactory)
  {
    return (DrawableTransitionOptions)new DrawableTransitionOptions().transition(paramTransitionFactory);
  }
  
  @NonNull
  public static DrawableTransitionOptions withCrossFade()
  {
    return new DrawableTransitionOptions().crossFade();
  }
  
  @NonNull
  public static DrawableTransitionOptions withCrossFade(int paramInt)
  {
    return new DrawableTransitionOptions().crossFade(paramInt);
  }
  
  @NonNull
  public static DrawableTransitionOptions withCrossFade(@NonNull DrawableCrossFadeFactory.Builder paramBuilder)
  {
    return new DrawableTransitionOptions().crossFade(paramBuilder);
  }
  
  @NonNull
  public static DrawableTransitionOptions withCrossFade(@NonNull DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    return new DrawableTransitionOptions().crossFade(paramDrawableCrossFadeFactory);
  }
  
  @NonNull
  public final DrawableTransitionOptions crossFade()
  {
    return crossFade(new DrawableCrossFadeFactory.Builder());
  }
  
  @NonNull
  public final DrawableTransitionOptions crossFade(int paramInt)
  {
    return crossFade(new DrawableCrossFadeFactory.Builder(paramInt));
  }
  
  @NonNull
  public final DrawableTransitionOptions crossFade(@NonNull DrawableCrossFadeFactory.Builder paramBuilder)
  {
    return crossFade(paramBuilder.build());
  }
  
  @NonNull
  public final DrawableTransitionOptions crossFade(@NonNull DrawableCrossFadeFactory paramDrawableCrossFadeFactory)
  {
    return (DrawableTransitionOptions)transition(paramDrawableCrossFadeFactory);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/resource/drawable/DrawableTransitionOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */