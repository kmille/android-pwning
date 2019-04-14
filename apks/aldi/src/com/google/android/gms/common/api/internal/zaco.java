package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zal;

final class zaco
  extends zal
{
  public zaco(zacm paramzacm, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      paramMessage = new StringBuilder(70);
      paramMessage.append("TransformationResultHandler received unknown message type: ");
      paramMessage.append(i);
      Log.e("TransformedResultImpl", paramMessage.toString());
      return;
    case 1: 
      localObject1 = (RuntimeException)paramMessage.obj;
      paramMessage = String.valueOf(((RuntimeException)localObject1).getMessage());
      if (paramMessage.length() != 0) {
        paramMessage = "Runtime exception on the transformation worker thread: ".concat(paramMessage);
      } else {
        paramMessage = new String("Runtime exception on the transformation worker thread: ");
      }
      Log.e("TransformedResultImpl", paramMessage);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (PendingResult)paramMessage.obj;
    paramMessage = zacm.zaf(this.zakv);
    if (localObject1 == null) {}
    try
    {
      zacm.zaa(zacm.zag(this.zakv), new Status(13, "Transform returned null"));
      break label203;
      if ((localObject1 instanceof zacd)) {
        zacm.zaa(zacm.zag(this.zakv), ((zacd)localObject1).getStatus());
      } else {
        zacm.zag(this.zakv).zaa((PendingResult)localObject1);
      }
      label203:
      return;
    }
    finally
    {
      for (;;) {}
    }
    throw ((Throwable)localObject1);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */