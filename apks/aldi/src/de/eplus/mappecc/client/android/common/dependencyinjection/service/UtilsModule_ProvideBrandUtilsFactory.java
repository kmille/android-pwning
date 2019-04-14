package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.BrandUtils;

public final class UtilsModule_ProvideBrandUtilsFactory
  implements Factory<BrandUtils>
{
  private static final UtilsModule_ProvideBrandUtilsFactory INSTANCE = new UtilsModule_ProvideBrandUtilsFactory();
  
  public static UtilsModule_ProvideBrandUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static BrandUtils provideInstance()
  {
    return proxyProvideBrandUtils();
  }
  
  public static BrandUtils proxyProvideBrandUtils()
  {
    return (BrandUtils)Preconditions.checkNotNull(UtilsModule.provideBrandUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final BrandUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideBrandUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */