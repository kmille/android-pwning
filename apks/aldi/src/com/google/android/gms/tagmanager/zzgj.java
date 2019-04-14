package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzacj;
import com.google.android.gms.internal.measurement.zzm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
public final class zzgj
{
  private static final Object zzbev;
  private static Long zzbew = Long.valueOf(0L);
  private static Double zzbex = Double.valueOf(0.0D);
  private static zzgi zzbey = zzgi.zzao(0L);
  private static String zzbez = new String("");
  private static Boolean zzbfa = Boolean.FALSE;
  private static List<Object> zzbfb = new ArrayList(0);
  private static Map<Object, Object> zzbfc = new HashMap();
  private static zzm zzbfd = zzj(zzbez);
  
  private static double getDouble(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).doubleValue();
    }
    zzdi.e("getDouble received non-Number");
    return 0.0D;
  }
  
  public static String zzc(zzm paramzzm)
  {
    return zzi(zzh(paramzzm));
  }
  
  public static zzgi zzd(zzm paramzzm)
  {
    paramzzm = zzh(paramzzm);
    if ((paramzzm instanceof zzgi)) {
      return (zzgi)paramzzm;
    }
    if (zzl(paramzzm)) {
      return zzgi.zzao(zzm(paramzzm));
    }
    if (zzk(paramzzm)) {
      return zzgi.zza(Double.valueOf(getDouble(paramzzm)));
    }
    return zzdt(zzi(paramzzm));
  }
  
  public static zzm zzds(String paramString)
  {
    zzm localzzm = new zzm();
    localzzm.type = 5;
    localzzm.zzqc = paramString;
    return localzzm;
  }
  
  private static zzgi zzdt(String paramString)
  {
    try
    {
      localObject = zzgi.zzdr(paramString);
      return (zzgi)localObject;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject;
      for (;;) {}
    }
    localObject = new StringBuilder(String.valueOf(paramString).length() + 33);
    ((StringBuilder)localObject).append("Failed to convert '");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("' to a number.");
    zzdi.e(((StringBuilder)localObject).toString());
    return zzbey;
  }
  
  public static Long zze(zzm paramzzm)
  {
    paramzzm = zzh(paramzzm);
    if (zzl(paramzzm)) {}
    for (long l = zzm(paramzzm);; l = paramzzm.longValue())
    {
      return Long.valueOf(l);
      paramzzm = zzdt(zzi(paramzzm));
      if (paramzzm == zzbey) {
        return zzbew;
      }
    }
  }
  
  public static Double zzf(zzm paramzzm)
  {
    paramzzm = zzh(paramzzm);
    if (zzk(paramzzm)) {}
    for (double d = getDouble(paramzzm);; d = paramzzm.doubleValue())
    {
      return Double.valueOf(d);
      paramzzm = zzdt(zzi(paramzzm));
      if (paramzzm == zzbey) {
        return zzbex;
      }
    }
  }
  
  public static Boolean zzg(zzm paramzzm)
  {
    paramzzm = zzh(paramzzm);
    if ((paramzzm instanceof Boolean)) {
      return (Boolean)paramzzm;
    }
    paramzzm = zzi(paramzzm);
    if ("true".equalsIgnoreCase(paramzzm)) {
      return Boolean.TRUE;
    }
    if ("false".equalsIgnoreCase(paramzzm)) {
      return Boolean.FALSE;
    }
    return zzbfa;
  }
  
  public static Object zzh(zzm paramzzm)
  {
    if (paramzzm == null) {
      return null;
    }
    int m = paramzzm.type;
    int k = 0;
    int j = 0;
    int i = 0;
    Object localObject1;
    Object localObject2;
    switch (m)
    {
    default: 
      i = paramzzm.type;
      paramzzm = new StringBuilder(46);
      paramzzm.append("Failed to convert a value of type: ");
      paramzzm.append(i);
      paramzzm = paramzzm.toString();
    case 8: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
      for (;;)
      {
        zzdi.e(paramzzm);
        return null;
        return Boolean.valueOf(paramzzm.zzqe);
        localObject1 = new StringBuilder();
        paramzzm = paramzzm.zzqf;
        j = paramzzm.length;
        while (i < j)
        {
          localObject2 = zzi(zzh(paramzzm[i]));
          if (localObject2 == zzbez) {
            return null;
          }
          ((StringBuilder)localObject1).append((String)localObject2);
          i += 1;
        }
        return ((StringBuilder)localObject1).toString();
        return Long.valueOf(paramzzm.zzqd);
        paramzzm = "Trying to convert a function id to object";
        continue;
        paramzzm = "Trying to convert a macro reference to object";
      }
    case 3: 
      if (paramzzm.zzpz.length != paramzzm.zzqa.length)
      {
        paramzzm = String.valueOf(paramzzm.toString());
        if (paramzzm.length() != 0) {
          paramzzm = "Converting an invalid value to object: ".concat(paramzzm);
        } else {
          paramzzm = new String("Converting an invalid value to object: ");
        }
        zzdi.e(paramzzm);
        return null;
      }
      localObject1 = new HashMap(paramzzm.zzqa.length);
      i = k;
      while (i < paramzzm.zzpz.length)
      {
        localObject2 = zzh(paramzzm.zzpz[i]);
        Object localObject3 = zzh(paramzzm.zzqa[i]);
        if (localObject2 != null)
        {
          if (localObject3 == null) {
            return null;
          }
          ((Map)localObject1).put(localObject2, localObject3);
          i += 1;
        }
        else
        {
          return null;
        }
      }
      return localObject1;
    case 2: 
      localObject1 = new ArrayList(paramzzm.zzpy.length);
      paramzzm = paramzzm.zzpy;
      k = paramzzm.length;
      i = j;
      while (i < k)
      {
        localObject2 = zzh(paramzzm[i]);
        if (localObject2 == null) {
          return null;
        }
        ((ArrayList)localObject1).add(localObject2);
        i += 1;
      }
      return localObject1;
    }
    return paramzzm.string;
  }
  
  private static String zzi(Object paramObject)
  {
    if (paramObject == null) {
      return zzbez;
    }
    return paramObject.toString();
  }
  
  public static zzm zzj(Object paramObject)
  {
    zzm localzzm1 = new zzm();
    if ((paramObject instanceof zzm)) {
      return (zzm)paramObject;
    }
    boolean bool2 = paramObject instanceof String;
    boolean bool1 = false;
    if (bool2) {
      localzzm1.type = 1;
    }
    for (paramObject = (String)paramObject;; paramObject = paramObject.toString())
    {
      localzzm1.string = ((String)paramObject);
      break label473;
      Object localObject1;
      Object localObject2;
      if ((paramObject instanceof List))
      {
        localzzm1.type = 2;
        localObject1 = (List)paramObject;
        paramObject = new ArrayList(((List)localObject1).size());
        localObject1 = ((List)localObject1).iterator();
        bool1 = false;
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = zzj(((Iterator)localObject1).next());
          if (localObject2 == zzbfd) {
            return zzbfd;
          }
          if ((!bool1) && (!((zzm)localObject2).zzqh)) {
            bool1 = false;
          } else {
            bool1 = true;
          }
          ((List)paramObject).add(localObject2);
        }
        localzzm1.zzpy = ((zzm[])((List)paramObject).toArray(new zzm[0]));
        break label473;
      }
      if ((paramObject instanceof Map))
      {
        localzzm1.type = 3;
        localObject2 = ((Map)paramObject).entrySet();
        paramObject = new ArrayList(((Set)localObject2).size());
        localObject1 = new ArrayList(((Set)localObject2).size());
        localObject2 = ((Set)localObject2).iterator();
        bool1 = false;
        while (((Iterator)localObject2).hasNext())
        {
          Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
          zzm localzzm2 = zzj(((Map.Entry)localObject3).getKey());
          localObject3 = zzj(((Map.Entry)localObject3).getValue());
          if ((localzzm2 != zzbfd) && (localObject3 != zzbfd))
          {
            if ((!bool1) && (!localzzm2.zzqh) && (!((zzm)localObject3).zzqh)) {
              bool1 = false;
            } else {
              bool1 = true;
            }
            ((List)paramObject).add(localzzm2);
            ((List)localObject1).add(localObject3);
          }
          else
          {
            return zzbfd;
          }
        }
        localzzm1.zzpz = ((zzm[])((List)paramObject).toArray(new zzm[0]));
        localzzm1.zzqa = ((zzm[])((List)localObject1).toArray(new zzm[0]));
        break label473;
      }
      if (!zzk(paramObject)) {
        break;
      }
      localzzm1.type = 1;
    }
    if (zzl(paramObject))
    {
      localzzm1.type = 6;
      localzzm1.zzqd = zzm(paramObject);
    }
    else
    {
      if (!(paramObject instanceof Boolean)) {
        break label480;
      }
      localzzm1.type = 8;
      localzzm1.zzqe = ((Boolean)paramObject).booleanValue();
    }
    label473:
    localzzm1.zzqh = bool1;
    return localzzm1;
    label480:
    if (paramObject == null) {
      paramObject = "null";
    } else {
      paramObject = paramObject.getClass().toString();
    }
    paramObject = String.valueOf(paramObject);
    if (((String)paramObject).length() != 0) {
      paramObject = "Converting to Value from unknown object type: ".concat((String)paramObject);
    } else {
      paramObject = new String("Converting to Value from unknown object type: ");
    }
    zzdi.e((String)paramObject);
    return zzbfd;
  }
  
  private static boolean zzk(Object paramObject)
  {
    return ((paramObject instanceof Double)) || ((paramObject instanceof Float)) || (((paramObject instanceof zzgi)) && (((zzgi)paramObject).zzpg()));
  }
  
  private static boolean zzl(Object paramObject)
  {
    return ((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof zzgi)) && (((zzgi)paramObject).zzph()));
  }
  
  private static long zzm(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).longValue();
    }
    zzdi.e("getInt64 received non-Number");
    return 0L;
  }
  
  public static Object zzpi()
  {
    return null;
  }
  
  public static Long zzpj()
  {
    return zzbew;
  }
  
  public static Double zzpk()
  {
    return zzbex;
  }
  
  public static Boolean zzpl()
  {
    return zzbfa;
  }
  
  public static zzgi zzpm()
  {
    return zzbey;
  }
  
  public static String zzpn()
  {
    return zzbez;
  }
  
  public static zzm zzpo()
  {
    return zzbfd;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */