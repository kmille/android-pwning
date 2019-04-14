package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class HexDumpUtils
{
  @KeepForSdk
  public static String dump(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0) && (paramInt1 >= 0) && (paramInt2 > 0) && (paramInt1 + paramInt2 <= paramArrayOfByte.length))
    {
      int i = 57;
      if (paramBoolean) {
        i = 75;
      }
      StringBuilder localStringBuilder = new StringBuilder(i * ((paramInt2 + 16 - 1) / 16));
      i = paramInt2;
      int k = 0;
      int m = 0;
      while (i > 0)
      {
        int j;
        if (k == 0)
        {
          String str;
          Object[] arrayOfObject;
          if (paramInt2 < 65536)
          {
            str = "%04X:";
            arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(paramInt1);
          }
          for (;;)
          {
            localStringBuilder.append(String.format(str, arrayOfObject));
            break;
            str = "%08X:";
            arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(paramInt1);
          }
          j = paramInt1;
        }
        else
        {
          j = m;
          if (k == 8)
          {
            localStringBuilder.append(" -");
            j = m;
          }
        }
        localStringBuilder.append(String.format(" %02X", new Object[] { Integer.valueOf(paramArrayOfByte[paramInt1] & 0xFF) }));
        int n = i - 1;
        k += 1;
        if ((paramBoolean) && ((k == 16) || (n == 0)))
        {
          m = 16 - k;
          if (m > 0)
          {
            i = 0;
            while (i < m)
            {
              localStringBuilder.append("   ");
              i += 1;
            }
          }
          if (m >= 8) {
            localStringBuilder.append("  ");
          }
          localStringBuilder.append("  ");
          i = 0;
          while (i < k)
          {
            char c = (char)paramArrayOfByte[(j + i)];
            if ((c < ' ') || (c > '~')) {
              c = '.';
            }
            localStringBuilder.append(c);
            i += 1;
          }
        }
        if (k != 16)
        {
          i = k;
          if (n != 0) {}
        }
        else
        {
          localStringBuilder.append('\n');
          i = 0;
        }
        paramInt1 += 1;
        k = i;
        m = j;
        i = n;
      }
      return localStringBuilder.toString();
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/util/HexDumpUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */