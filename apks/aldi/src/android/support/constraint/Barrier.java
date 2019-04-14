package android.support.constraint;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;

public class Barrier
  extends ConstraintHelper
{
  public static final int BOTTOM = 3;
  public static final int END = 6;
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  public static final int START = 5;
  public static final int TOP = 2;
  private android.support.constraint.solver.widgets.Barrier mBarrier;
  private int mIndicatedType = 0;
  private int mResolvedType = 0;
  
  public Barrier(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }
  
  public int getType()
  {
    return this.mIndicatedType;
  }
  
  protected void init(AttributeSet paramAttributeSet)
  {
    super.init(paramAttributeSet);
    this.mBarrier = new android.support.constraint.solver.widgets.Barrier();
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
      int j = paramAttributeSet.getIndexCount();
      int i = 0;
      while (i < j)
      {
        int k = paramAttributeSet.getIndex(i);
        if (k == R.styleable.ConstraintLayout_Layout_barrierDirection) {
          setType(paramAttributeSet.getInt(k, 0));
        } else if (k == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
          this.mBarrier.setAllowsGoneWidget(paramAttributeSet.getBoolean(k, true));
        }
        i += 1;
      }
    }
    this.mHelperWidget = this.mBarrier;
    validateParams();
  }
  
  public void setType(int paramInt)
  {
    this.mIndicatedType = paramInt;
    this.mResolvedType = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      if (this.mIndicatedType == 5) {
        this.mResolvedType = 0;
      } else if (this.mIndicatedType != 6) {}
    }
    else {
      do
      {
        do
        {
          this.mResolvedType = 1;
          break label122;
          if (1 == getResources().getConfiguration().getLayoutDirection()) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
          if (paramInt == 0) {
            break;
          }
        } while (this.mIndicatedType == 5);
        if (this.mIndicatedType != 6) {
          break label122;
        }
        break;
        if (this.mIndicatedType == 5) {
          break;
        }
      } while (this.mIndicatedType == 6);
    }
    label122:
    this.mBarrier.setBarrierType(this.mResolvedType);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/Barrier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */