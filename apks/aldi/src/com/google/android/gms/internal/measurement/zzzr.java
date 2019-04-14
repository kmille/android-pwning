package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class zzzr<FieldDescriptorType extends zzzt<FieldDescriptorType>>
{
  private static final zzzr zzbub = new zzzr(true);
  private boolean zzbnw;
  private final zzabd<FieldDescriptorType, Object> zzbtz;
  private boolean zzbua = false;
  
  private zzzr()
  {
    this.zzbtz = zzabd.zzag(16);
  }
  
  private zzzr(boolean paramBoolean)
  {
    this.zzbtz = zzabd.zzag(0);
    if (!this.zzbnw)
    {
      this.zzbtz.zzru();
      this.zzbnw = true;
    }
  }
  
  /* Error */
  private static void zza(zzabu paramzzabu, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 47	com/google/android/gms/internal/measurement/zzzw:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: getstatic 53	com/google/android/gms/internal/measurement/zzzs:zzbuc	[I
    //   8: aload_0
    //   9: invokevirtual 59	com/google/android/gms/internal/measurement/zzabu:zzvk	()Lcom/google/android/gms/internal/measurement/zzabz;
    //   12: invokevirtual 65	com/google/android/gms/internal/measurement/zzabz:ordinal	()I
    //   15: iaload
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_2
    //   20: tableswitch	default:+52->72, 1:+148->168, 2:+140->160, 3:+132->152, 4:+124->144, 5:+116->136, 6:+108->128, 7:+91->111, 8:+72->92, 9:+55->75
    //   72: goto +101 -> 173
    //   75: aload_1
    //   76: instanceof 67
    //   79: ifne +27 -> 106
    //   82: aload_1
    //   83: instanceof 69
    //   86: ifeq +87 -> 173
    //   89: goto +17 -> 106
    //   92: aload_1
    //   93: instanceof 71
    //   96: ifne +10 -> 106
    //   99: aload_1
    //   100: instanceof 73
    //   103: ifeq +70 -> 173
    //   106: iconst_1
    //   107: istore_3
    //   108: goto +65 -> 173
    //   111: aload_1
    //   112: instanceof 75
    //   115: ifne -9 -> 106
    //   118: aload_1
    //   119: instanceof 77
    //   122: ifeq +51 -> 173
    //   125: goto -19 -> 106
    //   128: aload_1
    //   129: instanceof 79
    //   132: istore_3
    //   133: goto +40 -> 173
    //   136: aload_1
    //   137: instanceof 81
    //   140: istore_3
    //   141: goto +32 -> 173
    //   144: aload_1
    //   145: instanceof 83
    //   148: istore_3
    //   149: goto +24 -> 173
    //   152: aload_1
    //   153: instanceof 85
    //   156: istore_3
    //   157: goto +16 -> 173
    //   160: aload_1
    //   161: instanceof 87
    //   164: istore_3
    //   165: goto +8 -> 173
    //   168: aload_1
    //   169: instanceof 71
    //   172: istore_3
    //   173: iload_3
    //   174: ifeq +4 -> 178
    //   177: return
    //   178: new 89	java/lang/IllegalArgumentException
    //   181: dup
    //   182: ldc 91
    //   184: invokespecial 94	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	paramzzabu	zzabu
    //   0	188	1	paramObject	Object
    //   16	4	2	i	int
    //   18	156	3	bool	boolean
  }
  
  private final void zza(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.zztz())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        paramObject = (ArrayList)localArrayList;
        int j = ((ArrayList)paramObject).size();
        int i = 0;
        while (i < j)
        {
          Object localObject = ((ArrayList)paramObject).get(i);
          i += 1;
          zza(paramFieldDescriptorType.zzty(), localObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      zza(paramFieldDescriptorType.zzty(), paramObject);
    }
    if ((paramObject instanceof zzzz)) {
      this.zzbua = true;
    }
    this.zzbtz.zza(paramFieldDescriptorType, paramObject);
  }
  
  public static <T extends zzzt<T>> zzzr<T> zztx()
  {
    return zzbub;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzzr)) {
      return false;
    }
    paramObject = (zzzr)paramObject;
    return this.zzbtz.equals(((zzzr)paramObject).zzbtz);
  }
  
  public final int hashCode()
  {
    return this.zzbtz.hashCode();
  }
  
  public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator()
  {
    if (this.zzbua) {
      return new zzaac(this.zzbtz.entrySet().iterator());
    }
    return this.zzbtz.entrySet().iterator();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */