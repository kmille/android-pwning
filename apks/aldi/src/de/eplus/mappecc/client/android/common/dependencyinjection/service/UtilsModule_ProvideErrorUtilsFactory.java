package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.ErrorUtils;

public final class UtilsModule_ProvideErrorUtilsFactory
  implements Factory<ErrorUtils>
{
  private static final UtilsModule_ProvideErrorUtilsFactory INSTANCE = new UtilsModule_ProvideErrorUtilsFactory();
  
  public static UtilsModule_ProvideErrorUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static ErrorUtils provideInstance()
  {
    return proxyProvideErrorUtils();
  }
  
  public static ErrorUtils proxyProvideErrorUtils()
  {
    return (ErrorUtils)Preconditions.checkNotNull(UtilsModule.provideErrorUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final ErrorUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideErrorUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */