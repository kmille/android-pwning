package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragmentPresenter;
import javax.inject.Provider;

public final class NotRegisteredFragmentModule_ProvideNotRegisteredFragmentPresenterFactory
  implements Factory<NotRegisteredFragmentPresenter>
{
  private final Provider<IB2pView> b2pViewProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public NotRegisteredFragmentModule_ProvideNotRegisteredFragmentPresenterFactory(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    this.localizerProvider = paramProvider;
    this.b2pViewProvider = paramProvider1;
    this.trackingHelperProvider = paramProvider2;
  }
  
  public static NotRegisteredFragmentModule_ProvideNotRegisteredFragmentPresenterFactory create(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return new NotRegisteredFragmentModule_ProvideNotRegisteredFragmentPresenterFactory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static NotRegisteredFragmentPresenter provideInstance(Provider<Localizer> paramProvider, Provider<IB2pView> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return proxyProvideNotRegisteredFragmentPresenter((Localizer)paramProvider.get(), (IB2pView)paramProvider1.get(), (TrackingHelper)paramProvider2.get());
  }
  
  public static NotRegisteredFragmentPresenter proxyProvideNotRegisteredFragmentPresenter(Localizer paramLocalizer, IB2pView paramIB2pView, TrackingHelper paramTrackingHelper)
  {
    return (NotRegisteredFragmentPresenter)Preconditions.checkNotNull(NotRegisteredFragmentModule.provideNotRegisteredFragmentPresenter(paramLocalizer, paramIB2pView, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final NotRegisteredFragmentPresenter get()
  {
    return provideInstance(this.localizerProvider, this.b2pViewProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/NotRegisteredFragmentModule_ProvideNotRegisteredFragmentPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */