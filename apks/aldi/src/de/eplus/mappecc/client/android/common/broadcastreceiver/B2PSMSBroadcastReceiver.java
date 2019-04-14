package de.eplus.mappecc.client.android.common.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.a.c.h;

public class B2PSMSBroadcastReceiver
  extends BroadcastReceiver
{
  private Listener listener;
  
  private String getToken(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String str = "";
    Matcher localMatcher = Pattern.compile("\\$=#\\$\\$([^=]+)=").matcher(paramString);
    paramString = str;
    if (localMatcher.find()) {
      paramString = localMatcher.group(1);
    }
    return paramString;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) && (paramIntent.getExtras() != null))
    {
      if (this.listener == null) {
        return;
      }
      paramContext = paramIntent.getExtras();
      paramIntent = (Status)paramContext.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
      if (paramIntent == null) {
        return;
      }
      int i = paramIntent.getStatusCode();
      if (i != 0)
      {
        if (i != 15) {
          return;
        }
        this.listener.onTimeOut();
        return;
      }
      paramContext = getToken(paramContext.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
      if (h.b(paramContext)) {
        this.listener.onTokenReceived(paramContext);
      }
    }
  }
  
  public void setListener(Listener paramListener)
  {
    this.listener = paramListener;
  }
  
  public static abstract interface Listener
  {
    public abstract void onTimeOut();
    
    public abstract void onTokenReceived(@NonNull String paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/broadcastreceiver/B2PSMSBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */