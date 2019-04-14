package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Locale;

public final class zzde
  extends zzar
{
  private String zzaad;
  private String zzaae;
  protected int zzaag;
  private int zzacd;
  protected boolean zzace;
  private boolean zzacf;
  private boolean zzacg;
  
  public zzde(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  protected final void zzac()
  {
    Object localObject1 = getContext();
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 128);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      zzd("PackageManager doesn't know about the app package", localNameNotFoundException);
      localObject2 = null;
    }
    if (localObject2 == null)
    {
      zzt("Couldn't get ApplicationInfo to load global config");
      return;
    }
    Object localObject2 = ((ApplicationInfo)localObject2).metaData;
    if (localObject2 != null)
    {
      int i = ((Bundle)localObject2).getInt("com.google.android.gms.analytics.globalConfigResource");
      if (i > 0)
      {
        localObject2 = (zzcg)new zzce(zzbs()).zzo(i);
        if (localObject2 != null)
        {
          zzq("Loading global XML config values");
          String str = ((zzcg)localObject2).zzaad;
          boolean bool = false;
          if (str != null) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            str = ((zzcg)localObject2).zzaad;
            this.zzaad = str;
            zzb("XML config - app name", str);
          }
          if (((zzcg)localObject2).zzaae != null) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            str = ((zzcg)localObject2).zzaae;
            this.zzaae = str;
            zzb("XML config - app version", str);
          }
          if (((zzcg)localObject2).zzaaf != null) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            str = ((zzcg)localObject2).zzaaf.toLowerCase(Locale.US);
            if ("verbose".equals(str)) {
              i = 0;
            } else if ("info".equals(str)) {
              i = 1;
            } else if ("warning".equals(str)) {
              i = 2;
            } else if ("error".equals(str)) {
              i = 3;
            } else {
              i = -1;
            }
            if (i >= 0)
            {
              this.zzacd = i;
              zza("XML config - log level", Integer.valueOf(i));
            }
          }
          if (((zzcg)localObject2).zzaag >= 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            i = ((zzcg)localObject2).zzaag;
            this.zzaag = i;
            this.zzace = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(i));
          }
          if (((zzcg)localObject2).zzaah != -1)
          {
            if (((zzcg)localObject2).zzaah == 1) {
              bool = true;
            }
            this.zzacg = bool;
            this.zzacf = true;
            zzb("XML config - dry run", Boolean.valueOf(bool));
          }
        }
      }
    }
  }
  
  public final String zzaf()
  {
    zzch();
    return this.zzaad;
  }
  
  public final String zzag()
  {
    zzch();
    return this.zzaae;
  }
  
  public final boolean zzfn()
  {
    zzch();
    return false;
  }
  
  public final boolean zzfo()
  {
    zzch();
    return this.zzacf;
  }
  
  public final boolean zzfp()
  {
    zzch();
    return this.zzacg;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */