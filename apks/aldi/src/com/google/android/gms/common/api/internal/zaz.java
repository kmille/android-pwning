package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import java.util.Map;

final class zaz
  implements OnCompleteListener<Map<zai<?>, String>>
{
  private zaz(zax paramzax) {}
  
  /* Error */
  public final void onComplete(@android.support.annotation.NonNull com.google.android.gms.tasks.Task<Map<zai<?>, String>> paramTask)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   4: invokestatic 29	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 34 1 0
    //   12: aload_0
    //   13: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   16: invokestatic 38	com/google/android/gms/common/api/internal/zax:zab	(Lcom/google/android/gms/common/api/internal/zax;)Z
    //   19: istore_2
    //   20: iload_2
    //   21: ifne +16 -> 37
    //   24: aload_0
    //   25: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   28: invokestatic 29	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/concurrent/locks/Lock;
    //   31: invokeinterface 41 1 0
    //   36: return
    //   37: aload_1
    //   38: invokevirtual 47	com/google/android/gms/tasks/Task:isSuccessful	()Z
    //   41: ifeq +90 -> 131
    //   44: aload_0
    //   45: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   48: new 49	android/support/v4/util/ArrayMap
    //   51: dup
    //   52: aload_0
    //   53: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   56: invokestatic 53	com/google/android/gms/common/api/internal/zax:zac	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   59: invokeinterface 59 1 0
    //   64: invokespecial 62	android/support/v4/util/ArrayMap:<init>	(I)V
    //   67: invokestatic 65	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Ljava/util/Map;)Ljava/util/Map;
    //   70: pop
    //   71: aload_0
    //   72: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   75: invokestatic 53	com/google/android/gms/common/api/internal/zax:zac	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   78: invokeinterface 69 1 0
    //   83: invokeinterface 75 1 0
    //   88: astore_1
    //   89: aload_1
    //   90: invokeinterface 80 1 0
    //   95: ifeq +275 -> 370
    //   98: aload_1
    //   99: invokeinterface 84 1 0
    //   104: checkcast 86	com/google/android/gms/common/api/internal/zaw
    //   107: astore_3
    //   108: aload_0
    //   109: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   112: invokestatic 89	com/google/android/gms/common/api/internal/zax:zad	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   115: aload_3
    //   116: invokevirtual 95	com/google/android/gms/common/api/GoogleApi:zak	()Lcom/google/android/gms/common/api/internal/zai;
    //   119: getstatic 101	com/google/android/gms/common/ConnectionResult:RESULT_SUCCESS	Lcom/google/android/gms/common/ConnectionResult;
    //   122: invokeinterface 105 3 0
    //   127: pop
    //   128: goto -39 -> 89
    //   131: aload_1
    //   132: invokevirtual 109	com/google/android/gms/tasks/Task:getException	()Ljava/lang/Exception;
    //   135: instanceof 111
    //   138: ifeq +191 -> 329
    //   141: aload_1
    //   142: invokevirtual 109	com/google/android/gms/tasks/Task:getException	()Ljava/lang/Exception;
    //   145: checkcast 111	com/google/android/gms/common/api/AvailabilityException
    //   148: astore 4
    //   150: aload_0
    //   151: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   154: invokestatic 114	com/google/android/gms/common/api/internal/zax:zae	(Lcom/google/android/gms/common/api/internal/zax;)Z
    //   157: ifeq +137 -> 294
    //   160: aload_0
    //   161: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   164: new 49	android/support/v4/util/ArrayMap
    //   167: dup
    //   168: aload_0
    //   169: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   172: invokestatic 53	com/google/android/gms/common/api/internal/zax:zac	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   175: invokeinterface 59 1 0
    //   180: invokespecial 62	android/support/v4/util/ArrayMap:<init>	(I)V
    //   183: invokestatic 65	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Ljava/util/Map;)Ljava/util/Map;
    //   186: pop
    //   187: aload_0
    //   188: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   191: invokestatic 53	com/google/android/gms/common/api/internal/zax:zac	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   194: invokeinterface 69 1 0
    //   199: invokeinterface 75 1 0
    //   204: astore 5
    //   206: aload 5
    //   208: invokeinterface 80 1 0
    //   213: ifeq +94 -> 307
    //   216: aload 5
    //   218: invokeinterface 84 1 0
    //   223: checkcast 86	com/google/android/gms/common/api/internal/zaw
    //   226: astore_1
    //   227: aload_1
    //   228: invokevirtual 95	com/google/android/gms/common/api/GoogleApi:zak	()Lcom/google/android/gms/common/api/internal/zai;
    //   231: astore 6
    //   233: aload 4
    //   235: aload_1
    //   236: invokevirtual 118	com/google/android/gms/common/api/AvailabilityException:getConnectionResult	(Lcom/google/android/gms/common/api/GoogleApi;)Lcom/google/android/gms/common/ConnectionResult;
    //   239: astore_3
    //   240: aload_0
    //   241: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   244: aload_1
    //   245: aload_3
    //   246: invokestatic 121	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Lcom/google/android/gms/common/api/internal/zaw;Lcom/google/android/gms/common/ConnectionResult;)Z
    //   249: ifeq +34 -> 283
    //   252: aload_0
    //   253: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   256: invokestatic 89	com/google/android/gms/common/api/internal/zax:zad	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   259: astore_1
    //   260: new 97	com/google/android/gms/common/ConnectionResult
    //   263: dup
    //   264: bipush 16
    //   266: invokespecial 122	com/google/android/gms/common/ConnectionResult:<init>	(I)V
    //   269: astore_3
    //   270: aload_1
    //   271: aload 6
    //   273: aload_3
    //   274: invokeinterface 105 3 0
    //   279: pop
    //   280: goto -74 -> 206
    //   283: aload_0
    //   284: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   287: invokestatic 89	com/google/android/gms/common/api/internal/zax:zad	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   290: astore_1
    //   291: goto -21 -> 270
    //   294: aload_0
    //   295: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   298: aload 4
    //   300: invokevirtual 126	com/google/android/gms/common/api/AvailabilityException:zaj	()Landroid/support/v4/util/ArrayMap;
    //   303: invokestatic 65	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Ljava/util/Map;)Ljava/util/Map;
    //   306: pop
    //   307: aload_0
    //   308: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   311: astore_3
    //   312: aload_0
    //   313: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   316: invokestatic 130	com/google/android/gms/common/api/internal/zax:zaf	(Lcom/google/android/gms/common/api/internal/zax;)Lcom/google/android/gms/common/ConnectionResult;
    //   319: astore_1
    //   320: aload_3
    //   321: aload_1
    //   322: invokestatic 133	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/ConnectionResult;
    //   325: pop
    //   326: goto +44 -> 370
    //   329: ldc -121
    //   331: ldc -119
    //   333: aload_1
    //   334: invokevirtual 109	com/google/android/gms/tasks/Task:getException	()Ljava/lang/Exception;
    //   337: invokestatic 143	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   340: pop
    //   341: aload_0
    //   342: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   345: invokestatic 149	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   348: invokestatic 65	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Ljava/util/Map;)Ljava/util/Map;
    //   351: pop
    //   352: aload_0
    //   353: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   356: astore_3
    //   357: new 97	com/google/android/gms/common/ConnectionResult
    //   360: dup
    //   361: bipush 8
    //   363: invokespecial 122	com/google/android/gms/common/ConnectionResult:<init>	(I)V
    //   366: astore_1
    //   367: goto -47 -> 320
    //   370: aload_0
    //   371: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   374: invokestatic 152	com/google/android/gms/common/api/internal/zax:zag	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   377: ifnull +37 -> 414
    //   380: aload_0
    //   381: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   384: invokestatic 89	com/google/android/gms/common/api/internal/zax:zad	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   387: aload_0
    //   388: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   391: invokestatic 152	com/google/android/gms/common/api/internal/zax:zag	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/Map;
    //   394: invokeinterface 156 2 0
    //   399: aload_0
    //   400: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   403: aload_0
    //   404: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   407: invokestatic 130	com/google/android/gms/common/api/internal/zax:zaf	(Lcom/google/android/gms/common/api/internal/zax;)Lcom/google/android/gms/common/ConnectionResult;
    //   410: invokestatic 133	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/ConnectionResult;
    //   413: pop
    //   414: aload_0
    //   415: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   418: invokestatic 159	com/google/android/gms/common/api/internal/zax:zah	(Lcom/google/android/gms/common/api/internal/zax;)Lcom/google/android/gms/common/ConnectionResult;
    //   421: ifnonnull +20 -> 441
    //   424: aload_0
    //   425: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   428: invokestatic 162	com/google/android/gms/common/api/internal/zax:zai	(Lcom/google/android/gms/common/api/internal/zax;)V
    //   431: aload_0
    //   432: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   435: invokestatic 164	com/google/android/gms/common/api/internal/zax:zaj	(Lcom/google/android/gms/common/api/internal/zax;)V
    //   438: goto +29 -> 467
    //   441: aload_0
    //   442: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   445: iconst_0
    //   446: invokestatic 167	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;Z)Z
    //   449: pop
    //   450: aload_0
    //   451: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   454: invokestatic 170	com/google/android/gms/common/api/internal/zax:zak	(Lcom/google/android/gms/common/api/internal/zax;)Lcom/google/android/gms/common/api/internal/zaaw;
    //   457: aload_0
    //   458: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   461: invokestatic 159	com/google/android/gms/common/api/internal/zax:zah	(Lcom/google/android/gms/common/api/internal/zax;)Lcom/google/android/gms/common/ConnectionResult;
    //   464: invokevirtual 175	com/google/android/gms/common/api/internal/zaaw:zac	(Lcom/google/android/gms/common/ConnectionResult;)V
    //   467: aload_0
    //   468: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   471: invokestatic 179	com/google/android/gms/common/api/internal/zax:zal	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/concurrent/locks/Condition;
    //   474: invokeinterface 184 1 0
    //   479: goto -455 -> 24
    //   482: astore_1
    //   483: aload_0
    //   484: getfield 13	com/google/android/gms/common/api/internal/zaz:zafh	Lcom/google/android/gms/common/api/internal/zax;
    //   487: invokestatic 29	com/google/android/gms/common/api/internal/zax:zaa	(Lcom/google/android/gms/common/api/internal/zax;)Ljava/util/concurrent/locks/Lock;
    //   490: invokeinterface 41 1 0
    //   495: aload_1
    //   496: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	497	0	this	zaz
    //   0	497	1	paramTask	com.google.android.gms.tasks.Task<Map<zai<?>, String>>
    //   19	2	2	bool	boolean
    //   107	250	3	localObject	Object
    //   148	151	4	localAvailabilityException	com.google.android.gms.common.api.AvailabilityException
    //   204	13	5	localIterator	java.util.Iterator
    //   231	41	6	localzai	zai
    // Exception table:
    //   from	to	target	type
    //   12	20	482	finally
    //   37	89	482	finally
    //   89	128	482	finally
    //   131	206	482	finally
    //   206	270	482	finally
    //   270	280	482	finally
    //   283	291	482	finally
    //   294	307	482	finally
    //   307	320	482	finally
    //   320	326	482	finally
    //   329	367	482	finally
    //   370	414	482	finally
    //   414	438	482	finally
    //   441	467	482	finally
    //   467	479	482	finally
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/api/internal/zaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */