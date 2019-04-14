package de.eplus.mappecc.client.android.common.network.box7.loginaccount;

import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel;

abstract interface IBox7LoginAccountManager
{
  public abstract void createAccount(LoginAccountModel paramLoginAccountModel, IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback);
  
  public abstract void getAccount(String paramString, IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback);
  
  public abstract void updateAccount(String paramString, LoginAccountModel paramLoginAccountModel, IBox7ManagerCallback<LoginAccountModel> paramIBox7ManagerCallback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/loginaccount/IBox7LoginAccountManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */