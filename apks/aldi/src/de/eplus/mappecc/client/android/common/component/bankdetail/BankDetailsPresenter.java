package de.eplus.mappecc.client.android.common.component.bankdetail;

import c.a.a;
import de.eplus.mappecc.client.android.common.base.IPresenter;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;

public class BankDetailsPresenter
  implements IPresenter
{
  private IBankDetailsView bankDetailsView;
  private Localizer localizer;
  
  public BankDetailsPresenter(IBankDetailsView paramIBankDetailsView, Localizer paramLocalizer)
  {
    this.bankDetailsView = paramIBankDetailsView;
    this.localizer = paramLocalizer;
  }
  
  public void apply(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    this.bankDetailsView.setCustomerName(paramString1);
    if ((paramString2 != null) && (paramString3 != null)) {
      this.bankDetailsView.setIbanBankName(paramString2, paramString3);
    } else {
      this.bankDetailsView.setIbanBankNameVisibility(false);
    }
    this.bankDetailsView.setButtonVisibility(paramBoolean);
    this.bankDetailsView.setChangeBtnText(this.localizer.getString(2131690136));
  }
  
  public void onClickChangeButton()
  {
    a.b("entered...", new Object[0]);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bankdetail/BankDetailsPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */