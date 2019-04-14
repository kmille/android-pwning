package de.eplus.mappecc.client.android.common.repository.implementation;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.restclient.api.MiscApi;
import javax.inject.Provider;

public final class BrandTariffTypePropertyModelRepository_Factory
  implements Factory<BrandTariffTypePropertyModelRepository>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<MiscApi> miscApiProvider;
  
  public BrandTariffTypePropertyModelRepository_Factory(Provider<Box7Cache> paramProvider, Provider<MiscApi> paramProvider1)
  {
    this.box7CacheProvider = paramProvider;
    this.miscApiProvider = paramProvider1;
  }
  
  public static BrandTariffTypePropertyModelRepository_Factory create(Provider<Box7Cache> paramProvider, Provider<MiscApi> paramProvider1)
  {
    return new BrandTariffTypePropertyModelRepository_Factory(paramProvider, paramProvider1);
  }
  
  public static BrandTariffTypePropertyModelRepository newBrandTariffTypePropertyModelRepository(Box7Cache paramBox7Cache, MiscApi paramMiscApi)
  {
    return new BrandTariffTypePropertyModelRepository(paramBox7Cache, paramMiscApi);
  }
  
  public static BrandTariffTypePropertyModelRepository provideInstance(Provider<Box7Cache> paramProvider, Provider<MiscApi> paramProvider1)
  {
    return new BrandTariffTypePropertyModelRepository((Box7Cache)paramProvider.get(), (MiscApi)paramProvider1.get());
  }
  
  public final BrandTariffTypePropertyModelRepository get()
  {
    return provideInstance(this.box7CacheProvider, this.miscApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/BrandTariffTypePropertyModelRepository_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */