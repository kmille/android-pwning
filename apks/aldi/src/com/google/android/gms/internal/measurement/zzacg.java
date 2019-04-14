package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzacg
  implements Cloneable
{
  private Object value;
  private zzace<?, ?> zzbzl;
  private List<zzacl> zzbzm = new ArrayList();
  
  private final byte[] toByteArray()
    throws IOException
  {
    byte[] arrayOfByte = new byte[zza()];
    zza(zzacb.zzj(arrayOfByte));
    return arrayOfByte;
  }
  
  private final zzacg zzvv()
  {
    zzacg localzzacg = new zzacg();
    try
    {
      localzzacg.zzbzl = this.zzbzl;
      if (this.zzbzm == null) {
        localzzacg.zzbzm = null;
      } else {
        localzzacg.zzbzm.addAll(this.zzbzm);
      }
      if (this.value != null)
      {
        Object localObject1;
        if ((this.value instanceof zzacj)) {
          localObject1 = (zzacj)((zzacj)this.value).clone();
        }
        int j;
        int i;
        Object localObject2;
        for (;;)
        {
          localzzacg.value = localObject1;
          return localzzacg;
          if ((this.value instanceof byte[]))
          {
            localObject1 = ((byte[])this.value).clone();
          }
          else
          {
            boolean bool = this.value instanceof byte[][];
            j = 0;
            i = 0;
            if (bool)
            {
              localObject1 = (byte[][])this.value;
              localObject2 = new byte[localObject1.length][];
              localzzacg.value = localObject2;
              while (i < localObject1.length)
              {
                localObject2[i] = ((byte[])localObject1[i].clone());
                i += 1;
              }
            }
            if ((this.value instanceof boolean[]))
            {
              localObject1 = ((boolean[])this.value).clone();
            }
            else if ((this.value instanceof int[]))
            {
              localObject1 = ((int[])this.value).clone();
            }
            else if ((this.value instanceof long[]))
            {
              localObject1 = ((long[])this.value).clone();
            }
            else if ((this.value instanceof float[]))
            {
              localObject1 = ((float[])this.value).clone();
            }
            else
            {
              if (!(this.value instanceof double[])) {
                break;
              }
              localObject1 = ((double[])this.value).clone();
            }
          }
        }
        if ((this.value instanceof zzacj[]))
        {
          localObject1 = (zzacj[])this.value;
          localObject2 = new zzacj[localObject1.length];
          localzzacg.value = localObject2;
          i = j;
          while (i < localObject1.length)
          {
            localObject2[i] = ((zzacj)localObject1[i].clone());
            i += 1;
          }
        }
      }
      return localzzacg;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzacg)) {
      return false;
    }
    paramObject = (zzacg)paramObject;
    if ((this.value != null) && (((zzacg)paramObject).value != null))
    {
      if (this.zzbzl != ((zzacg)paramObject).zzbzl) {
        return false;
      }
      if (!this.zzbzl.zzbze.isArray()) {
        return this.value.equals(((zzacg)paramObject).value);
      }
      if ((this.value instanceof byte[])) {
        return Arrays.equals((byte[])this.value, (byte[])((zzacg)paramObject).value);
      }
      if ((this.value instanceof int[])) {
        return Arrays.equals((int[])this.value, (int[])((zzacg)paramObject).value);
      }
      if ((this.value instanceof long[])) {
        return Arrays.equals((long[])this.value, (long[])((zzacg)paramObject).value);
      }
      if ((this.value instanceof float[])) {
        return Arrays.equals((float[])this.value, (float[])((zzacg)paramObject).value);
      }
      if ((this.value instanceof double[])) {
        return Arrays.equals((double[])this.value, (double[])((zzacg)paramObject).value);
      }
      if ((this.value instanceof boolean[])) {
        return Arrays.equals((boolean[])this.value, (boolean[])((zzacg)paramObject).value);
      }
      return Arrays.deepEquals((Object[])this.value, (Object[])((zzacg)paramObject).value);
    }
    if ((this.zzbzm != null) && (((zzacg)paramObject).zzbzm != null)) {
      return this.zzbzm.equals(((zzacg)paramObject).zzbzm);
    }
    try
    {
      boolean bool = Arrays.equals(toByteArray(), ((zzacg)paramObject).toByteArray());
      return bool;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(toByteArray());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  final int zza()
  {
    Object localObject1 = this.value;
    int j = 0;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject1 = this.zzbzl;
      localObject2 = this.value;
      if (((zzace)localObject1).zzbzf)
      {
        int m = Array.getLength(localObject2);
        for (i = 0;; i = k)
        {
          k = i;
          if (j >= m) {
            break;
          }
          k = i;
          if (Array.get(localObject2, j) != null) {
            k = i + ((zzace)localObject1).zzv(Array.get(localObject2, j));
          }
          j += 1;
        }
      }
      return ((zzace)localObject1).zzv(localObject2);
    }
    localObject1 = this.zzbzm.iterator();
    int i = 0;
    for (;;)
    {
      k = i;
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      localObject2 = (zzacl)((Iterator)localObject1).next();
      i += zzacb.zzas(((zzacl)localObject2).tag) + 0 + ((zzacl)localObject2).zzbtj.length;
    }
    return k;
  }
  
  final void zza(zzacb paramzzacb)
    throws IOException
  {
    Object localObject2;
    if (this.value != null)
    {
      localObject1 = this.zzbzl;
      localObject2 = this.value;
      if (((zzace)localObject1).zzbzf)
      {
        int j = Array.getLength(localObject2);
        int i = 0;
        while (i < j)
        {
          Object localObject3 = Array.get(localObject2, i);
          if (localObject3 != null) {
            ((zzace)localObject1).zza(localObject3, paramzzacb);
          }
          i += 1;
        }
        return;
      }
      ((zzace)localObject1).zza(localObject2, paramzzacb);
      return;
    }
    Object localObject1 = this.zzbzm.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zzacl)((Iterator)localObject1).next();
      paramzzacb.zzar(((zzacl)localObject2).tag);
      paramzzacb.zzk(((zzacl)localObject2).zzbtj);
    }
  }
  
  final void zza(zzacl paramzzacl)
    throws IOException
  {
    if (this.zzbzm != null)
    {
      this.zzbzm.add(paramzzacl);
      return;
    }
    Object localObject;
    if ((this.value instanceof zzacj))
    {
      paramzzacl = paramzzacl.zzbtj;
      localObject = zzaca.zza(paramzzacl, 0, paramzzacl.length);
      int i = ((zzaca)localObject).zzvn();
      if (i == paramzzacl.length - zzacb.zzao(i)) {
        paramzzacl = ((zzacj)this.value).zzb((zzaca)localObject);
      } else {
        throw zzaci.zzvw();
      }
    }
    else if ((this.value instanceof zzacj[]))
    {
      localObject = (zzacj[])this.zzbzl.zzi(Collections.singletonList(paramzzacl));
      zzacj[] arrayOfzzacj = (zzacj[])this.value;
      paramzzacl = (zzacj[])Arrays.copyOf(arrayOfzzacj, arrayOfzzacj.length + localObject.length);
      System.arraycopy(localObject, 0, paramzzacl, arrayOfzzacj.length, localObject.length);
    }
    else
    {
      paramzzacl = this.zzbzl.zzi(Collections.singletonList(paramzzacl));
    }
    this.zzbzl = this.zzbzl;
    this.value = paramzzacl;
    this.zzbzm = null;
  }
  
  final <T> T zzb(zzace<?, T> paramzzace)
  {
    if (this.value != null)
    {
      if (!this.zzbzl.equals(paramzzace)) {
        throw new IllegalStateException("Tried to getExtension with a different Extension.");
      }
    }
    else
    {
      this.zzbzl = paramzzace;
      this.value = paramzzace.zzi(this.zzbzm);
      this.zzbzm = null;
    }
    return (T)this.value;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */