package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Minutes
  extends BaseSingleFieldPeriod
{
  public static final Minutes MAX_VALUE = new Minutes(Integer.MAX_VALUE);
  public static final Minutes MIN_VALUE = new Minutes(Integer.MIN_VALUE);
  public static final Minutes ONE;
  private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.minutes());
  public static final Minutes THREE;
  public static final Minutes TWO;
  public static final Minutes ZERO = new Minutes(0);
  private static final long serialVersionUID = 87525275727380863L;
  
  static
  {
    ONE = new Minutes(1);
    TWO = new Minutes(2);
    THREE = new Minutes(3);
  }
  
  private Minutes(int paramInt)
  {
    super(paramInt);
  }
  
  public static Minutes minutes(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE)
    {
      if (paramInt != Integer.MAX_VALUE)
      {
        switch (paramInt)
        {
        default: 
          return new Minutes(paramInt);
        case 3: 
          return THREE;
        case 2: 
          return TWO;
        case 1: 
          return ONE;
        }
        return ZERO;
      }
      return MAX_VALUE;
    }
    return MIN_VALUE;
  }
  
  public static Minutes minutesBetween(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    return minutes(BaseSingleFieldPeriod.between(paramReadableInstant1, paramReadableInstant2, DurationFieldType.minutes()));
  }
  
  public static Minutes minutesBetween(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    if (((paramReadablePartial1 instanceof LocalTime)) && ((paramReadablePartial2 instanceof LocalTime))) {}
    for (int i = DateTimeUtils.getChronology(paramReadablePartial1.getChronology()).minutes().getDifference(((LocalTime)paramReadablePartial2).getLocalMillis(), ((LocalTime)paramReadablePartial1).getLocalMillis());; i = BaseSingleFieldPeriod.between(paramReadablePartial1, paramReadablePartial2, ZERO)) {
      return minutes(i);
    }
  }
  
  public static Minutes minutesIn(ReadableInterval paramReadableInterval)
  {
    if (paramReadableInterval == null) {
      return ZERO;
    }
    return minutes(BaseSingleFieldPeriod.between(paramReadableInterval.getStart(), paramReadableInterval.getEnd(), DurationFieldType.minutes()));
  }
  
  @FromString
  public static Minutes parseMinutes(String paramString)
  {
    if (paramString == null) {
      return ZERO;
    }
    return minutes(PARSER.parsePeriod(paramString).getMinutes());
  }
  
  private Object readResolve()
  {
    return minutes(getValue());
  }
  
  public static Minutes standardMinutesIn(ReadablePeriod paramReadablePeriod)
  {
    return minutes(BaseSingleFieldPeriod.standardPeriodIn(paramReadablePeriod, 60000L));
  }
  
  public final Minutes dividedBy(int paramInt)
  {
    if (paramInt == 1) {
      return this;
    }
    return minutes(getValue() / paramInt);
  }
  
  public final DurationFieldType getFieldType()
  {
    return DurationFieldType.minutes();
  }
  
  public final int getMinutes()
  {
    return getValue();
  }
  
  public final PeriodType getPeriodType()
  {
    return PeriodType.minutes();
  }
  
  public final boolean isGreaterThan(Minutes paramMinutes)
  {
    if (paramMinutes == null) {
      return getValue() > 0;
    }
    return getValue() > paramMinutes.getValue();
  }
  
  public final boolean isLessThan(Minutes paramMinutes)
  {
    if (paramMinutes == null) {
      return getValue() < 0;
    }
    return getValue() < paramMinutes.getValue();
  }
  
  public final Minutes minus(int paramInt)
  {
    return plus(FieldUtils.safeNegate(paramInt));
  }
  
  public final Minutes minus(Minutes paramMinutes)
  {
    if (paramMinutes == null) {
      return this;
    }
    return minus(paramMinutes.getValue());
  }
  
  public final Minutes multipliedBy(int paramInt)
  {
    return minutes(FieldUtils.safeMultiply(getValue(), paramInt));
  }
  
  public final Minutes negated()
  {
    return minutes(FieldUtils.safeNegate(getValue()));
  }
  
  public final Minutes plus(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    return minutes(FieldUtils.safeAdd(getValue(), paramInt));
  }
  
  public final Minutes plus(Minutes paramMinutes)
  {
    if (paramMinutes == null) {
      return this;
    }
    return plus(paramMinutes.getValue());
  }
  
  public final Days toStandardDays()
  {
    return Days.days(getValue() / 1440);
  }
  
  public final Duration toStandardDuration()
  {
    return new Duration(getValue() * 60000L);
  }
  
  public final Hours toStandardHours()
  {
    return Hours.hours(getValue() / 60);
  }
  
  public final Seconds toStandardSeconds()
  {
    return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 60));
  }
  
  public final Weeks toStandardWeeks()
  {
    return Weeks.weeks(getValue() / 10080);
  }
  
  @ToString
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PT");
    localStringBuilder.append(String.valueOf(getValue()));
    localStringBuilder.append("M");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Minutes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */