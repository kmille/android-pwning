package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;

@VisibleForTesting
public final class zze
  implements zzo
{
  private static final Uri zzqs;
  private final LogPrinter zzrm = new LogPrinter(4, "GA/LogCatTransport");
  
  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    zzqs = localBuilder.build();
  }
  
  public final void zzb(zzg paramzzg)
  {
    ArrayList localArrayList = new ArrayList(paramzzg.zzp());
    Collections.sort(localArrayList, new zzf(this));
    paramzzg = new StringBuilder();
    localArrayList = (ArrayList)localArrayList;
    int k = localArrayList.size();
    int i = 0;
    while (i < k)
    {
      Object localObject = localArrayList.get(i);
      int j = i + 1;
      localObject = ((zzi)localObject).toString();
      i = j;
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        if (paramzzg.length() != 0) {
          paramzzg.append(", ");
        }
        paramzzg.append((String)localObject);
        i = j;
      }
    }
    this.zzrm.println(paramzzg.toString());
  }
  
  public final Uri zzk()
  {
    return zzqs;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/analytics/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */