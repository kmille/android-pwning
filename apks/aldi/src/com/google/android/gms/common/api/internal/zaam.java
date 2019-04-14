package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import java.lang.ref.WeakReference;

final class zaam
  implements BaseGmsClient.ConnectionProgressReportCallbacks
{
  private final Api<?> mApi;
  private final boolean zaeb;
  private final WeakReference<zaak> zagj;
  
  public zaam(zaak paramzaak, Api<?> paramApi, boolean paramBoolean)
  {
    this.zagj = new WeakReference(paramzaak);
    this.mApi = paramApi;
    this.zaeb = paramBoolean;
  }
  
  /* Error */
  public final void onReportServiceBinding(@android.support.annotation.NonNull com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	com/google/android/gms/common/api/internal/zaam:zagj	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 42	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 44	com/google/android/gms/common/api/internal/zaak
    //   10: astore_3
    //   11: aload_3
    //   12: ifnonnull +4 -> 16
    //   15: return
    //   16: invokestatic 50	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   19: aload_3
    //   20: invokestatic 54	com/google/android/gms/common/api/internal/zaak:zad	(Lcom/google/android/gms/common/api/internal/zaak;)Lcom/google/android/gms/common/api/internal/zabe;
    //   23: getfield 60	com/google/android/gms/common/api/internal/zabe:zaed	Lcom/google/android/gms/common/api/internal/zaaw;
    //   26: invokevirtual 65	com/google/android/gms/common/api/GoogleApiClient:getLooper	()Landroid/os/Looper;
    //   29: if_acmpne +8 -> 37
    //   32: iconst_1
    //   33: istore_2
    //   34: goto +5 -> 39
    //   37: iconst_0
    //   38: istore_2
    //   39: iload_2
    //   40: ldc 67
    //   42: invokestatic 73	com/google/android/gms/common/internal/Preconditions:checkState	(ZLjava/lang/Object;)V
    //   45: aload_3
    //   46: invokestatic 77	com/google/android/gms/common/api/internal/zaak:zac	(Lcom/google/android/gms/common/api/internal/zaak;)Ljava/util/concurrent/locks/Lock;
    //   49: invokeinterface 82 1 0
    //   54: aload_3
    //   55: iconst_0
    //   56: invokestatic 85	com/google/android/gms/common/api/internal/zaak:zaa	(Lcom/google/android/gms/common/api/internal/zaak;I)Z
    //   59: istore_2
    //   60: iload_2
    //   61: ifne +13 -> 74
    //   64: aload_3
    //   65: invokestatic 77	com/google/android/gms/common/api/internal/zaak:zac	(Lcom/google/android/gms/common/api/internal/zaak;)Ljava/util/concurrent/locks/Lock;
    //   68: invokeinterface 88 1 0
    //   73: return
    //   74: aload_1
    //   75: invokevirtual 94	com/google/android/gms/common/ConnectionResult:isSuccess	()Z
    //   78: ifne +16 -> 94
    //   81: aload_3
    //   82: aload_1
    //   83: aload_0
    //   84: getfield 28	com/google/android/gms/common/api/internal/zaam:mApi	Lcom/google/android/gms/common/api/Api;
    //   87: aload_0
    //   88: getfield 30	com/google/android/gms/common/api/internal/zaam:zaeb	Z
    //   91: invokestatic 97	com/google/android/gms/common/api/internal/zaak:zaa	(Lcom/google/android/gms/common/api/internal/zaak;Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/Api;Z)V
    //   94: aload_3
    //   95: invokestatic 101	com/google/android/gms/common/api/internal/zaak:zak	(Lcom/google/android/gms/common/api/internal/zaak;)Z
    //   98: ifeq -34 -> 64
    //   101: aload_3
    //   102: invokestatic 105	com/google/android/gms/common/api/internal/zaak:zaj	(Lcom/google/android/gms/common/api/internal/zaak;)V
    //   105: goto -41 -> 64
    //   108: astore_1
    //   109: aload_3
    //   110: invokestatic 77	com/google/android/gms/common/api/internal/zaak:zac	(Lcom/google/android/gms/common/api/internal/zaak;)Ljava/util/concurrent/locks/Lock;
    //   113: invokeinterface 88 1 0
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	zaam
    //   0	120	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    //   33	28	2	bool	boolean
    //   10	100	3	localzaak	zaak
    // Exception table:
    //   from	to	target	type
    //   54	60	108	finally
    //   74	94	108	finally
    //   94	105	108	finally
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */