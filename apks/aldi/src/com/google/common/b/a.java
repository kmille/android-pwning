package com.google.common.b;

import com.google.common.base.j;
import java.math.RoundingMode;

public final class a
{
  static final byte[] a = { 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0 };
  static final int[] b = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
  static final int[] c = { 3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE };
  static int[] d = { Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33 };
  private static final int[] e = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };
  
  public static int a(int paramInt1, int paramInt2, RoundingMode paramRoundingMode)
  {
    j.a(paramRoundingMode);
    if (paramInt2 != 0)
    {
      int i = paramInt1 / paramInt2;
      int m = paramInt1 - paramInt2 * i;
      if (m == 0) {
        return i;
      }
      int j = 1;
      boolean bool = true;
      int k = (paramInt1 ^ paramInt2) >> 31 | 0x1;
      paramInt1 = j;
      switch (1.a[paramRoundingMode.ordinal()])
      {
      default: 
        throw new AssertionError();
      case 6: 
      case 7: 
      case 8: 
        paramInt1 = Math.abs(m);
        paramInt1 -= Math.abs(paramInt2) - paramInt1;
        if (paramInt1 == 0)
        {
          paramInt1 = j;
          if (paramRoundingMode == RoundingMode.HALF_UP) {
            break label226;
          }
          if (paramRoundingMode == RoundingMode.HALF_EVEN) {
            paramInt1 = 1;
          } else {
            paramInt1 = 0;
          }
          if ((i & 0x1) != 0) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if ((paramInt1 & paramInt2) != 0)
          {
            paramInt1 = j;
            break label226;
          }
        }
        else if (paramInt1 > 0)
        {
          paramInt1 = j;
        }
        break;
      case 5: 
        if (k > 0) {
          paramInt1 = j;
        }
        break;
      case 3: 
        if (k < 0) {
          paramInt1 = j;
        }
        break;
      case 1: 
        if (m != 0) {
          bool = false;
        }
        b.a(bool);
      case 2: 
        paramInt1 = 0;
      }
      label226:
      paramInt2 = i;
      if (paramInt1 != 0) {
        paramInt2 = i + k;
      }
      return paramInt2;
    }
    throw new ArithmeticException("/ by zero");
  }
  
  public static int a(int paramInt, RoundingMode paramRoundingMode)
  {
    if (paramInt > 0)
    {
      int i;
      switch (1.a[paramRoundingMode.ordinal()])
      {
      default: 
        throw new AssertionError();
      case 6: 
      case 7: 
      case 8: 
        i = Integer.numberOfLeadingZeros(paramInt);
        return 31 - i + (((-1257966797 >>> i) - paramInt ^ 0xFFFFFFFF ^ 0xFFFFFFFF) >>> 31);
      case 4: 
      case 5: 
        return 32 - Integer.numberOfLeadingZeros(paramInt - 1);
      case 1: 
        int j = 0;
        if (paramInt > 0) {
          i = 1;
        } else {
          i = 0;
        }
        if ((paramInt - 1 & paramInt) == 0) {
          j = 1;
        }
        b.a(j & i);
      }
      return 31 - Integer.numberOfLeadingZeros(paramInt);
    }
    paramRoundingMode = new StringBuilder();
    paramRoundingMode.append("x");
    paramRoundingMode.append(" (");
    paramRoundingMode.append(paramInt);
    paramRoundingMode.append(") must be > 0");
    throw new IllegalArgumentException(paramRoundingMode.toString());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */