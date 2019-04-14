package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.repository.implementation.IBrandTariffTypePropertyModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ILoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.feature.reauth.ReAuthFragmentPresenter;
import javax.inject.Provider;

public final class AccountOverviewActivityModule_ProvideReAuthFragmentPresenterFactory
  implements Factory<ReAuthFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7CustomerManager> box7CustomerManagerProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<IBrandTariffTypePropertyModelRepository> brandTariffTypePropertyModelRepositoryProvider;
  private final Provider<ErrorUtils> errorUtilsProvider;
  private final Provider<IHigherLoginManager> higherLoginManagerProvider;
  private final Provider<ILoginAccountModelRepository> loginAccountModelRepositoryProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<NetworkUtils> networkUtilsProvider;
  private final Provider<ISubscriptionsAuthorizedRepository> subscriptionsAuthorizedRepositoryProvider;
  
  public AccountOverviewActivityModule_ProvideReAuthFragmentPresenterFactory(Provider<IB2pView> paramProvider, Provider<IHigherLoginManager> paramProvider1, Provider<ErrorUtils> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<Box7CustomerManager> paramProvider4, Provider<Box7SubscriptionManager> paramProvider5, Provider<ISubscriptionsAuthorizedRepository> paramProvider6, Provider<IBrandTariffTypePropertyModelRepository> paramProvider7, Provider<NetworkUtils> paramProvider8, Provider<ILoginAccountModelRepository> paramProvider9)
  {
    this.b2pViewProvider = paramProvider;
    this.higherLoginManagerProvider = paramProvider1;
    this.errorUtilsProvider = paramProvider2;
    this.loginPreferencesProvider = paramProvider3;
    this.box7CustomerManagerProvider = paramProvider4;
    this.box7SubscriptionManagerProvider = paramProvider5;
    this.subscriptionsAuthorizedRepositoryProvider = paramProvider6;
    this.brandTariffTypePropertyModelRepositoryProvider = paramProvider7;
    this.networkUtilsProvider = paramProvider8;
    this.loginAccountModelRepositoryProvider = paramProvider9;
  }
  
  public static AccountOverviewActivityModule_ProvideReAuthFragmentPresenterFactory create(Provider<IB2pView> paramProvider, Provider<IHigherLoginManager> paramProvider1, Provider<ErrorUtils> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<Box7CustomerManager> paramProvider4, Provider<Box7SubscriptionManager> paramProvider5, Provider<ISubscriptionsAuthorizedRepository> paramProvider6, Provider<IBrandTariffTypePropertyModelRepository> paramProvider7, Provider<NetworkUtils> paramProvider8, Provider<ILoginAccountModelRepository> paramProvider9)
  {
    return new AccountOverviewActivityModule_ProvideReAuthFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9);
  }
  
  public static ReAuthFragmentPresenter provideInstance(Provider<IB2pView> paramProvider, Provider<IHigherLoginManager> paramProvider1, Provider<ErrorUtils> paramProvider2, Provider<LoginPreferences> paramProvider3, Provider<Box7CustomerManager> paramProvider4, Provider<Box7SubscriptionManager> paramProvider5, Provider<ISubscriptionsAuthorizedRepository> paramProvider6, Provider<IBrandTariffTypePropertyModelRepository> paramProvider7, Provider<NetworkUtils> paramProvider8, Provider<ILoginAccountModelRepository> paramProvider9)
  {
    return proxyProvideReAuthFragmentPresenter((IB2pView)paramProvider.get(), (IHigherLoginManager)paramProvider1.get(), (ErrorUtils)paramProvider2.get(), (LoginPreferences)paramProvider3.get(), (Box7CustomerManager)paramProvider4.get(), (Box7SubscriptionManager)paramProvider5.get(), (ISubscriptionsAuthorizedRepository)paramProvider6.get(), (IBrandTariffTypePropertyModelRepository)paramProvider7.get(), (NetworkUtils)paramProvider8.get(), (ILoginAccountModelRepository)paramProvider9.get());
  }
  
  public static ReAuthFragmentPresenter proxyProvideReAuthFragmentPresenter(IB2pView paramIB2pView, IHigherLoginManager paramIHigherLoginManager, ErrorUtils paramErrorUtils, LoginPreferences paramLoginPreferences, Box7CustomerManager paramBox7CustomerManager, Box7SubscriptionManager paramBox7SubscriptionManager, ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, IBrandTariffTypePropertyModelRepository paramIBrandTariffTypePropertyModelRepository, NetworkUtils paramNetworkUtils, ILoginAccountModelRepository paramILoginAccountModelRepository)
  {
    return (ReAuthFragmentPresenter)Preconditions.checkNotNull(AccountOverviewActivityModule.provideReAuthFragmentPresenter(paramIB2pView, paramIHigherLoginManager, paramErrorUtils, paramLoginPreferences, paramBox7CustomerManager, paramBox7SubscriptionManager, paramISubscriptionsAuthorizedRepository, paramIBrandTariffTypePropertyModelRepository, paramNetworkUtils, paramILoginAccountModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ReAuthFragmentPresenter get()
  {
    return provideInstance(this.b2pViewProvider, this.higherLoginManagerProvider, this.errorUtilsProvider, this.loginPreferencesProvider, this.box7CustomerManagerProvider, this.box7SubscriptionManagerProvider, this.subscriptionsAuthorizedRepositoryProvider, this.brandTariffTypePropertyModelRepositoryProvider, this.networkUtilsProvider, this.loginAccountModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/AccountOverviewActivityModule_ProvideReAuthFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */