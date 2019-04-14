package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity
  extends FragmentActivity
{
  private static boolean zzbt = false;
  private boolean zzbu = false;
  private SignInConfiguration zzbv;
  private boolean zzbw;
  private int zzbx;
  private Intent zzby;
  
  private final void zzc(int paramInt)
  {
    Status localStatus = new Status(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("googleSignInStatus", localStatus);
    setResult(0, localIntent);
    finish();
    zzbt = false;
  }
  
  private final void zzn()
  {
    getSupportLoaderManager().initLoader(0, null, new zzc(null));
    zzbt = false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.zzbu) {
      return;
    }
    setResult(0);
    if (paramInt1 != 40962) {
      return;
    }
    if (paramIntent != null)
    {
      Object localObject = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if ((localObject != null) && (((SignInAccount)localObject).getGoogleSignInAccount() != null))
      {
        localObject = ((SignInAccount)localObject).getGoogleSignInAccount();
        zzp.zzd(this).zzc(this.zzbv.zzm(), (GoogleSignInAccount)localObject);
        paramIntent.removeExtra("signInAccount");
        paramIntent.putExtra("googleSignInAccount", (Parcelable)localObject);
        this.zzbw = true;
        this.zzbx = paramInt2;
        this.zzby = paramIntent;
        zzn();
        return;
      }
      if (paramIntent.hasExtra("errorCode"))
      {
        paramInt2 = paramIntent.getIntExtra("errorCode", 8);
        paramInt1 = paramInt2;
        if (paramInt2 == 13) {
          paramInt1 = 12501;
        }
        zzc(paramInt1);
        return;
      }
    }
    zzc(8);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    String str = localIntent.getAction();
    if ("com.google.android.gms.auth.NO_IMPL".equals(str))
    {
      zzc(12500);
      return;
    }
    if ((!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) && (!str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")))
    {
      paramBundle = String.valueOf(localIntent.getAction());
      if (paramBundle.length() != 0) {
        paramBundle = "Unknown action: ".concat(paramBundle);
      } else {
        paramBundle = new String("Unknown action: ");
      }
      Log.e("AuthSignInClient", paramBundle);
      finish();
      return;
    }
    this.zzbv = ((SignInConfiguration)localIntent.getBundleExtra("config").getParcelable("config"));
    if (this.zzbv == null)
    {
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
      return;
    }
    int i;
    if (paramBundle == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (zzbt)
      {
        setResult(0);
        zzc(12502);
        return;
      }
      zzbt = true;
      localIntent = new Intent(str);
      if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {}
      for (paramBundle = "com.google.android.gms";; paramBundle = getPackageName())
      {
        localIntent.setPackage(paramBundle);
        break;
      }
      localIntent.putExtra("config", this.zzbv);
    }
    try
    {
      startActivityForResult(localIntent, 40962);
      return;
    }
    catch (ActivityNotFoundException paramBundle)
    {
      for (;;) {}
    }
    this.zzbu = true;
    zzc(17);
    return;
    this.zzbw = paramBundle.getBoolean("signingInGoogleApiClients");
    if (this.zzbw)
    {
      this.zzbx = paramBundle.getInt("signInResultCode");
      this.zzby = ((Intent)paramBundle.getParcelable("signInResultData"));
      zzn();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", this.zzbw);
    if (this.zzbw)
    {
      paramBundle.putInt("signInResultCode", this.zzbx);
      paramBundle.putParcelable("signInResultData", this.zzby);
    }
  }
  
  final class zzc
    implements LoaderManager.LoaderCallbacks<Void>
  {
    private zzc() {}
    
    public final Loader<Void> onCreateLoader(int paramInt, Bundle paramBundle)
    {
      return new zze(SignInHubActivity.this, GoogleApiClient.getAllClients());
    }
    
    public final void onLoaderReset(Loader<Void> paramLoader) {}
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInHubActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */