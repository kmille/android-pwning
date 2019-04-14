package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;

public final class zzbu
{
  private final zzat zzqm;
  private volatile Boolean zzxy;
  private String zzxz;
  private Set<Integer> zzya;
  
  protected zzbu(zzat paramzzat)
  {
    Preconditions.checkNotNull(paramzzat);
    this.zzqm = paramzzat;
  }
  
  public static boolean zzdt()
  {
    return ((Boolean)zzcc.zzyk.get()).booleanValue();
  }
  
  public static int zzdu()
  {
    return ((Integer)zzcc.zzzh.get()).intValue();
  }
  
  public static long zzdv()
  {
    return ((Long)zzcc.zzys.get()).longValue();
  }
  
  public static long zzdw()
  {
    return ((Long)zzcc.zzyv.get()).longValue();
  }
  
  public static int zzdx()
  {
    return ((Integer)zzcc.zzyx.get()).intValue();
  }
  
  public static int zzdy()
  {
    return ((Integer)zzcc.zzyy.get()).intValue();
  }
  
  @VisibleForTesting
  public static String zzdz()
  {
    return (String)zzcc.zzza.get();
  }
  
  @VisibleForTesting
  public static String zzea()
  {
    return (String)zzcc.zzyz.get();
  }
  
  public static String zzeb()
  {
    return (String)zzcc.zzzb.get();
  }
  
  public static long zzed()
  {
    return ((Long)zzcc.zzzp.get()).longValue();
  }
  
  public final boolean zzds()
  {
    if (this.zzxy == null) {}
    for (;;)
    {
      try
      {
        if (this.zzxy == null)
        {
          Object localObject2 = this.zzqm.getContext().getApplicationInfo();
          String str = ProcessUtils.getMyProcessName();
          if (localObject2 != null)
          {
            localObject2 = ((ApplicationInfo)localObject2).processName;
            if ((localObject2 == null) || (!((String)localObject2).equals(str))) {
              break label142;
            }
            bool = true;
            this.zzxy = Boolean.valueOf(bool);
          }
          if (((this.zzxy == null) || (!this.zzxy.booleanValue())) && ("com.google.android.gms.analytics".equals(str))) {
            this.zzxy = Boolean.TRUE;
          }
          if (this.zzxy == null)
          {
            this.zzxy = Boolean.TRUE;
            this.zzqm.zzbu().zzu("My process not in the list of running processes");
          }
        }
      }
      finally {}
      return this.zzxy.booleanValue();
      label142:
      boolean bool = false;
    }
  }
  
  public final Set<Integer> zzec()
  {
    String str1 = (String)zzcc.zzzk.get();
    String[] arrayOfString;
    HashSet localHashSet;
    int j;
    int i;
    if ((this.zzya == null) || (this.zzxz == null) || (!this.zzxz.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      String str2;
      if (i < j) {
        str2 = arrayOfString[i];
      }
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        i += 1;
        continue;
        this.zzxz = str1;
        this.zzya = localHashSet;
        return this.zzya;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */