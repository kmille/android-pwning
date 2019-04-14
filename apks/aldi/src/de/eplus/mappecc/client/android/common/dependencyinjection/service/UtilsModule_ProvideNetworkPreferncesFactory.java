package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.NetworkPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import javax.inject.Provider;

public final class UtilsModule_ProvideNetworkPreferncesFactory
  implements Factory<NetworkPreferences>
{
  private final Provider<Preferences> preferencesProvider;
  
  public UtilsModule_ProvideNetworkPreferncesFactory(Provider<Preferences> paramProvider)
  {
    this.preferencesProvider = paramProvider;
  }
  
  public static UtilsModule_ProvideNetworkPreferncesFactory create(Provider<Preferences> paramProvider)
  {
    return new UtilsModule_ProvideNetworkPreferncesFactory(paramProvider);
  }
  
  public static NetworkPreferences provideInstance(Provider<Preferences> paramProvider)
  {
    return proxyProvideNetworkPrefernces((Preferences)paramProvider.get());
  }
  
  public static NetworkPreferences proxyProvideNetworkPrefernces(Preferences paramPreferences)
  {
    return (NetworkPreferences)Preconditions.checkNotNull(UtilsModule.provideNetworkPrefernces(paramPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final NetworkPreferences get()
  {
    return provideInstance(this.preferencesProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideNetworkPreferncesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */