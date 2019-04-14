package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.trash.IPublicInfoAreaView;
import de.eplus.mappecc.client.android.feature.trash.PublicInfoAreaPresenter;
import javax.inject.Provider;

public final class PublicInfoAreaActivityModule_ProvidePublicInfoAreaPresenterFactory
  implements Factory<PublicInfoAreaPresenter>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<IPublicInfoAreaView> publicInfoAreaViewProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public PublicInfoAreaActivityModule_ProvidePublicInfoAreaPresenterFactory(Provider<IPublicInfoAreaView> paramProvider, Provider<Localizer> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    this.publicInfoAreaViewProvider = paramProvider;
    this.localizerProvider = paramProvider1;
    this.trackingHelperProvider = paramProvider2;
  }
  
  public static PublicInfoAreaActivityModule_ProvidePublicInfoAreaPresenterFactory create(Provider<IPublicInfoAreaView> paramProvider, Provider<Localizer> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return new PublicInfoAreaActivityModule_ProvidePublicInfoAreaPresenterFactory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static PublicInfoAreaPresenter provideInstance(Provider<IPublicInfoAreaView> paramProvider, Provider<Localizer> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return proxyProvidePublicInfoAreaPresenter((IPublicInfoAreaView)paramProvider.get(), (Localizer)paramProvider1.get(), (TrackingHelper)paramProvider2.get());
  }
  
  public static PublicInfoAreaPresenter proxyProvidePublicInfoAreaPresenter(IPublicInfoAreaView paramIPublicInfoAreaView, Localizer paramLocalizer, TrackingHelper paramTrackingHelper)
  {
    return (PublicInfoAreaPresenter)Preconditions.checkNotNull(PublicInfoAreaActivityModule.providePublicInfoAreaPresenter(paramIPublicInfoAreaView, paramLocalizer, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PublicInfoAreaPresenter get()
  {
    return provideInstance(this.publicInfoAreaViewProvider, this.localizerProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/PublicInfoAreaActivityModule_ProvidePublicInfoAreaPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */