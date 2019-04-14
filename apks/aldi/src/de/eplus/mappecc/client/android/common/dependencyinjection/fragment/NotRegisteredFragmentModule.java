package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.feature.customer.INotRegisteredView;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragment;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragmentPresenter;

@Module
public abstract class NotRegisteredFragmentModule
{
  @Provides
  static NotRegisteredFragmentPresenter provideNotRegisteredFragmentPresenter(Localizer paramLocalizer, IB2pView paramIB2pView, TrackingHelper paramTrackingHelper)
  {
    return new NotRegisteredFragmentPresenter(paramLocalizer, paramIB2pView, paramTrackingHelper);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract NotRegisteredFragment notRegisteredFragmentInjector();
  
  @Binds
  public abstract INotRegisteredView view(NotRegisteredFragment paramNotRegisteredFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/NotRegisteredFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */