package com.bumptech.glide;

import android.support.annotation.NonNull;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition.Animator;

public final class GenericTransitionOptions<TranscodeType>
  extends TransitionOptions<GenericTransitionOptions<TranscodeType>, TranscodeType>
{
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(int paramInt)
  {
    return (GenericTransitionOptions)new GenericTransitionOptions().transition(paramInt);
  }
  
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(@NonNull TransitionFactory<? super TranscodeType> paramTransitionFactory)
  {
    return (GenericTransitionOptions)new GenericTransitionOptions().transition(paramTransitionFactory);
  }
  
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> with(@NonNull ViewPropertyTransition.Animator paramAnimator)
  {
    return (GenericTransitionOptions)new GenericTransitionOptions().transition(paramAnimator);
  }
  
  @NonNull
  public static <TranscodeType> GenericTransitionOptions<TranscodeType> withNoTransition()
  {
    return (GenericTransitionOptions)new GenericTransitionOptions().dontTransition();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/GenericTransitionOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */