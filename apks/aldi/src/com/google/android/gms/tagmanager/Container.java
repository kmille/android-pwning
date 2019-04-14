package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzl;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzwi;
import com.google.android.gms.internal.measurement.zzwm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@VisibleForTesting
public class Container
{
  private final String zzaxm;
  private final DataLayer zzaxn;
  private zzfb zzaxo;
  private Map<String, FunctionCallMacroCallback> zzaxp = new HashMap();
  private Map<String, FunctionCallTagCallback> zzaxq = new HashMap();
  private volatile long zzaxr;
  private volatile String zzaxs = "";
  private final Context zzqx;
  
  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, zzl paramzzl)
  {
    this.zzqx = paramContext;
    this.zzaxn = paramDataLayer;
    this.zzaxm = paramString;
    this.zzaxr = paramLong;
    paramContext = paramzzl.zzpv;
    if (paramContext != null)
    {
      try
      {
        paramDataLayer = zzwe.zza(paramContext);
        zza(paramDataLayer);
      }
      catch (zzwm paramDataLayer)
      {
        paramContext = String.valueOf(paramContext);
        paramDataLayer = paramDataLayer.toString();
        paramString = new StringBuilder(String.valueOf(paramContext).length() + 46 + String.valueOf(paramDataLayer).length());
        paramString.append("Not loading resource: ");
        paramString.append(paramContext);
        paramString.append(" because it is invalid: ");
        paramString.append(paramDataLayer);
        zzdi.e(paramString.toString());
      }
      if (paramzzl.zzpu != null)
      {
        paramContext = paramzzl.zzpu;
        paramDataLayer = new ArrayList();
        int j = paramContext.length;
        int i = 0;
        while (i < j)
        {
          paramDataLayer.add(paramContext[i]);
          i += 1;
        }
        zzmo().zzf(paramDataLayer);
      }
      return;
    }
    throw new NullPointerException();
  }
  
  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, zzwi paramzzwi)
  {
    this.zzqx = paramContext;
    this.zzaxn = paramDataLayer;
    this.zzaxm = paramString;
    this.zzaxr = 0L;
    zza(paramzzwi);
  }
  
  private final void zza(zzwi paramzzwi)
  {
    this.zzaxs = paramzzwi.getVersion();
    Object localObject = this.zzaxs;
    zzeh.zzok().zzol().equals(zzeh.zza.zzbcd);
    localObject = new zzdq();
    zza(new zzfb(this.zzqx, paramzzwi, this.zzaxn, new zza(null), new zzb(null), (zzbo)localObject));
    if (getBoolean("_gtm.loadEventEnabled")) {
      this.zzaxn.pushEvent("gtm.load", DataLayer.mapOf(new Object[] { "gtm.id", this.zzaxm }));
    }
  }
  
  private final void zza(zzfb paramzzfb)
  {
    try
    {
      this.zzaxo = paramzzfb;
      return;
    }
    finally
    {
      paramzzfb = finally;
      throw paramzzfb;
    }
  }
  
  private final zzfb zzmo()
  {
    try
    {
      zzfb localzzfb = this.zzaxo;
      return localzzfb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean getBoolean(String paramString)
  {
    Object localObject = zzmo();
    if (localObject == null) {
      paramString = "getBoolean called for closed container.";
    }
    for (;;)
    {
      zzdi.e(paramString);
      return zzgj.zzpl().booleanValue();
      try
      {
        boolean bool = zzgj.zzg((zzm)((zzfb)localObject).zzdm(paramString).getObject()).booleanValue();
        return bool;
      }
      catch (Exception paramString)
      {
        paramString = paramString.getMessage();
        localObject = new StringBuilder(String.valueOf(paramString).length() + 66);
        ((StringBuilder)localObject).append("Calling getBoolean() threw an exception: ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" Returning default value.");
        paramString = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  public String getContainerId()
  {
    return this.zzaxm;
  }
  
  public double getDouble(String paramString)
  {
    Object localObject = zzmo();
    if (localObject == null) {
      paramString = "getDouble called for closed container.";
    }
    for (;;)
    {
      zzdi.e(paramString);
      return zzgj.zzpk().doubleValue();
      try
      {
        double d = zzgj.zzf((zzm)((zzfb)localObject).zzdm(paramString).getObject()).doubleValue();
        return d;
      }
      catch (Exception paramString)
      {
        paramString = paramString.getMessage();
        localObject = new StringBuilder(String.valueOf(paramString).length() + 65);
        ((StringBuilder)localObject).append("Calling getDouble() threw an exception: ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" Returning default value.");
        paramString = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  public long getLastRefreshTime()
  {
    return this.zzaxr;
  }
  
  public long getLong(String paramString)
  {
    Object localObject = zzmo();
    if (localObject == null) {
      paramString = "getLong called for closed container.";
    }
    for (;;)
    {
      zzdi.e(paramString);
      return zzgj.zzpj().longValue();
      try
      {
        long l = zzgj.zze((zzm)((zzfb)localObject).zzdm(paramString).getObject()).longValue();
        return l;
      }
      catch (Exception paramString)
      {
        paramString = paramString.getMessage();
        localObject = new StringBuilder(String.valueOf(paramString).length() + 63);
        ((StringBuilder)localObject).append("Calling getLong() threw an exception: ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" Returning default value.");
        paramString = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  public String getString(String paramString)
  {
    Object localObject = zzmo();
    if (localObject == null) {
      paramString = "getString called for closed container.";
    }
    for (;;)
    {
      zzdi.e(paramString);
      return zzgj.zzpn();
      try
      {
        paramString = zzgj.zzc((zzm)((zzfb)localObject).zzdm(paramString).getObject());
        return paramString;
      }
      catch (Exception paramString)
      {
        paramString = paramString.getMessage();
        localObject = new StringBuilder(String.valueOf(paramString).length() + 65);
        ((StringBuilder)localObject).append("Calling getString() threw an exception: ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" Returning default value.");
        paramString = ((StringBuilder)localObject).toString();
      }
    }
  }
  
  public boolean isDefault()
  {
    return getLastRefreshTime() == 0L;
  }
  
  public void registerFunctionCallMacroCallback(String paramString, FunctionCallMacroCallback paramFunctionCallMacroCallback)
  {
    if (paramFunctionCallMacroCallback != null) {
      synchronized (this.zzaxp)
      {
        this.zzaxp.put(paramString, paramFunctionCallMacroCallback);
        return;
      }
    }
    throw new NullPointerException("Macro handler must be non-null");
  }
  
  public void registerFunctionCallTagCallback(String paramString, FunctionCallTagCallback paramFunctionCallTagCallback)
  {
    if (paramFunctionCallTagCallback != null) {
      synchronized (this.zzaxq)
      {
        this.zzaxq.put(paramString, paramFunctionCallTagCallback);
        return;
      }
    }
    throw new NullPointerException("Tag callback must be non-null");
  }
  
  final void release()
  {
    this.zzaxo = null;
  }
  
  public void unregisterFunctionCallMacroCallback(String paramString)
  {
    synchronized (this.zzaxp)
    {
      this.zzaxp.remove(paramString);
      return;
    }
  }
  
  public void unregisterFunctionCallTagCallback(String paramString)
  {
    synchronized (this.zzaxq)
    {
      this.zzaxq.remove(paramString);
      return;
    }
  }
  
  @VisibleForTesting
  final FunctionCallMacroCallback zzcp(String paramString)
  {
    synchronized (this.zzaxp)
    {
      paramString = (FunctionCallMacroCallback)this.zzaxp.get(paramString);
      return paramString;
    }
  }
  
  @VisibleForTesting
  public final FunctionCallTagCallback zzcq(String paramString)
  {
    synchronized (this.zzaxq)
    {
      paramString = (FunctionCallTagCallback)this.zzaxq.get(paramString);
      return paramString;
    }
  }
  
  @VisibleForTesting
  public final void zzcr(String paramString)
  {
    zzmo().zzcr(paramString);
  }
  
  @VisibleForTesting
  public final String zzmn()
  {
    return this.zzaxs;
  }
  
  public static abstract interface FunctionCallMacroCallback
  {
    public abstract Object getValue(String paramString, Map<String, Object> paramMap);
  }
  
  public static abstract interface FunctionCallTagCallback
  {
    public abstract void execute(String paramString, Map<String, Object> paramMap);
  }
  
  final class zza
    implements zzan
  {
    private zza() {}
    
    public final Object zza(String paramString, Map<String, Object> paramMap)
    {
      Container.FunctionCallMacroCallback localFunctionCallMacroCallback = Container.this.zzcp(paramString);
      if (localFunctionCallMacroCallback == null) {
        return null;
      }
      return localFunctionCallMacroCallback.getValue(paramString, paramMap);
    }
  }
  
  final class zzb
    implements zzan
  {
    private zzb() {}
    
    public final Object zza(String paramString, Map<String, Object> paramMap)
    {
      Container.FunctionCallTagCallback localFunctionCallTagCallback = Container.this.zzcq(paramString);
      if (localFunctionCallTagCallback != null) {
        localFunctionCallTagCallback.execute(paramString, paramMap);
      }
      return zzgj.zzpn();
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/Container.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */