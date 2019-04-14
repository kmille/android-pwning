package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;

@RequiresApi(19)
class DocumentsContractApi19
{
  private static final int FLAG_VIRTUAL_DOCUMENT = 512;
  private static final String TAG = "DocumentFile";
  
  public static boolean canRead(Context paramContext, Uri paramUri)
  {
    if (paramContext.checkCallingOrSelfUriPermission(paramUri, 1) != 0) {
      return false;
    }
    return !TextUtils.isEmpty(getRawType(paramContext, paramUri));
  }
  
  public static boolean canWrite(Context paramContext, Uri paramUri)
  {
    if (paramContext.checkCallingOrSelfUriPermission(paramUri, 2) != 0) {
      return false;
    }
    String str = getRawType(paramContext, paramUri);
    int i = queryForInt(paramContext, paramUri, "flags", 0);
    if (TextUtils.isEmpty(str)) {
      return false;
    }
    if ((i & 0x4) != 0) {
      return true;
    }
    if (("vnd.android.document/directory".equals(str)) && ((i & 0x8) != 0)) {
      return true;
    }
    return (!TextUtils.isEmpty(str)) && ((i & 0x2) != 0);
  }
  
  private static void closeQuietly(@Nullable AutoCloseable paramAutoCloseable)
  {
    if (paramAutoCloseable != null) {}
    try
    {
      paramAutoCloseable.close();
      return;
    }
    catch (RuntimeException paramAutoCloseable)
    {
      throw paramAutoCloseable;
      return;
    }
    catch (Exception paramAutoCloseable) {}
  }
  
  /* Error */
  public static boolean exists(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 70	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 4
    //   6: iconst_1
    //   7: istore_3
    //   8: aconst_null
    //   9: astore 5
    //   11: aconst_null
    //   12: astore_0
    //   13: aload 4
    //   15: aload_1
    //   16: iconst_1
    //   17: anewarray 48	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: ldc 72
    //   24: aastore
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_1
    //   32: aload_1
    //   33: invokeinterface 84 1 0
    //   38: istore_2
    //   39: iload_2
    //   40: ifle +6 -> 46
    //   43: goto +5 -> 48
    //   46: iconst_0
    //   47: istore_3
    //   48: aload_1
    //   49: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   52: iload_3
    //   53: ireturn
    //   54: astore 4
    //   56: aload_1
    //   57: astore_0
    //   58: aload 4
    //   60: astore_1
    //   61: goto +40 -> 101
    //   64: astore 4
    //   66: goto +12 -> 78
    //   69: astore_1
    //   70: goto +31 -> 101
    //   73: astore 4
    //   75: aload 5
    //   77: astore_1
    //   78: aload_1
    //   79: astore_0
    //   80: new 88	java/lang/StringBuilder
    //   83: dup
    //   84: ldc 90
    //   86: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: aload 4
    //   91: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_1
    //   96: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   99: iconst_0
    //   100: ireturn
    //   101: aload_0
    //   102: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramContext	Context
    //   0	107	1	paramUri	Uri
    //   38	2	2	i	int
    //   7	46	3	bool	boolean
    //   4	10	4	localContentResolver	android.content.ContentResolver
    //   54	5	4	localObject1	Object
    //   64	1	4	localException1	Exception
    //   73	17	4	localException2	Exception
    //   9	67	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   32	39	54	finally
    //   32	39	64	java/lang/Exception
    //   13	32	69	finally
    //   80	95	69	finally
    //   13	32	73	java/lang/Exception
  }
  
  public static long getFlags(Context paramContext, Uri paramUri)
  {
    return queryForLong(paramContext, paramUri, "flags", 0L);
  }
  
  @Nullable
  public static String getName(Context paramContext, Uri paramUri)
  {
    return queryForString(paramContext, paramUri, "_display_name", null);
  }
  
  @Nullable
  private static String getRawType(Context paramContext, Uri paramUri)
  {
    return queryForString(paramContext, paramUri, "mime_type", null);
  }
  
  @Nullable
  public static String getType(Context paramContext, Uri paramUri)
  {
    paramUri = getRawType(paramContext, paramUri);
    paramContext = paramUri;
    if ("vnd.android.document/directory".equals(paramUri)) {
      paramContext = null;
    }
    return paramContext;
  }
  
  public static boolean isDirectory(Context paramContext, Uri paramUri)
  {
    return "vnd.android.document/directory".equals(getRawType(paramContext, paramUri));
  }
  
  public static boolean isFile(Context paramContext, Uri paramUri)
  {
    paramContext = getRawType(paramContext, paramUri);
    return (!"vnd.android.document/directory".equals(paramContext)) && (!TextUtils.isEmpty(paramContext));
  }
  
  public static boolean isVirtual(Context paramContext, Uri paramUri)
  {
    if (!DocumentsContract.isDocumentUri(paramContext, paramUri)) {
      return false;
    }
    return (getFlags(paramContext, paramUri) & 0x200) != 0L;
  }
  
  public static long lastModified(Context paramContext, Uri paramUri)
  {
    return queryForLong(paramContext, paramUri, "last_modified", 0L);
  }
  
  public static long length(Context paramContext, Uri paramUri)
  {
    return queryForLong(paramContext, paramUri, "_size", 0L);
  }
  
  private static int queryForInt(Context paramContext, Uri paramUri, String paramString, int paramInt)
  {
    return (int)queryForLong(paramContext, paramUri, paramString, paramInt);
  }
  
  /* Error */
  private static long queryForLong(Context paramContext, Uri paramUri, String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 70	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 7
    //   9: aconst_null
    //   10: astore_0
    //   11: aload 8
    //   13: aload_1
    //   14: iconst_1
    //   15: anewarray 48	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_2
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 136 1 0
    //   35: ifeq +29 -> 64
    //   38: aload_1
    //   39: iconst_0
    //   40: invokeinterface 140 2 0
    //   45: ifne +19 -> 64
    //   48: aload_1
    //   49: iconst_0
    //   50: invokeinterface 144 2 0
    //   55: lstore 5
    //   57: aload_1
    //   58: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   61: lload 5
    //   63: lreturn
    //   64: aload_1
    //   65: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   68: lload_3
    //   69: lreturn
    //   70: astore_2
    //   71: aload_1
    //   72: astore_0
    //   73: aload_2
    //   74: astore_1
    //   75: goto +37 -> 112
    //   78: astore_2
    //   79: goto +11 -> 90
    //   82: astore_1
    //   83: goto +29 -> 112
    //   86: astore_2
    //   87: aload 7
    //   89: astore_1
    //   90: aload_1
    //   91: astore_0
    //   92: new 88	java/lang/StringBuilder
    //   95: dup
    //   96: ldc 90
    //   98: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload_2
    //   102: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_1
    //   107: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   110: lload_3
    //   111: lreturn
    //   112: aload_0
    //   113: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   116: aload_1
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	paramContext	Context
    //   0	118	1	paramUri	Uri
    //   0	118	2	paramString	String
    //   0	118	3	paramLong	long
    //   55	7	5	l	long
    //   7	81	7	localObject	Object
    //   4	8	8	localContentResolver	android.content.ContentResolver
    // Exception table:
    //   from	to	target	type
    //   29	57	70	finally
    //   29	57	78	java/lang/Exception
    //   11	29	82	finally
    //   92	106	82	finally
    //   11	29	86	java/lang/Exception
  }
  
  /* Error */
  @Nullable
  private static String queryForString(Context paramContext, Uri paramUri, String paramString1, @Nullable String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 70	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore_0
    //   11: aload 5
    //   13: aload_1
    //   14: iconst_1
    //   15: anewarray 48	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload_2
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 136 1 0
    //   35: ifeq +27 -> 62
    //   38: aload_1
    //   39: iconst_0
    //   40: invokeinterface 140 2 0
    //   45: ifne +17 -> 62
    //   48: aload_1
    //   49: iconst_0
    //   50: invokeinterface 148 2 0
    //   55: astore_0
    //   56: aload_1
    //   57: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   60: aload_0
    //   61: areturn
    //   62: aload_1
    //   63: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   66: aload_3
    //   67: areturn
    //   68: astore_2
    //   69: aload_1
    //   70: astore_0
    //   71: aload_2
    //   72: astore_1
    //   73: goto +37 -> 110
    //   76: astore_2
    //   77: goto +11 -> 88
    //   80: astore_1
    //   81: goto +29 -> 110
    //   84: astore_2
    //   85: aload 4
    //   87: astore_1
    //   88: aload_1
    //   89: astore_0
    //   90: new 88	java/lang/StringBuilder
    //   93: dup
    //   94: ldc 90
    //   96: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload_2
    //   100: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_1
    //   105: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   108: aload_3
    //   109: areturn
    //   110: aload_0
    //   111: invokestatic 86	android/support/v4/provider/DocumentsContractApi19:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   114: aload_1
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	paramContext	Context
    //   0	116	1	paramUri	Uri
    //   0	116	2	paramString1	String
    //   0	116	3	paramString2	String
    //   7	79	4	localObject	Object
    //   4	8	5	localContentResolver	android.content.ContentResolver
    // Exception table:
    //   from	to	target	type
    //   29	56	68	finally
    //   29	56	76	java/lang/Exception
    //   11	29	80	finally
    //   90	104	80	finally
    //   11	29	84	java/lang/Exception
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/android/support/v4/provider/DocumentsContractApi19.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */