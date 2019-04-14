package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzabj
  implements Iterator<Map.Entry<K, V>>
{
  private int pos = -1;
  private boolean zzbwn;
  private Iterator<Map.Entry<K, V>> zzbwo;
  
  private zzabj(zzabd paramzzabd) {}
  
  private final Iterator<Map.Entry<K, V>> zzve()
  {
    if (this.zzbwo == null) {
      this.zzbwo = zzabd.zzc(this.zzbwm).entrySet().iterator();
    }
    return this.zzbwo;
  }
  
  public final boolean hasNext()
  {
    if (this.pos + 1 >= zzabd.zzb(this.zzbwm).size()) {
      return (!zzabd.zzc(this.zzbwm).isEmpty()) && (zzve().hasNext());
    }
    return true;
  }
  
  public final void remove()
  {
    if (this.zzbwn)
    {
      this.zzbwn = false;
      zzabd.zza(this.zzbwm);
      if (this.pos < zzabd.zzb(this.zzbwm).size())
      {
        zzabd localzzabd = this.zzbwm;
        int i = this.pos;
        this.pos = (i - 1);
        zzabd.zza(localzzabd, i);
        return;
      }
      zzve().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzabj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */