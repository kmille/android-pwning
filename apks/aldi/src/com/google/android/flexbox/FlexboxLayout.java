package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlexboxLayout
  extends ViewGroup
  implements a
{
  public static final int SHOW_DIVIDER_BEGINNING = 1;
  public static final int SHOW_DIVIDER_END = 4;
  public static final int SHOW_DIVIDER_MIDDLE = 2;
  public static final int SHOW_DIVIDER_NONE = 0;
  private int mAlignContent;
  private int mAlignItems;
  @Nullable
  private Drawable mDividerDrawableHorizontal;
  @Nullable
  private Drawable mDividerDrawableVertical;
  private int mDividerHorizontalHeight;
  private int mDividerVerticalWidth;
  private int mFlexDirection;
  private List<c> mFlexLines = new ArrayList();
  private d.a mFlexLinesResult = new d.a();
  private int mFlexWrap;
  private d mFlexboxHelper = new d(this);
  private int mJustifyContent;
  private int mMaxLine = -1;
  private SparseIntArray mOrderCache;
  private int[] mReorderedIndices;
  private int mShowDividerHorizontal;
  private int mShowDividerVertical;
  
  public FlexboxLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlexboxLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FlexboxLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, e.a.FlexboxLayout, paramInt, 0);
    this.mFlexDirection = paramContext.getInt(e.a.FlexboxLayout_flexDirection, 0);
    this.mFlexWrap = paramContext.getInt(e.a.FlexboxLayout_flexWrap, 0);
    this.mJustifyContent = paramContext.getInt(e.a.FlexboxLayout_justifyContent, 0);
    this.mAlignItems = paramContext.getInt(e.a.FlexboxLayout_alignItems, 4);
    this.mAlignContent = paramContext.getInt(e.a.FlexboxLayout_alignContent, 5);
    this.mMaxLine = paramContext.getInt(e.a.FlexboxLayout_maxLine, -1);
    paramAttributeSet = paramContext.getDrawable(e.a.FlexboxLayout_dividerDrawable);
    if (paramAttributeSet != null)
    {
      setDividerDrawableHorizontal(paramAttributeSet);
      setDividerDrawableVertical(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getDrawable(e.a.FlexboxLayout_dividerDrawableHorizontal);
    if (paramAttributeSet != null) {
      setDividerDrawableHorizontal(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getDrawable(e.a.FlexboxLayout_dividerDrawableVertical);
    if (paramAttributeSet != null) {
      setDividerDrawableVertical(paramAttributeSet);
    }
    paramInt = paramContext.getInt(e.a.FlexboxLayout_showDivider, 0);
    if (paramInt != 0)
    {
      this.mShowDividerVertical = paramInt;
      this.mShowDividerHorizontal = paramInt;
    }
    paramInt = paramContext.getInt(e.a.FlexboxLayout_showDividerVertical, 0);
    if (paramInt != 0) {
      this.mShowDividerVertical = paramInt;
    }
    paramInt = paramContext.getInt(e.a.FlexboxLayout_showDividerHorizontal, 0);
    if (paramInt != 0) {
      this.mShowDividerHorizontal = paramInt;
    }
    paramContext.recycle();
  }
  
  private boolean allFlexLinesAreDummyBefore(int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      if (((c)this.mFlexLines.get(i)).a() > 0) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private boolean allViewsAreGoneBefore(int paramInt1, int paramInt2)
  {
    int i = 1;
    while (i <= paramInt2)
    {
      View localView = getReorderedChildAt(paramInt1 - i);
      if ((localView != null) && (localView.getVisibility() != 8)) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private void drawDividersHorizontal(Canvas paramCanvas, boolean paramBoolean1, boolean paramBoolean2)
  {
    int m = getPaddingLeft();
    int i = getPaddingRight();
    int n = Math.max(0, getWidth() - i - m);
    int i1 = this.mFlexLines.size();
    i = 0;
    while (i < i1)
    {
      c localc = (c)this.mFlexLines.get(i);
      int j = 0;
      while (j < localc.h)
      {
        int k = localc.o + j;
        View localView = getReorderedChildAt(k);
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          a locala = (a)localView.getLayoutParams();
          if (hasDividerBeforeChildAtAlongMainAxis(k, j))
          {
            if (paramBoolean1) {
              k = localView.getRight() + locala.rightMargin;
            } else {
              k = localView.getLeft() - locala.leftMargin - this.mDividerVerticalWidth;
            }
            drawVerticalDivider(paramCanvas, k, localc.b, localc.g);
          }
          if ((j == localc.h - 1) && ((this.mShowDividerVertical & 0x4) > 0))
          {
            if (paramBoolean1) {
              k = localView.getLeft() - locala.leftMargin - this.mDividerVerticalWidth;
            } else {
              k = localView.getRight() + locala.rightMargin;
            }
            drawVerticalDivider(paramCanvas, k, localc.b, localc.g);
          }
        }
        j += 1;
      }
      if (hasDividerBeforeFlexLine(i))
      {
        if (paramBoolean2) {
          j = localc.d;
        } else {
          j = localc.b - this.mDividerHorizontalHeight;
        }
        drawHorizontalDivider(paramCanvas, m, j, n);
      }
      if ((hasEndDividerAfterFlexLine(i)) && ((this.mShowDividerHorizontal & 0x4) > 0))
      {
        if (paramBoolean2) {
          j = localc.b - this.mDividerHorizontalHeight;
        } else {
          j = localc.d;
        }
        drawHorizontalDivider(paramCanvas, m, j, n);
      }
      i += 1;
    }
  }
  
  private void drawDividersVertical(Canvas paramCanvas, boolean paramBoolean1, boolean paramBoolean2)
  {
    int m = getPaddingTop();
    int i = getPaddingBottom();
    int n = Math.max(0, getHeight() - i - m);
    int i1 = this.mFlexLines.size();
    i = 0;
    while (i < i1)
    {
      c localc = (c)this.mFlexLines.get(i);
      int j = 0;
      while (j < localc.h)
      {
        int k = localc.o + j;
        View localView = getReorderedChildAt(k);
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          a locala = (a)localView.getLayoutParams();
          if (hasDividerBeforeChildAtAlongMainAxis(k, j))
          {
            if (paramBoolean2) {
              k = localView.getBottom() + locala.bottomMargin;
            } else {
              k = localView.getTop() - locala.topMargin - this.mDividerHorizontalHeight;
            }
            drawHorizontalDivider(paramCanvas, localc.a, k, localc.g);
          }
          if ((j == localc.h - 1) && ((this.mShowDividerHorizontal & 0x4) > 0))
          {
            if (paramBoolean2) {
              k = localView.getTop() - locala.topMargin - this.mDividerHorizontalHeight;
            } else {
              k = localView.getBottom() + locala.bottomMargin;
            }
            drawHorizontalDivider(paramCanvas, localc.a, k, localc.g);
          }
        }
        j += 1;
      }
      if (hasDividerBeforeFlexLine(i))
      {
        if (paramBoolean1) {
          j = localc.c;
        } else {
          j = localc.a - this.mDividerVerticalWidth;
        }
        drawVerticalDivider(paramCanvas, j, m, n);
      }
      if ((hasEndDividerAfterFlexLine(i)) && ((this.mShowDividerVertical & 0x4) > 0))
      {
        if (paramBoolean1) {
          j = localc.a - this.mDividerVerticalWidth;
        } else {
          j = localc.c;
        }
        drawVerticalDivider(paramCanvas, j, m, n);
      }
      i += 1;
    }
  }
  
  private void drawHorizontalDivider(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mDividerDrawableHorizontal == null) {
      return;
    }
    this.mDividerDrawableHorizontal.setBounds(paramInt1, paramInt2, paramInt3 + paramInt1, this.mDividerHorizontalHeight + paramInt2);
    this.mDividerDrawableHorizontal.draw(paramCanvas);
  }
  
  private void drawVerticalDivider(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mDividerDrawableVertical == null) {
      return;
    }
    this.mDividerDrawableVertical.setBounds(paramInt1, paramInt2, this.mDividerVerticalWidth + paramInt1, paramInt3 + paramInt2);
    this.mDividerDrawableVertical.draw(paramCanvas);
  }
  
  private boolean hasDividerBeforeChildAtAlongMainAxis(int paramInt1, int paramInt2)
  {
    if (allViewsAreGoneBefore(paramInt1, paramInt2))
    {
      if (isMainAxisDirectionHorizontal()) {
        return (this.mShowDividerVertical & 0x1) != 0;
      }
      return (this.mShowDividerHorizontal & 0x1) != 0;
    }
    if (isMainAxisDirectionHorizontal()) {
      return (this.mShowDividerVertical & 0x2) != 0;
    }
    return (this.mShowDividerHorizontal & 0x2) != 0;
  }
  
  private boolean hasDividerBeforeFlexLine(int paramInt)
  {
    if (paramInt >= 0)
    {
      if (paramInt >= this.mFlexLines.size()) {
        return false;
      }
      if (allFlexLinesAreDummyBefore(paramInt))
      {
        if (isMainAxisDirectionHorizontal()) {
          return (this.mShowDividerHorizontal & 0x1) != 0;
        }
        return (this.mShowDividerVertical & 0x1) != 0;
      }
      if (isMainAxisDirectionHorizontal()) {
        return (this.mShowDividerHorizontal & 0x2) != 0;
      }
      if ((this.mShowDividerVertical & 0x2) != 0) {
        return true;
      }
    }
    return false;
  }
  
  private boolean hasEndDividerAfterFlexLine(int paramInt)
  {
    if (paramInt >= 0)
    {
      if (paramInt >= this.mFlexLines.size()) {
        return false;
      }
      paramInt += 1;
      while (paramInt < this.mFlexLines.size())
      {
        if (((c)this.mFlexLines.get(paramInt)).a() > 0) {
          return false;
        }
        paramInt += 1;
      }
      if (isMainAxisDirectionHorizontal()) {
        return (this.mShowDividerHorizontal & 0x4) != 0;
      }
      if ((this.mShowDividerVertical & 0x4) != 0) {
        return true;
      }
    }
    return false;
  }
  
  private void layoutHorizontal(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int i4 = getPaddingRight();
    int i5 = paramInt3 - paramInt1;
    paramInt3 = getPaddingBottom();
    paramInt1 = getPaddingTop();
    int i6 = this.mFlexLines.size();
    paramInt2 = paramInt4 - paramInt2 - paramInt3;
    int n = 0;
    while (n < i6)
    {
      c localc = (c)this.mFlexLines.get(n);
      paramInt3 = paramInt2;
      paramInt4 = paramInt1;
      if (hasDividerBeforeFlexLine(n))
      {
        paramInt3 = paramInt2 - this.mDividerHorizontalHeight;
        paramInt4 = paramInt1 + this.mDividerHorizontalHeight;
      }
      Object localObject;
      switch (this.mJustifyContent)
      {
      default: 
        localObject = new StringBuilder("Invalid justifyContent is set: ");
        ((StringBuilder)localObject).append(this.mJustifyContent);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      case 5: 
        paramInt1 = localc.a();
        if (paramInt1 != 0) {
          f3 = (i5 - localc.e) / (paramInt1 + 1);
        } else {
          f3 = 0.0F;
        }
        f1 = i + f3;
        f2 = i5 - i4 - f3;
        break;
      case 4: 
        paramInt1 = localc.a();
        if (paramInt1 != 0) {
          f3 = (i5 - localc.e) / paramInt1;
        } else {
          f3 = 0.0F;
        }
        f1 = i;
        f2 = f3 / 2.0F;
        f4 = i5 - i4;
        f1 += f2;
        f2 = f4 - f2;
        break;
      case 3: 
        f2 = i;
        paramInt1 = localc.a();
        if (paramInt1 != 1) {
          f1 = paramInt1 - 1;
        } else {
          f1 = 1.0F;
        }
        f3 = (i5 - localc.e) / f1;
        f4 = i5 - i4;
        f1 = f2;
        f2 = f4;
        break;
      case 2: 
        f1 = i;
        f3 = (i5 - localc.e) / 2.0F;
        f2 = i5 - i4 - (i5 - localc.e) / 2.0F;
        f1 += f3;
        break;
      case 1: 
        f1 = i5 - localc.e + i4;
        paramInt1 = localc.e - i;
        break;
      case 0: 
        f1 = i;
        paramInt1 = i5 - i4;
      }
      float f2 = paramInt1;
      float f3 = 0.0F;
      float f4 = Math.max(f3, 0.0F);
      int i1 = 0;
      f3 = f1;
      float f1 = f2;
      while (i1 < localc.h)
      {
        paramInt1 = localc.o + i1;
        View localView = getReorderedChildAt(paramInt1);
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          a locala = (a)localView.getLayoutParams();
          f3 += locala.leftMargin;
          f2 = f1 - locala.rightMargin;
          if (hasDividerBeforeChildAtAlongMainAxis(paramInt1, i1))
          {
            paramInt1 = this.mDividerVerticalWidth;
            f1 = paramInt1;
            f2 -= f1;
            f1 = f3 + f1;
          }
          else
          {
            f1 = f3;
            paramInt1 = 0;
          }
          if ((i1 == localc.h - 1) && ((this.mShowDividerVertical & 0x4) > 0)) {
            paramInt2 = this.mDividerVerticalWidth;
          } else {
            paramInt2 = 0;
          }
          int i2;
          int k;
          int m;
          int i3;
          if (this.mFlexWrap == 2)
          {
            if (paramBoolean)
            {
              localObject = this.mFlexboxHelper;
              j = Math.round(f2);
              i2 = localView.getMeasuredWidth();
              k = localView.getMeasuredHeight();
              m = Math.round(f2);
              j -= i2;
              k = paramInt3 - k;
            }
            for (;;)
            {
              i3 = paramInt3;
              i2 = m;
              m = k;
              k = j;
              ((d)localObject).a(localView, localc, k, m, i2, i3);
              break;
              localObject = this.mFlexboxHelper;
              j = Math.round(f1);
              k = paramInt3 - localView.getMeasuredHeight();
              m = Math.round(f1) + localView.getMeasuredWidth();
            }
          }
          if (paramBoolean)
          {
            localObject = this.mFlexboxHelper;
            k = Math.round(f2) - localView.getMeasuredWidth();
          }
          for (int j = Math.round(f2);; j = Math.round(f1) + localView.getMeasuredWidth())
          {
            i3 = paramInt4 + localView.getMeasuredHeight();
            m = paramInt4;
            i2 = j;
            break;
            localObject = this.mFlexboxHelper;
            k = Math.round(f1);
          }
          f3 = localView.getMeasuredWidth();
          float f5 = locala.rightMargin;
          float f6 = localView.getMeasuredWidth();
          float f7 = locala.leftMargin;
          if (paramBoolean) {}
          for (;;)
          {
            localc.a(localView, paramInt2, 0, paramInt1, 0);
            break;
            j = paramInt2;
            paramInt2 = paramInt1;
            paramInt1 = j;
          }
          f2 -= f6 + f4 + f7;
          f3 = f1 + (f3 + f4 + f5);
          f1 = f2;
        }
        i1 += 1;
      }
      paramInt1 = paramInt4 + localc.g;
      paramInt2 = paramInt3 - localc.g;
      n += 1;
    }
  }
  
  private void layoutVertical(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingTop();
    int i3 = getPaddingBottom();
    int k = getPaddingRight();
    int j = getPaddingLeft();
    int i4 = paramInt4 - paramInt2;
    int i5 = this.mFlexLines.size();
    paramInt2 = paramInt3 - paramInt1 - k;
    paramInt3 = j;
    int i1 = 0;
    while (i1 < i5)
    {
      c localc = (c)this.mFlexLines.get(i1);
      paramInt4 = paramInt3;
      paramInt1 = paramInt2;
      if (hasDividerBeforeFlexLine(i1))
      {
        paramInt4 = paramInt3 + this.mDividerVerticalWidth;
        paramInt1 = paramInt2 - this.mDividerVerticalWidth;
      }
      Object localObject;
      switch (this.mJustifyContent)
      {
      default: 
        localObject = new StringBuilder("Invalid justifyContent is set: ");
        ((StringBuilder)localObject).append(this.mJustifyContent);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      case 5: 
        paramInt2 = localc.a();
        if (paramInt2 != 0) {
          f3 = (i4 - localc.e) / (paramInt2 + 1);
        } else {
          f3 = 0.0F;
        }
        f1 = i + f3;
        f2 = i4 - i3 - f3;
        break;
      case 4: 
        paramInt2 = localc.a();
        if (paramInt2 != 0) {
          f3 = (i4 - localc.e) / paramInt2;
        } else {
          f3 = 0.0F;
        }
        f1 = i;
        f2 = f3 / 2.0F;
        f4 = i4 - i3;
        f1 += f2;
        f2 = f4 - f2;
        break;
      case 3: 
        f2 = i;
        paramInt2 = localc.a();
        if (paramInt2 != 1) {
          f1 = paramInt2 - 1;
        } else {
          f1 = 1.0F;
        }
        f3 = (i4 - localc.e) / f1;
        f4 = i4 - i3;
        f1 = f2;
        f2 = f4;
        break;
      case 2: 
        f1 = i;
        f3 = (i4 - localc.e) / 2.0F;
        f2 = i4 - i3 - (i4 - localc.e) / 2.0F;
        f1 += f3;
        break;
      case 1: 
        f1 = i4 - localc.e + i3;
        paramInt2 = localc.e - i;
        break;
      case 0: 
        f1 = i;
        paramInt2 = i4 - i3;
      }
      float f2 = paramInt2;
      float f3 = 0.0F;
      float f4 = Math.max(f3, 0.0F);
      int i2 = 0;
      f3 = f1;
      float f1 = f2;
      while (i2 < localc.h)
      {
        paramInt2 = localc.o + i2;
        View localView = getReorderedChildAt(paramInt2);
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          a locala = (a)localView.getLayoutParams();
          f3 += locala.topMargin;
          f2 = f1 - locala.bottomMargin;
          if (hasDividerBeforeChildAtAlongMainAxis(paramInt2, i2))
          {
            paramInt2 = this.mDividerHorizontalHeight;
            f1 = paramInt2;
            f2 -= f1;
            f1 = f3 + f1;
          }
          else
          {
            f1 = f3;
            paramInt2 = 0;
          }
          if ((i2 == localc.h - 1) && ((this.mShowDividerHorizontal & 0x4) > 0)) {
            paramInt3 = this.mDividerHorizontalHeight;
          } else {
            paramInt3 = 0;
          }
          int n;
          boolean bool;
          if (paramBoolean1)
          {
            if (paramBoolean2)
            {
              localObject = this.mFlexboxHelper;
              j = localView.getMeasuredWidth();
              k = Math.round(f2);
              n = localView.getMeasuredHeight();
              m = Math.round(f2);
              bool = true;
              j = paramInt1 - j;
              k -= n;
            }
            for (n = paramInt1;; n = paramInt1)
            {
              ((d)localObject).a(localView, localc, bool, j, k, n, m);
              break;
              localObject = this.mFlexboxHelper;
              bool = true;
              j = paramInt1 - localView.getMeasuredWidth();
              k = Math.round(f1);
              m = Math.round(f1) + localView.getMeasuredHeight();
            }
          }
          if (paramBoolean2)
          {
            localObject = this.mFlexboxHelper;
            k = Math.round(f2) - localView.getMeasuredHeight();
            n = paramInt4 + localView.getMeasuredWidth();
          }
          for (int m = Math.round(f2);; m = Math.round(f1) + localView.getMeasuredHeight())
          {
            bool = false;
            j = paramInt4;
            break;
            localObject = this.mFlexboxHelper;
            k = Math.round(f1);
            n = paramInt4 + localView.getMeasuredWidth();
          }
          f3 = localView.getMeasuredHeight();
          float f5 = locala.bottomMargin;
          float f6 = localView.getMeasuredHeight();
          float f7 = locala.topMargin;
          if (paramBoolean2) {}
          for (;;)
          {
            localc.a(localView, 0, paramInt3, 0, paramInt2);
            break;
            j = paramInt3;
            paramInt3 = paramInt2;
            paramInt2 = j;
          }
          f2 -= f6 + f4 + f7;
          f3 = f1 + (f3 + f4 + f5);
          f1 = f2;
        }
        i2 += 1;
      }
      paramInt3 = paramInt4 + localc.g;
      paramInt2 = paramInt1 - localc.g;
      i1 += 1;
    }
  }
  
  private void measureHorizontal(int paramInt1, int paramInt2)
  {
    this.mFlexLines.clear();
    this.mFlexLinesResult.a();
    this.mFlexboxHelper.a(this.mFlexLinesResult, paramInt1, paramInt2, Integer.MAX_VALUE, 0, -1, null);
    this.mFlexLines = this.mFlexLinesResult.a;
    this.mFlexboxHelper.a(paramInt1, paramInt2, 0);
    if (this.mAlignItems == 3)
    {
      Iterator localIterator = this.mFlexLines.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        int i = 0;
        int k;
        for (int j = Integer.MIN_VALUE; i < localc.h; j = k)
        {
          View localView = getReorderedChildAt(localc.o + i);
          k = j;
          if (localView != null)
          {
            k = j;
            if (localView.getVisibility() != 8)
            {
              a locala = (a)localView.getLayoutParams();
              if (this.mFlexWrap != 2) {
                k = Math.max(localc.l - localView.getBaseline(), locala.topMargin);
              }
              for (k = localView.getMeasuredHeight() + k + locala.bottomMargin;; k = localView.getMeasuredHeight() + locala.topMargin + k)
              {
                k = Math.max(j, k);
                break;
                k = Math.max(localc.l - localView.getMeasuredHeight() + localView.getBaseline(), locala.bottomMargin);
              }
            }
          }
          i += 1;
        }
        localc.g = j;
      }
    }
    this.mFlexboxHelper.b(paramInt1, paramInt2, getPaddingTop() + getPaddingBottom());
    this.mFlexboxHelper.a(0);
    setMeasuredDimensionForFlex(this.mFlexDirection, paramInt1, paramInt2, this.mFlexLinesResult.b);
  }
  
  private void measureVertical(int paramInt1, int paramInt2)
  {
    this.mFlexLines.clear();
    this.mFlexLinesResult.a();
    this.mFlexboxHelper.a(this.mFlexLinesResult, paramInt2, paramInt1, Integer.MAX_VALUE, 0, -1, null);
    this.mFlexLines = this.mFlexLinesResult.a;
    this.mFlexboxHelper.a(paramInt1, paramInt2, 0);
    this.mFlexboxHelper.b(paramInt1, paramInt2, getPaddingLeft() + getPaddingRight());
    this.mFlexboxHelper.a(0);
    setMeasuredDimensionForFlex(this.mFlexDirection, paramInt1, paramInt2, this.mFlexLinesResult.b);
  }
  
  private void setMeasuredDimensionForFlex(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt3);
    int m = View.MeasureSpec.getSize(paramInt3);
    int i;
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(paramInt1)));
    case 2: 
    case 3: 
      paramInt1 = getLargestMainSize();
      i = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
      break;
    case 0: 
    case 1: 
      paramInt1 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
      i = getLargestMainSize();
    }
    int k;
    if (j != Integer.MIN_VALUE) {
      if (j != 0) {
        if (j == 1073741824)
        {
          k = n;
          j = paramInt4;
          if (n < i)
          {
            j = View.combineMeasuredStates(paramInt4, 16777216);
            k = n;
          }
        }
      }
    }
    for (;;)
    {
      paramInt2 = View.resolveSizeAndState(k, paramInt2, j);
      paramInt4 = j;
      break label237;
      throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(j)));
      paramInt2 = View.resolveSizeAndState(i, paramInt2, paramInt4);
      break label237;
      if (n < i) {
        break;
      }
      k = i;
      j = paramInt4;
    }
    label237:
    if (i1 != Integer.MIN_VALUE)
    {
      i = paramInt1;
      j = paramInt4;
      if (i1 != 0)
      {
        if (i1 == 1073741824)
        {
          i = paramInt4;
          if (m < paramInt1) {
            i = View.combineMeasuredStates(paramInt4, 256);
          }
          paramInt1 = View.resolveSizeAndState(m, paramInt3, i);
          break label358;
        }
        throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(i1)));
      }
    }
    for (;;)
    {
      paramInt1 = View.resolveSizeAndState(i, paramInt3, j);
      break;
      i = paramInt1;
      j = paramInt4;
      if (m < paramInt1)
      {
        j = View.combineMeasuredStates(paramInt4, 256);
        i = m;
      }
    }
    label358:
    setMeasuredDimension(paramInt2, paramInt1);
  }
  
  private void setWillNotDrawFlag()
  {
    if ((this.mDividerDrawableHorizontal == null) && (this.mDividerDrawableVertical == null)) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      return;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.mOrderCache == null) {
      this.mOrderCache = new SparseIntArray(getChildCount());
    }
    this.mReorderedIndices = this.mFlexboxHelper.a(paramView, paramInt, paramLayoutParams, this.mOrderCache);
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof a)) {
      return new a((a)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new a((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new a(paramLayoutParams);
  }
  
  public a generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  public int getAlignContent()
  {
    return this.mAlignContent;
  }
  
  public int getAlignItems()
  {
    return this.mAlignItems;
  }
  
  public int getChildHeightMeasureSpec(int paramInt1, int paramInt2, int paramInt3)
  {
    return getChildMeasureSpec(paramInt1, paramInt2, paramInt3);
  }
  
  public int getChildWidthMeasureSpec(int paramInt1, int paramInt2, int paramInt3)
  {
    return getChildMeasureSpec(paramInt1, paramInt2, paramInt3);
  }
  
  public int getDecorationLengthCrossAxis(View paramView)
  {
    return 0;
  }
  
  public int getDecorationLengthMainAxis(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = isMainAxisDirectionHorizontal();
    int j = 0;
    int i = 0;
    if (bool)
    {
      if (hasDividerBeforeChildAtAlongMainAxis(paramInt1, paramInt2)) {
        i = 0 + this.mDividerVerticalWidth;
      }
      paramInt1 = i;
      if ((this.mShowDividerVertical & 0x4) <= 0) {}
    }
    else
    {
      for (paramInt1 = this.mDividerVerticalWidth;; paramInt1 = this.mDividerHorizontalHeight)
      {
        return i + paramInt1;
        i = j;
        if (hasDividerBeforeChildAtAlongMainAxis(paramInt1, paramInt2)) {
          i = 0 + this.mDividerHorizontalHeight;
        }
        paramInt1 = i;
        if ((this.mShowDividerHorizontal & 0x4) <= 0) {
          break;
        }
      }
    }
    return paramInt1;
  }
  
  @Nullable
  public Drawable getDividerDrawableHorizontal()
  {
    return this.mDividerDrawableHorizontal;
  }
  
  @Nullable
  public Drawable getDividerDrawableVertical()
  {
    return this.mDividerDrawableVertical;
  }
  
  public int getFlexDirection()
  {
    return this.mFlexDirection;
  }
  
  public View getFlexItemAt(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  public int getFlexItemCount()
  {
    return getChildCount();
  }
  
  public List<c> getFlexLines()
  {
    ArrayList localArrayList = new ArrayList(this.mFlexLines.size());
    Iterator localIterator = this.mFlexLines.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.a() != 0) {
        localArrayList.add(localc);
      }
    }
    return localArrayList;
  }
  
  public List<c> getFlexLinesInternal()
  {
    return this.mFlexLines;
  }
  
  public int getFlexWrap()
  {
    return this.mFlexWrap;
  }
  
  public int getJustifyContent()
  {
    return this.mJustifyContent;
  }
  
  public int getLargestMainSize()
  {
    Iterator localIterator = this.mFlexLines.iterator();
    for (int i = Integer.MIN_VALUE; localIterator.hasNext(); i = Math.max(i, ((c)localIterator.next()).e)) {}
    return i;
  }
  
  public int getMaxLine()
  {
    return this.mMaxLine;
  }
  
  public View getReorderedChildAt(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.mReorderedIndices.length)) {
      return getChildAt(this.mReorderedIndices[paramInt]);
    }
    return null;
  }
  
  public View getReorderedFlexItemAt(int paramInt)
  {
    return getReorderedChildAt(paramInt);
  }
  
  public int getShowDividerHorizontal()
  {
    return this.mShowDividerHorizontal;
  }
  
  public int getShowDividerVertical()
  {
    return this.mShowDividerVertical;
  }
  
  public int getSumOfCrossSize()
  {
    int m = this.mFlexLines.size();
    int k = 0;
    int i = 0;
    while (k < m)
    {
      c localc = (c)this.mFlexLines.get(k);
      int j = i;
      if (hasDividerBeforeFlexLine(k))
      {
        if (isMainAxisDirectionHorizontal()) {}
        for (j = this.mDividerHorizontalHeight;; j = this.mDividerVerticalWidth)
        {
          j = i + j;
          break;
        }
      }
      i = j;
      if (hasEndDividerAfterFlexLine(k))
      {
        if (isMainAxisDirectionHorizontal()) {}
        for (i = this.mDividerHorizontalHeight;; i = this.mDividerVerticalWidth)
        {
          i = j + i;
          break;
        }
      }
      i += localc.g;
      k += 1;
    }
    return i;
  }
  
  public boolean isMainAxisDirectionHorizontal()
  {
    if (this.mFlexDirection != 0) {
      return this.mFlexDirection == 1;
    }
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.mDividerDrawableVertical == null) && (this.mDividerDrawableHorizontal == null)) {
      return;
    }
    if ((this.mShowDividerHorizontal == 0) && (this.mShowDividerVertical == 0)) {
      return;
    }
    int i = ViewCompat.getLayoutDirection(this);
    int j = this.mFlexDirection;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool4 = true;
    switch (j)
    {
    default: 
      return;
    case 3: 
      if (i == 1) {
        bool1 = true;
      }
      bool2 = bool1;
      if (this.mFlexWrap == 2) {
        bool2 = bool1 ^ true;
      }
      drawDividersVertical(paramCanvas, bool2, true);
      return;
    case 2: 
      if (i == 1) {
        bool1 = bool4;
      } else {
        bool1 = false;
      }
      bool2 = bool1;
      if (this.mFlexWrap == 2) {
        bool2 = bool1 ^ true;
      }
      drawDividersVertical(paramCanvas, bool2, false);
      return;
    case 1: 
      if (i != 1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      if (this.mFlexWrap == 2) {
        bool2 = true;
      }
      drawDividersHorizontal(paramCanvas, bool1, bool2);
      return;
    }
    if (i == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    bool2 = bool3;
    if (this.mFlexWrap == 2) {
      bool2 = true;
    }
    drawDividersHorizontal(paramCanvas, bool1, bool2);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = ViewCompat.getLayoutDirection(this);
    int j = this.mFlexDirection;
    boolean bool = false;
    paramBoolean = false;
    switch (j)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder("Invalid flex direction is set: ");
      localStringBuilder.append(this.mFlexDirection);
      throw new IllegalStateException(localStringBuilder.toString());
    case 3: 
      if (i == 1) {
        paramBoolean = true;
      }
      if (this.mFlexWrap == 2) {
        paramBoolean ^= true;
      }
      layoutVertical(paramBoolean, true, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    case 2: 
      paramBoolean = bool;
      if (i == 1) {
        paramBoolean = true;
      }
      if (this.mFlexWrap == 2) {
        paramBoolean ^= true;
      }
      layoutVertical(paramBoolean, false, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    case 1: 
      if (i != 1) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      layoutHorizontal(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    if (i == 1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    layoutHorizontal(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.mOrderCache == null) {
      this.mOrderCache = new SparseIntArray(getChildCount());
    }
    if (this.mFlexboxHelper.b(this.mOrderCache)) {
      this.mReorderedIndices = this.mFlexboxHelper.a(this.mOrderCache);
    }
    switch (this.mFlexDirection)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder("Invalid value for the flex direction is set: ");
      localStringBuilder.append(this.mFlexDirection);
      throw new IllegalStateException(localStringBuilder.toString());
    case 2: 
    case 3: 
      measureVertical(paramInt1, paramInt2);
      return;
    }
    measureHorizontal(paramInt1, paramInt2);
  }
  
  public void onNewFlexItemAdded(View paramView, int paramInt1, int paramInt2, c paramc)
  {
    if (hasDividerBeforeChildAtAlongMainAxis(paramInt1, paramInt2))
    {
      if (isMainAxisDirectionHorizontal())
      {
        paramc.e += this.mDividerVerticalWidth;
        paramc.f += this.mDividerVerticalWidth;
        return;
      }
      paramc.e += this.mDividerHorizontalHeight;
      paramc.f += this.mDividerHorizontalHeight;
    }
  }
  
  public void onNewFlexLineAdded(c paramc)
  {
    if (isMainAxisDirectionHorizontal())
    {
      if ((this.mShowDividerVertical & 0x4) > 0)
      {
        paramc.e += this.mDividerVerticalWidth;
        paramc.f += this.mDividerVerticalWidth;
      }
    }
    else if ((this.mShowDividerHorizontal & 0x4) > 0)
    {
      paramc.e += this.mDividerHorizontalHeight;
      paramc.f += this.mDividerHorizontalHeight;
    }
  }
  
  public void setAlignContent(int paramInt)
  {
    if (this.mAlignContent != paramInt)
    {
      this.mAlignContent = paramInt;
      requestLayout();
    }
  }
  
  public void setAlignItems(int paramInt)
  {
    if (this.mAlignItems != paramInt)
    {
      this.mAlignItems = paramInt;
      requestLayout();
    }
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    setDividerDrawableHorizontal(paramDrawable);
    setDividerDrawableVertical(paramDrawable);
  }
  
  public void setDividerDrawableHorizontal(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable == this.mDividerDrawableHorizontal) {
      return;
    }
    this.mDividerDrawableHorizontal = paramDrawable;
    if (paramDrawable != null) {}
    for (int i = paramDrawable.getIntrinsicHeight();; i = 0)
    {
      this.mDividerHorizontalHeight = i;
      break;
    }
    setWillNotDrawFlag();
    requestLayout();
  }
  
  public void setDividerDrawableVertical(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable == this.mDividerDrawableVertical) {
      return;
    }
    this.mDividerDrawableVertical = paramDrawable;
    if (paramDrawable != null) {}
    for (int i = paramDrawable.getIntrinsicWidth();; i = 0)
    {
      this.mDividerVerticalWidth = i;
      break;
    }
    setWillNotDrawFlag();
    requestLayout();
  }
  
  public void setFlexDirection(int paramInt)
  {
    if (this.mFlexDirection != paramInt)
    {
      this.mFlexDirection = paramInt;
      requestLayout();
    }
  }
  
  public void setFlexLines(List<c> paramList)
  {
    this.mFlexLines = paramList;
  }
  
  public void setFlexWrap(int paramInt)
  {
    if (this.mFlexWrap != paramInt)
    {
      this.mFlexWrap = paramInt;
      requestLayout();
    }
  }
  
  public void setJustifyContent(int paramInt)
  {
    if (this.mJustifyContent != paramInt)
    {
      this.mJustifyContent = paramInt;
      requestLayout();
    }
  }
  
  public void setMaxLine(int paramInt)
  {
    if (this.mMaxLine != paramInt)
    {
      this.mMaxLine = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDivider(int paramInt)
  {
    setShowDividerVertical(paramInt);
    setShowDividerHorizontal(paramInt);
  }
  
  public void setShowDividerHorizontal(int paramInt)
  {
    if (paramInt != this.mShowDividerHorizontal)
    {
      this.mShowDividerHorizontal = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividerVertical(int paramInt)
  {
    if (paramInt != this.mShowDividerVertical)
    {
      this.mShowDividerVertical = paramInt;
      requestLayout();
    }
  }
  
  public void updateViewCache(int paramInt, View paramView) {}
  
  public static final class a
    extends ViewGroup.MarginLayoutParams
    implements b
  {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator() {};
    private int a = 1;
    private float b = 0.0F;
    private float c = 1.0F;
    private int d = -1;
    private float e = -1.0F;
    private int f;
    private int g;
    private int h = 16777215;
    private int i = 16777215;
    private boolean j;
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, e.a.FlexboxLayout_Layout);
      this.a = paramContext.getInt(e.a.FlexboxLayout_Layout_layout_order, 1);
      this.b = paramContext.getFloat(e.a.FlexboxLayout_Layout_layout_flexGrow, 0.0F);
      this.c = paramContext.getFloat(e.a.FlexboxLayout_Layout_layout_flexShrink, 1.0F);
      this.d = paramContext.getInt(e.a.FlexboxLayout_Layout_layout_alignSelf, -1);
      this.e = paramContext.getFraction(e.a.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0F);
      this.f = paramContext.getDimensionPixelSize(e.a.FlexboxLayout_Layout_layout_minWidth, 0);
      this.g = paramContext.getDimensionPixelSize(e.a.FlexboxLayout_Layout_layout_minHeight, 0);
      this.h = paramContext.getDimensionPixelSize(e.a.FlexboxLayout_Layout_layout_maxWidth, 16777215);
      this.i = paramContext.getDimensionPixelSize(e.a.FlexboxLayout_Layout_layout_maxHeight, 16777215);
      this.j = paramContext.getBoolean(e.a.FlexboxLayout_Layout_layout_wrapBefore, false);
      paramContext.recycle();
    }
    
    protected a(Parcel paramParcel)
    {
      super(0);
      this.a = paramParcel.readInt();
      this.b = paramParcel.readFloat();
      this.c = paramParcel.readFloat();
      this.d = paramParcel.readInt();
      this.e = paramParcel.readFloat();
      this.f = paramParcel.readInt();
      this.g = paramParcel.readInt();
      this.h = paramParcel.readInt();
      this.i = paramParcel.readInt();
      if (paramParcel.readByte() != 0) {
        bool = true;
      }
      this.j = bool;
      this.bottomMargin = paramParcel.readInt();
      this.leftMargin = paramParcel.readInt();
      this.rightMargin = paramParcel.readInt();
      this.topMargin = paramParcel.readInt();
      this.height = paramParcel.readInt();
      this.width = paramParcel.readInt();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public a(a parama)
    {
      super();
      this.a = parama.a;
      this.b = parama.b;
      this.c = parama.c;
      this.d = parama.d;
      this.e = parama.e;
      this.f = parama.f;
      this.g = parama.g;
      this.h = parama.h;
      this.i = parama.i;
      this.j = parama.j;
    }
    
    public final int a()
    {
      return this.width;
    }
    
    public final int b()
    {
      return this.height;
    }
    
    public final int c()
    {
      return this.a;
    }
    
    public final float d()
    {
      return this.b;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final float e()
    {
      return this.c;
    }
    
    public final int f()
    {
      return this.d;
    }
    
    public final int g()
    {
      return this.f;
    }
    
    public final int h()
    {
      return this.g;
    }
    
    public final int i()
    {
      return this.h;
    }
    
    public final int j()
    {
      return this.i;
    }
    
    public final boolean k()
    {
      return this.j;
    }
    
    public final float l()
    {
      return this.e;
    }
    
    public final int m()
    {
      return this.leftMargin;
    }
    
    public final int n()
    {
      return this.topMargin;
    }
    
    public final int o()
    {
      return this.rightMargin;
    }
    
    public final int p()
    {
      return this.bottomMargin;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/flexbox/FlexboxLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */