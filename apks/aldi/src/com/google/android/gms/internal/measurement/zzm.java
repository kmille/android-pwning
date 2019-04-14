package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzm
  extends zzacd<zzm>
{
  private static volatile zzm[] zzpx;
  public String string = "";
  public int type = 1;
  public zzm[] zzpy = zzg();
  public zzm[] zzpz = zzg();
  public zzm[] zzqa = zzg();
  public String zzqb = "";
  public String zzqc = "";
  public long zzqd = 0L;
  public boolean zzqe = false;
  public zzm[] zzqf = zzg();
  public int[] zzqg = zzacm.zzbvp;
  public boolean zzqh = false;
  
  public zzm()
  {
    this.zzbzd = null;
    this.zzbzo = -1;
  }
  
  private static int zza(int paramInt)
  {
    if ((paramInt > 0) && (paramInt <= 17)) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder(40);
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is not a valid enum Escaping");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private final zzm zzc(zzaca paramzzaca)
    throws IOException
  {
    for (;;)
    {
      int m = paramzzaca.zzvl();
      int j;
      int i;
      Object localObject;
      int k;
      switch (m)
      {
      default: 
        if (super.zza(paramzzaca, m)) {
          continue;
        }
        return this;
      case 96: 
        this.zzqe = paramzzaca.zzvm();
        break;
      case 90: 
        j = zzacm.zzb(paramzzaca, 90);
        if (this.zzqf == null) {
          i = 0;
        } else {
          i = this.zzqf.length;
        }
        localObject = new zzm[j + i];
        j = i;
        if (i != 0)
        {
          System.arraycopy(this.zzqf, 0, localObject, 0, i);
          j = i;
        }
        while (j < localObject.length - 1)
        {
          localObject[j] = new zzm();
          paramzzaca.zza(localObject[j]);
          paramzzaca.zzvl();
          j += 1;
        }
        localObject[j] = new zzm();
        paramzzaca.zza(localObject[j]);
        this.zzqf = ((zzm[])localObject);
        break;
      case 82: 
        k = paramzzaca.zzaf(paramzzaca.zzvn());
        i = paramzzaca.getPosition();
        j = 0;
        while (paramzzaca.zzvr() > 0) {
          try
          {
            zza(paramzzaca.zzvn());
            j += 1;
          }
          catch (IllegalArgumentException localIllegalArgumentException1)
          {
            for (;;) {}
          }
        }
        if (j != 0)
        {
          paramzzaca.zzam(i);
          if (this.zzqg == null) {
            i = 0;
          } else {
            i = this.zzqg.length;
          }
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(this.zzqg, 0, localObject, 0, i);
            j = i;
          }
          while (paramzzaca.zzvr() > 0)
          {
            i = paramzzaca.getPosition();
            try
            {
              localObject[j] = zza(paramzzaca.zzvn());
              j += 1;
            }
            catch (IllegalArgumentException localIllegalArgumentException3)
            {
              for (;;) {}
            }
            paramzzaca.zzam(i);
            zza(paramzzaca, 80);
          }
          this.zzqg = ((int[])localObject);
        }
        paramzzaca.zzal(k);
        break;
      case 80: 
        k = zzacm.zzb(paramzzaca, 80);
        localObject = new int[k];
        j = 0;
        i = 0;
        while (j < k)
        {
          if (j != 0) {
            paramzzaca.zzvl();
          }
          int n = paramzzaca.getPosition();
          try
          {
            localObject[i] = zza(paramzzaca.zzvn());
            i += 1;
          }
          catch (IllegalArgumentException localIllegalArgumentException4)
          {
            int[] arrayOfInt;
            for (;;) {}
          }
          paramzzaca.zzam(n);
          zza(paramzzaca, m);
          j += 1;
        }
        if (i == 0) {
          continue;
        }
        if (this.zzqg == null) {
          j = 0;
        } else {
          j = this.zzqg.length;
        }
        if ((j == 0) && (i == k))
        {
          this.zzqg = ((int[])localObject);
          continue;
        }
        arrayOfInt = new int[j + i];
        if (j != 0) {
          System.arraycopy(this.zzqg, 0, arrayOfInt, 0, j);
        }
        System.arraycopy(localObject, 0, arrayOfInt, j, i);
        this.zzqg = arrayOfInt;
        break;
      case 72: 
        this.zzqh = paramzzaca.zzvm();
        break;
      case 64: 
        this.zzqd = paramzzaca.zzvo();
        break;
      case 58: 
        this.zzqc = paramzzaca.readString();
        break;
      case 50: 
        this.zzqb = paramzzaca.readString();
        break;
      case 42: 
        j = zzacm.zzb(paramzzaca, 42);
        if (this.zzqa == null) {
          i = 0;
        } else {
          i = this.zzqa.length;
        }
        localObject = new zzm[j + i];
        j = i;
        if (i != 0)
        {
          System.arraycopy(this.zzqa, 0, localObject, 0, i);
          j = i;
        }
        while (j < localObject.length - 1)
        {
          localObject[j] = new zzm();
          paramzzaca.zza(localObject[j]);
          paramzzaca.zzvl();
          j += 1;
        }
        localObject[j] = new zzm();
        paramzzaca.zza(localObject[j]);
        this.zzqa = ((zzm[])localObject);
        break;
      case 34: 
        j = zzacm.zzb(paramzzaca, 34);
        if (this.zzpz == null) {
          i = 0;
        } else {
          i = this.zzpz.length;
        }
        localObject = new zzm[j + i];
        j = i;
        if (i != 0)
        {
          System.arraycopy(this.zzpz, 0, localObject, 0, i);
          j = i;
        }
        while (j < localObject.length - 1)
        {
          localObject[j] = new zzm();
          paramzzaca.zza(localObject[j]);
          paramzzaca.zzvl();
          j += 1;
        }
        localObject[j] = new zzm();
        paramzzaca.zza(localObject[j]);
        this.zzpz = ((zzm[])localObject);
        break;
      case 26: 
        j = zzacm.zzb(paramzzaca, 26);
        if (this.zzpy == null) {
          i = 0;
        } else {
          i = this.zzpy.length;
        }
        localObject = new zzm[j + i];
        j = i;
        if (i != 0)
        {
          System.arraycopy(this.zzpy, 0, localObject, 0, i);
          j = i;
        }
        while (j < localObject.length - 1)
        {
          localObject[j] = new zzm();
          paramzzaca.zza(localObject[j]);
          paramzzaca.zzvl();
          j += 1;
        }
        localObject[j] = new zzm();
        paramzzaca.zza(localObject[j]);
        this.zzpy = ((zzm[])localObject);
        break;
      case 18: 
        this.string = paramzzaca.readString();
        break;
      case 8: 
        i = paramzzaca.getPosition();
      }
      try
      {
        j = paramzzaca.zzvn();
        if ((j > 0) && (j <= 8))
        {
          this.type = j;
          continue;
        }
        localObject = new StringBuilder(36);
        ((StringBuilder)localObject).append(j);
        ((StringBuilder)localObject).append(" is not a valid enum Type");
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        for (;;) {}
      }
      paramzzaca.zzam(i);
      zza(paramzzaca, m);
    }
    return this;
  }
  
  public static zzm[] zzg()
  {
    if (zzpx == null) {
      synchronized (zzach.zzbzn)
      {
        if (zzpx == null) {
          zzpx = new zzm[0];
        }
      }
    }
    return zzpx;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzm)) {
      return false;
    }
    paramObject = (zzm)paramObject;
    if (this.type != ((zzm)paramObject).type) {
      return false;
    }
    if (this.string == null)
    {
      if (((zzm)paramObject).string != null) {
        return false;
      }
    }
    else if (!this.string.equals(((zzm)paramObject).string)) {
      return false;
    }
    if (!zzach.equals(this.zzpy, ((zzm)paramObject).zzpy)) {
      return false;
    }
    if (!zzach.equals(this.zzpz, ((zzm)paramObject).zzpz)) {
      return false;
    }
    if (!zzach.equals(this.zzqa, ((zzm)paramObject).zzqa)) {
      return false;
    }
    if (this.zzqb == null)
    {
      if (((zzm)paramObject).zzqb != null) {
        return false;
      }
    }
    else if (!this.zzqb.equals(((zzm)paramObject).zzqb)) {
      return false;
    }
    if (this.zzqc == null)
    {
      if (((zzm)paramObject).zzqc != null) {
        return false;
      }
    }
    else if (!this.zzqc.equals(((zzm)paramObject).zzqc)) {
      return false;
    }
    if (this.zzqd != ((zzm)paramObject).zzqd) {
      return false;
    }
    if (this.zzqe != ((zzm)paramObject).zzqe) {
      return false;
    }
    if (!zzach.equals(this.zzqf, ((zzm)paramObject).zzqf)) {
      return false;
    }
    if (!zzach.equals(this.zzqg, ((zzm)paramObject).zzqg)) {
      return false;
    }
    if (this.zzqh != ((zzm)paramObject).zzqh) {
      return false;
    }
    if ((this.zzbzd != null) && (!this.zzbzd.isEmpty())) {
      return this.zzbzd.equals(((zzm)paramObject).zzbzd);
    }
    if (((zzm)paramObject).zzbzd != null) {
      return ((zzm)paramObject).zzbzd.isEmpty();
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i3 = getClass().getName().hashCode();
    int i4 = this.type;
    String str = this.string;
    int i2 = 0;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = this.string.hashCode();
    }
    int i5 = zzach.hashCode(this.zzpy);
    int i6 = zzach.hashCode(this.zzpz);
    int i7 = zzach.hashCode(this.zzqa);
    int j;
    if (this.zzqb == null) {
      j = 0;
    } else {
      j = this.zzqb.hashCode();
    }
    int k;
    if (this.zzqc == null) {
      k = 0;
    } else {
      k = this.zzqc.hashCode();
    }
    int i8 = (int)(this.zzqd ^ this.zzqd >>> 32);
    boolean bool = this.zzqe;
    int n = 1237;
    int m;
    if (bool) {
      m = 1231;
    } else {
      m = 1237;
    }
    int i9 = zzach.hashCode(this.zzqf);
    int i10 = zzach.hashCode(this.zzqg);
    if (this.zzqh) {
      n = 1231;
    }
    int i1 = i2;
    if (this.zzbzd != null) {
      if (this.zzbzd.isEmpty()) {
        i1 = i2;
      } else {
        i1 = this.zzbzd.hashCode();
      }
    }
    return (((((((((((((i3 + 527) * 31 + i4) * 31 + i) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + j) * 31 + k) * 31 + i8) * 31 + m) * 31 + i9) * 31 + i10) * 31 + n) * 31 + i1;
  }
  
  protected final int zza()
  {
    int j = super.zza() + zzacb.zzf(1, this.type);
    int i = j;
    if (this.string != null)
    {
      i = j;
      if (!this.string.equals("")) {
        i = j + zzacb.zzc(2, this.string);
      }
    }
    Object localObject = this.zzpy;
    int m = 0;
    j = i;
    int k;
    if (localObject != null)
    {
      j = i;
      if (this.zzpy.length > 0)
      {
        j = 0;
        while (j < this.zzpy.length)
        {
          localObject = this.zzpy[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(3, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzpz != null)
    {
      i = j;
      if (this.zzpz.length > 0)
      {
        i = j;
        j = 0;
        while (j < this.zzpz.length)
        {
          localObject = this.zzpz[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(4, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    j = i;
    if (this.zzqa != null)
    {
      j = i;
      if (this.zzqa.length > 0)
      {
        j = 0;
        while (j < this.zzqa.length)
        {
          localObject = this.zzqa[j];
          k = i;
          if (localObject != null) {
            k = i + zzacb.zzb(5, (zzacj)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.zzqb != null)
    {
      i = j;
      if (!this.zzqb.equals("")) {
        i = j + zzacb.zzc(6, this.zzqb);
      }
    }
    j = i;
    if (this.zzqc != null)
    {
      j = i;
      if (!this.zzqc.equals("")) {
        j = i + zzacb.zzc(7, this.zzqc);
      }
    }
    i = j;
    if (this.zzqd != 0L) {
      i = j + zzacb.zzc(8, this.zzqd);
    }
    j = i;
    if (this.zzqh) {
      j = i + (zzacb.zzaq(9) + 1);
    }
    i = j;
    if (this.zzqg != null)
    {
      i = j;
      if (this.zzqg.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.zzqg.length)
        {
          k += zzacb.zzao(this.zzqg[i]);
          i += 1;
        }
        i = j + k + this.zzqg.length * 1;
      }
    }
    j = i;
    if (this.zzqf != null)
    {
      j = i;
      if (this.zzqf.length > 0)
      {
        k = m;
        for (;;)
        {
          j = i;
          if (k >= this.zzqf.length) {
            break;
          }
          localObject = this.zzqf[k];
          j = i;
          if (localObject != null) {
            j = i + zzacb.zzb(11, (zzacj)localObject);
          }
          k += 1;
          i = j;
        }
      }
    }
    i = j;
    if (this.zzqe) {
      i = j + (zzacb.zzaq(12) + 1);
    }
    return i;
  }
  
  public final void zza(zzacb paramzzacb)
    throws IOException
  {
    paramzzacb.zze(1, this.type);
    if ((this.string != null) && (!this.string.equals(""))) {
      paramzzacb.zzb(2, this.string);
    }
    Object localObject = this.zzpy;
    int j = 0;
    int i;
    if ((localObject != null) && (this.zzpy.length > 0))
    {
      i = 0;
      while (i < this.zzpy.length)
      {
        localObject = this.zzpy[i];
        if (localObject != null) {
          paramzzacb.zza(3, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzpz != null) && (this.zzpz.length > 0))
    {
      i = 0;
      while (i < this.zzpz.length)
      {
        localObject = this.zzpz[i];
        if (localObject != null) {
          paramzzacb.zza(4, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzqa != null) && (this.zzqa.length > 0))
    {
      i = 0;
      while (i < this.zzqa.length)
      {
        localObject = this.zzqa[i];
        if (localObject != null) {
          paramzzacb.zza(5, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if ((this.zzqb != null) && (!this.zzqb.equals(""))) {
      paramzzacb.zzb(6, this.zzqb);
    }
    if ((this.zzqc != null) && (!this.zzqc.equals(""))) {
      paramzzacb.zzb(7, this.zzqc);
    }
    if (this.zzqd != 0L) {
      paramzzacb.zzb(8, this.zzqd);
    }
    if (this.zzqh) {
      paramzzacb.zza(9, this.zzqh);
    }
    if ((this.zzqg != null) && (this.zzqg.length > 0))
    {
      i = 0;
      while (i < this.zzqg.length)
      {
        paramzzacb.zze(10, this.zzqg[i]);
        i += 1;
      }
    }
    if ((this.zzqf != null) && (this.zzqf.length > 0))
    {
      i = j;
      while (i < this.zzqf.length)
      {
        localObject = this.zzqf[i];
        if (localObject != null) {
          paramzzacb.zza(11, (zzacj)localObject);
        }
        i += 1;
      }
    }
    if (this.zzqe) {
      paramzzacb.zza(12, this.zzqe);
    }
    super.zza(paramzzacb);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */