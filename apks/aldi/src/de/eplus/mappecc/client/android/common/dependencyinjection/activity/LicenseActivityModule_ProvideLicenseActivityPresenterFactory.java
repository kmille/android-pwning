package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.help.license.ILicenseView;
import de.eplus.mappecc.client.android.feature.help.license.LicenseActivityPresenter;
import javax.inject.Provider;

public final class LicenseActivityModule_ProvideLicenseActivityPresenterFactory
  implements Factory<LicenseActivityPresenter>
{
  private final Provider<ILicenseView> licenseViewProvider;
  private final Provider<Localizer> localizerProvider;
  
  public LicenseActivityModule_ProvideLicenseActivityPresenterFactory(Provider<ILicenseView> paramProvider, Provider<Localizer> paramProvider1)
  {
    this.licenseViewProvider = paramProvider;
    this.localizerProvider = paramProvider1;
  }
  
  public static LicenseActivityModule_ProvideLicenseActivityPresenterFactory create(Provider<ILicenseView> paramProvider, Provider<Localizer> paramProvider1)
  {
    return new LicenseActivityModule_ProvideLicenseActivityPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static LicenseActivityPresenter provideInstance(Provider<ILicenseView> paramProvider, Provider<Localizer> paramProvider1)
  {
    return proxyProvideLicenseActivityPresenter((ILicenseView)paramProvider.get(), (Localizer)paramProvider1.get());
  }
  
  public static LicenseActivityPresenter proxyProvideLicenseActivityPresenter(ILicenseView paramILicenseView, Localizer paramLocalizer)
  {
    return (LicenseActivityPresenter)Preconditions.checkNotNull(LicenseActivityModule.provideLicenseActivityPresenter(paramILicenseView, paramLocalizer), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LicenseActivityPresenter get()
  {
    return provideInstance(this.licenseViewProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/LicenseActivityModule_ProvideLicenseActivityPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */