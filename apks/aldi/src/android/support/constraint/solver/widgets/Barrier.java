package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;
import android.support.constraint.solver.SolverVariable;
import java.util.ArrayList;

public class Barrier
  extends Helper
{
  public static final int BOTTOM = 3;
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  public static final int TOP = 2;
  private boolean mAllowsGoneWidget = true;
  private int mBarrierType = 0;
  private ArrayList<ResolutionAnchor> mNodes = new ArrayList(4);
  
  public void addToSolver(LinearSystem paramLinearSystem)
  {
    this.mListAnchors[0] = this.mLeft;
    this.mListAnchors[2] = this.mTop;
    this.mListAnchors[1] = this.mRight;
    this.mListAnchors[3] = this.mBottom;
    int i = 0;
    while (i < this.mListAnchors.length)
    {
      this.mListAnchors[i].mSolverVariable = paramLinearSystem.createObjectVariable(this.mListAnchors[i]);
      i += 1;
    }
    if ((this.mBarrierType >= 0) && (this.mBarrierType < 4))
    {
      Object localObject1 = this.mListAnchors[this.mBarrierType];
      i = 0;
      Object localObject2;
      while (i < this.mWidgetsCount)
      {
        localObject2 = this.mWidgets[i];
        if ((this.mAllowsGoneWidget) || (((ConstraintWidget)localObject2).allowedInBarrier()))
        {
          if (((this.mBarrierType == 0) || (this.mBarrierType == 1)) && (((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)) {}
          while (((this.mBarrierType == 2) || (this.mBarrierType == 3)) && (((ConstraintWidget)localObject2).getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
          {
            bool = true;
            break;
          }
        }
        i += 1;
      }
      boolean bool = false;
      if ((this.mBarrierType != 0) && (this.mBarrierType != 1) ? getParent().getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : getParent().getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
        bool = false;
      }
      i = 0;
      while (i < this.mWidgetsCount)
      {
        localObject2 = this.mWidgets[i];
        if ((this.mAllowsGoneWidget) || (((ConstraintWidget)localObject2).allowedInBarrier()))
        {
          SolverVariable localSolverVariable = paramLinearSystem.createObjectVariable(localObject2.mListAnchors[this.mBarrierType]);
          localObject2.mListAnchors[this.mBarrierType].mSolverVariable = localSolverVariable;
          if ((this.mBarrierType != 0) && (this.mBarrierType != 2)) {
            paramLinearSystem.addGreaterBarrier(((ConstraintAnchor)localObject1).mSolverVariable, localSolverVariable, bool);
          } else {
            paramLinearSystem.addLowerBarrier(((ConstraintAnchor)localObject1).mSolverVariable, localSolverVariable, bool);
          }
        }
        i += 1;
      }
      if (this.mBarrierType == 0)
      {
        paramLinearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 6);
        if (!bool)
        {
          localObject1 = this.mLeft.mSolverVariable;
          localObject2 = this.mParent.mRight;
        }
      }
      else
      {
        for (;;)
        {
          paramLinearSystem.addEquality((SolverVariable)localObject1, ((ConstraintAnchor)localObject2).mSolverVariable, 0, 5);
          return;
          if (this.mBarrierType == 1)
          {
            paramLinearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 6);
            if (bool) {
              return;
            }
            localObject1 = this.mLeft.mSolverVariable;
            localObject2 = this.mParent.mLeft;
          }
          else
          {
            if (this.mBarrierType != 2) {
              break;
            }
            paramLinearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 6);
            if (bool) {
              return;
            }
            localObject1 = this.mTop.mSolverVariable;
            localObject2 = this.mParent.mBottom;
          }
        }
        if (this.mBarrierType == 3)
        {
          paramLinearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 6);
          if (!bool) {
            paramLinearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 5);
          }
        }
      }
    }
  }
  
  public boolean allowedInBarrier()
  {
    return true;
  }
  
  public void analyze(int paramInt)
  {
    if (this.mParent == null) {
      return;
    }
    if (!((ConstraintWidgetContainer)this.mParent).optimizeFor(2)) {
      return;
    }
    Object localObject;
    switch (this.mBarrierType)
    {
    default: 
      return;
    case 3: 
      localObject = this.mBottom;
      break;
    case 2: 
      localObject = this.mTop;
      break;
    case 1: 
      localObject = this.mRight;
      break;
    case 0: 
      localObject = this.mLeft;
    }
    ResolutionAnchor localResolutionAnchor = ((ConstraintAnchor)localObject).getResolutionNode();
    localResolutionAnchor.setType(5);
    if ((this.mBarrierType != 0) && (this.mBarrierType != 1))
    {
      this.mLeft.getResolutionNode().resolve(null, 0.0F);
      localObject = this.mRight;
    }
    else
    {
      this.mTop.getResolutionNode().resolve(null, 0.0F);
      localObject = this.mBottom;
    }
    ((ConstraintAnchor)localObject).getResolutionNode().resolve(null, 0.0F);
    this.mNodes.clear();
    paramInt = 0;
    while (paramInt < this.mWidgetsCount)
    {
      localObject = this.mWidgets[paramInt];
      if ((this.mAllowsGoneWidget) || (((ConstraintWidget)localObject).allowedInBarrier()))
      {
        switch (this.mBarrierType)
        {
        default: 
          localObject = null;
          break;
        case 3: 
          localObject = ((ConstraintWidget)localObject).mBottom;
          break;
        case 2: 
          localObject = ((ConstraintWidget)localObject).mTop;
          break;
        case 1: 
          localObject = ((ConstraintWidget)localObject).mRight;
          break;
        case 0: 
          localObject = ((ConstraintWidget)localObject).mLeft;
        }
        localObject = ((ConstraintAnchor)localObject).getResolutionNode();
        if (localObject != null)
        {
          this.mNodes.add(localObject);
          ((ResolutionAnchor)localObject).addDependent(localResolutionAnchor);
        }
      }
      paramInt += 1;
    }
  }
  
  public void resetResolutionNodes()
  {
    super.resetResolutionNodes();
    this.mNodes.clear();
  }
  
  public void resolve()
  {
    int i = this.mBarrierType;
    float f1 = Float.MAX_VALUE;
    switch (i)
    {
    default: 
      return;
    case 3: 
      localObject1 = this.mBottom;
      break;
    case 2: 
      localObject1 = this.mTop;
      break;
    case 1: 
      localObject1 = this.mRight;
      localObject1 = ((ConstraintAnchor)localObject1).getResolutionNode();
      f1 = 0.0F;
      break;
    }
    Object localObject1 = this.mLeft;
    localObject1 = ((ConstraintAnchor)localObject1).getResolutionNode();
    int j = this.mNodes.size();
    ResolutionAnchor localResolutionAnchor = null;
    i = 0;
    Object localObject2;
    while (i < j)
    {
      localObject2 = (ResolutionAnchor)this.mNodes.get(i);
      if (((ResolutionAnchor)localObject2).state != 1) {
        return;
      }
      if ((this.mBarrierType != 0) && (this.mBarrierType != 2))
      {
        f2 = f1;
        if (((ResolutionAnchor)localObject2).resolvedOffset <= f1) {
          break label191;
        }
      }
      else
      {
        f2 = f1;
        if (((ResolutionAnchor)localObject2).resolvedOffset >= f1) {
          break label191;
        }
      }
      float f2 = ((ResolutionAnchor)localObject2).resolvedOffset;
      localResolutionAnchor = ((ResolutionAnchor)localObject2).resolvedTarget;
      label191:
      i += 1;
      f1 = f2;
    }
    if (LinearSystem.getMetrics() != null)
    {
      localObject2 = LinearSystem.getMetrics();
      ((Metrics)localObject2).barrierConnectionResolved += 1L;
    }
    ((ResolutionAnchor)localObject1).resolvedTarget = localResolutionAnchor;
    ((ResolutionAnchor)localObject1).resolvedOffset = f1;
    ((ResolutionAnchor)localObject1).didResolve();
    switch (this.mBarrierType)
    {
    default: 
      return;
    case 3: 
      localObject1 = this.mTop;
    }
    for (;;)
    {
      ((ConstraintAnchor)localObject1).getResolutionNode().resolve(localResolutionAnchor, f1);
      return;
      localObject1 = this.mBottom;
      continue;
      localObject1 = this.mLeft;
      continue;
      localObject1 = this.mRight;
    }
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean)
  {
    this.mAllowsGoneWidget = paramBoolean;
  }
  
  public void setBarrierType(int paramInt)
  {
    this.mBarrierType = paramInt;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/widgets/Barrier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */