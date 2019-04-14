package android.support.design.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.annotation.RestrictTo;
import android.support.design.R.styleable;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

@RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout
  extends ViewGroup
{
  private int itemSpacing;
  private int lineSpacing;
  private boolean singleLine = false;
  
  public FlowLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    loadFromAttributes(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    loadFromAttributes(paramContext, paramAttributeSet);
  }
  
  private static int getMeasuredDimension(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 != Integer.MIN_VALUE)
    {
      if (paramInt2 != 1073741824) {
        return paramInt3;
      }
      return paramInt1;
    }
    return Math.min(paramInt3, paramInt1);
  }
  
  private void loadFromAttributes(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.FlowLayout, 0, 0);
    this.lineSpacing = paramContext.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
    this.itemSpacing = paramContext.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
    paramContext.recycle();
  }
  
  protected int getItemSpacing()
  {
    return this.itemSpacing;
  }
  
  protected int getLineSpacing()
  {
    return this.lineSpacing;
  }
  
  protected boolean isSingleLine()
  {
    return this.singleLine;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() == 0) {
      return;
    }
    paramInt2 = ViewCompat.getLayoutDirection(this);
    int i = 1;
    if (paramInt2 != 1) {
      i = 0;
    }
    if (i != 0) {
      paramInt2 = getPaddingRight();
    } else {
      paramInt2 = getPaddingLeft();
    }
    if (i != 0) {
      paramInt4 = getPaddingLeft();
    } else {
      paramInt4 = getPaddingRight();
    }
    int n = getPaddingTop();
    int i3 = paramInt3 - paramInt1 - paramInt4;
    paramInt4 = paramInt2;
    paramInt1 = n;
    int j = 0;
    while (j < getChildCount())
    {
      View localView = getChildAt(j);
      int m = paramInt4;
      int k = n;
      paramInt3 = paramInt1;
      if (localView.getVisibility() != 8)
      {
        Object localObject = localView.getLayoutParams();
        if ((localObject instanceof ViewGroup.MarginLayoutParams))
        {
          localObject = (ViewGroup.MarginLayoutParams)localObject;
          m = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams)localObject);
          k = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams)localObject);
        }
        else
        {
          k = 0;
          m = 0;
        }
        int i2 = localView.getMeasuredWidth();
        int i1 = paramInt4;
        paramInt3 = paramInt1;
        if (!this.singleLine)
        {
          i1 = paramInt4;
          paramInt3 = paramInt1;
          if (paramInt4 + m + i2 > i3)
          {
            paramInt3 = n + this.lineSpacing;
            i1 = paramInt2;
          }
        }
        paramInt4 = i1 + m;
        i2 = localView.getMeasuredWidth() + paramInt4;
        n = localView.getMeasuredHeight() + paramInt3;
        paramInt1 = i2;
        if (i != 0)
        {
          paramInt4 = i3 - i2;
          paramInt1 = i3 - i1 - m;
        }
        localView.layout(paramInt4, paramInt3, paramInt1, n);
        m = i1 + (m + k + localView.getMeasuredWidth() + this.itemSpacing);
        k = n;
      }
      j += 1;
      paramInt4 = m;
      n = k;
      paramInt1 = paramInt3;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i7 = View.MeasureSpec.getSize(paramInt1);
    int i8 = View.MeasureSpec.getMode(paramInt1);
    int i9 = View.MeasureSpec.getSize(paramInt2);
    int i10 = View.MeasureSpec.getMode(paramInt2);
    int n;
    if ((i8 != Integer.MIN_VALUE) && (i8 != 1073741824)) {
      n = Integer.MAX_VALUE;
    } else {
      n = i7;
    }
    int k = getPaddingLeft();
    int i = getPaddingTop();
    int i11 = getPaddingRight();
    int m = i;
    int i1 = 0;
    int j = 0;
    int i4 = i;
    i = j;
    while (i1 < getChildCount())
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() != 8)
      {
        measureChild(localView, paramInt1, paramInt2);
        Object localObject = localView.getLayoutParams();
        int i2;
        int i3;
        if ((localObject instanceof ViewGroup.MarginLayoutParams))
        {
          localObject = (ViewGroup.MarginLayoutParams)localObject;
          i2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin + 0;
          i3 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin + 0;
        }
        else
        {
          i2 = 0;
          i3 = 0;
        }
        int i12 = localView.getMeasuredWidth();
        int i6 = k;
        j = m;
        int i5 = i6;
        if (k + i2 + i12 > n - i11)
        {
          j = m;
          i5 = i6;
          if (!isSingleLine())
          {
            i5 = getPaddingLeft();
            j = this.lineSpacing + i4;
          }
        }
        m = i5 + i2 + localView.getMeasuredWidth();
        i4 = localView.getMeasuredHeight();
        k = i;
        if (m > i) {
          k = m;
        }
        i = localView.getMeasuredWidth();
        m = this.itemSpacing;
        i4 += j;
        m = i5 + (i2 + i3 + i + m);
        i = k;
        k = m;
      }
      else
      {
        j = m;
      }
      i1 += 1;
      m = j;
    }
    setMeasuredDimension(getMeasuredDimension(i7, i8, i), getMeasuredDimension(i9, i10, i4));
  }
  
  protected void setItemSpacing(int paramInt)
  {
    this.itemSpacing = paramInt;
  }
  
  protected void setLineSpacing(int paramInt)
  {
    this.lineSpacing = paramInt;
  }
  
  public void setSingleLine(boolean paramBoolean)
  {
    this.singleLine = paramBoolean;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/design/internal/FlowLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */