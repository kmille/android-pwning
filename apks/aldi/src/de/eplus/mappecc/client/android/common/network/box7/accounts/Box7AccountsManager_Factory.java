package de.eplus.mappecc.client.android.common.network.box7.accounts;

import dagger.internal.Factory;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.restclient.api.AccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.BankaccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.BillingsApi;
import javax.inject.Provider;

public final class Box7AccountsManager_Factory
  implements Factory<Box7AccountsManager>
{
  private final Provider<AccountsApi> accountsApiProvider;
  private final Provider<BankaccountsApi> bankAccountsApiProvider;
  private final Provider<BillingsApi> billingsApiProvider;
  private final Provider<Box7Cache> box7CacheProvider;
  
  public Box7AccountsManager_Factory(Provider<AccountsApi> paramProvider, Provider<BankaccountsApi> paramProvider1, Provider<BillingsApi> paramProvider2, Provider<Box7Cache> paramProvider3)
  {
    this.accountsApiProvider = paramProvider;
    this.bankAccountsApiProvider = paramProvider1;
    this.billingsApiProvider = paramProvider2;
    this.box7CacheProvider = paramProvider3;
  }
  
  public static Box7AccountsManager_Factory create(Provider<AccountsApi> paramProvider, Provider<BankaccountsApi> paramProvider1, Provider<BillingsApi> paramProvider2, Provider<Box7Cache> paramProvider3)
  {
    return new Box7AccountsManager_Factory(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public static Box7AccountsManager newBox7AccountsManager(AccountsApi paramAccountsApi, BankaccountsApi paramBankaccountsApi, BillingsApi paramBillingsApi, Box7Cache paramBox7Cache)
  {
    return new Box7AccountsManager(paramAccountsApi, paramBankaccountsApi, paramBillingsApi, paramBox7Cache);
  }
  
  public static Box7AccountsManager provideInstance(Provider<AccountsApi> paramProvider, Provider<BankaccountsApi> paramProvider1, Provider<BillingsApi> paramProvider2, Provider<Box7Cache> paramProvider3)
  {
    return new Box7AccountsManager((AccountsApi)paramProvider.get(), (BankaccountsApi)paramProvider1.get(), (BillingsApi)paramProvider2.get(), (Box7Cache)paramProvider3.get());
  }
  
  public final Box7AccountsManager get()
  {
    return provideInstance(this.accountsApiProvider, this.bankAccountsApiProvider, this.billingsApiProvider, this.box7CacheProvider);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/accounts/Box7AccountsManager_Factory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */