package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.piranha.LoginHelper;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import javax.inject.Provider;

public final class NetworkModule_ProvideLoginHelperFactory
  implements Factory<LoginHelper>
{
  private final Provider<LoginPreferences> loginPreferencesProvider;
  
  public NetworkModule_ProvideLoginHelperFactory(Provider<LoginPreferences> paramProvider)
  {
    this.loginPreferencesProvider = paramProvider;
  }
  
  public static NetworkModule_ProvideLoginHelperFactory create(Provider<LoginPreferences> paramProvider)
  {
    return new NetworkModule_ProvideLoginHelperFactory(paramProvider);
  }
  
  public static LoginHelper provideInstance(Provider<LoginPreferences> paramProvider)
  {
    return proxyProvideLoginHelper((LoginPreferences)paramProvider.get());
  }
  
  public static LoginHelper proxyProvideLoginHelper(LoginPreferences paramLoginPreferences)
  {
    return (LoginHelper)Preconditions.checkNotNull(NetworkModule.provideLoginHelper(paramLoginPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final LoginHelper get()
  {
    return provideInstance(this.loginPreferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/NetworkModule_ProvideLoginHelperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */