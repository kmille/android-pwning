package de.eplus.mappecc.client.android.common.network.box7.accounts;

import android.support.annotation.NonNull;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7CallbackWrapper;
import de.eplus.mappecc.client.android.common.network.box7.IBox7ManagerCallback;
import de.eplus.mappecc.client.android.common.restclient.api.AccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.BankaccountsApi;
import de.eplus.mappecc.client.android.common.restclient.api.BillingsApi;
import de.eplus.mappecc.client.android.common.restclient.model.AccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.BankDataValidationModel;
import de.eplus.mappecc.client.android.common.restclient.model.ErrorModel;
import de.eplus.mappecc.client.android.common.restclient.model.InvoiceOverviewModel;
import java.util.List;
import javax.inject.Inject;
import retrofit2.Call;

public class Box7AccountsManager
  implements IBox7AccountsManager
{
  private final AccountsApi accountsApi;
  private final BankaccountsApi bankAccountsApi;
  private final BillingsApi billingsApi;
  private final Box7Cache box7Cache;
  
  @Inject
  public Box7AccountsManager(AccountsApi paramAccountsApi, BankaccountsApi paramBankaccountsApi, BillingsApi paramBillingsApi, Box7Cache paramBox7Cache)
  {
    this.accountsApi = paramAccountsApi;
    this.bankAccountsApi = paramBankaccountsApi;
    this.billingsApi = paramBillingsApi;
    this.box7Cache = paramBox7Cache;
  }
  
  public void deregisterPaymentMethod(String paramString1, String paramString2, IBox7ManagerCallback<AccountModel> paramIBox7ManagerCallback)
  {
    this.accountsApi.createPaymentMethodDeregistrationForAccountWithBrand("alditalk", paramString1, paramString2).enqueue(getAccountCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7AccountCallbackWrapper getAccountCallbackWrapper(IBox7ManagerCallback<AccountModel> paramIBox7ManagerCallback)
  {
    return new Box7AccountCallbackWrapper(paramIBox7ManagerCallback);
  }
  
  @NonNull
  protected Box7CallbackWrapper<InvoiceOverviewModel> getInvoiceCallback(IBox7ManagerCallback<InvoiceOverviewModel> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void getInvoices(IBox7ManagerCallback<InvoiceOverviewModel> paramIBox7ManagerCallback)
  {
    this.billingsApi.getInvoicesWithBrandForSubscriptionRx("alditalk", this.box7Cache.getSubscriptionId()).enqueue(getInvoiceCallback(paramIBox7ManagerCallback));
  }
  
  @NonNull
  protected Box7CallbackWrapper<AccountModel> getMaintainAccountCallbackWrapper(IBox7ManagerCallback<AccountModel> paramIBox7ManagerCallback)
  {
    new Box7CallbackWrapper(paramIBox7ManagerCallback)
    {
      protected void onSuccess(AccountModel paramAnonymousAccountModel, String paramAnonymousString, ErrorModel paramAnonymousErrorModel)
      {
        Box7AccountsManager.this.box7Cache.setAccountModel(paramAnonymousAccountModel);
        super.onSuccess(paramAnonymousAccountModel, paramAnonymousString, paramAnonymousErrorModel);
      }
    };
  }
  
  @NonNull
  protected Box7CallbackWrapper<List<BankDataValidationModel>> getValidateBankAccountCallbackWrapper(IBox7ManagerCallback<List<BankDataValidationModel>> paramIBox7ManagerCallback)
  {
    return new Box7CallbackWrapper(paramIBox7ManagerCallback);
  }
  
  public void updateAccount(String paramString, AccountModel paramAccountModel, IBox7ManagerCallback<AccountModel> paramIBox7ManagerCallback)
  {
    this.accountsApi.maintainAccountWithBrand("alditalk", paramString, paramAccountModel).enqueue(getMaintainAccountCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  public void validateBankAccount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, IBox7ManagerCallback<List<BankDataValidationModel>> paramIBox7ManagerCallback)
  {
    this.bankAccountsApi.validateBankAccountWithBrand("alditalk", paramString1, paramString2, paramString3, paramString4, paramString5).enqueue(getValidateBankAccountCallbackWrapper(paramIBox7ManagerCallback));
  }
  
  class Box7AccountCallbackWrapper
    extends Box7CallbackWrapper<AccountModel>
  {
    public Box7AccountCallbackWrapper(IBox7ManagerCallback paramIBox7ManagerCallback)
    {
      super();
    }
    
    protected void onSuccess(AccountModel paramAccountModel, String paramString, ErrorModel paramErrorModel)
    {
      Box7AccountsManager.this.box7Cache.setAccountModel(paramAccountModel);
      super.onSuccess(paramAccountModel, paramString, paramErrorModel);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/accounts/Box7AccountsManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */