package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.feature.customer.IMyAccountView;
import de.eplus.mappecc.client.android.feature.customer.MyAccountFragment;
import de.eplus.mappecc.client.android.feature.customer.MyAccountFragmentPresenter;

@Module
public abstract class MyAccountFragmentModule
{
  @Provides
  static MyAccountFragmentPresenter provideMyAccountFragmentPresenter()
  {
    return new MyAccountFragmentPresenter();
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract MyAccountFragment myAccountFragmentInjector();
  
  @Binds
  public abstract IMyAccountView view(MyAccountFragment paramMyAccountFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/MyAccountFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */