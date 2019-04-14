package de.eplus.mappecc.client.android.common.dependencyinjection.application;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.security.B2PKeyStoreImpl;
import javax.inject.Provider;

public final class SecurityModule_ProvideB2PKeyStoreImplFactory
  implements Factory<B2PKeyStoreImpl>
{
  private final Provider<Context> contextProvider;
  private final Provider<DeviceUtils> deviceUtilsProvider;
  private final SecurityModule module;
  
  public SecurityModule_ProvideB2PKeyStoreImplFactory(SecurityModule paramSecurityModule, Provider<Context> paramProvider, Provider<DeviceUtils> paramProvider1)
  {
    this.module = paramSecurityModule;
    this.contextProvider = paramProvider;
    this.deviceUtilsProvider = paramProvider1;
  }
  
  public static SecurityModule_ProvideB2PKeyStoreImplFactory create(SecurityModule paramSecurityModule, Provider<Context> paramProvider, Provider<DeviceUtils> paramProvider1)
  {
    return new SecurityModule_ProvideB2PKeyStoreImplFactory(paramSecurityModule, paramProvider, paramProvider1);
  }
  
  public static B2PKeyStoreImpl provideInstance(SecurityModule paramSecurityModule, Provider<Context> paramProvider, Provider<DeviceUtils> paramProvider1)
  {
    return proxyProvideB2PKeyStoreImpl(paramSecurityModule, (Context)paramProvider.get(), (DeviceUtils)paramProvider1.get());
  }
  
  public static B2PKeyStoreImpl proxyProvideB2PKeyStoreImpl(SecurityModule paramSecurityModule, Context paramContext, DeviceUtils paramDeviceUtils)
  {
    return (B2PKeyStoreImpl)Preconditions.checkNotNull(paramSecurityModule.provideB2PKeyStoreImpl(paramContext, paramDeviceUtils), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final B2PKeyStoreImpl get()
  {
    return provideInstance(this.module, this.contextProvider, this.deviceUtilsProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/application/SecurityModule_ProvideB2PKeyStoreImplFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */