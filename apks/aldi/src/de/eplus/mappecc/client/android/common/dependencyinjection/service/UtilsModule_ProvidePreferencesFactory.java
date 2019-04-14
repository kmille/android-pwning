package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.preferences.Preferences;
import de.eplus.mappecc.client.android.common.utils.security.crypto.ICrypto;
import javax.inject.Provider;

public final class UtilsModule_ProvidePreferencesFactory
  implements Factory<Preferences>
{
  private final Provider<ICrypto> iCryptoProvider;
  
  public UtilsModule_ProvidePreferencesFactory(Provider<ICrypto> paramProvider)
  {
    this.iCryptoProvider = paramProvider;
  }
  
  public static UtilsModule_ProvidePreferencesFactory create(Provider<ICrypto> paramProvider)
  {
    return new UtilsModule_ProvidePreferencesFactory(paramProvider);
  }
  
  public static Preferences provideInstance(Provider<ICrypto> paramProvider)
  {
    return proxyProvidePreferences((ICrypto)paramProvider.get());
  }
  
  public static Preferences proxyProvidePreferences(ICrypto paramICrypto)
  {
    return (Preferences)Preconditions.checkNotNull(UtilsModule.providePreferences(paramICrypto), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final Preferences get()
  {
    return provideInstance(this.iCryptoProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvidePreferencesFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */