package de.eplus.mappecc.client.android.common.network.box7.loginaccount;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.api.LoginAccountsApi;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel;
import javax.inject.Inject;
import retrofit2.Call;

public class Box7LoginAccountManager
  implements IBox7LoginAccountManager
{
  private final LoginAccountsApi loginAccountsApi;
  
  @Inject
  public Box7LoginAccountManager(LoginAccountsApi paramLoginAccountsApi)
  {
    this.loginAccountsApi = paramLoginAccountsApi;
  }
  
  public void createAccount(LoginAccountModel paramLoginAccountModel, IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback)
  {
    this.loginAccountsApi.createLoginAccountWithBrand("alditalk", paramLoginAccountModel).enqueue(getCallback(paramIBox7ManagerCallback));
  }
  
  public void getAccount(String paramString, IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback)
  {
    this.loginAccountsApi.getLoginAccountForLoginWithBrand("alditalk", paramString).enqueue(getCallback(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<LoginAccountModel> getCallback(IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void updateAccount(String paramString, LoginAccountModel paramLoginAccountModel, IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback)
  {
    this.loginAccountsApi.updateLoginAccountForLoginWithBrand("alditalk", paramString, paramLoginAccountModel).enqueue(getCallback(paramIBox7ManagerCallback));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/loginaccount/Box7LoginAccountManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */