package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  int a = Integer.MAX_VALUE;
  int b = Integer.MAX_VALUE;
  int c = Integer.MIN_VALUE;
  int d = Integer.MIN_VALUE;
  int e;
  int f;
  int g;
  int h;
  int i;
  float j;
  float k;
  int l;
  int m;
  List<Integer> n = new ArrayList();
  int o;
  int p;
  
  public final int a()
  {
    return this.h - this.i;
  }
  
  final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b localb = (b)paramView.getLayoutParams();
    this.a = Math.min(this.a, paramView.getLeft() - localb.m() - paramInt1);
    this.b = Math.min(this.b, paramView.getTop() - localb.n() - paramInt2);
    this.c = Math.max(this.c, paramView.getRight() + localb.o() + paramInt3);
    this.d = Math.max(this.d, paramView.getBottom() + localb.p() + paramInt4);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/flexbox/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */