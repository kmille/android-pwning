package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzz<T>
{
  final int what;
  final int zzck;
  final TaskCompletionSource<T> zzcl = new TaskCompletionSource();
  final Bundle zzcm;
  
  zzz(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.zzck = paramInt1;
    this.what = paramInt2;
    this.zzcm = paramBundle;
  }
  
  public String toString()
  {
    int i = this.what;
    int j = this.zzck;
    zzu();
    StringBuilder localStringBuilder = new StringBuilder(55);
    localStringBuilder.append("Request { what=");
    localStringBuilder.append(i);
    localStringBuilder.append(" id=");
    localStringBuilder.append(j);
    localStringBuilder.append(" oneWay=false}");
    return localStringBuilder.toString();
  }
  
  final void zzd(zzaa paramzzaa)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramzzaa);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 14 + String.valueOf(str2).length());
      localStringBuilder.append("Failing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
    }
    this.zzcl.setException(paramzzaa);
  }
  
  abstract void zzh(Bundle paramBundle);
  
  abstract boolean zzu();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */