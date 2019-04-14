package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.content;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import de.eplus.mappecc.client.android.common.component.textview.CustomTextView;
import de.eplus.mappecc.client.android.common.utils.TextViewUtils;

public class B2PDialogTitleMessageView
  extends LinearLayout
{
  private CustomTextView messageTextView;
  private CustomTextView titleTextView;
  
  public B2PDialogTitleMessageView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public B2PDialogTitleMessageView(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public B2PDialogTitleMessageView(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @RequiresApi(api=21)
  public B2PDialogTitleMessageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427429, this);
    this.titleTextView = ((CustomTextView)findViewById(2131231455));
    this.messageTextView = ((CustomTextView)findViewById(2131231366));
  }
  
  public void setMessage(@Nullable CharSequence paramCharSequence)
  {
    TextViewUtils.setTextWithHTMLLinks(this.messageTextView, paramCharSequence, 2131034284, getContext());
  }
  
  public void setMessageGravity(int paramInt)
  {
    this.messageTextView.setGravity(paramInt);
  }
  
  public void setTitle(@Nullable CharSequence paramCharSequence)
  {
    this.titleTextView.setText(paramCharSequence);
  }
  
  public void setTitleMessageSpace(int paramInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.titleTextView.getLayoutParams();
    localMarginLayoutParams.bottomMargin = paramInt;
    this.titleTextView.setLayoutParams(localMarginLayoutParams);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/view/content/B2PDialogTitleMessageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */