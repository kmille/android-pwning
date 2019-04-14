package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;

public final class UtilsModule_ProvideDeviceUtilsFactory
  implements Factory<DeviceUtils>
{
  private static final UtilsModule_ProvideDeviceUtilsFactory INSTANCE = new UtilsModule_ProvideDeviceUtilsFactory();
  
  public static UtilsModule_ProvideDeviceUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static DeviceUtils provideInstance()
  {
    return proxyProvideDeviceUtils();
  }
  
  public static DeviceUtils proxyProvideDeviceUtils()
  {
    return (DeviceUtils)Preconditions.checkNotNull(UtilsModule.provideDeviceUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final DeviceUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideDeviceUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */