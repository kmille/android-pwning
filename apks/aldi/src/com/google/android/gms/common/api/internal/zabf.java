package com.google.android.gms.common.api.internal;

abstract class zabf
{
  private final zabd zaht;
  
  protected zabf(zabd paramzabd)
  {
    this.zaht = paramzabd;
  }
  
  protected abstract void zaan();
  
  /* Error */
  public final void zac(zabe paramzabe)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 23	com/google/android/gms/common/api/internal/zabe:zaa	(Lcom/google/android/gms/common/api/internal/zabe;)Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 28 1 0
    //   9: aload_1
    //   10: invokestatic 32	com/google/android/gms/common/api/internal/zabe:zab	(Lcom/google/android/gms/common/api/internal/zabe;)Lcom/google/android/gms/common/api/internal/zabd;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 13	com/google/android/gms/common/api/internal/zabf:zaht	Lcom/google/android/gms/common/api/internal/zabd;
    //   18: astore_3
    //   19: aload_2
    //   20: aload_3
    //   21: if_acmpeq +13 -> 34
    //   24: aload_1
    //   25: invokestatic 23	com/google/android/gms/common/api/internal/zabe:zaa	(Lcom/google/android/gms/common/api/internal/zabe;)Ljava/util/concurrent/locks/Lock;
    //   28: invokeinterface 35 1 0
    //   33: return
    //   34: aload_0
    //   35: invokevirtual 37	com/google/android/gms/common/api/internal/zabf:zaan	()V
    //   38: goto -14 -> 24
    //   41: astore_2
    //   42: aload_1
    //   43: invokestatic 23	com/google/android/gms/common/api/internal/zabe:zaa	(Lcom/google/android/gms/common/api/internal/zabe;)Ljava/util/concurrent/locks/Lock;
    //   46: invokeinterface 35 1 0
    //   51: aload_2
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	zabf
    //   0	53	1	paramzabe	zabe
    //   13	7	2	localzabd1	zabd
    //   41	11	2	localObject	Object
    //   18	3	3	localzabd2	zabd
    // Exception table:
    //   from	to	target	type
    //   9	19	41	finally
    //   34	38	41	finally
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zabf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */