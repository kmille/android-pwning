package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class WorkSourceUtil
{
  private static final int zzhh = ;
  private static final Method zzhi = zzw();
  private static final Method zzhj = zzx();
  private static final Method zzhk = zzy();
  private static final Method zzhl = zzz();
  private static final Method zzhm = zzaa();
  private static final Method zzhn = zzab();
  private static final Method zzho = zzac();
  
  @Nullable
  @KeepForSdk
  public static WorkSource fromPackage(Context paramContext, @Nullable String paramString)
  {
    if ((paramContext != null) && (paramContext.getPackageManager() != null)) {
      if (paramString == null) {
        return null;
      }
    }
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramString, 0);
      if (paramContext == null)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0) {
          paramContext = "Could not get applicationInfo from package: ".concat(paramContext);
        } else {
          paramContext = new String("Could not get applicationInfo from package: ");
        }
        Log.e("WorkSourceUtil", paramContext);
        return null;
      }
      return zza(paramContext.uid, paramString);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    paramContext = String.valueOf(paramString);
    if (paramContext.length() != 0) {
      paramContext = "Could not find package: ".concat(paramContext);
    } else {
      paramContext = new String("Could not find package: ");
    }
    Log.e("WorkSourceUtil", paramContext);
    return null;
  }
  
  @KeepForSdk
  public static WorkSource fromPackageAndModuleExperimentalPi(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    int i;
    if (paramContext != null)
    {
      localObject1 = localObject2;
      if (paramContext.getPackageManager() != null)
      {
        localObject1 = localObject2;
        if (paramString2 != null)
        {
          if (paramString1 == null) {
            return null;
          }
          i = zzd(paramContext, paramString1);
          if (i < 0) {
            return null;
          }
          localObject1 = new WorkSource();
          if ((zzhn == null) || (zzho == null)) {}
        }
      }
    }
    try
    {
      paramContext = zzhn.invoke(localObject1, new Object[0]);
      if (i != zzhh) {
        zzho.invoke(paramContext, new Object[] { Integer.valueOf(i), paramString1 });
      }
      zzho.invoke(paramContext, new Object[] { Integer.valueOf(zzhh), paramString2 });
      return (WorkSource)localObject1;
    }
    catch (Exception paramContext) {}
    zza((WorkSource)localObject1, i, paramString1);
    return (WorkSource)localObject1;
    return (WorkSource)localObject1;
  }
  
  @KeepForSdk
  public static List<String> getNames(@Nullable WorkSource paramWorkSource)
  {
    int j = 0;
    int i;
    if (paramWorkSource == null) {
      i = 0;
    } else {
      i = zza(paramWorkSource);
    }
    if (i == 0) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    while (j < i)
    {
      String str = zza(paramWorkSource, j);
      if (!Strings.isEmptyOrWhitespace(str)) {
        localArrayList.add(str);
      }
      j += 1;
    }
    return localArrayList;
  }
  
  @KeepForSdk
  public static boolean hasWorkSourcePermission(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    if (paramContext.getPackageManager() == null) {
      return false;
    }
    return Wrappers.packageManager(paramContext).checkPermission("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0;
  }
  
  private static int zza(WorkSource paramWorkSource)
  {
    if (zzhk != null) {
      try
      {
        int i = ((Integer)zzhk.invoke(paramWorkSource, new Object[0])).intValue();
        return i;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
    }
    return 0;
  }
  
  private static WorkSource zza(int paramInt, String paramString)
  {
    WorkSource localWorkSource = new WorkSource();
    zza(localWorkSource, paramInt, paramString);
    return localWorkSource;
  }
  
  @Nullable
  private static String zza(WorkSource paramWorkSource, int paramInt)
  {
    if (zzhm != null) {
      try
      {
        paramWorkSource = (String)zzhm.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        return paramWorkSource;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
    }
    return null;
  }
  
  private static void zza(WorkSource paramWorkSource, int paramInt, @Nullable String paramString)
  {
    if (zzhj != null)
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      try
      {
        zzhj.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
        return;
      }
    }
    if (zzhi != null) {
      try
      {
        zzhi.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
    }
  }
  
  private static Method zzaa()
  {
    if (PlatformVersion.isAtLeastJellyBeanMR2()) {}
    try
    {
      Method localMethod = WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static final Method zzab()
  {
    if (PlatformVersion.isAtLeastP()) {}
    try
    {
      Method localMethod = WorkSource.class.getMethod("createWorkChain", new Class[0]);
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  @SuppressLint({"PrivateApi"})
  private static final Method zzac()
  {
    if (PlatformVersion.isAtLeastP()) {}
    try
    {
      Method localMethod = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { Integer.TYPE, String.class });
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static int zzd(Context paramContext, String paramString)
  {
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getApplicationInfo(paramString, 0);
      if (paramContext == null)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0) {
          paramContext = "Could not get applicationInfo from package: ".concat(paramContext);
        } else {
          paramContext = new String("Could not get applicationInfo from package: ");
        }
        Log.e("WorkSourceUtil", paramContext);
        return -1;
      }
      return paramContext.uid;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    paramContext = String.valueOf(paramString);
    if (paramContext.length() != 0) {
      paramContext = "Could not find package: ".concat(paramContext);
    } else {
      paramContext = new String("Could not find package: ");
    }
    Log.e("WorkSourceUtil", paramContext);
    return -1;
  }
  
  private static Method zzw()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static Method zzx()
  {
    if (PlatformVersion.isAtLeastJellyBeanMR2()) {}
    try
    {
      Method localMethod = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static Method zzy()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("size", new Class[0]);
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
  
  private static Method zzz()
  {
    try
    {
      Method localMethod = WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
      return localMethod;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/WorkSourceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */