package com.google.android.flexbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.Properties;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager
  extends RecyclerView.LayoutManager
  implements RecyclerView.SmoothScroller.ScrollVectorProvider, a
{
  private static final Rect b = new Rect();
  private int A = -1;
  private d.a B = new d.a();
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = -1;
  private boolean h;
  private boolean i;
  private List<c> j = new ArrayList();
  private final d k = new d(this);
  private RecyclerView.Recycler l;
  private RecyclerView.State m;
  private c n;
  private a o = new a((byte)0);
  private OrientationHelper p;
  private OrientationHelper q;
  private d r;
  private int s = -1;
  private int t = Integer.MIN_VALUE;
  private int u = Integer.MIN_VALUE;
  private int v = Integer.MIN_VALUE;
  private boolean w;
  private SparseArray<View> x = new SparseArray();
  private final Context y;
  private View z;
  
  public FlexboxLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramAttributeSet = getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    switch (paramAttributeSet.orientation)
    {
    default: 
      break;
    case 1: 
      if (paramAttributeSet.reverseLayout) {}
      for (paramInt1 = 3;; paramInt1 = 2)
      {
        a(paramInt1);
        break;
      }
    case 0: 
      if (paramAttributeSet.reverseLayout) {
        a(1);
      } else {
        a(0);
      }
      break;
    }
    if (this.d != 1)
    {
      if (this.d == 0)
      {
        removeAllViews();
        d();
      }
      this.d = 1;
      this.p = null;
      this.q = null;
      requestLayout();
    }
    if (this.f != 4)
    {
      removeAllViews();
      d();
      this.f = 4;
      requestLayout();
    }
    setAutoMeasureEnabled(true);
    this.y = paramContext;
  }
  
  private int a(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (getChildCount() != 0)
    {
      if (paramInt == 0) {
        return 0;
      }
      b();
      c localc = this.n;
      int i2 = 1;
      localc.j = true;
      int i1;
      if ((!isMainAxisDirectionHorizontal()) && (this.h)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0)
      {
        if (paramInt < 0) {}
      }
      else {
        while (paramInt <= 0)
        {
          i2 = -1;
          break;
        }
      }
      int i3 = Math.abs(paramInt);
      a(i2, i3);
      int i4 = this.n.f + a(paramRecycler, paramState, this.n);
      if (i4 < 0) {
        return 0;
      }
      if (i1 != 0)
      {
        if (i3 > i4) {
          paramInt = -i2 * i4;
        }
      }
      else if (i3 > i4) {
        paramInt = i2 * i4;
      }
      this.p.offsetChildren(-paramInt);
      this.n.g = paramInt;
      return paramInt;
    }
    return 0;
  }
  
  private int a(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i1;
    if ((!isMainAxisDirectionHorizontal()) && (this.h))
    {
      i1 = this.p.getEndAfterPadding() - paramInt;
      if (i1 > 0) {
        i1 = a(-i1, paramRecycler, paramState);
      } else {
        return 0;
      }
    }
    else
    {
      i1 = paramInt - this.p.getStartAfterPadding();
      if (i1 <= 0) {
        break label121;
      }
      i1 = -a(i1, paramRecycler, paramState);
    }
    int i2 = i1;
    if (paramBoolean)
    {
      paramInt = paramInt + i1 - this.p.getStartAfterPadding();
      i2 = i1;
      if (paramInt > 0)
      {
        this.p.offsetChildren(-paramInt);
        i2 = i1 - paramInt;
      }
    }
    return i2;
    label121:
    return 0;
  }
  
  private int a(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, c paramc)
  {
    if (paramc.f != Integer.MIN_VALUE)
    {
      if (paramc.a < 0) {
        paramc.f += paramc.a;
      }
      a(paramRecycler, paramc);
    }
    int i1 = paramc.a;
    int i3 = paramc.a;
    boolean bool = isMainAxisDirectionHorizontal();
    int i4 = 0;
    for (;;)
    {
      if ((i3 <= 0) && (!this.n.b)) {}
      Object localObject;
      int i2;
      do
      {
        break;
        localObject = this.j;
        if ((paramc.d >= 0) && (paramc.d < paramState.getItemCount()) && (paramc.c >= 0) && (paramc.c < ((List)localObject).size())) {
          i2 = 1;
        } else {
          i2 = 0;
        }
      } while (i2 == 0);
      c localc = (c)this.j.get(paramc.c);
      paramc.d = localc.o;
      if (isMainAxisDirectionHorizontal())
      {
        if ((!a) && (this.k.b == null)) {
          throw new AssertionError();
        }
        int i7 = getPaddingLeft();
        int i8 = getPaddingRight();
        int i9 = getWidth();
        i2 = paramc.e;
        int i5 = i2;
        if (paramc.i == -1) {
          i5 = i2 - localc.g;
        }
        int i6 = paramc.d;
        float f2;
        float f3;
        switch (this.e)
        {
        default: 
          paramRecycler = new StringBuilder("Invalid justifyContent is set: ");
          paramRecycler.append(this.e);
          throw new IllegalStateException(paramRecycler.toString());
        case 5: 
          if (localc.h != 0) {
            f1 = (i9 - localc.e) / (localc.h + 1);
          } else {
            f1 = 0.0F;
          }
          f2 = i7 + f1;
          f3 = i9 - i8 - f1;
          break;
        case 4: 
          if (localc.h != 0) {
            f1 = (i9 - localc.e) / localc.h;
          } else {
            f1 = 0.0F;
          }
          f2 = i7;
          f3 = f1 / 2.0F;
          f2 += f3;
          f3 = i9 - i8 - f3;
          break;
        case 3: 
          f2 = i7;
          if (localc.h != 1) {
            f1 = localc.h - 1;
          } else {
            f1 = 1.0F;
          }
          f1 = (i9 - localc.e) / f1;
          f3 = i9 - i8;
          break;
        case 2: 
          f1 = i7;
          f2 = (i9 - localc.e) / 2.0F + f1;
          f3 = i9 - i8 - (i9 - localc.e) / 2.0F;
          break;
        case 1: 
          f2 = i9 - localc.e + i8;
          f3 = localc.e - i7;
          break;
        case 0: 
          f2 = i7;
          f3 = i9 - i8;
        }
        float f1 = 0.0F;
        float f6 = a.i(this.o);
        float f5 = a.i(this.o);
        float f4 = Math.max(f1, 0.0F);
        i7 = localc.h;
        f2 -= f6;
        f1 = f3 - f5;
        i8 = i6;
        i2 = 0;
        while (i8 < i6 + i7)
        {
          View localView = getFlexItemAt(i8);
          if (localView != null)
          {
            if (paramc.i == 1)
            {
              calculateItemDecorationsForChild(localView, b);
              addView(localView);
            }
            for (;;)
            {
              break;
              calculateItemDecorationsForChild(localView, b);
              addView(localView, i2);
              i2 += 1;
            }
            long l1 = this.k.b[i8];
            i9 = d.a(l1);
            int i10 = d.b(l1);
            b localb = (b)localView.getLayoutParams();
            if (a(localView, i9, i10, localb)) {
              localView.measure(i9, i10);
            }
            f2 += localb.leftMargin + getLeftDecorationWidth(localView);
            f1 -= localb.rightMargin + getRightDecorationWidth(localView);
            int i13 = i5 + getTopDecorationHeight(localView);
            int i11;
            if (this.h)
            {
              localObject = this.k;
              i11 = Math.round(f1);
              int i12 = localView.getMeasuredWidth();
              i9 = Math.round(f1);
              i10 = localView.getMeasuredHeight();
              i12 = i11 - i12;
              i11 = i13 + i10;
              i10 = i9;
              i9 = i12;
            }
            for (;;)
            {
              ((d)localObject).a(localView, localc, i9, i13, i10, i11);
              break;
              localObject = this.k;
              i9 = Math.round(f2);
              i10 = Math.round(f2) + localView.getMeasuredWidth();
              i11 = i13 + localView.getMeasuredHeight();
            }
            f5 = localView.getMeasuredWidth() + localb.rightMargin + getRightDecorationWidth(localView);
            f3 = localView.getMeasuredWidth() + localb.leftMargin + getLeftDecorationWidth(localView);
            f2 += f5 + f4;
            f1 -= f3 + f4;
          }
          i8 += 1;
        }
        paramc.c += this.n.i;
        i2 = localc.g;
      }
      else
      {
        i2 = a(localc, paramc);
      }
      i4 += i2;
      if ((!bool) && (this.h)) {
        i2 = paramc.e - localc.g * paramc.i;
      } else {
        i2 = paramc.e + localc.g * paramc.i;
      }
      paramc.e = i2;
      i3 -= localc.g;
    }
    paramc.a -= i4;
    if (paramc.f != Integer.MIN_VALUE)
    {
      paramc.f += i4;
      if (paramc.a < 0) {
        paramc.f += paramc.a;
      }
      a(paramRecycler, paramc);
    }
    return i1 - paramc.a;
  }
  
  private int a(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int i1 = paramState.getItemCount();
    b();
    View localView1 = c(i1);
    View localView2 = d(i1);
    if ((paramState.getItemCount() != 0) && (localView1 != null))
    {
      if (localView2 == null) {
        return 0;
      }
      i1 = this.p.getDecoratedEnd(localView2);
      int i2 = this.p.getDecoratedStart(localView1);
      return Math.min(this.p.getTotalSpace(), i1 - i2);
    }
    return 0;
  }
  
  private int a(c paramc, c paramc1)
  {
    if ((!a) && (this.k.b == null)) {
      throw new AssertionError();
    }
    int i3 = getPaddingTop();
    int i4 = getPaddingBottom();
    int i5 = getHeight();
    int i2 = paramc1.e;
    int i1 = paramc1.e;
    int i7 = i2;
    int i6 = i1;
    if (paramc1.i == -1)
    {
      i7 = i2 - paramc.g;
      i6 = i1 + paramc.g;
    }
    int i10 = paramc1.d;
    switch (this.e)
    {
    default: 
      paramc = new StringBuilder("Invalid justifyContent is set: ");
      paramc.append(this.e);
      throw new IllegalStateException(paramc.toString());
    case 5: 
      if (paramc.h != 0) {
        f3 = (i5 - paramc.e) / (paramc.h + 1);
      } else {
        f3 = 0.0F;
      }
      f1 = i3 + f3;
      f2 = i5 - i4 - f3;
      break;
    case 4: 
      if (paramc.h != 0) {
        f3 = (i5 - paramc.e) / paramc.h;
      } else {
        f3 = 0.0F;
      }
      f1 = i3;
      f2 = f3 / 2.0F;
      f1 += f2;
      f2 = i5 - i4 - f2;
      break;
    case 3: 
      f2 = i3;
      if (paramc.h != 1) {
        f1 = paramc.h - 1;
      } else {
        f1 = 1.0F;
      }
      f3 = (i5 - paramc.e) / f1;
      f4 = i5 - i4;
      f1 = f2;
      f2 = f4;
      break;
    case 2: 
      f1 = i3 + (i5 - paramc.e) / 2.0F;
      f2 = i5 - i4 - (i5 - paramc.e) / 2.0F;
      break;
    case 1: 
      f1 = i5 - paramc.e + i4;
      f2 = paramc.e - i3;
      f3 = 0.0F;
      break;
    case 0: 
      f1 = i3;
      f2 = i5 - i4;
    }
    float f3 = 0.0F;
    float f4 = f1 - a.i(this.o);
    float f1 = f2 - a.i(this.o);
    f3 = Math.max(f3, 0.0F);
    i1 = 0;
    int i8 = paramc.h;
    int i9 = i10;
    float f2 = f4;
    while (i9 < i10 + i8)
    {
      View localView = getFlexItemAt(i9);
      if (localView != null)
      {
        long l1 = this.k.b[i9];
        i2 = d.a(l1);
        i3 = d.b(l1);
        b localb = (b)localView.getLayoutParams();
        if (a(localView, i2, i3, localb)) {
          localView.measure(i2, i3);
        }
        f2 += localb.topMargin + getTopDecorationHeight(localView);
        f1 -= localb.rightMargin + getBottomDecorationHeight(localView);
        if (paramc1.i == 1)
        {
          calculateItemDecorationsForChild(localView, b);
          addView(localView);
        }
        for (;;)
        {
          break;
          calculateItemDecorationsForChild(localView, b);
          addView(localView, i1);
          i1 += 1;
        }
        int i11 = i7 + getLeftDecorationWidth(localView);
        i2 = i6 - getRightDecorationWidth(localView);
        boolean bool;
        Object localObject2;
        if (this.h)
        {
          if (this.i)
          {
            localObject1 = this.k;
            bool = this.h;
            i11 = localView.getMeasuredWidth();
            i4 = Math.round(f1);
            i5 = localView.getMeasuredHeight();
            i3 = Math.round(f1);
            i11 = i2 - i11;
            i4 -= i5;
            i5 = i2;
          }
          for (i2 = i11;; i2 = i11)
          {
            localObject2 = localView;
            ((d)localObject1).a(localView, paramc, bool, i2, i4, i5, i3);
            break;
            localObject1 = localView;
            localObject2 = this.k;
            bool = this.h;
            i11 = i2 - ((View)localObject1).getMeasuredWidth();
            i4 = Math.round(f2);
            i3 = Math.round(f2) + ((View)localObject1).getMeasuredHeight();
            i5 = i2;
            localObject1 = localObject2;
          }
        }
        Object localObject1 = localView;
        if (this.i)
        {
          localObject2 = this.k;
          bool = this.h;
          i4 = Math.round(f1) - ((View)localObject1).getMeasuredHeight();
          i5 = i11 + ((View)localObject1).getMeasuredWidth();
          i3 = Math.round(f1);
        }
        for (localObject1 = localObject2;; localObject1 = localObject2)
        {
          i2 = i11;
          break;
          localObject2 = this.k;
          bool = this.h;
          i4 = Math.round(f2);
          i5 = i11 + ((View)localObject1).getMeasuredWidth();
          i3 = Math.round(f2) + ((View)localObject1).getMeasuredHeight();
        }
        float f5 = ((View)localObject2).getMeasuredHeight() + localb.topMargin + getBottomDecorationHeight((View)localObject2);
        f4 = ((View)localObject2).getMeasuredHeight() + localb.bottomMargin + getTopDecorationHeight((View)localObject2);
        f2 += f5 + f3;
        f1 -= f4 + f3;
      }
      i9 += 1;
    }
    paramc1.c += this.n.i;
    return paramc.g;
  }
  
  private View a(int paramInt1, int paramInt2, int paramInt3)
  {
    b();
    c();
    int i2 = this.p.getStartAfterPadding();
    int i3 = this.p.getEndAfterPadding();
    int i1;
    if (paramInt2 > paramInt1) {
      i1 = 1;
    } else {
      i1 = -1;
    }
    Object localObject2 = null;
    Object localObject4;
    for (Object localObject1 = null; paramInt1 != paramInt2; localObject1 = localObject4)
    {
      View localView = getChildAt(paramInt1);
      int i4 = getPosition(localView);
      Object localObject3 = localObject2;
      localObject4 = localObject1;
      if (i4 >= 0)
      {
        localObject3 = localObject2;
        localObject4 = localObject1;
        if (i4 < paramInt3) {
          if (((RecyclerView.LayoutParams)localView.getLayoutParams()).isItemRemoved())
          {
            localObject3 = localObject2;
            localObject4 = localObject1;
            if (localObject1 == null)
            {
              localObject4 = localView;
              localObject3 = localObject2;
            }
          }
          else
          {
            if ((this.p.getDecoratedStart(localView) >= i2) && (this.p.getDecoratedEnd(localView) <= i3)) {
              return localView;
            }
            localObject3 = localObject2;
            localObject4 = localObject1;
            if (localObject2 == null)
            {
              localObject3 = localView;
              localObject4 = localObject1;
            }
          }
        }
      }
      paramInt1 += i1;
      localObject2 = localObject3;
    }
    if (localObject2 != null) {
      return (View)localObject2;
    }
    return (View)localObject1;
  }
  
  private View a(View paramView, c paramc)
  {
    boolean bool = isMainAxisDirectionHorizontal();
    int i2 = paramc.h;
    int i1 = 1;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      paramc = paramView;
      if (localView != null)
      {
        paramc = paramView;
        if (localView.getVisibility() != 8)
        {
          if ((this.h) && (!bool))
          {
            paramc = paramView;
            if (this.p.getDecoratedEnd(paramView) >= this.p.getDecoratedEnd(localView)) {
              break label108;
            }
          }
          else
          {
            paramc = paramView;
            if (this.p.getDecoratedStart(paramView) <= this.p.getDecoratedStart(localView)) {
              break label108;
            }
          }
          paramc = localView;
        }
      }
      label108:
      i1 += 1;
      paramView = paramc;
    }
    return paramView;
  }
  
  private void a()
  {
    int i1;
    if (isMainAxisDirectionHorizontal()) {
      i1 = getHeightMode();
    } else {
      i1 = getWidthMode();
    }
    c localc = this.n;
    boolean bool;
    if ((i1 != 0) && (i1 != Integer.MIN_VALUE)) {
      bool = false;
    } else {
      bool = true;
    }
    localc.b = bool;
  }
  
  private void a(int paramInt)
  {
    if (this.c != paramInt)
    {
      removeAllViews();
      this.c = paramInt;
      this.p = null;
      this.q = null;
      d();
      requestLayout();
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if ((!a) && (this.k.a == null)) {
      throw new AssertionError();
    }
    this.n.i = paramInt1;
    boolean bool = isMainAxisDirectionHorizontal();
    int i4 = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
    int i5 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
    int i2 = 0;
    int i3 = 0;
    int i1;
    if ((!bool) && (this.h)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    Object localObject2;
    if (paramInt1 == 1)
    {
      localObject1 = getChildAt(getChildCount() - 1);
      this.n.e = this.p.getDecoratedEnd((View)localObject1);
      paramInt1 = getPosition((View)localObject1);
      i2 = this.k.a[paramInt1];
      localObject1 = b((View)localObject1, (c)this.j.get(i2));
      this.n.h = 1;
      localObject2 = this.n;
      ((c)localObject2).d = (paramInt1 + ((c)localObject2).h);
      if (this.k.a.length <= this.n.d) {
        this.n.c = -1;
      } else {
        this.n.c = this.k.a[this.n.d];
      }
      if (i1 != 0)
      {
        this.n.e = this.p.getDecoratedStart((View)localObject1);
        this.n.f = (-this.p.getDecoratedStart((View)localObject1) + this.p.getStartAfterPadding());
        localObject1 = this.n;
        paramInt1 = i3;
        if (this.n.f >= 0) {
          paramInt1 = this.n.f;
        }
        ((c)localObject1).f = paramInt1;
      }
      else
      {
        this.n.e = this.p.getDecoratedEnd((View)localObject1);
        this.n.f = (this.p.getDecoratedEnd((View)localObject1) - this.p.getEndAfterPadding());
      }
      if (((this.n.c == -1) || (this.n.c > this.j.size() - 1)) && (this.n.d <= getFlexItemCount()))
      {
        paramInt1 = paramInt2 - this.n.f;
        this.B.a();
        if (paramInt1 > 0)
        {
          if (bool) {
            this.k.a(this.B, i4, i5, paramInt1, this.n.d, this.j);
          } else {
            this.k.c(this.B, i4, i5, paramInt1, this.n.d, this.j);
          }
          this.k.a(i4, i5, this.n.d);
          this.k.a(this.n.d);
        }
      }
    }
    else
    {
      localObject1 = getChildAt(0);
      this.n.e = this.p.getDecoratedStart((View)localObject1);
      i4 = getPosition((View)localObject1);
      paramInt1 = this.k.a[i4];
      localObject1 = a((View)localObject1, (c)this.j.get(paramInt1));
      this.n.h = 1;
      i3 = this.k.a[i4];
      paramInt1 = i3;
      if (i3 == -1) {
        paramInt1 = 0;
      }
      if (paramInt1 > 0)
      {
        localObject2 = (c)this.j.get(paramInt1 - 1);
        this.n.d = (i4 - ((c)localObject2).h);
      }
      else
      {
        this.n.d = -1;
      }
      localObject2 = this.n;
      if (paramInt1 > 0) {
        paramInt1 -= 1;
      } else {
        paramInt1 = 0;
      }
      ((c)localObject2).c = paramInt1;
      if (i1 != 0)
      {
        this.n.e = this.p.getDecoratedEnd((View)localObject1);
        this.n.f = (this.p.getDecoratedEnd((View)localObject1) - this.p.getEndAfterPadding());
        localObject1 = this.n;
        paramInt1 = i2;
        if (this.n.f >= 0) {
          paramInt1 = this.n.f;
        }
        ((c)localObject1).f = paramInt1;
      }
      else
      {
        this.n.e = this.p.getDecoratedStart((View)localObject1);
        this.n.f = (-this.p.getDecoratedStart((View)localObject1) + this.p.getStartAfterPadding());
      }
    }
    Object localObject1 = this.n;
    ((c)localObject1).a = (paramInt2 - ((c)localObject1).f);
  }
  
  private void a(RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2)
  {
    while (paramInt2 >= paramInt1)
    {
      removeAndRecycleViewAt(paramInt2, paramRecycler);
      paramInt2 -= 1;
    }
  }
  
  private void a(RecyclerView.Recycler paramRecycler, c paramc)
  {
    if (!paramc.j) {
      return;
    }
    if (paramc.i == -1)
    {
      c(paramRecycler, paramc);
      return;
    }
    b(paramRecycler, paramc);
  }
  
  private void a(a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      a();
    } else {
      this.n.b = false;
    }
    c localc;
    int i1;
    int i2;
    if ((!isMainAxisDirectionHorizontal()) && (this.h))
    {
      localc = this.n;
      i1 = a.j(parama);
      i2 = getPaddingRight();
    }
    else
    {
      localc = this.n;
      i1 = this.p.getEndAfterPadding();
      i2 = a.j(parama);
    }
    localc.a = (i1 - i2);
    this.n.d = a.e(parama);
    this.n.h = 1;
    this.n.i = 1;
    this.n.e = a.j(parama);
    this.n.f = Integer.MIN_VALUE;
    this.n.c = a.f(parama);
    if ((paramBoolean1) && (this.j.size() > 1) && (a.f(parama) >= 0) && (a.f(parama) < this.j.size() - 1))
    {
      parama = (c)this.j.get(a.f(parama));
      c.a(this.n);
      localc = this.n;
      localc.d += parama.h;
    }
  }
  
  private boolean a(View paramView)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i9 = getWidth();
    int i10 = getPaddingRight();
    int i3 = getHeight();
    int i4 = getPaddingBottom();
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i11 = getDecoratedLeft(paramView);
    int i12 = localLayoutParams.leftMargin;
    localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i5 = getDecoratedTop(paramView);
    int i6 = localLayoutParams.topMargin;
    localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i13 = getDecoratedRight(paramView);
    int i14 = localLayoutParams.rightMargin;
    localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i7 = getDecoratedBottom(paramView);
    int i8 = localLayoutParams.bottomMargin;
    if ((i11 - i12 < i9 - i10) && (i13 + i14 < i1)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if ((i5 - i6 < i3 - i4) && (i7 + i8 < i2)) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    return (i1 != 0) && (i2 != 0);
  }
  
  private boolean a(View paramView, int paramInt)
  {
    if ((!isMainAxisDirectionHorizontal()) && (this.h)) {
      return this.p.getEnd() - this.p.getDecoratedStart(paramView) <= paramInt;
    }
    return this.p.getDecoratedEnd(paramView) <= paramInt;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    return (paramView.isLayoutRequested()) || (!isMeasurementCacheEnabled()) || (!b(paramView.getWidth(), paramInt1, paramLayoutParams.width)) || (!b(paramView.getHeight(), paramInt2, paramLayoutParams.height));
  }
  
  private int b(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i1;
    if ((!isMainAxisDirectionHorizontal()) && (this.h)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      i1 = paramInt - this.p.getStartAfterPadding();
      if (i1 > 0) {
        i1 = a(i1, paramRecycler, paramState);
      } else {
        return 0;
      }
    }
    else
    {
      i1 = this.p.getEndAfterPadding() - paramInt;
      if (i1 <= 0) {
        break label125;
      }
      i1 = -a(-i1, paramRecycler, paramState);
    }
    if (paramBoolean)
    {
      paramInt = this.p.getEndAfterPadding() - (paramInt + i1);
      if (paramInt > 0)
      {
        this.p.offsetChildren(paramInt);
        return paramInt + i1;
      }
    }
    return i1;
    label125:
    return 0;
  }
  
  private int b(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int i1 = paramState.getItemCount();
    View localView1 = c(i1);
    View localView2 = d(i1);
    if ((paramState.getItemCount() != 0) && (localView1 != null))
    {
      if (localView2 == null) {
        return 0;
      }
      if ((!a) && (this.k.a == null)) {
        throw new AssertionError();
      }
      int i3 = getPosition(localView1);
      int i2 = getPosition(localView2);
      i1 = Math.abs(this.p.getDecoratedEnd(localView2) - this.p.getDecoratedStart(localView1));
      i3 = this.k.a[i3];
      if (i3 != 0)
      {
        if (i3 == -1) {
          return 0;
        }
        i2 = this.k.a[i2];
        float f1 = i1 / (i2 - i3 + 1);
        return Math.round(i3 * f1 + (this.p.getStartAfterPadding() - this.p.getDecoratedStart(localView1)));
      }
    }
    return 0;
  }
  
  private View b(int paramInt1, int paramInt2)
  {
    int i1;
    if (paramInt2 > paramInt1) {
      i1 = 1;
    } else {
      i1 = -1;
    }
    while (paramInt1 != paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (a(localView)) {
        return localView;
      }
      paramInt1 += i1;
    }
    return null;
  }
  
  private View b(View paramView, c paramc)
  {
    boolean bool = isMainAxisDirectionHorizontal();
    int i1 = getChildCount() - 2;
    int i2 = getChildCount();
    int i3 = paramc.h;
    while (i1 > i2 - i3 - 1)
    {
      View localView = getChildAt(i1);
      paramc = paramView;
      if (localView != null)
      {
        paramc = paramView;
        if (localView.getVisibility() != 8)
        {
          if ((this.h) && (!bool))
          {
            paramc = paramView;
            if (this.p.getDecoratedStart(paramView) <= this.p.getDecoratedStart(localView)) {
              break label124;
            }
          }
          else
          {
            paramc = paramView;
            if (this.p.getDecoratedEnd(paramView) >= this.p.getDecoratedEnd(localView)) {
              break label124;
            }
          }
          paramc = localView;
        }
      }
      label124:
      i1 -= 1;
      paramView = paramc;
    }
    return paramView;
  }
  
  private void b()
  {
    if (this.p != null) {
      return;
    }
    if (isMainAxisDirectionHorizontal())
    {
      if (this.d == 0) {
        break label51;
      }
      this.p = OrientationHelper.createVerticalHelper(this);
    }
    for (OrientationHelper localOrientationHelper = OrientationHelper.createHorizontalHelper(this);; localOrientationHelper = OrientationHelper.createVerticalHelper(this))
    {
      this.q = localOrientationHelper;
      return;
      if (this.d == 0) {
        break;
      }
      label51:
      this.p = OrientationHelper.createHorizontalHelper(this);
    }
  }
  
  private void b(int paramInt)
  {
    int i1 = e();
    int i2 = f();
    if (paramInt >= i2) {
      return;
    }
    int i3 = getChildCount();
    this.k.c(i3);
    this.k.b(i3);
    this.k.d(i3);
    if ((!a) && (this.k.a == null)) {
      throw new AssertionError();
    }
    if (paramInt >= this.k.a.length) {
      return;
    }
    this.A = paramInt;
    View localView = getChildAt(0);
    if (localView == null) {
      return;
    }
    if ((i1 <= paramInt) && (paramInt <= i2)) {
      return;
    }
    this.s = getPosition(localView);
    if ((!isMainAxisDirectionHorizontal()) && (this.h)) {}
    for (paramInt = this.p.getDecoratedEnd(localView) + this.p.getEndPadding();; paramInt = this.p.getDecoratedStart(localView) - this.p.getStartAfterPadding())
    {
      this.t = paramInt;
      return;
    }
  }
  
  private void b(RecyclerView.Recycler paramRecycler, c paramc)
  {
    if (paramc.f < 0) {
      return;
    }
    if ((!a) && (this.k.a == null)) {
      throw new AssertionError();
    }
    int i5 = getChildCount();
    if (i5 == 0) {
      return;
    }
    Object localObject1 = getChildAt(0);
    int i3 = this.k.a[getPosition(localObject1)];
    if (i3 == -1) {
      return;
    }
    localObject1 = (c)this.j.get(i3);
    int i1 = 0;
    int i2 = -1;
    while (i1 < i5)
    {
      View localView = getChildAt(i1);
      if (!a(localView, paramc.f)) {
        break;
      }
      int i4 = i3;
      Object localObject2 = localObject1;
      if (((c)localObject1).p == getPosition(localView))
      {
        i2 = i1;
        if (i3 >= this.j.size() - 1) {
          break;
        }
        i4 = i3 + paramc.i;
        localObject2 = (c)this.j.get(i4);
        i2 = i1;
      }
      i1 += 1;
      i3 = i4;
      localObject1 = localObject2;
    }
    a(paramRecycler, 0, i2);
  }
  
  private void b(a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      a();
    } else {
      this.n.b = false;
    }
    c localc;
    int i1;
    if ((!isMainAxisDirectionHorizontal()) && (this.h))
    {
      localc = this.n;
      i1 = this.z.getWidth() - a.j(parama);
    }
    else
    {
      localc = this.n;
      i1 = a.j(parama);
    }
    localc.a = (i1 - this.p.getStartAfterPadding());
    this.n.d = a.e(parama);
    this.n.h = 1;
    this.n.i = -1;
    this.n.e = a.j(parama);
    this.n.f = Integer.MIN_VALUE;
    this.n.c = a.f(parama);
    if ((paramBoolean1) && (a.f(parama) > 0) && (this.j.size() > a.f(parama)))
    {
      parama = (c)this.j.get(a.f(parama));
      c.b(this.n);
      localc = this.n;
      localc.d -= parama.h;
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
      return false;
    }
    if (i1 != Integer.MIN_VALUE)
    {
      if (i1 != 0)
      {
        if (i1 != 1073741824) {
          return false;
        }
        return paramInt2 == paramInt1;
      }
      return true;
    }
    return paramInt2 >= paramInt1;
  }
  
  private boolean b(View paramView, int paramInt)
  {
    if ((!isMainAxisDirectionHorizontal()) && (this.h)) {
      return this.p.getDecoratedEnd(paramView) <= paramInt;
    }
    return this.p.getDecoratedStart(paramView) >= this.p.getEnd() - paramInt;
  }
  
  private int c(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int i1 = paramState.getItemCount();
    View localView1 = c(i1);
    View localView2 = d(i1);
    if ((paramState.getItemCount() != 0) && (localView1 != null))
    {
      if (localView2 == null) {
        return 0;
      }
      if ((!a) && (this.k.a == null)) {
        throw new AssertionError();
      }
      i1 = e();
      int i2 = f();
      return (int)(Math.abs(this.p.getDecoratedEnd(localView2) - this.p.getDecoratedStart(localView1)) / (i2 - i1 + 1) * paramState.getItemCount());
    }
    return 0;
  }
  
  private View c(int paramInt)
  {
    if ((!a) && (this.k.a == null)) {
      throw new AssertionError();
    }
    View localView = a(0, getChildCount(), paramInt);
    if (localView == null) {
      return null;
    }
    paramInt = getPosition(localView);
    paramInt = this.k.a[paramInt];
    if (paramInt == -1) {
      return null;
    }
    return a(localView, (c)this.j.get(paramInt));
  }
  
  private void c()
  {
    if (this.n == null) {
      this.n = new c((byte)0);
    }
  }
  
  private void c(RecyclerView.Recycler paramRecycler, c paramc)
  {
    if (paramc.f < 0) {
      return;
    }
    if ((!a) && (this.k.a == null)) {
      throw new AssertionError();
    }
    this.p.getEnd();
    int i2 = getChildCount();
    if (i2 == 0) {
      return;
    }
    int i5 = i2 - 1;
    Object localObject1 = getChildAt(i5);
    int i3 = this.k.a[getPosition(localObject1)];
    if (i3 == -1) {
      return;
    }
    localObject1 = (c)this.j.get(i3);
    int i1 = i5;
    while (i1 >= 0)
    {
      View localView = getChildAt(i1);
      if (!b(localView, paramc.f)) {
        break;
      }
      int i4 = i3;
      Object localObject2 = localObject1;
      if (((c)localObject1).o == getPosition(localView))
      {
        i2 = i1;
        if (i3 <= 0) {
          break;
        }
        i4 = i3 + paramc.i;
        localObject2 = (c)this.j.get(i4);
        i2 = i1;
      }
      i1 -= 1;
      i3 = i4;
      localObject1 = localObject2;
    }
    a(paramRecycler, i2, i5);
  }
  
  private View d(int paramInt)
  {
    if ((!a) && (this.k.a == null)) {
      throw new AssertionError();
    }
    View localView = a(getChildCount() - 1, -1, paramInt);
    if (localView == null) {
      return null;
    }
    paramInt = getPosition(localView);
    paramInt = this.k.a[paramInt];
    return b(localView, (c)this.j.get(paramInt));
  }
  
  private void d()
  {
    this.j.clear();
    a.b(this.o);
    a.d(this.o, 0);
  }
  
  private int e()
  {
    View localView = b(0, getChildCount());
    if (localView == null) {
      return -1;
    }
    return getPosition(localView);
  }
  
  private int e(int paramInt)
  {
    int i1 = getChildCount();
    int i3 = 0;
    if (i1 != 0)
    {
      if (paramInt == 0) {
        return 0;
      }
      b();
      boolean bool = isMainAxisDirectionHorizontal();
      if (bool) {
        i1 = this.z.getWidth();
      } else {
        i1 = this.z.getHeight();
      }
      int i2;
      if (bool) {
        i2 = getWidth();
      } else {
        i2 = getHeight();
      }
      if (getLayoutDirection() == 1) {
        i3 = 1;
      }
      if (i3 != 0)
      {
        i3 = Math.abs(paramInt);
        if (paramInt < 0)
        {
          paramInt = Math.min(i2 + a.i(this.o) - i1, i3);
          return -paramInt;
        }
        if (a.i(this.o) + paramInt <= 0) {}
      }
      else
      {
        do
        {
          paramInt = a.i(this.o);
          break;
          if (paramInt > 0) {
            return Math.min(i2 - a.i(this.o) - i1, paramInt);
          }
        } while (a.i(this.o) + paramInt < 0);
      }
      return paramInt;
    }
    return 0;
  }
  
  private int f()
  {
    View localView = b(getChildCount() - 1, -1);
    if (localView == null) {
      return -1;
    }
    return getPosition(localView);
  }
  
  public boolean canScrollHorizontally()
  {
    return (!isMainAxisDirectionHorizontal()) || (getWidth() > this.z.getWidth());
  }
  
  public boolean canScrollVertically()
  {
    return (isMainAxisDirectionHorizontal()) || (getHeight() > this.z.getHeight());
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof b;
  }
  
  public int computeHorizontalScrollExtent(RecyclerView.State paramState)
  {
    return a(paramState);
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    b(paramState);
    return b(paramState);
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    return c(paramState);
  }
  
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    if (getChildCount() == 0) {
      return null;
    }
    if (paramInt < getPosition(getChildAt(0))) {
      paramInt = -1;
    } else {
      paramInt = 1;
    }
    if (isMainAxisDirectionHorizontal()) {
      return new PointF(0.0F, paramInt);
    }
    return new PointF(paramInt, 0.0F);
  }
  
  public int computeVerticalScrollExtent(RecyclerView.State paramState)
  {
    return a(paramState);
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    return b(paramState);
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    return c(paramState);
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    return new b();
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new b(paramContext, paramAttributeSet);
  }
  
  public int getAlignContent()
  {
    return 5;
  }
  
  public int getAlignItems()
  {
    return this.f;
  }
  
  public int getChildHeightMeasureSpec(int paramInt1, int paramInt2, int paramInt3)
  {
    return getChildMeasureSpec(getHeight(), getHeightMode(), paramInt2, paramInt3, canScrollVertically());
  }
  
  public int getChildWidthMeasureSpec(int paramInt1, int paramInt2, int paramInt3)
  {
    return getChildMeasureSpec(getWidth(), getWidthMode(), paramInt2, paramInt3, canScrollHorizontally());
  }
  
  public int getDecorationLengthCrossAxis(View paramView)
  {
    int i1;
    if (isMainAxisDirectionHorizontal()) {
      i1 = getTopDecorationHeight(paramView);
    }
    for (int i2 = getBottomDecorationHeight(paramView);; i2 = getRightDecorationWidth(paramView))
    {
      return i1 + i2;
      i1 = getLeftDecorationWidth(paramView);
    }
  }
  
  public int getDecorationLengthMainAxis(View paramView, int paramInt1, int paramInt2)
  {
    if (isMainAxisDirectionHorizontal()) {
      paramInt2 = getLeftDecorationWidth(paramView);
    }
    for (paramInt1 = getRightDecorationWidth(paramView);; paramInt1 = getBottomDecorationHeight(paramView))
    {
      return paramInt2 + paramInt1;
      paramInt2 = getTopDecorationHeight(paramView);
    }
  }
  
  public int getFlexDirection()
  {
    return this.c;
  }
  
  public View getFlexItemAt(int paramInt)
  {
    View localView = (View)this.x.get(paramInt);
    if (localView != null) {
      return localView;
    }
    return this.l.getViewForPosition(paramInt);
  }
  
  public int getFlexItemCount()
  {
    return this.m.getItemCount();
  }
  
  public List<c> getFlexLinesInternal()
  {
    return this.j;
  }
  
  public int getFlexWrap()
  {
    return this.d;
  }
  
  public int getLargestMainSize()
  {
    int i2 = this.j.size();
    int i1 = 0;
    if (i2 == 0) {
      return 0;
    }
    i2 = Integer.MIN_VALUE;
    int i3 = this.j.size();
    while (i1 < i3)
    {
      i2 = Math.max(i2, ((c)this.j.get(i1)).e);
      i1 += 1;
    }
    return i2;
  }
  
  public int getMaxLine()
  {
    return this.g;
  }
  
  public View getReorderedFlexItemAt(int paramInt)
  {
    return getFlexItemAt(paramInt);
  }
  
  public int getSumOfCrossSize()
  {
    int i3 = this.j.size();
    int i1 = 0;
    int i2 = 0;
    while (i1 < i3)
    {
      i2 += ((c)this.j.get(i1)).g;
      i1 += 1;
    }
    return i2;
  }
  
  public boolean isMainAxisDirectionHorizontal()
  {
    if (this.c != 0) {
      return this.c == 1;
    }
    return true;
  }
  
  public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2)
  {
    removeAllViews();
  }
  
  public void onAttachedToWindow(RecyclerView paramRecyclerView)
  {
    super.onAttachedToWindow(paramRecyclerView);
    this.z = ((View)paramRecyclerView.getParent());
  }
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    if (this.w)
    {
      removeAndRecycleAllViews(paramRecycler);
      paramRecycler.clear();
    }
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.onItemsAdded(paramRecyclerView, paramInt1, paramInt2);
    b(paramInt1);
  }
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onItemsMoved(paramRecyclerView, paramInt1, paramInt2, paramInt3);
    b(Math.min(paramInt1, paramInt2));
  }
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.onItemsRemoved(paramRecyclerView, paramInt1, paramInt2);
    b(paramInt1);
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.onItemsUpdated(paramRecyclerView, paramInt1, paramInt2);
    b(paramInt1);
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    super.onItemsUpdated(paramRecyclerView, paramInt1, paramInt2, paramObject);
    b(paramInt1);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    this.l = paramRecycler;
    this.m = paramState;
    int i6 = paramState.getItemCount();
    if ((i6 == 0) && (paramState.isPreLayout())) {
      return;
    }
    int i1 = getLayoutDirection();
    switch (this.c)
    {
    default: 
      this.h = false;
    case 3: 
    case 2: 
      for (;;)
      {
        this.i = false;
        break;
        if (i1 == 1) {
          bool = true;
        } else {
          bool = false;
        }
        this.h = bool;
        if (this.d == 2) {
          this.h ^= true;
        }
        this.i = true;
        break;
        if (i1 == 1) {
          bool = true;
        } else {
          bool = false;
        }
        this.h = bool;
        if (this.d == 2) {
          this.h ^= true;
        }
      }
    case 1: 
      if (i1 != 1) {
        bool = true;
      } else {
        bool = false;
      }
      this.h = bool;
      if (this.d != 2) {
        break label233;
      }
      break;
    case 0: 
      if (i1 == 1) {
        bool = true;
      } else {
        bool = false;
      }
      this.h = bool;
      if (this.d != 2) {
        break label233;
      }
    }
    boolean bool = true;
    break label236;
    label233:
    bool = false;
    label236:
    this.i = bool;
    b();
    c();
    this.k.c(i6);
    this.k.b(i6);
    this.k.d(i6);
    this.n.j = false;
    if ((this.r != null) && (d.c(this.r, i6))) {
      this.s = d.b(this.r);
    }
    Object localObject2;
    Object localObject1;
    if ((!a.a(this.o)) || (this.s != -1) || (this.r != null))
    {
      a.b(this.o);
      localObject2 = this.o;
      localObject1 = this.r;
      if ((!a) && (this.k.a == null)) {
        throw new AssertionError();
      }
      if ((!paramState.isPreLayout()) && (this.s != -1))
      {
        if ((this.s >= 0) && (this.s < paramState.getItemCount()))
        {
          a.b((a)localObject2, this.s);
          a.a((a)localObject2, this.k.a[a.e(localObject2)]);
          if ((this.r != null) && (d.c(this.r, paramState.getItemCount())))
          {
            a.c((a)localObject2, this.p.getStartAfterPadding() + d.c((d)localObject1));
            a.h((a)localObject2);
            a.a((a)localObject2, -1);
          }
          else
          {
            if (this.t == Integer.MIN_VALUE)
            {
              localObject1 = findViewByPosition(this.s);
              if (localObject1 != null) {
                if (this.p.getDecoratedMeasurement((View)localObject1) <= this.p.getTotalSpace()) {}
              }
              for (;;)
              {
                a.g((a)localObject2);
                break label784;
                if (this.p.getDecoratedStart((View)localObject1) - this.p.getStartAfterPadding() < 0)
                {
                  a.c((a)localObject2, this.p.getStartAfterPadding());
                  a.a((a)localObject2, false);
                  break label784;
                }
                if (this.p.getEndAfterPadding() - this.p.getDecoratedEnd((View)localObject1) < 0)
                {
                  a.c((a)localObject2, this.p.getEndAfterPadding());
                  a.a((a)localObject2, true);
                  break label784;
                }
                if (a.d((a)localObject2))
                {
                  i1 = this.p.getDecoratedEnd((View)localObject1) + this.p.getTotalSpaceChange();
                  break;
                }
                i1 = this.p.getDecoratedStart((View)localObject1);
                break;
                if (getChildCount() > 0)
                {
                  i1 = getPosition(getChildAt(0));
                  if (this.s < i1) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  a.a((a)localObject2, bool);
                }
              }
            }
            if ((!isMainAxisDirectionHorizontal()) && (this.h)) {
              i1 = this.t - this.p.getEndPadding();
            } else {
              i1 = this.p.getStartAfterPadding() + this.t;
            }
            a.c((a)localObject2, i1);
          }
          label784:
          i1 = 1;
        }
        else
        {
          this.s = -1;
          this.t = Integer.MIN_VALUE;
        }
      }
      else {
        i1 = 0;
      }
      if (i1 == 0)
      {
        if (getChildCount() != 0)
        {
          if (a.d((a)localObject2)) {
            localObject1 = d(paramState.getItemCount());
          } else {
            localObject1 = c(paramState.getItemCount());
          }
          if (localObject1 != null)
          {
            a.a((a)localObject2, (View)localObject1);
            if ((!paramState.isPreLayout()) && (supportsPredictiveItemAnimations()))
            {
              if ((this.p.getDecoratedStart((View)localObject1) < this.p.getEndAfterPadding()) && (this.p.getDecoratedEnd((View)localObject1) >= this.p.getStartAfterPadding())) {
                i1 = 0;
              } else {
                i1 = 1;
              }
              if (i1 != 0)
              {
                if (a.d((a)localObject2)) {
                  i1 = this.p.getEndAfterPadding();
                } else {
                  i1 = this.p.getStartAfterPadding();
                }
                a.c((a)localObject2, i1);
              }
            }
            i1 = 1;
            break label963;
          }
        }
        i1 = 0;
        label963:
        if (i1 == 0)
        {
          a.g((a)localObject2);
          a.b((a)localObject2, 0);
          a.a((a)localObject2, 0);
        }
      }
      a.c(this.o);
    }
    detachAndScrapAttachedViews(paramRecycler);
    if (a.d(this.o)) {
      b(this.o, false, true);
    } else {
      a(this.o, false, true);
    }
    int i3 = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
    int i4 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
    int i7 = getWidth();
    int i8 = getHeight();
    int i2;
    int i5;
    if (isMainAxisDirectionHorizontal())
    {
      if ((this.u != Integer.MIN_VALUE) && (this.u != i7)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      i2 = i1;
      if (this.n.b)
      {
        i5 = this.y.getResources().getDisplayMetrics().heightPixels;
        i2 = i1;
        i1 = i5;
      }
    }
    for (i1 = this.n.a;; i1 = i5)
    {
      break label1212;
      if ((this.v != Integer.MIN_VALUE) && (this.v != i8)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      i2 = i1;
      if (!this.n.b) {
        break;
      }
      i5 = this.y.getResources().getDisplayMetrics().widthPixels;
      i2 = i1;
    }
    label1212:
    this.u = i7;
    this.v = i8;
    if ((this.A == -1) && ((this.s != -1) || (i2 != 0)))
    {
      if (!a.d(this.o))
      {
        this.j.clear();
        if ((!a) && (this.k.a == null)) {
          throw new AssertionError();
        }
        this.B.a();
        if (isMainAxisDirectionHorizontal()) {
          this.k.b(this.B, i3, i4, i1, a.e(this.o), this.j);
        } else {
          this.k.d(this.B, i3, i4, i1, a.e(this.o), this.j);
        }
        this.j = this.B.a;
        this.k.a(i3, i4);
        this.k.a();
        a.a(this.o, this.k.a[a.e(this.o)]);
        this.n.c = a.f(this.o);
      }
    }
    else
    {
      if (this.A != -1) {
        i2 = Math.min(this.A, a.e(this.o));
      } else {
        i2 = a.e(this.o);
      }
      this.B.a();
      d.a locala;
      if (isMainAxisDirectionHorizontal()) {
        if (this.j.size() > 0)
        {
          this.k.a(this.j, i2);
          localObject2 = this.k;
          locala = this.B;
          i7 = a.e(this.o);
          localObject1 = this.j;
          i5 = i3;
        }
      }
      for (i6 = i4;; i6 = i3)
      {
        ((d)localObject2).a(locala, i5, i6, i1, i2, i7, (List)localObject1);
        break label1688;
        this.k.d(i6);
        this.k.a(this.B, i3, i4, i1, 0, this.j);
        break label1688;
        if (this.j.size() <= 0) {
          break;
        }
        this.k.a(this.j, i2);
        localObject2 = this.k;
        locala = this.B;
        i7 = a.e(this.o);
        localObject1 = this.j;
        i5 = i4;
      }
      this.k.d(i6);
      this.k.c(this.B, i3, i4, i1, 0, this.j);
      label1688:
      this.j = this.B.a;
      this.k.a(i3, i4, i2);
      this.k.a(i2);
    }
    if (a.d(this.o))
    {
      a(paramRecycler, paramState, this.n);
      i1 = this.n.e;
      a(this.o, true, false);
      a(paramRecycler, paramState, this.n);
      i2 = this.n.e;
    }
    else
    {
      a(paramRecycler, paramState, this.n);
      i2 = this.n.e;
      b(this.o, true, false);
      a(paramRecycler, paramState, this.n);
      i1 = this.n.e;
    }
    if (getChildCount() > 0)
    {
      if (a.d(this.o))
      {
        a(i1 + b(i2, paramRecycler, paramState, true), paramRecycler, paramState, false);
        return;
      }
      b(i2 + a(i1, paramRecycler, paramState, true), paramRecycler, paramState, false);
    }
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    this.r = null;
    this.s = -1;
    this.t = Integer.MIN_VALUE;
    this.A = -1;
    a.b(this.o);
    this.x.clear();
  }
  
  public void onNewFlexItemAdded(View paramView, int paramInt1, int paramInt2, c paramc)
  {
    calculateItemDecorationsForChild(paramView, b);
    if (isMainAxisDirectionHorizontal()) {
      paramInt2 = getLeftDecorationWidth(paramView);
    }
    for (paramInt1 = getRightDecorationWidth(paramView);; paramInt1 = getBottomDecorationHeight(paramView))
    {
      paramInt1 = paramInt2 + paramInt1;
      paramc.e += paramInt1;
      paramc.f += paramInt1;
      return;
      paramInt2 = getTopDecorationHeight(paramView);
    }
  }
  
  public void onNewFlexLineAdded(c paramc) {}
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof d))
    {
      this.r = ((d)paramParcelable);
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    if (this.r != null) {
      return new d(this.r, (byte)0);
    }
    d locald = new d();
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      d.a(locald, getPosition(localView));
      d.b(locald, this.p.getDecoratedStart(localView) - this.p.getStartAfterPadding());
      return locald;
    }
    d.a(locald);
    return locald;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (!isMainAxisDirectionHorizontal())
    {
      paramInt = a(paramInt, paramRecycler, paramState);
      this.x.clear();
      return paramInt;
    }
    paramInt = e(paramInt);
    paramRecycler = this.o;
    a.d(paramRecycler, a.i(paramRecycler) + paramInt);
    this.q.offsetChildren(-paramInt);
    return paramInt;
  }
  
  public void scrollToPosition(int paramInt)
  {
    this.s = paramInt;
    this.t = Integer.MIN_VALUE;
    if (this.r != null) {
      d.a(this.r);
    }
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (isMainAxisDirectionHorizontal())
    {
      paramInt = a(paramInt, paramRecycler, paramState);
      this.x.clear();
      return paramInt;
    }
    paramInt = e(paramInt);
    paramRecycler = this.o;
    a.d(paramRecycler, a.i(paramRecycler) + paramInt);
    this.q.offsetChildren(-paramInt);
    return paramInt;
  }
  
  public void setFlexLines(List<c> paramList)
  {
    this.j = paramList;
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    paramRecyclerView = new LinearSmoothScroller(paramRecyclerView.getContext());
    paramRecyclerView.setTargetPosition(paramInt);
    startSmoothScroll(paramRecyclerView);
  }
  
  public void updateViewCache(int paramInt, View paramView)
  {
    this.x.put(paramInt, paramView);
  }
  
  final class a
  {
    private int c;
    private int d;
    private int e;
    private int f = 0;
    private boolean g;
    private boolean h;
    private boolean i;
    
    private a() {}
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("AnchorInfo{mPosition=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", mFlexLinePosition=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", mCoordinate=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", mPerpendicularCoordinate=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", mLayoutFromEnd=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(", mValid=");
      localStringBuilder.append(this.h);
      localStringBuilder.append(", mAssignedFromSavedState=");
      localStringBuilder.append(this.i);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends RecyclerView.LayoutParams
    implements b
  {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator() {};
    private float a = 0.0F;
    private float b = 1.0F;
    private int c = -1;
    private float d = -1.0F;
    private int e;
    private int f;
    private int g = 16777215;
    private int h = 16777215;
    private boolean i;
    
    public b()
    {
      super(-2);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    protected b(Parcel paramParcel)
    {
      super(-2);
      this.a = paramParcel.readFloat();
      this.b = paramParcel.readFloat();
      this.c = paramParcel.readInt();
      this.d = paramParcel.readFloat();
      this.e = paramParcel.readInt();
      this.f = paramParcel.readInt();
      this.g = paramParcel.readInt();
      this.h = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.i = bool;
      this.bottomMargin = paramParcel.readInt();
      this.leftMargin = paramParcel.readInt();
      this.rightMargin = paramParcel.readInt();
      this.topMargin = paramParcel.readInt();
      this.height = paramParcel.readInt();
      this.width = paramParcel.readInt();
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
      return 1;
    }
    
    public final float d()
    {
      return this.a;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final float e()
    {
      return this.b;
    }
    
    public final int f()
    {
      return this.c;
    }
    
    public final int g()
    {
      return this.e;
    }
    
    public final int h()
    {
      return this.f;
    }
    
    public final int i()
    {
      return this.g;
    }
    
    public final int j()
    {
      return this.h;
    }
    
    public final boolean k()
    {
      return this.i;
    }
    
    public final float l()
    {
      return this.d;
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
  
  static final class c
  {
    int a;
    boolean b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 1;
    int i = 1;
    boolean j;
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("LayoutState{mAvailable=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", mFlexLinePosition=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", mPosition=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", mOffset=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", mScrollingOffset=");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", mLastScrollDelta=");
      localStringBuilder.append(this.g);
      localStringBuilder.append(", mItemDirection=");
      localStringBuilder.append(this.h);
      localStringBuilder.append(", mLayoutDirection=");
      localStringBuilder.append(this.i);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  static final class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator() {};
    private int a;
    private int b;
    
    d() {}
    
    private d(Parcel paramParcel)
    {
      this.a = paramParcel.readInt();
      this.b = paramParcel.readInt();
    }
    
    private d(d paramd)
    {
      this.a = paramd.a;
      this.b = paramd.b;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("SavedState{mAnchorPosition=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", mAnchorOffset=");
      localStringBuilder.append(this.b);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.a);
      paramParcel.writeInt(this.b);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/flexbox/FlexboxLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */