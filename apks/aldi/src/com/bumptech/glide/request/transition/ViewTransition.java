package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

public class ViewTransition<R>
  implements Transition<R>
{
  private final ViewTransitionAnimationFactory viewTransitionAnimationFactory;
  
  ViewTransition(ViewTransitionAnimationFactory paramViewTransitionAnimationFactory)
  {
    this.viewTransitionAnimationFactory = paramViewTransitionAnimationFactory;
  }
  
  public boolean transition(R paramR, Transition.ViewAdapter paramViewAdapter)
  {
    paramR = paramViewAdapter.getView();
    if (paramR != null)
    {
      paramR.clearAnimation();
      paramR.startAnimation(this.viewTransitionAnimationFactory.build(paramR.getContext()));
    }
    return false;
  }
  
  static abstract interface ViewTransitionAnimationFactory
  {
    public abstract Animation build(Context paramContext);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/ViewTransition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */