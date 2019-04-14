package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.feature.pack.cancel.IPackCancelView;
import de.eplus.mappecc.client.android.feature.pack.cancel.PackCancelFragment;
import de.eplus.mappecc.client.android.feature.pack.cancel.PackCancelFragmentPresenter;

@Module
public abstract class PackCancelFragmentModule
{
  @Provides
  static PackCancelFragmentPresenter providePackCancelFragmentPresenter(Localizer paramLocalizer, ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return new PackCancelFragmentPresenter(paramLocalizer, paramISubscriptionModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract PackCancelFragment packCancelFragmentInjector();
  
  @Binds
  public abstract IPackCancelView view(PackCancelFragment paramPackCancelFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/PackCancelFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */