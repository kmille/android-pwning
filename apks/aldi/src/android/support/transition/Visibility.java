package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public abstract class Visibility
  extends Transition
{
  public static final int MODE_IN = 1;
  public static final int MODE_OUT = 2;
  private static final String PROPNAME_PARENT = "android:visibility:parent";
  private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
  static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
  private static final String[] sTransitionProperties = { "android:visibility:visibility", "android:visibility:parent" };
  private int mMode = 3;
  
  public Visibility() {}
  
  public Visibility(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.VISIBILITY_TRANSITION);
    int i = TypedArrayUtils.getNamedInt(paramContext, (XmlResourceParser)paramAttributeSet, "transitionVisibilityMode", 0, 0);
    paramContext.recycle();
    if (i != 0) {
      setMode(i);
    }
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    int i = paramTransitionValues.view.getVisibility();
    paramTransitionValues.values.put("android:visibility:visibility", Integer.valueOf(i));
    paramTransitionValues.values.put("android:visibility:parent", paramTransitionValues.view.getParent());
    int[] arrayOfInt = new int[2];
    paramTransitionValues.view.getLocationOnScreen(arrayOfInt);
    paramTransitionValues.values.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  private VisibilityInfo getVisibilityChangeInfo(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    VisibilityInfo localVisibilityInfo = new VisibilityInfo();
    localVisibilityInfo.mVisibilityChange = false;
    localVisibilityInfo.mFadeIn = false;
    ViewGroup localViewGroup = null;
    if ((paramTransitionValues1 != null) && (paramTransitionValues1.values.containsKey("android:visibility:visibility")))
    {
      localVisibilityInfo.mStartVisibility = ((Integer)paramTransitionValues1.values.get("android:visibility:visibility")).intValue();
      localVisibilityInfo.mStartParent = ((ViewGroup)paramTransitionValues1.values.get("android:visibility:parent"));
    }
    else
    {
      localVisibilityInfo.mStartVisibility = -1;
      localVisibilityInfo.mStartParent = null;
    }
    if ((paramTransitionValues2 != null) && (paramTransitionValues2.values.containsKey("android:visibility:visibility")))
    {
      localVisibilityInfo.mEndVisibility = ((Integer)paramTransitionValues2.values.get("android:visibility:visibility")).intValue();
      localViewGroup = (ViewGroup)paramTransitionValues2.values.get("android:visibility:parent");
    }
    else
    {
      localVisibilityInfo.mEndVisibility = -1;
    }
    localVisibilityInfo.mEndParent = localViewGroup;
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null))
    {
      if ((localVisibilityInfo.mStartVisibility == localVisibilityInfo.mEndVisibility) && (localVisibilityInfo.mStartParent == localVisibilityInfo.mEndParent)) {
        return localVisibilityInfo;
      }
      if (localVisibilityInfo.mStartVisibility != localVisibilityInfo.mEndVisibility)
      {
        if (localVisibilityInfo.mStartVisibility == 0) {
          break label300;
        }
        if (localVisibilityInfo.mEndVisibility != 0) {
          break label309;
        }
      }
      else
      {
        if (localVisibilityInfo.mEndParent == null) {
          break label300;
        }
        if (localVisibilityInfo.mStartParent != null) {
          break label309;
        }
      }
    }
    else
    {
      if ((paramTransitionValues1 != null) || (localVisibilityInfo.mEndVisibility != 0)) {
        break label288;
      }
    }
    label288:
    label300:
    for (localVisibilityInfo.mFadeIn = true;; localVisibilityInfo.mFadeIn = false)
    {
      localVisibilityInfo.mVisibilityChange = true;
      return localVisibilityInfo;
      if ((paramTransitionValues2 != null) || (localVisibilityInfo.mStartVisibility != 0)) {
        break;
      }
    }
    label309:
    return localVisibilityInfo;
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  @Nullable
  public Animator createAnimator(@NonNull ViewGroup paramViewGroup, @Nullable TransitionValues paramTransitionValues1, @Nullable TransitionValues paramTransitionValues2)
  {
    VisibilityInfo localVisibilityInfo = getVisibilityChangeInfo(paramTransitionValues1, paramTransitionValues2);
    if ((localVisibilityInfo.mVisibilityChange) && ((localVisibilityInfo.mStartParent != null) || (localVisibilityInfo.mEndParent != null)))
    {
      if (localVisibilityInfo.mFadeIn) {
        return onAppear(paramViewGroup, paramTransitionValues1, localVisibilityInfo.mStartVisibility, paramTransitionValues2, localVisibilityInfo.mEndVisibility);
      }
      return onDisappear(paramViewGroup, paramTransitionValues1, localVisibilityInfo.mStartVisibility, paramTransitionValues2, localVisibilityInfo.mEndVisibility);
    }
    return null;
  }
  
  public int getMode()
  {
    return this.mMode;
  }
  
  @Nullable
  public String[] getTransitionProperties()
  {
    return sTransitionProperties;
  }
  
  public boolean isTransitionRequired(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    if ((paramTransitionValues1 == null) && (paramTransitionValues2 == null)) {
      return false;
    }
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null) && (paramTransitionValues2.values.containsKey("android:visibility:visibility") != paramTransitionValues1.values.containsKey("android:visibility:visibility"))) {
      return false;
    }
    paramTransitionValues1 = getVisibilityChangeInfo(paramTransitionValues1, paramTransitionValues2);
    return (paramTransitionValues1.mVisibilityChange) && ((paramTransitionValues1.mStartVisibility == 0) || (paramTransitionValues1.mEndVisibility == 0));
  }
  
  public boolean isVisible(TransitionValues paramTransitionValues)
  {
    if (paramTransitionValues == null) {
      return false;
    }
    int i = ((Integer)paramTransitionValues.values.get("android:visibility:visibility")).intValue();
    paramTransitionValues = (View)paramTransitionValues.values.get("android:visibility:parent");
    return (i == 0) && (paramTransitionValues != null);
  }
  
  public Animator onAppear(ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, int paramInt1, TransitionValues paramTransitionValues2, int paramInt2)
  {
    if ((this.mMode & 0x1) == 1)
    {
      if (paramTransitionValues2 == null) {
        return null;
      }
      if (paramTransitionValues1 == null)
      {
        View localView = (View)paramTransitionValues2.view.getParent();
        if (getVisibilityChangeInfo(getMatchedTransitionValues(localView, false), getTransitionValues(localView, false)).mVisibilityChange) {
          return null;
        }
      }
      return onAppear(paramViewGroup, paramTransitionValues2.view, paramTransitionValues1, paramTransitionValues2);
    }
    return null;
  }
  
  public Animator onAppear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return null;
  }
  
  public Animator onDisappear(ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, int paramInt1, TransitionValues paramTransitionValues2, int paramInt2)
  {
    if ((this.mMode & 0x2) != 2) {
      return null;
    }
    if (paramTransitionValues1 != null) {
      localObject2 = paramTransitionValues1.view;
    } else {
      localObject2 = null;
    }
    if (paramTransitionValues2 != null) {
      localObject1 = paramTransitionValues2.view;
    } else {
      localObject1 = null;
    }
    if ((localObject1 != null) && (((View)localObject1).getParent() != null))
    {
      if ((paramInt2 == 4) || (localObject2 == localObject1))
      {
        Object localObject3 = null;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break label258;
      }
      if (this.mCanRemoveViews) {
        break label149;
      }
      localObject1 = (View)((View)localObject2).getParent();
      localObject1 = TransitionUtils.copyViewImage(paramViewGroup, (View)localObject2, (View)localObject1);
    }
    else
    {
      if (localObject1 == null) {
        break label136;
      }
    }
    for (;;)
    {
      localObject2 = null;
      break label258;
      label136:
      if (localObject2 == null) {
        break label251;
      }
      if (((View)localObject2).getParent() == null)
      {
        label149:
        localObject1 = localObject2;
      }
      else
      {
        if (!(((View)localObject2).getParent() instanceof View)) {
          break label251;
        }
        localObject1 = (View)((View)localObject2).getParent();
        if (!getVisibilityChangeInfo(getTransitionValues((View)localObject1, true), getMatchedTransitionValues((View)localObject1, true)).mVisibilityChange) {
          break;
        }
        if (((View)localObject1).getParent() == null)
        {
          paramInt1 = ((View)localObject1).getId();
          if ((paramInt1 != -1) && (paramViewGroup.findViewById(paramInt1) != null) && (this.mCanRemoveViews))
          {
            localObject1 = localObject2;
            continue;
          }
        }
        localObject1 = null;
      }
    }
    label251:
    final Object localObject1 = null;
    final Object localObject2 = localObject1;
    label258:
    if ((localObject1 != null) && (paramTransitionValues1 != null))
    {
      localObject2 = (int[])paramTransitionValues1.values.get("android:visibility:screenLocation");
      paramInt1 = localObject2[0];
      paramInt2 = localObject2[1];
      localObject2 = new int[2];
      paramViewGroup.getLocationOnScreen((int[])localObject2);
      ((View)localObject1).offsetLeftAndRight(paramInt1 - localObject2[0] - ((View)localObject1).getLeft());
      ((View)localObject1).offsetTopAndBottom(paramInt2 - localObject2[1] - ((View)localObject1).getTop());
      localObject2 = ViewGroupUtils.getOverlay(paramViewGroup);
      ((ViewGroupOverlayImpl)localObject2).add((View)localObject1);
      paramViewGroup = onDisappear(paramViewGroup, (View)localObject1, paramTransitionValues1, paramTransitionValues2);
      if (paramViewGroup == null)
      {
        ((ViewGroupOverlayImpl)localObject2).remove((View)localObject1);
        return paramViewGroup;
      }
      paramViewGroup.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          localObject2.remove(localObject1);
        }
      });
      return paramViewGroup;
    }
    if (localObject2 != null)
    {
      paramInt1 = ((View)localObject2).getVisibility();
      ViewUtils.setTransitionVisibility((View)localObject2, 0);
      paramViewGroup = onDisappear(paramViewGroup, (View)localObject2, paramTransitionValues1, paramTransitionValues2);
      if (paramViewGroup != null)
      {
        paramTransitionValues1 = new DisappearListener((View)localObject2, paramInt2, true);
        paramViewGroup.addListener(paramTransitionValues1);
        AnimatorUtils.addPauseListener(paramViewGroup, paramTransitionValues1);
        addListener(paramTransitionValues1);
        return paramViewGroup;
      }
      ViewUtils.setTransitionVisibility((View)localObject2, paramInt1);
      return paramViewGroup;
    }
    return null;
  }
  
  public Animator onDisappear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return null;
  }
  
  public void setMode(int paramInt)
  {
    if ((paramInt & 0xFFFFFFFC) == 0)
    {
      this.mMode = paramInt;
      return;
    }
    throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
  }
  
  static class DisappearListener
    extends AnimatorListenerAdapter
    implements AnimatorUtils.AnimatorPauseListenerCompat, Transition.TransitionListener
  {
    boolean mCanceled = false;
    private final int mFinalVisibility;
    private boolean mLayoutSuppressed;
    private final ViewGroup mParent;
    private final boolean mSuppressLayout;
    private final View mView;
    
    DisappearListener(View paramView, int paramInt, boolean paramBoolean)
    {
      this.mView = paramView;
      this.mFinalVisibility = paramInt;
      this.mParent = ((ViewGroup)paramView.getParent());
      this.mSuppressLayout = paramBoolean;
      suppressLayout(true);
    }
    
    private void hideViewWhenNotCanceled()
    {
      if (!this.mCanceled)
      {
        ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
        if (this.mParent != null) {
          this.mParent.invalidate();
        }
      }
      suppressLayout(false);
    }
    
    private void suppressLayout(boolean paramBoolean)
    {
      if ((this.mSuppressLayout) && (this.mLayoutSuppressed != paramBoolean) && (this.mParent != null))
      {
        this.mLayoutSuppressed = paramBoolean;
        ViewGroupUtils.suppressLayout(this.mParent, paramBoolean);
      }
    }
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      this.mCanceled = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      hideViewWhenNotCanceled();
    }
    
    public void onAnimationPause(Animator paramAnimator)
    {
      if (!this.mCanceled) {
        ViewUtils.setTransitionVisibility(this.mView, this.mFinalVisibility);
      }
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationResume(Animator paramAnimator)
    {
      if (!this.mCanceled) {
        ViewUtils.setTransitionVisibility(this.mView, 0);
      }
    }
    
    public void onAnimationStart(Animator paramAnimator) {}
    
    public void onTransitionCancel(@NonNull Transition paramTransition) {}
    
    public void onTransitionEnd(@NonNull Transition paramTransition)
    {
      hideViewWhenNotCanceled();
      paramTransition.removeListener(this);
    }
    
    public void onTransitionPause(@NonNull Transition paramTransition)
    {
      suppressLayout(false);
    }
    
    public void onTransitionResume(@NonNull Transition paramTransition)
    {
      suppressLayout(true);
    }
    
    public void onTransitionStart(@NonNull Transition paramTransition) {}
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static @interface Mode {}
  
  static class VisibilityInfo
  {
    ViewGroup mEndParent;
    int mEndVisibility;
    boolean mFadeIn;
    ViewGroup mStartParent;
    int mStartVisibility;
    boolean mVisibilityChange;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/transition/Visibility.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */