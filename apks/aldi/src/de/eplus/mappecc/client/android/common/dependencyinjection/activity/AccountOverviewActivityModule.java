package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import android.support.annotation.NonNull;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.dependencyinjection.fragment.PerFragment;
import de.eplus.mappecc.client.android.common.network.box7.customer.Box7CustomerManager;
import de.eplus.mappecc.client.android.common.network.box7.subscription.Box7SubscriptionManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.repository.implementation.IBrandTariffTypePropertyModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ILoginAccountModelRepository;
import de.eplus.mappecc.client.android.common.repository.implementation.ISubscriptionsAuthorizedRepository;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.feature.customer.AccountOverviewActivity;
import de.eplus.mappecc.client.android.feature.customer.AccountOverviewPresenter;
import de.eplus.mappecc.client.android.feature.customer.IAccountOverviewView;
import de.eplus.mappecc.client.android.feature.customer.NotRegisteredFragment;
import de.eplus.mappecc.client.android.feature.reauth.IReAuthView;
import de.eplus.mappecc.client.android.feature.reauth.ReAuthFragment;
import de.eplus.mappecc.client.android.feature.reauth.ReAuthFragmentPresenter;

@Module
public abstract class AccountOverviewActivityModule
{
  @Provides
  static AccountOverviewPresenter provideAccountOverviewPresenter()
  {
    return new AccountOverviewPresenter();
  }
  
  @Provides
  static ReAuthFragmentPresenter provideReAuthFragmentPresenter(@NonNull IB2pView paramIB2pView, @NonNull IHigherLoginManager paramIHigherLoginManager, @NonNull ErrorUtils paramErrorUtils, @NonNull LoginPreferences paramLoginPreferences, @NonNull Box7CustomerManager paramBox7CustomerManager, @NonNull Box7SubscriptionManager paramBox7SubscriptionManager, @NonNull ISubscriptionsAuthorizedRepository paramISubscriptionsAuthorizedRepository, @NonNull IBrandTariffTypePropertyModelRepository paramIBrandTariffTypePropertyModelRepository, @NonNull NetworkUtils paramNetworkUtils, @NonNull ILoginAccountModelRepository paramILoginAccountModelRepository)
  {
    return new ReAuthFragmentPresenter(paramIB2pView, paramIHigherLoginManager, paramErrorUtils, paramLoginPreferences, paramBox7CustomerManager, paramNetworkUtils, paramISubscriptionsAuthorizedRepository, paramIBrandTariffTypePropertyModelRepository, paramILoginAccountModelRepository);
  }
  
  @Binds
  public abstract IAccountOverviewView accountOverviewActivityView(AccountOverviewActivity paramAccountOverviewActivity);
  
  @Binds
  public abstract IB2pView b2pView(AccountOverviewActivity paramAccountOverviewActivity);
  
  @PerFragment
  @ContributesAndroidInjector
  abstract NotRegisteredFragment notRegisteredFragmentInjector();
  
  @PerFragment
  @ContributesAndroidInjector
  abstract ReAuthFragment reAuthFragmentInjector();
  
  @Binds
  public abstract IReAuthView reAuthView(ReAuthFragment paramReAuthFragment);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/AccountOverviewActivityModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */