package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;

public abstract class AbstractDuration
  implements ReadableDuration
{
  public int compareTo(ReadableDuration paramReadableDuration)
  {
    long l1 = getMillis();
    long l2 = paramReadableDuration.getMillis();
    if (l1 < l2) {
      return -1;
    }
    if (l1 > l2) {
      return 1;
    }
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ReadableDuration)) {
      return false;
    }
    paramObject = (ReadableDuration)paramObject;
    return getMillis() == ((ReadableDuration)paramObject).getMillis();
  }
  
  public int hashCode()
  {
    long l = getMillis();
    return (int)(l ^ l >>> 32);
  }
  
  public boolean isEqual(ReadableDuration paramReadableDuration)
  {
    Object localObject = paramReadableDuration;
    if (paramReadableDuration == null) {
      localObject = Duration.ZERO;
    }
    return compareTo((ReadableDuration)localObject) == 0;
  }
  
  public boolean isLongerThan(ReadableDuration paramReadableDuration)
  {
    Object localObject = paramReadableDuration;
    if (paramReadableDuration == null) {
      localObject = Duration.ZERO;
    }
    return compareTo((ReadableDuration)localObject) > 0;
  }
  
  public boolean isShorterThan(ReadableDuration paramReadableDuration)
  {
    Object localObject = paramReadableDuration;
    if (paramReadableDuration == null) {
      localObject = Duration.ZERO;
    }
    return compareTo((ReadableDuration)localObject) < 0;
  }
  
  public Duration toDuration()
  {
    return new Duration(getMillis());
  }
  
  public Period toPeriod()
  {
    return new Period(getMillis());
  }
  
  @ToString
  public String toString()
  {
    long l = getMillis();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("PT");
    int i;
    if (l < 0L) {
      i = 1;
    } else {
      i = 0;
    }
    FormatUtils.appendUnpaddedInteger(localStringBuffer, l);
    for (;;)
    {
      int m = localStringBuffer.length();
      int j;
      if (i != 0) {
        j = 7;
      } else {
        j = 6;
      }
      int k = 3;
      if (m >= j) {
        break;
      }
      if (i != 0) {
        j = k;
      } else {
        j = 2;
      }
      localStringBuffer.insert(j, "0");
    }
    if (l / 1000L * 1000L == l) {
      localStringBuffer.setLength(localStringBuffer.length() - 3);
    } else {
      localStringBuffer.insert(localStringBuffer.length() - 3, ".");
    }
    localStringBuffer.append('S');
    return localStringBuffer.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/base/AbstractDuration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */