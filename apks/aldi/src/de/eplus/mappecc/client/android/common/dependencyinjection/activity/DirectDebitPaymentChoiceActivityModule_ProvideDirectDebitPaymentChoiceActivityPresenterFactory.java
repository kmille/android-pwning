package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.DirectDebitPaymentChoiceActivityPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.paymentchoice.IDirectDebitPaymentChoiceActivityView;
import javax.inject.Provider;

public final class DirectDebitPaymentChoiceActivityModule_ProvideDirectDebitPaymentChoiceActivityPresenterFactory
  implements Factory<DirectDebitPaymentChoiceActivityPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<IDirectDebitPaymentChoiceActivityView> directDebitPaymentChoiceActivityViewProvider;
  
  public DirectDebitPaymentChoiceActivityModule_ProvideDirectDebitPaymentChoiceActivityPresenterFactory(Provider<IDirectDebitPaymentChoiceActivityView> paramProvider, Provider<IB2pView> paramProvider1)
  {
    this.directDebitPaymentChoiceActivityViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
  }
  
  public static DirectDebitPaymentChoiceActivityModule_ProvideDirectDebitPaymentChoiceActivityPresenterFactory create(Provider<IDirectDebitPaymentChoiceActivityView> paramProvider, Provider<IB2pView> paramProvider1)
  {
    return new DirectDebitPaymentChoiceActivityModule_ProvideDirectDebitPaymentChoiceActivityPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static DirectDebitPaymentChoiceActivityPresenter provideInstance(Provider<IDirectDebitPaymentChoiceActivityView> paramProvider, Provider<IB2pView> paramProvider1)
  {
    return proxyProvideDirectDebitPaymentChoiceActivityPresenter((IDirectDebitPaymentChoiceActivityView)paramProvider.get(), (IB2pView)paramProvider1.get());
  }
  
  public static DirectDebitPaymentChoiceActivityPresenter proxyProvideDirectDebitPaymentChoiceActivityPresenter(IDirectDebitPaymentChoiceActivityView paramIDirectDebitPaymentChoiceActivityView, IB2pView paramIB2pView)
  {
    return (DirectDebitPaymentChoiceActivityPresenter)Preconditions.checkNotNull(DirectDebitPaymentChoiceActivityModule.provideDirectDebitPaymentChoiceActivityPresenter(paramIDirectDebitPaymentChoiceActivityView, paramIB2pView), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitPaymentChoiceActivityPresenter get()
  {
    return provideInstance(this.directDebitPaymentChoiceActivityViewProvider, this.b2pViewProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/DirectDebitPaymentChoiceActivityModule_ProvideDirectDebitPaymentChoiceActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */