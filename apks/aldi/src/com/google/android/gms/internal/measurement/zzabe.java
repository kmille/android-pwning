package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzabe
  extends zzabd<FieldDescriptorType, Object>
{
  zzabe(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void zzru()
  {
    if (!isImmutable())
    {
      int i = 0;
      while (i < zzuy())
      {
        localObject = zzah(i);
        if (((zzzt)((Map.Entry)localObject).getKey()).zztz()) {
          ((Map.Entry)localObject).setValue(Collections.unmodifiableList((List)((Map.Entry)localObject).getValue()));
        }
        i += 1;
      }
      Object localObject = zzuz().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((zzzt)localEntry.getKey()).zztz()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.zzru();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */