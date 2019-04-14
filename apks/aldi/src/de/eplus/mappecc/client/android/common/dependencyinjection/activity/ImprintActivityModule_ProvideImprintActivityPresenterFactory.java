package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.help.imprint.IImprintView;
import de.eplus.mappecc.client.android.feature.help.imprint.ImprintActivityPresenter;
import javax.inject.Provider;

public final class ImprintActivityModule_ProvideImprintActivityPresenterFactory
  implements Factory<ImprintActivityPresenter>
{
  private final Provider<IImprintView> imprintViewProvider;
  private final Provider<Localizer> localizerProvider;
  
  public ImprintActivityModule_ProvideImprintActivityPresenterFactory(Provider<IImprintView> paramProvider, Provider<Localizer> paramProvider1)
  {
    this.imprintViewProvider = paramProvider;
    this.localizerProvider = paramProvider1;
  }
  
  public static ImprintActivityModule_ProvideImprintActivityPresenterFactory create(Provider<IImprintView> paramProvider, Provider<Localizer> paramProvider1)
  {
    return new ImprintActivityModule_ProvideImprintActivityPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static ImprintActivityPresenter provideInstance(Provider<IImprintView> paramProvider, Provider<Localizer> paramProvider1)
  {
    return proxyProvideImprintActivityPresenter((IImprintView)paramProvider.get(), (Localizer)paramProvider1.get());
  }
  
  public static ImprintActivityPresenter proxyProvideImprintActivityPresenter(IImprintView paramIImprintView, Localizer paramLocalizer)
  {
    return (ImprintActivityPresenter)Preconditions.checkNotNull(ImprintActivityModule.provideImprintActivityPresenter(paramIImprintView, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ImprintActivityPresenter get()
  {
    return provideInstance(this.imprintViewProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/ImprintActivityModule_ProvideImprintActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */