package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

public class zzaq
{
  private final zzat zzvm;
  
  protected zzaq(zzat paramzzat)
  {
    Preconditions.checkNotNull(paramzzat);
    this.zzvm = paramzzat;
  }
  
  private final void zza(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if (this.zzvm != null) {
      localObject = this.zzvm.zzcj();
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      String str = (String)zzcc.zzyl.get();
      if (Log.isLoggable(str, paramInt)) {
        Log.println(paramInt, str, zzcm.zzc(paramString, paramObject1, paramObject2, paramObject3));
      }
      if (paramInt >= 5) {
        ((zzcm)localObject).zzb(paramInt, paramString, paramObject1, paramObject2, paramObject3);
      }
      return;
    }
    Object localObject = (String)zzcc.zzyl.get();
    if (Log.isLoggable((String)localObject, paramInt)) {
      Log.println(paramInt, (String)localObject, zzc(paramString, paramObject1, paramObject2, paramObject3));
    }
  }
  
  private static String zzb(Object paramObject)
  {
    if (paramObject == null) {
      return "";
    }
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof Boolean))
    {
      if (paramObject == Boolean.TRUE) {
        return "true";
      }
      return "false";
    }
    if ((paramObject instanceof Throwable)) {
      return ((Throwable)paramObject).toString();
    }
    return paramObject.toString();
  }
  
  protected static String zzc(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = paramString;
    if (paramString == null) {
      str1 = "";
    }
    String str2 = zzb(paramObject1);
    paramObject2 = zzb(paramObject2);
    paramObject3 = zzb(paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = "";
    if (!TextUtils.isEmpty(str1))
    {
      localStringBuilder.append(str1);
      paramString = ": ";
    }
    paramObject1 = paramString;
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(str2);
      paramObject1 = ", ";
    }
    paramString = (String)paramObject1;
    if (!TextUtils.isEmpty((CharSequence)paramObject2))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append((String)paramObject2);
      paramString = ", ";
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  public static boolean zzcg()
  {
    return Log.isLoggable((String)zzcc.zzyl.get(), 2);
  }
  
  protected final Context getContext()
  {
    return this.zzvm.getContext();
  }
  
  public final void zza(String paramString, Object paramObject)
  {
    zza(2, paramString, paramObject, null, null);
  }
  
  public final void zza(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(2, paramString, paramObject1, paramObject2, null);
  }
  
  public final void zza(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zza(3, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public final void zzb(String paramString, Object paramObject)
  {
    zza(3, paramString, paramObject, null, null);
  }
  
  public final void zzb(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(3, paramString, paramObject1, paramObject2, null);
  }
  
  public final void zzb(String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zza(5, paramString, paramObject1, paramObject2, paramObject3);
  }
  
  public final zzat zzbs()
  {
    return this.zzvm;
  }
  
  protected final Clock zzbt()
  {
    return this.zzvm.zzbt();
  }
  
  public final zzcm zzbu()
  {
    return this.zzvm.zzbu();
  }
  
  protected final zzbu zzbv()
  {
    return this.zzvm.zzbv();
  }
  
  protected final zzk zzbw()
  {
    return this.zzvm.zzbw();
  }
  
  public final GoogleAnalytics zzbx()
  {
    return this.zzvm.zzck();
  }
  
  public final zzai zzby()
  {
    return this.zzvm.zzby();
  }
  
  protected final zzbz zzbz()
  {
    return this.zzvm.zzbz();
  }
  
  public final void zzc(String paramString, Object paramObject)
  {
    zza(4, paramString, paramObject, null, null);
  }
  
  public final void zzc(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(5, paramString, paramObject1, paramObject2, null);
  }
  
  protected final zzde zzca()
  {
    return this.zzvm.zzca();
  }
  
  protected final zzcq zzcb()
  {
    return this.zzvm.zzcb();
  }
  
  protected final zzbl zzcc()
  {
    return this.zzvm.zzcn();
  }
  
  public final zzah zzcd()
  {
    return this.zzvm.zzcm();
  }
  
  public final zzbe zzce()
  {
    return this.zzvm.zzce();
  }
  
  public final zzby zzcf()
  {
    return this.zzvm.zzcf();
  }
  
  public final void zzd(String paramString, Object paramObject)
  {
    zza(5, paramString, paramObject, null, null);
  }
  
  public final void zzd(String paramString, Object paramObject1, Object paramObject2)
  {
    zza(6, paramString, paramObject1, paramObject2, null);
  }
  
  public final void zze(String paramString, Object paramObject)
  {
    zza(6, paramString, paramObject, null, null);
  }
  
  public final void zzq(String paramString)
  {
    zza(2, paramString, null, null, null);
  }
  
  public final void zzr(String paramString)
  {
    zza(3, paramString, null, null, null);
  }
  
  public final void zzs(String paramString)
  {
    zza(4, paramString, null, null, null);
  }
  
  public final void zzt(String paramString)
  {
    zza(5, paramString, null, null, null);
  }
  
  public final void zzu(String paramString)
  {
    zza(6, paramString, null, null, null);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */