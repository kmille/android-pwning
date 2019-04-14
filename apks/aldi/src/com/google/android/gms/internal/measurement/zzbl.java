package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzbl
  extends zzar
{
  private volatile String zzud;
  private Future<String> zzxr;
  
  protected zzbl(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  /* Error */
  private final boolean zzb(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 32	com/google/android/gms/common/internal/Preconditions:checkNotEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: ldc 34
    //   7: invokestatic 38	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   10: aconst_null
    //   11: astore 4
    //   13: aconst_null
    //   14: astore 5
    //   16: aconst_null
    //   17: astore 6
    //   19: aload 6
    //   21: astore_3
    //   22: aload_0
    //   23: ldc 40
    //   25: aload_2
    //   26: invokevirtual 45	com/google/android/gms/internal/measurement/zzaq:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   29: aload 6
    //   31: astore_3
    //   32: aload_1
    //   33: ldc 47
    //   35: iconst_0
    //   36: invokevirtual 53	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   39: astore_1
    //   40: aload_1
    //   41: aload_2
    //   42: invokevirtual 59	java/lang/String:getBytes	()[B
    //   45: invokevirtual 65	java/io/FileOutputStream:write	([B)V
    //   48: aload_1
    //   49: ifnull +18 -> 67
    //   52: aload_1
    //   53: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   56: goto +11 -> 67
    //   59: astore_1
    //   60: aload_0
    //   61: ldc 71
    //   63: aload_1
    //   64: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   67: iconst_1
    //   68: ireturn
    //   69: astore_2
    //   70: aload_1
    //   71: astore_3
    //   72: aload_2
    //   73: astore_1
    //   74: goto +81 -> 155
    //   77: astore_2
    //   78: goto +15 -> 93
    //   81: astore_2
    //   82: goto +44 -> 126
    //   85: astore_1
    //   86: goto +69 -> 155
    //   89: astore_2
    //   90: aload 4
    //   92: astore_1
    //   93: aload_1
    //   94: astore_3
    //   95: aload_0
    //   96: ldc 76
    //   98: aload_2
    //   99: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   102: aload_1
    //   103: ifnull +17 -> 120
    //   106: aload_1
    //   107: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   110: iconst_0
    //   111: ireturn
    //   112: astore_1
    //   113: aload_0
    //   114: ldc 71
    //   116: aload_1
    //   117: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   120: iconst_0
    //   121: ireturn
    //   122: astore_2
    //   123: aload 5
    //   125: astore_1
    //   126: aload_1
    //   127: astore_3
    //   128: aload_0
    //   129: ldc 78
    //   131: aload_2
    //   132: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   135: aload_1
    //   136: ifnull +17 -> 153
    //   139: aload_1
    //   140: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   143: iconst_0
    //   144: ireturn
    //   145: astore_1
    //   146: aload_0
    //   147: ldc 71
    //   149: aload_1
    //   150: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   153: iconst_0
    //   154: ireturn
    //   155: aload_3
    //   156: ifnull +18 -> 174
    //   159: aload_3
    //   160: invokevirtual 69	java/io/FileOutputStream:close	()V
    //   163: goto +11 -> 174
    //   166: astore_2
    //   167: aload_0
    //   168: ldc 71
    //   170: aload_2
    //   171: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   174: aload_1
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	zzbl
    //   0	176	1	paramContext	android.content.Context
    //   0	176	2	paramString	String
    //   21	139	3	localObject1	Object
    //   11	80	4	localObject2	Object
    //   14	110	5	localObject3	Object
    //   17	13	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   52	56	59	java/io/IOException
    //   40	48	69	finally
    //   40	48	77	java/io/IOException
    //   40	48	81	java/io/FileNotFoundException
    //   22	29	85	finally
    //   32	40	85	finally
    //   95	102	85	finally
    //   128	135	85	finally
    //   22	29	89	java/io/IOException
    //   32	40	89	java/io/IOException
    //   106	110	112	java/io/IOException
    //   22	29	122	java/io/FileNotFoundException
    //   32	40	122	java/io/FileNotFoundException
    //   139	143	145	java/io/IOException
    //   159	163	166	java/io/IOException
  }
  
  /* Error */
  private final String zzd(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 82
    //   2: invokestatic 38	com/google/android/gms/common/internal/Preconditions:checkNotMainThread	(Ljava/lang/String;)V
    //   5: aload_1
    //   6: ldc 47
    //   8: invokevirtual 86	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore 4
    //   13: aload 4
    //   15: astore_3
    //   16: bipush 36
    //   18: newarray <illegal type>
    //   20: astore 5
    //   22: aload 4
    //   24: astore_3
    //   25: aload 4
    //   27: aload 5
    //   29: iconst_0
    //   30: bipush 36
    //   32: invokevirtual 92	java/io/FileInputStream:read	([BII)I
    //   35: istore_2
    //   36: aload 4
    //   38: astore_3
    //   39: aload 4
    //   41: invokevirtual 96	java/io/FileInputStream:available	()I
    //   44: ifle +52 -> 96
    //   47: aload 4
    //   49: astore_3
    //   50: aload_0
    //   51: ldc 98
    //   53: invokevirtual 101	com/google/android/gms/internal/measurement/zzaq:zzt	(Ljava/lang/String;)V
    //   56: aload 4
    //   58: astore_3
    //   59: aload 4
    //   61: invokevirtual 102	java/io/FileInputStream:close	()V
    //   64: aload 4
    //   66: astore_3
    //   67: aload_1
    //   68: ldc 47
    //   70: invokevirtual 106	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   73: pop
    //   74: aload 4
    //   76: ifnull +18 -> 94
    //   79: aload 4
    //   81: invokevirtual 102	java/io/FileInputStream:close	()V
    //   84: aconst_null
    //   85: areturn
    //   86: astore_1
    //   87: aload_0
    //   88: ldc 108
    //   90: aload_1
    //   91: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   94: aconst_null
    //   95: areturn
    //   96: iload_2
    //   97: bipush 14
    //   99: if_icmpge +52 -> 151
    //   102: aload 4
    //   104: astore_3
    //   105: aload_0
    //   106: ldc 110
    //   108: invokevirtual 101	com/google/android/gms/internal/measurement/zzaq:zzt	(Ljava/lang/String;)V
    //   111: aload 4
    //   113: astore_3
    //   114: aload 4
    //   116: invokevirtual 102	java/io/FileInputStream:close	()V
    //   119: aload 4
    //   121: astore_3
    //   122: aload_1
    //   123: ldc 47
    //   125: invokevirtual 106	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   128: pop
    //   129: aload 4
    //   131: ifnull +18 -> 149
    //   134: aload 4
    //   136: invokevirtual 102	java/io/FileInputStream:close	()V
    //   139: aconst_null
    //   140: areturn
    //   141: astore_1
    //   142: aload_0
    //   143: ldc 108
    //   145: aload_1
    //   146: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   149: aconst_null
    //   150: areturn
    //   151: aload 4
    //   153: astore_3
    //   154: aload 4
    //   156: invokevirtual 102	java/io/FileInputStream:close	()V
    //   159: aload 4
    //   161: astore_3
    //   162: new 55	java/lang/String
    //   165: dup
    //   166: aload 5
    //   168: iconst_0
    //   169: iload_2
    //   170: invokespecial 113	java/lang/String:<init>	([BII)V
    //   173: astore 5
    //   175: aload 4
    //   177: astore_3
    //   178: aload_0
    //   179: ldc 115
    //   181: aload 5
    //   183: invokevirtual 45	com/google/android/gms/internal/measurement/zzaq:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   186: aload 4
    //   188: ifnull +19 -> 207
    //   191: aload 4
    //   193: invokevirtual 102	java/io/FileInputStream:close	()V
    //   196: aload 5
    //   198: areturn
    //   199: astore_1
    //   200: aload_0
    //   201: ldc 108
    //   203: aload_1
    //   204: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   207: aload 5
    //   209: areturn
    //   210: astore 5
    //   212: goto +14 -> 226
    //   215: astore_1
    //   216: aconst_null
    //   217: astore_3
    //   218: goto +52 -> 270
    //   221: astore 5
    //   223: aconst_null
    //   224: astore 4
    //   226: aload 4
    //   228: astore_3
    //   229: aload_0
    //   230: ldc 117
    //   232: aload 5
    //   234: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   237: aload 4
    //   239: astore_3
    //   240: aload_1
    //   241: ldc 47
    //   243: invokevirtual 106	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   246: pop
    //   247: aload 4
    //   249: ifnull +18 -> 267
    //   252: aload 4
    //   254: invokevirtual 102	java/io/FileInputStream:close	()V
    //   257: aconst_null
    //   258: areturn
    //   259: astore_1
    //   260: aload_0
    //   261: ldc 108
    //   263: aload_1
    //   264: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   267: aconst_null
    //   268: areturn
    //   269: astore_1
    //   270: aload_3
    //   271: ifnull +18 -> 289
    //   274: aload_3
    //   275: invokevirtual 102	java/io/FileInputStream:close	()V
    //   278: goto +11 -> 289
    //   281: astore_3
    //   282: aload_0
    //   283: ldc 108
    //   285: aload_3
    //   286: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   289: aload_1
    //   290: athrow
    //   291: aconst_null
    //   292: astore 4
    //   294: aload 4
    //   296: ifnull +18 -> 314
    //   299: aload 4
    //   301: invokevirtual 102	java/io/FileInputStream:close	()V
    //   304: aconst_null
    //   305: areturn
    //   306: astore_1
    //   307: aload_0
    //   308: ldc 108
    //   310: aload_1
    //   311: invokevirtual 74	com/google/android/gms/internal/measurement/zzaq:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   314: aconst_null
    //   315: areturn
    //   316: astore_1
    //   317: goto -26 -> 291
    //   320: astore_1
    //   321: goto -27 -> 294
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	324	0	this	zzbl
    //   0	324	1	paramContext	android.content.Context
    //   35	135	2	i	int
    //   15	260	3	localFileInputStream1	java.io.FileInputStream
    //   281	5	3	localIOException1	java.io.IOException
    //   11	289	4	localFileInputStream2	java.io.FileInputStream
    //   20	188	5	localObject	Object
    //   210	1	5	localIOException2	java.io.IOException
    //   221	12	5	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   79	84	86	java/io/IOException
    //   134	139	141	java/io/IOException
    //   191	196	199	java/io/IOException
    //   16	22	210	java/io/IOException
    //   25	36	210	java/io/IOException
    //   39	47	210	java/io/IOException
    //   50	56	210	java/io/IOException
    //   59	64	210	java/io/IOException
    //   67	74	210	java/io/IOException
    //   105	111	210	java/io/IOException
    //   114	119	210	java/io/IOException
    //   122	129	210	java/io/IOException
    //   154	159	210	java/io/IOException
    //   162	175	210	java/io/IOException
    //   178	186	210	java/io/IOException
    //   5	13	215	finally
    //   5	13	221	java/io/IOException
    //   252	257	259	java/io/IOException
    //   16	22	269	finally
    //   25	36	269	finally
    //   39	47	269	finally
    //   50	56	269	finally
    //   59	64	269	finally
    //   67	74	269	finally
    //   105	111	269	finally
    //   114	119	269	finally
    //   122	129	269	finally
    //   154	159	269	finally
    //   162	175	269	finally
    //   178	186	269	finally
    //   229	237	269	finally
    //   240	247	269	finally
    //   274	278	281	java/io/IOException
    //   299	304	306	java/io/IOException
    //   5	13	316	java/io/FileNotFoundException
    //   16	22	320	java/io/FileNotFoundException
    //   25	36	320	java/io/FileNotFoundException
    //   39	47	320	java/io/FileNotFoundException
    //   50	56	320	java/io/FileNotFoundException
    //   59	64	320	java/io/FileNotFoundException
    //   67	74	320	java/io/FileNotFoundException
    //   105	111	320	java/io/FileNotFoundException
    //   114	119	320	java/io/FileNotFoundException
    //   122	129	320	java/io/FileNotFoundException
    //   154	159	320	java/io/FileNotFoundException
    //   162	175	320	java/io/FileNotFoundException
    //   178	186	320	java/io/FileNotFoundException
  }
  
  @VisibleForTesting
  private final String zzdq()
  {
    String str2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
    String str1 = str2;
    try
    {
      if (!zzb(zzbw().getContext(), str2)) {
        str1 = "0";
      }
      return str1;
    }
    catch (Exception localException)
    {
      zze("Error saving clientId file", localException);
    }
    return "0";
  }
  
  protected final void zzac() {}
  
  public final String zzdn()
  {
    zzch();
    try
    {
      if (this.zzud == null) {
        this.zzxr = zzbw().zza(new zzbm(this));
      }
      Future localFuture = this.zzxr;
      if (localFuture != null)
      {
        try
        {
          this.zzud = ((String)this.zzxr.get());
        }
        catch (ExecutionException localExecutionException)
        {
          zze("Failed to load or generate client id", localExecutionException);
          this.zzud = "0";
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            zzd("ClientId loading or generation was interrupted", localInterruptedException);
          }
        }
        if (this.zzud == null) {
          this.zzud = "0";
        }
        zza("Loaded clientId", this.zzud);
        this.zzxr = null;
      }
      String str = this.zzud;
      return str;
    }
    finally {}
  }
  
  final String zzdo()
  {
    try
    {
      this.zzud = null;
      this.zzxr = zzbw().zza(new zzbn(this));
      return zzdn();
    }
    finally {}
  }
  
  @VisibleForTesting
  final String zzdp()
  {
    String str2 = zzd(zzbw().getContext());
    String str1 = str2;
    if (str2 == null) {
      str1 = zzdq();
    }
    return str1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */