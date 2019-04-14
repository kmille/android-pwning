package de.eplus.mappecc.client.android.common.network.piranha.model;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import de.eplus.mappecc.client.android.common.restclient.json.JSONModelType;

public class LoginTokenModel
  implements JSONModelType
{
  @SerializedName("tokenId")
  private String tokenId;
  
  public static LoginTokenModel getInstance(@Nullable String paramString)
  {
    LoginTokenModel localLoginTokenModel = new LoginTokenModel();
    localLoginTokenModel.tokenId = paramString;
    return localLoginTokenModel;
  }
  
  protected boolean canEqual(Object paramObject)
  {
    return paramObject instanceof LoginTokenModel;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof LoginTokenModel)) {
      return false;
    }
    Object localObject = (LoginTokenModel)paramObject;
    if (!((LoginTokenModel)localObject).canEqual(this)) {
      return false;
    }
    paramObject = getTokenId();
    localObject = ((LoginTokenModel)localObject).getTokenId();
    if (paramObject == null)
    {
      if (localObject != null) {
        return false;
      }
    }
    else if (!paramObject.equals(localObject)) {
      return false;
    }
    return true;
  }
  
  public String getTokenId()
  {
    return this.tokenId;
  }
  
  public int hashCode()
  {
    String str = getTokenId();
    int i;
    if (str == null) {
      i = 43;
    } else {
      i = str.hashCode();
    }
    return i + 59;
  }
  
  public void setTokenId(String paramString)
  {
    this.tokenId = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LoginTokenModel(tokenId=");
    localStringBuilder.append(getTokenId());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/LoginTokenModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */