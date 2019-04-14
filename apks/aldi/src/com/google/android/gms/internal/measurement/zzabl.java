package com.google.android.gms.internal.measurement;

final class zzabl
{
  static String zza(zzzb paramzzzb)
  {
    zzabm localzzabm = new zzabm(paramzzzb);
    StringBuilder localStringBuilder = new StringBuilder(localzzabm.size());
    int i = 0;
    while (i < localzzabm.size())
    {
      int j = localzzabm.zzae(i);
      if (j != 34) {
        if (j != 39) {
          if (j != 92) {
            switch (j)
            {
            default: 
              if ((j < 32) || (j > 126))
              {
                localStringBuilder.append('\\');
                localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
                localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
                j = (j & 0x7) + 48;
              }
              localStringBuilder.append((char)j);
              break;
            case 13: 
              paramzzzb = "\\r";
              break;
            case 12: 
              paramzzzb = "\\f";
              break;
            case 11: 
              paramzzzb = "\\v";
              break;
            case 10: 
              paramzzzb = "\\n";
              break;
            case 9: 
              paramzzzb = "\\t";
              break;
            case 8: 
              paramzzzb = "\\b";
              break;
            case 7: 
              paramzzzb = "\\a";
            }
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(paramzzzb);
        break;
        paramzzzb = "\\\\";
        continue;
        paramzzzb = "\\'";
        continue;
        paramzzzb = "\\\"";
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */