package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzcm
  extends zzar
{
  private static zzcm zzaau;
  
  public zzcm(zzat paramzzat)
  {
    super(paramzzat);
  }
  
  @VisibleForTesting
  private static String zzd(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject1 = paramObject;
    if ((paramObject instanceof Integer)) {
      localObject1 = Long.valueOf(((Integer)paramObject).intValue());
    }
    if ((localObject1 instanceof Long))
    {
      Object localObject2 = (Long)localObject1;
      if (Math.abs(((Long)localObject2).longValue()) < 100L) {
        return String.valueOf(localObject1);
      }
      if (String.valueOf(localObject1).charAt(0) == '-') {
        paramObject = "-";
      } else {
        paramObject = "";
      }
      localObject1 = String.valueOf(Math.abs(((Long)localObject2).longValue()));
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)paramObject);
      ((StringBuilder)localObject2).append(Math.round(Math.pow(10.0D, ((String)localObject1).length() - 1)));
      ((StringBuilder)localObject2).append("...");
      ((StringBuilder)localObject2).append((String)paramObject);
      ((StringBuilder)localObject2).append(Math.round(Math.pow(10.0D, ((String)localObject1).length()) - 1.0D));
      return ((StringBuilder)localObject2).toString();
    }
    if ((localObject1 instanceof Boolean)) {
      return String.valueOf(localObject1);
    }
    if ((localObject1 instanceof Throwable)) {
      return localObject1.getClass().getCanonicalName();
    }
    return "-";
  }
  
  public static zzcm zzet()
  {
    return zzaau;
  }
  
  public final void zza(zzch paramzzch, String paramString)
  {
    if (paramzzch != null) {
      paramzzch = paramzzch.toString();
    } else {
      paramzzch = "no hit data";
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Discarding hit. ".concat(paramString);
    } else {
      paramString = new String("Discarding hit. ");
    }
    zzd(paramString, paramzzch);
  }
  
  public final void zza(Map<String, String> paramMap, String paramString)
  {
    if (paramMap != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(',');
        }
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append((String)localEntry.getValue());
      }
      paramMap = localStringBuilder.toString();
    }
    else
    {
      paramMap = "no hit data";
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = "Discarding hit. ".concat(paramString);
    } else {
      paramString = new String("Discarding hit. ");
    }
    zzd(paramString, paramMap);
  }
  
  protected final void zzac()
  {
    try
    {
      zzaau = this;
      return;
    }
    finally {}
  }
  
  public final void zzb(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i;
    char c1;
    try
    {
      Preconditions.checkNotNull(paramString);
      i = paramInt;
      if (paramInt >= 0) {
        break label190;
      }
      i = 0;
    }
    finally {}
    if (zzbv().zzds()) {
      c1 = 'C';
    }
    for (;;)
    {
      char c2 = "01VDIWEA?".charAt(paramInt);
      String str = zzas.VERSION;
      paramString = zzc(paramString, zzd(paramObject1), zzd(paramObject2), zzd(paramObject3));
      paramObject1 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(paramString).length());
      ((StringBuilder)paramObject1).append("3");
      ((StringBuilder)paramObject1).append(c2);
      ((StringBuilder)paramObject1).append(c1);
      ((StringBuilder)paramObject1).append(str);
      ((StringBuilder)paramObject1).append(":");
      ((StringBuilder)paramObject1).append(paramString);
      paramObject1 = ((StringBuilder)paramObject1).toString();
      paramString = (String)paramObject1;
      if (((String)paramObject1).length() > 1024) {
        paramString = ((String)paramObject1).substring(0, 1024);
      }
      paramObject1 = zzbs().zzcl();
      if (paramObject1 != null) {
        ((zzcq)paramObject1).zzfg().zzad(paramString);
      }
      return;
      label190:
      paramInt = i;
      if (i < 9) {
        break;
      }
      paramInt = 8;
      break;
      c1 = 'c';
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */