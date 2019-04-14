package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;

abstract class zaau
  implements Runnable
{
  private zaau(zaak paramzaak) {}
  
  /* Error */
  @WorkerThread
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/common/api/internal/zaau:zagi	Lcom/google/android/gms/common/api/internal/zaak;
    //   4: invokestatic 29	com/google/android/gms/common/api/internal/zaak:zac	(Lcom/google/android/gms/common/api/internal/zaak;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 34 1 0
    //   12: invokestatic 40	java/lang/Thread:interrupted	()Z
    //   15: istore_1
    //   16: iload_1
    //   17: ifeq +16 -> 33
    //   20: aload_0
    //   21: getfield 12	com/google/android/gms/common/api/internal/zaau:zagi	Lcom/google/android/gms/common/api/internal/zaak;
    //   24: invokestatic 29	com/google/android/gms/common/api/internal/zaak:zac	(Lcom/google/android/gms/common/api/internal/zaak;)Ljava/util/concurrent/locks/Lock;
    //   27: invokeinterface 43 1 0
    //   32: return
    //   33: aload_0
    //   34: invokevirtual 46	com/google/android/gms/common/api/internal/zaau:zaan	()V
    //   37: goto -17 -> 20
    //   40: astore_2
    //   41: goto +18 -> 59
    //   44: astore_2
    //   45: aload_0
    //   46: getfield 12	com/google/android/gms/common/api/internal/zaau:zagi	Lcom/google/android/gms/common/api/internal/zaak;
    //   49: invokestatic 50	com/google/android/gms/common/api/internal/zaak:zad	(Lcom/google/android/gms/common/api/internal/zaak;)Lcom/google/android/gms/common/api/internal/zabe;
    //   52: aload_2
    //   53: invokevirtual 56	com/google/android/gms/common/api/internal/zabe:zab	(Ljava/lang/RuntimeException;)V
    //   56: goto -36 -> 20
    //   59: aload_0
    //   60: getfield 12	com/google/android/gms/common/api/internal/zaau:zagi	Lcom/google/android/gms/common/api/internal/zaak;
    //   63: invokestatic 29	com/google/android/gms/common/api/internal/zaak:zac	(Lcom/google/android/gms/common/api/internal/zaak;)Ljava/util/concurrent/locks/Lock;
    //   66: invokeinterface 43 1 0
    //   71: aload_2
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	zaau
    //   15	2	1	bool	boolean
    //   40	1	2	localObject	Object
    //   44	28	2	localRuntimeException	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   12	16	40	finally
    //   33	37	40	finally
    //   45	56	40	finally
    //   12	16	44	java/lang/RuntimeException
    //   33	37	44	java/lang/RuntimeException
  }
  
  @WorkerThread
  protected abstract void zaan();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */