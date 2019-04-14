package de.eplus.mappecc.client.android.common.component.legalpill;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.dependencyinjection.application.AppComponent;
import de.eplus.mappecc.client.android.common.utils.TextViewUtils;

public class LegalPilleView
  extends ConstraintLayout
{
  private TextView legalTextView;
  
  public LegalPilleView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public LegalPilleView(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public LegalPilleView(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    inflate(paramContext, 2131427455, this);
    B2PApplication.component.inject(this);
    this.legalTextView = ((TextView)findViewById(2131231358));
    setBackgroundResource(2131165482);
  }
  
  public void setText(Spanned paramSpanned)
  {
    TextViewUtils.setTextWithHTMLLinks(this.legalTextView, paramSpanned, 2131034289, getContext());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/legalpill/LegalPilleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */