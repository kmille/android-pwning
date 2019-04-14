package de.eplus.mappecc.client.android.common.component.expandabletable;

import de.eplus.mappecc.client.android.common.model.PackDataModel;

public abstract interface IExpandableTableView
{
  public abstract void collapse();
  
  public abstract void expand();
  
  public abstract void fillTable(String paramString, PackDataModel paramPackDataModel);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/IExpandableTableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */