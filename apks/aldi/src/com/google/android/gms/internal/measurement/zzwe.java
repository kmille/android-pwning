package com.google.android.gms.internal.measurement;

import com.google.android.gms.tagmanager.zzdi;
import com.google.android.gms.tagmanager.zzgj;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zzwe
{
  private static zzm zza(int paramInt, zzi paramzzi, zzm[] paramArrayOfzzm, Set<Integer> paramSet)
    throws zzwm
  {
    if (paramSet.contains(Integer.valueOf(paramInt)))
    {
      localObject1 = String.valueOf(paramSet);
      localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 90);
      ((StringBuilder)localObject2).append("Value cycle detected.  Current value reference: ");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append(".  Previous value references: ");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(".");
      zzei(((StringBuilder)localObject2).toString());
    }
    Object localObject2 = (zzm)zza(paramzzi.zzoj, paramInt, "values");
    if (paramArrayOfzzm[paramInt] != null) {
      return paramArrayOfzzm[paramInt];
    }
    Object localObject1 = null;
    paramSet.add(Integer.valueOf(paramInt));
    int i = ((zzm)localObject2).type;
    int k = 0;
    int m = 0;
    int j = 0;
    Object localObject3;
    Object localObject4;
    switch (i)
    {
    default: 
      break;
    case 7: 
      localObject3 = zzk((zzm)localObject2);
      localObject1 = zzl((zzm)localObject2);
      ((zzm)localObject3).zzqf = new zzm[((zzc.zza)localObject1).zzpo.length];
      localObject4 = ((zzc.zza)localObject1).zzpo;
      k = localObject4.length;
      i = 0;
      for (;;)
      {
        localObject1 = localObject3;
        if (j >= k) {
          break;
        }
        m = localObject4[j];
        ((zzm)localObject3).zzqf[i] = zza(m, paramzzi, paramArrayOfzzm, paramSet);
        j += 1;
        i += 1;
      }
    case 4: 
      localObject1 = zzk((zzm)localObject2);
      ((zzm)localObject1).zzqb = zzgj.zzc(zza(zzl((zzm)localObject2).zzpp, paramzzi, paramArrayOfzzm, paramSet));
      break;
    case 3: 
      localObject3 = zzk((zzm)localObject2);
      localObject1 = zzl((zzm)localObject2);
      if (((zzc.zza)localObject1).zzpl.length != ((zzc.zza)localObject1).zzpm.length)
      {
        i = ((zzc.zza)localObject1).zzpl.length;
        j = ((zzc.zza)localObject1).zzpm.length;
        localObject4 = new StringBuilder(58);
        ((StringBuilder)localObject4).append("Uneven map keys (");
        ((StringBuilder)localObject4).append(i);
        ((StringBuilder)localObject4).append(") and map values (");
        ((StringBuilder)localObject4).append(j);
        ((StringBuilder)localObject4).append(")");
        zzei(((StringBuilder)localObject4).toString());
      }
      ((zzm)localObject3).zzpz = new zzm[((zzc.zza)localObject1).zzpl.length];
      ((zzm)localObject3).zzqa = new zzm[((zzc.zza)localObject1).zzpl.length];
      localObject4 = ((zzc.zza)localObject1).zzpl;
      m = localObject4.length;
      j = 0;
      i = 0;
      while (j < m)
      {
        int n = localObject4[j];
        ((zzm)localObject3).zzpz[i] = zza(n, paramzzi, paramArrayOfzzm, paramSet);
        j += 1;
        i += 1;
      }
      localObject4 = ((zzc.zza)localObject1).zzpm;
      m = localObject4.length;
      i = 0;
      j = k;
      for (;;)
      {
        localObject1 = localObject3;
        if (j >= m) {
          break;
        }
        k = localObject4[j];
        ((zzm)localObject3).zzqa[i] = zza(k, paramzzi, paramArrayOfzzm, paramSet);
        j += 1;
        i += 1;
      }
    case 2: 
      localObject3 = zzl((zzm)localObject2);
      localObject1 = zzk((zzm)localObject2);
      ((zzm)localObject1).zzpy = new zzm[((zzc.zza)localObject3).zzpk.length];
      localObject3 = ((zzc.zza)localObject3).zzpk;
      k = localObject3.length;
      i = 0;
      j = m;
    }
    for (;;)
    {
      if (j < k)
      {
        m = localObject3[j];
        localObject4 = ((zzm)localObject1).zzpy;
      }
      try
      {
        zzm localzzm = zza(m, paramzzi, paramArrayOfzzm, paramSet);
        localObject4[i] = localzzm;
        j += 1;
        i += 1;
      }
      catch (Throwable paramzzi)
      {
        throw paramzzi;
      }
    }
    break label685;
    localObject1 = localObject2;
    label685:
    if (localObject1 == null)
    {
      paramzzi = String.valueOf(localObject2);
      localObject2 = new StringBuilder(String.valueOf(paramzzi).length() + 15);
      ((StringBuilder)localObject2).append("Invalid value: ");
      ((StringBuilder)localObject2).append(paramzzi);
      zzei(((StringBuilder)localObject2).toString());
    }
    paramArrayOfzzm[paramInt] = localObject1;
    paramSet.remove(Integer.valueOf(paramInt));
    return (zzm)localObject1;
  }
  
  private static zzwg zza(zze paramzze, zzi paramzzi, zzm[] paramArrayOfzzm, int paramInt)
    throws zzwm
  {
    zzwh localzzwh = zzwg.zzrx();
    paramzze = paramzze.zznt;
    int i = paramzze.length;
    paramInt = 0;
    while (paramInt < i)
    {
      int j = paramzze[paramInt];
      Object localObject = (zzh)zza(paramzzi.zzok, Integer.valueOf(j).intValue(), "properties");
      String str = (String)zza(paramzzi.zzoi, ((zzh)localObject).key, "keys");
      localObject = (zzm)zza(paramArrayOfzzm, ((zzh)localObject).value, "values");
      if (zzb.zzks.toString().equals(str)) {
        localzzwh.zzm((zzm)localObject);
      } else {
        localzzwh.zzb(str, (zzm)localObject);
      }
      paramInt += 1;
    }
    return localzzwh.zzry();
  }
  
  public static zzwi zza(zzi paramzzi)
    throws zzwm
  {
    Object localObject1 = new zzm[paramzzi.zzoj.length];
    int i = 0;
    while (i < paramzzi.zzoj.length)
    {
      zza(i, paramzzi, (zzm[])localObject1, new HashSet(0));
      i += 1;
    }
    zzwj localzzwj = zzwi.zzrz();
    ArrayList localArrayList1 = new ArrayList();
    i = 0;
    while (i < paramzzi.zzom.length)
    {
      localArrayList1.add(zza(paramzzi.zzom[i], paramzzi, (zzm[])localObject1, i));
      i += 1;
    }
    ArrayList localArrayList2 = new ArrayList();
    i = 0;
    while (i < paramzzi.zzon.length)
    {
      localArrayList2.add(zza(paramzzi.zzon[i], paramzzi, (zzm[])localObject1, i));
      i += 1;
    }
    ArrayList localArrayList3 = new ArrayList();
    i = 0;
    Object localObject2;
    while (i < paramzzi.zzol.length)
    {
      localObject2 = zza(paramzzi.zzol[i], paramzzi, (zzm[])localObject1, i);
      localzzwj.zzc((zzwg)localObject2);
      localArrayList3.add(localObject2);
      i += 1;
    }
    localObject1 = paramzzi.zzoo;
    int k = localObject1.length;
    i = 0;
    while (i < k)
    {
      int[] arrayOfInt1 = localObject1[i];
      localObject2 = new zzwl(null);
      int[] arrayOfInt2 = arrayOfInt1.zzoy;
      int m = arrayOfInt2.length;
      int j = 0;
      while (j < m)
      {
        ((zzwl)localObject2).zzd((zzwg)localArrayList2.get(Integer.valueOf(arrayOfInt2[j]).intValue()));
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzoz;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        ((zzwl)localObject2).zze((zzwg)localArrayList2.get(Integer.valueOf(arrayOfInt2[j]).intValue()));
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpa;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        ((zzwl)localObject2).zzf((zzwg)localArrayList1.get(Integer.valueOf(arrayOfInt2[j]).intValue()));
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpc;
      m = arrayOfInt2.length;
      j = 0;
      int n;
      while (j < m)
      {
        n = arrayOfInt2[j];
        ((zzwl)localObject2).zzew(paramzzi.zzoj[Integer.valueOf(n).intValue()].string);
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpb;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        ((zzwl)localObject2).zzg((zzwg)localArrayList1.get(Integer.valueOf(arrayOfInt2[j]).intValue()));
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpd;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        n = arrayOfInt2[j];
        ((zzwl)localObject2).zzex(paramzzi.zzoj[Integer.valueOf(n).intValue()].string);
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpe;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        ((zzwl)localObject2).zzh((zzwg)localArrayList3.get(Integer.valueOf(arrayOfInt2[j]).intValue()));
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpg;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        n = arrayOfInt2[j];
        ((zzwl)localObject2).zzey(paramzzi.zzoj[Integer.valueOf(n).intValue()].string);
        j += 1;
      }
      arrayOfInt2 = arrayOfInt1.zzpf;
      m = arrayOfInt2.length;
      j = 0;
      while (j < m)
      {
        ((zzwl)localObject2).zzi((zzwg)localArrayList3.get(Integer.valueOf(arrayOfInt2[j]).intValue()));
        j += 1;
      }
      arrayOfInt1 = arrayOfInt1.zzph;
      m = arrayOfInt1.length;
      j = 0;
      while (j < m)
      {
        n = arrayOfInt1[j];
        ((zzwl)localObject2).zzez(paramzzi.zzoj[Integer.valueOf(n).intValue()].string);
        j += 1;
      }
      localzzwj.zzb(((zzwl)localObject2).zzse());
      i += 1;
    }
    localzzwj.zzev(paramzzi.version);
    localzzwj.zzad(paramzzi.zzow);
    return localzzwj.zzsb();
  }
  
  private static <T> T zza(T[] paramArrayOfT, int paramInt, String paramString)
    throws zzwm
  {
    if ((paramInt < 0) || (paramInt >= paramArrayOfT.length))
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 45);
      localStringBuilder.append("Index out of bounds detected: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" in ");
      localStringBuilder.append(paramString);
      zzei(localStringBuilder.toString());
    }
    return paramArrayOfT[paramInt];
  }
  
  public static void zza(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        return;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  private static void zzei(String paramString)
    throws zzwm
  {
    zzdi.e(paramString);
    throw new zzwm(paramString);
  }
  
  public static zzm zzk(zzm paramzzm)
  {
    zzm localzzm = new zzm();
    localzzm.type = paramzzm.type;
    localzzm.zzqg = ((int[])paramzzm.zzqg.clone());
    if (paramzzm.zzqh) {
      localzzm.zzqh = paramzzm.zzqh;
    }
    return localzzm;
  }
  
  private static zzc.zza zzl(zzm paramzzm)
    throws zzwm
  {
    if ((zzc.zza)paramzzm.zza(zzc.zza.zzpi) == null)
    {
      String str = String.valueOf(paramzzm);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 54);
      localStringBuilder.append("Expected a ServingValue and didn't get one. Value is: ");
      localStringBuilder.append(str);
      zzei(localStringBuilder.toString());
    }
    return (zzc.zza)paramzzm.zza(zzc.zza.zzpi);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzwe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */