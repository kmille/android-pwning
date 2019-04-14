package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzace<M extends zzacd<M>, T>
{
  public final int tag;
  private final int type;
  protected final Class<T> zzbze;
  protected final boolean zzbzf;
  private final zzzv<?, ?> zzbzg;
  
  private zzace(int paramInt1, Class<T> paramClass, int paramInt2, boolean paramBoolean)
  {
    this(11, paramClass, null, 810, false);
  }
  
  private zzace(int paramInt1, Class<T> paramClass, zzzv<?, ?> paramzzzv, int paramInt2, boolean paramBoolean)
  {
    this.type = paramInt1;
    this.zzbze = paramClass;
    this.tag = paramInt2;
    this.zzbzf = false;
    this.zzbzg = null;
  }
  
  public static <M extends zzacd<M>, T extends zzacj> zzace<M, T> zza(int paramInt, Class<T> paramClass, long paramLong)
  {
    return new zzace(11, paramClass, 810, false);
  }
  
  private final Object zzf(zzaca paramzzaca)
  {
    Object localObject1;
    if (this.zzbzf) {
      localObject1 = this.zzbze.getComponentType();
    } else {
      localObject1 = this.zzbze;
    }
    for (;;)
    {
      try
      {
        switch (this.type)
        {
        case 11: 
          continue;
          localObject2 = (zzacj)((Class)localObject1).newInstance();
          paramzzaca.zza((zzacj)localObject2);
          return localObject2;
        case 10: 
          localObject2 = (zzacj)((Class)localObject1).newInstance();
          paramzzaca.zza((zzacj)localObject2, this.tag >>> 3);
          return localObject2;
          int i = this.type;
          paramzzaca = new StringBuilder(24);
          paramzzaca.append("Unknown type ");
          paramzzaca.append(i);
          throw new IllegalArgumentException(paramzzaca.toString());
        }
      }
      catch (IOException paramzzaca)
      {
        throw new IllegalArgumentException("Error reading extension field", paramzzaca);
      }
      catch (IllegalAccessException paramzzaca)
      {
        localObject1 = String.valueOf(localObject1);
        localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 33);
        ((StringBuilder)localObject2).append("Error creating instance of class ");
        ((StringBuilder)localObject2).append((String)localObject1);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString(), paramzzaca);
      }
      catch (InstantiationException paramzzaca)
      {
        localObject1 = String.valueOf(localObject1);
        Object localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 33);
        ((StringBuilder)localObject2).append("Error creating instance of class ");
        ((StringBuilder)localObject2).append((String)localObject1);
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString(), paramzzaca);
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzace)) {
      return false;
    }
    paramObject = (zzace)paramObject;
    return (this.type == ((zzace)paramObject).type) && (this.zzbze == ((zzace)paramObject).zzbze) && (this.tag == ((zzace)paramObject).tag) && (this.zzbzf == ((zzace)paramObject).zzbzf);
  }
  
  public final int hashCode()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  protected final void zza(Object paramObject, zzacb paramzzacb)
  {
    for (;;)
    {
      try
      {
        paramzzacb.zzar(this.tag);
        switch (this.type)
        {
        case 11: 
          continue;
          paramzzacb.zzb((zzacj)paramObject);
          return;
        case 10: 
          int i = this.tag;
          ((zzacj)paramObject).zza(paramzzacb);
          paramzzacb.zzg(i >>> 3, 4);
          return;
          i = this.type;
          paramObject = new StringBuilder(24);
          ((StringBuilder)paramObject).append("Unknown type ");
          ((StringBuilder)paramObject).append(i);
          throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
        }
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
    }
  }
  
  final T zzi(List<zzacl> paramList)
  {
    if (paramList == null) {
      return null;
    }
    if (this.zzbzf)
    {
      ArrayList localArrayList = new ArrayList();
      int j = 0;
      int i = 0;
      while (i < paramList.size())
      {
        zzacl localzzacl = (zzacl)paramList.get(i);
        if (localzzacl.zzbtj.length != 0) {
          localArrayList.add(zzf(zzaca.zzi(localzzacl.zzbtj)));
        }
        i += 1;
      }
      int k = localArrayList.size();
      if (k == 0) {
        return null;
      }
      paramList = this.zzbze.cast(Array.newInstance(this.zzbze.getComponentType(), k));
      i = j;
      while (i < k)
      {
        Array.set(paramList, i, localArrayList.get(i));
        i += 1;
      }
      return paramList;
    }
    if (paramList.isEmpty()) {
      return null;
    }
    paramList = (zzacl)paramList.get(paramList.size() - 1);
    return (T)this.zzbze.cast(zzf(zzaca.zzi(paramList.zzbtj)));
  }
  
  protected final int zzv(Object paramObject)
  {
    int i = this.tag >>> 3;
    switch (this.type)
    {
    default: 
      i = this.type;
      paramObject = new StringBuilder(24);
      ((StringBuilder)paramObject).append("Unknown type ");
      ((StringBuilder)paramObject).append(i);
      throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
    case 11: 
      return zzacb.zzb(i, (zzacj)paramObject);
    }
    paramObject = (zzacj)paramObject;
    return (zzacb.zzaq(i) << 1) + ((zzacj)paramObject).zzwb();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */