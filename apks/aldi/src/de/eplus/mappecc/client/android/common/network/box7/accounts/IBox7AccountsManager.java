package de.eplus.mappecc.client.android.common.network.box7.accounts;

import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.model.AccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.BankDataValidationModel;
import de.eplus.mappecc.client.android.common.restclient.model.InvoiceOverviewModel;
import java.util.List;

public abstract interface IBox7AccountsManager
{
  public abstract void deregisterPaymentMethod(String paramString1, String paramString2, IBox7ManagerCallback<AccountModel> paramIBox7ManagerCallback);
  
  public abstract void getInvoices(IBox7ManagerCallback<InvoiceOverviewModel> paramIBox7ManagerCallback);
  
  public abstract void updateAccount(String paramString, AccountModel paramAccountModel, IBox7ManagerCallback<AccountModel> paramIBox7ManagerCallback);
  
  public abstract void validateBankAccount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, IBox7ManagerCallback<List<BankDataValidationModel>> paramIBox7ManagerCallback);
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/accounts/IBox7AccountsManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */