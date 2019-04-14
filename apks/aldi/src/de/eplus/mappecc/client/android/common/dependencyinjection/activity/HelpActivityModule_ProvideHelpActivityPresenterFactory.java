package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.help.HelpActivityPresenter;
import de.eplus.mappecc.client.android.feature.help.IHelpView;
import javax.inject.Provider;

public final class HelpActivityModule_ProvideHelpActivityPresenterFactory
  implements Factory<HelpActivityPresenter>
{
  private final Provider<IHelpView> helpViewProvider;
  private final Provider<Localizer> localizerProvider;
  
  public HelpActivityModule_ProvideHelpActivityPresenterFactory(Provider<IHelpView> paramProvider, Provider<Localizer> paramProvider1)
  {
    this.helpViewProvider = paramProvider;
    this.localizerProvider = paramProvider1;
  }
  
  public static HelpActivityModule_ProvideHelpActivityPresenterFactory create(Provider<IHelpView> paramProvider, Provider<Localizer> paramProvider1)
  {
    return new HelpActivityModule_ProvideHelpActivityPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static HelpActivityPresenter provideInstance(Provider<IHelpView> paramProvider, Provider<Localizer> paramProvider1)
  {
    return proxyProvideHelpActivityPresenter((IHelpView)paramProvider.get(), (Localizer)paramProvider1.get());
  }
  
  public static HelpActivityPresenter proxyProvideHelpActivityPresenter(IHelpView paramIHelpView, Localizer paramLocalizer)
  {
    return (HelpActivityPresenter)Preconditions.checkNotNull(HelpActivityModule.provideHelpActivityPresenter(paramIHelpView, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final HelpActivityPresenter get()
  {
    return provideInstance(this.helpViewProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/HelpActivityModule_ProvideHelpActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */