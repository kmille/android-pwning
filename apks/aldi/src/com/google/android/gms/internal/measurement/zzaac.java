package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzaac<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> zzbvc;
  
  public zzaac(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    this.zzbvc = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return this.zzbvc.hasNext();
  }
  
  public final void remove()
  {
    this.zzbvc.remove();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */