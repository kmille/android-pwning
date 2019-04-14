package de.eplus.mappecc.client.android.common.component.expandabletable;

public class ExpandableTablePresenter
{
  private boolean isCollapsed = false;
  private IExpandableTableView view;
  
  public ExpandableTablePresenter(IExpandableTableView paramIExpandableTableView)
  {
    this.view = paramIExpandableTableView;
  }
  
  public void checkExpand()
  {
    if (this.isCollapsed) {
      this.view.collapse();
    }
    for (boolean bool = false;; bool = true)
    {
      this.isCollapsed = bool;
      return;
      this.view.expand();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/ExpandableTablePresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */