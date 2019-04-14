package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button.B2PDialogButtonCallback;

public class B2PDialogButtonConfig
{
  private B2PDialogButtonCallback b2PDialogButtonCallback;
  @DrawableRes
  private int backgroundStyleId = 0;
  private String text;
  @ColorRes
  private int textColorId = 0;
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof B2PDialogButtonConfig;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof B2PDialogButtonConfig)) {
      return false;
    }
    paramObject = (B2PDialogButtonConfig)paramObject;
    if (!((B2PDialogButtonConfig)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject1 = getText();
    Object localObject2 = ((B2PDialogButtonConfig)paramObject).getText();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getB2PDialogButtonCallback();
    localObject2 = ((B2PDialogButtonConfig)paramObject).getB2PDialogButtonCallback();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    if (getTextColorId() != ((B2PDialogButtonConfig)paramObject).getTextColorId()) {
      return false;
    }
    return getBackgroundStyleId() == ((B2PDialogButtonConfig)paramObject).getBackgroundStyleId();
  }
  
  public B2PDialogButtonCallback getB2PDialogButtonCallback()
  {
    return this.b2PDialogButtonCallback;
  }
  
  public int getBackgroundStyleId()
  {
    return this.backgroundStyleId;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public int getTextColorId()
  {
    return this.textColorId;
  }
  
  public int hashCode()
  {
    Object localObject = getText();
    int j = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    localObject = getB2PDialogButtonCallback();
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return (((i + 59) * 59 + j) * 59 + getTextColorId()) * 59 + getBackgroundStyleId();
  }
  
  public void setB2PDialogButtonCallback(B2PDialogButtonCallback paramB2PDialogButtonCallback)
  {
    this.b2PDialogButtonCallback = paramB2PDialogButtonCallback;
  }
  
  public void setBackgroundStyleId(int paramInt)
  {
    this.backgroundStyleId = paramInt;
  }
  
  public void setText(String paramString)
  {
    this.text = paramString;
  }
  
  public void setTextColorId(int paramInt)
  {
    this.textColorId = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("B2PDialogButtonConfig(text=");
    localStringBuilder.append(getText());
    localStringBuilder.append(", b2PDialogButtonCallback=");
    localStringBuilder.append(getB2PDialogButtonCallback());
    localStringBuilder.append(", textColorId=");
    localStringBuilder.append(getTextColorId());
    localStringBuilder.append(", backgroundStyleId=");
    localStringBuilder.append(getBackgroundStyleId());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/model/B2PDialogButtonConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */