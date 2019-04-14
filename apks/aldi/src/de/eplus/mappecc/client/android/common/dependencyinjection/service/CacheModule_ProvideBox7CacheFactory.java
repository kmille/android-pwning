package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;

public final class CacheModule_ProvideBox7CacheFactory
  implements Factory<Box7Cache>
{
  private static final CacheModule_ProvideBox7CacheFactory INSTANCE = new CacheModule_ProvideBox7CacheFactory();
  
  public static CacheModule_ProvideBox7CacheFactory create()
  {
    return INSTANCE;
  }
  
  public static Box7Cache provideInstance()
  {
    return proxyProvideBox7Cache();
  }
  
  public static Box7Cache proxyProvideBox7Cache()
  {
    return (Box7Cache)Preconditions.checkNotNull(CacheModule.provideBox7Cache(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final Box7Cache get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/CacheModule_ProvideBox7CacheFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */