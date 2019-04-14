package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import javax.inject.Singleton;

@Module
public class CacheModule
{
  @Provides
  @Singleton
  static Box7Cache provideBox7Cache()
  {
    return new Box7Cache();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/CacheModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */