package de.eplus.mappecc.client.android.common.component.expandabletable;

public class TableModel
{
  private boolean hasBulletPoint;
  private String text;
  
  public TableModel(boolean paramBoolean, String paramString)
  {
    this.hasBulletPoint = paramBoolean;
    this.text = paramString;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public boolean isHasBulletPoint()
  {
    return this.hasBulletPoint;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/expandabletable/TableModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */