package android.support.constraint.solver.widgets;

import java.util.ArrayList;

public class ChainHead
{
  private boolean mDefined;
  protected ConstraintWidget mFirst;
  protected ConstraintWidget mFirstMatchConstraintWidget;
  protected ConstraintWidget mFirstVisibleWidget;
  protected boolean mHasComplexMatchWeights;
  protected boolean mHasDefinedWeights;
  protected boolean mHasUndefinedWeights;
  protected ConstraintWidget mHead;
  private boolean mIsRtl = false;
  protected ConstraintWidget mLast;
  protected ConstraintWidget mLastMatchConstraintWidget;
  protected ConstraintWidget mLastVisibleWidget;
  private int mOrientation;
  protected float mTotalWeight = 0.0F;
  protected ArrayList<ConstraintWidget> mWeightedMatchConstraintsWidgets;
  protected int mWidgetsCount;
  protected int mWidgetsMatchCount;
  
  public ChainHead(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean)
  {
    this.mFirst = paramConstraintWidget;
    this.mOrientation = paramInt;
    this.mIsRtl = paramBoolean;
  }
  
  private void defineChainProperties()
  {
    int j = this.mOrientation * 2;
    Object localObject2 = this.mFirst;
    boolean bool2 = false;
    int i = 0;
    Object localObject1;
    while (i == 0)
    {
      this.mWidgetsCount += 1;
      localObject1 = ((ConstraintWidget)localObject2).mListNextVisibleWidget;
      int k = this.mOrientation;
      Object localObject3 = null;
      localObject1[k] = null;
      ((ConstraintWidget)localObject2).mListNextMatchConstraintsWidget[this.mOrientation] = null;
      if (((ConstraintWidget)localObject2).getVisibility() != 8)
      {
        if (this.mFirstVisibleWidget == null) {
          this.mFirstVisibleWidget = ((ConstraintWidget)localObject2);
        }
        if (this.mLastVisibleWidget != null) {
          this.mLastVisibleWidget.mListNextVisibleWidget[this.mOrientation] = localObject2;
        }
        this.mLastVisibleWidget = ((ConstraintWidget)localObject2);
        if ((localObject2.mListDimensionBehaviors[this.mOrientation] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && ((localObject2.mResolvedMatchConstraintDefault[this.mOrientation] == 0) || (localObject2.mResolvedMatchConstraintDefault[this.mOrientation] == 3) || (localObject2.mResolvedMatchConstraintDefault[this.mOrientation] == 2)))
        {
          this.mWidgetsMatchCount += 1;
          float f = localObject2.mWeight[this.mOrientation];
          if (f > 0.0F) {
            this.mTotalWeight += localObject2.mWeight[this.mOrientation];
          }
          if (isMatchConstraintEqualityCandidate((ConstraintWidget)localObject2, this.mOrientation))
          {
            if (f < 0.0F) {
              this.mHasUndefinedWeights = true;
            } else {
              this.mHasDefinedWeights = true;
            }
            if (this.mWeightedMatchConstraintsWidgets == null) {
              this.mWeightedMatchConstraintsWidgets = new ArrayList();
            }
            this.mWeightedMatchConstraintsWidgets.add(localObject2);
          }
          if (this.mFirstMatchConstraintWidget == null) {
            this.mFirstMatchConstraintWidget = ((ConstraintWidget)localObject2);
          }
          if (this.mLastMatchConstraintWidget != null) {
            this.mLastMatchConstraintWidget.mListNextMatchConstraintsWidget[this.mOrientation] = localObject2;
          }
          this.mLastMatchConstraintWidget = ((ConstraintWidget)localObject2);
        }
      }
      Object localObject4 = localObject2.mListAnchors[(j + 1)].mTarget;
      localObject1 = localObject3;
      if (localObject4 != null)
      {
        localObject4 = ((ConstraintAnchor)localObject4).mOwner;
        localObject1 = localObject3;
        if (localObject4.mListAnchors[j].mTarget != null) {
          if (localObject4.mListAnchors[j].mTarget.mOwner != localObject2) {
            localObject1 = localObject3;
          } else {
            localObject1 = localObject4;
          }
        }
      }
      if (localObject1 != null) {
        localObject2 = localObject1;
      } else {
        i = 1;
      }
    }
    this.mLast = ((ConstraintWidget)localObject2);
    if ((this.mOrientation == 0) && (this.mIsRtl)) {
      localObject1 = this.mLast;
    } else {
      localObject1 = this.mFirst;
    }
    this.mHead = ((ConstraintWidget)localObject1);
    boolean bool1 = bool2;
    if (this.mHasDefinedWeights)
    {
      bool1 = bool2;
      if (this.mHasUndefinedWeights) {
        bool1 = true;
      }
    }
    this.mHasComplexMatchWeights = bool1;
  }
  
  private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    return (paramConstraintWidget.getVisibility() != 8) && (paramConstraintWidget.mListDimensionBehaviors[paramInt] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && ((paramConstraintWidget.mResolvedMatchConstraintDefault[paramInt] == 0) || (paramConstraintWidget.mResolvedMatchConstraintDefault[paramInt] == 3));
  }
  
  public void define()
  {
    if (!this.mDefined) {
      defineChainProperties();
    }
    this.mDefined = true;
  }
  
  public ConstraintWidget getFirst()
  {
    return this.mFirst;
  }
  
  public ConstraintWidget getFirstMatchConstraintWidget()
  {
    return this.mFirstMatchConstraintWidget;
  }
  
  public ConstraintWidget getFirstVisibleWidget()
  {
    return this.mFirstVisibleWidget;
  }
  
  public ConstraintWidget getHead()
  {
    return this.mHead;
  }
  
  public ConstraintWidget getLast()
  {
    return this.mLast;
  }
  
  public ConstraintWidget getLastMatchConstraintWidget()
  {
    return this.mLastMatchConstraintWidget;
  }
  
  public ConstraintWidget getLastVisibleWidget()
  {
    return this.mLastVisibleWidget;
  }
  
  public float getTotalWeight()
  {
    return this.mTotalWeight;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/widgets/ChainHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */