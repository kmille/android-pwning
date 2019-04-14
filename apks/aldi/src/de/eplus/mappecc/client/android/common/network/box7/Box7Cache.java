package de.eplus.mappecc.client.android.common.network.box7;

import de.eplus.mappecc.client.android.common.model.CustomerDataModel;
import de.eplus.mappecc.client.android.common.restclient.model.AccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.BankDataModel;
import de.eplus.mappecc.client.android.common.restclient.model.BrandTariffTypePropertyModel;
import de.eplus.mappecc.client.android.common.restclient.model.CreditCardModel;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerModel;
import de.eplus.mappecc.client.android.common.restclient.model.LoginAccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidTopupConfigurationModel;
import de.eplus.mappecc.client.android.common.restclient.model.SimcardModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionsAuthorized;
import de.eplus.mappecc.client.android.common.restclient.model.ThirdPartyServiceSettingsModel;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Box7Cache
{
  private AccountModel accountModel;
  private BankDataModel bankDataModel;
  private BrandTariffTypePropertyModel brandTariffTypePropertyModel;
  private CreditCardModel creditCardModel;
  private CustomerModel customerModel;
  private LoginAccountModel loginAccountModel;
  private PrepaidTopupConfigurationModel prepaidTopupConfigurationModel;
  private List<SimcardModel> simcardModels;
  private String subscriptionId;
  private SubscriptionModel subscriptionModel;
  private SubscriptionsAuthorized subscriptionsAuthorized;
  private ThirdPartyServiceSettingsModel thirdPartyServiceSettingsModel;
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof Box7Cache;
  }
  
  public void clear()
  {
    this.subscriptionId = null;
    this.subscriptionModel = null;
    this.customerModel = null;
    this.bankDataModel = null;
    this.creditCardModel = null;
    this.accountModel = null;
    this.simcardModels = null;
    this.subscriptionsAuthorized = null;
    this.prepaidTopupConfigurationModel = null;
    this.brandTariffTypePropertyModel = null;
    this.thirdPartyServiceSettingsModel = null;
    this.loginAccountModel = null;
  }
  
  public void clearCustomerModel()
  {
    this.customerModel = null;
    this.bankDataModel = null;
    this.accountModel = null;
    this.creditCardModel = null;
  }
  
  public void clearSubscptionModel()
  {
    this.subscriptionModel = null;
  }
  
  public void clearSubscriptionId()
  {
    this.subscriptionId = null;
  }
  
  public void clearSubscriptionsAuthorized()
  {
    this.subscriptionsAuthorized = null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Box7Cache)) {
      return false;
    }
    paramObject = (Box7Cache)paramObject;
    if (!((Box7Cache)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject1 = getSubscriptionsAuthorized();
    Object localObject2 = ((Box7Cache)paramObject).getSubscriptionsAuthorized();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getSubscriptionId();
    localObject2 = ((Box7Cache)paramObject).getSubscriptionId();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getSubscriptionModel();
    localObject2 = ((Box7Cache)paramObject).getSubscriptionModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getCustomerModel();
    localObject2 = ((Box7Cache)paramObject).getCustomerModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getAccountModel();
    localObject2 = ((Box7Cache)paramObject).getAccountModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getLoginAccountModel();
    localObject2 = ((Box7Cache)paramObject).getLoginAccountModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getBankDataModel();
    localObject2 = ((Box7Cache)paramObject).getBankDataModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getCreditCardModel();
    localObject2 = ((Box7Cache)paramObject).getCreditCardModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getPrepaidTopupConfigurationModel();
    localObject2 = ((Box7Cache)paramObject).getPrepaidTopupConfigurationModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getSimcardModels();
    localObject2 = ((Box7Cache)paramObject).getSimcardModels();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getBrandTariffTypePropertyModel();
    localObject2 = ((Box7Cache)paramObject).getBrandTariffTypePropertyModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getThirdPartyServiceSettingsModel();
    paramObject = ((Box7Cache)paramObject).getThirdPartyServiceSettingsModel();
    if (localObject1 == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!localObject1.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  public AccountModel getAccountModel()
  {
    return this.accountModel;
  }
  
  public BankDataModel getBankDataModel()
  {
    return this.bankDataModel;
  }
  
  public BrandTariffTypePropertyModel getBrandTariffTypePropertyModel()
  {
    return this.brandTariffTypePropertyModel;
  }
  
  public CreditCardModel getCreditCardModel()
  {
    return this.creditCardModel;
  }
  
  public CustomerModel getCustomerModel()
  {
    return this.customerModel;
  }
  
  public LoginAccountModel getLoginAccountModel()
  {
    return this.loginAccountModel;
  }
  
  public PrepaidTopupConfigurationModel getPrepaidTopupConfigurationModel()
  {
    return this.prepaidTopupConfigurationModel;
  }
  
  public List<SimcardModel> getSimcardModels()
  {
    return this.simcardModels;
  }
  
  public String getSubscriptionId()
  {
    return this.subscriptionId;
  }
  
  public SubscriptionModel getSubscriptionModel()
  {
    return this.subscriptionModel;
  }
  
  public SubscriptionsAuthorized getSubscriptionsAuthorized()
  {
    return this.subscriptionsAuthorized;
  }
  
  public ThirdPartyServiceSettingsModel getThirdPartyServiceSettingsModel()
  {
    return this.thirdPartyServiceSettingsModel;
  }
  
  public int hashCode()
  {
    Object localObject = getSubscriptionsAuthorized();
    int i7 = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    localObject = getSubscriptionId();
    int j;
    if (localObject == null) {
      j = 43;
    } else {
      j = localObject.hashCode();
    }
    localObject = getSubscriptionModel();
    int k;
    if (localObject == null) {
      k = 43;
    } else {
      k = localObject.hashCode();
    }
    localObject = getCustomerModel();
    int m;
    if (localObject == null) {
      m = 43;
    } else {
      m = localObject.hashCode();
    }
    localObject = getAccountModel();
    int n;
    if (localObject == null) {
      n = 43;
    } else {
      n = localObject.hashCode();
    }
    localObject = getLoginAccountModel();
    int i1;
    if (localObject == null) {
      i1 = 43;
    } else {
      i1 = localObject.hashCode();
    }
    localObject = getBankDataModel();
    int i2;
    if (localObject == null) {
      i2 = 43;
    } else {
      i2 = localObject.hashCode();
    }
    localObject = getCreditCardModel();
    int i3;
    if (localObject == null) {
      i3 = 43;
    } else {
      i3 = localObject.hashCode();
    }
    localObject = getPrepaidTopupConfigurationModel();
    int i4;
    if (localObject == null) {
      i4 = 43;
    } else {
      i4 = localObject.hashCode();
    }
    localObject = getSimcardModels();
    int i5;
    if (localObject == null) {
      i5 = 43;
    } else {
      i5 = localObject.hashCode();
    }
    localObject = getBrandTariffTypePropertyModel();
    int i6;
    if (localObject == null) {
      i6 = 43;
    } else {
      i6 = localObject.hashCode();
    }
    localObject = getThirdPartyServiceSettingsModel();
    if (localObject != null) {
      i7 = localObject.hashCode();
    }
    return (((((((((((i + 59) * 59 + j) * 59 + k) * 59 + m) * 59 + n) * 59 + i1) * 59 + i2) * 59 + i3) * 59 + i4) * 59 + i5) * 59 + i6) * 59 + i7;
  }
  
  public void setAccountModel(AccountModel paramAccountModel)
  {
    this.accountModel = paramAccountModel;
  }
  
  public void setBankDataModel(BankDataModel paramBankDataModel)
  {
    this.bankDataModel = paramBankDataModel;
  }
  
  public void setBrandTariffTypePropertyModel(BrandTariffTypePropertyModel paramBrandTariffTypePropertyModel)
  {
    this.brandTariffTypePropertyModel = paramBrandTariffTypePropertyModel;
  }
  
  public void setCreditCardModel(CreditCardModel paramCreditCardModel)
  {
    this.creditCardModel = paramCreditCardModel;
  }
  
  public void setCustomerModel(CustomerModel paramCustomerModel)
  {
    if (paramCustomerModel != null)
    {
      CustomerDataModel localCustomerDataModel = new CustomerDataModel(paramCustomerModel, null);
      this.customerModel = paramCustomerModel;
      this.bankDataModel = localCustomerDataModel.getBankDataModel();
      this.creditCardModel = localCustomerDataModel.getCreditCardModel();
      this.accountModel = localCustomerDataModel.getAccountModel();
      return;
    }
    this.customerModel = null;
    this.bankDataModel = null;
    this.creditCardModel = null;
    this.accountModel = null;
  }
  
  public void setLoginAccountModel(LoginAccountModel paramLoginAccountModel)
  {
    this.loginAccountModel = paramLoginAccountModel;
  }
  
  public void setPrepaidTopupConfigurationModel(PrepaidTopupConfigurationModel paramPrepaidTopupConfigurationModel)
  {
    this.prepaidTopupConfigurationModel = paramPrepaidTopupConfigurationModel;
  }
  
  public void setSimcardModels(List<SimcardModel> paramList)
  {
    this.simcardModels = paramList;
  }
  
  public void setSubscriptionId(String paramString)
  {
    this.subscriptionId = paramString;
  }
  
  public void setSubscriptionModel(SubscriptionModel paramSubscriptionModel)
  {
    this.subscriptionModel = paramSubscriptionModel;
  }
  
  public void setSubscriptionsAuthorized(SubscriptionsAuthorized paramSubscriptionsAuthorized)
  {
    this.subscriptionsAuthorized = paramSubscriptionsAuthorized;
  }
  
  public void setThirdPartyServiceSettingsModel(ThirdPartyServiceSettingsModel paramThirdPartyServiceSettingsModel)
  {
    this.thirdPartyServiceSettingsModel = paramThirdPartyServiceSettingsModel;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Box7Cache(subscriptionsAuthorized=");
    localStringBuilder.append(getSubscriptionsAuthorized());
    localStringBuilder.append(", subscriptionId=");
    localStringBuilder.append(getSubscriptionId());
    localStringBuilder.append(", subscriptionModel=");
    localStringBuilder.append(getSubscriptionModel());
    localStringBuilder.append(", customerModel=");
    localStringBuilder.append(getCustomerModel());
    localStringBuilder.append(", accountModel=");
    localStringBuilder.append(getAccountModel());
    localStringBuilder.append(", loginAccountModel=");
    localStringBuilder.append(getLoginAccountModel());
    localStringBuilder.append(", bankDataModel=");
    localStringBuilder.append(getBankDataModel());
    localStringBuilder.append(", creditCardModel=");
    localStringBuilder.append(getCreditCardModel());
    localStringBuilder.append(", prepaidTopupConfigurationModel=");
    localStringBuilder.append(getPrepaidTopupConfigurationModel());
    localStringBuilder.append(", simcardModels=");
    localStringBuilder.append(getSimcardModels());
    localStringBuilder.append(", brandTariffTypePropertyModel=");
    localStringBuilder.append(getBrandTariffTypePropertyModel());
    localStringBuilder.append(", thirdPartyServiceSettingsModel=");
    localStringBuilder.append(getThirdPartyServiceSettingsModel());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/box7/Box7Cache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */