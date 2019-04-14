package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.topup.choice.ITopUpChoiceView;
import de.eplus.mappecc.client.android.feature.topup.choice.TopUpChoiceFragment;
import de.eplus.mappecc.client.android.feature.topup.choice.TopUpChoiceFragmentPresenter;

@Module
public abstract class TopUpChoiceFragmentModule
{
  @Provides
  static TopUpChoiceFragmentPresenter provideTopUpChoiceFragmentPresenter(Localizer paramLocalizer)
  {
    return new TopUpChoiceFragmentPresenter(paramLocalizer);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract TopUpChoiceFragment TopUpChoiceFragmentInjector();
  
  @Binds
  public abstract ITopUpChoiceView view(TopUpChoiceFragment paramTopUpChoiceFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpChoiceFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */