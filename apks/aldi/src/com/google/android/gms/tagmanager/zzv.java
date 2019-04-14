package com.google.android.gms.tagmanager;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class zzv
  implements ContainerHolder
{
  private Status zzact;
  private final Looper zzaxu;
  private Container zzaxv;
  private Container zzaxw;
  private zzx zzaxx;
  private zzw zzaxy;
  private boolean zzaxz;
  private TagManager zzaya;
  
  public zzv(Status paramStatus)
  {
    this.zzact = paramStatus;
    this.zzaxu = null;
  }
  
  public zzv(TagManager paramTagManager, Looper paramLooper, Container paramContainer, zzw paramzzw)
  {
    this.zzaya = paramTagManager;
    if (paramLooper == null) {
      paramLooper = Looper.getMainLooper();
    }
    this.zzaxu = paramLooper;
    this.zzaxv = paramContainer;
    this.zzaxy = paramzzw;
    this.zzact = Status.RESULT_SUCCESS;
    paramTagManager.zza(this);
  }
  
  private final void zzmq()
  {
    if (this.zzaxx != null)
    {
      zzx localzzx = this.zzaxx;
      localzzx.sendMessage(localzzx.obtainMessage(1, this.zzaxw.zzmn()));
    }
  }
  
  public final Container getContainer()
  {
    try
    {
      if (this.zzaxz)
      {
        zzdi.e("ContainerHolder is released.");
        return null;
      }
      if (this.zzaxw != null)
      {
        this.zzaxv = this.zzaxw;
        this.zzaxw = null;
      }
      Container localContainer = this.zzaxv;
      return localContainer;
    }
    finally {}
  }
  
  final String getContainerId()
  {
    if (this.zzaxz)
    {
      zzdi.e("getContainerId called on a released ContainerHolder.");
      return "";
    }
    return this.zzaxv.getContainerId();
  }
  
  public final Status getStatus()
  {
    return this.zzact;
  }
  
  public final void refresh()
  {
    try
    {
      if (this.zzaxz)
      {
        zzdi.e("Refreshing a released ContainerHolder.");
        return;
      }
      this.zzaxy.zzmr();
      return;
    }
    finally {}
  }
  
  public final void release()
  {
    try
    {
      if (this.zzaxz)
      {
        zzdi.e("Releasing a released ContainerHolder.");
        return;
      }
      this.zzaxz = true;
      this.zzaya.zzb(this);
      this.zzaxv.release();
      this.zzaxv = null;
      this.zzaxw = null;
      this.zzaxy = null;
      this.zzaxx = null;
      return;
    }
    finally {}
  }
  
  public final void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener paramContainerAvailableListener)
  {
    try
    {
      if (this.zzaxz)
      {
        zzdi.e("ContainerHolder is released.");
        return;
      }
      if (paramContainerAvailableListener == null)
      {
        this.zzaxx = null;
        return;
      }
      this.zzaxx = new zzx(this, paramContainerAvailableListener, this.zzaxu);
      if (this.zzaxw != null) {
        zzmq();
      }
      return;
    }
    finally {}
  }
  
  public final void zza(Container paramContainer)
  {
    try
    {
      boolean bool = this.zzaxz;
      if (bool) {
        return;
      }
      this.zzaxw = paramContainer;
      zzmq();
      return;
    }
    finally {}
  }
  
  public final void zzcr(String paramString)
  {
    try
    {
      boolean bool = this.zzaxz;
      if (bool) {
        return;
      }
      this.zzaxv.zzcr(paramString);
      return;
    }
    finally {}
  }
  
  final void zzcs(String paramString)
  {
    if (this.zzaxz)
    {
      zzdi.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return;
    }
    this.zzaxy.zzcs(paramString);
  }
  
  final String zzmp()
  {
    if (this.zzaxz)
    {
      zzdi.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return "";
    }
    return this.zzaxy.zzmp();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */