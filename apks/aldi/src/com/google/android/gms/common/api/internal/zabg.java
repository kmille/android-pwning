package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zal;

final class zabg
  extends zal
{
  zabg(zabe paramzabe, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      paramMessage = new StringBuilder(31);
      paramMessage.append("Unknown message id: ");
      paramMessage.append(i);
      return;
    case 2: 
      throw ((RuntimeException)paramMessage.obj);
    }
    ((zabf)paramMessage.obj).zac(this.zahu);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */