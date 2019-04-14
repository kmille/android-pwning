package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzl;
import com.google.android.gms.internal.measurement.zzwq;

final class zzer
  implements Runnable
{
  private final String zzaxm;
  private volatile String zzaym;
  private final zzwq zzbcl;
  private final String zzbcm;
  private zzdh<zzl> zzbcn;
  private volatile zzal zzbco;
  private volatile String zzbcp;
  private final Context zzqx;
  
  @VisibleForTesting
  private zzer(Context paramContext, String paramString, zzwq paramzzwq, zzal paramzzal)
  {
    this.zzqx = paramContext;
    this.zzbcl = paramzzwq;
    this.zzaxm = paramString;
    this.zzbco = paramzzal;
    paramContext = String.valueOf("/r?id=");
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramContext = paramContext.concat(paramString);
    } else {
      paramContext = new String(paramContext);
    }
    this.zzbcm = paramContext;
    this.zzaym = this.zzbcm;
    this.zzbcp = null;
  }
  
  public zzer(Context paramContext, String paramString, zzal paramzzal)
  {
    this(paramContext, paramString, new zzwq(), paramzzal);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   4: ifnull +824 -> 828
    //   7: aload_0
    //   8: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   11: invokeinterface 81 1 0
    //   16: aload_0
    //   17: getfield 28	com/google/android/gms/tagmanager/zzer:zzqx	Landroid/content/Context;
    //   20: ldc 83
    //   22: invokevirtual 89	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   25: checkcast 91	android/net/ConnectivityManager
    //   28: invokevirtual 95	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   31: astore_2
    //   32: aload_2
    //   33: ifnull +18 -> 51
    //   36: aload_2
    //   37: invokevirtual 101	android/net/NetworkInfo:isConnected	()Z
    //   40: ifne +6 -> 46
    //   43: goto +8 -> 51
    //   46: iconst_1
    //   47: istore_1
    //   48: goto +10 -> 58
    //   51: ldc 103
    //   53: invokestatic 108	com/google/android/gms/tagmanager/zzdi:v	(Ljava/lang/String;)V
    //   56: iconst_0
    //   57: istore_1
    //   58: iload_1
    //   59: ifne +16 -> 75
    //   62: aload_0
    //   63: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   66: getstatic 114	com/google/android/gms/tagmanager/zzcz:zzbbb	I
    //   69: invokeinterface 118 2 0
    //   74: return
    //   75: ldc 120
    //   77: invokestatic 108	com/google/android/gms/tagmanager/zzdi:v	(Ljava/lang/String;)V
    //   80: aload_0
    //   81: getfield 34	com/google/android/gms/tagmanager/zzer:zzbco	Lcom/google/android/gms/tagmanager/zzal;
    //   84: invokevirtual 126	com/google/android/gms/tagmanager/zzal:zznd	()Ljava/lang/String;
    //   87: astore_2
    //   88: aload_0
    //   89: getfield 57	com/google/android/gms/tagmanager/zzer:zzaym	Ljava/lang/String;
    //   92: astore_3
    //   93: new 128	java/lang/StringBuilder
    //   96: dup
    //   97: aload_2
    //   98: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   101: invokevirtual 46	java/lang/String:length	()I
    //   104: bipush 12
    //   106: iadd
    //   107: aload_3
    //   108: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   111: invokevirtual 46	java/lang/String:length	()I
    //   114: iadd
    //   115: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   118: astore 4
    //   120: aload 4
    //   122: aload_2
    //   123: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload 4
    //   129: aload_3
    //   130: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload 4
    //   136: ldc -120
    //   138: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload 4
    //   144: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: astore_2
    //   148: aload_2
    //   149: astore_3
    //   150: aload_0
    //   151: getfield 59	com/google/android/gms/tagmanager/zzer:zzbcp	Ljava/lang/String;
    //   154: ifnull +84 -> 238
    //   157: aload_2
    //   158: astore_3
    //   159: aload_0
    //   160: getfield 59	com/google/android/gms/tagmanager/zzer:zzbcp	Ljava/lang/String;
    //   163: invokevirtual 142	java/lang/String:trim	()Ljava/lang/String;
    //   166: ldc -112
    //   168: invokevirtual 148	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   171: ifne +67 -> 238
    //   174: aload_2
    //   175: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   178: astore_2
    //   179: aload_0
    //   180: getfield 59	com/google/android/gms/tagmanager/zzer:zzbcp	Ljava/lang/String;
    //   183: astore_3
    //   184: new 128	java/lang/StringBuilder
    //   187: dup
    //   188: aload_2
    //   189: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 46	java/lang/String:length	()I
    //   195: iconst_4
    //   196: iadd
    //   197: aload_3
    //   198: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   201: invokevirtual 46	java/lang/String:length	()I
    //   204: iadd
    //   205: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   208: astore 4
    //   210: aload 4
    //   212: aload_2
    //   213: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload 4
    //   219: ldc -106
    //   221: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload 4
    //   227: aload_3
    //   228: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aload 4
    //   234: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: astore_3
    //   238: aload_3
    //   239: astore_2
    //   240: invokestatic 156	com/google/android/gms/tagmanager/zzeh:zzok	()Lcom/google/android/gms/tagmanager/zzeh;
    //   243: invokevirtual 160	com/google/android/gms/tagmanager/zzeh:zzol	()Lcom/google/android/gms/tagmanager/zzeh$zza;
    //   246: getstatic 166	com/google/android/gms/tagmanager/zzeh$zza:zzbcd	Lcom/google/android/gms/tagmanager/zzeh$zza;
    //   249: invokevirtual 167	com/google/android/gms/tagmanager/zzeh$zza:equals	(Ljava/lang/Object;)Z
    //   252: ifeq +39 -> 291
    //   255: aload_3
    //   256: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   259: astore_2
    //   260: ldc -87
    //   262: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   265: astore_3
    //   266: aload_3
    //   267: invokevirtual 46	java/lang/String:length	()I
    //   270: ifeq +12 -> 282
    //   273: aload_2
    //   274: aload_3
    //   275: invokevirtual 50	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   278: astore_2
    //   279: goto +12 -> 291
    //   282: new 38	java/lang/String
    //   285: dup
    //   286: aload_2
    //   287: invokespecial 53	java/lang/String:<init>	(Ljava/lang/String;)V
    //   290: astore_2
    //   291: invokestatic 173	com/google/android/gms/internal/measurement/zzwq:zzsf	()Lcom/google/android/gms/internal/measurement/zzwp;
    //   294: astore 5
    //   296: aconst_null
    //   297: astore 4
    //   299: aload 5
    //   301: aload_2
    //   302: invokeinterface 179 2 0
    //   307: astore_3
    //   308: goto +153 -> 461
    //   311: astore_2
    //   312: goto +507 -> 819
    //   315: astore_3
    //   316: aload_3
    //   317: invokevirtual 182	java/io/IOException:getMessage	()Ljava/lang/String;
    //   320: astore 4
    //   322: new 128	java/lang/StringBuilder
    //   325: dup
    //   326: aload_2
    //   327: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   330: invokevirtual 46	java/lang/String:length	()I
    //   333: bipush 40
    //   335: iadd
    //   336: aload 4
    //   338: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   341: invokevirtual 46	java/lang/String:length	()I
    //   344: iadd
    //   345: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   348: astore 6
    //   350: aload 6
    //   352: ldc -72
    //   354: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: pop
    //   358: aload 6
    //   360: aload_2
    //   361: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload 6
    //   367: ldc -70
    //   369: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: aload 6
    //   375: aload 4
    //   377: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload 6
    //   383: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: aload_3
    //   387: invokestatic 190	com/google/android/gms/tagmanager/zzdi:zzb	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   390: aload_0
    //   391: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   394: getstatic 193	com/google/android/gms/tagmanager/zzcz:zzbbc	I
    //   397: invokeinterface 118 2 0
    //   402: aload 5
    //   404: invokeinterface 196 1 0
    //   409: return
    //   410: aload_2
    //   411: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   414: astore_3
    //   415: aload_3
    //   416: invokevirtual 46	java/lang/String:length	()I
    //   419: ifeq +13 -> 432
    //   422: ldc -58
    //   424: aload_3
    //   425: invokevirtual 50	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   428: astore_3
    //   429: goto +13 -> 442
    //   432: new 38	java/lang/String
    //   435: dup
    //   436: ldc -58
    //   438: invokespecial 53	java/lang/String:<init>	(Ljava/lang/String;)V
    //   441: astore_3
    //   442: aload_3
    //   443: invokestatic 201	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   446: aload_0
    //   447: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   450: getstatic 204	com/google/android/gms/tagmanager/zzcz:zzbbe	I
    //   453: invokeinterface 118 2 0
    //   458: aload 4
    //   460: astore_3
    //   461: new 206	java/io/ByteArrayOutputStream
    //   464: dup
    //   465: invokespecial 207	java/io/ByteArrayOutputStream:<init>	()V
    //   468: astore 4
    //   470: aload_3
    //   471: aload 4
    //   473: invokestatic 213	com/google/android/gms/internal/measurement/zzwe:zza	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   476: aload 4
    //   478: invokevirtual 217	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   481: astore_3
    //   482: new 219	com/google/android/gms/internal/measurement/zzl
    //   485: dup
    //   486: invokespecial 220	com/google/android/gms/internal/measurement/zzl:<init>	()V
    //   489: aload_3
    //   490: invokestatic 225	com/google/android/gms/internal/measurement/zzacj:zza	(Lcom/google/android/gms/internal/measurement/zzacj;[B)Lcom/google/android/gms/internal/measurement/zzacj;
    //   493: checkcast 219	com/google/android/gms/internal/measurement/zzl
    //   496: astore 4
    //   498: aload 4
    //   500: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   503: astore_3
    //   504: new 128	java/lang/StringBuilder
    //   507: dup
    //   508: aload_3
    //   509: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   512: invokevirtual 46	java/lang/String:length	()I
    //   515: bipush 43
    //   517: iadd
    //   518: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   521: astore 6
    //   523: aload 6
    //   525: ldc -29
    //   527: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: pop
    //   531: aload 6
    //   533: aload_3
    //   534: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   537: pop
    //   538: aload 6
    //   540: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   543: invokestatic 108	com/google/android/gms/tagmanager/zzdi:v	(Ljava/lang/String;)V
    //   546: aload 4
    //   548: getfield 231	com/google/android/gms/internal/measurement/zzl:zzpv	Lcom/google/android/gms/internal/measurement/zzi;
    //   551: ifnonnull +51 -> 602
    //   554: aload 4
    //   556: getfield 235	com/google/android/gms/internal/measurement/zzl:zzpu	[Lcom/google/android/gms/internal/measurement/zzk;
    //   559: arraylength
    //   560: ifne +42 -> 602
    //   563: aload_0
    //   564: getfield 32	com/google/android/gms/tagmanager/zzer:zzaxm	Ljava/lang/String;
    //   567: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   570: astore_3
    //   571: aload_3
    //   572: invokevirtual 46	java/lang/String:length	()I
    //   575: ifeq +13 -> 588
    //   578: ldc -19
    //   580: aload_3
    //   581: invokevirtual 50	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   584: astore_3
    //   585: goto +13 -> 598
    //   588: new 38	java/lang/String
    //   591: dup
    //   592: ldc -19
    //   594: invokespecial 53	java/lang/String:<init>	(Ljava/lang/String;)V
    //   597: astore_3
    //   598: aload_3
    //   599: invokestatic 108	com/google/android/gms/tagmanager/zzdi:v	(Ljava/lang/String;)V
    //   602: aload_0
    //   603: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   606: aload 4
    //   608: invokeinterface 241 2 0
    //   613: aload 5
    //   615: invokeinterface 196 1 0
    //   620: ldc -13
    //   622: invokestatic 108	com/google/android/gms/tagmanager/zzdi:v	(Ljava/lang/String;)V
    //   625: return
    //   626: astore_3
    //   627: aload_3
    //   628: invokevirtual 182	java/io/IOException:getMessage	()Ljava/lang/String;
    //   631: astore 4
    //   633: new 128	java/lang/StringBuilder
    //   636: dup
    //   637: aload_2
    //   638: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   641: invokevirtual 46	java/lang/String:length	()I
    //   644: bipush 51
    //   646: iadd
    //   647: aload 4
    //   649: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   652: invokevirtual 46	java/lang/String:length	()I
    //   655: iadd
    //   656: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   659: astore 6
    //   661: aload 6
    //   663: ldc -11
    //   665: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   668: pop
    //   669: aload 6
    //   671: aload_2
    //   672: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   675: pop
    //   676: aload 6
    //   678: ldc -70
    //   680: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: pop
    //   684: aload 6
    //   686: aload 4
    //   688: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   691: pop
    //   692: aload 6
    //   694: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   697: aload_3
    //   698: invokestatic 190	com/google/android/gms/tagmanager/zzdi:zzb	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   701: aload_0
    //   702: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   705: getstatic 248	com/google/android/gms/tagmanager/zzcz:zzbbd	I
    //   708: invokeinterface 118 2 0
    //   713: aload 5
    //   715: invokeinterface 196 1 0
    //   720: return
    //   721: aload_0
    //   722: getfield 32	com/google/android/gms/tagmanager/zzer:zzaxm	Ljava/lang/String;
    //   725: astore_3
    //   726: new 128	java/lang/StringBuilder
    //   729: dup
    //   730: aload_2
    //   731: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   734: invokevirtual 46	java/lang/String:length	()I
    //   737: bipush 79
    //   739: iadd
    //   740: aload_3
    //   741: invokestatic 42	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   744: invokevirtual 46	java/lang/String:length	()I
    //   747: iadd
    //   748: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   751: astore 4
    //   753: aload 4
    //   755: ldc -6
    //   757: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: aload 4
    //   763: aload_2
    //   764: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: pop
    //   768: aload 4
    //   770: ldc -4
    //   772: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   775: pop
    //   776: aload 4
    //   778: aload_3
    //   779: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: aload 4
    //   785: ldc -2
    //   787: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: pop
    //   791: aload 4
    //   793: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   796: invokestatic 201	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   799: aload_0
    //   800: getfield 76	com/google/android/gms/tagmanager/zzer:zzbcn	Lcom/google/android/gms/tagmanager/zzdh;
    //   803: getstatic 248	com/google/android/gms/tagmanager/zzcz:zzbbd	I
    //   806: invokeinterface 118 2 0
    //   811: aload 5
    //   813: invokeinterface 196 1 0
    //   818: return
    //   819: aload 5
    //   821: invokeinterface 196 1 0
    //   826: aload_2
    //   827: athrow
    //   828: new 256	java/lang/IllegalStateException
    //   831: dup
    //   832: ldc_w 258
    //   835: invokespecial 259	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   838: athrow
    //   839: astore_3
    //   840: goto -119 -> 721
    //   843: astore_3
    //   844: goto -434 -> 410
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	847	0	this	zzer
    //   47	12	1	i	int
    //   31	271	2	localObject1	Object
    //   311	516	2	localObject2	Object
    //   92	216	3	localObject3	Object
    //   315	72	3	localIOException1	java.io.IOException
    //   414	185	3	localObject4	Object
    //   626	72	3	localIOException2	java.io.IOException
    //   725	54	3	str	String
    //   839	1	3	localFileNotFoundException	java.io.FileNotFoundException
    //   843	1	3	localzzwr	com.google.android.gms.internal.measurement.zzwr
    //   118	674	4	localObject5	Object
    //   294	526	5	localzzwp	com.google.android.gms.internal.measurement.zzwp
    //   348	345	6	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   299	308	311	finally
    //   316	402	311	finally
    //   410	429	311	finally
    //   432	442	311	finally
    //   442	458	311	finally
    //   461	585	311	finally
    //   588	598	311	finally
    //   598	602	311	finally
    //   602	613	311	finally
    //   627	713	311	finally
    //   721	811	311	finally
    //   299	308	315	java/io/IOException
    //   461	585	626	java/io/IOException
    //   588	598	626	java/io/IOException
    //   598	602	626	java/io/IOException
    //   602	613	626	java/io/IOException
    //   299	308	839	java/io/FileNotFoundException
    //   299	308	843	com/google/android/gms/internal/measurement/zzwr
  }
  
  final void zza(zzdh<zzl> paramzzdh)
  {
    this.zzbcn = paramzzdh;
  }
  
  @VisibleForTesting
  final void zzct(String paramString)
  {
    if (paramString == null) {
      paramString = this.zzbcm;
    }
    for (;;)
    {
      this.zzaym = paramString;
      return;
      String str = String.valueOf(paramString);
      if (str.length() != 0) {
        str = "Setting CTFE URL path: ".concat(str);
      } else {
        str = new String("Setting CTFE URL path: ");
      }
      zzdi.zzda(str);
    }
  }
  
  @VisibleForTesting
  final void zzdl(String paramString)
  {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      str = "Setting previous container version: ".concat(str);
    } else {
      str = new String("Setting previous container version: ");
    }
    zzdi.zzda(str);
    this.zzbcp = paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */