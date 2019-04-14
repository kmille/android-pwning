package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GmsClientSupervisor
{
  private static final Object zzdp = new Object();
  private static GmsClientSupervisor zzdq;
  
  @KeepForSdk
  public static GmsClientSupervisor getInstance(Context paramContext)
  {
    synchronized (zzdp)
    {
      if (zzdq == null) {
        zzdq = new zze(paramContext.getApplicationContext());
      }
      return zzdq;
    }
  }
  
  @KeepForSdk
  public boolean bindService(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return zza(new zza(paramComponentName, 129), paramServiceConnection, paramString);
  }
  
  @KeepForSdk
  public boolean bindService(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    return zza(new zza(paramString1, 129), paramServiceConnection, paramString2);
  }
  
  @KeepForSdk
  public void unbindService(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    zzb(new zza(paramComponentName, 129), paramServiceConnection, paramString);
  }
  
  @KeepForSdk
  public void unbindService(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    zzb(new zza(paramString1, 129), paramServiceConnection, paramString2);
  }
  
  public final void zza(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3)
  {
    zzb(new zza(paramString1, paramString2, paramInt), paramServiceConnection, paramString3);
  }
  
  protected abstract boolean zza(zza paramzza, ServiceConnection paramServiceConnection, String paramString);
  
  protected abstract void zzb(zza paramzza, ServiceConnection paramServiceConnection, String paramString);
  
  protected static final class zza
  {
    private final ComponentName mComponentName;
    private final String zzdr;
    private final String zzds;
    private final int zzdt;
    
    public zza(ComponentName paramComponentName, int paramInt)
    {
      this.zzdr = null;
      this.zzds = null;
      this.mComponentName = ((ComponentName)Preconditions.checkNotNull(paramComponentName));
      this.zzdt = 129;
    }
    
    public zza(String paramString, int paramInt)
    {
      this.zzdr = Preconditions.checkNotEmpty(paramString);
      this.zzds = "com.google.android.gms";
      this.mComponentName = null;
      this.zzdt = 129;
    }
    
    public zza(String paramString1, String paramString2, int paramInt)
    {
      this.zzdr = Preconditions.checkNotEmpty(paramString1);
      this.zzds = Preconditions.checkNotEmpty(paramString2);
      this.mComponentName = null;
      this.zzdt = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof zza)) {
        return false;
      }
      paramObject = (zza)paramObject;
      return (Objects.equal(this.zzdr, ((zza)paramObject).zzdr)) && (Objects.equal(this.zzds, ((zza)paramObject).zzds)) && (Objects.equal(this.mComponentName, ((zza)paramObject).mComponentName)) && (this.zzdt == ((zza)paramObject).zzdt);
    }
    
    public final ComponentName getComponentName()
    {
      return this.mComponentName;
    }
    
    public final String getPackage()
    {
      return this.zzds;
    }
    
    public final int hashCode()
    {
      return Objects.hashCode(new Object[] { this.zzdr, this.zzds, this.mComponentName, Integer.valueOf(this.zzdt) });
    }
    
    public final String toString()
    {
      if (this.zzdr == null) {
        return this.mComponentName.flattenToString();
      }
      return this.zzdr;
    }
    
    public final Intent zzb(Context paramContext)
    {
      if (this.zzdr != null) {
        return new Intent(this.zzdr).setPackage(this.zzds);
      }
      return new Intent().setComponent(this.mComponentName);
    }
    
    public final int zzq()
    {
      return this.zzdt;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/internal/GmsClientSupervisor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */