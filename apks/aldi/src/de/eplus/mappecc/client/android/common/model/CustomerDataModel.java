package de.eplus.mappecc.client.android.common.model;

import android.support.annotation.Nullable;
import com.a.a.b;
import com.a.a.e;
import com.a.a.f;
import com.google.common.collect.m;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.restclient.model.AccountHolderModel;
import de.eplus.mappecc.client.android.common.restclient.model.AccountModel;
import de.eplus.mappecc.client.android.common.restclient.model.AddressModel;
import de.eplus.mappecc.client.android.common.restclient.model.BankDataModel;
import de.eplus.mappecc.client.android.common.restclient.model.ContactNumberModel;
import de.eplus.mappecc.client.android.common.restclient.model.CreditCardModel;
import de.eplus.mappecc.client.android.common.restclient.model.CreditCardModel.ProviderEnum;
import de.eplus.mappecc.client.android.common.restclient.model.CustomerModel;
import de.eplus.mappecc.client.android.common.restclient.model.ForbiddenUseCaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.a.c.h;
import org.joda.time.DateTime;

public class CustomerDataModel
{
  private AccountModel accountModel;
  private BankDataModel bankDataModel;
  private CreditCardModel creditCardModel;
  private CustomerModel customerModel;
  private Map<String, ForbiddenUseCaseModel> forbiddenUseCases;
  private final Localizer localizer;
  
  public CustomerDataModel(CustomerModel paramCustomerModel, Localizer paramLocalizer)
  {
    this.customerModel = paramCustomerModel;
    this.localizer = paramLocalizer;
    this.forbiddenUseCases = ((Map)f.a(getForbiddenUsecases()).b(-..Lambda.CustomerDataModel.QQcrsoYj0d5m2zTiHeLACS8FisY.INSTANCE).a(b.a(-..Lambda.CustomerDataModel.7rsF2WIvqS9fLTOM29sutG1BDBc.INSTANCE, -..Lambda.CustomerDataModel.QEWNeCWRNGaUyoLQD2s6_yAA_SM.INSTANCE)));
  }
  
  private Map<String, ForbiddenUseCaseModel> initForbiddenUseCases(@Nullable Map<String, ForbiddenUseCaseModel>... paramVarArgs)
  {
    if (paramVarArgs != null) {
      return (Map)f.a(paramVarArgs).b(-..Lambda.CustomerDataModel.auJZ8hrTxgKTqPg9OxkWoSSSMzU.INSTANCE).a(b.a(-..Lambda.CustomerDataModel.FU9kXmRgznLs21Fbmo-eFt9VOmI.INSTANCE, -..Lambda.CustomerDataModel.LL_g6lxL4pTuMd2CkQmGt1vUxa8.INSTANCE));
    }
    return new HashMap();
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof CustomerDataModel;
  }
  
  public CustomerDataModel clone()
  {
    return new CustomerDataModel(this.customerModel, this.localizer);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof CustomerDataModel)) {
      return false;
    }
    paramObject = (CustomerDataModel)paramObject;
    if (!((CustomerDataModel)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject1 = getLocalizer();
    Object localObject2 = ((CustomerDataModel)paramObject).getLocalizer();
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
    localObject2 = ((CustomerDataModel)paramObject).getCustomerModel();
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
    localObject2 = ((CustomerDataModel)paramObject).getAccountModel();
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
    localObject2 = ((CustomerDataModel)paramObject).getBankDataModel();
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
    localObject2 = ((CustomerDataModel)paramObject).getCreditCardModel();
    if (localObject1 == null)
    {
      if (localObject2 != null) {
        return false;
      }
    }
    else if (!localObject1.equals(localObject2)) {
      return false;
    }
    localObject1 = getForbiddenUsecases();
    paramObject = ((CustomerDataModel)paramObject).getForbiddenUsecases();
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
    if (this.accountModel == null)
    {
      e locale = f.a(getCustomerModel().getAccounts()).a(-..Lambda.CustomerDataModel.WIHXN1QWMXlLarsa4pONlbqFoUk.INSTANCE).a(-..Lambda.nwZd2AxuNXRwCmA8NcfwfGoH_Mg.INSTANCE).e();
      if (locale.b()) {
        if (locale.a != null) {
          this.accountModel = ((AccountModel)locale.a);
        } else {
          throw new NoSuchElementException("No value present");
        }
      }
    }
    return this.accountModel;
  }
  
  public String getAccountNumber()
  {
    if ((getBankDataModel() != null) && (h.b(getBankDataModel().getIban())))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.localizer.getString(2131690133));
      localStringBuilder.append(" ");
      localStringBuilder.append(getBankDataModel().getIban());
      return localStringBuilder.toString();
    }
    return null;
  }
  
  public String getAccountOwner()
  {
    if ((getBankDataModel() != null) && (getBankDataModel().getAccountHolder() != null) && (h.b(this.bankDataModel.getAccountHolder().getAccountHolderName()))) {
      return this.localizer.getString(2131689963, m.a("depositor", h.c(this.bankDataModel.getAccountHolder().getAccountHolderName())));
    }
    return null;
  }
  
  public BankDataModel getBankDataModel()
  {
    if ((this.bankDataModel == null) && (getAccountModel() != null)) {
      this.bankDataModel = this.accountModel.getBankData();
    }
    return this.bankDataModel;
  }
  
  public String getBankIdentifier()
  {
    if ((getBankDataModel() != null) && (h.b(getBankDataModel().getBankName()))) {
      return this.localizer.getString(2131689964, m.a("bic", h.c(this.bankDataModel.getBic()), "bankName", h.c(this.bankDataModel.getBankName())));
    }
    return null;
  }
  
  public String getCreditCardCompany()
  {
    if ((getCreditCardModel() != null) && (getCreditCardModel().getProvider() != null))
    {
      String str = String.format("label_activity_ncm_paymentcc_company_%s_name", new Object[] { getCreditCardModel().getProvider().getValue() });
      return this.localizer.getString(2131689957, m.a("company", this.localizer.getStringOrDefault(str)));
    }
    return null;
  }
  
  public String getCreditCardExpirationDate()
  {
    if ((getCreditCardModel() != null) && (getCreditCardModel().getExpiryMonth() != null) && (getCreditCardModel().getExpiryYear() != null)) {
      return this.localizer.getString(2131689958, m.a("expirationMonth", Integer.toString(this.creditCardModel.getExpiryMonth().intValue()), "expirationYear", Integer.toString(this.creditCardModel.getExpiryYear().intValue())));
    }
    return null;
  }
  
  public String getCreditCardHolder()
  {
    if ((getCreditCardModel() != null) && (getCreditCardModel().getCreditCardHolder() != null)) {
      return this.localizer.getString(2131689960, m.a("creditCardHolder", getCreditCardModel().getCreditCardHolder()));
    }
    return null;
  }
  
  public CreditCardModel getCreditCardModel()
  {
    if ((this.creditCardModel == null) && (getAccountModel() != null)) {
      this.creditCardModel = this.accountModel.getCreditCard();
    }
    return this.creditCardModel;
  }
  
  public String getCreditCardNumber()
  {
    if ((getCreditCardModel() != null) && (h.b(getCreditCardModel().getCreditCardNumber()))) {
      return this.localizer.getString(2131689961, m.a("creditCardNumber", this.creditCardModel.getCreditCardNumber()));
    }
    return null;
  }
  
  public String getCreditCardRegisterDate()
  {
    if ((getCreditCardModel() != null) && (getCreditCardModel().getRegisteredAt() != null)) {
      return this.localizer.getString(2131689962, m.a("registerdate", getCreditCardModel().getRegisteredAt().toString("dd.MM.yyyy")));
    }
    return null;
  }
  
  public CustomerModel getCustomerModel()
  {
    return this.customerModel;
  }
  
  public Map<String, ForbiddenUseCaseModel> getForbiddenUsecases()
  {
    if (this.forbiddenUseCases == null)
    {
      Object localObject1 = this.customerModel;
      Object localObject3 = null;
      if (localObject1 != null) {
        localObject1 = this.customerModel.getForbiddenUseCases();
      } else {
        localObject1 = null;
      }
      Object localObject2 = localObject3;
      if (this.customerModel != null)
      {
        localObject2 = localObject3;
        if (this.customerModel.getAccounts() != null) {
          localObject2 = (Map)f.a(this.customerModel.getAccounts()).a(-..Lambda.xRNjGuhRNLu7wSg3S9wuTtAFZ_k.INSTANCE).a(-..Lambda.aNki7G5SDRRSGqW8cO3tP598cuk.INSTANCE).a(-..Lambda.CustomerDataModel.RaiFIgacRu8dnDCoyMmIDsb0ND4.INSTANCE).e().c(null);
        }
      }
      this.forbiddenUseCases = initForbiddenUseCases(new Map[] { localObject1, localObject2 });
    }
    return this.forbiddenUseCases;
  }
  
  public Localizer getLocalizer()
  {
    return this.localizer;
  }
  
  public int hashCode()
  {
    Object localObject = getLocalizer();
    int i1 = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    localObject = getCustomerModel();
    int j;
    if (localObject == null) {
      j = 43;
    } else {
      j = localObject.hashCode();
    }
    localObject = getAccountModel();
    int k;
    if (localObject == null) {
      k = 43;
    } else {
      k = localObject.hashCode();
    }
    localObject = getBankDataModel();
    int m;
    if (localObject == null) {
      m = 43;
    } else {
      m = localObject.hashCode();
    }
    localObject = getCreditCardModel();
    int n;
    if (localObject == null) {
      n = 43;
    } else {
      n = localObject.hashCode();
    }
    localObject = getForbiddenUsecases();
    if (localObject != null) {
      i1 = localObject.hashCode();
    }
    return (((((i + 59) * 59 + j) * 59 + k) * 59 + m) * 59 + n) * 59 + i1;
  }
  
  public void setAccountModel(AccountModel paramAccountModel)
  {
    this.accountModel = paramAccountModel;
  }
  
  public void setBankDataModel(BankDataModel paramBankDataModel)
  {
    this.bankDataModel = paramBankDataModel;
  }
  
  public void setContactAddress(AddressModel paramAddressModel)
  {
    this.customerModel.setContactAddress(paramAddressModel);
  }
  
  public void setContactPhoneNumber(ContactNumberModel paramContactNumberModel)
  {
    this.customerModel.setContactPhoneNumber(paramContactNumberModel);
  }
  
  public void setCreditCardModel(CreditCardModel paramCreditCardModel)
  {
    this.creditCardModel = paramCreditCardModel;
  }
  
  public void setCustomerModel(CustomerModel paramCustomerModel)
  {
    this.customerModel = paramCustomerModel;
  }
  
  public void setForbiddenUseCases(Map<String, ForbiddenUseCaseModel> paramMap)
  {
    this.forbiddenUseCases = paramMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CustomerDataModel(localizer=");
    localStringBuilder.append(getLocalizer());
    localStringBuilder.append(", customerModel=");
    localStringBuilder.append(getCustomerModel());
    localStringBuilder.append(", accountModel=");
    localStringBuilder.append(getAccountModel());
    localStringBuilder.append(", bankDataModel=");
    localStringBuilder.append(getBankDataModel());
    localStringBuilder.append(", creditCardModel=");
    localStringBuilder.append(getCreditCardModel());
    localStringBuilder.append(", forbiddenUseCases=");
    localStringBuilder.append(getForbiddenUsecases());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/model/CustomerDataModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */