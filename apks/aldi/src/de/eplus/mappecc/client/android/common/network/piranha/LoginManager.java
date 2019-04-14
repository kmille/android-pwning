package de.eplus.mappecc.client.android.common.network.piranha;

import android.support.annotation.NonNull;
import c.a.a;
import com.a.a.e;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.misc.Box7MiscManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.model.LoginTokenModel;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.smslogin.SmsLoginManager;
import de.eplus.mappecc.client.android.common.restclient.Box7RestApiLib;
import de.eplus.mappecc.client.android.common.restclient.LoginClient;
import de.eplus.mappecc.client.android.common.utils.DeviceUtils;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.UserPreferences;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import org.apache.a.c.h;
import org.joda.time.DateTime;

@Singleton
public class LoginManager
  implements ILoginManager
{
  private final Box7Cache box7Cache;
  private final Box7MiscManager box7MiscManager;
  private final MainThreadBus bus;
  private final DeviceUtils deviceUtils;
  private final IHigherLoginManager higherLoginManager;
  private final JsonUtil jsonUtil;
  private final Localizer localizer;
  private LoginClient loginClient;
  private final LoginHelper loginHelper;
  private final LoginPreferences loginPreferences;
  private final SimUtils simUtils;
  private final TimeoutPreferences timeoutPreferences;
  private final Timer timer;
  private boolean usePersistentCookie = true;
  private final UserPreferences userPreferences;
  
  @Inject
  public LoginManager(Box7RestApiLib paramBox7RestApiLib, LoginPreferences paramLoginPreferences, TimeoutPreferences paramTimeoutPreferences, MainThreadBus paramMainThreadBus, DeviceUtils paramDeviceUtils, Timer paramTimer, Box7Cache paramBox7Cache, Localizer paramLocalizer, SimUtils paramSimUtils, UserPreferences paramUserPreferences, Box7MiscManager paramBox7MiscManager, JsonUtil paramJsonUtil, LoginHelper paramLoginHelper, IHigherLoginManager paramIHigherLoginManager)
  {
    this.loginClient = paramBox7RestApiLib.getLoginClient();
    this.loginPreferences = paramLoginPreferences;
    this.timeoutPreferences = paramTimeoutPreferences;
    this.bus = paramMainThreadBus;
    this.box7MiscManager = paramBox7MiscManager;
    this.jsonUtil = paramJsonUtil;
    this.loginHelper = paramLoginHelper;
    this.higherLoginManager = paramIHigherLoginManager;
    this.deviceUtils = paramDeviceUtils;
    this.timer = paramTimer;
    this.box7Cache = paramBox7Cache;
    this.localizer = paramLocalizer;
    this.simUtils = paramSimUtils;
    this.userPreferences = paramUserPreferences;
  }
  
  private void deleteCredentialsAndCache()
  {
    this.loginPreferences.clear();
    this.timeoutPreferences.clear();
    this.box7Cache.clear();
  }
  
  private void doCookieLogin(final ILoginCallback paramILoginCallback)
  {
    a.b("entered...", new Object[0]);
    this.higherLoginManager.resetHigherLoginState();
    this.loginClient.doOptionalPersistentLogin().enqueue(new PiranhaCallback()
    {
      public void onFailure(Call paramAnonymousCall, IOException paramAnonymousIOException)
      {
        super.onFailure(paramAnonymousCall, paramAnonymousIOException);
        a.b("withResponse onFailure", new Object[0]);
        if (NetworkUtils.isNetworkError(paramAnonymousIOException))
        {
          paramILoginCallback.onAutomaticLoginFailure(-2);
          return;
        }
        LoginManager.access$502(LoginManager.this, false);
        LoginManager.this.doAutomaticLogin(paramILoginCallback);
      }
      
      public void onResponse(Call paramAnonymousCall, Response paramAnonymousResponse)
        throws IOException
      {
        StringBuilder localStringBuilder = new StringBuilder("withResponse ");
        localStringBuilder.append(paramAnonymousResponse.toString());
        a.b(localStringBuilder.toString(), new Object[0]);
        super.onResponse(paramAnonymousCall, paramAnonymousResponse);
        if ((paramAnonymousResponse.code() != 510) && (paramAnonymousResponse.code() != 503))
        {
          if (paramAnonymousResponse.isSuccessful())
          {
            LoginManager.this.loginPreferences.setNetworkLogin(true);
            paramAnonymousCall = LoginManager.this.extractLoginTokenModel(paramAnonymousResponse);
            LoginManager.this.loginPreferences.saveToken(paramAnonymousCall.getTokenId());
            paramILoginCallback.onAutomaticLoginSuccess();
            return;
          }
          LoginManager.access$502(LoginManager.this, false);
          LoginManager.this.doAutomaticLogin(paramILoginCallback);
          return;
        }
        paramILoginCallback.onAutomaticLoginMaintenanceMode();
      }
    });
  }
  
  private void doNetworkLogin(@NonNull final ILoginCallback paramILoginCallback)
  {
    a.b("**** doNetworkLogin() entered...", new Object[0]);
    this.higherLoginManager.resetHigherLoginState();
    this.loginClient.doAutoLogin().enqueue(new PiranhaCallback()
    {
      public void onFailure(@NonNull Call paramAnonymousCall, @NonNull IOException paramAnonymousIOException)
      {
        super.onFailure(paramAnonymousCall, paramAnonymousIOException);
        a.d("**** doNetworkLogin.onFailure() entered...", new Object[0]);
        a.a(paramAnonymousIOException);
        if (NetworkUtils.isNetworkError(paramAnonymousIOException))
        {
          paramILoginCallback.onAutomaticLoginFailure(-2);
          return;
        }
        LoginManager.this.doSMSLogin(paramILoginCallback);
      }
      
      public void onResponse(@NonNull Call paramAnonymousCall, @NonNull Response paramAnonymousResponse)
        throws IOException
      {
        super.onResponse(paramAnonymousCall, paramAnonymousResponse);
        paramAnonymousCall = new StringBuilder("**** doNetworkLogin.onResponse() entered... success: ");
        paramAnonymousCall.append(paramAnonymousResponse.isSuccessful());
        a.b(paramAnonymousCall.toString(), new Object[0]);
        if (paramAnonymousResponse.isSuccessful())
        {
          LoginManager.this.loginPreferences.setNetworkLogin(true);
          paramILoginCallback.onAutomaticLoginSuccess();
          LoginManager.this.loginPreferences.saveUsername("");
          LoginManager.this.loginPreferences.savePassword("");
          return;
        }
        LoginManager.this.doSMSLogin(paramILoginCallback);
      }
    });
  }
  
  private void doPasswordUsernameLogin(final String paramString1, final String paramString2, final boolean paramBoolean1, @NonNull final ILoginCallback paramILoginCallback, final boolean paramBoolean2)
  {
    a.b("**** doLogin() entered...", new Object[0]);
    saveUserIccid();
    if ((!h.a(paramString1)) && (!h.a(paramString2)))
    {
      this.higherLoginManager.resetHigherLoginState();
      this.loginClient.doLogin(paramString1, paramString2, paramBoolean1).enqueue(new PiranhaCallback()
      {
        public void onFailure(@NonNull Call paramAnonymousCall, @NonNull IOException paramAnonymousIOException)
        {
          super.onFailure(paramAnonymousCall, paramAnonymousIOException);
          a.d("**** doLogin.onFailure() entered...", new Object[0]);
          a.a(paramAnonymousIOException);
          if (NetworkUtils.isNetworkError(paramAnonymousIOException))
          {
            LoginManager.this.handlePasswordUsernameFailureCallback(paramILoginCallback, paramBoolean2, -2);
            return;
          }
          if (paramBoolean1)
          {
            LoginManager.this.doNetworkLogin(paramILoginCallback);
            return;
          }
          LoginManager.this.handlePasswordUsernameFailureCallback(paramILoginCallback, paramBoolean2, -1);
        }
        
        public void onResponse(@NonNull Call paramAnonymousCall, @NonNull Response paramAnonymousResponse)
          throws IOException
        {
          super.onResponse(paramAnonymousCall, paramAnonymousResponse);
          a.b("**** doLogin.onResponse() entered... ", new Object[0]);
          if ((paramAnonymousResponse.code() != 510) && (paramAnonymousResponse.code() != 503))
          {
            if (paramAnonymousResponse.isSuccessful())
            {
              paramAnonymousCall = LoginManager.this.extractLoginTokenModel(paramAnonymousResponse);
              if (h.b(paramAnonymousCall.getTokenId()))
              {
                paramAnonymousResponse = paramAnonymousResponse.headers().get("X-Tarifftype");
                LoginManager.this.loginHelper.saveLoginData(paramAnonymousCall, paramString1, paramString2, paramAnonymousResponse);
                if (paramBoolean1)
                {
                  LoginManager.this.timeoutPreferences.setAutoLogin(true);
                  LoginManager.this.timeoutPreferences.saveCredentialsStart(new DateTime().getMillis());
                }
                if (paramBoolean2)
                {
                  paramILoginCallback.onAutomaticLoginSuccess();
                  return;
                }
                paramILoginCallback.onLoginSuccess();
                return;
              }
              if (paramBoolean1) {
                LoginManager.this.doNetworkLogin(paramILoginCallback);
              }
            }
            else
            {
              int i;
              try
              {
                i = ((Integer)e.b(paramAnonymousResponse.headers().get("X-returncode")).a(-..Lambda.vqzP2gGhODOAlWi0ptfNPeFmFp8.INSTANCE).c(Integer.valueOf(0))).intValue();
              }
              catch (NumberFormatException paramAnonymousCall)
              {
                a.e("backend creating weird errors", new Object[] { paramAnonymousCall });
                i = 0;
              }
              if (i != 0)
              {
                LoginManager.this.handlePasswordUsernameFailureCallback(paramILoginCallback, paramBoolean2, i);
                return;
              }
            }
            LoginManager.this.handlePasswordUsernameFailureCallback(paramILoginCallback, paramBoolean2, -1);
            return;
          }
          paramILoginCallback.onMaintenanceMode();
        }
      });
      return;
    }
    handlePasswordUsernameFailureCallback(paramILoginCallback, paramBoolean2, -1);
  }
  
  private LoginTokenModel extractLoginTokenModel(Response paramResponse)
  {
    return LoginHelper.extractLoginTokenModel(paramResponse);
  }
  
  private void handlePasswordUsernameFailureCallback(@NonNull ILoginCallback paramILoginCallback, boolean paramBoolean, @NonNull int paramInt)
  {
    if (paramBoolean)
    {
      paramILoginCallback.onAutomaticLoginFailure(paramInt);
      return;
    }
    paramILoginCallback.onLoginFailure(paramInt);
  }
  
  public void deleteCredentialsCacheAndCookie()
  {
    this.loginClient.clearPersistentCookie();
    deleteCredentialsAndCache();
  }
  
  public void doAutomaticLogin(@NonNull ILoginCallback paramILoginCallback)
  {
    Object localObject = this.loginPreferences.loadUsername();
    a.b("Username: ".concat(String.valueOf(localObject)), new Object[0]);
    String str = this.loginPreferences.loadPassword();
    this.higherLoginManager.resetHigherLoginState();
    saveUserIccid();
    if (isCookieLoginPossible())
    {
      doCookieLogin(paramILoginCallback);
      return;
    }
    if (h.a(new CharSequence[] { localObject })) {
      if ((h.a(new CharSequence[] { str })) && (this.timeoutPreferences.isAutoLogin()))
      {
        a.b("**** doAutomaticLogin(): Login with existing credentials... username: ".concat(String.valueOf(localObject)), new Object[0]);
        doPasswordUsernameLogin((String)localObject, str, true, paramILoginCallback, true);
        return;
      }
    }
    if (!this.deviceUtils.isWifiConnected())
    {
      a.b("**** doAutomaticLogin(): Login with network mode...", new Object[0]);
      doNetworkLogin(paramILoginCallback);
      return;
    }
    localObject = new SmsLoginManager(this.simUtils, this.box7MiscManager, this.loginPreferences, this.loginClient, this.localizer, this.timer, this.box7Cache, this.jsonUtil, this.timeoutPreferences, this.bus, this.loginHelper, this.higherLoginManager);
    if (((SmsLoginManager)localObject).isLoginPossible())
    {
      a.b("**** doAutomaticLogin(): Login with SMS login...", new Object[0]);
      ((SmsLoginManager)localObject).doLogin(paramILoginCallback);
      return;
    }
    paramILoginCallback.onAutomaticLoginNotPossible();
  }
  
  public void doLogin(String paramString1, String paramString2, boolean paramBoolean, @NonNull ILoginCallback paramILoginCallback)
  {
    doPasswordUsernameLogin(paramString1, paramString2, paramBoolean, paramILoginCallback, false);
  }
  
  public void doLogout(@NonNull final ILogoutCallback paramILogoutCallback)
  {
    a.b("**** doLogout() entered...", new Object[0]);
    saveUserIccid();
    this.loginClient.doLogout().enqueue(new PiranhaCallback()
    {
      public void onFailure(@NonNull Call paramAnonymousCall, @NonNull IOException paramAnonymousIOException)
      {
        super.onFailure(paramAnonymousCall, paramAnonymousIOException);
        a.d("**** doLogout.onFailure() entered...", new Object[0]);
        a.a(paramAnonymousIOException);
        LoginManager.this.higherLoginManager.resetHigherLoginState();
        LoginManager.this.loginPreferences.clear();
        LoginManager.this.timeoutPreferences.clear();
        LoginManager.this.box7Cache.clear();
        LoginManager.this.deleteCredentialsAndCache();
        paramILogoutCallback.onLogoutFinished();
      }
      
      public void onResponse(@NonNull Call paramAnonymousCall, @NonNull Response paramAnonymousResponse)
        throws IOException
      {
        super.onResponse(paramAnonymousCall, paramAnonymousResponse);
        a.b("**** doLogout.onResponse() entered...", new Object[0]);
        LoginManager.this.higherLoginManager.resetHigherLoginState();
        LoginManager.this.loginPreferences.clear();
        LoginManager.this.timeoutPreferences.clear();
        LoginManager.this.box7Cache.clear();
        LoginManager.this.deleteCredentialsAndCache();
        paramILogoutCallback.onLogoutFinished();
      }
    });
  }
  
  public void doSMSLogin(@NonNull ILoginCallback paramILoginCallback)
  {
    new SmsLoginManager(this.simUtils, this.box7MiscManager, this.loginPreferences, this.loginClient, this.localizer, this.timer, this.box7Cache, this.jsonUtil, this.timeoutPreferences, this.bus, this.loginHelper, this.higherLoginManager).doLogin(paramILoginCallback);
  }
  
  public boolean isCookieLoginPossible()
  {
    return (this.usePersistentCookie) && (this.loginClient.isPersistentCookieValid());
  }
  
  public void reset(Box7RestApiLib paramBox7RestApiLib)
  {
    this.loginClient = paramBox7RestApiLib.getLoginClient();
  }
  
  public void saveUserIccid()
  {
    a.b("entered...", new Object[0]);
    StringBuilder localStringBuilder;
    if ((this.userPreferences.getSimIccid1() == null) || (this.userPreferences.getSimIccid1().equals("")) || (!this.userPreferences.getSimIccid1().equals(this.simUtils.getIccidSim1())))
    {
      localStringBuilder = new StringBuilder("save iccid for a user preference, slot 1 ");
      localStringBuilder.append(this.simUtils.getIccidSim1());
      a.b(localStringBuilder.toString(), new Object[0]);
      this.userPreferences.setSimIccid1(this.simUtils.getIccidSim1());
    }
    if ((this.simUtils.isDualSIM()) && ((this.userPreferences.getSimIccid2() == null) || (!this.simUtils.getIccidSim2().equals(this.userPreferences.getSimIccid2()))))
    {
      localStringBuilder = new StringBuilder("save iccid for a user preference, slot 2 ");
      localStringBuilder.append(this.simUtils.getIccidSim2());
      a.b(localStringBuilder.toString(), new Object[0]);
      this.userPreferences.setSimIccid2(this.simUtils.getIccidSim2());
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/LoginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */