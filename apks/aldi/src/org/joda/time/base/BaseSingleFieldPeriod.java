package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

public abstract class BaseSingleFieldPeriod
  implements Serializable, Comparable<BaseSingleFieldPeriod>, ReadablePeriod
{
  private static final long START_1972 = 63072000000L;
  private static final long serialVersionUID = 9386874258972L;
  private volatile int iPeriod;
  
  protected BaseSingleFieldPeriod(int paramInt)
  {
    this.iPeriod = paramInt;
  }
  
  public static int between(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2, DurationFieldType paramDurationFieldType)
  {
    if ((paramReadableInstant1 != null) && (paramReadableInstant2 != null)) {
      return paramDurationFieldType.getField(DateTimeUtils.getInstantChronology(paramReadableInstant1)).getDifference(paramReadableInstant2.getMillis(), paramReadableInstant1.getMillis());
    }
    throw new IllegalArgumentException("ReadableInstant objects must not be null");
  }
  
  public static int between(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2, ReadablePeriod paramReadablePeriod)
  {
    if ((paramReadablePartial1 != null) && (paramReadablePartial2 != null))
    {
      if (paramReadablePartial1.size() == paramReadablePartial2.size())
      {
        int j = paramReadablePartial1.size();
        int i = 0;
        while (i < j) {
          if (paramReadablePartial1.getFieldType(i) == paramReadablePartial2.getFieldType(i)) {
            i += 1;
          } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
          }
        }
        if (DateTimeUtils.isContiguous(paramReadablePartial1))
        {
          Chronology localChronology = DateTimeUtils.getChronology(paramReadablePartial1.getChronology()).withUTC();
          return localChronology.get(paramReadablePeriod, localChronology.set(paramReadablePartial1, 63072000000L), localChronology.set(paramReadablePartial2, 63072000000L))[0];
        }
        throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
      }
      throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
    }
    throw new IllegalArgumentException("ReadablePartial objects must not be null");
  }
  
  public static int standardPeriodIn(ReadablePeriod paramReadablePeriod, long paramLong)
  {
    int i = 0;
    if (paramReadablePeriod == null) {
      return 0;
    }
    Object localObject = ISOChronology.getInstanceUTC();
    long l2;
    for (long l1 = 0L; i < paramReadablePeriod.size(); l1 = l2)
    {
      int j = paramReadablePeriod.getValue(i);
      l2 = l1;
      if (j != 0)
      {
        DurationField localDurationField = paramReadablePeriod.getFieldType(i).getField((Chronology)localObject);
        if (localDurationField.isPrecise())
        {
          l2 = FieldUtils.safeAdd(l1, FieldUtils.safeMultiply(localDurationField.getUnitMillis(), j));
        }
        else
        {
          localObject = new StringBuilder("Cannot convert period to duration as ");
          ((StringBuilder)localObject).append(localDurationField.getName());
          ((StringBuilder)localObject).append(" is not precise in the period ");
          ((StringBuilder)localObject).append(paramReadablePeriod);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      i += 1;
    }
    return FieldUtils.safeToInt(l1 / paramLong);
  }
  
  public int compareTo(BaseSingleFieldPeriod paramBaseSingleFieldPeriod)
  {
    if (paramBaseSingleFieldPeriod.getClass() == getClass())
    {
      int i = paramBaseSingleFieldPeriod.getValue();
      int j = getValue();
      if (j > i) {
        return 1;
      }
      if (j < i) {
        return -1;
      }
      return 0;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass());
    localStringBuilder.append(" cannot be compared to ");
    localStringBuilder.append(paramBaseSingleFieldPeriod.getClass());
    throw new ClassCastException(localStringBuilder.toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ReadablePeriod)) {
      return false;
    }
    paramObject = (ReadablePeriod)paramObject;
    return (((ReadablePeriod)paramObject).getPeriodType() == getPeriodType()) && (((ReadablePeriod)paramObject).getValue(0) == getValue());
  }
  
  public int get(DurationFieldType paramDurationFieldType)
  {
    if (paramDurationFieldType == getFieldType()) {
      return getValue();
    }
    return 0;
  }
  
  public abstract DurationFieldType getFieldType();
  
  public DurationFieldType getFieldType(int paramInt)
  {
    if (paramInt == 0) {
      return getFieldType();
    }
    throw new IndexOutOfBoundsException(String.valueOf(paramInt));
  }
  
  public abstract PeriodType getPeriodType();
  
  protected int getValue()
  {
    return this.iPeriod;
  }
  
  public int getValue(int paramInt)
  {
    if (paramInt == 0) {
      return getValue();
    }
    throw new IndexOutOfBoundsException(String.valueOf(paramInt));
  }
  
  public int hashCode()
  {
    return (getValue() + 459) * 27 + getFieldType().hashCode();
  }
  
  public boolean isSupported(DurationFieldType paramDurationFieldType)
  {
    return paramDurationFieldType == getFieldType();
  }
  
  protected void setValue(int paramInt)
  {
    this.iPeriod = paramInt;
  }
  
  public int size()
  {
    return 1;
  }
  
  public MutablePeriod toMutablePeriod()
  {
    MutablePeriod localMutablePeriod = new MutablePeriod();
    localMutablePeriod.add(this);
    return localMutablePeriod;
  }
  
  public Period toPeriod()
  {
    return Period.ZERO.withFields(this);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/base/BaseSingleFieldPeriod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */