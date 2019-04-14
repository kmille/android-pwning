package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;

public class ViewAnimationFactory<R>
  implements TransitionFactory<R>
{
  private Transition<R> transition;
  private final ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;
  
  public ViewAnimationFactory(int paramInt)
  {
    this(new ResourceViewTransitionAnimationFactory(paramInt));
  }
  
  public ViewAnimationFactory(Animation paramAnimation)
  {
    this(new ConcreteViewTransitionAnimationFactory(paramAnimation));
  }
  
  ViewAnimationFactory(ViewTransition.ViewTransitionAnimationFactory paramViewTransitionAnimationFactory)
  {
    this.viewTransitionAnimationFactory = paramViewTransitionAnimationFactory;
  }
  
  public Transition<R> build(DataSource paramDataSource, boolean paramBoolean)
  {
    if ((paramDataSource != DataSource.MEMORY_CACHE) && (paramBoolean))
    {
      if (this.transition == null) {
        this.transition = new ViewTransition(this.viewTransitionAnimationFactory);
      }
      return this.transition;
    }
    return NoTransition.get();
  }
  
  static class ConcreteViewTransitionAnimationFactory
    implements ViewTransition.ViewTransitionAnimationFactory
  {
    private final Animation animation;
    
    ConcreteViewTransitionAnimationFactory(Animation paramAnimation)
    {
      this.animation = paramAnimation;
    }
    
    public Animation build(Context paramContext)
    {
      return this.animation;
    }
  }
  
  static class ResourceViewTransitionAnimationFactory
    implements ViewTransition.ViewTransitionAnimationFactory
  {
    private final int animationId;
    
    ResourceViewTransitionAnimationFactory(int paramInt)
    {
      this.animationId = paramInt;
    }
    
    public Animation build(Context paramContext)
    {
      return AnimationUtils.loadAnimation(paramContext, this.animationId);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/request/transition/ViewAnimationFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */