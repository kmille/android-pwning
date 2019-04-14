package com.google.android.gms.common.internal;

import android.accounts.Account;

public class AccountAccessor
  extends IAccountAccessor.Stub
{
  /* Error */
  @com.google.android.gms.common.annotation.KeepForSdk
  public static Account getAccountBinderSafe(IAccountAccessor paramIAccountAccessor)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +31 -> 32
    //   4: invokestatic 15	android/os/Binder:clearCallingIdentity	()J
    //   7: lstore_1
    //   8: aload_0
    //   9: invokeinterface 21 1 0
    //   14: astore_0
    //   15: lload_1
    //   16: invokestatic 25	android/os/Binder:restoreCallingIdentity	(J)V
    //   19: aload_0
    //   20: areturn
    //   21: astore_0
    //   22: lload_1
    //   23: invokestatic 25	android/os/Binder:restoreCallingIdentity	(J)V
    //   26: aload_0
    //   27: athrow
    //   28: lload_1
    //   29: invokestatic 25	android/os/Binder:restoreCallingIdentity	(J)V
    //   32: aconst_null
    //   33: areturn
    //   34: astore_0
    //   35: goto -7 -> 28
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	paramIAccountAccessor	IAccountAccessor
    //   7	22	1	l	long
    // Exception table:
    //   from	to	target	type
    //   8	15	21	finally
    //   8	15	34	android/os/RemoteException
  }
  
  public boolean equals(Object paramObject)
  {
    throw new NoSuchMethodError();
  }
  
  public final Account getAccount()
  {
    throw new NoSuchMethodError();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/AccountAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */