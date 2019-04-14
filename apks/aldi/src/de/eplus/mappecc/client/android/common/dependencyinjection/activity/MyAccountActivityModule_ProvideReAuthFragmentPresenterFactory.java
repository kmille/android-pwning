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
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.feature.reauth.ReAuthFragmentPresenter;
import javax.inject.Provider;

public final class MyAccountActivityModule_ProvideReAuthFragmentPresenterFactory
  implements Factory<ReAuthFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7CustomerManager> box7CustomerManagerProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<IBrandTariffTypePropertyModelRepository> brandTariffTypePropertyModelRepositoryProvider;
  private final Provider<ErrorUtils> errorUtilsProvider;
  private final Provider<IHigherLoginManager> higherLoginManagerProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<ILoginAccountModelRepository> loginAccountModelRepositoryProvider;
  private final Provider<LoginPreferences> loginPreferencesProvider;
  private final Provider<NetworkUtils> networkUtilsProvider;
  private final Provider<ISubscriptionsAuthorizedRepository> subscriptionsAuthorizedRepositoryProvider;
  
  public MyAccountActivityModule_ProvideReAuthFragmentPresenterFactory(Provider<IB2pView> paramProvider, Provider<IHigherLoginManager> paramProvider1, Provider<ErrorUtils> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<LoginPreferences> paramProvider4, Provider<Box7CustomerManager> paramProvider5, Provider<Box7SubscriptionManager> paramProvider6, Provider<ISubscriptionsAuthorizedRepository> paramProvider7, Provider<IBrandTariffTypePropertyModelRepository> paramProvider8, Provider<NetworkUtils> paramProvider9, Provider<ILoginAccountModelRepository> paramProvider10)
  {
    this.b2pViewProvider = paramProvider;
    this.higherLoginManagerProvider = paramProvider1;
    this.errorUtilsProvider = paramProvider2;
    this.hotlineUtilsProvider = paramProvider3;
    this.loginPreferencesProvider = paramProvider4;
    this.box7CustomerManagerProvider = paramProvider5;
    this.box7SubscriptionManagerProvider = paramProvider6;
    this.subscriptionsAuthorizedRepositoryProvider = paramProvider7;
    this.brandTariffTypePropertyModelRepositoryProvider = paramProvider8;
    this.networkUtilsProvider = paramProvider9;
    this.loginAccountModelRepositoryProvider = paramProvider10;
  }
  
  public static MyAccountActivityModule_ProvideReAuthFragmentPresenterFactory create(Provider<IB2pView> paramProvider, Provider<IHigherLoginManager> paramProvider1, Provider<ErrorUtils> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<LoginPreferences> paramProvider4, Provider<Box7CustomerManager> paramProvider5, Provider<Box7SubscriptionManager> paramProvider6, Provider<ISubscriptionsAuthorizedRepository> paramProvider7, Provider<IBrandTariffTypePropertyModelRepository> paramProvider8, Provider<NetworkUtils> paramProvider9, Provider<ILoginAccountModelRepository> paramProvider10)
  {
    return new MyAccountActivityModule_ProvideReAuthFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10);
  }
  
  public static ReAuthFragmentPresenter provideInstance(Provider<IB2pView> paramProvider, Provider<IHigherLoginManager> paramProvider1, Provider<ErrorUtils> paramProvider2, Provider<HotlineUtils> paramProvider3, Provider<LoginPreferences> paramProvider4, Provider<Box7CustomerManager> paramProvider5, Provider<Box7SubscriptionManager> paramProvider6, Provider<ISubscriptionsAuthorizedRepository> paramProvider7, Provider<IBrandTariffTypePropertyModelRepository> paramProvider8, Provider<NetworkUtils> paramProvider9, Provider<ILoginAccountModelRepository> paramProvider10)
  {
    return proxyProvideReAuthFragmentPresenter((IB2pView)paramProvider.get(), (IHigherLoginManager)paramProvider1.get(), (ErrorUtils)paramProvider2.get(), (HotlineUtils)paramProvider3.get(), (LoginPreferences)paramProvider4.get(), (Box7CustomerManager)paramProvider5.get(), (Box7SubscriptionManager)paramProvider6.get(), (ISubscriptionsAuthorizedRepository)paramProvider7.get(), (IBrandTariffTypePropertyModelRepository)paramProvider8.get(), (NetworkUtils)paramProvider9.get(), (ILoginAccountModelRepository)paramProvider10.get());
  }
  
  public static ReAuthFragmentPresenter proxyProvideReAuthFragmentPresenter(IB2pView paramIB2pView, IHigherLoginManager paramIHigherLoginManager, ErrorUtils paramErrorUtils, HotlineUtils paramHotlineUtils, LoginPreferences paramLoginPreferences, Box7CustomerManager paramBox7CustomerManager, Box7SubscriptionManager paramBox7SubscriptionManager, ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, IBrandTariffTypePropertyModelRepository paramIBrandTariffTypePropertyModelRepository, NetworkUtils paramNetworkUtils, ILoginAccountModelRepository paramILoginAccountModelRepository)
  {
    return (ReAuthFragmentPresenter)Preconditions.checkNotNull(MyAccountActivityModule.provideReAuthFragmentPresenter(paramIB2pView, paramIHigherLoginManager, paramErrorUtils, paramHotlineUtils, paramLoginPreferences, paramBox7CustomerManager, paramBox7SubscriptionManager, paramISubscriptionsAuthorizedRepository, paramIBrandTariffTypePropertyModelRepository, paramNetworkUtils, paramILoginAccountModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ReAuthFragmentPresenter get()
  {
    return provideInstance(this.b2pViewProvider, this.higherLoginManagerProvider, this.errorUtilsProvider, this.hotlineUtilsProvider, this.loginPreferencesProvider, this.box7CustomerManagerProvider, this.box7SubscriptionManagerProvider, this.subscriptionsAuthorizedRepositoryProvider, this.brandTariffTypePropertyModelRepositoryProvider, this.networkUtilsProvider, this.loginAccountModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/MyAccountActivityModule_ProvideReAuthFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */