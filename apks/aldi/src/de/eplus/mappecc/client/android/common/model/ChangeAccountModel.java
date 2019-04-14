package de.eplus.mappecc.client.android.common.model;

import de.eplus.mappecc.client.android.common.restclient.model.AccountHolderModel.SalutationEnum;
import java.io.Serializable;

public class ChangeAccountModel
  implements Serializable
{
  private String city;
  private String email;
  private String houseNumber;
  private String name;
  private AccountHolderModel.SalutationEnum salutation;
  private String street;
  private String zip;
  
  public ChangeAccountModel(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, AccountHolderModel.SalutationEnum paramSalutationEnum)
  {
    this.name = paramString1;
    this.email = paramString2;
    this.street = paramString3;
    this.houseNumber = paramString4;
    this.zip = paramString5;
    this.city = paramString6;
    this.salutation = paramSalutationEnum;
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof ChangeAccountModel;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ChangeAccountModel)) {
      return false;
    }
    paramObject = (ChangeAccountModel)paramObject;
    if (!((ChangeAccountModel)paramObject).canEqual(this)) {
      return false;
    }
    Object localObject = getName();
    String str = ((ChangeAccountModel)paramObject).getName();
    if (localObject == null)
    {
      if (str != null) {
        return false;
      }
    }
    else if (!localObject.equals(str)) {
      return false;
    }
    localObject = getEmail();
    str = ((ChangeAccountModel)paramObject).getEmail();
    if (localObject == null)
    {
      if (str != null) {
        return false;
      }
    }
    else if (!localObject.equals(str)) {
      return false;
    }
    localObject = getStreet();
    str = ((ChangeAccountModel)paramObject).getStreet();
    if (localObject == null)
    {
      if (str != null) {
        return false;
      }
    }
    else if (!localObject.equals(str)) {
      return false;
    }
    localObject = getHouseNumber();
    str = ((ChangeAccountModel)paramObject).getHouseNumber();
    if (localObject == null)
    {
      if (str != null) {
        return false;
      }
    }
    else if (!localObject.equals(str)) {
      return false;
    }
    localObject = getZip();
    str = ((ChangeAccountModel)paramObject).getZip();
    if (localObject == null)
    {
      if (str != null) {
        return false;
      }
    }
    else if (!localObject.equals(str)) {
      return false;
    }
    localObject = getCity();
    str = ((ChangeAccountModel)paramObject).getCity();
    if (localObject == null)
    {
      if (str != null) {
        return false;
      }
    }
    else if (!localObject.equals(str)) {
      return false;
    }
    localObject = getSalutation();
    paramObject = ((ChangeAccountModel)paramObject).getSalutation();
    if (localObject == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!localObject.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  public String getCity()
  {
    return this.city;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public String getHouseNumber()
  {
    return this.houseNumber;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public AccountHolderModel.SalutationEnum getSalutation()
  {
    return this.salutation;
  }
  
  public String getStreet()
  {
    return this.street;
  }
  
  public String getZip()
  {
    return this.zip;
  }
  
  public int hashCode()
  {
    Object localObject = getName();
    int i2 = 43;
    int i;
    if (localObject == null) {
      i = 43;
    } else {
      i = localObject.hashCode();
    }
    localObject = getEmail();
    int j;
    if (localObject == null) {
      j = 43;
    } else {
      j = localObject.hashCode();
    }
    localObject = getStreet();
    int k;
    if (localObject == null) {
      k = 43;
    } else {
      k = localObject.hashCode();
    }
    localObject = getHouseNumber();
    int m;
    if (localObject == null) {
      m = 43;
    } else {
      m = localObject.hashCode();
    }
    localObject = getZip();
    int n;
    if (localObject == null) {
      n = 43;
    } else {
      n = localObject.hashCode();
    }
    localObject = getCity();
    int i1;
    if (localObject == null) {
      i1 = 43;
    } else {
      i1 = localObject.hashCode();
    }
    localObject = getSalutation();
    if (localObject != null) {
      i2 = localObject.hashCode();
    }
    return ((((((i + 59) * 59 + j) * 59 + k) * 59 + m) * 59 + n) * 59 + i1) * 59 + i2;
  }
  
  public void setCity(String paramString)
  {
    this.city = paramString;
  }
  
  public void setEmail(String paramString)
  {
    this.email = paramString;
  }
  
  public void setHouseNumber(String paramString)
  {
    this.houseNumber = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setSalutation(AccountHolderModel.SalutationEnum paramSalutationEnum)
  {
    this.salutation = paramSalutationEnum;
  }
  
  public void setStreet(String paramString)
  {
    this.street = paramString;
  }
  
  public void setZip(String paramString)
  {
    this.zip = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ChangeAccountModel(name=");
    localStringBuilder.append(getName());
    localStringBuilder.append(", email=");
    localStringBuilder.append(getEmail());
    localStringBuilder.append(", street=");
    localStringBuilder.append(getStreet());
    localStringBuilder.append(", houseNumber=");
    localStringBuilder.append(getHouseNumber());
    localStringBuilder.append(", zip=");
    localStringBuilder.append(getZip());
    localStringBuilder.append(", city=");
    localStringBuilder.append(getCity());
    localStringBuilder.append(", salutation=");
    localStringBuilder.append(getSalutation());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/model/ChangeAccountModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */