package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.help.term.ITermsView;
import de.eplus.mappecc.client.android.feature.help.term.TermsPresenter;
import javax.inject.Provider;

public final class TermsActivityModule_ProvideTermsPresenterFactory
  implements Factory<TermsPresenter>
{
  private final Provider<Localizer> localizerProvider;
  private final Provider<ITermsView> termsViewProvider;
  private final Provider<TrackingHelper> trackingHelperProvider;
  
  public TermsActivityModule_ProvideTermsPresenterFactory(Provider<ITermsView> paramProvider, Provider<Localizer> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    this.termsViewProvider = paramProvider;
    this.localizerProvider = paramProvider1;
    this.trackingHelperProvider = paramProvider2;
  }
  
  public static TermsActivityModule_ProvideTermsPresenterFactory create(Provider<ITermsView> paramProvider, Provider<Localizer> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return new TermsActivityModule_ProvideTermsPresenterFactory(paramProvider, paramProvider1, paramProvider2);
  }
  
  public static TermsPresenter provideInstance(Provider<ITermsView> paramProvider, Provider<Localizer> paramProvider1, Provider<TrackingHelper> paramProvider2)
  {
    return proxyProvideTermsPresenter((ITermsView)paramProvider.get(), (Localizer)paramProvider1.get(), (TrackingHelper)paramProvider2.get());
  }
  
  public static TermsPresenter proxyProvideTermsPresenter(ITermsView paramITermsView, Localizer paramLocalizer, TrackingHelper paramTrackingHelper)
  {
    return (TermsPresenter)Preconditions.checkNotNull(TermsActivityModule.provideTermsPresenter(paramITermsView, paramLocalizer, paramTrackingHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final TermsPresenter get()
  {
    return provideInstance(this.termsViewProvider, this.localizerProvider, this.trackingHelperProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/TermsActivityModule_ProvideTermsPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */