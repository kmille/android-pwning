package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;

public abstract class AbstractPartial
  implements Comparable<ReadablePartial>, ReadablePartial
{
  public int compareTo(ReadablePartial paramReadablePartial)
  {
    if (this == paramReadablePartial) {
      return 0;
    }
    if (size() == paramReadablePartial.size())
    {
      int j = size();
      int i = 0;
      while (i < j) {
        if (getFieldType(i) == paramReadablePartial.getFieldType(i)) {
          i += 1;
        } else {
          throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
      }
      j = size();
      i = 0;
      while (i < j)
      {
        if (getValue(i) > paramReadablePartial.getValue(i)) {
          return 1;
        }
        if (getValue(i) < paramReadablePartial.getValue(i)) {
          return -1;
        }
        i += 1;
      }
      return 0;
    }
    throw new ClassCastException("ReadablePartial objects must have matching field types");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ReadablePartial)) {
      return false;
    }
    paramObject = (ReadablePartial)paramObject;
    if (size() != ((ReadablePartial)paramObject).size()) {
      return false;
    }
    int j = size();
    int i = 0;
    while (i < j) {
      if (getValue(i) == ((ReadablePartial)paramObject).getValue(i))
      {
        if (getFieldType(i) != ((ReadablePartial)paramObject).getFieldType(i)) {
          return false;
        }
        i += 1;
      }
      else
      {
        return false;
      }
    }
    return FieldUtils.equals(getChronology(), ((ReadablePartial)paramObject).getChronology());
  }
  
  public int get(DateTimeFieldType paramDateTimeFieldType)
  {
    return getValue(indexOfSupported(paramDateTimeFieldType));
  }
  
  public DateTimeField getField(int paramInt)
  {
    return getField(paramInt, getChronology());
  }
  
  protected abstract DateTimeField getField(int paramInt, Chronology paramChronology);
  
  public DateTimeFieldType getFieldType(int paramInt)
  {
    return getField(paramInt, getChronology()).getType();
  }
  
  public DateTimeFieldType[] getFieldTypes()
  {
    DateTimeFieldType[] arrayOfDateTimeFieldType = new DateTimeFieldType[size()];
    int i = 0;
    while (i < arrayOfDateTimeFieldType.length)
    {
      arrayOfDateTimeFieldType[i] = getFieldType(i);
      i += 1;
    }
    return arrayOfDateTimeFieldType;
  }
  
  public DateTimeField[] getFields()
  {
    DateTimeField[] arrayOfDateTimeField = new DateTimeField[size()];
    int i = 0;
    while (i < arrayOfDateTimeField.length)
    {
      arrayOfDateTimeField[i] = getField(i);
      i += 1;
    }
    return arrayOfDateTimeField;
  }
  
  public int[] getValues()
  {
    int[] arrayOfInt = new int[size()];
    int i = 0;
    while (i < arrayOfInt.length)
    {
      arrayOfInt[i] = getValue(i);
      i += 1;
    }
    return arrayOfInt;
  }
  
  public int hashCode()
  {
    int k = size();
    int j = 157;
    int i = 0;
    while (i < k)
    {
      j = (j * 23 + getValue(i)) * 23 + getFieldType(i).hashCode();
      i += 1;
    }
    return j + getChronology().hashCode();
  }
  
  public int indexOf(DateTimeFieldType paramDateTimeFieldType)
  {
    int j = size();
    int i = 0;
    while (i < j)
    {
      if (getFieldType(i) == paramDateTimeFieldType) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  protected int indexOf(DurationFieldType paramDurationFieldType)
  {
    int j = size();
    int i = 0;
    while (i < j)
    {
      if (getFieldType(i).getDurationType() == paramDurationFieldType) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  protected int indexOfSupported(DateTimeFieldType paramDateTimeFieldType)
  {
    int i = indexOf(paramDateTimeFieldType);
    if (i != -1) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder("Field '");
    localStringBuilder.append(paramDateTimeFieldType);
    localStringBuilder.append("' is not supported");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  protected int indexOfSupported(DurationFieldType paramDurationFieldType)
  {
    int i = indexOf(paramDurationFieldType);
    if (i != -1) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder("Field '");
    localStringBuilder.append(paramDurationFieldType);
    localStringBuilder.append("' is not supported");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public boolean isAfter(ReadablePartial paramReadablePartial)
  {
    if (paramReadablePartial != null) {
      return compareTo(paramReadablePartial) > 0;
    }
    throw new IllegalArgumentException("Partial cannot be null");
  }
  
  public boolean isBefore(ReadablePartial paramReadablePartial)
  {
    if (paramReadablePartial != null) {
      return compareTo(paramReadablePartial) < 0;
    }
    throw new IllegalArgumentException("Partial cannot be null");
  }
  
  public boolean isEqual(ReadablePartial paramReadablePartial)
  {
    if (paramReadablePartial != null) {
      return compareTo(paramReadablePartial) == 0;
    }
    throw new IllegalArgumentException("Partial cannot be null");
  }
  
  public boolean isSupported(DateTimeFieldType paramDateTimeFieldType)
  {
    return indexOf(paramDateTimeFieldType) != -1;
  }
  
  public DateTime toDateTime(ReadableInstant paramReadableInstant)
  {
    Chronology localChronology = DateTimeUtils.getInstantChronology(paramReadableInstant);
    return new DateTime(localChronology.set(this, DateTimeUtils.getInstantMillis(paramReadableInstant)), localChronology);
  }
  
  public String toString(DateTimeFormatter paramDateTimeFormatter)
  {
    if (paramDateTimeFormatter == null) {
      return toString();
    }
    return paramDateTimeFormatter.print(this);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/base/AbstractPartial.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */