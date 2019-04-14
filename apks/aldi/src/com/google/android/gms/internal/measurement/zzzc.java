package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzzc
  implements Iterator
{
  private final int limit = this.zzbtg.size();
  private int position = 0;
  
  zzzc(zzzb paramzzzb) {}
  
  private final byte nextByte()
  {
    try
    {
      zzzb localzzzb = this.zzbtg;
      int i = this.position;
      this.position = (i + 1);
      byte b = localzzzb.zzae(i);
      return b;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new NoSuchElementException(localIndexOutOfBoundsException.getMessage());
    }
  }
  
  public final boolean hasNext()
  {
    return this.position < this.limit;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */