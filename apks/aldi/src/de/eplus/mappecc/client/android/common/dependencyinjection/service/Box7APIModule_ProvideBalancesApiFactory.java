package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.restclient.api.BalancesApi;
import javax.inject.Provider;

public final class Box7APIModule_ProvideBalancesApiFactory
  implements Factory<BalancesApi>
{
  private final Provider<Box7RestApiLib> box7RestApiLibProvider;
  private final Box7APIModule module;
  
  public Box7APIModule_ProvideBalancesApiFactory(Box7APIModule paramBox7APIModule, Provider<Box7RestApiLib> paramProvider)
  {
    this.module = paramBox7APIModule;
    this.box7RestApiLibProvider = paramProvider;
  }
  
  public static Box7APIModule_ProvideBalancesApiFactory create(Box7APIModule paramBox7APIModule, Provider<Box7RestApiLib> paramProvider)
  {
    return new Box7APIModule_ProvideBalancesApiFactory(paramBox7APIModule, paramProvider);
  }
  
  public static BalancesApi provideInstance(Box7APIModule paramBox7APIModule, Provider<Box7RestApiLib> paramProvider)
  {
    return proxyProvideBalancesApi(paramBox7APIModule, (Box7RestApiLib)paramProvider.get());
  }
  
  public static BalancesApi proxyProvideBalancesApi(Box7APIModule paramBox7APIModule, Box7RestApiLib paramBox7RestApiLib)
  {
    return (BalancesApi)Preconditions.checkNotNull(paramBox7APIModule.provideBalancesApi(paramBox7RestApiLib), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final BalancesApi get()
  {
    return provideInstance(this.module, this.box7RestApiLibProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvideBalancesApiFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */