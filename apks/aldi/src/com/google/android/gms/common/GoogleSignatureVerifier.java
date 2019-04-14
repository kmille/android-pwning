package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
@KeepForSdk
@ShowFirstParty
public class GoogleSignatureVerifier
{
  private static GoogleSignatureVerifier zzal;
  private final Context mContext;
  private volatile String zzam;
  
  private GoogleSignatureVerifier(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
  }
  
  @KeepForSdk
  public static GoogleSignatureVerifier getInstance(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext);
    try
    {
      if (zzal == null)
      {
        zzc.zza(paramContext);
        zzal = new GoogleSignatureVerifier(paramContext);
      }
      return zzal;
    }
    finally {}
  }
  
  private static zze zza(PackageInfo paramPackageInfo, zze... paramVarArgs)
  {
    if (paramPackageInfo.signatures == null) {
      return null;
    }
    if (paramPackageInfo.signatures.length != 1) {
      return null;
    }
    paramPackageInfo = paramPackageInfo.signatures;
    int i = 0;
    paramPackageInfo = new zzf(paramPackageInfo[0].toByteArray());
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals(paramPackageInfo)) {
        return paramVarArgs[i];
      }
      i += 1;
    }
    return null;
  }
  
  private final zzm zza(PackageInfo paramPackageInfo)
  {
    boolean bool = GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
    if (paramPackageInfo == null) {
      paramPackageInfo = "null pkg";
    }
    zzm localzzm;
    for (;;)
    {
      return zzm.zzb(paramPackageInfo);
      if (paramPackageInfo.signatures.length != 1)
      {
        paramPackageInfo = "single cert required";
      }
      else
      {
        zzf localzzf = new zzf(paramPackageInfo.signatures[0].toByteArray());
        String str = paramPackageInfo.packageName;
        localzzm = zzc.zza(str, localzzf, bool);
        if ((!localzzm.zzac) || (paramPackageInfo.applicationInfo == null) || ((paramPackageInfo.applicationInfo.flags & 0x2) == 0) || ((bool) && (!zzc.zza(str, localzzf, false).zzac))) {
          break;
        }
        paramPackageInfo = "debuggable release cert app rejected";
      }
    }
    return localzzm;
  }
  
  private final zzm zza(String paramString, int paramInt)
  {
    try
    {
      zzm localzzm = zza(Wrappers.packageManager(this.mContext).zza(paramString, 64, paramInt));
      return localzzm;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "no pkg ".concat(paramString);
    } else {
      paramString = new String("no pkg ");
    }
    return zzm.zzb(paramString);
  }
  
  public static boolean zza(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if ((paramPackageInfo != null) && (paramPackageInfo.signatures != null))
    {
      zze[] arrayOfzze;
      if (paramBoolean) {
        arrayOfzze = zzh.zzx;
      }
      for (;;)
      {
        paramPackageInfo = zza(paramPackageInfo, arrayOfzze);
        break;
        arrayOfzze = new zze[1];
        arrayOfzze[0] = zzh.zzx[0];
      }
      if (paramPackageInfo != null) {
        return true;
      }
    }
    return false;
  }
  
  private final zzm zzc(String paramString)
  {
    if (paramString == null) {
      return zzm.zzb("null pkg");
    }
    if (paramString.equals(this.zzam)) {
      return zzm.zze();
    }
    try
    {
      Object localObject = Wrappers.packageManager(this.mContext).getPackageInfo(paramString, 64);
      localObject = zza((PackageInfo)localObject);
      if (((zzm)localObject).zzac) {
        this.zzam = paramString;
      }
      return (zzm)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "no pkg ".concat(paramString);
    } else {
      paramString = new String("no pkg ");
    }
    return zzm.zzb(paramString);
  }
  
  @KeepForSdk
  public boolean isGooglePublicSignedPackage(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null) {
      return false;
    }
    if (zza(paramPackageInfo, false)) {
      return true;
    }
    return (zza(paramPackageInfo, true)) && (GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext));
  }
  
  @KeepForSdk
  @ShowFirstParty
  public boolean isPackageGoogleSigned(String paramString)
  {
    paramString = zzc(paramString);
    paramString.zzf();
    return paramString.zzac;
  }
  
  @KeepForSdk
  @ShowFirstParty
  public boolean isUidGoogleSigned(int paramInt)
  {
    String[] arrayOfString = Wrappers.packageManager(this.mContext).getPackagesForUid(paramInt);
    Object localObject;
    int j;
    int i;
    if ((arrayOfString != null) && (arrayOfString.length != 0))
    {
      localObject = null;
      j = arrayOfString.length;
      i = 0;
    }
    while (i < j)
    {
      zzm localzzm = zza(arrayOfString[i], paramInt);
      localObject = localzzm;
      if (!localzzm.zzac)
      {
        i += 1;
        localObject = localzzm;
        continue;
        localObject = zzm.zzb("no pkgs");
      }
    }
    ((zzm)localObject).zzf();
    return ((zzm)localObject).zzac;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/GoogleSignatureVerifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */