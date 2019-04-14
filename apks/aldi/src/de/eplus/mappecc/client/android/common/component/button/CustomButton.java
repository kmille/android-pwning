package de.eplus.mappecc.client.android.common.component.button;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Inject;

public class CustomButton
  extends AppCompatButton
{
  @Inject
  Localizer localizer;
  
  public CustomButton(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public CustomButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public CustomButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    B2PApplication.component.inject(this);
  }
  
  public void setOnClickListener(@Nullable final View.OnClickListener paramOnClickListener)
  {
    if (paramOnClickListener != null)
    {
      super.setOnClickListener(new OnSingleClickListener()
      {
        public void onSingleClick(View paramAnonymousView)
        {
          paramOnClickListener.onClick(paramAnonymousView);
        }
      });
      return;
    }
    super.setOnClickListener(null);
  }
  
  public void setTextFromMoe(@StringRes int paramInt)
  {
    setText(this.localizer.getString(paramInt));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/button/CustomButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */