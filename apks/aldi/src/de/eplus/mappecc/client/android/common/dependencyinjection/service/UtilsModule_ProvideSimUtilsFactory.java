package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.SimUtils;

public final class UtilsModule_ProvideSimUtilsFactory
  implements Factory<SimUtils>
{
  private static final UtilsModule_ProvideSimUtilsFactory INSTANCE = new UtilsModule_ProvideSimUtilsFactory();
  
  public static UtilsModule_ProvideSimUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static SimUtils provideInstance()
  {
    return proxyProvideSimUtils();
  }
  
  public static SimUtils proxyProvideSimUtils()
  {
    return (SimUtils)Preconditions.checkNotNull(UtilsModule.provideSimUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final SimUtils get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideSimUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */