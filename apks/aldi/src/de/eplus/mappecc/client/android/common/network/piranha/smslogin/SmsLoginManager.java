package de.eplus.mappecc.client.android.common.network.piranha.smslogin;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import c.a.a;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.squareup.otto.Subscribe;
import de.eplus.mappecc.client.android.common.base.B2PApplication;
import de.eplus.mappecc.client.android.common.base.IB2pView;
import de.eplus.mappecc.client.android.common.broadcastreceiver.B2PSMSBroadcastReceiver;
import de.eplus.mappecc.client.android.common.broadcastreceiver.B2PSMSBroadcastReceiver.Listener;
import de.eplus.mappecc.client.android.common.eventbus.MainThreadBus;
import de.eplus.mappecc.client.android.common.eventbus.TimeoutEvent;
import de.eplus.mappecc.client.android.common.network.box7.Box7Cache;
import de.eplus.mappecc.client.android.common.network.box7.Box7Callback;
import de.eplus.mappecc.client.android.common.network.box7.Box7Result;
import de.eplus.mappecc.client.android.common.network.box7.misc.Box7MiscManager;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.ILoginCallback;
import de.eplus.mappecc.client.android.common.network.piranha.INewLoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.LoginHelper;
import de.eplus.mappecc.client.android.common.network.piranha.PiranhaCallback;
import de.eplus.mappecc.client.android.common.network.piranha.model.LoginTokenModel;
import de.eplus.mappecc.client.android.common.network.piranha.model.SMSLoginModel;
import de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin.IHigherLoginManager;
import de.eplus.mappecc.client.android.common.network.piranha.model.json.OutputConverter;
import de.eplus.mappecc.client.android.common.network.piranha.model.pojo.Callback;
import de.eplus.mappecc.client.android.common.network.piranha.model.pojo.Input;
import de.eplus.mappecc.client.android.common.network.piranha.model.pojo.Output;
import de.eplus.mappecc.client.android.common.restclient.LoginClient;
import de.eplus.mappecc.client.android.common.restclient.json.DateTimeTypeConverter;
import de.eplus.mappecc.client.android.common.restclient.model.IccIdConversionModel;
import de.eplus.mappecc.client.android.common.utils.JsonUtil;
import de.eplus.mappecc.client.android.common.utils.NetworkUtils;
import de.eplus.mappecc.client.android.common.utils.SimUtils;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.a.c.h;
import org.joda.time.DateTime;
import org.json.JSONObject;

public class SmsLoginManager
  implements INewLoginManager
{
  private B2PSMSBroadcastReceiver b2PSMSBroadcastReceiver;
  private final Box7Cache box7Cache;
  private final Box7MiscManager box7MiscManager;
  private final IHigherLoginManager higherLoginManager;
  private boolean isRestartRequest = true;
  private final JsonUtil jsonUtil;
  private final Localizer localizer;
  private ILoginCallback loginCallback;
  private final LoginClient loginClient;
  private final LoginHelper loginHelper;
  private final LoginPreferences loginPreferences;
  private final MainThreadBus mainThreadBus;
  private String msisdn;
  private final SimUtils simUtils;
  private SMSLoginModel smsLoginModel;
  private final TimeoutPreferences timeoutPreferences;
  private final Timer timer;
  
  public SmsLoginManager(SimUtils paramSimUtils, Box7MiscManager paramBox7MiscManager, LoginPreferences paramLoginPreferences, LoginClient paramLoginClient, Localizer paramLocalizer, Timer paramTimer, Box7Cache paramBox7Cache, JsonUtil paramJsonUtil, TimeoutPreferences paramTimeoutPreferences, MainThreadBus paramMainThreadBus, LoginHelper paramLoginHelper, IHigherLoginManager paramIHigherLoginManager)
  {
    this.simUtils = paramSimUtils;
    this.box7MiscManager = paramBox7MiscManager;
    this.loginPreferences = paramLoginPreferences;
    this.loginClient = paramLoginClient;
    this.localizer = paramLocalizer;
    this.timer = paramTimer;
    this.box7Cache = paramBox7Cache;
    this.jsonUtil = paramJsonUtil;
    this.timeoutPreferences = paramTimeoutPreferences;
    this.mainThreadBus = paramMainThreadBus;
    this.loginHelper = paramLoginHelper;
    this.higherLoginManager = paramIHigherLoginManager;
  }
  
  private void doSMSLogin_finish(@NonNull final ILoginCallback paramILoginCallback, @NonNull String paramString)
  {
    a.b("**** doSMSLogin_finish() entered...", new Object[0]);
    if ((this.smsLoginModel != null) && (!h.a(this.msisdn)) && (!h.a(paramString)))
    {
      ((Callback)this.smsLoginModel.getCallbacks().get(0)).getIDTokenInput().setValue(paramString);
      this.loginClient.doSMSLogin_finish_piranha(this.msisdn, this.jsonUtil.getJsonObject(this.smsLoginModel).toString()).enqueue(new PiranhaCallback()
      {
        public void onFailure(@NonNull Call paramAnonymousCall, @NonNull IOException paramAnonymousIOException)
        {
          super.onFailure(paramAnonymousCall, paramAnonymousIOException);
          a.d("**** doSMSLogin_finish.onFailure() entered...", new Object[0]);
          a.a(paramAnonymousIOException);
          if (NetworkUtils.isNetworkError(paramAnonymousIOException)) {
            SmsLoginManager.this.smsLoginFailed(-2);
          }
          SmsLoginManager.this.smsLoginFailed(-3);
        }
        
        public void onResponse(@NonNull Call paramAnonymousCall, @NonNull Response paramAnonymousResponse)
          throws IOException
        {
          super.onResponse(paramAnonymousCall, paramAnonymousResponse);
          paramAnonymousCall = new StringBuilder("*** doSMSLogin_finish.onResponse() entered... sucess: ");
          paramAnonymousCall.append(paramAnonymousResponse.isSuccessful());
          a.b(paramAnonymousCall.toString(), new Object[0]);
          if (!paramAnonymousResponse.isSuccessful())
          {
            SmsLoginManager.this.smsLoginFailed(-3);
            return;
          }
          paramAnonymousCall = paramAnonymousResponse.body().string();
          GsonBuilder localGsonBuilder = new GsonBuilder();
          localGsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
          localGsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeTypeConverter());
          paramAnonymousCall = (LoginTokenModel)localGsonBuilder.create().fromJson(paramAnonymousCall, LoginTokenModel.class);
          paramAnonymousResponse = paramAnonymousResponse.headers().get("X-Tarifftype");
          if ((paramAnonymousCall != null) && (h.b(paramAnonymousCall.getTokenId())))
          {
            if (h.b(SmsLoginManager.this.msisdn))
            {
              a.b("doSMSLogin_finish.onResponse(): Login successfull with new token received...", new Object[0]);
              SmsLoginManager.this.loginPreferences.saveMsisdn(SmsLoginManager.this.msisdn);
            }
            else
            {
              a.b("doSMSLogin_finish.onResponse(): Login successfull, old token reused...", new Object[0]);
            }
            if (h.b(paramAnonymousResponse)) {
              SmsLoginManager.this.loginPreferences.saveTariffType(paramAnonymousResponse);
            }
            SmsLoginManager.this.loginPreferences.saveToken(paramAnonymousCall.getTokenId());
            paramILoginCallback.onAutomaticLoginSuccess();
            return;
          }
          a.e("doSMSLogin_finish.onResponse(): Broken Login Response...", new Object[0]);
          SmsLoginManager.this.smsLoginFailed(-3);
        }
      });
      return;
    }
    a.e("something went wrong", new Object[0]);
    smsLoginFailed(-3);
  }
  
  private void doSMSLogin_start(String paramString, @NonNull final ILoginCallback paramILoginCallback)
  {
    a.b("**** doSMSLogin_start() entered... msisdn: ".concat(String.valueOf(paramString)), new Object[0]);
    startSmsReceiver(paramILoginCallback);
    this.loginClient.doSMSLogin_start_piranha(paramString).enqueue(new PiranhaCallback()
    {
      public void onFailure(@NonNull Call paramAnonymousCall, @NonNull IOException paramAnonymousIOException)
      {
        super.onFailure(paramAnonymousCall, paramAnonymousIOException);
        a.d("**** doSMSLogin_start.onFailure() entered...", new Object[0]);
        a.a(paramAnonymousIOException);
        if (NetworkUtils.isNetworkError(paramAnonymousIOException))
        {
          paramILoginCallback.onAutomaticLoginFailure(-2);
          return;
        }
        paramILoginCallback.onSmsLoginStartFailure();
      }
      
      public void onResponse(@NonNull Call paramAnonymousCall, @NonNull Response paramAnonymousResponse)
        throws IOException
      {
        super.onResponse(paramAnonymousCall, paramAnonymousResponse);
        paramAnonymousCall = new StringBuilder("**** doSMSLogin_start.onResponse() entered... success: ");
        paramAnonymousCall.append(paramAnonymousResponse.isSuccessful());
        a.b(paramAnonymousCall.toString(), new Object[0]);
        if (!paramAnonymousResponse.isSuccessful())
        {
          paramILoginCallback.onSmsLoginStartFailure();
          SmsLoginManager.this.unregisterSMSReceiver();
          return;
        }
        paramAnonymousCall = paramAnonymousResponse.body().string();
        a.b("doSMSLogin_start.onResponse(): withResponse: ".concat(String.valueOf(paramAnonymousCall)), new Object[0]);
        Object localObject = new GsonBuilder();
        ((GsonBuilder)localObject).setLongSerializationPolicy(LongSerializationPolicy.STRING);
        ((GsonBuilder)localObject).registerTypeAdapter(DateTime.class, new DateTimeTypeConverter());
        ((GsonBuilder)localObject).registerTypeAdapter(Output.class, new OutputConverter());
        localObject = ((GsonBuilder)localObject).create();
        SmsLoginManager.access$902(SmsLoginManager.this, (SMSLoginModel)((Gson)localObject).fromJson(paramAnonymousCall, SMSLoginModel.class));
        if (SmsLoginManager.this.smsLoginModel.getCallbacks().isEmpty())
        {
          a.b("doSMSLogin_start.onResponse(): User already logged in - goToSepaConfirm.", new Object[0]);
          paramAnonymousCall = (LoginTokenModel)((Gson)localObject).fromJson(paramAnonymousCall, LoginTokenModel.class);
          paramAnonymousResponse = paramAnonymousResponse.headers().get("X-Tarifftype");
          if ((paramAnonymousCall != null) && (h.b(paramAnonymousCall.getTokenId())))
          {
            SmsLoginManager.this.loginHelper.saveLoginData(paramAnonymousCall, null, null, paramAnonymousResponse);
            paramILoginCallback.onAutomaticLoginSuccess();
          }
          else
          {
            paramILoginCallback.onSmsLoginStartFailure();
          }
          SmsLoginManager.this.unregisterSMSReceiver();
          return;
        }
        a.b("doSMSLogin_start.onResponse(): SMS Login start successfull. Waiting for SMS ...", new Object[0]);
        SmsLoginManager.this.timer.startTimeout(2, SmsLoginManager.this.localizer.getLong(2131691380, 120L) * 1000L);
      }
    });
  }
  
  private void initB2PSMSBroadcastReceiver(@NonNull final ILoginCallback paramILoginCallback)
  {
    paramILoginCallback = new B2PSMSBroadcastReceiver.Listener()
    {
      public void onTimeOut()
      {
        SmsLoginManager.this.smsLoginFailed(-3);
        SmsLoginManager.this.unregisterSMSReceiver();
      }
      
      public void onTokenReceived(@NonNull String paramAnonymousString)
      {
        SmsLoginManager.this.unregisterSMSReceiver();
        SmsLoginManager.this.doSMSLogin_finish(paramILoginCallback, paramAnonymousString);
      }
    };
    this.b2PSMSBroadcastReceiver = new B2PSMSBroadcastReceiver();
    this.b2PSMSBroadcastReceiver.setListener(paramILoginCallback);
    B2PApplication.getApplicationContextGlobal().registerReceiver(this.b2PSMSBroadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
  }
  
  private ILoginCallback initLoginCallback(@NonNull final ILoginCallback paramILoginCallback)
  {
    new ILoginCallback()
    {
      public void callAutomatedLoginRatingShowingRuleFailed()
      {
        paramILoginCallback.callAutomatedLoginRatingShowingRuleFailed();
      }
      
      public void onAutomaticLoginFailure(@NonNull int paramAnonymousInt)
      {
        paramILoginCallback.onAutomaticLoginFailure(paramAnonymousInt);
      }
      
      public void onAutomaticLoginMaintenanceMode()
      {
        paramILoginCallback.onMaintenanceMode();
        SmsLoginManager.this.unregisterMainBus();
      }
      
      public void onAutomaticLoginNotPossible()
      {
        paramILoginCallback.onAutomaticLoginNotPossible();
      }
      
      public void onAutomaticLoginSuccess()
      {
        paramILoginCallback.onAutomaticLoginSuccess();
      }
      
      public void onIccidConversionSuccess()
      {
        paramILoginCallback.onIccidConversionSuccess();
      }
      
      public void onLoginFailure(int paramAnonymousInt)
      {
        SmsLoginManager.this.unregisterMainBus();
      }
      
      public void onLoginSuccess()
      {
        paramILoginCallback.onLoginSuccess();
      }
      
      public void onMaintenanceMode()
      {
        paramILoginCallback.onMaintenanceMode();
        SmsLoginManager.this.unregisterMainBus();
      }
      
      public void onSmsLoginFailed(int paramAnonymousInt)
      {
        paramILoginCallback.onSmsLoginFailed(paramAnonymousInt);
        SmsLoginManager.this.unregisterMainBus();
      }
      
      public void onSmsLoginStartFailure()
      {
        paramILoginCallback.onSmsLoginStartFailure();
      }
    };
  }
  
  private void startSmsLoginProcess()
  {
    this.box7MiscManager.iccidConversion(new Box7Callback(null)
    {
      private void handleLoginError()
      {
        SmsLoginManager.this.loginCallback.onAutomaticLoginFailure(-4);
      }
      
      public void onFailure(@NonNull Box7Result<IccIdConversionModel> paramAnonymousBox7Result)
      {
        handleLoginError();
      }
      
      public void onForbidden()
      {
        handleLoginError();
      }
      
      public void onMaintenanceMode()
      {
        SmsLoginManager.this.loginCallback.onAutomaticLoginMaintenanceMode();
      }
      
      public void onNonFatalFailure(@NonNull Box7Result<IccIdConversionModel> paramAnonymousBox7Result)
      {
        if ((SmsLoginManager.this.simUtils.isDualSIM()) && (Build.VERSION.SDK_INT >= 22) && (SmsLoginManager.this.isRestartRequest))
        {
          SmsLoginManager.access$502(SmsLoginManager.this, false);
          SmsLoginManager.this.box7MiscManager.setPerformSIM2Call(true);
          restartRequest();
          return;
        }
        SmsLoginManager.access$502(SmsLoginManager.this, true);
        SmsLoginManager.this.box7MiscManager.setPerformSIM2Call(false);
        handleLoginError();
      }
      
      public void onServerError(@NonNull Box7Result<IccIdConversionModel> paramAnonymousBox7Result)
      {
        SmsLoginManager.this.loginCallback.onAutomaticLoginFailure(0);
      }
      
      public void onSuccess(@NonNull Box7Result<IccIdConversionModel> paramAnonymousBox7Result, IccIdConversionModel paramAnonymousIccIdConversionModel)
      {
        SmsLoginManager.this.loginPreferences.setNetworkLogin(true);
        SmsLoginManager.access$102(SmsLoginManager.this, paramAnonymousIccIdConversionModel.getMsisdn());
        SmsLoginManager.this.loginCallback.onIccidConversionSuccess();
        SmsLoginManager.this.doSMSLogin_start(SmsLoginManager.this.msisdn, SmsLoginManager.this.loginCallback);
        SmsLoginManager.this.box7MiscManager.setPerformSIM2Call(false);
        SmsLoginManager.access$502(SmsLoginManager.this, true);
      }
      
      public void onUnauthorized()
      {
        handleLoginError();
      }
      
      public void restartRequest()
      {
        SmsLoginManager.this.startSmsLoginProcess();
      }
      
      public void showGenericError()
      {
        handleLoginError();
      }
    });
  }
  
  private void startSmsReceiver(@NonNull ILoginCallback paramILoginCallback)
  {
    Task localTask = SmsRetriever.getClient(B2PApplication.getApplicationContextGlobal()).startSmsRetriever();
    localTask.addOnSuccessListener(new -..Lambda.SmsLoginManager.6_ZWxbYbEG4sF3ehNJTLRXSbG1g(this, paramILoginCallback));
    localTask.addOnFailureListener(new -..Lambda.SmsLoginManager.xFFloW8l4oJsOCS43q-Z5lXmHXU(this));
  }
  
  private void unregisterMainBus()
  {
    this.mainThreadBus.unregister(this);
  }
  
  private void unregisterSMSReceiver()
  {
    if (this.b2PSMSBroadcastReceiver != null) {
      B2PApplication.getApplicationContextGlobal().unregisterReceiver(this.b2PSMSBroadcastReceiver);
    }
  }
  
  public void doLogin(@NonNull ILoginCallback paramILoginCallback)
  {
    this.mainThreadBus.register(this);
    this.loginCallback = initLoginCallback(paramILoginCallback);
    this.higherLoginManager.resetHigherLoginState();
    startSmsLoginProcess();
  }
  
  public boolean isLoginPossible()
  {
    return this.simUtils.isSIMCARDPresent();
  }
  
  @Subscribe
  public void onTimeoutReceived(TimeoutEvent paramTimeoutEvent)
  {
    a.b("entered...", new Object[0]);
    if (paramTimeoutEvent.getTimeoutId() != 2) {
      return;
    }
    a.b("onTimeoutReceived() entered... timeoutId: REQUEST_SMS_TIMER", new Object[0]);
    unregisterSMSReceiver();
    smsLoginFailed(-3);
  }
  
  protected void smsLoginFailed(int paramInt)
  {
    a.b("smsLoginFailed() entered...", new Object[0]);
    this.loginPreferences.clear();
    this.timeoutPreferences.clear();
    this.box7Cache.clear();
    this.loginCallback.onSmsLoginFailed(paramInt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/smslogin/SmsLoginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */