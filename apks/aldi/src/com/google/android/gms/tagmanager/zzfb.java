package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzacj;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzwg;
import com.google.android.gms.internal.measurement.zzwi;
import com.google.android.gms.internal.measurement.zzwk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
final class zzfb
{
  private static final zzdz<com.google.android.gms.internal.measurement.zzm> zzbcw = new zzdz(zzgj.zzpo(), true);
  private final DataLayer zzaxn;
  private final zzwi zzbcx;
  private final zzbo zzbcy;
  private final Map<String, zzbq> zzbcz;
  private final Map<String, zzbq> zzbda;
  private final Map<String, zzbq> zzbdb;
  private final zzp<zzwg, zzdz<com.google.android.gms.internal.measurement.zzm>> zzbdc;
  private final zzp<String, zzfh> zzbdd;
  private final Set<zzwk> zzbde;
  private final Map<String, zzfi> zzbdf;
  private volatile String zzbdg;
  private int zzbdh;
  
  public zzfb(Context paramContext, zzwi paramzzwi, DataLayer paramDataLayer, zzan paramzzan1, zzan paramzzan2, zzbo paramzzbo)
  {
    if (paramzzwi != null)
    {
      this.zzbcx = paramzzwi;
      this.zzbde = new HashSet(paramzzwi.zzre());
      this.zzaxn = paramDataLayer;
      this.zzbcy = paramzzbo;
      paramzzwi = new zzfc(this);
      new zzq();
      this.zzbdc = zzq.zza(1048576, paramzzwi);
      paramzzwi = new zzfd(this);
      new zzq();
      this.zzbdd = zzq.zza(1048576, paramzzwi);
      this.zzbcz = new HashMap();
      zzb(new zzm(paramContext));
      zzb(new zzam(paramzzan2));
      zzb(new zzaz(paramDataLayer));
      zzb(new zzgk(paramContext, paramDataLayer));
      this.zzbda = new HashMap();
      zzc(new zzak());
      zzc(new zzbl());
      zzc(new zzbm());
      zzc(new zzbs());
      zzc(new zzbt());
      zzc(new zzde());
      zzc(new zzdf());
      zzc(new zzel());
      zzc(new zzfy());
      this.zzbdb = new HashMap();
      zza(new zze(paramContext));
      zza(new zzf(paramContext));
      zza(new zzh(paramContext));
      zza(new zzi(paramContext));
      zza(new zzj(paramContext));
      zza(new zzk(paramContext));
      zza(new zzl(paramContext));
      zza(new zzt());
      zza(new zzaj(this.zzbcx.getVersion()));
      zza(new zzam(paramzzan1));
      zza(new zzas(paramDataLayer));
      zza(new zzbc(paramContext));
      zza(new zzbd());
      zza(new zzbk());
      zza(new zzbp(this));
      zza(new zzbu());
      zza(new zzbv());
      zza(new zzcv(paramContext));
      zza(new zzcx());
      zza(new zzdd());
      zza(new zzdk());
      zza(new zzdm(paramContext));
      zza(new zzea());
      zza(new zzee());
      zza(new zzei());
      zza(new zzek());
      zza(new zzem(paramContext));
      zza(new zzfj());
      zza(new zzfk());
      zza(new zzge());
      zza(new zzgl());
      this.zzbdf = new HashMap();
      paramContext = this.zzbde.iterator();
      while (paramContext.hasNext())
      {
        paramzzwi = (zzwk)paramContext.next();
        int k = 0;
        int i = 0;
        int j;
        for (;;)
        {
          j = k;
          if (i >= paramzzwi.zzsc().size()) {
            break;
          }
          paramDataLayer = (zzwg)paramzzwi.zzsc().get(i);
          paramzzan1 = zzb(this.zzbdf, zza(paramDataLayer));
          paramzzan1.zza(paramzzwi);
          paramzzan1.zza(paramzzwi, paramDataLayer);
          paramzzan1.zza(paramzzwi, "Unknown");
          i += 1;
        }
        while (j < paramzzwi.zzsd().size())
        {
          paramDataLayer = (zzwg)paramzzwi.zzsd().get(j);
          paramzzan1 = zzb(this.zzbdf, zza(paramDataLayer));
          paramzzan1.zza(paramzzwi);
          paramzzan1.zzb(paramzzwi, paramDataLayer);
          paramzzan1.zzb(paramzzwi, "Unknown");
          j += 1;
        }
      }
      paramContext = this.zzbcx.zzsa().entrySet().iterator();
      while (paramContext.hasNext())
      {
        paramzzwi = (Map.Entry)paramContext.next();
        paramDataLayer = ((List)paramzzwi.getValue()).iterator();
        while (paramDataLayer.hasNext())
        {
          paramzzan1 = (zzwg)paramDataLayer.next();
          if (!zzgj.zzg((com.google.android.gms.internal.measurement.zzm)paramzzan1.zzrg().get(zzb.zzjq.toString())).booleanValue()) {
            zzb(this.zzbdf, (String)paramzzwi.getKey()).zzb(paramzzan1);
          }
        }
      }
      return;
    }
    throw new NullPointerException("resource cannot be null");
  }
  
  private final zzdz<com.google.android.gms.internal.measurement.zzm> zza(com.google.android.gms.internal.measurement.zzm paramzzm, Set<String> paramSet, zzgm paramzzgm)
  {
    if (!paramzzm.zzqh) {
      return new zzdz(paramzzm, true);
    }
    int i = paramzzm.type;
    zzdz localzzdz1;
    if (i != 7)
    {
      switch (i)
      {
      default: 
        i = paramzzm.type;
        paramzzm = new StringBuilder(25);
        paramzzm.append("Unknown type: ");
        paramzzm.append(i);
        zzdi.e(paramzzm.toString());
        return zzbcw;
      case 4: 
        if (paramSet.contains(paramzzm.zzqb))
        {
          paramzzm = paramzzm.zzqb;
          paramSet = paramSet.toString();
          paramzzgm = new StringBuilder(String.valueOf(paramzzm).length() + 79 + String.valueOf(paramSet).length());
          paramzzgm.append("Macro cycle detected.  Current macro reference: ");
          paramzzgm.append(paramzzm);
          paramzzgm.append(".  Previous macro references: ");
          paramzzgm.append(paramSet);
          paramzzgm.append(".");
          zzdi.e(paramzzgm.toString());
          return zzbcw;
        }
        paramSet.add(paramzzm.zzqb);
        paramzzgm = zzgn.zza(zza(paramzzm.zzqb, paramSet, paramzzgm.zzof()), paramzzm.zzqg);
        paramSet.remove(paramzzm.zzqb);
        return paramzzgm;
      case 3: 
        localzzm = zzwe.zzk(paramzzm);
        if (paramzzm.zzpz.length != paramzzm.zzqa.length)
        {
          paramzzm = String.valueOf(paramzzm.toString());
          if (paramzzm.length() != 0) {
            paramzzm = "Invalid serving value: ".concat(paramzzm);
          } else {
            paramzzm = new String("Invalid serving value: ");
          }
          zzdi.e(paramzzm);
          return zzbcw;
        }
        localzzm.zzpz = new com.google.android.gms.internal.measurement.zzm[paramzzm.zzpz.length];
        localzzm.zzqa = new com.google.android.gms.internal.measurement.zzm[paramzzm.zzpz.length];
        i = 0;
        while (i < paramzzm.zzpz.length)
        {
          localzzdz1 = zza(paramzzm.zzpz[i], paramSet, paramzzgm.zzu(i));
          zzdz localzzdz2 = zza(paramzzm.zzqa[i], paramSet, paramzzgm.zzv(i));
          if ((localzzdz1 != zzbcw) && (localzzdz2 != zzbcw))
          {
            localzzm.zzpz[i] = ((com.google.android.gms.internal.measurement.zzm)localzzdz1.getObject());
            localzzm.zzqa[i] = ((com.google.android.gms.internal.measurement.zzm)localzzdz2.getObject());
            i += 1;
          }
          else
          {
            return zzbcw;
          }
        }
        return new zzdz(localzzm, false);
      }
      localzzm = zzwe.zzk(paramzzm);
      localzzm.zzpy = new com.google.android.gms.internal.measurement.zzm[paramzzm.zzpy.length];
      i = 0;
      while (i < paramzzm.zzpy.length)
      {
        localzzdz1 = zza(paramzzm.zzpy[i], paramSet, paramzzgm.zzt(i));
        if (localzzdz1 == zzbcw) {
          return zzbcw;
        }
        localzzm.zzpy[i] = ((com.google.android.gms.internal.measurement.zzm)localzzdz1.getObject());
        i += 1;
      }
      return new zzdz(localzzm, false);
    }
    com.google.android.gms.internal.measurement.zzm localzzm = zzwe.zzk(paramzzm);
    localzzm.zzqf = new com.google.android.gms.internal.measurement.zzm[paramzzm.zzqf.length];
    i = 0;
    while (i < paramzzm.zzqf.length)
    {
      localzzdz1 = zza(paramzzm.zzqf[i], paramSet, paramzzgm.zzw(i));
      if (localzzdz1 == zzbcw) {
        return zzbcw;
      }
      localzzm.zzqf[i] = ((com.google.android.gms.internal.measurement.zzm)localzzdz1.getObject());
      i += 1;
    }
    return new zzdz(localzzm, false);
  }
  
  @VisibleForTesting
  private final zzdz<Boolean> zza(zzwg paramzzwg, Set<String> paramSet, zzen paramzzen)
  {
    paramzzwg = zza(this.zzbda, paramzzwg, paramSet, paramzzen);
    paramSet = zzgj.zzg((com.google.android.gms.internal.measurement.zzm)paramzzwg.getObject());
    paramzzen.zza(zzgj.zzj(paramSet));
    return new zzdz(paramSet, paramzzwg.zzog());
  }
  
  private final zzdz<com.google.android.gms.internal.measurement.zzm> zza(String paramString, Set<String> paramSet, zzdl paramzzdl)
  {
    this.zzbdh += 1;
    Object localObject1 = (zzfh)this.zzbdd.get(paramString);
    if (localObject1 != null)
    {
      this.zzbcy.zznr();
      zza(((zzfh)localObject1).zzou(), paramSet);
      this.zzbdh -= 1;
      return ((zzfh)localObject1).zzot();
    }
    localObject1 = (zzfi)this.zzbdf.get(paramString);
    if (localObject1 == null)
    {
      paramSet = zzos();
      paramzzdl = new StringBuilder(String.valueOf(paramSet).length() + 15 + String.valueOf(paramString).length());
      paramzzdl.append(paramSet);
      paramzzdl.append("Invalid macro: ");
      paramzzdl.append(paramString);
      zzdi.e(paramzzdl.toString());
      this.zzbdh -= 1;
      return zzbcw;
    }
    Object localObject2 = ((zzfi)localObject1).zzov();
    Object localObject3 = ((zzfi)localObject1).zzow();
    Map localMap1 = ((zzfi)localObject1).zzox();
    Map localMap2 = ((zzfi)localObject1).zzoz();
    Map localMap3 = ((zzfi)localObject1).zzoy();
    zzfa localzzfa = paramzzdl.zznf();
    localObject2 = zza((Set)localObject2, paramSet, new zzfe(this, (Map)localObject3, localMap1, localMap2, localMap3), localzzfa);
    if (((Set)((zzdz)localObject2).getObject()).isEmpty())
    {
      localObject1 = ((zzfi)localObject1).zzpa();
    }
    else
    {
      if (((Set)((zzdz)localObject2).getObject()).size() > 1)
      {
        localObject1 = zzos();
        localObject3 = new StringBuilder(String.valueOf(localObject1).length() + 37 + String.valueOf(paramString).length());
        ((StringBuilder)localObject3).append((String)localObject1);
        ((StringBuilder)localObject3).append("Multiple macros active for macroName ");
        ((StringBuilder)localObject3).append(paramString);
        zzdi.zzab(((StringBuilder)localObject3).toString());
      }
      localObject1 = (zzwg)((Set)((zzdz)localObject2).getObject()).iterator().next();
    }
    if (localObject1 == null)
    {
      this.zzbdh -= 1;
      return zzbcw;
    }
    paramzzdl = zza(this.zzbdb, (zzwg)localObject1, paramSet, paramzzdl.zznx());
    boolean bool;
    if ((((zzdz)localObject2).zzog()) && (paramzzdl.zzog())) {
      bool = true;
    } else {
      bool = false;
    }
    if (paramzzdl == zzbcw) {
      paramzzdl = zzbcw;
    } else {
      paramzzdl = new zzdz((com.google.android.gms.internal.measurement.zzm)paramzzdl.getObject(), bool);
    }
    localObject1 = ((zzwg)localObject1).zzou();
    if (paramzzdl.zzog()) {
      this.zzbdd.zza(paramString, new zzfh(paramzzdl, (com.google.android.gms.internal.measurement.zzm)localObject1));
    }
    zza((com.google.android.gms.internal.measurement.zzm)localObject1, paramSet);
    this.zzbdh -= 1;
    return paramzzdl;
  }
  
  private final zzdz<com.google.android.gms.internal.measurement.zzm> zza(Map<String, zzbq> paramMap, zzwg paramzzwg, Set<String> paramSet, zzen paramzzen)
  {
    Object localObject1 = (com.google.android.gms.internal.measurement.zzm)paramzzwg.zzrg().get(zzb.zzhz.toString());
    if (localObject1 == null) {
      paramMap = "No function id in properties";
    }
    Object localObject2;
    boolean bool;
    int i;
    for (;;)
    {
      zzdi.e(paramMap);
      return zzbcw;
      localObject1 = ((com.google.android.gms.internal.measurement.zzm)localObject1).zzqc;
      paramMap = (zzbq)paramMap.get(localObject1);
      if (paramMap == null)
      {
        paramMap = String.valueOf(localObject1).concat(" has no backing implementation.");
      }
      else
      {
        localObject2 = (zzdz)this.zzbdc.get(paramzzwg);
        if (localObject2 != null)
        {
          this.zzbcy.zznr();
          return (zzdz<com.google.android.gms.internal.measurement.zzm>)localObject2;
        }
        localObject2 = new HashMap();
        Iterator localIterator = paramzzwg.zzrg().entrySet().iterator();
        bool = true;
        i = 1;
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          Object localObject3 = paramzzen.zzdj((String)localEntry.getKey());
          localObject3 = zza((com.google.android.gms.internal.measurement.zzm)localEntry.getValue(), paramSet, ((zzep)localObject3).zzb((com.google.android.gms.internal.measurement.zzm)localEntry.getValue()));
          if (localObject3 == zzbcw) {
            return zzbcw;
          }
          if (((zzdz)localObject3).zzog()) {
            paramzzwg.zza((String)localEntry.getKey(), (com.google.android.gms.internal.measurement.zzm)((zzdz)localObject3).getObject());
          } else {
            i = 0;
          }
          ((Map)localObject2).put((String)localEntry.getKey(), (com.google.android.gms.internal.measurement.zzm)((zzdz)localObject3).getObject());
        }
        if (paramMap.zza(((Map)localObject2).keySet())) {
          break;
        }
        paramMap = String.valueOf(paramMap.zznt());
        paramzzwg = String.valueOf(((Map)localObject2).keySet());
        paramSet = new StringBuilder(String.valueOf(localObject1).length() + 43 + String.valueOf(paramMap).length() + String.valueOf(paramzzwg).length());
        paramSet.append("Incorrect keys for function ");
        paramSet.append((String)localObject1);
        paramSet.append(" required ");
        paramSet.append(paramMap);
        paramSet.append(" had ");
        paramSet.append(paramzzwg);
        paramMap = paramSet.toString();
      }
    }
    if ((i == 0) || (!paramMap.zzmj())) {
      bool = false;
    }
    paramMap = new zzdz(paramMap.zze((Map)localObject2), bool);
    if (bool) {
      this.zzbdc.zza(paramzzwg, paramMap);
    }
    paramzzen.zza((com.google.android.gms.internal.measurement.zzm)paramMap.getObject());
    return paramMap;
  }
  
  private final zzdz<Set<zzwg>> zza(Set<zzwk> paramSet, Set<String> paramSet1, zzfg paramzzfg, zzfa paramzzfa)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet.iterator();
    for (boolean bool2 = true;; bool2 = false)
    {
      if (!localIterator.hasNext()) {
        break label344;
      }
      zzwk localzzwk = (zzwk)localIterator.next();
      zzeq localzzeq = paramzzfa.zzoe();
      paramSet = localzzwk.zzrj().iterator();
      zzdz localzzdz;
      for (boolean bool1 = true;; bool1 = false)
      {
        if (!paramSet.hasNext()) {
          break label168;
        }
        localzzdz = zza((zzwg)paramSet.next(), paramSet1, localzzeq.zzny());
        if (((Boolean)localzzdz.getObject()).booleanValue())
        {
          zzgj.zzj(Boolean.FALSE);
          paramSet = new zzdz(Boolean.FALSE, localzzdz.zzog());
          break label296;
        }
        if ((bool1) && (localzzdz.zzog())) {
          break;
        }
      }
      label168:
      paramSet = localzzwk.zzri().iterator();
      while (paramSet.hasNext())
      {
        localzzdz = zza((zzwg)paramSet.next(), paramSet1, localzzeq.zznz());
        if (!((Boolean)localzzdz.getObject()).booleanValue())
        {
          zzgj.zzj(Boolean.FALSE);
          paramSet = new zzdz(Boolean.FALSE, localzzdz.zzog());
          break label296;
        }
        if ((bool1) && (localzzdz.zzog())) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
      zzgj.zzj(Boolean.TRUE);
      paramSet = new zzdz(Boolean.TRUE, bool1);
      label296:
      if (((Boolean)paramSet.getObject()).booleanValue()) {
        paramzzfg.zza(localzzwk, localHashSet1, localHashSet2, localzzeq);
      }
      if ((bool2) && (paramSet.zzog())) {
        break;
      }
    }
    label344:
    localHashSet1.removeAll(localHashSet2);
    paramzzfa.zzb(localHashSet1);
    return new zzdz(localHashSet1, bool2);
  }
  
  private static String zza(zzwg paramzzwg)
  {
    return zzgj.zzc((com.google.android.gms.internal.measurement.zzm)paramzzwg.zzrg().get(zzb.zzil.toString()));
  }
  
  private final void zza(com.google.android.gms.internal.measurement.zzm paramzzm, Set<String> paramSet)
  {
    if (paramzzm == null) {
      return;
    }
    paramzzm = zza(paramzzm, paramSet, new zzdx());
    if (paramzzm == zzbcw) {
      return;
    }
    paramzzm = zzgj.zzh((com.google.android.gms.internal.measurement.zzm)paramzzm.getObject());
    if ((paramzzm instanceof Map))
    {
      paramzzm = (Map)paramzzm;
      this.zzaxn.push(paramzzm);
      return;
    }
    if ((paramzzm instanceof List))
    {
      paramzzm = ((List)paramzzm).iterator();
      while (paramzzm.hasNext())
      {
        paramSet = paramzzm.next();
        if ((paramSet instanceof Map))
        {
          paramSet = (Map)paramSet;
          this.zzaxn.push(paramSet);
        }
        else
        {
          zzdi.zzab("pushAfterEvaluate: value not a Map");
        }
      }
      return;
    }
    zzdi.zzab("pushAfterEvaluate: value not a Map or List");
  }
  
  @VisibleForTesting
  private final void zza(zzbq paramzzbq)
  {
    zza(this.zzbdb, paramzzbq);
  }
  
  private static void zza(Map<String, zzbq> paramMap, zzbq paramzzbq)
  {
    if (paramMap.containsKey(paramzzbq.zzns()))
    {
      paramMap = String.valueOf(paramzzbq.zzns());
      if (paramMap.length() != 0) {
        paramMap = "Duplicate function type name: ".concat(paramMap);
      } else {
        paramMap = new String("Duplicate function type name: ");
      }
      throw new IllegalArgumentException(paramMap);
    }
    paramMap.put(paramzzbq.zzns(), paramzzbq);
  }
  
  private static zzfi zzb(Map<String, zzfi> paramMap, String paramString)
  {
    zzfi localzzfi2 = (zzfi)paramMap.get(paramString);
    zzfi localzzfi1 = localzzfi2;
    if (localzzfi2 == null)
    {
      localzzfi1 = new zzfi();
      paramMap.put(paramString, localzzfi1);
    }
    return localzzfi1;
  }
  
  @VisibleForTesting
  private final void zzb(zzbq paramzzbq)
  {
    zza(this.zzbcz, paramzzbq);
  }
  
  @VisibleForTesting
  private final void zzc(zzbq paramzzbq)
  {
    zza(this.zzbda, paramzzbq);
  }
  
  @VisibleForTesting
  private final void zzdn(String paramString)
  {
    try
    {
      this.zzbdg = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private final String zzos()
  {
    if (this.zzbdh <= 1) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Integer.toString(this.zzbdh));
    int i = 2;
    while (i < this.zzbdh)
    {
      localStringBuilder.append(' ');
      i += 1;
    }
    localStringBuilder.append(": ");
    return localStringBuilder.toString();
  }
  
  public final void zzcr(String paramString)
  {
    try
    {
      zzdn(paramString);
      paramString = this.zzbcy.zzdd(paramString).zznq();
      Object localObject1 = this.zzbde;
      Object localObject2 = paramString.zznf();
      localObject1 = ((Set)zza((Set)localObject1, new HashSet(), new zzff(this), (zzfa)localObject2).getObject()).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zzwg)((Iterator)localObject1).next();
        zza(this.zzbcz, (zzwg)localObject2, new HashSet(), paramString.zzne());
      }
      zzdn(null);
      return;
    }
    finally {}
  }
  
  public final zzdz<com.google.android.gms.internal.measurement.zzm> zzdm(String paramString)
  {
    this.zzbdh = 0;
    zzbn localzzbn = this.zzbcy.zzdc(paramString);
    return zza(paramString, new HashSet(), localzzbn.zznp());
  }
  
  public final void zzf(List<com.google.android.gms.internal.measurement.zzk> paramList)
  {
    for (;;)
    {
      int i;
      try
      {
        Iterator localIterator = paramList.iterator();
        if (localIterator.hasNext())
        {
          Object localObject1 = (com.google.android.gms.internal.measurement.zzk)localIterator.next();
          if ((((com.google.android.gms.internal.measurement.zzk)localObject1).name != null) && (((com.google.android.gms.internal.measurement.zzk)localObject1).name.startsWith("gaExperiment:")))
          {
            DataLayer localDataLayer = this.zzaxn;
            if (((com.google.android.gms.internal.measurement.zzk)localObject1).zzpt == null)
            {
              zzdi.zzab("supplemental missing experimentSupplemental");
              continue;
            }
            paramList = ((com.google.android.gms.internal.measurement.zzk)localObject1).zzpt.zzoe;
            int j = paramList.length;
            i = 0;
            if (i < j)
            {
              localDataLayer.zzcu(zzgj.zzc(paramList[i]));
              i += 1;
              continue;
            }
            Object localObject2 = ((com.google.android.gms.internal.measurement.zzk)localObject1).zzpt.zzod;
            j = localObject2.length;
            i = 0;
            paramList = null;
            Object localObject3;
            if (i < j)
            {
              localObject3 = zzgj.zzh(localObject2[i]);
              if (!(localObject3 instanceof Map))
              {
                localObject3 = String.valueOf(localObject3);
                StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject3).length() + 36);
                localStringBuilder.append("value: ");
                localStringBuilder.append((String)localObject3);
                localStringBuilder.append(" is not a map value, ignored.");
                zzdi.zzab(localStringBuilder.toString());
              }
              else
              {
                paramList = (Map)localObject3;
              }
              if (paramList != null) {
                localDataLayer.push(paramList);
              }
            }
            else
            {
              localObject2 = ((com.google.android.gms.internal.measurement.zzk)localObject1).zzpt.zzof;
              j = localObject2.length;
              i = 0;
              if (i >= j) {
                continue;
              }
              localObject3 = localObject2[i];
              if (((com.google.android.gms.internal.measurement.zzf)localObject3).zzny == null)
              {
                paramList = "GaExperimentRandom: No key";
                zzdi.zzab(paramList);
                break label653;
              }
              localObject1 = localDataLayer.get(((com.google.android.gms.internal.measurement.zzf)localObject3).zzny);
              if (!(localObject1 instanceof Number)) {
                paramList = null;
              } else {
                paramList = Long.valueOf(((Number)localObject1).longValue());
              }
              long l1 = ((com.google.android.gms.internal.measurement.zzf)localObject3).zznz;
              long l2 = ((com.google.android.gms.internal.measurement.zzf)localObject3).zzoa;
              if ((!((com.google.android.gms.internal.measurement.zzf)localObject3).zzob) || (paramList == null) || (paramList.longValue() < l1) || (paramList.longValue() > l2))
              {
                if (l1 > l2) {
                  break label646;
                }
                double d1 = Math.random();
                double d2 = l2 - l1;
                Double.isNaN(d2);
                double d3 = l1;
                Double.isNaN(d3);
                localObject1 = Long.valueOf(Math.round(d1 * d2 + d3));
              }
              localDataLayer.zzcu(((com.google.android.gms.internal.measurement.zzf)localObject3).zzny);
              paramList = DataLayer.zzk(((com.google.android.gms.internal.measurement.zzf)localObject3).zzny, localObject1);
              if (((com.google.android.gms.internal.measurement.zzf)localObject3).zzoc > 0L) {
                if (!paramList.containsKey("gtm"))
                {
                  paramList.put("gtm", DataLayer.mapOf(new Object[] { "lifetime", Long.valueOf(((com.google.android.gms.internal.measurement.zzf)localObject3).zzoc) }));
                }
                else
                {
                  localObject1 = paramList.get("gtm");
                  if ((localObject1 instanceof Map)) {
                    ((Map)localObject1).put("lifetime", Long.valueOf(((com.google.android.gms.internal.measurement.zzf)localObject3).zzoc));
                  } else {
                    zzdi.zzab("GaExperimentRandom: gtm not a map");
                  }
                }
              }
              localDataLayer.push(paramList);
              break label653;
            }
          }
          else
          {
            paramList = String.valueOf(localObject1);
            localObject1 = new StringBuilder(String.valueOf(paramList).length() + 22);
            ((StringBuilder)localObject1).append("Ignored supplemental: ");
            ((StringBuilder)localObject1).append(paramList);
            zzdi.v(((StringBuilder)localObject1).toString());
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      i += 1;
      continue;
      label646:
      paramList = "GaExperimentRandom: random range invalid";
      continue;
      label653:
      i += 1;
    }
  }
  
  final String zzor()
  {
    try
    {
      String str = this.zzbdg;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/tagmanager/zzfb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */