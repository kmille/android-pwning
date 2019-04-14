package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
public class DataBufferIterator<T>
  implements Iterator<T>
{
  protected final DataBuffer<T> zalj;
  protected int zalk;
  
  public DataBufferIterator(DataBuffer<T> paramDataBuffer)
  {
    this.zalj = ((DataBuffer)Preconditions.checkNotNull(paramDataBuffer));
    this.zalk = -1;
  }
  
  public boolean hasNext()
  {
    return this.zalk < this.zalj.getCount() - 1;
  }
  
  public T next()
  {
    if (hasNext())
    {
      localObject = this.zalj;
      i = this.zalk + 1;
      this.zalk = i;
      return (T)((DataBuffer)localObject).get(i);
    }
    int i = this.zalk;
    Object localObject = new StringBuilder(46);
    ((StringBuilder)localObject).append("Cannot advance the iterator beyond ");
    ((StringBuilder)localObject).append(i);
    throw new NoSuchElementException(((StringBuilder)localObject).toString());
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/data/DataBufferIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */