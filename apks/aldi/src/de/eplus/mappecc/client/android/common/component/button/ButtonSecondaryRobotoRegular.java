package de.eplus.mappecc.client.android.common.component.button;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

public class ButtonSecondaryRobotoRegular
  extends CustomButton
{
  public ButtonSecondaryRobotoRegular(Context paramContext)
  {
    super(paramContext);
    setFont();
  }
  
  public ButtonSecondaryRobotoRegular(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setFont();
  }
  
  public ButtonSecondaryRobotoRegular(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFont();
  }
  
  private void setFont()
  {
    setTypeface(Typeface.create("sans-serif-regular", 0));
    if (Build.VERSION.SDK_INT >= 21) {
      setLetterSpacing(0.02F);
    }
  }
  
  public void setActive(boolean paramBoolean)
  {
    setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      setBackground(ContextCompat.getDrawable(getContext(), 2131165323));
      setTextColor(ContextCompat.getColor(getContext(), 2131034281));
      return;
    }
    setBackground(ContextCompat.getDrawable(getContext(), 2131165317));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/button/ButtonSecondaryRobotoRegular.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */