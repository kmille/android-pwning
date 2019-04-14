package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.accounts.Box7AccountsManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.bank.BankUtils;
import de.eplus.mappecc.client.android.feature.directdebit.confirmation.DirectDebitConfirmationFragment;
import de.eplus.mappecc.client.android.feature.directdebit.confirmation.DirectDebitConfirmationFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.confirmation.IDirectDebitConfirmationView;

@Module
public abstract class DirectDebitConfirmationFragmentModule
{
  @Provides
  static DirectDebitConfirmationFragmentPresenter provideDirectDebitConfirmationFragmentPresenter(Localizer paramLocalizer, IB2pView paramIB2pView, TrackingHelper paramTrackingHelper, Box7AccountsManager paramBox7AccountsManager, BankUtils paramBankUtils, IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository)
  {
    return new DirectDebitConfirmationFragmentPresenter(paramLocalizer, paramIB2pView, paramTrackingHelper, paramBox7AccountsManager, paramBankUtils, paramIPrepaidTopupConfigurationModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract DirectDebitConfirmationFragment directDebitConfirmationFragmentInjector();
  
  @Binds
  public abstract IDirectDebitConfirmationView view(DirectDebitConfirmationFragment paramDirectDebitConfirmationFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitConfirmationFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */