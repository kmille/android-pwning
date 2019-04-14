package de.eplus.mappecc.client.android.common.dependencyinjection.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.feature.customer.MyAccountActivityPresenter;
import de.eplus.mappecc.client.android.feature.customer.history.IMyAccountView;
import javax.inject.Provider;

public final class MyAccountActivityModule_ProvideMyAccountPresenterFactory
  implements Factory<MyAccountActivityPresenter>
{
  private final Provider<IMyAccountView> myAccountViewProvider;
  private final Provider<TimeoutPreferences> timeoutPreferencesProvider;
  
  public MyAccountActivityModule_ProvideMyAccountPresenterFactory(Provider<IMyAccountView> paramProvider, Provider<TimeoutPreferences> paramProvider1)
  {
    this.myAccountViewProvider = paramProvider;
    this.timeoutPreferencesProvider = paramProvider1;
  }
  
  public static MyAccountActivityModule_ProvideMyAccountPresenterFactory create(Provider<IMyAccountView> paramProvider, Provider<TimeoutPreferences> paramProvider1)
  {
    return new MyAccountActivityModule_ProvideMyAccountPresenterFactory(paramProvider, paramProvider1);
  }
  
  public static MyAccountActivityPresenter provideInstance(Provider<IMyAccountView> paramProvider, Provider<TimeoutPreferences> paramProvider1)
  {
    return proxyProvideMyAccountPresenter((IMyAccountView)paramProvider.get(), (TimeoutPreferences)paramProvider1.get());
  }
  
  public static MyAccountActivityPresenter proxyProvideMyAccountPresenter(IMyAccountView paramIMyAccountView, TimeoutPreferences paramTimeoutPreferences)
  {
    return (MyAccountActivityPresenter)Preconditions.checkNotNull(MyAccountActivityModule.provideMyAccountPresenter(paramIMyAccountView, paramTimeoutPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final MyAccountActivityPresenter get()
  {
    return provideInstance(this.myAccountViewProvider, this.timeoutPreferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/activity/MyAccountActivityModule_ProvideMyAccountPresenterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */