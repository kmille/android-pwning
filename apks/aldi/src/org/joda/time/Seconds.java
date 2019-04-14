package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Seconds
  extends BaseSingleFieldPeriod
{
  public static final Seconds MAX_VALUE = new Seconds(Integer.MAX_VALUE);
  public static final Seconds MIN_VALUE = new Seconds(Integer.MIN_VALUE);
  public static final Seconds ONE;
  private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.seconds());
  public static final Seconds THREE;
  public static final Seconds TWO;
  public static final Seconds ZERO = new Seconds(0);
  private static final long serialVersionUID = 87525275727380862L;
  
  static
  {
    ONE = new Seconds(1);
    TWO = new Seconds(2);
    THREE = new Seconds(3);
  }
  
  private Seconds(int paramInt)
  {
    super(paramInt);
  }
  
  @FromString
  public static Seconds parseSeconds(String paramString)
  {
    if (paramString == null) {
      return ZERO;
    }
    return seconds(PARSER.parsePeriod(paramString).getSeconds());
  }
  
  private Object readResolve()
  {
    return seconds(getValue());
  }
  
  public static Seconds seconds(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE)
    {
      if (paramInt != Integer.MAX_VALUE)
      {
        switch (paramInt)
        {
        default: 
          return new Seconds(paramInt);
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
  
  public static Seconds secondsBetween(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    return seconds(BaseSingleFieldPeriod.between(paramReadableInstant1, paramReadableInstant2, DurationFieldType.seconds()));
  }
  
  public static Seconds secondsBetween(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    if (((paramReadablePartial1 instanceof LocalTime)) && ((paramReadablePartial2 instanceof LocalTime))) {}
    for (int i = DateTimeUtils.getChronology(paramReadablePartial1.getChronology()).seconds().getDifference(((LocalTime)paramReadablePartial2).getLocalMillis(), ((LocalTime)paramReadablePartial1).getLocalMillis());; i = BaseSingleFieldPeriod.between(paramReadablePartial1, paramReadablePartial2, ZERO)) {
      return seconds(i);
    }
  }
  
  public static Seconds secondsIn(ReadableInterval paramReadableInterval)
  {
    if (paramReadableInterval == null) {
      return ZERO;
    }
    return seconds(BaseSingleFieldPeriod.between(paramReadableInterval.getStart(), paramReadableInterval.getEnd(), DurationFieldType.seconds()));
  }
  
  public static Seconds standardSecondsIn(ReadablePeriod paramReadablePeriod)
  {
    return seconds(BaseSingleFieldPeriod.standardPeriodIn(paramReadablePeriod, 1000L));
  }
  
  public final Seconds dividedBy(int paramInt)
  {
    if (paramInt == 1) {
      return this;
    }
    return seconds(getValue() / paramInt);
  }
  
  public final DurationFieldType getFieldType()
  {
    return DurationFieldType.seconds();
  }
  
  public final PeriodType getPeriodType()
  {
    return PeriodType.seconds();
  }
  
  public final int getSeconds()
  {
    return getValue();
  }
  
  public final boolean isGreaterThan(Seconds paramSeconds)
  {
    if (paramSeconds == null) {
      return getValue() > 0;
    }
    return getValue() > paramSeconds.getValue();
  }
  
  public final boolean isLessThan(Seconds paramSeconds)
  {
    if (paramSeconds == null) {
      return getValue() < 0;
    }
    return getValue() < paramSeconds.getValue();
  }
  
  public final Seconds minus(int paramInt)
  {
    return plus(FieldUtils.safeNegate(paramInt));
  }
  
  public final Seconds minus(Seconds paramSeconds)
  {
    if (paramSeconds == null) {
      return this;
    }
    return minus(paramSeconds.getValue());
  }
  
  public final Seconds multipliedBy(int paramInt)
  {
    return seconds(FieldUtils.safeMultiply(getValue(), paramInt));
  }
  
  public final Seconds negated()
  {
    return seconds(FieldUtils.safeNegate(getValue()));
  }
  
  public final Seconds plus(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    return seconds(FieldUtils.safeAdd(getValue(), paramInt));
  }
  
  public final Seconds plus(Seconds paramSeconds)
  {
    if (paramSeconds == null) {
      return this;
    }
    return plus(paramSeconds.getValue());
  }
  
  public final Days toStandardDays()
  {
    return Days.days(getValue() / 86400);
  }
  
  public final Duration toStandardDuration()
  {
    return new Duration(getValue() * 1000L);
  }
  
  public final Hours toStandardHours()
  {
    return Hours.hours(getValue() / 3600);
  }
  
  public final Minutes toStandardMinutes()
  {
    return Minutes.minutes(getValue() / 60);
  }
  
  public final Weeks toStandardWeeks()
  {
    return Weeks.weeks(getValue() / 604800);
  }
  
  @ToString
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PT");
    localStringBuilder.append(String.valueOf(getValue()));
    localStringBuilder.append("S");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Seconds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */