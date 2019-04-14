package de.eplus.mappecc.client.android.common.component.expandabletable;

public abstract interface IExpandableCellCardView
{
  public abstract void collapse();
  
  public abstract void expand();
  
  public abstract boolean isExpanded();
  
  public abstract void switchExpandStateConditionally(boolean paramBoolean);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/IExpandableCellCardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */