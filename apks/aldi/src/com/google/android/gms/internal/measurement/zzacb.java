package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzacb
{
  private final ByteBuffer zzbzc;
  
  private zzacb(ByteBuffer paramByteBuffer)
  {
    this.zzbzc = paramByteBuffer;
    this.zzbzc.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private zzacb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  private static int zza(CharSequence paramCharSequence)
  {
    int n = paramCharSequence.length();
    int m = 0;
    int j = 0;
    while ((j < n) && (paramCharSequence.charAt(j) < '')) {
      j += 1;
    }
    int i = n;
    for (;;)
    {
      k = i;
      if (j >= n) {
        break label232;
      }
      k = paramCharSequence.charAt(j);
      if (k >= 2048) {
        break;
      }
      i += (127 - k >>> 31);
      j += 1;
    }
    int i2 = paramCharSequence.length();
    int k = m;
    while (j < i2)
    {
      int i3 = paramCharSequence.charAt(j);
      if (i3 < 2048)
      {
        k += (127 - i3 >>> 31);
        m = j;
      }
      else
      {
        int i1 = k + 2;
        k = i1;
        m = j;
        if (55296 <= i3)
        {
          k = i1;
          m = j;
          if (i3 <= 57343) {
            if (Character.codePointAt(paramCharSequence, j) >= 65536)
            {
              m = j + 1;
              k = i1;
            }
            else
            {
              paramCharSequence = new StringBuilder(39);
              paramCharSequence.append("Unpaired surrogate at index ");
              paramCharSequence.append(j);
              throw new IllegalArgumentException(paramCharSequence.toString());
            }
          }
        }
      }
      j = m + 1;
    }
    k = i + k;
    label232:
    if (k >= n) {
      return k;
    }
    long l = k;
    paramCharSequence = new StringBuilder(54);
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  private static void zza(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int k;
    int j;
    if (!paramByteBuffer.isReadOnly())
    {
      boolean bool = paramByteBuffer.hasArray();
      k = 0;
      j = 0;
      if (!bool) {}
    }
    for (;;)
    {
      byte[] arrayOfByte;
      int n;
      int i1;
      int i2;
      int i;
      char c;
      try
      {
        arrayOfByte = paramByteBuffer.array();
        k = paramByteBuffer.arrayOffset() + paramByteBuffer.position();
        m = paramByteBuffer.remaining();
        n = paramCharSequence.length();
        i1 = m + k;
        if (j >= n) {
          break label742;
        }
        m = j + k;
        if (m >= i1) {
          break label742;
        }
        i2 = paramCharSequence.charAt(j);
        if (i2 >= 128) {
          break label742;
        }
        arrayOfByte[m] = ((byte)i2);
        j += 1;
        continue;
        m = k;
        if (j < n)
        {
          i = paramCharSequence.charAt(j);
          if ((i >= 128) || (k >= i1)) {
            break label772;
          }
          m = k + 1;
          arrayOfByte[k] = ((byte)i);
          k = m;
          break label769;
          if (k <= i1 - 4)
          {
            m = j + 1;
            if (m != paramCharSequence.length())
            {
              c = paramCharSequence.charAt(m);
              if (!Character.isSurrogatePair(i, c)) {
                break label927;
              }
              j = Character.toCodePoint(i, c);
              i2 = k + 1;
              arrayOfByte[k] = ((byte)(j >>> 18 | 0xF0));
              k = i2 + 1;
              arrayOfByte[i2] = ((byte)(j >>> 12 & 0x3F | 0x80));
              i2 = k + 1;
              arrayOfByte[k] = ((byte)(j >>> 6 & 0x3F | 0x80));
              k = i2 + 1;
              arrayOfByte[i2] = ((byte)(j & 0x3F | 0x80));
              j = m;
              break label918;
            }
            paramCharSequence = new StringBuilder(39);
            paramCharSequence.append("Unpaired surrogate at index ");
            paramCharSequence.append(j - 1);
            throw new IllegalArgumentException(paramCharSequence.toString());
          }
          paramCharSequence = new StringBuilder(37);
          paramCharSequence.append("Failed writing ");
          paramCharSequence.append(i);
          paramCharSequence.append(" at index ");
          paramCharSequence.append(k);
          throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
        }
        paramByteBuffer.position(m - paramByteBuffer.arrayOffset());
        return;
      }
      catch (ArrayIndexOutOfBoundsException paramCharSequence)
      {
        paramByteBuffer = new BufferOverflowException();
        paramByteBuffer.initCause(paramCharSequence);
        throw paramByteBuffer;
      }
      int m = paramCharSequence.length();
      j = k;
      while (j < m)
      {
        i = paramCharSequence.charAt(j);
        if (i < 128)
        {
          k = i;
          paramByteBuffer.put((byte)k);
        }
        else
        {
          if (i < 2048) {}
          for (k = i >>> 6 | 0x3C0;; k = i >>> 6 & 0x3F | 0x80)
          {
            paramByteBuffer.put((byte)k);
            k = i & 0x3F | 0x80;
            break;
            if ((i >= 55296) && (57343 >= i))
            {
              k = j + 1;
              if (k != paramCharSequence.length())
              {
                c = paramCharSequence.charAt(k);
                if (Character.isSurrogatePair(i, c))
                {
                  j = Character.toCodePoint(i, c);
                  paramByteBuffer.put((byte)(j >>> 18 | 0xF0));
                  paramByteBuffer.put((byte)(j >>> 12 & 0x3F | 0x80));
                  paramByteBuffer.put((byte)(j >>> 6 & 0x3F | 0x80));
                  paramByteBuffer.put((byte)(j & 0x3F | 0x80));
                  j = k;
                  break label724;
                }
                j = k;
              }
              paramCharSequence = new StringBuilder(39);
              paramCharSequence.append("Unpaired surrogate at index ");
              paramCharSequence.append(j - 1);
              throw new IllegalArgumentException(paramCharSequence.toString());
            }
            paramByteBuffer.put((byte)(i >>> 12 | 0x1E0));
          }
        }
        label724:
        j += 1;
      }
      return;
      throw new ReadOnlyBufferException();
      label742:
      if (j == n)
      {
        m = k + n;
      }
      else
      {
        k += j;
        continue;
        for (;;)
        {
          label769:
          break label918;
          label772:
          if ((i < 2048) && (k <= i1 - 2))
          {
            m = k + 1;
            arrayOfByte[k] = ((byte)(i >>> 6 | 0x3C0));
            k = m + 1;
            arrayOfByte[m] = ((byte)(i & 0x3F | 0x80));
          }
          else
          {
            if (((i >= 55296) && (57343 >= i)) || (k > i1 - 3)) {
              break;
            }
            m = k + 1;
            arrayOfByte[k] = ((byte)(i >>> 12 | 0x1E0));
            i2 = m + 1;
            arrayOfByte[m] = ((byte)(i >>> 6 & 0x3F | 0x80));
            k = i2 + 1;
            arrayOfByte[i2] = ((byte)(i & 0x3F | 0x80));
          }
        }
        label918:
        j += 1;
        continue;
        label927:
        j = m;
      }
    }
  }
  
  public static int zzao(int paramInt)
  {
    if (paramInt >= 0) {
      return zzas(paramInt);
    }
    return 10;
  }
  
  private final void zzap(int paramInt)
    throws IOException
  {
    byte b = (byte)paramInt;
    if (this.zzbzc.hasRemaining())
    {
      this.zzbzc.put(b);
      return;
    }
    throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
  }
  
  public static int zzaq(int paramInt)
  {
    return zzas(paramInt << 3);
  }
  
  public static int zzas(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  private final void zzas(long paramLong)
    throws IOException
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        zzap((int)paramLong);
        return;
      }
      zzap((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  public static int zzat(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0xFFFFFFF800000000 & paramLong) == 0L) {
      return 5;
    }
    if ((0xFFFFFC0000000000 & paramLong) == 0L) {
      return 6;
    }
    if ((0xFFFE000000000000 & paramLong) == 0L) {
      return 7;
    }
    if ((0xFF00000000000000 & paramLong) == 0L) {
      return 8;
    }
    if ((paramLong & 0x8000000000000000) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public static int zzb(int paramInt, zzacj paramzzacj)
  {
    paramInt = zzaq(paramInt);
    int i = paramzzacj.zzwb();
    return paramInt + (zzas(i) + i);
  }
  
  public static zzacb zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new zzacb(paramArrayOfByte, 0, paramInt2);
  }
  
  public static int zzc(int paramInt, long paramLong)
  {
    return zzaq(paramInt) + zzat(paramLong);
  }
  
  public static int zzc(int paramInt, String paramString)
  {
    return zzaq(paramInt) + zzfr(paramString);
  }
  
  public static int zzf(int paramInt1, int paramInt2)
  {
    return zzaq(paramInt1) + zzao(paramInt2);
  }
  
  public static int zzfr(String paramString)
  {
    int i = zza(paramString);
    return zzas(i) + i;
  }
  
  public static zzacb zzj(byte[] paramArrayOfByte)
  {
    return zzb(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final void zza(int paramInt, double paramDouble)
    throws IOException
  {
    zzg(paramInt, 1);
    long l = Double.doubleToLongBits(paramDouble);
    if (this.zzbzc.remaining() >= 8)
    {
      this.zzbzc.putLong(l);
      return;
    }
    throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
  }
  
  public final void zza(int paramInt, float paramFloat)
    throws IOException
  {
    zzg(paramInt, 5);
    paramInt = Float.floatToIntBits(paramFloat);
    if (this.zzbzc.remaining() >= 4)
    {
      this.zzbzc.putInt(paramInt);
      return;
    }
    throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
  }
  
  public final void zza(int paramInt, long paramLong)
    throws IOException
  {
    zzg(paramInt, 0);
    zzas(paramLong);
  }
  
  public final void zza(int paramInt, zzacj paramzzacj)
    throws IOException
  {
    zzg(paramInt, 2);
    zzb(paramzzacj);
  }
  
  public final void zza(int paramInt, boolean paramBoolean)
    throws IOException
  {
    zzg(paramInt, 0);
    byte b = (byte)paramBoolean;
    if (this.zzbzc.hasRemaining())
    {
      this.zzbzc.put(b);
      return;
    }
    throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
  }
  
  public final void zzar(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        zzap(paramInt);
        return;
      }
      zzap(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public final void zzb(int paramInt, long paramLong)
    throws IOException
  {
    zzg(paramInt, 0);
    zzas(paramLong);
  }
  
  public final void zzb(int paramInt, String paramString)
    throws IOException
  {
    zzg(paramInt, 2);
    try
    {
      paramInt = zzas(paramString.length());
      if (paramInt == zzas(paramString.length() * 3))
      {
        int i = this.zzbzc.position();
        if (this.zzbzc.remaining() >= paramInt)
        {
          this.zzbzc.position(i + paramInt);
          zza(paramString, this.zzbzc);
          int j = this.zzbzc.position();
          this.zzbzc.position(i);
          zzar(j - i - paramInt);
          this.zzbzc.position(j);
          return;
        }
        throw new zzacc(i + paramInt, this.zzbzc.limit());
      }
      zzar(zza(paramString));
      zza(paramString, this.zzbzc);
      return;
    }
    catch (BufferOverflowException paramString)
    {
      zzacc localzzacc = new zzacc(this.zzbzc.position(), this.zzbzc.limit());
      localzzacc.initCause(paramString);
      throw localzzacc;
    }
  }
  
  public final void zzb(zzacj paramzzacj)
    throws IOException
  {
    zzar(paramzzacj.zzwa());
    paramzzacj.zza(this);
  }
  
  public final void zze(int paramInt1, int paramInt2)
    throws IOException
  {
    zzg(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      zzar(paramInt2);
      return;
    }
    zzas(paramInt2);
  }
  
  public final void zzg(int paramInt1, int paramInt2)
    throws IOException
  {
    zzar(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzk(byte[] paramArrayOfByte)
    throws IOException
  {
    int i = paramArrayOfByte.length;
    if (this.zzbzc.remaining() >= i)
    {
      this.zzbzc.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new zzacc(this.zzbzc.position(), this.zzbzc.limit());
  }
  
  public final void zzvt()
  {
    if (this.zzbzc.remaining() == 0) {
      return;
    }
    throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[] { Integer.valueOf(this.zzbzc.remaining()) }));
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzacb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */