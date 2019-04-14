package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.performance.IPerformanceTimingManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.MoeUpdateManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IBrandTariffTypePropertyModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidMyTariffPageModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.utils.BrandUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.feature.homescreen.HomeScreenPresenter;
import de.eplus.mappecc.client.android.feature.homescreen.IHomeScreenView;
import javax.inject.Provider;

public final class HomeScreenActivityModule_ProvideHomeScreenPresenterFactory
  implements Factory<HomeScreenPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<IBrandTariffTypePropertyModelRepository> brandTariffTypePropertyModelRepositoryProvider;
  private final Provider<BrandUtils> brandUtilsProvider;
  private final Provider<MainThreadBus> busProvider;
  private final Provider<IHomeScreenView> homeScreenViewProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<MoeUpdateManager> moeUpdateManagerProvider;
  private final Provider<IPerformanceTimingManager> performanceTimingManagerProvider;
  private final Provider<IPrepaidMyTariffPageModelRepository> prepaidMyTariffPageModelRepositoryProvider;
  private final Provider<ISubscriptionsAuthorizedRepository> subscriptionsAuthorizedRepositoryProvider;
  private final Provider<TimeoutPreferences> timeOutPreferencesProvider;
  
  public HomeScreenActivityModule_ProvideHomeScreenPresenterFactory(Provider<IHomeScreenView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7SubscriptionManager> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<MoeUpdateManager> paramProvider4, Provider<TimeoutPreferences> paramProvider5, Provider<Localizer> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<BrandUtils> paramProvider8, Provider<IBrandTariffTypePropertyModelRepository> paramProvider9, Provider<ISubscriptionsAuthorizedRepository> paramProvider10, Provider<IPrepaidMyTariffPageModelRepository> paramProvider11)
  {
    this.homeScreenViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.box7SubscriptionManagerProvider = paramProvider2;
    this.performanceTimingManagerProvider = paramProvider3;
    this.moeUpdateManagerProvider = paramProvider4;
    this.timeOutPreferencesProvider = paramProvider5;
    this.localizerProvider = paramProvider6;
    this.busProvider = paramProvider7;
    this.brandUtilsProvider = paramProvider8;
    this.brandTariffTypePropertyModelRepositoryProvider = paramProvider9;
    this.subscriptionsAuthorizedRepositoryProvider = paramProvider10;
    this.prepaidMyTariffPageModelRepositoryProvider = paramProvider11;
  }
  
  public static HomeScreenActivityModule_ProvideHomeScreenPresenterFactory create(Provider<IHomeScreenView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7SubscriptionManager> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<MoeUpdateManager> paramProvider4, Provider<TimeoutPreferences> paramProvider5, Provider<Localizer> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<BrandUtils> paramProvider8, Provider<IBrandTariffTypePropertyModelRepository> paramProvider9, Provider<ISubscriptionsAuthorizedRepository> paramProvider10, Provider<IPrepaidMyTariffPageModelRepository> paramProvider11)
  {
    return new HomeScreenActivityModule_ProvideHomeScreenPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10, paramProvider11);
  }
  
  public static HomeScreenPresenter provideInstance(Provider<IHomeScreenView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7SubscriptionManager> paramProvider2, Provider<IPerformanceTimingManager> paramProvider3, Provider<MoeUpdateManager> paramProvider4, Provider<TimeoutPreferences> paramProvider5, Provider<Localizer> paramProvider6, Provider<MainThreadBus> paramProvider7, Provider<BrandUtils> paramProvider8, Provider<IBrandTariffTypePropertyModelRepository> paramProvider9, Provider<ISubscriptionsAuthorizedRepository> paramProvider10, Provider<IPrepaidMyTariffPageModelRepository> paramProvider11)
  {
    return proxyProvideHomeScreenPresenter((IHomeScreenView)paramProvider.get(), (IB2pView)paramProvider1.get(), (Box7SubscriptionManager)paramProvider2.get(), (IPerformanceTimingManager)paramProvider3.get(), (MoeUpdateManager)paramProvider4.get(), (TimeoutPreferences)paramProvider5.get(), (Localizer)paramProvider6.get(), (MainThreadBus)paramProvider7.get(), (BrandUtils)paramProvider8.get(), (IBrandTariffTypePropertyModelRepository)paramProvider9.get(), (ISubscriptionsAuthorizedRepository)paramProvider10.get(), (IPrepaidMyTariffPageModelRepository)paramProvider11.get());
  }
  
  public static HomeScreenPresenter proxyProvideHomeScreenPresenter(IHomeScreenView paramIHomeScreenView, IB2pView paramIB2pView, Box7SubscriptionManager paramBox7SubscriptionManager, IPerformanceTimingManager paramIPerformanceTimingManager, MoeUpdateManager paramMoeUpdateManager, TimeoutPreferences paramTimeoutPreferences, Localizer paramLocalizer, MainThreadBus paramMainThreadBus, BrandUtils paramBrandUtils, IBrandTariffTypePropertyModelRepository paramIBrandTariffTypePropertyModelRepository, ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, IPrepaidMyTariffPageModelRepository paramIPrepaidMyTariffPageModelRepository)
  {
    return (HomeScreenPresenter)Preconditions.checkNotNull(HomeScreenActivityModule.provideHomeScreenPresenter(paramIHomeScreenView, paramIB2pView, paramBox7SubscriptionManager, paramIPerformanceTimingManager, paramMoeUpdateManager, paramTimeoutPreferences, paramLocalizer, paramMainThreadBus, paramBrandUtils, paramIBrandTariffTypePropertyModelRepository, paramISubscriptionsAuthorizedRepository, paramIPrepaidMyTariffPageModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final HomeScreenPresenter get()
  {
    return provideInstance(this.homeScreenViewProvider, this.b2pViewProvider, this.box7SubscriptionManagerProvider, this.performanceTimingManagerProvider, this.moeUpdateManagerProvider, this.timeOutPreferencesProvider, this.localizerProvider, this.busProvider, this.brandUtilsProvider, this.brandTariffTypePropertyModelRepositoryProvider, this.subscriptionsAuthorizedRepositoryProvider, this.prepaidMyTariffPageModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/HomeScreenActivityModule_ProvideHomeScreenPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */