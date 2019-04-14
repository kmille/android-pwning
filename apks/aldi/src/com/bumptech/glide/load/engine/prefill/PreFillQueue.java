package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class PreFillQueue
{
  private final Map<PreFillType, Integer> bitmapsPerType;
  private int bitmapsRemaining;
  private int keyIndex;
  private final List<PreFillType> keyList;
  
  public PreFillQueue(Map<PreFillType, Integer> paramMap)
  {
    this.bitmapsPerType = paramMap;
    this.keyList = new ArrayList(paramMap.keySet());
    paramMap = paramMap.values().iterator();
    while (paramMap.hasNext())
    {
      Integer localInteger = (Integer)paramMap.next();
      this.bitmapsRemaining += localInteger.intValue();
    }
  }
  
  public final int getSize()
  {
    return this.bitmapsRemaining;
  }
  
  public final boolean isEmpty()
  {
    return this.bitmapsRemaining == 0;
  }
  
  public final PreFillType remove()
  {
    PreFillType localPreFillType = (PreFillType)this.keyList.get(this.keyIndex);
    Integer localInteger = (Integer)this.bitmapsPerType.get(localPreFillType);
    if (localInteger.intValue() == 1)
    {
      this.bitmapsPerType.remove(localPreFillType);
      this.keyList.remove(this.keyIndex);
    }
    else
    {
      this.bitmapsPerType.put(localPreFillType, Integer.valueOf(localInteger.intValue() - 1));
    }
    this.bitmapsRemaining -= 1;
    int i;
    if (this.keyList.isEmpty()) {
      i = 0;
    } else {
      i = (this.keyIndex + 1) % this.keyList.size();
    }
    this.keyIndex = i;
    return localPreFillType;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/bumptech/glide/load/engine/prefill/PreFillQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */