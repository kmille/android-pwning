package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

@VisibleForTesting
public final class zzah
  extends zzar
{
  private static boolean zzuy;
  private AdvertisingIdClient.Info zzuz;
  private final zzcz zzva;
  private String zzvb;
  private boolean zzvc = false;
  private final Object zzvd = new Object();
  
  zzah(zzat paramzzat)
  {
    super(paramzzat);
    this.zzva = new zzcz(paramzzat.zzbt());
  }
  
  private final boolean zza(AdvertisingIdClient.Info paramInfo1, AdvertisingIdClient.Info paramInfo2)
  {
    String str2 = null;
    if (paramInfo2 == null) {
      paramInfo2 = null;
    } else {
      paramInfo2 = paramInfo2.getId();
    }
    if (TextUtils.isEmpty(paramInfo2)) {
      return true;
    }
    String str1 = zzcc().zzdn();
    synchronized (this.zzvd)
    {
      if (!this.zzvc)
      {
        this.zzvb = zzbm();
        this.zzvc = true;
      }
      else if (TextUtils.isEmpty(this.zzvb))
      {
        if (paramInfo1 == null) {
          paramInfo1 = str2;
        } else {
          paramInfo1 = paramInfo1.getId();
        }
        if (paramInfo1 == null)
        {
          paramInfo1 = String.valueOf(paramInfo2);
          paramInfo2 = String.valueOf(str1);
          if (paramInfo2.length() != 0) {
            paramInfo1 = paramInfo1.concat(paramInfo2);
          } else {
            paramInfo1 = new String(paramInfo1);
          }
          bool = zzp(paramInfo1);
          return bool;
        }
        paramInfo1 = String.valueOf(paramInfo1);
        str2 = String.valueOf(str1);
        if (str2.length() != 0) {
          paramInfo1 = paramInfo1.concat(str2);
        } else {
          paramInfo1 = new String(paramInfo1);
        }
        this.zzvb = zzo(paramInfo1);
      }
      paramInfo1 = String.valueOf(paramInfo2);
      str2 = String.valueOf(str1);
      if (str2.length() != 0) {
        paramInfo1 = paramInfo1.concat(str2);
      } else {
        paramInfo1 = new String(paramInfo1);
      }
      paramInfo1 = zzo(paramInfo1);
      if (TextUtils.isEmpty(paramInfo1)) {
        return false;
      }
      if (paramInfo1.equals(this.zzvb)) {
        return true;
      }
      paramInfo1 = str1;
      if (!TextUtils.isEmpty(this.zzvb))
      {
        zzq("Resetting the client id because Advertising Id changed.");
        paramInfo1 = zzcc().zzdo();
        zza("New client Id", paramInfo1);
      }
      paramInfo2 = String.valueOf(paramInfo2);
      paramInfo1 = String.valueOf(paramInfo1);
      if (paramInfo1.length() != 0) {
        paramInfo1 = paramInfo2.concat(paramInfo1);
      } else {
        paramInfo1 = new String(paramInfo2);
      }
      boolean bool = zzp(paramInfo1);
      return bool;
    }
  }
  
  private final AdvertisingIdClient.Info zzbk()
  {
    try
    {
      if (this.zzva.zzj(1000L))
      {
        this.zzva.start();
        localInfo = zzbl();
        if (zza(this.zzuz, localInfo)) {}
        for (;;)
        {
          this.zzuz = localInfo;
          break;
          zzu("Failed to reset client id on adid change. Not using adid");
          localInfo = new AdvertisingIdClient.Info("", false);
        }
      }
      AdvertisingIdClient.Info localInfo = this.zzuz;
      return localInfo;
    }
    finally {}
  }
  
  private final AdvertisingIdClient.Info zzbl()
  {
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
      return localInfo;
    }
    catch (Exception localException)
    {
      if (!zzuy)
      {
        zzuy = true;
        zzd("Error getting advertiser id", localException);
        break label37;
        zzt("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
      }
      return null;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      label37:
      for (;;) {}
    }
  }
  
  /* Error */
  private final String zzbm()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokevirtual 150	com/google/android/gms/internal/measurement/zzaq:getContext	()Landroid/content/Context;
    //   6: ldc -82
    //   8: invokevirtual 180	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore 4
    //   13: sipush 128
    //   16: newarray <illegal type>
    //   18: astore_3
    //   19: aload 4
    //   21: aload_3
    //   22: iconst_0
    //   23: sipush 128
    //   26: invokevirtual 186	java/io/FileInputStream:read	([BII)I
    //   29: istore_1
    //   30: aload 4
    //   32: invokevirtual 189	java/io/FileInputStream:available	()I
    //   35: ifle +26 -> 61
    //   38: aload_0
    //   39: ldc -65
    //   41: invokevirtual 168	com/google/android/gms/internal/measurement/zzaq:zzt	(Ljava/lang/String;)V
    //   44: aload 4
    //   46: invokevirtual 194	java/io/FileInputStream:close	()V
    //   49: aload_0
    //   50: invokevirtual 150	com/google/android/gms/internal/measurement/zzaq:getContext	()Landroid/content/Context;
    //   53: ldc -82
    //   55: invokevirtual 197	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   58: pop
    //   59: aconst_null
    //   60: areturn
    //   61: iload_1
    //   62: ifgt +16 -> 78
    //   65: aload_0
    //   66: ldc -57
    //   68: invokevirtual 106	com/google/android/gms/internal/measurement/zzaq:zzq	(Ljava/lang/String;)V
    //   71: aload 4
    //   73: invokevirtual 194	java/io/FileInputStream:close	()V
    //   76: aconst_null
    //   77: areturn
    //   78: new 75	java/lang/String
    //   81: dup
    //   82: aload_3
    //   83: iconst_0
    //   84: iload_1
    //   85: invokespecial 202	java/lang/String:<init>	([BII)V
    //   88: astore_3
    //   89: aload 4
    //   91: invokevirtual 194	java/io/FileInputStream:close	()V
    //   94: aload_3
    //   95: areturn
    //   96: astore 4
    //   98: aload_3
    //   99: astore_2
    //   100: aload 4
    //   102: astore_3
    //   103: goto +4 -> 107
    //   106: astore_3
    //   107: aload_0
    //   108: ldc -52
    //   110: aload_3
    //   111: invokevirtual 163	com/google/android/gms/internal/measurement/zzaq:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   114: aload_0
    //   115: invokevirtual 150	com/google/android/gms/internal/measurement/zzaq:getContext	()Landroid/content/Context;
    //   118: ldc -82
    //   120: invokevirtual 197	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   123: pop
    //   124: aload_2
    //   125: areturn
    //   126: astore_2
    //   127: aconst_null
    //   128: areturn
    //   129: astore_2
    //   130: goto -36 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	zzah
    //   29	56	1	i	int
    //   1	124	2	localObject1	Object
    //   126	1	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   129	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    //   18	85	3	localObject2	Object
    //   106	5	3	localIOException1	IOException
    //   11	79	4	localFileInputStream	java.io.FileInputStream
    //   96	5	4	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   89	94	96	java/io/IOException
    //   2	59	106	java/io/IOException
    //   65	76	106	java/io/IOException
    //   78	89	106	java/io/IOException
    //   2	59	126	java/io/FileNotFoundException
    //   65	76	126	java/io/FileNotFoundException
    //   78	89	126	java/io/FileNotFoundException
    //   89	94	129	java/io/FileNotFoundException
  }
  
  private static String zzo(String paramString)
  {
    MessageDigest localMessageDigest = zzdd.getMessageDigest("MD5");
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
  
  private final boolean zzp(String paramString)
  {
    try
    {
      paramString = zzo(paramString);
      zzq("Storing hashed adid.");
      FileOutputStream localFileOutputStream = getContext().openFileOutput("gaClientIdData", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      this.zzvb = paramString;
      return true;
    }
    catch (IOException paramString)
    {
      zze("Error creating hash file", paramString);
    }
    return false;
  }
  
  protected final void zzac() {}
  
  public final boolean zzbc()
  {
    zzch();
    AdvertisingIdClient.Info localInfo = zzbk();
    return (localInfo != null) && (!localInfo.isLimitAdTrackingEnabled());
  }
  
  public final String zzbj()
  {
    zzch();
    Object localObject = zzbk();
    if (localObject != null) {
      localObject = ((AdvertisingIdClient.Info)localObject).getId();
    } else {
      localObject = null;
    }
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return null;
    }
    return (String)localObject;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */