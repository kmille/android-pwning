package android.support.design.expandable;

import android.support.annotation.IdRes;

public abstract interface ExpandableTransformationWidget
  extends ExpandableWidget
{
  @IdRes
  public abstract int getExpandedComponentIdHint();
  
  public abstract void setExpandedComponentIdHint(@IdRes int paramInt);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/design/expandable/ExpandableTransformationWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */