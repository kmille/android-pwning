package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.PermissionUtils;

public final class UtilsModule_ProvidePermissionsUtilsFactory
  implements Factory<PermissionUtils>
{
  private static final UtilsModule_ProvidePermissionsUtilsFactory INSTANCE = new UtilsModule_ProvidePermissionsUtilsFactory();
  
  public static UtilsModule_ProvidePermissionsUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static PermissionUtils provideInstance()
  {
    return proxyProvidePermissionsUtils();
  }
  
  public static PermissionUtils proxyProvidePermissionsUtils()
  {
    return (PermissionUtils)Preconditions.checkNotNull(UtilsModule.providePermissionsUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final PermissionUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvidePermissionsUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */