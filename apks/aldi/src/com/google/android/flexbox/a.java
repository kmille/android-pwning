package com.google.android.flexbox;

import android.view.View;
import java.util.List;

abstract interface a
{
  public abstract int getAlignContent();
  
  public abstract int getAlignItems();
  
  public abstract int getChildHeightMeasureSpec(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int getChildWidthMeasureSpec(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int getDecorationLengthCrossAxis(View paramView);
  
  public abstract int getDecorationLengthMainAxis(View paramView, int paramInt1, int paramInt2);
  
  public abstract int getFlexDirection();
  
  public abstract View getFlexItemAt(int paramInt);
  
  public abstract int getFlexItemCount();
  
  public abstract List<c> getFlexLinesInternal();
  
  public abstract int getFlexWrap();
  
  public abstract int getLargestMainSize();
  
  public abstract int getMaxLine();
  
  public abstract int getPaddingBottom();
  
  public abstract int getPaddingEnd();
  
  public abstract int getPaddingLeft();
  
  public abstract int getPaddingRight();
  
  public abstract int getPaddingStart();
  
  public abstract int getPaddingTop();
  
  public abstract View getReorderedFlexItemAt(int paramInt);
  
  public abstract int getSumOfCrossSize();
  
  public abstract boolean isMainAxisDirectionHorizontal();
  
  public abstract void onNewFlexItemAdded(View paramView, int paramInt1, int paramInt2, c paramc);
  
  public abstract void onNewFlexLineAdded(c paramc);
  
  public abstract void setFlexLines(List<c> paramList);
  
  public abstract void updateViewCache(int paramInt, View paramView);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/flexbox/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */