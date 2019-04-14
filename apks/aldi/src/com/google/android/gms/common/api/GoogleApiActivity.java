package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepName
public class GoogleApiActivity
  extends Activity
  implements DialogInterface.OnCancelListener
{
  @VisibleForTesting
  private int zabp = 0;
  
  public static PendingIntent zaa(Context paramContext, PendingIntent paramPendingIntent, int paramInt)
  {
    return PendingIntent.getActivity(paramContext, 0, zaa(paramContext, paramPendingIntent, paramInt, true), 134217728);
  }
  
  public static Intent zaa(Context paramContext, PendingIntent paramPendingIntent, int paramInt, boolean paramBoolean)
  {
    paramContext = new Intent(paramContext, GoogleApiActivity.class);
    paramContext.putExtra("pending_intent", paramPendingIntent);
    paramContext.putExtra("failing_client_id", paramInt);
    paramContext.putExtra("notify_manager", paramBoolean);
    return paramContext;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      this.zabp = 0;
      setResult(paramInt2, paramIntent);
      if (bool)
      {
        paramIntent = GoogleApiManager.zab(this);
        switch (paramInt2)
        {
        default: 
          break;
        case 0: 
          paramIntent.zaa(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
          break;
        case -1: 
          paramIntent.zao();
          break;
        }
      }
    }
    else if (paramInt1 == 2)
    {
      this.zabp = 0;
      setResult(paramInt2, paramIntent);
    }
    finish();
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.zabp = 0;
    setResult(0);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      this.zabp = paramBundle.getInt("resolution");
    }
    if (this.zabp != 1)
    {
      Object localObject = getIntent().getExtras();
      if (localObject == null)
      {
        paramBundle = "Activity started without extras";
        Log.e("GoogleApiActivity", paramBundle);
      }
      for (;;)
      {
        finish();
        return;
        paramBundle = (PendingIntent)((Bundle)localObject).get("pending_intent");
        localObject = (Integer)((Bundle)localObject).get("error_code");
        if ((paramBundle == null) && (localObject == null))
        {
          paramBundle = "Activity started without resolution";
          break;
        }
        if (paramBundle == null) {
          break label124;
        }
        try
        {
          startIntentSenderForResult(paramBundle.getIntentSender(), 1, null, 0, 0, 0);
          this.zabp = 1;
          return;
        }
        catch (IntentSender.SendIntentException paramBundle)
        {
          Log.e("GoogleApiActivity", "Failed to launch pendingIntent", paramBundle);
        }
      }
      label124:
      GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer)localObject).intValue(), 2, this);
      this.zabp = 1;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("resolution", this.zabp);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/GoogleApiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */