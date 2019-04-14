package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzab
  extends zzz<Bundle>
{
  zzab(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, 1, paramBundle);
  }
  
  final void zzh(Bundle paramBundle)
  {
    Object localObject = paramBundle.getBundle("data");
    paramBundle = (Bundle)localObject;
    if (localObject == null) {
      paramBundle = Bundle.EMPTY;
    }
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      localObject = String.valueOf(this);
      String str = String.valueOf(paramBundle);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 16 + String.valueOf(str).length());
      localStringBuilder.append("Finishing ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str);
    }
    this.zzcl.setResult(paramBundle);
  }
  
  final boolean zzu()
  {
    return false;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */