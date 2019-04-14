package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PerFragment;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragment;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivity;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivityPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.IDirectDebitPaymentChoiceActivityView;
import de.eplus.mappecc.client.android.feature.reauth.ReAuthFragment;

@Module
public abstract class DirectDebitPaymentChoiceActivityModule
{
  @Provides
  static DirectDebitPaymentChoiceActivityPresenter provideDirectDebitPaymentChoiceActivityPresenter(IDirectDebitPaymentChoiceActivityView paramIDirectDebitPaymentChoiceActivityView, IB2pView paramIB2pView)
  {
    return new DirectDebitPaymentChoiceActivityPresenter(paramIDirectDebitPaymentChoiceActivityView, paramIB2pView);
  }
  
  @Binds
  public abstract IB2pView b2pView(DirectDebitPaymentChoiceActivity paramDirectDebitPaymentChoiceActivity);
  
  @Binds
  public abstract IDirectDebitPaymentChoiceActivityView directDebitPaymentChoiceActivityView(DirectDebitPaymentChoiceActivity paramDirectDebitPaymentChoiceActivity);
  
  @PerFragment
  @ContributesAndroidInjector
  abstract NotRegisteredFragment notRegisteredFragmentInjector();
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ReAuthFragment reAuthFragmentInjector();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/DirectDebitPaymentChoiceActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */