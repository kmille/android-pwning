package de.eplus.mappecc.client.android.common.network.piranha.model.higherlogin;

import android.support.annotation.NonNull;
import c.a.a;
import com.a.a.e;
import com.google.common.collect.m;
import de.eplus.mappecc.client.android.common.network.moe.core.Localizer;
import de.eplus.mappecc.client.android.common.network.piranha.LoginHelper;
import de.eplus.mappecc.client.android.common.network.piranha.PiranhaCallback;
import de.eplus.mappecc.client.android.common.network.piranha.model.LoginTokenModel;
import de.eplus.mappecc.client.android.common.restclient.LoginClient;
import de.eplus.mappecc.client.android.common.tracking.TrackingEvent;
import de.eplus.mappecc.client.android.common.tracking.TrackingHelper;
import de.eplus.mappecc.client.android.common.utils.Timer;
import de.eplus.mappecc.client.android.common.utils.preferences.LoginPreferences;
import de.eplus.mappecc.client.android.common.utils.preferences.TimeoutPreferences;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import org.apache.a.c.h;
import org.joda.time.DateTime;

public class HigherLoginManager
  implements IHigherLoginManager
{
  private boolean isHigherLoginValid = false;
  private final Localizer localizer;
  private final LoginClient loginClient;
  private final LoginHelper loginHelper;
  private final LoginPreferences loginPreferences;
  private final TimeoutPreferences timeoutPreferences;
  private final Timer timer;
  private final TrackingHelper trackingHelper;
  
  public HigherLoginManager(@NonNull LoginClient paramLoginClient, @NonNull LoginHelper paramLoginHelper, @NonNull LoginPreferences paramLoginPreferences, @NonNull TimeoutPreferences paramTimeoutPreferences, @NonNull Localizer paramLocalizer, @NonNull TrackingHelper paramTrackingHelper, @NonNull Timer paramTimer)
  {
    this.loginClient = paramLoginClient;
    this.loginHelper = paramLoginHelper;
    this.loginPreferences = paramLoginPreferences;
    this.timeoutPreferences = paramTimeoutPreferences;
    this.localizer = paramLocalizer;
    this.trackingHelper = paramTrackingHelper;
    this.timer = paramTimer;
  }
  
  private void trackHigherLoginEvent(boolean paramBoolean, String paramString)
  {
    TrackingHelper localTrackingHelper = this.trackingHelper;
    TrackingEvent localTrackingEvent = TrackingEvent.LOGIN_SUPPORT;
    String str;
    if (paramBoolean) {
      str = "success";
    } else {
      str = "fail";
    }
    localTrackingHelper.sendEvent(localTrackingEvent, m.a("result", str, "failReason", paramString));
  }
  
  public void doLogin(@NonNull final String paramString, @NonNull final HigherLoginCallback paramHigherLoginCallback)
  {
    a.b("**** doHigherLogin() entered...", new Object[0]);
    String str = this.loginPreferences.loadToken();
    if (h.a(str))
    {
      a.e("onLoginClicked(): no token available...", new Object[0]);
      paramHigherLoginCallback.onLoginFailure(-1);
      return;
    }
    this.loginClient.doHigherLogin(str, paramString).enqueue(new PiranhaCallback()
    {
      public void onFailure(@NonNull Call paramAnonymousCall, @NonNull IOException paramAnonymousIOException)
      {
        super.onFailure(paramAnonymousCall, paramAnonymousIOException);
        a.d("**** doHigherLogin.onFailure() entered...", new Object[0]);
        a.a(paramAnonymousIOException);
        HigherLoginManager.this.trackHigherLoginEvent(false, "network");
        paramHigherLoginCallback.onLoginFailure(-2);
      }
      
      public void onResponse(@NonNull Call paramAnonymousCall, @NonNull Response paramAnonymousResponse)
        throws IOException
      {
        super.onResponse(paramAnonymousCall, paramAnonymousResponse);
        if ((paramAnonymousResponse.code() != 510) && (paramAnonymousResponse.code() != 503))
        {
          paramAnonymousCall = new StringBuilder("**** doHigherLogin.onResponse() entered... sucess: ");
          paramAnonymousCall.append(paramAnonymousResponse.isSuccessful());
          a.b(paramAnonymousCall.toString(), new Object[0]);
          if (paramAnonymousResponse.isSuccessful())
          {
            HigherLoginManager.this.loginPreferences.setNetworkLogin(false);
            paramAnonymousCall = LoginHelper.extractLoginTokenModel(paramAnonymousResponse);
            String str = HigherLoginManager.this.loginPreferences.loadUsername();
            paramAnonymousResponse = paramAnonymousResponse.headers().get("X-Tarifftype");
            if (h.b(paramAnonymousCall.getTokenId()))
            {
              HigherLoginManager.this.loginHelper.saveLoginData(paramAnonymousCall, str, paramString, paramAnonymousResponse);
              HigherLoginManager.this.timeoutPreferences.saveHigherLoginStart(new DateTime().getMillis());
              HigherLoginManager.this.timer.cancelTimeout(3);
              long l = 10800000L;
              paramAnonymousCall = HigherLoginManager.this.localizer.getInteger(2131691377);
              if (paramAnonymousCall != null) {
                l = 1000L * paramAnonymousCall.intValue();
              }
              HigherLoginManager.this.timer.startTimeout(3, l);
              HigherLoginManager.access$602(HigherLoginManager.this, true);
              HigherLoginManager.this.trackHigherLoginEvent(true, "");
              paramHigherLoginCallback.onLoginSuccess();
              return;
            }
            HigherLoginManager.this.trackHigherLoginEvent(false, "unknown");
            paramHigherLoginCallback.onLoginFailure(-1);
            return;
          }
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
            HigherLoginManager.this.trackHigherLoginEvent(false, String.valueOf(i));
            paramHigherLoginCallback.onLoginFailure(i);
            return;
          }
          HigherLoginManager.this.trackHigherLoginEvent(false, "unknown");
          paramHigherLoginCallback.onLoginFailure(-1);
          return;
        }
        paramHigherLoginCallback.onMaintenanceMode();
      }
    });
  }
  
  public boolean isHigherLoginValid()
  {
    return this.isHigherLoginValid;
  }
  
  public void resetHigherLoginState()
  {
    this.timeoutPreferences.clearHigherLogin();
    this.isHigherLoginValid = false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/higherlogin/HigherLoginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */