package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.Module;
import dagger.Provides;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.feature.customer.history.evn.EvnDataModelFactory;
import de.eplus.mappecc.client.android.feature.pack.overview.PackDataModelFactory;
import javax.inject.Singleton;

@Module
public class FactoryModule
{
  @Provides
  @Singleton
  static EvnDataModelFactory provideEvnDataModelFactory()
  {
    return new EvnDataModelFactory();
  }
  
  @Provides
  @Singleton
  static PackDataModelFactory providePackDataModelFactory(Localizer paramLocalizer)
  {
    return new PackDataModelFactory(paramLocalizer);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/FactoryModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */