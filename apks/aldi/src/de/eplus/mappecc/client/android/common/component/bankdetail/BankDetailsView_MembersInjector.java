package de.eplus.mappecc.client.android.common.component.bankdetail;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import javax.inject.Provider;

public final class BankDetailsView_MembersInjector
  implements MembersInjector<BankDetailsView>
{
  private final Provider<Localizer> localizerProvider;
  
  public BankDetailsView_MembersInjector(Provider<Localizer> paramProvider)
  {
    this.localizerProvider = paramProvider;
  }
  
  public static MembersInjector<BankDetailsView> create(Provider<Localizer> paramProvider)
  {
    return new BankDetailsView_MembersInjector(paramProvider);
  }
  
  public static void injectLocalizer(BankDetailsView paramBankDetailsView, Localizer paramLocalizer)
  {
    paramBankDetailsView.localizer = paramLocalizer;
  }
  
  public final void injectMembers(BankDetailsView paramBankDetailsView)
  {
    injectLocalizer(paramBankDetailsView, (Localizer)this.localizerProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/component/bankdetail/BankDetailsView_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */