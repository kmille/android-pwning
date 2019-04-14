package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

final class zzn
{
  @Nullable
  private static zzo zzd(SharedPreferences paramSharedPreferences, String paramString)
    throws zzp
  {
    String str1 = zzak.zzh(paramString, "|P|");
    zzo localzzo = null;
    str1 = paramSharedPreferences.getString(str1, null);
    String str2 = paramSharedPreferences.getString(zzak.zzh(paramString, "|K|"), null);
    if (str1 != null)
    {
      if (str2 == null) {
        return null;
      }
      localzzo = new zzo(zzg(str1, str2), zze(paramSharedPreferences, paramString));
    }
    return localzzo;
  }
  
  /* Error */
  @Nullable
  private static zzo zzd(File paramFile)
    throws zzp, IOException
  {
    // Byte code:
    //   0: new 53	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 56	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore 4
    //   10: aconst_null
    //   11: astore_3
    //   12: aload_3
    //   13: astore_0
    //   14: new 58	java/util/Properties
    //   17: dup
    //   18: invokespecial 59	java/util/Properties:<init>	()V
    //   21: astore 5
    //   23: aload_3
    //   24: astore_0
    //   25: aload 5
    //   27: aload 4
    //   29: invokevirtual 63	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   32: aload_3
    //   33: astore_0
    //   34: aload 5
    //   36: ldc 65
    //   38: invokevirtual 69	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   41: astore 6
    //   43: aload_3
    //   44: astore_0
    //   45: aload 5
    //   47: ldc 71
    //   49: invokevirtual 69	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   52: astore 7
    //   54: aload 6
    //   56: ifnull +70 -> 126
    //   59: aload 7
    //   61: ifnonnull +6 -> 67
    //   64: goto +62 -> 126
    //   67: aload_3
    //   68: astore_0
    //   69: aload 6
    //   71: aload 7
    //   73: invokestatic 35	com/google/android/gms/iid/zzn:zzg	(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPair;
    //   76: astore 6
    //   78: aload_3
    //   79: astore_0
    //   80: aload 5
    //   82: ldc 73
    //   84: invokevirtual 69	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   87: invokestatic 79	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   90: lstore_1
    //   91: aload_3
    //   92: astore_0
    //   93: new 31	com/google/android/gms/iid/zzo
    //   96: dup
    //   97: aload 6
    //   99: lload_1
    //   100: invokespecial 42	com/google/android/gms/iid/zzo:<init>	(Ljava/security/KeyPair;J)V
    //   103: astore_3
    //   104: aconst_null
    //   105: aload 4
    //   107: invokestatic 82	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   110: aload_3
    //   111: areturn
    //   112: astore 5
    //   114: aload_3
    //   115: astore_0
    //   116: new 13	com/google/android/gms/iid/zzp
    //   119: dup
    //   120: aload 5
    //   122: invokespecial 85	com/google/android/gms/iid/zzp:<init>	(Ljava/lang/Exception;)V
    //   125: athrow
    //   126: aconst_null
    //   127: aload 4
    //   129: invokestatic 82	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   132: aconst_null
    //   133: areturn
    //   134: astore_3
    //   135: goto +8 -> 143
    //   138: astore_3
    //   139: aload_3
    //   140: astore_0
    //   141: aload_3
    //   142: athrow
    //   143: aload_0
    //   144: aload 4
    //   146: invokestatic 82	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileInputStream;)V
    //   149: aload_3
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	paramFile	File
    //   90	10	1	l	long
    //   11	104	3	localzzo	zzo
    //   134	1	3	localObject1	Object
    //   138	12	3	localThrowable	Throwable
    //   8	137	4	localFileInputStream	java.io.FileInputStream
    //   21	60	5	localProperties	java.util.Properties
    //   112	9	5	localNumberFormatException	NumberFormatException
    //   41	57	6	localObject2	Object
    //   52	20	7	str	String
    // Exception table:
    //   from	to	target	type
    //   80	91	112	java/lang/NumberFormatException
    //   14	23	134	finally
    //   25	32	134	finally
    //   34	43	134	finally
    //   45	54	134	finally
    //   69	78	134	finally
    //   80	91	134	finally
    //   93	104	134	finally
    //   116	126	134	finally
    //   141	143	134	finally
    //   14	23	138	java/lang/Throwable
    //   25	32	138	java/lang/Throwable
    //   34	43	138	java/lang/Throwable
    //   45	54	138	java/lang/Throwable
    //   69	78	138	java/lang/Throwable
    //   80	91	138	java/lang/Throwable
    //   93	104	138	java/lang/Throwable
    //   116	126	138	java/lang/Throwable
  }
  
  /* Error */
  private static void zzd(Context paramContext, String paramString, zzo paramzzo)
  {
    // Byte code:
    //   0: ldc 88
    //   2: iconst_3
    //   3: invokestatic 94	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: pop
    //   7: aload_0
    //   8: aload_1
    //   9: invokestatic 98	com/google/android/gms/iid/zzn:zzj	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   12: astore_0
    //   13: aload_0
    //   14: invokevirtual 104	java/io/File:createNewFile	()Z
    //   17: pop
    //   18: new 58	java/util/Properties
    //   21: dup
    //   22: invokespecial 59	java/util/Properties:<init>	()V
    //   25: astore_1
    //   26: aload_1
    //   27: ldc 65
    //   29: aload_2
    //   30: invokestatic 107	com/google/android/gms/iid/zzo:zzd	(Lcom/google/android/gms/iid/zzo;)Ljava/lang/String;
    //   33: invokevirtual 111	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   36: pop
    //   37: aload_1
    //   38: ldc 71
    //   40: aload_2
    //   41: invokestatic 113	com/google/android/gms/iid/zzo:zze	(Lcom/google/android/gms/iid/zzo;)Ljava/lang/String;
    //   44: invokevirtual 111	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   47: pop
    //   48: aload_1
    //   49: ldc 73
    //   51: aload_2
    //   52: invokestatic 117	com/google/android/gms/iid/zzo:zzf	(Lcom/google/android/gms/iid/zzo;)J
    //   55: invokestatic 123	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   58: invokevirtual 111	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   61: pop
    //   62: new 125	java/io/FileOutputStream
    //   65: dup
    //   66: aload_0
    //   67: invokespecial 126	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   70: astore_2
    //   71: aconst_null
    //   72: astore_0
    //   73: aload_1
    //   74: aload_2
    //   75: aconst_null
    //   76: invokevirtual 130	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   79: aconst_null
    //   80: aload_2
    //   81: invokestatic 133	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileOutputStream;)V
    //   84: return
    //   85: astore_1
    //   86: goto +8 -> 94
    //   89: astore_1
    //   90: aload_1
    //   91: astore_0
    //   92: aload_1
    //   93: athrow
    //   94: aload_0
    //   95: aload_2
    //   96: invokestatic 133	com/google/android/gms/iid/zzn:zzd	(Ljava/lang/Throwable;Ljava/io/FileOutputStream;)V
    //   99: aload_1
    //   100: athrow
    //   101: astore_0
    //   102: aload_0
    //   103: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   106: astore_0
    //   107: new 138	java/lang/StringBuilder
    //   110: dup
    //   111: aload_0
    //   112: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   115: invokevirtual 142	java/lang/String:length	()I
    //   118: bipush 21
    //   120: iadd
    //   121: invokespecial 145	java/lang/StringBuilder:<init>	(I)V
    //   124: astore_1
    //   125: aload_1
    //   126: ldc -109
    //   128: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload_1
    //   133: aload_0
    //   134: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	paramContext	Context
    //   0	139	1	paramString	String
    //   0	139	2	paramzzo	zzo
    // Exception table:
    //   from	to	target	type
    //   73	79	85	finally
    //   92	94	85	finally
    //   73	79	89	java/lang/Throwable
    //   0	71	101	java/io/IOException
    //   79	84	101	java/io/IOException
    //   94	101	101	java/io/IOException
  }
  
  private static long zze(SharedPreferences paramSharedPreferences, String paramString)
  {
    paramSharedPreferences = paramSharedPreferences.getString(zzak.zzh(paramString, "cre"), null);
    if (paramSharedPreferences != null) {}
    try
    {
      long l = Long.parseLong(paramSharedPreferences);
      return l;
    }
    catch (NumberFormatException paramSharedPreferences)
    {
      for (;;) {}
    }
    return 0L;
  }
  
  private final void zze(Context paramContext, String paramString, zzo paramzzo)
  {
    paramContext = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    try
    {
      boolean bool = paramzzo.equals(zzd(paramContext, paramString));
      if (bool) {
        return;
      }
    }
    catch (zzp localzzp)
    {
      for (;;) {}
    }
    Log.isLoggable("InstanceID", 3);
    paramContext = paramContext.edit();
    paramContext.putString(zzak.zzh(paramString, "|P|"), zzo.zzd(paramzzo));
    paramContext.putString(zzak.zzh(paramString, "|K|"), zzo.zze(paramzzo));
    paramContext.putString(zzak.zzh(paramString, "cre"), String.valueOf(zzo.zzf(paramzzo)));
    paramContext.commit();
  }
  
  /* Error */
  private static java.security.KeyPair zzg(String paramString1, String paramString2)
    throws zzp
  {
    // Byte code:
    //   0: aload_0
    //   1: bipush 8
    //   3: invokestatic 199	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   6: astore_0
    //   7: aload_1
    //   8: bipush 8
    //   10: invokestatic 199	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   13: astore_1
    //   14: ldc -55
    //   16: invokestatic 207	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   19: astore_2
    //   20: new 209	java/security/KeyPair
    //   23: dup
    //   24: aload_2
    //   25: new 211	java/security/spec/X509EncodedKeySpec
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 214	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   33: invokevirtual 218	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   36: aload_2
    //   37: new 220	java/security/spec/PKCS8EncodedKeySpec
    //   40: dup
    //   41: aload_1
    //   42: invokespecial 221	java/security/spec/PKCS8EncodedKeySpec:<init>	([B)V
    //   45: invokevirtual 225	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   48: invokespecial 228	java/security/KeyPair:<init>	(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    //   51: astore_0
    //   52: aload_0
    //   53: areturn
    //   54: astore_0
    //   55: aload_0
    //   56: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   59: astore_1
    //   60: new 138	java/lang/StringBuilder
    //   63: dup
    //   64: aload_1
    //   65: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   68: invokevirtual 142	java/lang/String:length	()I
    //   71: bipush 19
    //   73: iadd
    //   74: invokespecial 145	java/lang/StringBuilder:<init>	(I)V
    //   77: astore_2
    //   78: aload_2
    //   79: ldc -26
    //   81: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload_2
    //   86: aload_1
    //   87: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: new 13	com/google/android/gms/iid/zzp
    //   94: dup
    //   95: aload_0
    //   96: invokespecial 85	com/google/android/gms/iid/zzp:<init>	(Ljava/lang/Exception;)V
    //   99: athrow
    //   100: astore_0
    //   101: new 13	com/google/android/gms/iid/zzp
    //   104: dup
    //   105: aload_0
    //   106: invokespecial 85	com/google/android/gms/iid/zzp:<init>	(Ljava/lang/Exception;)V
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	paramString1	String
    //   0	110	1	paramString2	String
    //   19	67	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	52	54	java/security/spec/InvalidKeySpecException
    //   14	52	54	java/security/NoSuchAlgorithmException
    //   0	14	100	java/lang/IllegalArgumentException
  }
  
  static void zzg(Context paramContext, String paramString)
  {
    paramContext = zzj(paramContext, paramString);
    if (paramContext.exists()) {
      paramContext.delete();
    }
  }
  
  @Nullable
  private final zzo zzh(Context paramContext, String paramString)
    throws zzp
  {
    try
    {
      zzo localzzo1 = zzi(paramContext, paramString);
      if (localzzo1 != null)
      {
        zze(paramContext, paramString, localzzo1);
        return localzzo1;
      }
      localzzo1 = null;
    }
    catch (zzp localzzp1) {}
    try
    {
      zzo localzzo2 = zzd(paramContext.getSharedPreferences("com.google.android.gms.appid", 0), paramString);
      if (localzzo2 != null)
      {
        zzd(paramContext, paramString, localzzo2);
        return localzzo2;
      }
    }
    catch (zzp localzzp2)
    {
      if (localzzp2 == null) {
        return null;
      }
      throw localzzp2;
    }
  }
  
  @Nullable
  private final zzo zzi(Context paramContext, String paramString)
    throws zzp
  {
    paramContext = zzj(paramContext, paramString);
    if (!paramContext.exists()) {
      return null;
    }
    try
    {
      paramString = zzd(paramContext);
      return paramString;
    }
    catch (IOException paramString)
    {
      StringBuilder localStringBuilder;
      if (Log.isLoggable("InstanceID", 3))
      {
        paramString = String.valueOf(paramString);
        localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 40);
        localStringBuilder.append("Failed to read key from file, retrying: ");
        localStringBuilder.append(paramString);
      }
      try
      {
        paramContext = zzd(paramContext);
        return paramContext;
      }
      catch (IOException paramContext)
      {
        paramString = String.valueOf(paramContext);
        localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 45);
        localStringBuilder.append("IID file exists, but failed to read from it: ");
        localStringBuilder.append(paramString);
        throw new zzp(paramContext);
      }
    }
  }
  
  static void zzi(Context paramContext)
  {
    paramContext = zzj(paramContext).listFiles();
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramContext[i];
      if (((File)localObject).getName().startsWith("com.google.InstanceId")) {
        ((File)localObject).delete();
      }
      i += 1;
    }
  }
  
  private static File zzj(Context paramContext)
  {
    File localFile = ContextCompat.getNoBackupFilesDir(paramContext);
    if ((localFile != null) && (localFile.isDirectory())) {
      return localFile;
    }
    return paramContext.getFilesDir();
  }
  
  private static File zzj(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = "com.google.InstanceId.properties";
    }
    try
    {
      paramString = Base64.encodeToString(paramString.getBytes("UTF-8"), 11);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 33);
      localStringBuilder.append("com.google.InstanceId_");
      localStringBuilder.append(paramString);
      localStringBuilder.append(".properties");
      paramString = localStringBuilder.toString();
      return new File(zzj(paramContext), paramString);
    }
    catch (UnsupportedEncodingException paramContext)
    {
      throw new AssertionError(paramContext);
    }
  }
  
  @WorkerThread
  final zzo zze(Context paramContext, String paramString)
    throws zzp
  {
    zzo localzzo = zzh(paramContext, paramString);
    if (localzzo != null) {
      return localzzo;
    }
    return zzf(paramContext, paramString);
  }
  
  @WorkerThread
  final zzo zzf(Context paramContext, String paramString)
  {
    zzo localzzo1 = new zzo(zzd.zzk(), System.currentTimeMillis());
    try
    {
      zzo localzzo2 = zzh(paramContext, paramString);
      if (localzzo2 != null)
      {
        Log.isLoggable("InstanceID", 3);
        return localzzo2;
      }
    }
    catch (zzp localzzp)
    {
      for (;;) {}
    }
    Log.isLoggable("InstanceID", 3);
    zzd(paramContext, paramString, localzzo1);
    zze(paramContext, paramString, localzzo1);
    return localzzo1;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */