package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.CallExternalAppsUtils;

public final class UtilsModule_ProvideCallExternalAppsUtilsFactory
  implements Factory<CallExternalAppsUtils>
{
  private static final UtilsModule_ProvideCallExternalAppsUtilsFactory INSTANCE = new UtilsModule_ProvideCallExternalAppsUtilsFactory();
  
  public static UtilsModule_ProvideCallExternalAppsUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static CallExternalAppsUtils provideInstance()
  {
    return proxyProvideCallExternalAppsUtils();
  }
  
  public static CallExternalAppsUtils proxyProvideCallExternalAppsUtils()
  {
    return (CallExternalAppsUtils)Preconditions.checkNotNull(UtilsModule.provideCallExternalAppsUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final CallExternalAppsUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideCallExternalAppsUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */