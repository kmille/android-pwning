package de.eplus.mappecc.client.android.common.network.box7.customer;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.api.AddressesApi;
import de.eplus.mappecc.client.android.common.restclient.api.CustomersApi;
import de.eplus.mappecc.client.android.common.restclient.api.SimCardsApi;
import de.eplus.mappecc.client.android.common.restclient.api.ThirdPartyApi;
import javax.inject.Provider;

public final class Box7CustomerManager_Factory
  implements Factory<Box7CustomerManager>
{
  private final Provider<AddressesApi> addressesApiProvider;
  private final Provider<Box7Cache> box7cacheProvider;
  private final Provider<CustomersApi> customersApiProvider;
  private final Provider<Localizer> localizerProvider;
  private final Provider<SimCardsApi> simCardsApiProvider;
  private final Provider<ThirdPartyApi> thirdPartyApiProvider;
  
  public Box7CustomerManager_Factory(Provider<AddressesApi> paramProvider, Provider<CustomersApi> paramProvider1, Provider<ThirdPartyApi> paramProvider2, Provider<SimCardsApi> paramProvider3, Provider<Box7Cache> paramProvider4, Provider<Localizer> paramProvider5)
  {
    this.addressesApiProvider = paramProvider;
    this.customersApiProvider = paramProvider1;
    this.thirdPartyApiProvider = paramProvider2;
    this.simCardsApiProvider = paramProvider3;
    this.box7cacheProvider = paramProvider4;
    this.localizerProvider = paramProvider5;
  }
  
  public static Box7CustomerManager_Factory create(Provider<AddressesApi> paramProvider, Provider<CustomersApi> paramProvider1, Provider<ThirdPartyApi> paramProvider2, Provider<SimCardsApi> paramProvider3, Provider<Box7Cache> paramProvider4, Provider<Localizer> paramProvider5)
  {
    return new Box7CustomerManager_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5);
  }
  
  public static Box7CustomerManager newBox7CustomerManager(AddressesApi paramAddressesApi, CustomersApi paramCustomersApi, ThirdPartyApi paramThirdPartyApi, SimCardsApi paramSimCardsApi, Box7Cache paramBox7Cache, Localizer paramLocalizer)
  {
    return new Box7CustomerManager(paramAddressesApi, paramCustomersApi, paramThirdPartyApi, paramSimCardsApi, paramBox7Cache, paramLocalizer);
  }
  
  public static Box7CustomerManager provideInstance(Provider<AddressesApi> paramProvider, Provider<CustomersApi> paramProvider1, Provider<ThirdPartyApi> paramProvider2, Provider<SimCardsApi> paramProvider3, Provider<Box7Cache> paramProvider4, Provider<Localizer> paramProvider5)
  {
    return new Box7CustomerManager((AddressesApi)paramProvider.get(), (CustomersApi)paramProvider1.get(), (ThirdPartyApi)paramProvider2.get(), (SimCardsApi)paramProvider3.get(), (Box7Cache)paramProvider4.get(), (Localizer)paramProvider5.get());
  }
  
  public final Box7CustomerManager get()
  {
    return provideInstance(this.addressesApiProvider, this.customersApiProvider, this.thirdPartyApiProvider, this.simCardsApiProvider, this.box7cacheProvider, this.localizerProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/customer/Box7CustomerManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */