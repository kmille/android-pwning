package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzd
  implements Runnable
{
  private static final Logger zzbd = new Logger("RevokeAccessOperation", new String[0]);
  private final String zzbe;
  private final StatusPendingResult zzbf;
  
  private zzd(String paramString)
  {
    Preconditions.checkNotEmpty(paramString);
    this.zzbe = paramString;
    this.zzbf = new StatusPendingResult(null);
  }
  
  public static PendingResult<Status> zzc(String paramString)
  {
    if (paramString == null) {
      return PendingResults.immediateFailedResult(new Status(4), null);
    }
    paramString = new zzd(paramString);
    new Thread(paramString).start();
    return paramString.zzbf;
  }
  
  public final void run()
  {
    Object localObject1 = Status.RESULT_INTERNAL_ERROR;
    Object localObject4 = localObject1;
    Object localObject2 = localObject1;
    Object localObject3;
    String str;
    try
    {
      localObject5 = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
      localObject4 = localObject1;
      localObject2 = localObject1;
      localObject6 = String.valueOf(this.zzbe);
      localObject4 = localObject1;
      localObject2 = localObject1;
      if (((String)localObject6).length() != 0)
      {
        localObject4 = localObject1;
        localObject2 = localObject1;
        localObject5 = ((String)localObject5).concat((String)localObject6);
      }
      else
      {
        localObject4 = localObject1;
        localObject2 = localObject1;
        localObject5 = new String((String)localObject5);
      }
      localObject4 = localObject1;
      localObject2 = localObject1;
      localObject5 = (HttpURLConnection)new URL((String)localObject5).openConnection();
      localObject4 = localObject1;
      localObject2 = localObject1;
      ((HttpURLConnection)localObject5).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      localObject4 = localObject1;
      localObject2 = localObject1;
      int i = ((HttpURLConnection)localObject5).getResponseCode();
      if (i == 200)
      {
        localObject4 = localObject1;
        localObject2 = localObject1;
        localObject1 = Status.RESULT_SUCCESS;
      }
      else
      {
        localObject4 = localObject1;
        localObject2 = localObject1;
        zzbd.e("Unable to revoke access!", new Object[0]);
      }
      localObject4 = localObject1;
      localObject2 = localObject1;
      localObject5 = zzbd;
      localObject4 = localObject1;
      localObject2 = localObject1;
      localObject6 = new StringBuilder(26);
      localObject4 = localObject1;
      localObject2 = localObject1;
      ((StringBuilder)localObject6).append("Response Code: ");
      localObject4 = localObject1;
      localObject2 = localObject1;
      ((StringBuilder)localObject6).append(i);
      localObject4 = localObject1;
      localObject2 = localObject1;
      ((Logger)localObject5).d(((StringBuilder)localObject6).toString(), new Object[0]);
    }
    catch (Exception localException)
    {
      localObject1 = zzbd;
      localObject5 = "Exception when revoking access: ";
      Object localObject6 = String.valueOf(localException.toString());
      if (((String)localObject6).length() != 0)
      {
        localObject3 = localObject4;
        localObject4 = localObject6;
      }
      else
      {
        localObject5 = new String("Exception when revoking access: ");
        localObject3 = localObject4;
        localObject4 = localObject5;
        break label340;
      }
    }
    catch (IOException localIOException)
    {
      localObject1 = zzbd;
      Object localObject5 = "IOException when revoking access: ";
      str = String.valueOf(localIOException.toString());
      if (str.length() != 0) {
        str = ((String)localObject5).concat(str);
      } else {
        str = new String("IOException when revoking access: ");
      }
    }
    label340:
    ((Logger)localObject1).e(str, new Object[0]);
    localObject1 = localObject3;
    this.zzbf.setResult((Result)localObject1);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */