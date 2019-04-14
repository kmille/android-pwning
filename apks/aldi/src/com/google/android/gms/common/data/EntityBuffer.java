package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
public abstract class EntityBuffer<T>
  extends AbstractDataBuffer<T>
{
  private boolean zamd = false;
  private ArrayList<Integer> zame;
  
  @KeepForSdk
  protected EntityBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private final void zacb()
  {
    for (;;)
    {
      int i;
      Object localObject4;
      try
      {
        if (!this.zamd)
        {
          int j = this.mDataHolder.getCount();
          this.zame = new ArrayList();
          if (j > 0)
          {
            this.zame.add(Integer.valueOf(0));
            String str2 = getPrimaryDataMarkerColumn();
            i = this.mDataHolder.getWindowIndex(0);
            Object localObject1 = this.mDataHolder.getString(str2, 0, i);
            i = 1;
            if (i < j)
            {
              int k = this.mDataHolder.getWindowIndex(i);
              String str1 = this.mDataHolder.getString(str2, i, k);
              if (str1 != null)
              {
                localObject4 = localObject1;
                if (str1.equals(localObject1)) {
                  break label233;
                }
                this.zame.add(Integer.valueOf(i));
                localObject4 = str1;
                break label233;
              }
              localObject1 = new StringBuilder(String.valueOf(str2).length() + 78);
              ((StringBuilder)localObject1).append("Missing value for markerColumn: ");
              ((StringBuilder)localObject1).append(str2);
              ((StringBuilder)localObject1).append(", at row: ");
              ((StringBuilder)localObject1).append(i);
              ((StringBuilder)localObject1).append(", for window: ");
              ((StringBuilder)localObject1).append(k);
              throw new NullPointerException(((StringBuilder)localObject1).toString());
            }
          }
          this.zamd = true;
        }
        else
        {
          return;
        }
      }
      finally {}
      label233:
      i += 1;
      Object localObject3 = localObject4;
    }
  }
  
  private final int zah(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.zame.size())) {
      return ((Integer)this.zame.get(paramInt)).intValue();
    }
    StringBuilder localStringBuilder = new StringBuilder(53);
    localStringBuilder.append("Position ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is out of bounds for this buffer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  @KeepForSdk
  public final T get(int paramInt)
  {
    zacb();
    int k = zah(paramInt);
    int j = 0;
    int i = j;
    if (paramInt >= 0) {
      if (paramInt == this.zame.size())
      {
        i = j;
      }
      else
      {
        if (paramInt == this.zame.size() - 1) {}
        for (i = this.mDataHolder.getCount();; i = ((Integer)this.zame.get(paramInt + 1)).intValue())
        {
          i -= ((Integer)this.zame.get(paramInt)).intValue();
          break;
        }
        if (i == 1)
        {
          paramInt = zah(paramInt);
          int m = this.mDataHolder.getWindowIndex(paramInt);
          String str = getChildDataMarkerColumn();
          if ((str != null) && (this.mDataHolder.getString(str, paramInt, m) == null)) {
            i = j;
          }
        }
      }
    }
    return (T)getEntry(k, i);
  }
  
  @KeepForSdk
  protected String getChildDataMarkerColumn()
  {
    return null;
  }
  
  @KeepForSdk
  public int getCount()
  {
    zacb();
    return this.zame.size();
  }
  
  @KeepForSdk
  protected abstract T getEntry(int paramInt1, int paramInt2);
  
  @KeepForSdk
  protected abstract String getPrimaryDataMarkerColumn();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/data/EntityBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */