package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.accounts.Box7AccountsManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.bank.BankUtils;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitFragment;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.IDirectDebitView;

@Module
public abstract class DirectDebitFragmentModule
{
  @Provides
  static DirectDebitFragmentPresenter provideDirectDebitFragmentPresenter(@NonNull Localizer paramLocalizer, @NonNull IB2pView paramIB2pView, @NonNull Box7AccountsManager paramBox7AccountsManager, @NonNull HotlineUtils paramHotlineUtils, @NonNull BankUtils paramBankUtils, @NonNull ICustomerModelRepository paramICustomerModelRepository)
  {
    return new DirectDebitFragmentPresenter(paramLocalizer, paramIB2pView, paramBox7AccountsManager, paramHotlineUtils, paramBankUtils, paramICustomerModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract DirectDebitFragment directDebitFragmentInjector();
  
  @Binds
  public abstract IDirectDebitView view(DirectDebitFragment paramDirectDebitFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */