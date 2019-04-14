package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IBalanceModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ILoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPacksRepository;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceFragment;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceFragmentPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.IDirectDebitPaymentChoiceFragmentView;

@Module
public abstract class DirectDebitPaymentChoiceFragmentModule
{
  @Provides
  static DirectDebitPaymentChoiceFragmentPresenter provideDirectDebitPaymentChoiceFragmentPresenter(@NonNull Localizer paramLocalizer, @NonNull ICustomerModelRepository paramICustomerModelRepository, @NonNull IBalanceModelRepository paramIBalanceModelRepository, @NonNull IPacksRepository paramIPacksRepository, @NonNull ILoginAccountModelRepository paramILoginAccountModelRepository)
  {
    return new DirectDebitPaymentChoiceFragmentPresenter(paramLocalizer, paramICustomerModelRepository, paramIBalanceModelRepository, paramIPacksRepository, paramILoginAccountModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract DirectDebitPaymentChoiceFragment directDebitPaymentChoiceFragmentInjector();
  
  @Binds
  public abstract IDirectDebitPaymentChoiceFragmentView view(DirectDebitPaymentChoiceFragment paramDirectDebitPaymentChoiceFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/DirectDebitPaymentChoiceFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */