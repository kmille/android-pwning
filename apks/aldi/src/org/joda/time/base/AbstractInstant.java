package org.joda.time.base;

import java.util.Date;
import org.joda.convert.ToString;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public abstract class AbstractInstant
  implements ReadableInstant
{
  public int compareTo(ReadableInstant paramReadableInstant)
  {
    if (this == paramReadableInstant) {
      return 0;
    }
    long l1 = paramReadableInstant.getMillis();
    long l2 = getMillis();
    if (l2 == l1) {
      return 0;
    }
    if (l2 < l1) {
      return -1;
    }
    return 1;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ReadableInstant)) {
      return false;
    }
    paramObject = (ReadableInstant)paramObject;
    return (getMillis() == ((ReadableInstant)paramObject).getMillis()) && (FieldUtils.equals(getChronology(), ((ReadableInstant)paramObject).getChronology()));
  }
  
  public int get(DateTimeField paramDateTimeField)
  {
    if (paramDateTimeField != null) {
      return paramDateTimeField.get(getMillis());
    }
    throw new IllegalArgumentException("The DateTimeField must not be null");
  }
  
  public int get(DateTimeFieldType paramDateTimeFieldType)
  {
    if (paramDateTimeFieldType != null) {
      return paramDateTimeFieldType.getField(getChronology()).get(getMillis());
    }
    throw new IllegalArgumentException("The DateTimeFieldType must not be null");
  }
  
  public DateTimeZone getZone()
  {
    return getChronology().getZone();
  }
  
  public int hashCode()
  {
    return (int)(getMillis() ^ getMillis() >>> 32) + getChronology().hashCode();
  }
  
  public boolean isAfter(long paramLong)
  {
    return getMillis() > paramLong;
  }
  
  public boolean isAfter(ReadableInstant paramReadableInstant)
  {
    return isAfter(DateTimeUtils.getInstantMillis(paramReadableInstant));
  }
  
  public boolean isAfterNow()
  {
    return isAfter(DateTimeUtils.currentTimeMillis());
  }
  
  public boolean isBefore(long paramLong)
  {
    return getMillis() < paramLong;
  }
  
  public boolean isBefore(ReadableInstant paramReadableInstant)
  {
    return isBefore(DateTimeUtils.getInstantMillis(paramReadableInstant));
  }
  
  public boolean isBeforeNow()
  {
    return isBefore(DateTimeUtils.currentTimeMillis());
  }
  
  public boolean isEqual(long paramLong)
  {
    return getMillis() == paramLong;
  }
  
  public boolean isEqual(ReadableInstant paramReadableInstant)
  {
    return isEqual(DateTimeUtils.getInstantMillis(paramReadableInstant));
  }
  
  public boolean isEqualNow()
  {
    return isEqual(DateTimeUtils.currentTimeMillis());
  }
  
  public boolean isSupported(DateTimeFieldType paramDateTimeFieldType)
  {
    if (paramDateTimeFieldType == null) {
      return false;
    }
    return paramDateTimeFieldType.getField(getChronology()).isSupported();
  }
  
  public Date toDate()
  {
    return new Date(getMillis());
  }
  
  public DateTime toDateTime()
  {
    return new DateTime(getMillis(), getZone());
  }
  
  public DateTime toDateTime(Chronology paramChronology)
  {
    return new DateTime(getMillis(), paramChronology);
  }
  
  public DateTime toDateTime(DateTimeZone paramDateTimeZone)
  {
    paramDateTimeZone = DateTimeUtils.getChronology(getChronology()).withZone(paramDateTimeZone);
    return new DateTime(getMillis(), paramDateTimeZone);
  }
  
  public DateTime toDateTimeISO()
  {
    return new DateTime(getMillis(), ISOChronology.getInstance(getZone()));
  }
  
  public Instant toInstant()
  {
    return new Instant(getMillis());
  }
  
  public MutableDateTime toMutableDateTime()
  {
    return new MutableDateTime(getMillis(), getZone());
  }
  
  public MutableDateTime toMutableDateTime(Chronology paramChronology)
  {
    return new MutableDateTime(getMillis(), paramChronology);
  }
  
  public MutableDateTime toMutableDateTime(DateTimeZone paramDateTimeZone)
  {
    paramDateTimeZone = DateTimeUtils.getChronology(getChronology()).withZone(paramDateTimeZone);
    return new MutableDateTime(getMillis(), paramDateTimeZone);
  }
  
  public MutableDateTime toMutableDateTimeISO()
  {
    return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone()));
  }
  
  @ToString
  public String toString()
  {
    return ISODateTimeFormat.dateTime().print(this);
  }
  
  public String toString(DateTimeFormatter paramDateTimeFormatter)
  {
    if (paramDateTimeFormatter == null) {
      return toString();
    }
    return paramDateTimeFormatter.print(this);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/base/AbstractInstant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */