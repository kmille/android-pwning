package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class zau
  implements zabt
{
  private zau(zas paramzas) {}
  
  /* Error */
  public final void zab(int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   4: invokestatic 27	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 32 1 0
    //   12: aload_0
    //   13: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   16: invokestatic 36	com/google/android/gms/common/api/internal/zas:zac	(Lcom/google/android/gms/common/api/internal/zas;)Z
    //   19: ifne +62 -> 81
    //   22: aload_0
    //   23: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   26: invokestatic 40	com/google/android/gms/common/api/internal/zas:zad	(Lcom/google/android/gms/common/api/internal/zas;)Lcom/google/android/gms/common/ConnectionResult;
    //   29: ifnull +52 -> 81
    //   32: aload_0
    //   33: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   36: invokestatic 40	com/google/android/gms/common/api/internal/zas:zad	(Lcom/google/android/gms/common/api/internal/zas;)Lcom/google/android/gms/common/ConnectionResult;
    //   39: invokevirtual 46	com/google/android/gms/common/ConnectionResult:isSuccess	()Z
    //   42: ifne +6 -> 48
    //   45: goto +36 -> 81
    //   48: aload_0
    //   49: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   52: iconst_1
    //   53: invokestatic 49	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;Z)Z
    //   56: pop
    //   57: aload_0
    //   58: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   61: invokestatic 53	com/google/android/gms/common/api/internal/zas:zae	(Lcom/google/android/gms/common/api/internal/zas;)Lcom/google/android/gms/common/api/internal/zabe;
    //   64: iload_1
    //   65: invokevirtual 59	com/google/android/gms/common/api/internal/zabe:onConnectionSuspended	(I)V
    //   68: aload_0
    //   69: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   72: invokestatic 27	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;)Ljava/util/concurrent/locks/Lock;
    //   75: invokeinterface 62 1 0
    //   80: return
    //   81: aload_0
    //   82: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   85: iconst_0
    //   86: invokestatic 49	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;Z)Z
    //   89: pop
    //   90: aload_0
    //   91: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   94: iload_1
    //   95: iload_2
    //   96: invokestatic 65	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;IZ)V
    //   99: goto -31 -> 68
    //   102: astore_3
    //   103: aload_0
    //   104: getfield 12	com/google/android/gms/common/api/internal/zau:zaep	Lcom/google/android/gms/common/api/internal/zas;
    //   107: invokestatic 27	com/google/android/gms/common/api/internal/zas:zaa	(Lcom/google/android/gms/common/api/internal/zas;)Ljava/util/concurrent/locks/Lock;
    //   110: invokeinterface 62 1 0
    //   115: aload_3
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zau
    //   0	117	1	paramInt	int
    //   0	117	2	paramBoolean	boolean
    //   102	14	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	45	102	finally
    //   48	68	102	finally
    //   81	99	102	finally
  }
  
  public final void zab(@Nullable Bundle paramBundle)
  {
    zas.zaa(this.zaep).lock();
    try
    {
      zas.zaa(this.zaep, paramBundle);
      zas.zaa(this.zaep, ConnectionResult.RESULT_SUCCESS);
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
      zas.zaa(this.zaep, paramConnectionResult);
      zas.zab(this.zaep);
      return;
    }
    finally
    {
      zas.zaa(this.zaep).unlock();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */