package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ICustomerModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.common.utils.MailVerificationUtil;
import de.eplus.mappecc.client.android.feature.customer.ChangeEmailPresenter;
import de.eplus.mappecc.client.android.feature.customer.IChangeEmailView;
import javax.inject.Provider;

public final class ChangeEmailActivityModule_ProvideChangeEmailPresenterFactory
  implements Factory<ChangeEmailPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<Box7CustomerManager> box7CustomerManagerProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<IChangeEmailView> changeEmailViewProvider;
  private final Provider<ICustomerModelRepository> customerModelRepositoryProvider;
  private final Provider<HotlineUtils> hotlineUtilsProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<MailVerificationUtil> mailVerificationUtilProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public ChangeEmailActivityModule_ProvideChangeEmailPresenterFactory(Provider<IChangeEmailView> paramProvider, Provider<IB2pView> paramProvider1, Provider<HotlineUtils> paramProvider2, Provider<Box7Cache> paramProvider3, Provider<Box7CustomerManager> paramProvider4, Provider<Localizer> paramProvider5, Provider<Box7SubscriptionManager> paramProvider6, Provider<MailVerificationUtil> paramProvider7, Provider<TrackingHelper> paramProvider8, Provider<ISubscriptionModelRepository> paramProvider9, Provider<ICustomerModelRepository> paramProvider10)
  {
    this.changeEmailViewProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.hotlineUtilsProvider = paramProvider2;
    this.box7CacheProvider = paramProvider3;
    this.box7CustomerManagerProvider = paramProvider4;
    this.localizerProvider = paramProvider5;
    this.box7SubscriptionManagerProvider = paramProvider6;
    this.mailVerificationUtilProvider = paramProvider7;
    this.trackingHelperProvider = paramProvider8;
    this.subscriptionModelRepositoryProvider = paramProvider9;
    this.customerModelRepositoryProvider = paramProvider10;
  }
  
  public static ChangeEmailActivityModule_ProvideChangeEmailPresenterFactory create(Provider<IChangeEmailView> paramProvider, Provider<IB2pView> paramProvider1, Provider<HotlineUtils> paramProvider2, Provider<Box7Cache> paramProvider3, Provider<Box7CustomerManager> paramProvider4, Provider<Localizer> paramProvider5, Provider<Box7SubscriptionManager> paramProvider6, Provider<MailVerificationUtil> paramProvider7, Provider<TrackingHelper> paramProvider8, Provider<ISubscriptionModelRepository> paramProvider9, Provider<ICustomerModelRepository> paramProvider10)
  {
    return new ChangeEmailActivityModule_ProvideChangeEmailPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6, paramProvider7, paramProvider8, paramProvider9, paramProvider10);
  }
  
  public static ChangeEmailPresenter provideInstance(Provider<IChangeEmailView> paramProvider, Provider<IB2pView> paramProvider1, Provider<HotlineUtils> paramProvider2, Provider<Box7Cache> paramProvider3, Provider<Box7CustomerManager> paramProvider4, Provider<Localizer> paramProvider5, Provider<Box7SubscriptionManager> paramProvider6, Provider<MailVerificationUtil> paramProvider7, Provider<TrackingHelper> paramProvider8, Provider<ISubscriptionModelRepository> paramProvider9, Provider<ICustomerModelRepository> paramProvider10)
  {
    return proxyProvideChangeEmailPresenter((IChangeEmailView)paramProvider.get(), (IB2pView)paramProvider1.get(), (HotlineUtils)paramProvider2.get(), (Box7Cache)paramProvider3.get(), (Box7CustomerManager)paramProvider4.get(), (Localizer)paramProvider5.get(), (Box7SubscriptionManager)paramProvider6.get(), (MailVerificationUtil)paramProvider7.get(), (TrackingHelper)paramProvider8.get(), (ISubscriptionModelRepository)paramProvider9.get(), (ICustomerModelRepository)paramProvider10.get());
  }
  
  public static ChangeEmailPresenter proxyProvideChangeEmailPresenter(IChangeEmailView paramIChangeEmailView, IB2pView paramIB2pView, HotlineUtils paramHotlineUtils, Box7Cache paramBox7Cache, Box7CustomerManager paramBox7CustomerManager, Localizer paramLocalizer, Box7SubscriptionManager paramBox7SubscriptionManager, MailVerificationUtil paramMailVerificationUtil, TrackingHelper paramTrackingHelper, ISubscriptionModelRepository paramISubscriptionModelRepository, ICustomerModelRepository paramICustomerModelRepository)
  {
    return (ChangeEmailPresenter)Preconditions.checkNotNull(ChangeEmailActivityModule.provideChangeEmailPresenter(paramIChangeEmailView, paramIB2pView, paramHotlineUtils, paramBox7Cache, paramBox7CustomerManager, paramLocalizer, paramBox7SubscriptionManager, paramMailVerificationUtil, paramTrackingHelper, paramISubscriptionModelRepository, paramICustomerModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ChangeEmailPresenter get()
  {
    return provideInstance(this.changeEmailViewProvider, this.b2pViewProvider, this.hotlineUtilsProvider, this.box7CacheProvider, this.box7CustomerManagerProvider, this.localizerProvider, this.box7SubscriptionManagerProvider, this.mailVerificationUtilProvider, this.trackingHelperProvider, this.subscriptionModelRepositoryProvider, this.customerModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ChangeEmailActivityModule_ProvideChangeEmailPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */