package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
public final class ScrollerCompat
{
  OverScroller mScroller;
  
  ScrollerCompat(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null) {
      paramContext = new OverScroller(paramContext, paramInterpolator);
    } else {
      paramContext = new OverScroller(paramContext);
    }
    this.mScroller = paramContext;
  }
  
  @Deprecated
  public static ScrollerCompat create(Context paramContext)
  {
    return create(paramContext, null);
  }
  
  @Deprecated
  public static ScrollerCompat create(Context paramContext, Interpolator paramInterpolator)
  {
    return new ScrollerCompat(paramContext, paramInterpolator);
  }
  
  @Deprecated
  public final void abortAnimation()
  {
    this.mScroller.abortAnimation();
  }
  
  @Deprecated
  public final boolean computeScrollOffset()
  {
    return this.mScroller.computeScrollOffset();
  }
  
  @Deprecated
  public final void fling(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.mScroller.fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  @Deprecated
  public final void fling(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    this.mScroller.fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
  }
  
  @Deprecated
  public final float getCurrVelocity()
  {
    return this.mScroller.getCurrVelocity();
  }
  
  @Deprecated
  public final int getCurrX()
  {
    return this.mScroller.getCurrX();
  }
  
  @Deprecated
  public final int getCurrY()
  {
    return this.mScroller.getCurrY();
  }
  
  @Deprecated
  public final int getFinalX()
  {
    return this.mScroller.getFinalX();
  }
  
  @Deprecated
  public final int getFinalY()
  {
    return this.mScroller.getFinalY();
  }
  
  @Deprecated
  public final boolean isFinished()
  {
    return this.mScroller.isFinished();
  }
  
  @Deprecated
  public final boolean isOverScrolled()
  {
    return this.mScroller.isOverScrolled();
  }
  
  @Deprecated
  public final void notifyHorizontalEdgeReached(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mScroller.notifyHorizontalEdgeReached(paramInt1, paramInt2, paramInt3);
  }
  
  @Deprecated
  public final void notifyVerticalEdgeReached(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mScroller.notifyVerticalEdgeReached(paramInt1, paramInt2, paramInt3);
  }
  
  @Deprecated
  public final boolean springBack(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    return this.mScroller.springBack(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  @Deprecated
  public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mScroller.startScroll(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.mScroller.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/widget/ScrollerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */