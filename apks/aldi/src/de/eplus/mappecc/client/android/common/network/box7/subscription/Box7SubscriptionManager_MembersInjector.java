package de.eplus.mappecc.client.android.common.network.box7.subscription;

import dagger.MembersInjector;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import javax.inject.Provider;

public final class Box7SubscriptionManager_MembersInjector
  implements MembersInjector<Box7SubscriptionManager>
{
  private final Provider<Box7Cache> box7CacheProvider;
  
  public Box7SubscriptionManager_MembersInjector(Provider<Box7Cache> paramProvider)
  {
    this.box7CacheProvider = paramProvider;
  }
  
  public static MembersInjector<Box7SubscriptionManager> create(Provider<Box7Cache> paramProvider)
  {
    return new Box7SubscriptionManager_MembersInjector(paramProvider);
  }
  
  public static void injectBox7Cache(Box7SubscriptionManager paramBox7SubscriptionManager, Box7Cache paramBox7Cache)
  {
    paramBox7SubscriptionManager.box7Cache = paramBox7Cache;
  }
  
  public final void injectMembers(Box7SubscriptionManager paramBox7SubscriptionManager)
  {
    injectBox7Cache(paramBox7SubscriptionManager, (Box7Cache)this.box7CacheProvider.get());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/subscription/Box7SubscriptionManager_MembersInjector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */