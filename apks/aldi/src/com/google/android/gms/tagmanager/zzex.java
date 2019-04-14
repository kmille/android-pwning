package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaci;
import com.google.android.gms.internal.measurement.zzacj;
import com.google.android.gms.internal.measurement.zzi;
import com.google.android.gms.internal.measurement.zzwc;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzwi;
import com.google.android.gms.internal.measurement.zzwm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

final class zzex
  implements zzah
{
  private final ExecutorService executor;
  private final String zzaxm;
  private zzdh<zzwc> zzbcn;
  private final Context zzqx;
  
  zzex(Context paramContext, String paramString)
  {
    this.zzqx = paramContext;
    this.zzaxm = paramString;
    this.executor = Executors.newSingleThreadExecutor();
  }
  
  private static zzwi zza(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    try
    {
      paramByteArrayOutputStream = zzda.zzdi(paramByteArrayOutputStream.toString("UTF-8"));
      return paramByteArrayOutputStream;
    }
    catch (UnsupportedEncodingException paramByteArrayOutputStream)
    {
      for (;;) {}
    }
    catch (JSONException paramByteArrayOutputStream)
    {
      for (;;) {}
    }
    zzdi.zzab("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
    return null;
    zzdi.zzda("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
    return null;
  }
  
  private static zzwi zze(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = zzwe.zza((zzi)zzacj.zza(new zzi(), paramArrayOfByte));
      if (paramArrayOfByte != null) {
        zzdi.v("The container was successfully loaded from the resource (using binary file)");
      }
      return paramArrayOfByte;
    }
    catch (zzaci paramArrayOfByte)
    {
      for (;;) {}
    }
    catch (zzwm paramArrayOfByte)
    {
      for (;;) {}
    }
    zzdi.zzab("The resource file is invalid. The container from the binary file is invalid");
    return null;
    zzdi.e("The resource file is corrupted. The container cannot be extracted from the binary file");
    return null;
  }
  
  @VisibleForTesting
  private final File zzoq()
  {
    String str1 = String.valueOf("resource_");
    String str2 = String.valueOf(this.zzaxm);
    if (str2.length() != 0) {
      str1 = str1.concat(str2);
    } else {
      str1 = new String(str1);
    }
    return new File(this.zzqx.getDir("google_tagmanager", 0), str1);
  }
  
  public final void release()
  {
    try
    {
      this.executor.shutdown();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zza(zzwc paramzzwc)
  {
    this.executor.execute(new zzez(this, paramzzwc));
  }
  
  public final void zza(zzdh<zzwc> paramzzdh)
  {
    this.zzbcn = paramzzdh;
  }
  
  /* Error */
  @VisibleForTesting
  final boolean zzb(zzwc paramzzwc)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 160	com/google/android/gms/tagmanager/zzex:zzoq	()Ljava/io/File;
    //   4: astore_3
    //   5: new 162	java/io/FileOutputStream
    //   8: dup
    //   9: aload_3
    //   10: invokespecial 165	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   13: astore_2
    //   14: aload_1
    //   15: invokevirtual 168	com/google/android/gms/internal/measurement/zzacj:zzwb	()I
    //   18: newarray <illegal type>
    //   20: astore 4
    //   22: aload_1
    //   23: aload 4
    //   25: iconst_0
    //   26: aload 4
    //   28: arraylength
    //   29: invokestatic 171	com/google/android/gms/internal/measurement/zzacj:zza	(Lcom/google/android/gms/internal/measurement/zzacj;[BII)V
    //   32: aload_2
    //   33: aload 4
    //   35: invokevirtual 175	java/io/FileOutputStream:write	([B)V
    //   38: aload_2
    //   39: invokevirtual 178	java/io/FileOutputStream:close	()V
    //   42: goto +8 -> 50
    //   45: ldc -76
    //   47: invokestatic 61	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   50: iconst_1
    //   51: ireturn
    //   52: astore_1
    //   53: goto +26 -> 79
    //   56: ldc -74
    //   58: invokestatic 61	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   61: aload_3
    //   62: invokevirtual 186	java/io/File:delete	()Z
    //   65: pop
    //   66: aload_2
    //   67: invokevirtual 178	java/io/FileOutputStream:close	()V
    //   70: iconst_0
    //   71: ireturn
    //   72: ldc -76
    //   74: invokestatic 61	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   77: iconst_0
    //   78: ireturn
    //   79: aload_2
    //   80: invokevirtual 178	java/io/FileOutputStream:close	()V
    //   83: goto +8 -> 91
    //   86: ldc -76
    //   88: invokestatic 61	com/google/android/gms/tagmanager/zzdi:zzab	(Ljava/lang/String;)V
    //   91: aload_1
    //   92: athrow
    //   93: ldc -68
    //   95: invokestatic 97	com/google/android/gms/tagmanager/zzdi:e	(Ljava/lang/String;)V
    //   98: iconst_0
    //   99: ireturn
    //   100: astore_1
    //   101: goto -8 -> 93
    //   104: astore_1
    //   105: goto -49 -> 56
    //   108: astore_1
    //   109: goto -64 -> 45
    //   112: astore_1
    //   113: goto -41 -> 72
    //   116: astore_2
    //   117: goto -31 -> 86
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	zzex
    //   0	120	1	paramzzwc	zzwc
    //   13	67	2	localFileOutputStream	java.io.FileOutputStream
    //   116	1	2	localIOException	IOException
    //   4	58	3	localFile	File
    //   20	14	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   14	38	52	finally
    //   56	66	52	finally
    //   5	14	100	java/io/FileNotFoundException
    //   14	38	104	java/io/IOException
    //   38	42	108	java/io/IOException
    //   66	70	112	java/io/IOException
    //   79	83	116	java/io/IOException
  }
  
  public final void zzmx()
  {
    this.executor.execute(new zzey(this));
  }
  
  @VisibleForTesting
  final void zzop()
  {
    if (this.zzbcn != null)
    {
      this.zzbcn.zzmw();
      zzdi.v("Attempting to load resource from disk");
      if (((zzeh.zzok().zzol() == zzeh.zza.zzbcc) || (zzeh.zzok().zzol() == zzeh.zza.zzbcd)) && (this.zzaxm.equals(zzeh.zzok().getContainerId())))
      {
        this.zzbcn.zzq(zzcz.zzbbb);
        return;
      }
    }
    for (;;)
    {
      try
      {
        localFileInputStream = new FileInputStream(zzoq());
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        FileInputStream localFileInputStream;
        Object localObject1;
        continue;
      }
      try
      {
        try
        {
          localObject1 = new ByteArrayOutputStream();
          zzwe.zza(localFileInputStream, (OutputStream)localObject1);
          localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
          localObject1 = (zzwc)zzacj.zza(new zzwc(), (byte[])localObject1);
          if (((zzwc)localObject1).zzpv == null)
          {
            if (((zzwc)localObject1).zzbob != null) {}
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
          }
          this.zzbcn.onSuccess(localObject1);
        }
        finally {}
      }
      catch (IOException localIOException3) {}catch (IllegalArgumentException localIllegalArgumentException) {}
    }
    this.zzbcn.zzq(zzcz.zzbbc);
    zzdi.zzab("Failed to read the resource from disk. The resource is inconsistent");
    for (;;)
    {
      try
      {
        localFileInputStream.close();
      }
      catch (IOException localIOException1)
      {
        continue;
      }
      this.zzbcn.zzq(zzcz.zzbbc);
      zzdi.zzab("Failed to read the resource from disk");
      continue;
      zzdi.zzab("Error closing stream for reading resource from disk");
    }
    zzdi.v("The Disk resource was successfully read.");
    return;
    try
    {
      localFileInputStream.close();
    }
    catch (IOException localIOException2)
    {
      for (;;) {}
    }
    zzdi.zzab("Error closing stream for reading resource from disk");
    throw ((Throwable)localObject2);
    zzdi.zzda("Failed to find the resource in the disk");
    this.zzbcn.zzq(zzcz.zzbbb);
    return;
    throw new IllegalStateException("Callback must be set before execute");
  }
  
  public final zzwi zzr(int paramInt)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzqx.getResources().openRawResource(paramInt);
        localObject2 = this.zzqx.getResources().getResourceName(paramInt);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject2).length() + 66);
        localStringBuilder.append("Attempting to load a container from the resource ID ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append(" (");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(")");
        zzdi.v(localStringBuilder.toString());
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Object localObject1;
        Object localObject2;
        continue;
      }
      try
      {
        localObject2 = new ByteArrayOutputStream();
        zzwe.zza((InputStream)localObject1, (OutputStream)localObject2);
        localObject1 = zza((ByteArrayOutputStream)localObject2);
        if (localObject1 != null)
        {
          zzdi.v("The container was successfully loaded from the resource (using JSON file format)");
          return (zzwi)localObject1;
        }
        localObject1 = zze(((ByteArrayOutputStream)localObject2).toByteArray());
        return (zzwi)localObject1;
      }
      catch (IOException localIOException) {}
    }
    localObject1 = this.zzqx.getResources().getResourceName(paramInt);
    localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 67);
    ((StringBuilder)localObject2).append("Error reading the default container with resource ID ");
    ((StringBuilder)localObject2).append(paramInt);
    ((StringBuilder)localObject2).append(" (");
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(")");
    for (localObject1 = ((StringBuilder)localObject2).toString();; localObject1 = ((StringBuilder)localObject1).toString())
    {
      zzdi.zzab((String)localObject1);
      return null;
      localObject1 = new StringBuilder(98);
      ((StringBuilder)localObject1).append("Failed to load the container. No default container resource found with the resource ID ");
      ((StringBuilder)localObject1).append(paramInt);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */