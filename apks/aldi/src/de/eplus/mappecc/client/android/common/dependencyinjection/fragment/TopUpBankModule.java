package de.eplus.mappecc.client.android.common.dependencyinjection.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.repository.implementation.IPrepaidTopupConfigurationModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.utils.HotlineUtils;
import de.eplus.mappecc.client.android.feature.topup.bank.ITopUpBankView;
import de.eplus.mappecc.client.android.feature.topup.bank.TopUpBankFragment;
import de.eplus.mappecc.client.android.feature.topup.bank.TopUpBankPresenter;

@Module
public abstract class TopUpBankModule
{
  @Provides
  static TopUpBankPresenter provideTopUpFragmentPresenter(Box7SubscriptionManager paramBox7SubscriptionManager, Localizer paramLocalizer, Box7Cache paramBox7Cache, ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, HotlineUtils paramHotlineUtils, IPrepaidTopupConfigurationModelRepository paramIPrepaidTopupConfigurationModelRepository)
  {
    return new TopUpBankPresenter(paramBox7SubscriptionManager, paramLocalizer, paramBox7Cache, paramISubscriptionsAuthorizedRepository, paramHotlineUtils, paramIPrepaidTopupConfigurationModelRepository);
  }
  
  @PerFragment
  @ContributesAndroidInjector
  abstract TopUpBankFragment topUpFragmentInjector();
  
  @Binds
  public abstract ITopUpBankView view(TopUpBankFragment paramTopUpBankFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/fragment/TopUpBankModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */