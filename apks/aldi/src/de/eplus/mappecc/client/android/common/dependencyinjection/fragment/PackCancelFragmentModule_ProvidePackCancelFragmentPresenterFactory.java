package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.feature.pack.cancel.PackCancelFragmentPresenter;
import javax.inject.Provider;

public final class PackCancelFragmentModule_ProvidePackCancelFragmentPresenterFactory
  implements Factory<PackCancelFragmentPresenter>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<ISubscriptionModelRepository> subscriptionModelRepositoryProvider;
  
  public PackCancelFragmentModule_ProvidePackCancelFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<ISubscriptionModelRepository> paramProvider1)
  {
    this.localizerProvider = paramProvider;
    this.subscriptionModelRepositoryProvider = paramProvider1;
  }
  
  public static PackCancelFragmentModule_ProvidePackCancelFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<ISubscriptionModelRepository> paramProvider1)
  {
    return new PackCancelFragmentModule_ProvidePackCancelFragmentPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static PackCancelFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<ISubscriptionModelRepository> paramProvider1)
  {
    return proxyProvidePackCancelFragmentPresenter((Localizer)paramProvider.get(), (ISubscriptionModelRepository)paramProvider1.get());
  }
  
  public static PackCancelFragmentPresenter proxyProvidePackCancelFragmentPresenter(Localizer paramLocalizer, ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return (PackCancelFragmentPresenter)Preconditions.checkNotNull(PackCancelFragmentModule.providePackCancelFragmentPresenter(paramLocalizer, paramISubscriptionModelRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PackCancelFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.subscriptionModelRepositoryProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackCancelFragmentModule_ProvidePackCancelFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */