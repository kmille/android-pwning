package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
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
import de.eplus.mappecc.client.android.feature.homescreen.HomeScreenActivity;
import de.eplus.mappecc.client.android.feature.homescreen.HomeScreenPresenter;
import de.eplus.mappecc.client.android.feature.homescreen.IHomeScreenView;

@Module
public abstract class HomeScreenActivityModule
{
  @Provides
  static HomeScreenPresenter provideHomeScreenPresenter(IHomeScreenView paramIHomeScreenView, IB2pView paramIB2pView, Box7SubscriptionManager paramBox7SubscriptionManager, IPerformanceTimingManager paramIPerformanceTimingManager, MoeUpdateManager paramMoeUpdateManager, TimeoutPreferences paramTimeoutPreferences, Localizer paramLocalizer, MainThreadBus paramMainThreadBus, BrandUtils paramBrandUtils, IBrandTariffTypePropertyModelRepository paramIBrandTariffTypePropertyModelRepository, ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, IPrepaidMyTariffPageModelRepository paramIPrepaidMyTariffPageModelRepository)
  {
    return new HomeScreenPresenter(paramIHomeScreenView, paramIB2pView, paramBox7SubscriptionManager, paramIPerformanceTimingManager, paramMoeUpdateManager, paramTimeoutPreferences, paramLocalizer, paramBrandUtils, paramIBrandTariffTypePropertyModelRepository, paramISubscriptionsAuthorizedRepository, paramIPrepaidMyTariffPageModelRepository);
  }
  
  @Binds
  public abstract IB2pView viewDialog(HomeScreenActivity paramHomeScreenActivity);
  
  @Binds
  public abstract IHomeScreenView viewHomeScreen(HomeScreenActivity paramHomeScreenActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/HomeScreenActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */