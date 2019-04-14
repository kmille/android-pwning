package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;

public class Optimizer
{
  static final int FLAG_CHAIN_DANGLING = 1;
  static final int FLAG_RECOMPUTE_BOUNDS = 2;
  static final int FLAG_USE_OPTIMIZE = 0;
  public static final int OPTIMIZATION_BARRIER = 2;
  public static final int OPTIMIZATION_CHAIN = 4;
  public static final int OPTIMIZATION_DIMENSIONS = 8;
  public static final int OPTIMIZATION_DIRECT = 1;
  public static final int OPTIMIZATION_NONE = 0;
  public static final int OPTIMIZATION_RATIO = 16;
  public static final int OPTIMIZATION_STANDARD = 3;
  static boolean[] flags = new boolean[3];
  
  static void analyze(int paramInt, ConstraintWidget paramConstraintWidget)
  {
    paramConstraintWidget.updateResolutionNodes();
    ResolutionAnchor localResolutionAnchor1 = paramConstraintWidget.mLeft.getResolutionNode();
    ResolutionAnchor localResolutionAnchor2 = paramConstraintWidget.mTop.getResolutionNode();
    ResolutionAnchor localResolutionAnchor3 = paramConstraintWidget.mRight.getResolutionNode();
    ResolutionAnchor localResolutionAnchor4 = paramConstraintWidget.mBottom.getResolutionNode();
    if ((paramInt & 0x8) == 8) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int i;
    if ((paramConstraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (optimizableMatchConstraint(paramConstraintWidget, 0))) {
      i = 1;
    } else {
      i = 0;
    }
    if ((localResolutionAnchor1.type != 4) && (localResolutionAnchor3.type != 4))
    {
      if ((paramConstraintWidget.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.FIXED) && ((i == 0) || (paramConstraintWidget.getVisibility() != 8)))
      {
        if (i == 0) {
          break label620;
        }
        i = paramConstraintWidget.getWidth();
        localResolutionAnchor1.setType(1);
        localResolutionAnchor3.setType(1);
        if ((paramConstraintWidget.mLeft.mTarget == null) && (paramConstraintWidget.mRight.mTarget == null))
        {
          if (paramInt == 0) {
            break label396;
          }
        }
        else if ((paramConstraintWidget.mLeft.mTarget != null) && (paramConstraintWidget.mRight.mTarget == null))
        {
          if (paramInt == 0) {
            break label396;
          }
        }
        else
        {
          if ((paramConstraintWidget.mLeft.mTarget == null) && (paramConstraintWidget.mRight.mTarget != null))
          {
            if (paramInt == 0) {
              break label509;
            }
            break label490;
          }
          if ((paramConstraintWidget.mLeft.mTarget == null) || (paramConstraintWidget.mRight.mTarget == null)) {
            break label620;
          }
          if (paramInt != 0)
          {
            paramConstraintWidget.getResolutionWidth().addDependent(localResolutionAnchor1);
            paramConstraintWidget.getResolutionWidth().addDependent(localResolutionAnchor3);
          }
          if (paramConstraintWidget.mDimensionRatio == 0.0F)
          {
            localResolutionAnchor1.setType(3);
            localResolutionAnchor3.setType(3);
            localResolutionAnchor1.setOpposite(localResolutionAnchor3, 0.0F);
            localResolutionAnchor3.setOpposite(localResolutionAnchor1, 0.0F);
            break label620;
          }
          localResolutionAnchor1.setType(2);
          localResolutionAnchor3.setType(2);
          localResolutionAnchor1.setOpposite(localResolutionAnchor3, -i);
          localResolutionAnchor3.setOpposite(localResolutionAnchor1, i);
          paramConstraintWidget.setWidth(i);
          break label620;
        }
      }
      else
      {
        if ((paramConstraintWidget.mLeft.mTarget != null) || (paramConstraintWidget.mRight.mTarget != null)) {
          break label406;
        }
        localResolutionAnchor1.setType(1);
        localResolutionAnchor3.setType(1);
        if (paramInt == 0) {
          break label391;
        }
      }
      for (;;)
      {
        localResolutionAnchor3.dependsOn(localResolutionAnchor1, 1, paramConstraintWidget.getResolutionWidth());
        break label620;
        label391:
        label396:
        label406:
        do
        {
          i = paramConstraintWidget.getWidth();
          localResolutionAnchor3.dependsOn(localResolutionAnchor1, i);
          break label620;
          if ((paramConstraintWidget.mLeft.mTarget == null) || (paramConstraintWidget.mRight.mTarget != null)) {
            break;
          }
          localResolutionAnchor1.setType(1);
          localResolutionAnchor3.setType(1);
        } while (paramInt == 0);
      }
      if ((paramConstraintWidget.mLeft.mTarget == null) && (paramConstraintWidget.mRight.mTarget != null))
      {
        localResolutionAnchor1.setType(1);
        localResolutionAnchor3.setType(1);
        localResolutionAnchor1.dependsOn(localResolutionAnchor3, -paramConstraintWidget.getWidth());
        if (paramInt != 0)
        {
          label490:
          localResolutionAnchor1.dependsOn(localResolutionAnchor3, -1, paramConstraintWidget.getResolutionWidth());
        }
        else
        {
          i = paramConstraintWidget.getWidth();
          label509:
          localResolutionAnchor1.dependsOn(localResolutionAnchor3, -i);
        }
      }
      else if ((paramConstraintWidget.mLeft.mTarget != null) && (paramConstraintWidget.mRight.mTarget != null))
      {
        localResolutionAnchor1.setType(2);
        localResolutionAnchor3.setType(2);
        if (paramInt != 0)
        {
          paramConstraintWidget.getResolutionWidth().addDependent(localResolutionAnchor1);
          paramConstraintWidget.getResolutionWidth().addDependent(localResolutionAnchor3);
          localResolutionAnchor1.setOpposite(localResolutionAnchor3, -1, paramConstraintWidget.getResolutionWidth());
          localResolutionAnchor3.setOpposite(localResolutionAnchor1, 1, paramConstraintWidget.getResolutionWidth());
        }
        else
        {
          localResolutionAnchor1.setOpposite(localResolutionAnchor3, -paramConstraintWidget.getWidth());
          localResolutionAnchor3.setOpposite(localResolutionAnchor1, paramConstraintWidget.getWidth());
        }
      }
    }
    label620:
    if ((paramConstraintWidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (optimizableMatchConstraint(paramConstraintWidget, 1))) {
      i = 1;
    } else {
      i = 0;
    }
    if ((localResolutionAnchor2.type != 4) && (localResolutionAnchor4.type != 4)) {
      if ((paramConstraintWidget.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.FIXED) && ((i == 0) || (paramConstraintWidget.getVisibility() != 8)))
      {
        if (i != 0)
        {
          i = paramConstraintWidget.getHeight();
          localResolutionAnchor2.setType(1);
          localResolutionAnchor4.setType(1);
          if ((paramConstraintWidget.mTop.mTarget == null) && (paramConstraintWidget.mBottom.mTarget == null))
          {
            if (paramInt != 0)
            {
              localResolutionAnchor4.dependsOn(localResolutionAnchor2, 1, paramConstraintWidget.getResolutionHeight());
              return;
            }
            localResolutionAnchor4.dependsOn(localResolutionAnchor2, i);
            return;
          }
          if ((paramConstraintWidget.mTop.mTarget != null) && (paramConstraintWidget.mBottom.mTarget == null))
          {
            if (paramInt != 0)
            {
              localResolutionAnchor4.dependsOn(localResolutionAnchor2, 1, paramConstraintWidget.getResolutionHeight());
              return;
            }
            localResolutionAnchor4.dependsOn(localResolutionAnchor2, i);
            return;
          }
          if ((paramConstraintWidget.mTop.mTarget == null) && (paramConstraintWidget.mBottom.mTarget != null))
          {
            if (paramInt != 0)
            {
              localResolutionAnchor2.dependsOn(localResolutionAnchor4, -1, paramConstraintWidget.getResolutionHeight());
              return;
            }
            localResolutionAnchor2.dependsOn(localResolutionAnchor4, -i);
            return;
          }
          if ((paramConstraintWidget.mTop.mTarget != null) && (paramConstraintWidget.mBottom.mTarget != null))
          {
            if (paramInt != 0)
            {
              paramConstraintWidget.getResolutionHeight().addDependent(localResolutionAnchor2);
              paramConstraintWidget.getResolutionWidth().addDependent(localResolutionAnchor4);
            }
            if (paramConstraintWidget.mDimensionRatio == 0.0F)
            {
              localResolutionAnchor2.setType(3);
              localResolutionAnchor4.setType(3);
              localResolutionAnchor2.setOpposite(localResolutionAnchor4, 0.0F);
              localResolutionAnchor4.setOpposite(localResolutionAnchor2, 0.0F);
              return;
            }
            localResolutionAnchor2.setType(2);
            localResolutionAnchor4.setType(2);
            localResolutionAnchor2.setOpposite(localResolutionAnchor4, -i);
            localResolutionAnchor4.setOpposite(localResolutionAnchor2, i);
            paramConstraintWidget.setHeight(i);
            if (paramConstraintWidget.mBaselineDistance > 0) {
              paramConstraintWidget.mBaseline.getResolutionNode().dependsOn(1, localResolutionAnchor2, paramConstraintWidget.mBaselineDistance);
            }
          }
        }
      }
      else if ((paramConstraintWidget.mTop.mTarget == null) && (paramConstraintWidget.mBottom.mTarget == null))
      {
        localResolutionAnchor2.setType(1);
        localResolutionAnchor4.setType(1);
        if (paramInt != 0) {
          localResolutionAnchor4.dependsOn(localResolutionAnchor2, 1, paramConstraintWidget.getResolutionHeight());
        } else {
          localResolutionAnchor4.dependsOn(localResolutionAnchor2, paramConstraintWidget.getHeight());
        }
        if (paramConstraintWidget.mBaseline.mTarget != null)
        {
          paramConstraintWidget.mBaseline.getResolutionNode().setType(1);
          localResolutionAnchor2.dependsOn(1, paramConstraintWidget.mBaseline.getResolutionNode(), -paramConstraintWidget.mBaselineDistance);
        }
      }
      else if ((paramConstraintWidget.mTop.mTarget != null) && (paramConstraintWidget.mBottom.mTarget == null))
      {
        localResolutionAnchor2.setType(1);
        localResolutionAnchor4.setType(1);
        if (paramInt != 0) {
          localResolutionAnchor4.dependsOn(localResolutionAnchor2, 1, paramConstraintWidget.getResolutionHeight());
        } else {
          localResolutionAnchor4.dependsOn(localResolutionAnchor2, paramConstraintWidget.getHeight());
        }
        if (paramConstraintWidget.mBaselineDistance > 0) {
          paramConstraintWidget.mBaseline.getResolutionNode().dependsOn(1, localResolutionAnchor2, paramConstraintWidget.mBaselineDistance);
        }
      }
      else if ((paramConstraintWidget.mTop.mTarget == null) && (paramConstraintWidget.mBottom.mTarget != null))
      {
        localResolutionAnchor2.setType(1);
        localResolutionAnchor4.setType(1);
        if (paramInt != 0) {
          localResolutionAnchor2.dependsOn(localResolutionAnchor4, -1, paramConstraintWidget.getResolutionHeight());
        } else {
          localResolutionAnchor2.dependsOn(localResolutionAnchor4, -paramConstraintWidget.getHeight());
        }
        if (paramConstraintWidget.mBaselineDistance > 0) {
          paramConstraintWidget.mBaseline.getResolutionNode().dependsOn(1, localResolutionAnchor2, paramConstraintWidget.mBaselineDistance);
        }
      }
      else if ((paramConstraintWidget.mTop.mTarget != null) && (paramConstraintWidget.mBottom.mTarget != null))
      {
        localResolutionAnchor2.setType(2);
        localResolutionAnchor4.setType(2);
        if (paramInt != 0)
        {
          localResolutionAnchor2.setOpposite(localResolutionAnchor4, -1, paramConstraintWidget.getResolutionHeight());
          localResolutionAnchor4.setOpposite(localResolutionAnchor2, 1, paramConstraintWidget.getResolutionHeight());
          paramConstraintWidget.getResolutionHeight().addDependent(localResolutionAnchor2);
          paramConstraintWidget.getResolutionWidth().addDependent(localResolutionAnchor4);
        }
        else
        {
          localResolutionAnchor2.setOpposite(localResolutionAnchor4, -paramConstraintWidget.getHeight());
          localResolutionAnchor4.setOpposite(localResolutionAnchor2, paramConstraintWidget.getHeight());
        }
        if (paramConstraintWidget.mBaselineDistance > 0) {
          paramConstraintWidget.mBaseline.getResolutionNode().dependsOn(1, localResolutionAnchor2, paramConstraintWidget.mBaselineDistance);
        }
      }
    }
  }
  
  static boolean applyChainOptimized(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, int paramInt1, int paramInt2, ChainHead paramChainHead)
  {
    Object localObject2 = paramChainHead.mFirst;
    ConstraintWidget localConstraintWidget2 = paramChainHead.mLast;
    paramConstraintWidgetContainer = paramChainHead.mFirstVisibleWidget;
    ConstraintWidget localConstraintWidget1 = paramChainHead.mLastVisibleWidget;
    Object localObject1 = paramChainHead.mHead;
    float f7 = paramChainHead.mTotalWeight;
    paramChainHead = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
    int j;
    int m;
    if (paramInt1 == 0)
    {
      if (((ConstraintWidget)localObject1).mHorizontalChainStyle == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (((ConstraintWidget)localObject1).mHorizontalChainStyle == 1) {
        j = 1;
      } else {
        j = 0;
      }
      m = i;
      k = j;
      if (((ConstraintWidget)localObject1).mHorizontalChainStyle != 2) {}
    }
    int n;
    for (;;)
    {
      n = 1;
      m = i;
      break;
      do
      {
        n = 0;
        j = k;
        break;
        if (((ConstraintWidget)localObject1).mVerticalChainStyle == 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (((ConstraintWidget)localObject1).mVerticalChainStyle == 1) {
          j = 1;
        } else {
          j = 0;
        }
        m = i;
        k = j;
      } while (((ConstraintWidget)localObject1).mVerticalChainStyle != 2);
    }
    localObject1 = localObject2;
    int i1 = 0;
    int k = 0;
    int i = 0;
    float f4 = 0.0F;
    float f3 = 0.0F;
    float f1;
    float f2;
    while (i == 0)
    {
      i2 = i1;
      f1 = f4;
      f2 = f3;
      if (((ConstraintWidget)localObject1).getVisibility() != 8)
      {
        i2 = i1 + 1;
        if (paramInt1 == 0) {}
        for (i1 = ((ConstraintWidget)localObject1).getWidth();; i1 = ((ConstraintWidget)localObject1).getHeight())
        {
          f2 = f4 + i1;
          break;
        }
        f1 = f2;
        if (localObject1 != paramConstraintWidgetContainer) {
          f1 = f2 + localObject1.mListAnchors[paramInt2].getMargin();
        }
        f2 = f3 + localObject1.mListAnchors[paramInt2].getMargin() + localObject1.mListAnchors[(paramInt2 + 1)].getMargin();
      }
      int i3 = k;
      if (((ConstraintWidget)localObject1).getVisibility() != 8)
      {
        i3 = k;
        if (localObject1.mListDimensionBehaviors[paramInt1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
        {
          i3 = k + 1;
          if (paramInt1 == 0)
          {
            if (((ConstraintWidget)localObject1).mMatchConstraintDefaultWidth != 0) {
              return false;
            }
            if ((((ConstraintWidget)localObject1).mMatchConstraintMinWidth != 0) || (((ConstraintWidget)localObject1).mMatchConstraintMaxWidth != 0)) {
              return false;
            }
          }
          else
          {
            if (((ConstraintWidget)localObject1).mMatchConstraintDefaultHeight != 0) {
              return false;
            }
            if ((((ConstraintWidget)localObject1).mMatchConstraintMinHeight != 0) || (((ConstraintWidget)localObject1).mMatchConstraintMaxHeight != 0)) {
              return false;
            }
          }
        }
      }
      paramChainHead = localObject1.mListAnchors[(paramInt2 + 1)].mTarget;
      if (paramChainHead != null)
      {
        paramChainHead = paramChainHead.mOwner;
        if ((paramChainHead.mListAnchors[paramInt2].mTarget != null) && (paramChainHead.mListAnchors[paramInt2].mTarget.mOwner == localObject1)) {
          break label480;
        }
      }
      paramChainHead = null;
      label480:
      if (paramChainHead != null)
      {
        i1 = i2;
        k = i3;
        localObject1 = paramChainHead;
        f4 = f1;
        f3 = f2;
      }
      else
      {
        i = 1;
        i1 = i2;
        k = i3;
        f4 = f1;
        f3 = f2;
      }
    }
    ResolutionAnchor localResolutionAnchor = localObject2.mListAnchors[paramInt2].getResolutionNode();
    paramChainHead = localConstraintWidget2.mListAnchors;
    int i2 = paramInt2 + 1;
    paramChainHead = paramChainHead[i2].getResolutionNode();
    if ((localResolutionAnchor.target != null) && (paramChainHead.target != null))
    {
      if ((localResolutionAnchor.target.state != 1) && (paramChainHead.target.state != 1)) {
        return false;
      }
      if ((k > 0) && (k != i1)) {
        return false;
      }
      if ((n == 0) && (m == 0) && (j == 0))
      {
        f1 = 0.0F;
      }
      else
      {
        if (paramConstraintWidgetContainer != null) {
          f2 = paramConstraintWidgetContainer.mListAnchors[paramInt2].getMargin();
        } else {
          f2 = 0.0F;
        }
        f1 = f2;
        if (localConstraintWidget1 != null) {
          f1 = f2 + localConstraintWidget1.mListAnchors[i2].getMargin();
        }
      }
      float f5 = localResolutionAnchor.target.resolvedOffset;
      f2 = paramChainHead.target.resolvedOffset;
      if (f5 < f2) {}
      float f6;
      for (f2 -= f5;; f2 = f5 - f2)
      {
        f6 = f2 - f4;
        break;
      }
      if ((k > 0) && (k == i1))
      {
        if ((((ConstraintWidget)localObject1).getParent() != null) && (localObject1.getParent().mListDimensionBehaviors[paramInt1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
          return false;
        }
        f4 = f6 + f4 - f3;
        f2 = f4;
        if (m != 0) {
          f2 = f4 - (f3 - f1);
        }
        f1 = f5;
        paramChainHead = paramConstraintWidgetContainer;
        if (m != 0)
        {
          f3 = f5 + paramConstraintWidgetContainer.mListAnchors[i2].getMargin();
          localObject1 = paramConstraintWidgetContainer.mListNextVisibleWidget[paramInt1];
          f1 = f3;
          paramChainHead = paramConstraintWidgetContainer;
          if (localObject1 != null) {
            f1 = f3 + localObject1.mListAnchors[paramInt2].getMargin();
          }
        }
        for (paramChainHead = paramConstraintWidgetContainer; paramChainHead != null; paramChainHead = paramConstraintWidgetContainer)
        {
          if (LinearSystem.sMetrics != null)
          {
            paramConstraintWidgetContainer = LinearSystem.sMetrics;
            paramConstraintWidgetContainer.nonresolvedWidgets -= 1L;
            paramConstraintWidgetContainer = LinearSystem.sMetrics;
            paramConstraintWidgetContainer.resolvedWidgets += 1L;
            paramConstraintWidgetContainer = LinearSystem.sMetrics;
            paramConstraintWidgetContainer.chainConnectionResolved += 1L;
          }
          paramConstraintWidgetContainer = paramChainHead.mListNextVisibleWidget[paramInt1];
          if ((paramConstraintWidgetContainer == null) && (paramChainHead != localConstraintWidget1)) {
            continue;
          }
          f3 = f2 / k;
          if (f7 > 0.0F) {
            f3 = paramChainHead.mWeight[paramInt1] * f2 / f7;
          }
          f1 += paramChainHead.mListAnchors[paramInt2].getMargin();
          paramChainHead.mListAnchors[paramInt2].getResolutionNode().resolve(localResolutionAnchor.resolvedTarget, f1);
          localObject1 = paramChainHead.mListAnchors[i2].getResolutionNode();
          localObject2 = localResolutionAnchor.resolvedTarget;
          f1 += f3;
          ((ResolutionAnchor)localObject1).resolve((ResolutionAnchor)localObject2, f1);
          paramChainHead.mListAnchors[paramInt2].getResolutionNode().addResolvedValue(paramLinearSystem);
          paramChainHead.mListAnchors[i2].getResolutionNode().addResolvedValue(paramLinearSystem);
          f1 += paramChainHead.mListAnchors[i2].getMargin();
        }
        return true;
      }
      if (f6 < f4) {
        return false;
      }
      if (n != 0) {
        for (f1 = f5 + (f6 - f1) * ((ConstraintWidget)localObject2).getHorizontalBiasPercent(); paramConstraintWidgetContainer != null; f1 = f2)
        {
          if (LinearSystem.sMetrics != null)
          {
            paramChainHead = LinearSystem.sMetrics;
            paramChainHead.nonresolvedWidgets -= 1L;
            paramChainHead = LinearSystem.sMetrics;
            paramChainHead.resolvedWidgets += 1L;
            paramChainHead = LinearSystem.sMetrics;
            paramChainHead.chainConnectionResolved += 1L;
          }
          paramChainHead = paramConstraintWidgetContainer.mListNextVisibleWidget[paramInt1];
          if (paramChainHead == null)
          {
            f2 = f1;
            if (paramConstraintWidgetContainer != localConstraintWidget1) {}
          }
          else
          {
            if (paramInt1 == 0) {}
            for (i = paramConstraintWidgetContainer.getWidth();; i = paramConstraintWidgetContainer.getHeight())
            {
              f2 = i;
              break;
            }
            f1 += paramConstraintWidgetContainer.mListAnchors[paramInt2].getMargin();
            paramConstraintWidgetContainer.mListAnchors[paramInt2].getResolutionNode().resolve(localResolutionAnchor.resolvedTarget, f1);
            localObject1 = paramConstraintWidgetContainer.mListAnchors[i2].getResolutionNode();
            localObject2 = localResolutionAnchor.resolvedTarget;
            f1 += f2;
            ((ResolutionAnchor)localObject1).resolve((ResolutionAnchor)localObject2, f1);
            paramConstraintWidgetContainer.mListAnchors[paramInt2].getResolutionNode().addResolvedValue(paramLinearSystem);
            paramConstraintWidgetContainer.mListAnchors[i2].getResolutionNode().addResolvedValue(paramLinearSystem);
            f2 = f1 + paramConstraintWidgetContainer.mListAnchors[i2].getMargin();
          }
          paramConstraintWidgetContainer = paramChainHead;
        }
      }
      for (;;)
      {
        return true;
        if ((m != 0) || (j != 0))
        {
          if (m != 0) {}
          do
          {
            f2 = f6 - f1;
            break;
            f2 = f6;
          } while (j != 0);
          f3 = f2 / (i1 + 1);
          if (j != 0)
          {
            if (i1 > 1) {}
            for (f1 = i1 - 1;; f1 = 2.0F)
            {
              f3 = f2 / f1;
              break;
            }
          }
          f2 = f5 + f3;
          f1 = f2;
          if (j != 0)
          {
            f1 = f2;
            if (i1 > 1) {
              f1 = paramConstraintWidgetContainer.mListAnchors[paramInt2].getMargin() + f5;
            }
          }
          f2 = f1;
          paramChainHead = paramConstraintWidgetContainer;
          if (m != 0)
          {
            f2 = f1;
            paramChainHead = paramConstraintWidgetContainer;
            if (paramConstraintWidgetContainer != null)
            {
              f2 = f1 + paramConstraintWidgetContainer.mListAnchors[paramInt2].getMargin();
              paramChainHead = paramConstraintWidgetContainer;
            }
          }
          while (paramChainHead != null)
          {
            if (LinearSystem.sMetrics != null)
            {
              paramConstraintWidgetContainer = LinearSystem.sMetrics;
              paramConstraintWidgetContainer.nonresolvedWidgets -= 1L;
              paramConstraintWidgetContainer = LinearSystem.sMetrics;
              paramConstraintWidgetContainer.resolvedWidgets += 1L;
              paramConstraintWidgetContainer = LinearSystem.sMetrics;
              paramConstraintWidgetContainer.chainConnectionResolved += 1L;
            }
            paramConstraintWidgetContainer = paramChainHead.mListNextVisibleWidget[paramInt1];
            if (paramConstraintWidgetContainer == null)
            {
              f1 = f2;
              if (paramChainHead != localConstraintWidget1) {}
            }
            else
            {
              if (paramInt1 == 0) {}
              for (i = paramChainHead.getWidth();; i = paramChainHead.getHeight())
              {
                f1 = i;
                break;
              }
              paramChainHead.mListAnchors[paramInt2].getResolutionNode().resolve(localResolutionAnchor.resolvedTarget, f2);
              paramChainHead.mListAnchors[i2].getResolutionNode().resolve(localResolutionAnchor.resolvedTarget, f2 + f1);
              paramChainHead.mListAnchors[paramInt2].getResolutionNode().addResolvedValue(paramLinearSystem);
              paramChainHead.mListAnchors[i2].getResolutionNode().addResolvedValue(paramLinearSystem);
              f1 = f2 + (f1 + f3);
            }
            paramChainHead = paramConstraintWidgetContainer;
            f2 = f1;
          }
        }
      }
    }
    return false;
  }
  
  static void checkMatchParent(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, ConstraintWidget paramConstraintWidget)
  {
    int i;
    int j;
    if ((paramConstraintWidgetContainer.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (paramConstraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
    {
      i = paramConstraintWidget.mLeft.mMargin;
      j = paramConstraintWidgetContainer.getWidth() - paramConstraintWidget.mRight.mMargin;
      paramConstraintWidget.mLeft.mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidget.mLeft);
      paramConstraintWidget.mRight.mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidget.mRight);
      paramLinearSystem.addEquality(paramConstraintWidget.mLeft.mSolverVariable, i);
      paramLinearSystem.addEquality(paramConstraintWidget.mRight.mSolverVariable, j);
      paramConstraintWidget.mHorizontalResolution = 2;
      paramConstraintWidget.setHorizontalDimension(i, j);
    }
    if ((paramConstraintWidgetContainer.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (paramConstraintWidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
    {
      i = paramConstraintWidget.mTop.mMargin;
      j = paramConstraintWidgetContainer.getHeight() - paramConstraintWidget.mBottom.mMargin;
      paramConstraintWidget.mTop.mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidget.mTop);
      paramConstraintWidget.mBottom.mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidget.mBottom);
      paramLinearSystem.addEquality(paramConstraintWidget.mTop.mSolverVariable, i);
      paramLinearSystem.addEquality(paramConstraintWidget.mBottom.mSolverVariable, j);
      if ((paramConstraintWidget.mBaselineDistance > 0) || (paramConstraintWidget.getVisibility() == 8))
      {
        paramConstraintWidget.mBaseline.mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidget.mBaseline);
        paramLinearSystem.addEquality(paramConstraintWidget.mBaseline.mSolverVariable, paramConstraintWidget.mBaselineDistance + i);
      }
      paramConstraintWidget.mVerticalResolution = 2;
      paramConstraintWidget.setVerticalDimension(i, j);
    }
  }
  
  private static boolean optimizableMatchConstraint(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    if (paramConstraintWidget.mListDimensionBehaviors[paramInt] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
      return false;
    }
    float f = paramConstraintWidget.mDimensionRatio;
    int i = 1;
    if (f != 0.0F)
    {
      paramConstraintWidget = paramConstraintWidget.mListDimensionBehaviors;
      if (paramInt == 0) {
        paramInt = i;
      } else {
        paramInt = 0;
      }
      if (paramConstraintWidget[paramInt] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {}
      return false;
    }
    if (paramInt == 0)
    {
      if (paramConstraintWidget.mMatchConstraintDefaultWidth != 0) {
        return false;
      }
      if ((paramConstraintWidget.mMatchConstraintMinWidth != 0) || (paramConstraintWidget.mMatchConstraintMaxWidth != 0)) {
        return false;
      }
    }
    else
    {
      if (paramConstraintWidget.mMatchConstraintDefaultHeight != 0) {
        return false;
      }
      if (paramConstraintWidget.mMatchConstraintMinHeight != 0) {
        break label110;
      }
      if (paramConstraintWidget.mMatchConstraintMaxHeight != 0) {
        return false;
      }
    }
    return true;
    label110:
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/constraint/solver/widgets/Optimizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */