package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzak
{
  private SharedPreferences zzcz;
  private final zzn zzda;
  @GuardedBy("this")
  private final Map<String, zzo> zzdb = new ArrayMap();
  private Context zzk;
  
  public zzak(Context paramContext)
  {
    this(paramContext, new zzn());
  }
  
  @VisibleForTesting
  private zzak(Context paramContext, zzn paramzzn)
  {
    this.zzk = paramContext;
    this.zzcz = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    this.zzda = paramzzn;
    paramContext = new File(ContextCompat.getNoBackupFilesDir(this.zzk), "com.google.android.gms.appid-no-backup");
    if (!paramContext.exists()) {
      try
      {
        if ((paramContext.createNewFile()) && (!isEmpty())) {
          InstanceIDListenerService.zzd(this.zzk, this);
        }
        return;
      }
      catch (IOException paramContext)
      {
        if (Log.isLoggable("InstanceID/Store", 3))
        {
          paramContext = String.valueOf(paramContext.getMessage());
          if (paramContext.length() != 0)
          {
            "Error creating file in no backup dir: ".concat(paramContext);
            return;
          }
          new String("Error creating file in no backup dir: ");
        }
      }
    }
  }
  
  private static String zzd(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 4 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("|");
    localStringBuilder.append(paramString3);
    return localStringBuilder.toString();
  }
  
  static String zzh(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 3 + String.valueOf(paramString2).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|S|");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  @Nullable
  final String get(String paramString)
  {
    try
    {
      paramString = this.zzcz.getString(paramString, null);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean isEmpty()
  {
    return this.zzcz.getAll().isEmpty();
  }
  
  public final void zzd(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      paramString1 = zzd(paramString1, paramString2, paramString3);
      paramString2 = this.zzcz.edit();
      paramString2.putString(paramString1, paramString4);
      paramString2.putString("appVersion", paramString5);
      paramString2.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000L));
      paramString2.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final String zze(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = zzd(paramString1, paramString2, paramString3);
      paramString1 = this.zzcz.getString(paramString1, null);
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void zzf(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = zzd(paramString1, paramString2, paramString3);
      paramString2 = this.zzcz.edit();
      paramString2.remove(paramString1);
      paramString2.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void zzi(String paramString)
  {
    try
    {
      SharedPreferences.Editor localEditor = this.zzcz.edit();
      Iterator localIterator = this.zzcz.getAll().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith(paramString)) {
          localEditor.remove(str);
        }
      }
      localEditor.commit();
      return;
    }
    finally {}
  }
  
  public final zzo zzj(String paramString)
  {
    for (;;)
    {
      zzo localzzo;
      try
      {
        localzzo = (zzo)this.zzdb.get(paramString);
        if (localzzo != null) {
          return localzzo;
        }
      }
      finally {}
      try
      {
        localzzo = this.zzda.zze(this.zzk, paramString);
      }
      catch (zzp localzzp) {}
    }
    InstanceIDListenerService.zzd(this.zzk, this);
    localzzo = this.zzda.zzf(this.zzk, paramString);
    this.zzdb.put(paramString, localzzo);
    return localzzo;
  }
  
  final void zzk(String paramString)
  {
    try
    {
      this.zzdb.remove(paramString);
      zzn.zzg(this.zzk, paramString);
      zzi(String.valueOf(paramString).concat("|"));
      return;
    }
    finally {}
  }
  
  public final void zzx()
  {
    try
    {
      this.zzdb.clear();
      zzn.zzi(this.zzk);
      this.zzcz.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/iid/zzak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */