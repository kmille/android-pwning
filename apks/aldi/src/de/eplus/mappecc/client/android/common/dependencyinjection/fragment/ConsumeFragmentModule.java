package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionModelRepository;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeFragment;
import de.eplus.mappecc.client.android.feature.customer.history.ConsumeFragmentPresenter;
import de.eplus.mappecc.client.android.feature.customer.history.IConsumeView;
import de.eplus.mappecc.client.android.feature.customer.history.evn.EvnDataModelFactory;

@Module
public abstract class ConsumeFragmentModule
{
  @Provides
  static ConsumeFragmentPresenter provideConsumeFragmentPresenter(@NonNull Localizer paramLocalizer, @NonNull Box7SubscriptionManager paramBox7SubscriptionManager, @NonNull IB2pView paramIB2pView, @NonNull EvnDataModelFactory paramEvnDataModelFactory, @NonNull ISubscriptionModelRepository paramISubscriptionModelRepository)
  {
    return new ConsumeFragmentPresenter(paramLocalizer, paramBox7SubscriptionManager, paramIB2pView, paramEvnDataModelFactory, paramISubscriptionModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ConsumeFragment consumeFragmentInjector();
  
  @Binds
  public abstract IConsumeView view(ConsumeFragment paramConsumeFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/ConsumeFragmentModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */