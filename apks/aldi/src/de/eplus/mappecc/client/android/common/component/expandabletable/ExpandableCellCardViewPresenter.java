package de.eplus.mappecc.client.android.common.component.expandabletable;

public class ExpandableCellCardViewPresenter
{
  private boolean isExpanded = false;
  private IExpandableCellCardView view;
  
  public ExpandableCellCardViewPresenter(IExpandableCellCardView paramIExpandableCellCardView, boolean paramBoolean)
  {
    this.view = paramIExpandableCellCardView;
    this.isExpanded = paramBoolean;
  }
  
  public boolean isExpanded()
  {
    return this.isExpanded;
  }
  
  public void switchExpandState()
  {
    if (this.isExpanded) {
      this.view.collapse();
    }
    for (boolean bool = false;; bool = true)
    {
      this.isExpanded = bool;
      return;
      this.view.expand();
    }
  }
  
  public void switchExpandStateConditionally(boolean paramBoolean)
  {
    if ((paramBoolean) && (!this.isExpanded))
    {
      this.view.expand();
      this.isExpanded = true;
      return;
    }
    if ((!paramBoolean) && (this.isExpanded))
    {
      this.view.collapse();
      this.isExpanded = false;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/ExpandableCellCardViewPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */