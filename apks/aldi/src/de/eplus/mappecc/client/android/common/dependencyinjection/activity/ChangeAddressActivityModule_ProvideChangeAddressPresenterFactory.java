package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.customer.ChangeAddressPresenter;
import de.eplus.mappecc.client.android.feature.customer.IChangeAddressView;
import javax.inject.Provider;

public final class ChangeAddressActivityModule_ProvideChangeAddressPresenterFactory
  implements Factory<ChangeAddressPresenter>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7CustomerManager> box7CustomerManagerProvider;
  private final Provider<IChangeAddressView> changeAddressViewProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<IB2pView> ib2pViewProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public ChangeAddressActivityModule_ProvideChangeAddressPresenterFactory(Provider<IChangeAddressView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<Box7CustomerManager> paramProvider3, Provider<Localizer> paramProvider4, Provider<HotlineUtils> paramProvider5, Provider<TrackingHelper> paramProvider6, Provider<ICustomerModelRepository> paramProvider7, Provider<ISubscriptionModelRepository> paramProvider8)
  {
    this.changeAddressViewProvider = paramProvider;
    this.ib2pViewProvider = paramProvider1;
    this.box7CacheProvider = paramProvider2;
    this.box7CustomerManagerProvider = paramProvider3;
    this.localizerProvider = paramProvider4;
    this.hotlineUtilsProvider = paramProvider5;
    this.trackingHelperProvider = paramProvider6;
    this.customerModelRepositoryProvider = paramProvider7;
    this.subscriptionModelRepositoryProvider = paramProvider8;
  }
  
  public static ChangeAddressActivityModule_ProvideChangeAddressPresenterFactory create(Provider<IChangeAddressView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<Box7CustomerManager> paramProvider3, Provider<Localizer> paramProvider4, Provider<HotlineUtils> paramProvider5, Provider<TrackingHelper> paramProvider6, Provider<ICustomerModelRepository> paramProvider7, Provider<ISubscriptionModelRepository> paramProvider8)
  {
    return new ChangeAddressActivityModule_ProvideChangeAddressPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8);
  }
  
  public static ChangeAddressPresenter provideInstance(Provider<IChangeAddressView> paramProvider, Provider<IB2pView> paramProvider1, Provider<Box7Cache> paramProvider2, Provider<Box7CustomerManager> paramProvider3, Provider<Localizer> paramProvider4, Provider<HotlineUtils> paramProvider5, Provider<TrackingHelper> paramProvider6, Provider<ICustomerModelRepository> paramProvider7, Provider<ISubscriptionModelRepository> paramProvider8)
  {
    return proxyProvideChangeAddressPresenter((IChangeAddressView)paramProvider.get(), (IB2pView)paramProvider1.get(), (Box7Cache)paramProvider2.get(), (Box7CustomerManager)paramProvider3.get(), (Localizer)paramProvider4.get(), (HotlineUtils)paramProvider5.get(), (TrackingHelper)paramProvider6.get(), (ICustomerModelRepository)paramProvider7.get(), (ISubscriptionModelRepository)paramProvider8.get());
  }
  
  public static ChangeAddressPresenter proxyProvideChangeAddressPresenter(IChangeAddressView paramIChangeAddressView, IB2pView paramIB2pView, Box7Cache paramBox7Cache, Box7CustomerManager paramBox7CustomerManager, Localizer paramLocalizer, HotlineUtils paramHotlineUtils, TrackingHelper paramTrackingHelper, ICustomerModelRepository paramICustomerModelRepository, ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return (ChangeAddressPresenter)Preconditions.checkNotNull(ChangeAddressActivityModule.provideChangeAddressPresenter(paramIChangeAddressView, paramIB2pView, paramBox7Cache, paramBox7CustomerManager, paramLocalizer, paramHotlineUtils, paramTrackingHelper, paramICustomerModelRepository, paramISubscriptionModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ChangeAddressPresenter get()
  {
    return provideInstance(this.changeAddressViewProvider, this.ib2pViewProvider, this.box7CacheProvider, this.box7CustomerManagerProvider, this.localizerProvider, this.hotlineUtilsProvider, this.trackingHelperProvider, this.customerModelRepositoryProvider, this.subscriptionModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeAddressActivityModule_ProvideChangeAddressPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */