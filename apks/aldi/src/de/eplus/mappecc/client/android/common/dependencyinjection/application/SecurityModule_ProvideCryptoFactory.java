package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.security.B2PKeyStoreImpl;
import de.eplus.mappecc.client.android.common.utils.security.crypto.ICrypto;
import javax.inject.Provider;

public final class SecurityModule_ProvideCryptoFactory
  implements Factory<ICrypto>
{
  private final Provider<B2PKeyStoreImpl> b2PKeyStoreImplProvider;
  private final Provider<DeviceUtils> deviceUtilsProvider;
  private final SecurityModule module;
  
  public SecurityModule_ProvideCryptoFactory(SecurityModule paramSecurityModule, Provider<B2PKeyStoreImpl> paramProvider, Provider<DeviceUtils> paramProvider1)
  {
    this.module = paramSecurityModule;
    this.b2PKeyStoreImplProvider = paramProvider;
    this.deviceUtilsProvider = paramProvider1;
  }
  
  public static SecurityModule_ProvideCryptoFactory create(SecurityModule paramSecurityModule, Provider<B2PKeyStoreImpl> paramProvider, Provider<DeviceUtils> paramProvider1)
  {
    return new SecurityModule_ProvideCryptoFactory(paramSecurityModule, paramProvider, paramProvider1);
  }
  
  public static ICrypto provideInstance(SecurityModule paramSecurityModule, Provider<B2PKeyStoreImpl> paramProvider, Provider<DeviceUtils> paramProvider1)
  {
    return proxyProvideCrypto(paramSecurityModule, (B2PKeyStoreImpl)paramProvider.get(), (DeviceUtils)paramProvider1.get());
  }
  
  public static ICrypto proxyProvideCrypto(SecurityModule paramSecurityModule, B2PKeyStoreImpl paramB2PKeyStoreImpl, DeviceUtils paramDeviceUtils)
  {
    return (ICrypto)Preconditions.checkNotNull(paramSecurityModule.provideCrypto(paramB2PKeyStoreImpl, paramDeviceUtils), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ICrypto get()
  {
    return provideInstance(this.module, this.b2PKeyStoreImplProvider, this.deviceUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/SecurityModule_ProvideCryptoFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */