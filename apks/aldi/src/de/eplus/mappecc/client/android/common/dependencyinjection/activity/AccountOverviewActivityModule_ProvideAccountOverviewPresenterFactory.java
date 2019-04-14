package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.customer.AccountOverviewPresenter;

public final class AccountOverviewActivityModule_ProvideAccountOverviewPresenterFactory
  implements Factory<AccountOverviewPresenter>
{
  private static final AccountOverviewActivityModule_ProvideAccountOverviewPresenterFactory INSTANCE = new AccountOverviewActivityModule_ProvideAccountOverviewPresenterFactory();
  
  public static AccountOverviewActivityModule_ProvideAccountOverviewPresenterFactory create()
  {
    return INSTANCE;
  }
  
  public static AccountOverviewPresenter provideInstance()
  {
    return proxyProvideAccountOverviewPresenter();
  }
  
  public static AccountOverviewPresenter proxyProvideAccountOverviewPresenter()
  {
    return (AccountOverviewPresenter)Preconditions.checkNotNull(AccountOverviewActivityModule.provideAccountOverviewPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final AccountOverviewPresenter get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/AccountOverviewActivityModule_ProvideAccountOverviewPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */