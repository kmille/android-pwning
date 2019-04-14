package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.history.evn.EvnDataModelFactory;
import javax.inject.Provider;

public final class ConsumeFragmentModule_ProvideConsumeFragmentPresenterFactory
  implements Factory<ConsumeFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Box7SubscriptionManager> box7SubscriptionManagerProvider;
  private final Provider<EvnDataModelFactory> evnDataModelFactoryProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  
  public ConsumeFragmentModule_ProvideConsumeFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<IB2pView> paramProvider2, Provider<EvnDataModelFactory> paramProvider3, Provider<ISubscriptionModelRepository> paramProvider4)
  {
    this.localizerProvider = paramProvider;
    this.box7SubscriptionManagerProvider = paramProvider1;
    this.b2pViewProvider = paramProvider2;
    this.evnDataModelFactoryProvider = paramProvider3;
    this.subscriptionModelRepositoryProvider = paramProvider4;
  }
  
  public static ConsumeFragmentModule_ProvideConsumeFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<IB2pView> paramProvider2, Provider<EvnDataModelFactory> paramProvider3, Provider<ISubscriptionModelRepository> paramProvider4)
  {
    return new ConsumeFragmentModule_ProvideConsumeFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public static ConsumeFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<Box7SubscriptionManager> paramProvider1, Provider<IB2pView> paramProvider2, Provider<EvnDataModelFactory> paramProvider3, Provider<ISubscriptionModelRepository> paramProvider4)
  {
    return proxyProvideConsumeFragmentPresenter((Localizer)paramProvider.get(), (Box7SubscriptionManager)paramProvider1.get(), (IB2pView)paramProvider2.get(), (EvnDataModelFactory)paramProvider3.get(), (ISubscriptionModelRepository)paramProvider4.get());
  }
  
  public static ConsumeFragmentPresenter proxyProvideConsumeFragmentPresenter(Localizer paramLocalizer, Box7SubscriptionManager paramBox7SubscriptionManager, IB2pView paramIB2pView, EvnDataModelFactory paramEvnDataModelFactory, ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return (ConsumeFragmentPresenter)Preconditions.checkNotNull(ConsumeFragmentModule.provideConsumeFragmentPresenter(paramLocalizer, paramBox7SubscriptionManager, paramIB2pView, paramEvnDataModelFactory, paramISubscriptionModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ConsumeFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.box7SubscriptionManagerProvider, this.b2pViewProvider, this.evnDataModelFactoryProvider, this.subscriptionModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ConsumeFragmentModule_ProvideConsumeFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */