package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class Instant
  extends AbstractInstant
  implements Serializable, ReadableInstant
{
  private static final long serialVersionUID = 3299096530934209741L;
  private final long iMillis;
  
  public Instant()
  {
    this.iMillis = DateTimeUtils.currentTimeMillis();
  }
  
  public Instant(long paramLong)
  {
    this.iMillis = paramLong;
  }
  
  public Instant(Object paramObject)
  {
    this.iMillis = ConverterManager.getInstance().getInstantConverter(paramObject).getInstantMillis(paramObject, ISOChronology.getInstanceUTC());
  }
  
  public static Instant now()
  {
    return new Instant();
  }
  
  @FromString
  public static Instant parse(String paramString)
  {
    return parse(paramString, ISODateTimeFormat.dateTimeParser());
  }
  
  public static Instant parse(String paramString, DateTimeFormatter paramDateTimeFormatter)
  {
    return paramDateTimeFormatter.parseDateTime(paramString).toInstant();
  }
  
  public final Chronology getChronology()
  {
    return ISOChronology.getInstanceUTC();
  }
  
  public final long getMillis()
  {
    return this.iMillis;
  }
  
  public final Instant minus(long paramLong)
  {
    return withDurationAdded(paramLong, -1);
  }
  
  public final Instant minus(ReadableDuration paramReadableDuration)
  {
    return withDurationAdded(paramReadableDuration, -1);
  }
  
  public final Instant plus(long paramLong)
  {
    return withDurationAdded(paramLong, 1);
  }
  
  public final Instant plus(ReadableDuration paramReadableDuration)
  {
    return withDurationAdded(paramReadableDuration, 1);
  }
  
  public final DateTime toDateTime()
  {
    return new DateTime(getMillis(), ISOChronology.getInstance());
  }
  
  @Deprecated
  public final DateTime toDateTimeISO()
  {
    return toDateTime();
  }
  
  public final Instant toInstant()
  {
    return this;
  }
  
  public final MutableDateTime toMutableDateTime()
  {
    return new MutableDateTime(getMillis(), ISOChronology.getInstance());
  }
  
  @Deprecated
  public final MutableDateTime toMutableDateTimeISO()
  {
    return toMutableDateTime();
  }
  
  public final Instant withDurationAdded(long paramLong, int paramInt)
  {
    if (paramLong != 0L)
    {
      if (paramInt == 0) {
        return this;
      }
      return withMillis(getChronology().add(getMillis(), paramLong, paramInt));
    }
    return this;
  }
  
  public final Instant withDurationAdded(ReadableDuration paramReadableDuration, int paramInt)
  {
    if (paramReadableDuration != null)
    {
      if (paramInt == 0) {
        return this;
      }
      return withDurationAdded(paramReadableDuration.getMillis(), paramInt);
    }
    return this;
  }
  
  public final Instant withMillis(long paramLong)
  {
    if (paramLong == this.iMillis) {
      return this;
    }
    return new Instant(paramLong);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Instant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */