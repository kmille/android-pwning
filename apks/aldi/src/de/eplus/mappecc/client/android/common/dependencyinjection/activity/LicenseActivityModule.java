package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.help.license.ILicenseView;
import de.eplus.mappecc.client.android.feature.help.license.LicenseActivity;
import de.eplus.mappecc.client.android.feature.help.license.LicenseActivityPresenter;

@Module
public abstract class LicenseActivityModule
{
  @Provides
  static LicenseActivityPresenter provideLicenseActivityPresenter(ILicenseView paramILicenseView, Localizer paramLocalizer)
  {
    return new LicenseActivityPresenter(paramILicenseView, paramLocalizer);
  }
  
  @Binds
  public abstract ILicenseView licenseView(LicenseActivity paramLicenseActivity);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/LicenseActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */