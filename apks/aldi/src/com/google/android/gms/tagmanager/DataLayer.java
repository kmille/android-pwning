package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@VisibleForTesting
public class DataLayer
{
  public static final String EVENT_KEY = "event";
  public static final Object OBJECT_NOT_PRESENT = new Object();
  private static final String[] zzayw = "gtm.lifetime".toString().split("\\.");
  private static final Pattern zzayx = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap<zzb, Integer> zzayy;
  private final Map<String, Object> zzayz;
  private final ReentrantLock zzaza;
  private final LinkedList<Map<String, Object>> zzazb;
  private final zzc zzazc;
  private final CountDownLatch zzazd;
  
  @VisibleForTesting
  DataLayer()
  {
    this(new zzao());
  }
  
  DataLayer(zzc paramzzc)
  {
    this.zzazc = paramzzc;
    this.zzayy = new ConcurrentHashMap();
    this.zzayz = new HashMap();
    this.zzaza = new ReentrantLock();
    this.zzazb = new LinkedList();
    this.zzazd = new CountDownLatch(1);
    this.zzazc.zza(new zzap(this));
  }
  
  @VisibleForTesting
  public static List<Object> listOf(Object... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramVarArgs.length)
    {
      localArrayList.add(paramVarArgs[i]);
      i += 1;
    }
    return localArrayList;
  }
  
  @VisibleForTesting
  public static Map<String, Object> mapOf(Object... paramVarArgs)
  {
    if (paramVarArgs.length % 2 == 0)
    {
      Object localObject = new HashMap();
      int i = 0;
      while (i < paramVarArgs.length) {
        if ((paramVarArgs[i] instanceof String))
        {
          ((Map)localObject).put((String)paramVarArgs[i], paramVarArgs[(i + 1)]);
          i += 2;
        }
        else
        {
          paramVarArgs = String.valueOf(paramVarArgs[i]);
          localObject = new StringBuilder(String.valueOf(paramVarArgs).length() + 21);
          ((StringBuilder)localObject).append("key is not a string: ");
          ((StringBuilder)localObject).append(paramVarArgs);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      return (Map<String, Object>)localObject;
    }
    throw new IllegalArgumentException("expected even number of key-value pairs");
  }
  
  @VisibleForTesting
  private final void zza(List<Object> paramList1, List<Object> paramList2)
  {
    while (paramList2.size() < paramList1.size()) {
      paramList2.add(null);
    }
    int i = 0;
    while (i < paramList1.size())
    {
      Object localObject = paramList1.get(i);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(i) instanceof List)) {
          paramList2.set(i, new ArrayList());
        }
        zza((List)localObject, (List)paramList2.get(i));
      }
      else if ((localObject instanceof Map))
      {
        if (!(paramList2.get(i) instanceof Map)) {
          paramList2.set(i, new HashMap());
        }
        zzb((Map)localObject, (Map)paramList2.get(i));
      }
      else if (localObject != OBJECT_NOT_PRESENT)
      {
        paramList2.set(i, localObject);
      }
      i += 1;
    }
  }
  
  private final void zza(Map<String, Object> paramMap, String paramString, Collection<zza> paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramString.length() == 0) {
        paramMap = "";
      } else {
        paramMap = ".";
      }
      String str = (String)localEntry.getKey();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + String.valueOf(paramMap).length() + String.valueOf(str).length());
      localStringBuilder.append(paramString);
      localStringBuilder.append(paramMap);
      localStringBuilder.append(str);
      paramMap = localStringBuilder.toString();
      if ((localEntry.getValue() instanceof Map)) {
        zza((Map)localEntry.getValue(), paramMap, paramCollection);
      } else if (!paramMap.equals("gtm.lifetime")) {
        paramCollection.add(new zza(paramMap, localEntry.getValue()));
      }
    }
  }
  
  @VisibleForTesting
  private final void zzb(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List)) {
          paramMap2.put(str, new ArrayList());
        }
        zza((List)localObject, (List)paramMap2.get(str));
      }
      else if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map)) {
          paramMap2.put(str, new HashMap());
        }
        zzb((Map)localObject, (Map)paramMap2.get(str));
      }
      else
      {
        paramMap2.put(str, localObject);
      }
    }
  }
  
  @VisibleForTesting
  private static Long zzcv(String paramString)
  {
    Matcher localMatcher = zzayx.matcher(paramString);
    if (!localMatcher.matches())
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "unknown _lifetime: ".concat(paramString);
      } else {
        paramString = new String("unknown _lifetime: ");
      }
      zzdi.zzcz(paramString);
      return null;
    }
    try
    {
      l = Long.parseLong(localMatcher.group(1));
    }
    catch (NumberFormatException localNumberFormatException)
    {
      long l;
      String str;
      int i;
      for (;;) {}
    }
    str = String.valueOf(paramString);
    if (str.length() != 0) {
      str = "illegal number in _lifetime value: ".concat(str);
    } else {
      str = new String("illegal number in _lifetime value: ");
    }
    zzdi.zzab(str);
    l = 0L;
    if (l <= 0L)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "non-positive _lifetime: ".concat(paramString);
      } else {
        paramString = new String("non-positive _lifetime: ");
      }
      zzdi.zzcz(paramString);
      return null;
    }
    str = localMatcher.group(2);
    if (str.length() == 0) {
      return Long.valueOf(l);
    }
    i = str.charAt(0);
    if (i != 100) {
      if (i != 104) {
        if (i != 109)
        {
          if (i != 115)
          {
            paramString = String.valueOf(paramString);
            if (paramString.length() != 0) {
              paramString = "unknown units in _lifetime: ".concat(paramString);
            } else {
              paramString = new String("unknown units in _lifetime: ");
            }
            zzdi.zzab(paramString);
            return null;
          }
          l *= 1000L;
        }
      }
    }
    for (;;)
    {
      return Long.valueOf(l);
      for (l *= 1000L;; l = l * 1000L * 60L)
      {
        l *= 60L;
        break;
      }
      l = l * 1000L * 60L * 60L * 24L;
    }
  }
  
  private final void zzh(Map<String, Object> paramMap)
  {
    this.zzaza.lock();
    for (;;)
    {
      int i;
      Object localObject1;
      Iterator localIterator;
      try
      {
        this.zzazb.offer(paramMap);
        i = this.zzaza.getHoldCount();
        int j = 0;
        if (i == 1)
        {
          i = 0;
          localObject1 = (Map)this.zzazb.poll();
          if (localObject1 != null) {
            synchronized (this.zzayz)
            {
              localIterator = ((Map)localObject1).keySet().iterator();
              if (localIterator.hasNext())
              {
                localObject3 = (String)localIterator.next();
                zzb(zzk((String)localObject3, ((Map)localObject1).get(localObject3)), this.zzayz);
                continue;
              }
              ??? = this.zzayy.keySet().iterator();
              if (!((Iterator)???).hasNext()) {
                break label327;
              }
              ((zzb)((Iterator)???).next()).zzf((Map)localObject1);
              continue;
              this.zzazb.clear();
              throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
            }
          }
        }
        Object localObject3 = zzayw;
        int k = localObject3.length;
        localObject1 = paramMap;
        i = j;
        localIterator = null;
        ??? = localObject1;
        if (i >= k) {
          break label341;
        }
        ??? = localObject3[i];
        if (!(localObject1 instanceof Map))
        {
          ??? = null;
          break label341;
        }
        localObject1 = ((Map)localObject1).get(???);
        i += 1;
        continue;
        localObject1 = zzcv(???.toString());
        if (localObject1 != null)
        {
          ??? = new ArrayList();
          zza(paramMap, "", (Collection)???);
          this.zzazc.zza((List)???, ((Long)localObject1).longValue());
        }
        return;
      }
      finally
      {
        this.zzaza.unlock();
      }
      label327:
      i += 1;
      if (i <= 500)
      {
        continue;
        label341:
        if (??? == null) {
          localObject1 = localIterator;
        }
      }
    }
  }
  
  static Map<String, Object> zzk(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int i = 0;
    HashMap localHashMap2;
    for (paramString = localHashMap1; i < arrayOfString.length - 1; paramString = localHashMap2)
    {
      localHashMap2 = new HashMap();
      paramString.put(arrayOfString[i], localHashMap2);
      i += 1;
    }
    paramString.put(arrayOfString[(arrayOfString.length - 1)], paramObject);
    return localHashMap1;
  }
  
  public Object get(String paramString)
  {
    for (;;)
    {
      int i;
      synchronized (this.zzayz)
      {
        Map localMap1 = this.zzayz;
        String[] arrayOfString = paramString.split("\\.");
        int j = arrayOfString.length;
        i = 0;
        paramString = localMap1;
        if (i < j)
        {
          localMap1 = arrayOfString[i];
          if (!(paramString instanceof Map)) {
            return null;
          }
          paramString = ((Map)paramString).get(localMap1);
          if (paramString == null) {
            return null;
          }
        }
        else
        {
          return paramString;
        }
      }
      i += 1;
    }
  }
  
  public void push(String paramString, Object paramObject)
  {
    push(zzk(paramString, paramObject));
  }
  
  public void push(Map<String, Object> paramMap)
  {
    try
    {
      this.zzazd.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    zzdi.zzab("DataLayer.push: unexpected InterruptedException");
    zzh(paramMap);
  }
  
  public void pushEvent(String paramString, Map<String, Object> paramMap)
  {
    paramMap = new HashMap(paramMap);
    paramMap.put("event", paramString);
    push(paramMap);
  }
  
  public String toString()
  {
    synchronized (this.zzayz)
    {
      Object localObject1 = new StringBuilder();
      Iterator localIterator = this.zzayz.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        ((StringBuilder)localObject1).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] { localEntry.getKey(), localEntry.getValue() }));
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      return (String)localObject1;
    }
  }
  
  final void zza(zzb paramzzb)
  {
    this.zzayy.put(paramzzb, Integer.valueOf(0));
  }
  
  final void zzcu(String paramString)
  {
    push(paramString, null);
    this.zzazc.zzcw(paramString);
  }
  
  static final class zza
  {
    public final String mKey;
    public final Object mValue;
    
    zza(String paramString, Object paramObject)
    {
      this.mKey = paramString;
      this.mValue = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof zza)) {
        return false;
      }
      paramObject = (zza)paramObject;
      return (this.mKey.equals(((zza)paramObject).mKey)) && (this.mValue.equals(((zza)paramObject).mValue));
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Integer[] { Integer.valueOf(this.mKey.hashCode()), Integer.valueOf(this.mValue.hashCode()) });
    }
    
    public final String toString()
    {
      String str1 = this.mKey;
      String str2 = this.mValue.toString();
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 13 + String.valueOf(str2).length());
      localStringBuilder.append("Key: ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" value: ");
      localStringBuilder.append(str2);
      return localStringBuilder.toString();
    }
  }
  
  static abstract interface zzb
  {
    public abstract void zzf(Map<String, Object> paramMap);
  }
  
  static abstract interface zzc
  {
    public abstract void zza(zzaq paramzzaq);
    
    public abstract void zza(List<DataLayer.zza> paramList, long paramLong);
    
    public abstract void zzcw(String paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/DataLayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */