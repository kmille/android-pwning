package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.DurationConverter;
import org.joda.time.field.FieldUtils;

public abstract class BaseDuration
  extends AbstractDuration
  implements Serializable, ReadableDuration
{
  private static final long serialVersionUID = 2581698638990L;
  private volatile long iMillis;
  
  protected BaseDuration(long paramLong)
  {
    this.iMillis = paramLong;
  }
  
  protected BaseDuration(long paramLong1, long paramLong2)
  {
    this.iMillis = FieldUtils.safeSubtract(paramLong2, paramLong1);
  }
  
  protected BaseDuration(Object paramObject)
  {
    this.iMillis = ConverterManager.getInstance().getDurationConverter(paramObject).getDurationMillis(paramObject);
  }
  
  protected BaseDuration(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    if (paramReadableInstant1 == paramReadableInstant2) {}
    for (long l = 0L;; l = FieldUtils.safeSubtract(DateTimeUtils.getInstantMillis(paramReadableInstant2), l))
    {
      this.iMillis = l;
      return;
      l = DateTimeUtils.getInstantMillis(paramReadableInstant1);
    }
  }
  
  public long getMillis()
  {
    return this.iMillis;
  }
  
  protected void setMillis(long paramLong)
  {
    this.iMillis = paramLong;
  }
  
  public Interval toIntervalFrom(ReadableInstant paramReadableInstant)
  {
    return new Interval(paramReadableInstant, this);
  }
  
  public Interval toIntervalTo(ReadableInstant paramReadableInstant)
  {
    return new Interval(this, paramReadableInstant);
  }
  
  public Period toPeriod(Chronology paramChronology)
  {
    return new Period(getMillis(), paramChronology);
  }
  
  public Period toPeriod(PeriodType paramPeriodType)
  {
    return new Period(getMillis(), paramPeriodType);
  }
  
  public Period toPeriod(PeriodType paramPeriodType, Chronology paramChronology)
  {
    return new Period(getMillis(), paramPeriodType, paramChronology);
  }
  
  public Period toPeriodFrom(ReadableInstant paramReadableInstant)
  {
    return new Period(paramReadableInstant, this);
  }
  
  public Period toPeriodFrom(ReadableInstant paramReadableInstant, PeriodType paramPeriodType)
  {
    return new Period(paramReadableInstant, this, paramPeriodType);
  }
  
  public Period toPeriodTo(ReadableInstant paramReadableInstant)
  {
    return new Period(this, paramReadableInstant);
  }
  
  public Period toPeriodTo(ReadableInstant paramReadableInstant, PeriodType paramPeriodType)
  {
    return new Period(this, paramReadableInstant, paramPeriodType);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/base/BaseDuration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */