package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.feature.customer.history.evn.EvnDataModelFactory;

public final class FactoryModule_ProvideEvnDataModelFactoryFactory
  implements Factory<EvnDataModelFactory>
{
  private static final FactoryModule_ProvideEvnDataModelFactoryFactory INSTANCE = new FactoryModule_ProvideEvnDataModelFactoryFactory();
  
  public static FactoryModule_ProvideEvnDataModelFactoryFactory create()
  {
    return INSTANCE;
  }
  
  public static EvnDataModelFactory provideInstance()
  {
    return proxyProvideEvnDataModelFactory();
  }
  
  public static EvnDataModelFactory proxyProvideEvnDataModelFactory()
  {
    return (EvnDataModelFactory)Preconditions.checkNotNull(FactoryModule.provideEvnDataModelFactory(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final EvnDataModelFactory get()
  {
    return provideInstance();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/FactoryModule_ProvideEvnDataModelFactoryFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */