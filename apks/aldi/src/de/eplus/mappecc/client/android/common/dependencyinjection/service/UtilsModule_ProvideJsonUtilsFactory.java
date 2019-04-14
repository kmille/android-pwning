package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;

public final class UtilsModule_ProvideJsonUtilsFactory
  implements Factory<JsonUtil>
{
  private static final UtilsModule_ProvideJsonUtilsFactory INSTANCE = new UtilsModule_ProvideJsonUtilsFactory();
  
  public static UtilsModule_ProvideJsonUtilsFactory create()
  {
    return INSTANCE;
  }
  
  public static JsonUtil provideInstance()
  {
    return proxyProvideJsonUtils();
  }
  
  public static JsonUtil proxyProvideJsonUtils()
  {
    return (JsonUtil)Preconditions.checkNotNull(UtilsModule.provideJsonUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final JsonUtil get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/UtilsModule_ProvideJsonUtilsFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */