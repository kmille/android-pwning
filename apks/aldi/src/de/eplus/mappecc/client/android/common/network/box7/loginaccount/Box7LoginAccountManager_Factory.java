package de.eplus.mappecc.client.android.common.network.box7.loginaccount;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.restclient.api.LoginAccountsApi;
import javax.inject.Provider;

public final class Box7LoginAccountManager_Factory
  implements Factory<Box7LoginAccountManager>
{
  private final Provider<LoginAccountsApi> loginAccountsApiProvider;
  
  public Box7LoginAccountManager_Factory(Provider<LoginAccountsApi> paramProvider)
  {
    this.loginAccountsApiProvider = paramProvider;
  }
  
  public static Box7LoginAccountManager_Factory create(Provider<LoginAccountsApi> paramProvider)
  {
    return new Box7LoginAccountManager_Factory(paramProvider);
  }
  
  public static Box7LoginAccountManager newBox7LoginAccountManager(LoginAccountsApi paramLoginAccountsApi)
  {
    return new Box7LoginAccountManager(paramLoginAccountsApi);
  }
  
  public static Box7LoginAccountManager provideInstance(Provider<LoginAccountsApi> paramProvider)
  {
    return new Box7LoginAccountManager((LoginAccountsApi)paramProvider.get());
  }
  
  public final Box7LoginAccountManager get()
  {
    return provideInstance(this.loginAccountsApiProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/loginaccount/Box7LoginAccountManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */