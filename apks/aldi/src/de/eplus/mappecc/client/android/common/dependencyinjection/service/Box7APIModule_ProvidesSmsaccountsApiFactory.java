package de.eplus.mappecc.client.android.common.dependencyinjection.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.restclient.api.SmsAccountsApi;
import javax.inject.Provider;

public final class Box7APIModule_ProvidesSmsaccountsApiFactory
  implements Factory<SmsAccountsApi>
{
  private final Provider<Box7RestApiLib> box7RestApiLibProvider;
  private final Box7APIModule module;
  
  public Box7APIModule_ProvidesSmsaccountsApiFactory(Box7APIModule paramBox7APIModule, Provider<Box7RestApiLib> paramProvider)
  {
    this.module = paramBox7APIModule;
    this.box7RestApiLibProvider = paramProvider;
  }
  
  public static Box7APIModule_ProvidesSmsaccountsApiFactory create(Box7APIModule paramBox7APIModule, Provider<Box7RestApiLib> paramProvider)
  {
    return new Box7APIModule_ProvidesSmsaccountsApiFactory(paramBox7APIModule, paramProvider);
  }
  
  public static SmsAccountsApi provideInstance(Box7APIModule paramBox7APIModule, Provider<Box7RestApiLib> paramProvider)
  {
    return proxyProvidesSmsaccountsApi(paramBox7APIModule, (Box7RestApiLib)paramProvider.get());
  }
  
  public static SmsAccountsApi proxyProvidesSmsaccountsApi(Box7APIModule paramBox7APIModule, Box7RestApiLib paramBox7RestApiLib)
  {
    return (SmsAccountsApi)Preconditions.checkNotNull(paramBox7APIModule.providesSmsaccountsApi(paramBox7RestApiLib), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public final SmsAccountsApi get()
  {
    return provideInstance(this.module, this.box7RestApiLibProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/dependencyinjection/service/Box7APIModule_ProvidesSmsaccountsApiFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */