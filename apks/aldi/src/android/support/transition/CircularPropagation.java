package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class CircularPropagation
  extends VisibilityPropagation
{
  private float mPropagationSpeed = 3.0F;
  
  private static float distance(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = paramFloat3 - paramFloat1;
    paramFloat2 = paramFloat4 - paramFloat2;
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }
  
  public long getStartDelay(ViewGroup paramViewGroup, Transition paramTransition, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if ((paramTransitionValues1 == null) && (paramTransitionValues2 == null)) {
      return 0L;
    }
    int i;
    if ((paramTransitionValues2 != null) && (getViewVisibility(paramTransitionValues1) != 0))
    {
      i = 1;
      paramTransitionValues1 = paramTransitionValues2;
    }
    else
    {
      i = -1;
    }
    int m = getViewX(paramTransitionValues1);
    int n = getViewY(paramTransitionValues1);
    paramTransitionValues1 = paramTransition.getEpicenter();
    int j;
    int k;
    if (paramTransitionValues1 != null)
    {
      j = paramTransitionValues1.centerX();
      k = paramTransitionValues1.centerY();
    }
    else
    {
      paramTransitionValues1 = new int[2];
      paramViewGroup.getLocationOnScreen(paramTransitionValues1);
      j = Math.round(paramTransitionValues1[0] + paramViewGroup.getWidth() / 2 + paramViewGroup.getTranslationX());
      k = Math.round(paramTransitionValues1[1] + paramViewGroup.getHeight() / 2 + paramViewGroup.getTranslationY());
    }
    float f = distance(m, n, j, k) / distance(0.0F, 0.0F, paramViewGroup.getWidth(), paramViewGroup.getHeight());
    long l2 = paramTransition.getDuration();
    long l1 = l2;
    if (l2 < 0L) {
      l1 = 300L;
    }
    return Math.round((float)(l1 * i) / this.mPropagationSpeed * f);
  }
  
  public void setPropagationSpeed(float paramFloat)
  {
    if (paramFloat != 0.0F)
    {
      this.mPropagationSpeed = paramFloat;
      return;
    }
    throw new IllegalArgumentException("propagationSpeed may not be 0");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/CircularPropagation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */