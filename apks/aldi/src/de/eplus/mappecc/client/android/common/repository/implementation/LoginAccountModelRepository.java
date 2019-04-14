package de.eplus.mappecc.client.android.common.repository.implementation;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.repository.NetworkCacheStorageManager;
import de.eplus.mappecc.client.android.common.restclient.api.LoginAccountsApi;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel;
import retrofit2.Call;

public class LoginAccountModelRepository
  implements ILoginAccountModelRepository
{
  private final LoginAccountsApi loginAccountsApi;
  
  public LoginAccountModelRepository(LoginAccountsApi paramLoginAccountsApi)
  {
    this.loginAccountsApi = paramLoginAccountsApi;
  }
  
  public void get(@NonNull Box7Callback<LoginAccountModel> paramBox7Callback)
  {
    new NetworkCacheStorageManager(paramBox7Callback)
    {
      public void createCall(@NonNull Box7Callback<LoginAccountModel> paramAnonymousBox7Callback)
      {
        LoginAccountModelRepository.this.loginAccountsApi.getLoginAccountsWithBrand("alditalk").enqueue(new Box7CallbackWrapper(paramAnonymousBox7Callback));
      }
    };
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/repository/implementation/LoginAccountModelRepository.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */