package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class zav
  implements zabt
{
  private zav(zas paramzas) {}
  
  /* Error */
  public final void zab(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   4: invokestatic 27	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 32 1 0
    //   12: aload_0
    //   13: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   16: invokestatic 36	com/google/android/gms/common/api/internal/zas:zac	(Lcom/google/android/gms/common/api/internal/zas;)Z
    //   19: ifeq +34 -> 53
    //   22: aload_0
    //   23: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   26: iconst_0
    //   27: invokestatic 39	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;Z)Z
    //   30: pop
    //   31: aload_0
    //   32: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   35: iload_1
    //   36: iload_2
    //   37: invokestatic 42	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;IZ)V
    //   40: aload_0
    //   41: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   44: invokestatic 27	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;)Ljava/util/concurrent/locks/Lock;
    //   47: invokeinterface 45 1 0
    //   52: return
    //   53: aload_0
    //   54: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   57: iconst_1
    //   58: invokestatic 39	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;Z)Z
    //   61: pop
    //   62: aload_0
    //   63: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   66: invokestatic 49	com/google/android/gms/common/api/internal/zas:zaf	(Lcom/google/android/gms/common/api/internal/zas;)Lcom/google/android/gms/common/api/internal/zabe;
    //   69: iload_1
    //   70: invokevirtual 55	com/google/android/gms/common/api/internal/zabe:onConnectionSuspended	(I)V
    //   73: goto -33 -> 40
    //   76: astore_3
    //   77: aload_0
    //   78: getfield 12	com/google/android/gms/common/api/internal/zav:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   81: invokestatic 27	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;)Ljava/util/concurrent/locks/Lock;
    //   84: invokeinterface 45 1 0
    //   89: aload_3
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	zav
    //   0	91	1	paramInt	int
    //   0	91	2	paramBoolean	boolean
    //   76	14	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	40	76	finally
    //   53	73	76	finally
  }
  
  public final void zab(@Nullable Bundle paramBundle)
  {
    zas.zaa(this.zaep).lock();
    try
    {
      zas.zab(this.zaep, ConnectionResult.RESULT_SUCCESS);
      zas.zab(this.zaep);
      return;
    }
    finally
    {
      zas.zaa(this.zaep).unlock();
    }
  }
  
  public final void zac(@NonNull ConnectionResult paramConnectionResult)
  {
    zas.zaa(this.zaep).lock();
    try
    {
      zas.zab(this.zaep, paramConnectionResult);
      zas.zab(this.zaep);
      return;
    }
    finally
    {
      zas.zaa(this.zaep).unlock();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */