package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.topup.bank.TopUpBankPresenter;
import javax.inject.Provider;

public final class TopUpBankModule_ProvideTopUpFragmentPresenterFactory
  implements Factory<TopUpBankPresenter>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPrepaidTopupConfigurationModelRepository> prepaidTopupConfigurationModelRepositoryProvider;
  private final Provider<Box7SubscriptionManager> subscriptionManagerProvider;
  private final Provider<ISubscriptionsAuthorizedRepository> subscriptionsAuthorizedRepositoryProvider;
  
  public TopUpBankModule_ProvideTopUpFragmentPresenterFactory(Provider<Box7SubscriptionManager> paramProvider, Provider<Localizer> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<ISubscriptionsAuthorizedRepository> paramProvider3, Provider<HotlineUtils> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5)
  {
    this.subscriptionManagerProvider = paramProvider;
    this.localizerProvider = paramProvider1;
    this.box7CacheProvider = paramProvider2;
    this.subscriptionsAuthorizedRepositoryProvider = paramProvider3;
    this.hotlineUtilsProvider = paramProvider4;
    this.prepaidTopupConfigurationModelRepositoryProvider = paramProvider5;
  }
  
  public static TopUpBankModule_ProvideTopUpFragmentPresenterFactory create(Provider<Box7SubscriptionManager> paramProvider, Provider<Localizer> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<ISubscriptionsAuthorizedRepository> paramProvider3, Provider<HotlineUtils> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5)
  {
    return new TopUpBankModule_ProvideTopUpFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static TopUpBankPresenter provideInstance(Provider<Box7SubscriptionManager> paramProvider, Provider<Localizer> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<ISubscriptionsAuthorizedRepository> paramProvider3, Provider<HotlineUtils> paramProvider4, Provider<IPrepaidTopupConfigurationModelRepository> paramProvider5)
  {
    return proxyProvideTopUpFragmentPresenter((Box7SubscriptionManager)paramProvider.get(), (Localizer)paramProvider1.get(), (Box7Cache)paramProvider2.get(), (ISubscriptionsAuthorizedRepository)paramProvider3.get(), (HotlineUtils)paramProvider4.get(), (IPrepaidTopupConfigurationModelRepository)paramProvider5.get());
  }
  
  public static TopUpBankPresenter proxyProvideTopUpFragmentPresenter(Box7SubscriptionManager paramBox7SubscriptionManager, Localizer paramLocalizer, Box7Cache paramBox7Cache, ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, HotlineUtils paramHotlineUtils, IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository)
  {
    return (TopUpBankPresenter)Preconditions.checkNotNull(TopUpBankModule.provideTopUpFragmentPresenter(paramBox7SubscriptionManager, paramLocalizer, paramBox7Cache, paramISubscriptionsAuthorizedRepository, paramHotlineUtils, paramIPrepaidTopupConfigurationModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TopUpBankPresenter get()
  {
    return provideInstance(this.subscriptionManagerProvider, this.localizerProvider, this.box7CacheProvider, this.subscriptionsAuthorizedRepositoryProvider, this.hotlineUtilsProvider, this.prepaidTopupConfigurationModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpBankModule_ProvideTopUpFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */