package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

public class ViewPropertyAnimationFactory<R>
  implements TransitionFactory<R>
{
  private ViewPropertyTransition<R> animation;
  private final ViewPropertyTransition.Animator animator;
  
  public ViewPropertyAnimationFactory(ViewPropertyTransition.Animator paramAnimator)
  {
    this.animator = paramAnimator;
  }
  
  public Transition<R> build(DataSource paramDataSource, boolean paramBoolean)
  {
    if ((paramDataSource != DataSource.MEMORY_CACHE) && (paramBoolean))
    {
      if (this.animation == null) {
        this.animation = new ViewPropertyTransition(this.animator);
      }
      return this.animation;
    }
    return NoTransition.get();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/ViewPropertyAnimationFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */