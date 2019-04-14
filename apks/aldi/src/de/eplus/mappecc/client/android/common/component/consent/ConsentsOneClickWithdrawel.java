package de.eplus.mappecc.client.android.common.component.consent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import de.eplus.mappecc.client.android.common.component.textview.CustomTextView;

public class ConsentsOneClickWithdrawel
  extends LinearLayout
{
  private CheckBox checkBox;
  private CustomTextView lastSubmittedTextView;
  private CustomTextView textTextView;
  
  public ConsentsOneClickWithdrawel(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public ConsentsOneClickWithdrawel(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public ConsentsOneClickWithdrawel(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @RequiresApi(api=21)
  public ConsentsOneClickWithdrawel(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427439, this);
    this.checkBox = ((CheckBox)findViewById(2131230818));
    this.textTextView = ((CustomTextView)findViewById(2131230865));
    this.lastSubmittedTextView = ((CustomTextView)findViewById(2131230858));
  }
  
  public CheckBox getCheckbox()
  {
    return this.checkBox;
  }
  
  public boolean isChecked()
  {
    return this.checkBox.isChecked();
  }
  
  public void setCheckBoxListener(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    this.checkBox.setOnCheckedChangeListener(paramOnCheckedChangeListener);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.checkBox.setChecked(paramBoolean);
  }
  
  public void setConsentGroupId(String paramString)
  {
    this.checkBox.setTag(paramString);
    this.checkBox.setContentDescription(paramString);
  }
  
  public void setLastSubmitted(String paramString)
  {
    this.lastSubmittedTextView.setText(paramString);
  }
  
  public void setText(Spannable paramSpannable)
  {
    this.textTextView.setText(paramSpannable);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/consent/ConsentsOneClickWithdrawel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */