package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.DirectDebitActivityPresenter;
import de.eplus.mappecc.client.android.feature.directdebit.bankaccountchange.IDirectDebitActivityView;
import javax.inject.Provider;

public final class DirectDebitActivityModule_ProvideDirectDebitActivityPresenterFactory
  implements Factory<DirectDebitActivityPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<IDirectDebitActivityView> directDebitActivityViewProvider;
  
  public DirectDebitActivityModule_ProvideDirectDebitActivityPresenterFactory(Provider<IDirectDebitActivityView> paramProvider, Provider<IB2pView> paramProvider1)
  {
    this.directDebitActivityViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
  }
  
  public static DirectDebitActivityModule_ProvideDirectDebitActivityPresenterFactory create(Provider<IDirectDebitActivityView> paramProvider, Provider<IB2pView> paramProvider1)
  {
    return new DirectDebitActivityModule_ProvideDirectDebitActivityPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static DirectDebitActivityPresenter provideInstance(Provider<IDirectDebitActivityView> paramProvider, Provider<IB2pView> paramProvider1)
  {
    return proxyProvideDirectDebitActivityPresenter((IDirectDebitActivityView)paramProvider.get(), (IB2pView)paramProvider1.get());
  }
  
  public static DirectDebitActivityPresenter proxyProvideDirectDebitActivityPresenter(IDirectDebitActivityView paramIDirectDebitActivityView, IB2pView paramIB2pView)
  {
    return (DirectDebitActivityPresenter)Preconditions.checkNotNull(DirectDebitActivityModule.provideDirectDebitActivityPresenter(paramIDirectDebitActivityView, paramIB2pView), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DirectDebitActivityPresenter get()
  {
    return provideInstance(this.directDebitActivityViewProvider, this.b2pViewProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/DirectDebitActivityModule_ProvideDirectDebitActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */