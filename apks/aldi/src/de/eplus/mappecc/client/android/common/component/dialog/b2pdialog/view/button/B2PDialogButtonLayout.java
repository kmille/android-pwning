package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.button;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import de.eplus.mappecc.client.android.common.component.button.ButtonRobotoRegularAnimated;
import de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.model.B2PDialogButtonConfig;

public class B2PDialogButtonLayout
  extends LinearLayout
{
  public B2PDialogButtonLayout(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public B2PDialogButtonLayout(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public B2PDialogButtonLayout(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @TargetApi(21)
  public B2PDialogButtonLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427427, this);
    setOrientation(0);
  }
  
  @SuppressLint({"ResourceType"})
  private void prepareSpecialBackgroundStyleIdIfNecessary(@NonNull ButtonRobotoRegularAnimated paramButtonRobotoRegularAnimated, @DrawableRes int paramInt)
  {
    if (paramInt > 0) {
      paramButtonRobotoRegularAnimated.setBackgroundResource(paramInt);
    }
  }
  
  @SuppressLint({"ResourceType"})
  private void prepareSpecialTextColorIfNecessary(@NonNull ButtonRobotoRegularAnimated paramButtonRobotoRegularAnimated, @ColorRes int paramInt)
  {
    if (paramInt > 0) {
      paramButtonRobotoRegularAnimated.setTextColor(getContext().getResources().getColor(paramInt));
    }
  }
  
  public void addButton(int paramInt1, @NonNull B2PDialogButtonConfig paramB2PDialogButtonConfig, @StyleRes int paramInt2)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2);
    localLayoutParams.weight = 1.0F;
    ButtonRobotoRegularAnimated localButtonRobotoRegularAnimated = new ButtonRobotoRegularAnimated(new ContextThemeWrapper(getContext(), paramInt2), null, 0);
    localButtonRobotoRegularAnimated.setId(paramInt1);
    localButtonRobotoRegularAnimated.setLayoutParams(localLayoutParams);
    localButtonRobotoRegularAnimated.setText(paramB2PDialogButtonConfig.getText());
    localButtonRobotoRegularAnimated.setOnClickListener(new -..Lambda.B2PDialogButtonLayout.GI6tZrOerWQOFekaccG-9nxgrtY(paramB2PDialogButtonConfig));
    prepareSpecialTextColorIfNecessary(localButtonRobotoRegularAnimated, paramB2PDialogButtonConfig.getTextColorId());
    prepareSpecialBackgroundStyleIdIfNecessary(localButtonRobotoRegularAnimated, paramB2PDialogButtonConfig.getBackgroundStyleId());
    addView(localButtonRobotoRegularAnimated);
  }
  
  public void removeAllButtons()
  {
    removeAllViews();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/view/button/B2PDialogButtonLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */