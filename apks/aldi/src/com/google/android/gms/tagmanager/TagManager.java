package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RawRes;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@VisibleForTesting
public class TagManager
{
  private static TagManager zzben;
  private final DataLayer zzaxn;
  private final zzal zzbco;
  private final zza zzbek;
  private final zzfm zzbel;
  private final ConcurrentMap<String, zzv> zzbem;
  private final Context zzqx;
  
  @VisibleForTesting
  private TagManager(Context paramContext, zza paramzza, DataLayer paramDataLayer, zzfm paramzzfm)
  {
    if (paramContext != null)
    {
      this.zzqx = paramContext.getApplicationContext();
      this.zzbel = paramzzfm;
      this.zzbek = paramzza;
      this.zzbem = new ConcurrentHashMap();
      this.zzaxn = paramDataLayer;
      this.zzaxn.zza(new zzga(this));
      this.zzaxn.zza(new zzg(this.zzqx));
      this.zzbco = new zzal();
      this.zzqx.registerComponentCallbacks(new zzgc(this));
      zza.zzh(this.zzqx);
      return;
    }
    throw new NullPointerException("context cannot be null");
  }
  
  @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
  public static TagManager getInstance(Context paramContext)
  {
    try
    {
      if (zzben == null) {
        if (paramContext != null)
        {
          zzben = new TagManager(paramContext, new zzgb(), new DataLayer(new zzat(paramContext)), zzfn.zzpc());
        }
        else
        {
          zzdi.e("TagManager.getInstance requires non-null context.");
          throw new NullPointerException();
        }
      }
      paramContext = zzben;
      return paramContext;
    }
    finally {}
  }
  
  private final void zzdo(String paramString)
  {
    Iterator localIterator = this.zzbem.values().iterator();
    while (localIterator.hasNext()) {
      ((zzv)localIterator.next()).zzcr(paramString);
    }
  }
  
  public void dispatch()
  {
    this.zzbel.dispatch();
  }
  
  public DataLayer getDataLayer()
  {
    return this.zzaxn;
  }
  
  public PendingResult<ContainerHolder> loadContainerDefaultOnly(String paramString, @RawRes int paramInt)
  {
    paramString = this.zzbek.zza(this.zzqx, this, null, paramString, paramInt, this.zzbco);
    paramString.zzms();
    return paramString;
  }
  
  public PendingResult<ContainerHolder> loadContainerDefaultOnly(String paramString, @RawRes int paramInt, Handler paramHandler)
  {
    paramString = this.zzbek.zza(this.zzqx, this, paramHandler.getLooper(), paramString, paramInt, this.zzbco);
    paramString.zzms();
    return paramString;
  }
  
  public PendingResult<ContainerHolder> loadContainerPreferFresh(String paramString, @RawRes int paramInt)
  {
    paramString = this.zzbek.zza(this.zzqx, this, null, paramString, paramInt, this.zzbco);
    paramString.zzmu();
    return paramString;
  }
  
  public PendingResult<ContainerHolder> loadContainerPreferFresh(String paramString, @RawRes int paramInt, Handler paramHandler)
  {
    paramString = this.zzbek.zza(this.zzqx, this, paramHandler.getLooper(), paramString, paramInt, this.zzbco);
    paramString.zzmu();
    return paramString;
  }
  
  public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String paramString, @RawRes int paramInt)
  {
    paramString = this.zzbek.zza(this.zzqx, this, null, paramString, paramInt, this.zzbco);
    paramString.zzmt();
    return paramString;
  }
  
  public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String paramString, @RawRes int paramInt, Handler paramHandler)
  {
    paramString = this.zzbek.zza(this.zzqx, this, paramHandler.getLooper(), paramString, paramInt, this.zzbco);
    paramString.zzmt();
    return paramString;
  }
  
  public void setVerboseLoggingEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 2;
    } else {
      i = 5;
    }
    zzdi.setLogLevel(i);
  }
  
  @VisibleForTesting
  public final int zza(zzv paramzzv)
  {
    this.zzbem.put(paramzzv.getContainerId(), paramzzv);
    return this.zzbem.size();
  }
  
  final boolean zzb(Uri paramUri)
  {
    try
    {
      zzeh localzzeh = zzeh.zzok();
      if (localzzeh.zzb(paramUri))
      {
        paramUri = localzzeh.getContainerId();
        switch (zzgd.zzbep[localzzeh.zzol().ordinal()])
        {
        case 2: 
        case 3: 
          Iterator localIterator = this.zzbem.keySet().iterator();
          if (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            zzv localzzv = (zzv)this.zzbem.get(str);
            if (str.equals(paramUri)) {
              localzzv.zzcs(localzzeh.zzom());
            }
            for (;;)
            {
              localzzv.refresh();
              break;
              if (localzzv.zzmp() == null) {
                break;
              }
              localzzv.zzcs(null);
            }
          }
          break;
        case 1: 
          paramUri = (zzv)this.zzbem.get(paramUri);
          if (paramUri != null)
          {
            paramUri.zzcs(null);
            paramUri.refresh();
          }
          break;
        }
      }
      for (;;)
      {
        for (boolean bool = true;; bool = false) {
          return bool;
        }
      }
    }
    finally {}
  }
  
  @VisibleForTesting
  public final boolean zzb(zzv paramzzv)
  {
    return this.zzbem.remove(paramzzv.getContainerId()) != null;
  }
  
  @VisibleForTesting
  public static abstract interface zza
  {
    public abstract zzy zza(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzal paramzzal);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/TagManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */