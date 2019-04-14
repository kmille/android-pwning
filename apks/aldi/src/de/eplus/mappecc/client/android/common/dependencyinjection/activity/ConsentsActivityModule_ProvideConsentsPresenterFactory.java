package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IConsentRepository;
import de.eplus.mappecc.client.android.feature.customer.consents.ConsentsPresenter;
import de.eplus.mappecc.client.android.feature.customer.consents.IConsentsView;
import javax.inject.Provider;

public final class ConsentsActivityModule_ProvideConsentsPresenterFactory
  implements Factory<ConsentsPresenter>
{
  private final Provider<IConsentRepository> consentRepositoryProvider;
  private final Provider<IConsentsView> consentsViewProvider;
  private final Provider<Localizer> localizerProvider;
  
  public ConsentsActivityModule_ProvideConsentsPresenterFactory(Provider<IConsentsView> paramProvider, Provider<Localizer> paramProvider1, Provider<IConsentRepository> paramProvider2)
  {
    this.consentsViewProvider = paramProvider;
    this.localizerProvider = paramProvider1;
    this.consentRepositoryProvider = paramProvider2;
  }
  
  public static ConsentsActivityModule_ProvideConsentsPresenterFactory create(Provider<IConsentsView> paramProvider, Provider<Localizer> paramProvider1, Provider<IConsentRepository> paramProvider2)
  {
    return new ConsentsActivityModule_ProvideConsentsPresenterFactory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static ConsentsPresenter provideInstance(Provider<IConsentsView> paramProvider, Provider<Localizer> paramProvider1, Provider<IConsentRepository> paramProvider2)
  {
    return proxyProvideConsentsPresenter((IConsentsView)paramProvider.get(), (Localizer)paramProvider1.get(), (IConsentRepository)paramProvider2.get());
  }
  
  public static ConsentsPresenter proxyProvideConsentsPresenter(IConsentsView paramIConsentsView, Localizer paramLocalizer, IConsentRepository paramIConsentRepository)
  {
    return (ConsentsPresenter)Preconditions.checkNotNull(ConsentsActivityModule.provideConsentsPresenter(paramIConsentsView, paramLocalizer, paramIConsentRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ConsentsPresenter get()
  {
    return provideInstance(this.consentsViewProvider, this.localizerProvider, this.consentRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ConsentsActivityModule_ProvideConsentsPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */