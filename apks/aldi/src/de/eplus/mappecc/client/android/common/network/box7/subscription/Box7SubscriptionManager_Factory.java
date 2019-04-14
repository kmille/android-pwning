package de.eplus.mappecc.client.android.common.network.box7.subscription;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.restclient.api.PacksApi;
import de.eplus.mappecc.client.android.common.restclient.api.SubscriptionsApi;
import de.eplus.mappecc.client.android.common.restclient.api.TopupsApi;
import de.eplus.mappecc.client.android.common.restclient.api.UsagesApi;
import javax.inject.Provider;

public final class Box7SubscriptionManager_Factory
  implements Factory<Box7SubscriptionManager>
{
  private final Provider<Box7Cache> box7CacheProvider;
  private final Provider<PacksApi> packApiProvider;
  private final Provider<SubscriptionsApi> subscriptionsApiProvider;
  private final Provider<TopupsApi> topupsApiProvider;
  private final Provider<UsagesApi> usagesApiProvider;
  
  public Box7SubscriptionManager_Factory(Provider<PacksApi> paramProvider, Provider<TopupsApi> paramProvider1, Provider<SubscriptionsApi> paramProvider2, Provider<UsagesApi> paramProvider3, Provider<Box7Cache> paramProvider4)
  {
    this.packApiProvider = paramProvider;
    this.topupsApiProvider = paramProvider1;
    this.subscriptionsApiProvider = paramProvider2;
    this.usagesApiProvider = paramProvider3;
    this.box7CacheProvider = paramProvider4;
  }
  
  public static Box7SubscriptionManager_Factory create(Provider<PacksApi> paramProvider, Provider<TopupsApi> paramProvider1, Provider<SubscriptionsApi> paramProvider2, Provider<UsagesApi> paramProvider3, Provider<Box7Cache> paramProvider4)
  {
    return new Box7SubscriptionManager_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public static Box7SubscriptionManager newBox7SubscriptionManager(PacksApi paramPacksApi, TopupsApi paramTopupsApi, SubscriptionsApi paramSubscriptionsApi, UsagesApi paramUsagesApi)
  {
    return new Box7SubscriptionManager(paramPacksApi, paramTopupsApi, paramSubscriptionsApi, paramUsagesApi);
  }
  
  public static Box7SubscriptionManager provideInstance(Provider<PacksApi> paramProvider, Provider<TopupsApi> paramProvider1, Provider<SubscriptionsApi> paramProvider2, Provider<UsagesApi> paramProvider3, Provider<Box7Cache> paramProvider4)
  {
    paramProvider = new Box7SubscriptionManager((PacksApi)paramProvider.get(), (TopupsApi)paramProvider1.get(), (SubscriptionsApi)paramProvider2.get(), (UsagesApi)paramProvider3.get());
    Box7SubscriptionManager_MembersInjector.injectBox7Cache(paramProvider, (Box7Cache)paramProvider4.get());
    return paramProvider;
  }
  
  public final Box7SubscriptionManager get()
  {
    return provideInstance(this.packApiProvider, this.topupsApiProvider, this.subscriptionsApiProvider, this.usagesApiProvider, this.box7CacheProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/subscription/Box7SubscriptionManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */