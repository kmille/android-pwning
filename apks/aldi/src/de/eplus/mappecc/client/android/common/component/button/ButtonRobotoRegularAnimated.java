package de.eplus.mappecc.client.android.common.component.button;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

public class ButtonRobotoRegularAnimated
  extends CustomButton
{
  public ButtonRobotoRegularAnimated(Context paramContext)
  {
    super(paramContext);
    setFont();
  }
  
  public ButtonRobotoRegularAnimated(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setFont();
  }
  
  public ButtonRobotoRegularAnimated(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    Context localContext;
    if (!paramBoolean)
    {
      setBackground(ContextCompat.getDrawable(getContext(), 2131165295));
      localContext = getContext();
    }
    for (int i = 2131034289;; i = 2131034317)
    {
      setTextColor(ContextCompat.getColor(localContext, i));
      return;
      setBackground(ContextCompat.getDrawable(getContext(), 2131165294));
      localContext = getContext();
    }
  }
  
  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    Object localObject = getBackground();
    if (!(localObject instanceof TransitionDrawable)) {
      return;
    }
    localObject = (TransitionDrawable)localObject;
    if (paramBoolean)
    {
      ((TransitionDrawable)localObject).startTransition(150);
      return;
    }
    ((TransitionDrawable)localObject).resetTransition();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/button/ButtonRobotoRegularAnimated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */