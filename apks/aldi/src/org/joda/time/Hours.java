package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Hours
  extends BaseSingleFieldPeriod
{
  public static final Hours EIGHT = new Hours(8);
  public static final Hours FIVE;
  public static final Hours FOUR;
  public static final Hours MAX_VALUE = new Hours(Integer.MAX_VALUE);
  public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);
  public static final Hours ONE;
  private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());
  public static final Hours SEVEN;
  public static final Hours SIX;
  public static final Hours THREE;
  public static final Hours TWO;
  public static final Hours ZERO = new Hours(0);
  private static final long serialVersionUID = 87525275727380864L;
  
  static
  {
    ONE = new Hours(1);
    TWO = new Hours(2);
    THREE = new Hours(3);
    FOUR = new Hours(4);
    FIVE = new Hours(5);
    SIX = new Hours(6);
    SEVEN = new Hours(7);
  }
  
  private Hours(int paramInt)
  {
    super(paramInt);
  }
  
  public static Hours hours(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE)
    {
      if (paramInt != Integer.MAX_VALUE)
      {
        switch (paramInt)
        {
        default: 
          return new Hours(paramInt);
        case 8: 
          return EIGHT;
        case 7: 
          return SEVEN;
        case 6: 
          return SIX;
        case 5: 
          return FIVE;
        case 4: 
          return FOUR;
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
  
  public static Hours hoursBetween(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    return hours(BaseSingleFieldPeriod.between(paramReadableInstant1, paramReadableInstant2, DurationFieldType.hours()));
  }
  
  public static Hours hoursBetween(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    if (((paramReadablePartial1 instanceof LocalTime)) && ((paramReadablePartial2 instanceof LocalTime))) {}
    for (int i = DateTimeUtils.getChronology(paramReadablePartial1.getChronology()).hours().getDifference(((LocalTime)paramReadablePartial2).getLocalMillis(), ((LocalTime)paramReadablePartial1).getLocalMillis());; i = BaseSingleFieldPeriod.between(paramReadablePartial1, paramReadablePartial2, ZERO)) {
      return hours(i);
    }
  }
  
  public static Hours hoursIn(ReadableInterval paramReadableInterval)
  {
    if (paramReadableInterval == null) {
      return ZERO;
    }
    return hours(BaseSingleFieldPeriod.between(paramReadableInterval.getStart(), paramReadableInterval.getEnd(), DurationFieldType.hours()));
  }
  
  @FromString
  public static Hours parseHours(String paramString)
  {
    if (paramString == null) {
      return ZERO;
    }
    return hours(PARSER.parsePeriod(paramString).getHours());
  }
  
  private Object readResolve()
  {
    return hours(getValue());
  }
  
  public static Hours standardHoursIn(ReadablePeriod paramReadablePeriod)
  {
    return hours(BaseSingleFieldPeriod.standardPeriodIn(paramReadablePeriod, 3600000L));
  }
  
  public final Hours dividedBy(int paramInt)
  {
    if (paramInt == 1) {
      return this;
    }
    return hours(getValue() / paramInt);
  }
  
  public final DurationFieldType getFieldType()
  {
    return DurationFieldType.hours();
  }
  
  public final int getHours()
  {
    return getValue();
  }
  
  public final PeriodType getPeriodType()
  {
    return PeriodType.hours();
  }
  
  public final boolean isGreaterThan(Hours paramHours)
  {
    if (paramHours == null) {
      return getValue() > 0;
    }
    return getValue() > paramHours.getValue();
  }
  
  public final boolean isLessThan(Hours paramHours)
  {
    if (paramHours == null) {
      return getValue() < 0;
    }
    return getValue() < paramHours.getValue();
  }
  
  public final Hours minus(int paramInt)
  {
    return plus(FieldUtils.safeNegate(paramInt));
  }
  
  public final Hours minus(Hours paramHours)
  {
    if (paramHours == null) {
      return this;
    }
    return minus(paramHours.getValue());
  }
  
  public final Hours multipliedBy(int paramInt)
  {
    return hours(FieldUtils.safeMultiply(getValue(), paramInt));
  }
  
  public final Hours negated()
  {
    return hours(FieldUtils.safeNegate(getValue()));
  }
  
  public final Hours plus(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    return hours(FieldUtils.safeAdd(getValue(), paramInt));
  }
  
  public final Hours plus(Hours paramHours)
  {
    if (paramHours == null) {
      return this;
    }
    return plus(paramHours.getValue());
  }
  
  public final Days toStandardDays()
  {
    return Days.days(getValue() / 24);
  }
  
  public final Duration toStandardDuration()
  {
    return new Duration(getValue() * 3600000L);
  }
  
  public final Minutes toStandardMinutes()
  {
    return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 60));
  }
  
  public final Seconds toStandardSeconds()
  {
    return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 3600));
  }
  
  public final Weeks toStandardWeeks()
  {
    return Weeks.weeks(getValue() / 168);
  }
  
  @ToString
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PT");
    localStringBuilder.append(String.valueOf(getValue()));
    localStringBuilder.append("H");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Hours.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */