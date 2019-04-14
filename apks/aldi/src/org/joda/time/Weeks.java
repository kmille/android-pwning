package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Weeks
  extends BaseSingleFieldPeriod
{
  public static final Weeks MAX_VALUE = new Weeks(Integer.MAX_VALUE);
  public static final Weeks MIN_VALUE = new Weeks(Integer.MIN_VALUE);
  public static final Weeks ONE;
  private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());
  public static final Weeks THREE;
  public static final Weeks TWO;
  public static final Weeks ZERO = new Weeks(0);
  private static final long serialVersionUID = 87525275727380866L;
  
  static
  {
    ONE = new Weeks(1);
    TWO = new Weeks(2);
    THREE = new Weeks(3);
  }
  
  private Weeks(int paramInt)
  {
    super(paramInt);
  }
  
  @FromString
  public static Weeks parseWeeks(String paramString)
  {
    if (paramString == null) {
      return ZERO;
    }
    return weeks(PARSER.parsePeriod(paramString).getWeeks());
  }
  
  private Object readResolve()
  {
    return weeks(getValue());
  }
  
  public static Weeks standardWeeksIn(ReadablePeriod paramReadablePeriod)
  {
    return weeks(BaseSingleFieldPeriod.standardPeriodIn(paramReadablePeriod, 604800000L));
  }
  
  public static Weeks weeks(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE)
    {
      if (paramInt != Integer.MAX_VALUE)
      {
        switch (paramInt)
        {
        default: 
          return new Weeks(paramInt);
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
  
  public static Weeks weeksBetween(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    return weeks(BaseSingleFieldPeriod.between(paramReadableInstant1, paramReadableInstant2, DurationFieldType.weeks()));
  }
  
  public static Weeks weeksBetween(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    if (((paramReadablePartial1 instanceof LocalDate)) && ((paramReadablePartial2 instanceof LocalDate))) {}
    for (int i = DateTimeUtils.getChronology(paramReadablePartial1.getChronology()).weeks().getDifference(((LocalDate)paramReadablePartial2).getLocalMillis(), ((LocalDate)paramReadablePartial1).getLocalMillis());; i = BaseSingleFieldPeriod.between(paramReadablePartial1, paramReadablePartial2, ZERO)) {
      return weeks(i);
    }
  }
  
  public static Weeks weeksIn(ReadableInterval paramReadableInterval)
  {
    if (paramReadableInterval == null) {
      return ZERO;
    }
    return weeks(BaseSingleFieldPeriod.between(paramReadableInterval.getStart(), paramReadableInterval.getEnd(), DurationFieldType.weeks()));
  }
  
  public final Weeks dividedBy(int paramInt)
  {
    if (paramInt == 1) {
      return this;
    }
    return weeks(getValue() / paramInt);
  }
  
  public final DurationFieldType getFieldType()
  {
    return DurationFieldType.weeks();
  }
  
  public final PeriodType getPeriodType()
  {
    return PeriodType.weeks();
  }
  
  public final int getWeeks()
  {
    return getValue();
  }
  
  public final boolean isGreaterThan(Weeks paramWeeks)
  {
    if (paramWeeks == null) {
      return getValue() > 0;
    }
    return getValue() > paramWeeks.getValue();
  }
  
  public final boolean isLessThan(Weeks paramWeeks)
  {
    if (paramWeeks == null) {
      return getValue() < 0;
    }
    return getValue() < paramWeeks.getValue();
  }
  
  public final Weeks minus(int paramInt)
  {
    return plus(FieldUtils.safeNegate(paramInt));
  }
  
  public final Weeks minus(Weeks paramWeeks)
  {
    if (paramWeeks == null) {
      return this;
    }
    return minus(paramWeeks.getValue());
  }
  
  public final Weeks multipliedBy(int paramInt)
  {
    return weeks(FieldUtils.safeMultiply(getValue(), paramInt));
  }
  
  public final Weeks negated()
  {
    return weeks(FieldUtils.safeNegate(getValue()));
  }
  
  public final Weeks plus(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    return weeks(FieldUtils.safeAdd(getValue(), paramInt));
  }
  
  public final Weeks plus(Weeks paramWeeks)
  {
    if (paramWeeks == null) {
      return this;
    }
    return plus(paramWeeks.getValue());
  }
  
  public final Days toStandardDays()
  {
    return Days.days(FieldUtils.safeMultiply(getValue(), 7));
  }
  
  public final Duration toStandardDuration()
  {
    return new Duration(getValue() * 604800000L);
  }
  
  public final Hours toStandardHours()
  {
    return Hours.hours(FieldUtils.safeMultiply(getValue(), 168));
  }
  
  public final Minutes toStandardMinutes()
  {
    return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 10080));
  }
  
  public final Seconds toStandardSeconds()
  {
    return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 604800));
  }
  
  @ToString
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("P");
    localStringBuilder.append(String.valueOf(getValue()));
    localStringBuilder.append("W");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Weeks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */