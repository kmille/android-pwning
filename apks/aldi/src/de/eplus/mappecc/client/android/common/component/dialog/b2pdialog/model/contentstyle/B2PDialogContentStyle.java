package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.contentstyle;

import de.eplus.mappecc.client.android.common.utils.UiUtils;

public class B2PDialogContentStyle
{
  private final int contentGravity;
  private final int paddingBottomDp;
  private final int paddingLeftDp;
  private final int paddingRightDp;
  private final int paddingTopDp;
  private final int titleContentSpaceDp;
  
  public B2PDialogContentStyle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.paddingLeftDp = paramInt1;
    this.paddingTopDp = paramInt2;
    this.paddingRightDp = paramInt3;
    this.paddingBottomDp = paramInt4;
    this.titleContentSpaceDp = paramInt5;
    this.contentGravity = paramInt6;
  }
  
  public int getContentGravity()
  {
    return this.contentGravity;
  }
  
  public int getPaddingBottom()
  {
    return UiUtils.dpToPx(this.paddingBottomDp);
  }
  
  public int getPaddingLeft()
  {
    return UiUtils.dpToPx(this.paddingLeftDp);
  }
  
  public int getPaddingRight()
  {
    return UiUtils.dpToPx(this.paddingRightDp);
  }
  
  public int getPaddingTop()
  {
    return UiUtils.dpToPx(this.paddingTopDp);
  }
  
  public int getTitleContentSpace()
  {
    return UiUtils.dpToPx(this.titleContentSpaceDp);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/model/contentstyle/B2PDialogContentStyle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */