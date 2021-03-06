package android.support.design.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.AnimatorRes;
import android.support.annotation.Nullable;
import android.support.annotation.StyleableRes;
import android.support.v4.util.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

public class MotionSpec
{
  private static final String TAG = "MotionSpec";
  private final SimpleArrayMap<String, MotionTiming> timings = new SimpleArrayMap();
  
  private static void addTimingFromAnimator(MotionSpec paramMotionSpec, Animator paramAnimator)
  {
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      paramMotionSpec.setTiming(paramAnimator.getPropertyName(), MotionTiming.createFromAnimator(paramAnimator));
      return;
    }
    throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(paramAnimator)));
  }
  
  @Nullable
  public static MotionSpec createFromAttribute(Context paramContext, TypedArray paramTypedArray, @StyleableRes int paramInt)
  {
    if (paramTypedArray.hasValue(paramInt))
    {
      paramInt = paramTypedArray.getResourceId(paramInt, 0);
      if (paramInt != 0) {
        return createFromResource(paramContext, paramInt);
      }
    }
    return null;
  }
  
  @Nullable
  public static MotionSpec createFromResource(Context paramContext, @AnimatorRes int paramInt)
  {
    try
    {
      paramContext = AnimatorInflater.loadAnimator(paramContext, paramInt);
      if ((paramContext instanceof AnimatorSet)) {
        return createSpecFromAnimators(((AnimatorSet)paramContext).getChildAnimations());
      }
      if (paramContext != null)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(paramContext);
        paramContext = createSpecFromAnimators(localArrayList);
        return paramContext;
      }
      return null;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    new StringBuilder("Can't load animation resource ID #0x").append(Integer.toHexString(paramInt));
    return null;
  }
  
  private static MotionSpec createSpecFromAnimators(List<Animator> paramList)
  {
    MotionSpec localMotionSpec = new MotionSpec();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      addTimingFromAnimator(localMotionSpec, (Animator)paramList.get(i));
      i += 1;
    }
    return localMotionSpec;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (MotionSpec)paramObject;
      return this.timings.equals(((MotionSpec)paramObject).timings);
    }
    return false;
  }
  
  public MotionTiming getTiming(String paramString)
  {
    if (hasTiming(paramString)) {
      return (MotionTiming)this.timings.get(paramString);
    }
    throw new IllegalArgumentException();
  }
  
  public long getTotalDuration()
  {
    int j = this.timings.size();
    long l = 0L;
    int i = 0;
    while (i < j)
    {
      MotionTiming localMotionTiming = (MotionTiming)this.timings.valueAt(i);
      l = Math.max(l, localMotionTiming.getDelay() + localMotionTiming.getDuration());
      i += 1;
    }
    return l;
  }
  
  public boolean hasTiming(String paramString)
  {
    return this.timings.get(paramString) != null;
  }
  
  public int hashCode()
  {
    return this.timings.hashCode();
  }
  
  public void setTiming(String paramString, @Nullable MotionTiming paramMotionTiming)
  {
    this.timings.put(paramString, paramMotionTiming);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('\n');
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" timings: ");
    localStringBuilder.append(this.timings);
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/design/animation/MotionSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */