package com.google.android.gms.ads.identifier;

import java.util.Map;

final class zza
  extends Thread
{
  zza(AdvertisingIdClient paramAdvertisingIdClient, Map paramMap) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: new 23	com/google/android/gms/ads/identifier/zzc
    //   3: dup
    //   4: invokespecial 24	com/google/android/gms/ads/identifier/zzc:<init>	()V
    //   7: pop
    //   8: aload_0
    //   9: getfield 10	com/google/android/gms/ads/identifier/zza:zzl	Ljava/util/Map;
    //   12: astore_2
    //   13: ldc 26
    //   15: invokestatic 32	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   18: invokevirtual 36	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   21: astore_3
    //   22: aload_2
    //   23: invokeinterface 42 1 0
    //   28: invokeinterface 48 1 0
    //   33: astore 4
    //   35: aload 4
    //   37: invokeinterface 54 1 0
    //   42: ifeq +36 -> 78
    //   45: aload 4
    //   47: invokeinterface 58 1 0
    //   52: checkcast 60	java/lang/String
    //   55: astore 5
    //   57: aload_3
    //   58: aload 5
    //   60: aload_2
    //   61: aload 5
    //   63: invokeinterface 64 2 0
    //   68: checkcast 60	java/lang/String
    //   71: invokevirtual 70	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   74: pop
    //   75: goto -40 -> 35
    //   78: aload_3
    //   79: invokevirtual 74	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   82: invokevirtual 78	android/net/Uri:toString	()Ljava/lang/String;
    //   85: astore 5
    //   87: new 80	java/net/URL
    //   90: dup
    //   91: aload 5
    //   93: invokespecial 83	java/net/URL:<init>	(Ljava/lang/String;)V
    //   96: invokevirtual 87	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   99: checkcast 89	java/net/HttpURLConnection
    //   102: astore_2
    //   103: aload_2
    //   104: invokevirtual 93	java/net/HttpURLConnection:getResponseCode	()I
    //   107: istore_1
    //   108: iload_1
    //   109: sipush 200
    //   112: if_icmplt +10 -> 122
    //   115: iload_1
    //   116: sipush 300
    //   119: if_icmplt +49 -> 168
    //   122: new 95	java/lang/StringBuilder
    //   125: dup
    //   126: aload 5
    //   128: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   131: invokevirtual 102	java/lang/String:length	()I
    //   134: bipush 65
    //   136: iadd
    //   137: invokespecial 105	java/lang/StringBuilder:<init>	(I)V
    //   140: astore_3
    //   141: aload_3
    //   142: ldc 107
    //   144: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload_3
    //   149: iload_1
    //   150: invokevirtual 114	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_3
    //   155: ldc 116
    //   157: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload_3
    //   162: aload 5
    //   164: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_2
    //   169: invokevirtual 119	java/net/HttpURLConnection:disconnect	()V
    //   172: return
    //   173: astore_3
    //   174: aload_2
    //   175: invokevirtual 119	java/net/HttpURLConnection:disconnect	()V
    //   178: aload_3
    //   179: athrow
    //   180: astore_2
    //   181: aload_2
    //   182: invokevirtual 124	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   185: astore_2
    //   186: new 95	java/lang/StringBuilder
    //   189: dup
    //   190: aload 5
    //   192: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   195: invokevirtual 102	java/lang/String:length	()I
    //   198: bipush 27
    //   200: iadd
    //   201: aload_2
    //   202: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   205: invokevirtual 102	java/lang/String:length	()I
    //   208: iadd
    //   209: invokespecial 105	java/lang/StringBuilder:<init>	(I)V
    //   212: astore 4
    //   214: ldc 126
    //   216: astore_3
    //   217: aload 4
    //   219: aload_3
    //   220: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload 4
    //   226: aload 5
    //   228: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aload 4
    //   234: ldc -128
    //   236: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload 4
    //   242: aload_2
    //   243: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: return
    //   248: astore_2
    //   249: aload_2
    //   250: invokevirtual 129	java/lang/IndexOutOfBoundsException:getMessage	()Ljava/lang/String;
    //   253: astore_2
    //   254: new 95	java/lang/StringBuilder
    //   257: dup
    //   258: aload 5
    //   260: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   263: invokevirtual 102	java/lang/String:length	()I
    //   266: bipush 32
    //   268: iadd
    //   269: aload_2
    //   270: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   273: invokevirtual 102	java/lang/String:length	()I
    //   276: iadd
    //   277: invokespecial 105	java/lang/StringBuilder:<init>	(I)V
    //   280: astore 4
    //   282: ldc -125
    //   284: astore_3
    //   285: goto -68 -> 217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	this	zza
    //   107	43	1	i	int
    //   12	163	2	localObject1	Object
    //   180	2	2	localIOException	java.io.IOException
    //   185	58	2	str1	String
    //   248	2	2	localIndexOutOfBoundsException	IndexOutOfBoundsException
    //   253	17	2	str2	String
    //   21	141	3	localObject2	Object
    //   173	6	3	localObject3	Object
    //   216	69	3	str3	String
    //   33	248	4	localObject4	Object
    //   55	204	5	str4	String
    // Exception table:
    //   from	to	target	type
    //   103	108	173	finally
    //   122	168	173	finally
    //   87	103	180	java/io/IOException
    //   87	103	180	java/lang/RuntimeException
    //   168	172	180	java/io/IOException
    //   168	172	180	java/lang/RuntimeException
    //   174	180	180	java/io/IOException
    //   174	180	180	java/lang/RuntimeException
    //   87	103	248	java/lang/IndexOutOfBoundsException
    //   168	172	248	java/lang/IndexOutOfBoundsException
    //   174	180	248	java/lang/IndexOutOfBoundsException
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/ads/identifier/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */