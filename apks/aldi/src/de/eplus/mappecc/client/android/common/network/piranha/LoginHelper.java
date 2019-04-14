package de.eplus.mappecc.client.android.common.network.piranha;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import c.a.a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.eplus.mappecc.client.android.common.network.piranha.model.LoginTokenModel;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.a.c.h;

public class LoginHelper
{
  private final LoginPreferences loginPreferences;
  
  public LoginHelper(LoginPreferences paramLoginPreferences)
  {
    this.loginPreferences = paramLoginPreferences;
  }
  
  public static LoginTokenModel extractLoginTokenModel(Response paramResponse)
  {
    try
    {
      paramResponse = paramResponse.body().string();
      paramResponse = (LoginTokenModel)new GsonBuilder().create().fromJson(paramResponse, LoginTokenModel.class);
    }
    catch (Exception paramResponse)
    {
      Object localObject;
      for (;;) {}
    }
    paramResponse = null;
    localObject = paramResponse;
    if (paramResponse == null) {
      localObject = new LoginTokenModel();
    }
    return (LoginTokenModel)localObject;
  }
  
  public void saveLoginData(@NonNull LoginTokenModel paramLoginTokenModel, @Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3)
  {
    if ((h.b(paramString1)) && (h.b(paramString2)))
    {
      a.b("saveLoginData(): Login successfull with new token received... saving username: ".concat(String.valueOf(paramString1)), new Object[0]);
      this.loginPreferences.saveUsername(paramString1);
      this.loginPreferences.savePassword(paramString2);
    }
    if (h.b(paramString3)) {
      this.loginPreferences.saveTariffType(paramString3);
    }
    this.loginPreferences.saveToken(paramLoginTokenModel.getTokenId());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/LoginHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */