package com.bumptech.glide;

import android.support.annotation.NonNull;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition.Animator;
import com.bumptech.glide.util.Preconditions;

public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType>
  implements Cloneable
{
  private TransitionFactory<? super TranscodeType> transitionFactory = NoTransition.getFactory();
  
  private CHILD self()
  {
    return this;
  }
  
  public final CHILD clone()
  {
    try
    {
      TransitionOptions localTransitionOptions = (TransitionOptions)super.clone();
      return localTransitionOptions;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
  
  @NonNull
  public final CHILD dontTransition()
  {
    return transition(NoTransition.getFactory());
  }
  
  final TransitionFactory<? super TranscodeType> getTransitionFactory()
  {
    return this.transitionFactory;
  }
  
  @NonNull
  public final CHILD transition(int paramInt)
  {
    return transition(new ViewAnimationFactory(paramInt));
  }
  
  @NonNull
  public final CHILD transition(@NonNull TransitionFactory<? super TranscodeType> paramTransitionFactory)
  {
    this.transitionFactory = ((TransitionFactory)Preconditions.checkNotNull(paramTransitionFactory));
    return self();
  }
  
  @NonNull
  public final CHILD transition(@NonNull ViewPropertyTransition.Animator paramAnimator)
  {
    return transition(new ViewPropertyAnimationFactory(paramAnimator));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/TransitionOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */