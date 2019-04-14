package de.eplus.mappecc.client.android.common.network.box7.customer;

import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.model.AddressModel;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerModel;
import de.eplus.mappecc.client.android.common.restclient.model.EmptyModel;
import de.eplus.mappecc.client.android.common.restclient.model.SimcardBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.ThirdPartyServiceSettingsModel;
import java.util.List;

public abstract interface IBox7CustomerManager
{
  public abstract void getBasicSimcardInfo(IBox7ManagerCallback<List<SimcardBaseModel>> paramIBox7ManagerCallback);
  
  public abstract void resendEmailVerification(IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback);
  
  public abstract void startEmailVerification(String paramString, IBox7ManagerCallback<EmptyModel> paramIBox7ManagerCallback);
  
  public abstract void updateBarriers(ThirdPartyServiceSettingsModel paramThirdPartyServiceSettingsModel, IBox7ManagerCallback<ThirdPartyServiceSettingsModel> paramIBox7ManagerCallback);
  
  public abstract void updateCustomer(CustomerModel paramCustomerModel, String paramString, IBox7ManagerCallback<CustomerBaseModel> paramIBox7ManagerCallback);
  
  public abstract void updateCustomerAddress(AddressModel paramAddressModel, String paramString, IBox7ManagerCallback<AddressModel> paramIBox7ManagerCallback);
  
  public abstract void validateAddress(AddressModel paramAddressModel, IBox7ManagerCallback<List<AddressModel>> paramIBox7ManagerCallback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/customer/IBox7CustomerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */