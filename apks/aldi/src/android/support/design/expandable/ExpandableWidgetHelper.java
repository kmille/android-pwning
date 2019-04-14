package android.support.design.expandable;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

public final class ExpandableWidgetHelper
{
  private boolean expanded = false;
  @IdRes
  private int expandedComponentIdHint = 0;
  private final View widget;
  
  public ExpandableWidgetHelper(ExpandableWidget paramExpandableWidget)
  {
    this.widget = ((View)paramExpandableWidget);
  }
  
  private void dispatchExpandedStateChanged()
  {
    ViewParent localViewParent = this.widget.getParent();
    if ((localViewParent instanceof CoordinatorLayout)) {
      ((CoordinatorLayout)localViewParent).dispatchDependentViewsChanged(this.widget);
    }
  }
  
  @IdRes
  public final int getExpandedComponentIdHint()
  {
    return this.expandedComponentIdHint;
  }
  
  public final boolean isExpanded()
  {
    return this.expanded;
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle)
  {
    this.expanded = paramBundle.getBoolean("expanded", false);
    this.expandedComponentIdHint = paramBundle.getInt("expandedComponentIdHint", 0);
    if (this.expanded) {
      dispatchExpandedStateChanged();
    }
  }
  
  public final Bundle onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("expanded", this.expanded);
    localBundle.putInt("expandedComponentIdHint", this.expandedComponentIdHint);
    return localBundle;
  }
  
  public final boolean setExpanded(boolean paramBoolean)
  {
    if (this.expanded != paramBoolean)
    {
      this.expanded = paramBoolean;
      dispatchExpandedStateChanged();
      return true;
    }
    return false;
  }
  
  public final void setExpandedComponentIdHint(@IdRes int paramInt)
  {
    this.expandedComponentIdHint = paramInt;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/design/expandable/ExpandableWidgetHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */