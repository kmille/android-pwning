package de.eplus.mappecc.client.android.common.component.bankdetail;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.a.a;
import butterknife.a.b;

public class BankDetailsView_ViewBinding
  implements Unbinder
{
  private BankDetailsView target;
  private View view2131231272;
  
  @UiThread
  public BankDetailsView_ViewBinding(BankDetailsView paramBankDetailsView)
  {
    this(paramBankDetailsView, paramBankDetailsView);
  }
  
  @UiThread
  public BankDetailsView_ViewBinding(final BankDetailsView paramBankDetailsView, View paramView)
  {
    this.target = paramBankDetailsView;
    paramBankDetailsView.customerNameText = ((TextView)b.b(paramView, 2131231273, "field 'customerNameText'", TextView.class));
    paramBankDetailsView.ibanBankNameText = ((TextView)b.b(paramView, 2131231274, "field 'ibanBankNameText'", TextView.class));
    paramView = b.a(paramView, 2131231272, "field 'changeBtn' and method 'onClickChangeButton'");
    paramBankDetailsView.changeBtn = ((TextView)b.c(paramView, 2131231272, "field 'changeBtn'", TextView.class));
    this.view2131231272 = paramView;
    paramView.setOnClickListener(new a()
    {
      public void doClick(View paramAnonymousView)
      {
        paramBankDetailsView.onClickChangeButton();
      }
    });
  }
  
  @CallSuper
  public void unbind()
  {
    BankDetailsView localBankDetailsView = this.target;
    if (localBankDetailsView != null)
    {
      this.target = null;
      localBankDetailsView.customerNameText = null;
      localBankDetailsView.ibanBankNameText = null;
      localBankDetailsView.changeBtn = null;
      this.view2131231272.setOnClickListener(null);
      this.view2131231272 = null;
      return;
    }
    throw new IllegalStateException("Bindings already cleared.");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bankdetail/BankDetailsView_ViewBinding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */