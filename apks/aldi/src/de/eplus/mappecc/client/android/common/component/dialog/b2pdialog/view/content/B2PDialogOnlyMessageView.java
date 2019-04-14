package de.eplus.mappecc.client.android.common.component.dialog.b2pdialog.view.content;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ScrollView;
import de.eplus.mappecc.client.android.common.component.textview.CustomTextView;
import de.eplus.mappecc.client.android.common.utils.TextViewUtils;

public class B2PDialogOnlyMessageView
  extends ScrollView
{
  private CustomTextView messageTextView;
  
  public B2PDialogOnlyMessageView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public B2PDialogOnlyMessageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public B2PDialogOnlyMessageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  @RequiresApi(api=21)
  public B2PDialogOnlyMessageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), 2131427428, this);
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
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/dialog/b2pdialog/view/content/B2PDialogOnlyMessageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */