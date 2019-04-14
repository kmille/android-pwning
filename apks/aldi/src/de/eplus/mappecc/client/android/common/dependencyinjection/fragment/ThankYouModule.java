package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.feature.rating.thankyou.ThankYouFragment;
import de.eplus.mappecc.client.android.feature.rating.thankyou.ThankYouPresenter;
import de.eplus.mappecc.client.android.feature.rating.thankyou.ThankYouView;

@Module
public abstract class ThankYouModule
{
  @Provides
  static ThankYouPresenter provideThankYouPresenter()
  {
    return new ThankYouPresenter();
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ThankYouFragment thankYouFragmentInjector();
  
  @Binds
  public abstract ThankYouView view(ThankYouFragment paramThankYouFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ThankYouModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */