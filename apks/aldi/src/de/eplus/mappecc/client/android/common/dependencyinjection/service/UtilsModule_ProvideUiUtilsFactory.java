package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.UiUtils;

public final class UtilsModule_ProvideUiUtilsFactory
  implements Factory<UiUtils>
{
  private static final UtilsModule_ProvideUiUtilsFactory INSTANCE = new UtilsModule_ProvideUiUtilsFactory();
  
  public static UtilsModule_ProvideUiUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static UiUtils provideInstance()
  {
    return proxyProvideUiUtils();
  }
  
  public static UiUtils proxyProvideUiUtils()
  {
    return (UiUtils)Preconditions.checkNotNull(UtilsModule.provideUiUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final UiUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideUiUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */