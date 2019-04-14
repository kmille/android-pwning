package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeOverviewFragment;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeOverviewFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.history.IConsumeOverviewView;

@Module
public abstract class ConsumeOverviewFragmentModule
{
  @Provides
  static ConsumeOverviewFragmentPresenter provideConsumeOverviewFragmentPresenter()
  {
    return new ConsumeOverviewFragmentPresenter();
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ConsumeOverviewFragment consumeOverviewFragmentInjector();
  
  @Binds
  public abstract IConsumeOverviewView view(ConsumeOverviewFragment paramConsumeOverviewFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ConsumeOverviewFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */