package com.google.android.flexbox;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class d
{
  @Nullable
  int[] a;
  @Nullable
  long[] b;
  private final a d;
  private boolean[] e;
  @Nullable
  private long[] f;
  
  d(a parama)
  {
    this.d = parama;
  }
  
  private int a(int paramInt1, b paramb, int paramInt2)
  {
    a locala = this.d;
    paramInt2 = locala.getChildWidthMeasureSpec(paramInt1, locala.getPaddingLeft() + this.d.getPaddingRight() + paramb.m() + paramb.o() + paramInt2, paramb.a());
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (paramInt1 > paramb.i()) {}
    for (paramInt1 = paramb.i();; paramInt1 = paramb.g())
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt1, View.MeasureSpec.getMode(paramInt2));
      if (paramInt1 >= paramb.g()) {
        break;
      }
    }
    return paramInt2;
  }
  
  static int a(long paramLong)
  {
    return (int)paramLong;
  }
  
  private static int a(View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramView.getMeasuredWidth();
    }
    return paramView.getMeasuredHeight();
  }
  
  private static int a(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramb.a();
    }
    return paramb.b();
  }
  
  private int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.d.getPaddingStart();
    }
    return this.d.getPaddingTop();
  }
  
  private static List<c> a(List<c> paramList, int paramInt1, int paramInt2)
  {
    paramInt1 = (paramInt1 - paramInt2) / 2;
    ArrayList localArrayList = new ArrayList();
    c localc = new c();
    localc.g = paramInt1;
    paramInt2 = paramList.size();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      if (paramInt1 == 0) {
        localArrayList.add(localc);
      }
      localArrayList.add((c)paramList.get(paramInt1));
      if (paramInt1 == paramList.size() - 1) {
        localArrayList.add(localc);
      }
      paramInt1 += 1;
    }
    return localArrayList;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, View paramView)
  {
    if (this.b != null) {
      this.b[paramInt1] = b(paramInt2, paramInt3);
    }
    if (this.f != null) {
      this.f[paramInt1] = b(paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
    }
  }
  
  private void a(int paramInt1, int paramInt2, c paramc, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    for (;;)
    {
      int i = paramInt3;
      if (paramc.j <= 0.0F) {
        break;
      }
      if (i < paramc.e) {
        return;
      }
      int m = paramc.e;
      float f5 = (i - paramc.e) / paramc.j;
      paramc.e = (paramInt4 + paramc.f);
      if (!paramBoolean) {
        paramc.g = Integer.MIN_VALUE;
      }
      int j = 0;
      i = 0;
      float f1 = 0.0F;
      int n = 0;
      while (j < paramc.h)
      {
        int i3 = paramc.o + j;
        View localView = this.d.getReorderedFlexItemAt(i3);
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          b localb = (b)localView.getLayoutParams();
          int k = this.d.getFlexDirection();
          int i1;
          float f4;
          float f3;
          float f2;
          int i2;
          double d1;
          int i4;
          if ((k != 0) && (k != 1))
          {
            k = localView.getMeasuredHeight();
            if (this.f != null) {
              k = (int)(this.f[i3] >> 32);
            }
            i1 = j;
            j = localView.getMeasuredWidth();
            if (this.f != null) {
              j = (int)this.f[i3];
            }
            if ((this.e[i3] == 0) && (localb.d() > 0.0F))
            {
              f4 = k + localb.d() * f5;
              f3 = f4;
              f2 = f1;
              if (i1 == paramc.h - 1)
              {
                f3 = f4 + f1;
                f2 = 0.0F;
              }
              i2 = Math.round(f3);
              if (i2 > localb.j())
              {
                k = localb.j();
                this.e[i3] = true;
                paramc.j -= localb.d();
                j = 1;
                f1 = f2;
              }
              else
              {
                f1 = f2 + (f3 - i2);
                d1 = f1;
                if (d1 > 1.0D)
                {
                  k = i2 + 1;
                  Double.isNaN(d1);
                }
                for (d1 -= 1.0D;; d1 += 1.0D)
                {
                  f1 = (float)d1;
                  j = i;
                  break;
                  k = i2;
                  j = i;
                  if (d1 >= -1.0D) {
                    break;
                  }
                  k = i2 - 1;
                  Double.isNaN(d1);
                }
              }
              i = a(paramInt1, localb, paramc.m);
              i4 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
              localView.measure(i, i4);
              i2 = localView.getMeasuredWidth();
              k = localView.getMeasuredHeight();
              a(i3, i, i4, localView);
              this.d.updateViewCache(i3, localView);
              i = j;
            }
            else
            {
              i2 = j;
            }
            j = i1;
            n = Math.max(n, i2 + localb.m() + localb.o() + this.d.getDecorationLengthCrossAxis(localView));
            paramc.e += k + localb.n() + localb.p();
            k = n;
          }
          else
          {
            i1 = j;
            j = localView.getMeasuredWidth();
            if (this.f != null) {
              j = (int)this.f[i3];
            }
            k = localView.getMeasuredHeight();
            if (this.f != null) {
              k = (int)(this.f[i3] >> 32);
            }
            if ((this.e[i3] == 0) && (localb.d() > 0.0F))
            {
              f4 = j + localb.d() * f5;
              f3 = f4;
              f2 = f1;
              if (i1 == paramc.h - 1)
              {
                f3 = f4 + f1;
                f2 = 0.0F;
              }
              i2 = Math.round(f3);
              if (i2 > localb.i())
              {
                k = localb.i();
                this.e[i3] = true;
                paramc.j -= localb.d();
                j = 1;
                f1 = f2;
              }
              else
              {
                f1 = f2 + (f3 - i2);
                d1 = f1;
                if (d1 > 1.0D)
                {
                  k = i2 + 1;
                  Double.isNaN(d1);
                }
                for (d1 -= 1.0D;; d1 += 1.0D)
                {
                  f1 = (float)d1;
                  j = i;
                  break;
                  k = i2;
                  j = i;
                  if (d1 >= -1.0D) {
                    break;
                  }
                  k = i2 - 1;
                  Double.isNaN(d1);
                }
              }
              i = b(paramInt2, localb, paramc.m);
              i4 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
              localView.measure(i4, i);
              k = localView.getMeasuredWidth();
              i2 = localView.getMeasuredHeight();
              a(i3, i4, i, localView);
              this.d.updateViewCache(i3, localView);
              i = j;
            }
            else
            {
              i2 = k;
              k = j;
            }
            j = Math.max(n, i2 + localb.n() + localb.p() + this.d.getDecorationLengthCrossAxis(localView));
            paramc.e += k + localb.m() + localb.o();
            k = j;
            j = i1;
          }
          paramc.g = Math.max(paramc.g, k);
          n = k;
        }
        j += 1;
      }
      if ((i == 0) || (m == paramc.e)) {
        break;
      }
      paramBoolean = true;
    }
  }
  
  private void a(View paramView, int paramInt)
  {
    b localb = (b)paramView.getLayoutParams();
    int j = paramView.getMeasuredWidth();
    int m = paramView.getMeasuredHeight();
    int i = localb.g();
    int k = 1;
    if (j < i) {}
    for (i = localb.g();; i = localb.i())
    {
      int n = 1;
      j = i;
      i = n;
      break label83;
      if (j <= localb.i()) {
        break;
      }
    }
    i = 0;
    label83:
    if (m < localb.h())
    {
      i = localb.h();
    }
    else if (m > localb.j())
    {
      i = localb.j();
    }
    else
    {
      k = i;
      i = m;
    }
    if (k != 0)
    {
      j = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
      i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      paramView.measure(j, i);
      a(paramInt, j, i, paramView);
      this.d.updateViewCache(paramInt, paramView);
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2)
  {
    b localb = (b)paramView.getLayoutParams();
    int i = Math.min(Math.max(paramInt1 - localb.n() - localb.p() - this.d.getDecorationLengthCrossAxis(paramView), localb.h()), localb.j());
    if (this.f != null) {
      paramInt1 = (int)this.f[paramInt2];
    } else {
      paramInt1 = paramView.getMeasuredWidth();
    }
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    paramView.measure(paramInt1, i);
    a(paramInt2, paramInt1, i, paramView);
    this.d.updateViewCache(paramInt2, paramView);
  }
  
  private void a(List<c> paramList, c paramc, int paramInt1, int paramInt2)
  {
    paramc.m = paramInt2;
    this.d.onNewFlexLineAdded(paramc);
    paramc.p = paramInt1;
    paramList.add(paramc);
  }
  
  private static boolean a(int paramInt1, int paramInt2, c paramc)
  {
    return (paramInt1 == paramInt2 - 1) && (paramc.a() != 0);
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, b paramb, int paramInt5, int paramInt6, int paramInt7)
  {
    if (this.d.getFlexWrap() == 0) {
      return false;
    }
    if (paramb.k()) {
      return true;
    }
    if (paramInt1 == 0) {
      return false;
    }
    paramInt1 = this.d.getMaxLine();
    if ((paramInt1 != -1) && (paramInt1 <= paramInt7 + 1)) {
      return false;
    }
    paramInt5 = this.d.getDecorationLengthMainAxis(paramView, paramInt5, paramInt6);
    paramInt1 = paramInt4;
    if (paramInt5 > 0) {
      paramInt1 = paramInt4 + paramInt5;
    }
    return paramInt2 < paramInt3 + paramInt1;
  }
  
  private static int[] a(int paramInt, List<b> paramList, SparseIntArray paramSparseIntArray)
  {
    Collections.sort(paramList);
    paramSparseIntArray.clear();
    int[] arrayOfInt = new int[paramInt];
    paramList = paramList.iterator();
    paramInt = 0;
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      arrayOfInt[paramInt] = localb.a;
      paramSparseIntArray.append(localb.a, localb.b);
      paramInt += 1;
    }
    return arrayOfInt;
  }
  
  private int b(int paramInt1, b paramb, int paramInt2)
  {
    a locala = this.d;
    paramInt2 = locala.getChildHeightMeasureSpec(paramInt1, locala.getPaddingTop() + this.d.getPaddingBottom() + paramb.n() + paramb.p() + paramInt2, paramb.b());
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (paramInt1 > paramb.j()) {}
    for (paramInt1 = paramb.j();; paramInt1 = paramb.h())
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt1, View.MeasureSpec.getMode(paramInt2));
      if (paramInt1 >= paramb.h()) {
        break;
      }
    }
    return paramInt2;
  }
  
  static int b(long paramLong)
  {
    return (int)(paramLong >> 32);
  }
  
  private static int b(View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramView.getMeasuredHeight();
    }
    return paramView.getMeasuredWidth();
  }
  
  private static int b(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramb.b();
    }
    return paramb.a();
  }
  
  private int b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.d.getPaddingEnd();
    }
    return this.d.getPaddingBottom();
  }
  
  @VisibleForTesting
  private static long b(int paramInt1, int paramInt2)
  {
    long l = paramInt2;
    return paramInt1 & 0xFFFFFFFF | l << 32;
  }
  
  private void b(int paramInt1, int paramInt2, c paramc, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    for (;;)
    {
      int i = paramInt3;
      int m = paramc.e;
      if (paramc.k <= 0.0F) {
        break;
      }
      if (i > paramc.e) {
        return;
      }
      float f5 = (paramc.e - i) / paramc.k;
      paramc.e = (paramInt4 + paramc.f);
      if (!paramBoolean) {
        paramc.g = Integer.MIN_VALUE;
      }
      int j = 0;
      i = 0;
      float f1 = 0.0F;
      int n = 0;
      while (j < paramc.h)
      {
        int i3 = paramc.o + j;
        View localView = this.d.getReorderedFlexItemAt(i3);
        if ((localView != null) && (localView.getVisibility() != 8))
        {
          b localb = (b)localView.getLayoutParams();
          int k = this.d.getFlexDirection();
          int i1;
          float f4;
          float f3;
          float f2;
          int i2;
          double d1;
          int i4;
          if ((k != 0) && (k != 1))
          {
            k = localView.getMeasuredHeight();
            if (this.f != null) {
              k = (int)(this.f[i3] >> 32);
            }
            i1 = j;
            j = localView.getMeasuredWidth();
            if (this.f != null) {
              j = (int)this.f[i3];
            }
            if ((this.e[i3] == 0) && (localb.e() > 0.0F))
            {
              f4 = k - localb.e() * f5;
              f3 = f4;
              f2 = f1;
              if (i1 == paramc.h - 1)
              {
                f3 = f4 + f1;
                f2 = 0.0F;
              }
              i2 = Math.round(f3);
              if (i2 < localb.h())
              {
                j = localb.h();
                this.e[i3] = true;
                paramc.k -= localb.e();
                k = 1;
                f1 = f2;
              }
              else
              {
                f2 += f3 - i2;
                d1 = f2;
                if (d1 > 1.0D)
                {
                  j = i2 + 1;
                  f1 = f2 - 1.0F;
                  k = i;
                }
                else
                {
                  j = i2;
                  k = i;
                  f1 = f2;
                  if (d1 < -1.0D)
                  {
                    j = i2 - 1;
                    f1 = f2 + 1.0F;
                    k = i;
                  }
                }
              }
              i = a(paramInt1, localb, paramc.m);
              i4 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
              localView.measure(i, i4);
              j = localView.getMeasuredWidth();
              i2 = localView.getMeasuredHeight();
              a(i3, i, i4, localView);
              this.d.updateViewCache(i3, localView);
              i = k;
              k = i2;
            }
            j = Math.max(n, j + localb.m() + localb.o() + this.d.getDecorationLengthCrossAxis(localView));
            paramc.e += k + localb.n() + localb.p();
            k = j;
            j = i1;
          }
          else
          {
            i1 = j;
            j = localView.getMeasuredWidth();
            if (this.f != null) {
              j = (int)this.f[i3];
            }
            k = localView.getMeasuredHeight();
            if (this.f != null) {
              k = (int)(this.f[i3] >> 32);
            }
            if ((this.e[i3] == 0) && (localb.e() > 0.0F))
            {
              f4 = j - localb.e() * f5;
              f3 = f4;
              f2 = f1;
              if (i1 == paramc.h - 1)
              {
                f3 = f4 + f1;
                f2 = 0.0F;
              }
              i2 = Math.round(f3);
              if (i2 < localb.g())
              {
                j = localb.g();
                this.e[i3] = true;
                paramc.k -= localb.e();
                k = 1;
                f1 = f2;
              }
              else
              {
                f2 += f3 - i2;
                d1 = f2;
                if (d1 > 1.0D)
                {
                  j = i2 + 1;
                  f1 = f2 - 1.0F;
                  k = i;
                }
                else
                {
                  j = i2;
                  k = i;
                  f1 = f2;
                  if (d1 < -1.0D)
                  {
                    j = i2 - 1;
                    f1 = f2 + 1.0F;
                    k = i;
                  }
                }
              }
              i = b(paramInt2, localb, paramc.m);
              i4 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
              localView.measure(i4, i);
              j = localView.getMeasuredWidth();
              i2 = localView.getMeasuredHeight();
              a(i3, i4, i, localView);
              this.d.updateViewCache(i3, localView);
              i = k;
              k = i2;
            }
            k = Math.max(n, k + localb.n() + localb.p() + this.d.getDecorationLengthCrossAxis(localView));
            paramc.e += j + localb.m() + localb.o();
            j = i1;
          }
          paramc.g = Math.max(paramc.g, k);
          n = k;
        }
        j += 1;
      }
      if ((i == 0) || (m == paramc.e)) {
        break;
      }
      paramBoolean = true;
    }
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    b localb = (b)paramView.getLayoutParams();
    int i = Math.min(Math.max(paramInt1 - localb.m() - localb.o() - this.d.getDecorationLengthCrossAxis(paramView), localb.g()), localb.i());
    if (this.f != null) {
      paramInt1 = (int)(this.f[paramInt2] >> 32);
    } else {
      paramInt1 = paramView.getMeasuredHeight();
    }
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    paramView.measure(i, paramInt1);
    a(paramInt2, i, paramInt1, paramView);
    this.d.updateViewCache(paramInt2, paramView);
  }
  
  private static int c(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramb.m();
    }
    return paramb.n();
  }
  
  private int c(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.d.getPaddingTop();
    }
    return this.d.getPaddingStart();
  }
  
  private static int d(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramb.o();
    }
    return paramb.p();
  }
  
  private int d(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.d.getPaddingBottom();
    }
    return this.d.getPaddingEnd();
  }
  
  private static int e(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramb.n();
    }
    return paramb.m();
  }
  
  @NonNull
  private List<b> e(int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramInt);
    int i = 0;
    while (i < paramInt)
    {
      b localb = (b)this.d.getFlexItemAt(i).getLayoutParams();
      b localb1 = new b((byte)0);
      localb1.b = localb.c();
      localb1.a = i;
      localArrayList.add(localb1);
      i += 1;
    }
    return localArrayList;
  }
  
  private static int f(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramb.p();
    }
    return paramb.o();
  }
  
  private void f(int paramInt)
  {
    int i;
    if (this.e == null)
    {
      i = paramInt;
      if (paramInt < 10) {
        i = 10;
      }
      this.e = new boolean[i];
      return;
    }
    if (this.e.length < paramInt)
    {
      int j = this.e.length * 2;
      i = paramInt;
      if (j >= paramInt) {
        i = j;
      }
      this.e = new boolean[i];
      return;
    }
    Arrays.fill(this.e, false);
  }
  
  final void a()
  {
    a(0);
  }
  
  final void a(int paramInt)
  {
    if (paramInt >= this.d.getFlexItemCount()) {
      return;
    }
    int j = this.d.getFlexDirection();
    c localc;
    Object localObject2;
    Object localObject3;
    if (this.d.getAlignItems() == 4)
    {
      if (this.a != null) {
        paramInt = this.a[paramInt];
      } else {
        paramInt = 0;
      }
      localObject1 = this.d.getFlexLinesInternal();
      int k = ((List)localObject1).size();
      while (paramInt < k)
      {
        localc = (c)((List)localObject1).get(paramInt);
        int m = localc.h;
        int i = 0;
        while (i < m)
        {
          int n = localc.o + i;
          if (i < this.d.getFlexItemCount())
          {
            localObject2 = this.d.getReorderedFlexItemAt(n);
            if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8))
            {
              localObject3 = (b)((View)localObject2).getLayoutParams();
              if ((((b)localObject3).f() == -1) || (((b)localObject3).f() == 4)) {
                switch (j)
                {
                default: 
                  throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(j)));
                case 2: 
                case 3: 
                  b((View)localObject2, localc.g, n);
                  break;
                case 0: 
                case 1: 
                  a((View)localObject2, localc.g, n);
                }
              }
            }
          }
          i += 1;
        }
        paramInt += 1;
      }
      return;
    }
    Object localObject1 = this.d.getFlexLinesInternal().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localc = (c)((Iterator)localObject1).next();
      localObject2 = localc.n.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Integer)((Iterator)localObject2).next();
        View localView = this.d.getReorderedFlexItemAt(((Integer)localObject3).intValue());
        switch (j)
        {
        default: 
          throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(j)));
        case 2: 
        case 3: 
          b(localView, localc.g, ((Integer)localObject3).intValue());
          break;
        case 0: 
        case 1: 
          a(localView, localc.g, ((Integer)localObject3).intValue());
        }
      }
    }
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, 0);
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    f(this.d.getFlexItemCount());
    if (paramInt3 >= this.d.getFlexItemCount()) {
      return;
    }
    int i = this.d.getFlexDirection();
    int j;
    int k;
    int m;
    switch (this.d.getFlexDirection())
    {
    default: 
      throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
    case 2: 
    case 3: 
      j = View.MeasureSpec.getMode(paramInt2);
      i = View.MeasureSpec.getSize(paramInt2);
      if (j != 1073741824) {
        i = this.d.getLargestMainSize();
      }
      k = this.d.getPaddingTop();
      m = this.d.getPaddingBottom();
      j = i;
      break;
    case 0: 
    case 1: 
      j = View.MeasureSpec.getMode(paramInt1);
      i = View.MeasureSpec.getSize(paramInt1);
      if (j != 1073741824) {
        i = this.d.getLargestMainSize();
      }
      k = this.d.getPaddingLeft();
      m = this.d.getPaddingRight();
      j = i;
    }
    k += m;
    i = 0;
    if (this.a != null) {
      i = this.a[paramInt3];
    }
    List localList = this.d.getFlexLinesInternal();
    paramInt3 = localList.size();
    while (i < paramInt3)
    {
      c localc = (c)localList.get(i);
      if (localc.e < j) {
        a(paramInt1, paramInt2, localc, j, k, false);
      } else {
        b(paramInt1, paramInt2, localc, j, k, false);
      }
      i += 1;
    }
  }
  
  final void a(View paramView, c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b localb = (b)paramView.getLayoutParams();
    int i = this.d.getAlignItems();
    if (localb.f() != -1) {
      i = localb.f();
    }
    int j = paramc.g;
    switch (i)
    {
    default: 
      return;
    case 3: 
      if (this.d.getFlexWrap() != 2)
      {
        i = Math.max(paramc.l - paramView.getBaseline(), localb.n());
        paramView.layout(paramInt1, paramInt2 + i, paramInt3, paramInt4 + i);
        return;
      }
      i = Math.max(paramc.l - paramView.getMeasuredHeight() + paramView.getBaseline(), localb.p());
      paramView.layout(paramInt1, paramInt2 - i, paramInt3, paramInt4 - i);
      return;
    case 2: 
      paramInt4 = (j - paramView.getMeasuredHeight() + localb.n() - localb.p()) / 2;
      if (this.d.getFlexWrap() != 2)
      {
        paramInt2 += paramInt4;
        paramView.layout(paramInt1, paramInt2, paramInt3, paramView.getMeasuredHeight() + paramInt2);
        return;
      }
      paramInt2 -= paramInt4;
      paramView.layout(paramInt1, paramInt2, paramInt3, paramView.getMeasuredHeight() + paramInt2);
      return;
    case 1: 
      if (this.d.getFlexWrap() != 2)
      {
        paramInt2 += j;
        paramView.layout(paramInt1, paramInt2 - paramView.getMeasuredHeight() - localb.p(), paramInt3, paramInt2 - localb.p());
        return;
      }
      paramView.layout(paramInt1, paramInt2 - j + paramView.getMeasuredHeight() + localb.n(), paramInt3, paramInt4 - j + paramView.getMeasuredHeight() + localb.n());
      return;
    }
    if (this.d.getFlexWrap() != 2)
    {
      paramView.layout(paramInt1, paramInt2 + localb.n(), paramInt3, paramInt4 + localb.n());
      return;
    }
    paramView.layout(paramInt1, paramInt2 - localb.p(), paramInt3, paramInt4 - localb.p());
  }
  
  final void a(View paramView, c paramc, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b localb = (b)paramView.getLayoutParams();
    int i = this.d.getAlignItems();
    if (localb.f() != -1) {
      i = localb.f();
    }
    int j = paramc.g;
    switch (i)
    {
    default: 
      return;
    case 2: 
      paramc = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
      i = (j - paramView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart(paramc) - MarginLayoutParamsCompat.getMarginEnd(paramc)) / 2;
      if (!paramBoolean)
      {
        paramInt1 += i;
        paramInt3 += i;
        paramView.layout(paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      paramView.layout(paramInt1 - i, paramInt2, paramInt3 - i, paramInt4);
      return;
    case 1: 
      label132:
      if (!paramBoolean)
      {
        paramInt1 = paramInt1 + j - paramView.getMeasuredWidth() - localb.o();
        paramInt3 = paramInt3 + j - paramView.getMeasuredWidth();
      }
      break;
    }
    for (;;)
    {
      paramInt3 -= localb.o();
      break label132;
      paramInt1 = paramInt1 - j + paramView.getMeasuredWidth() + localb.m();
      paramInt3 = paramInt3 - j + paramView.getMeasuredWidth();
      for (;;)
      {
        i = localb.m();
        break;
        if (paramBoolean) {
          break label278;
        }
        paramInt1 += localb.m();
      }
      label278:
      paramInt1 -= localb.o();
    }
  }
  
  final void a(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, @Nullable List<c> paramList)
  {
    int i2 = paramInt2;
    int i3 = paramInt5;
    boolean bool = this.d.isMainAxisDirectionHorizontal();
    int j = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt1);
    Object localObject1;
    if (paramList == null) {
      localObject1 = new ArrayList();
    } else {
      localObject1 = paramList;
    }
    parama.a = ((List)localObject1);
    if (i3 == -1) {
      i = 1;
    } else {
      i = 0;
    }
    int k = a(bool);
    int m = b(bool);
    int i9 = c(bool);
    int i10 = d(bool);
    paramList = new c();
    paramList.o = paramInt4;
    int i4 = m + k;
    paramList.e = i4;
    int i5 = this.d.getFlexItemCount();
    int i7 = 0;
    int i1 = 0;
    int i6 = 0;
    m = Integer.MIN_VALUE;
    k = i;
    int i = n;
    n = i7;
    int i8;
    for (;;)
    {
      i7 = paramInt1;
      i8 = i1;
      if (paramInt4 >= i5) {
        break;
      }
      View localView = this.d.getReorderedFlexItemAt(paramInt4);
      if (localView == null)
      {
        if (!a(paramInt4, i5, paramList)) {}
      }
      else {
        do
        {
          a((List)localObject1, paramList, paramInt4, n);
          break;
          if (localView.getVisibility() != 8) {
            break label309;
          }
          paramList.i += 1;
          paramList.h += 1;
        } while (a(paramInt4, i5, paramList));
      }
      i8 = i;
      i7 = i2;
      i = i3;
      i2 = n;
      n = i7;
      i7 = paramInt4;
      paramInt4 = i8;
      break label1410;
      label309:
      b localb = (b)localView.getLayoutParams();
      if (localb.f() == 4) {
        paramList.n.add(Integer.valueOf(paramInt4));
      }
      i8 = a(localb, bool);
      i3 = i8;
      if (localb.l() != -1.0F)
      {
        i3 = i8;
        if (j == 1073741824) {
          i3 = Math.round(i * localb.l());
        }
      }
      if (bool)
      {
        i3 = this.d.getChildWidthMeasureSpec(i7, i4 + c(localb, true) + d(localb, true), i3);
        i2 = this.d.getChildHeightMeasureSpec(i2, i9 + i10 + e(localb, true) + f(localb, true) + n, b(localb, true));
        localView.measure(i3, i2);
        a(paramInt4, i3, i2, localView);
      }
      else
      {
        i2 = this.d.getChildWidthMeasureSpec(i2, i9 + i10 + e(localb, false) + f(localb, false) + n, b(localb, false));
        i3 = this.d.getChildHeightMeasureSpec(i7, c(localb, false) + i4 + d(localb, false), i3);
        localView.measure(i2, i3);
        a(paramInt4, i2, i3, localView);
      }
      i7 = j;
      this.d.updateViewCache(paramInt4, localView);
      a(localView, paramInt4);
      i1 = View.combineMeasuredStates(i1, localView.getMeasuredState());
      i8 = paramList.e;
      int i11 = a(localView, bool);
      int i12 = c(localb, bool);
      int i13 = d(localb, bool);
      int i14 = ((List)localObject1).size();
      Object localObject2 = localObject1;
      i2 = i;
      j = i7;
      if (a(localView, i7, i, i8, i13 + (i11 + i12), localb, paramInt4, i6, i14))
      {
        if (paramList.a() > 0)
        {
          if (paramInt4 > 0) {
            i = paramInt4 - 1;
          } else {
            i = 0;
          }
          a((List)localObject2, paramList, i, n);
          i = paramList.g + n;
        }
        else
        {
          i = n;
        }
        if (bool) {
          if (localb.b() == -1)
          {
            paramList = this.d;
            localView.measure(i3, paramList.getChildHeightMeasureSpec(paramInt2, paramList.getPaddingTop() + this.d.getPaddingBottom() + localb.n() + localb.p() + i, localb.b()));
          }
        }
        for (;;)
        {
          a(localView, paramInt4);
          break;
          break;
          if (localb.a() != -1) {
            break;
          }
          paramList = this.d;
          localView.measure(paramList.getChildWidthMeasureSpec(paramInt2, paramList.getPaddingLeft() + this.d.getPaddingRight() + localb.m() + localb.o() + i, localb.a()), i3);
        }
        paramList = new c();
        paramList.h = 1;
        paramList.e = i4;
        paramList.o = paramInt4;
        n = i;
        i = 0;
        m = Integer.MIN_VALUE;
      }
      else
      {
        paramList.h += 1;
        i = i6 + 1;
      }
      i7 = paramInt4;
      i3 = paramInt2;
      if (this.a != null) {
        this.a[i7] = ((List)localObject2).size();
      }
      paramList.e += a(localView, bool) + c(localb, bool) + d(localb, bool);
      paramList.j += localb.d();
      paramList.k += localb.e();
      this.d.onNewFlexItemAdded(localView, i7, i, paramList);
      m = Math.max(m, b(localView, bool) + e(localb, bool) + f(localb, bool) + this.d.getDecorationLengthCrossAxis(localView));
      paramList.g = Math.max(paramList.g, m);
      if (bool)
      {
        if (this.d.getFlexWrap() != 2) {}
        for (paramInt4 = Math.max(paramList.l, localView.getBaseline() + localb.n());; paramInt4 = Math.max(paramList.l, localView.getMeasuredHeight() - localView.getBaseline() + localb.p()))
        {
          paramList.l = paramInt4;
          break;
        }
      }
      paramInt4 = n;
      if (a(i7, i5, paramList))
      {
        a((List)localObject2, paramList, i7, n);
        paramInt4 = n + paramList.g;
      }
      n = paramInt5;
      if ((n != -1) && (((List)localObject2).size() > 0) && (((c)((List)localObject2).get(((List)localObject2).size() - 1)).p >= n) && (i7 >= n) && (k == 0))
      {
        paramInt4 = -paramList.g;
        k = 1;
      }
      if (paramInt4 > paramInt3)
      {
        i8 = i1;
        if (k != 0) {
          break;
        }
      }
      i8 = paramInt4;
      i6 = i;
      paramInt4 = i2;
      i = n;
      n = i3;
      i2 = i8;
      label1410:
      i8 = i7 + 1;
      i3 = n;
      i7 = i;
      i = paramInt4;
      n = i2;
      paramInt4 = i8;
      i2 = i3;
      i3 = i7;
    }
    parama.b = i8;
  }
  
  final void a(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable List<c> paramList)
  {
    a(parama, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList);
  }
  
  final void a(List<c> paramList, int paramInt)
  {
    if ((!c) && (this.a == null)) {
      throw new AssertionError();
    }
    if ((!c) && (this.b == null)) {
      throw new AssertionError();
    }
    int j = this.a[paramInt];
    int i = j;
    if (j == -1) {
      i = 0;
    }
    j = paramList.size() - 1;
    while (j >= i)
    {
      paramList.remove(j);
      j -= 1;
    }
    i = this.a.length - 1;
    if (paramInt > i) {
      Arrays.fill(this.a, -1);
    } else {
      Arrays.fill(this.a, paramInt, i, -1);
    }
    i = this.b.length - 1;
    if (paramInt > i)
    {
      Arrays.fill(this.b, 0L);
      return;
    }
    Arrays.fill(this.b, paramInt, i, 0L);
  }
  
  final int[] a(SparseIntArray paramSparseIntArray)
  {
    int i = this.d.getFlexItemCount();
    return a(i, e(i), paramSparseIntArray);
  }
  
  final int[] a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, SparseIntArray paramSparseIntArray)
  {
    int i = this.d.getFlexItemCount();
    List localList = e(i);
    b localb = new b((byte)0);
    if ((paramView != null) && ((paramLayoutParams instanceof b))) {
      localb.b = ((b)paramLayoutParams).c();
    } else {
      localb.b = 1;
    }
    if ((paramInt != -1) && (paramInt != i) && (paramInt < this.d.getFlexItemCount())) {
      localb.a = paramInt;
    }
    while (paramInt < i)
    {
      paramView = (b)localList.get(paramInt);
      paramView.a += 1;
      paramInt += 1;
      continue;
      localb.a = i;
    }
    localList.add(localb);
    return a(i + 1, localList, paramSparseIntArray);
  }
  
  final void b(int paramInt)
  {
    int i;
    if (this.f == null)
    {
      i = paramInt;
      if (paramInt < 10) {
        i = 10;
      }
      this.f = new long[i];
      return;
    }
    if (this.f.length < paramInt)
    {
      int j = this.f.length * 2;
      i = paramInt;
      if (j >= paramInt) {
        i = j;
      }
      this.f = Arrays.copyOf(this.f, i);
    }
  }
  
  final void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.d.getFlexDirection();
    switch (i)
    {
    default: 
      throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
    case 2: 
    case 3: 
      paramInt2 = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      break;
    case 0: 
    case 1: 
      i = View.MeasureSpec.getMode(paramInt2);
      paramInt1 = View.MeasureSpec.getSize(paramInt2);
      paramInt2 = i;
    }
    Object localObject1 = this.d.getFlexLinesInternal();
    if (paramInt2 == 1073741824)
    {
      int j = this.d.getSumOfCrossSize() + paramInt3;
      int k = ((List)localObject1).size();
      i = 0;
      paramInt2 = 0;
      if (k == 1)
      {
        ((c)((List)localObject1).get(0)).g = (paramInt1 - paramInt3);
        return;
      }
      if (((List)localObject1).size() >= 2)
      {
        float f1;
        Object localObject2;
        float f3;
        float f2;
        c localc1;
        switch (this.d.getAlignContent())
        {
        default: 
          
        case 5: 
          if (j < paramInt1)
          {
            float f5 = (paramInt1 - j) / ((List)localObject1).size();
            i = ((List)localObject1).size();
            f1 = 0.0F;
            while (paramInt2 < i)
            {
              localObject2 = (c)((List)localObject1).get(paramInt2);
              float f4 = ((c)localObject2).g + f5;
              f3 = f4;
              f2 = f1;
              if (paramInt2 == ((List)localObject1).size() - 1)
              {
                f3 = f4 + f1;
                f2 = 0.0F;
              }
              paramInt3 = Math.round(f3);
              f2 += f3 - paramInt3;
              if (f2 > 1.0F)
              {
                paramInt1 = paramInt3 + 1;
                f1 = f2 - 1.0F;
              }
              else
              {
                paramInt1 = paramInt3;
                f1 = f2;
                if (f2 < -1.0F)
                {
                  paramInt1 = paramInt3 - 1;
                  f1 = f2 + 1.0F;
                }
              }
              ((c)localObject2).g = paramInt1;
              paramInt2 += 1;
            }
            return;
          }
          break;
        case 4: 
          if (j >= paramInt1)
          {
            this.d.setFlexLines(a((List)localObject1, paramInt1, j));
            return;
          }
          paramInt1 = (paramInt1 - j) / (((List)localObject1).size() * 2);
          localObject2 = new ArrayList();
          localc1 = new c();
          localc1.g = paramInt1;
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            c localc2 = (c)((Iterator)localObject1).next();
            ((List)localObject2).add(localc1);
            ((List)localObject2).add(localc2);
            ((List)localObject2).add(localc1);
          }
          this.d.setFlexLines((List)localObject2);
          return;
        case 3: 
          if (j < paramInt1)
          {
            f3 = (paramInt1 - j) / (((List)localObject1).size() - 1);
            localObject2 = new ArrayList();
            paramInt2 = ((List)localObject1).size();
            f1 = 0.0F;
            paramInt1 = i;
            while (paramInt1 < paramInt2)
            {
              ((List)localObject2).add((c)((List)localObject1).get(paramInt1));
              f2 = f1;
              if (paramInt1 != ((List)localObject1).size() - 1)
              {
                localc1 = new c();
                if (paramInt1 == ((List)localObject1).size() - 2)
                {
                  localc1.g = Math.round(f1 + f3);
                  f1 = 0.0F;
                }
                else
                {
                  localc1.g = Math.round(f3);
                }
                f2 = f1 + (f3 - localc1.g);
                if (f2 > 1.0F)
                {
                  localc1.g += 1;
                  f1 = f2 - 1.0F;
                }
                else
                {
                  f1 = f2;
                  if (f2 < -1.0F)
                  {
                    localc1.g -= 1;
                    f1 = f2 + 1.0F;
                  }
                }
                ((List)localObject2).add(localc1);
                f2 = f1;
              }
              paramInt1 += 1;
              f1 = f2;
            }
            this.d.setFlexLines((List)localObject2);
            return;
          }
          break;
        case 2: 
          this.d.setFlexLines(a((List)localObject1, paramInt1, j));
          return;
        case 1: 
          localObject2 = new c();
          ((c)localObject2).g = (paramInt1 - j);
          ((List)localObject1).add(0, localObject2);
        }
      }
    }
  }
  
  final void b(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<c> paramList)
  {
    a(parama, paramInt1, paramInt2, paramInt3, 0, paramInt4, paramList);
  }
  
  final boolean b(SparseIntArray paramSparseIntArray)
  {
    int j = this.d.getFlexItemCount();
    if (paramSparseIntArray.size() != j) {
      return true;
    }
    int i = 0;
    while (i < j)
    {
      View localView = this.d.getFlexItemAt(i);
      if ((localView != null) && (((b)localView.getLayoutParams()).c() != paramSparseIntArray.get(i))) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  final void c(int paramInt)
  {
    int i;
    if (this.b == null)
    {
      i = paramInt;
      if (paramInt < 10) {
        i = 10;
      }
      this.b = new long[i];
      return;
    }
    if (this.b.length < paramInt)
    {
      int j = this.b.length * 2;
      i = paramInt;
      if (j >= paramInt) {
        i = j;
      }
      this.b = Arrays.copyOf(this.b, i);
    }
  }
  
  final void c(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable List<c> paramList)
  {
    a(parama, paramInt2, paramInt1, paramInt3, paramInt4, -1, paramList);
  }
  
  final void d(int paramInt)
  {
    int i;
    if (this.a == null)
    {
      i = paramInt;
      if (paramInt < 10) {
        i = 10;
      }
      this.a = new int[i];
      return;
    }
    if (this.a.length < paramInt)
    {
      int j = this.a.length * 2;
      i = paramInt;
      if (j >= paramInt) {
        i = j;
      }
      this.a = Arrays.copyOf(this.a, i);
    }
  }
  
  final void d(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<c> paramList)
  {
    a(parama, paramInt2, paramInt1, paramInt3, 0, paramInt4, paramList);
  }
  
  static final class a
  {
    List<c> a;
    int b;
    
    final void a()
    {
      this.a = null;
      this.b = 0;
    }
  }
  
  static final class b
    implements Comparable<b>
  {
    int a;
    int b;
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("Order{order=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", index=");
      localStringBuilder.append(this.a);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/flexbox/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */