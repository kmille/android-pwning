package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Years
  extends BaseSingleFieldPeriod
{
  public static final Years MAX_VALUE = new Years(Integer.MAX_VALUE);
  public static final Years MIN_VALUE = new Years(Integer.MIN_VALUE);
  public static final Years ONE;
  private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.years());
  public static final Years THREE;
  public static final Years TWO;
  public static final Years ZERO = new Years(0);
  private static final long serialVersionUID = 87525275727380868L;
  
  static
  {
    ONE = new Years(1);
    TWO = new Years(2);
    THREE = new Years(3);
  }
  
  private Years(int paramInt)
  {
    super(paramInt);
  }
  
  @FromString
  public static Years parseYears(String paramString)
  {
    if (paramString == null) {
      return ZERO;
    }
    return years(PARSER.parsePeriod(paramString).getYears());
  }
  
  private Object readResolve()
  {
    return years(getValue());
  }
  
  public static Years years(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE)
    {
      if (paramInt != Integer.MAX_VALUE)
      {
        switch (paramInt)
        {
        default: 
          return new Years(paramInt);
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
  
  public static Years yearsBetween(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    return years(BaseSingleFieldPeriod.between(paramReadableInstant1, paramReadableInstant2, DurationFieldType.years()));
  }
  
  public static Years yearsBetween(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    if (((paramReadablePartial1 instanceof LocalDate)) && ((paramReadablePartial2 instanceof LocalDate))) {}
    for (int i = DateTimeUtils.getChronology(paramReadablePartial1.getChronology()).years().getDifference(((LocalDate)paramReadablePartial2).getLocalMillis(), ((LocalDate)paramReadablePartial1).getLocalMillis());; i = BaseSingleFieldPeriod.between(paramReadablePartial1, paramReadablePartial2, ZERO)) {
      return years(i);
    }
  }
  
  public static Years yearsIn(ReadableInterval paramReadableInterval)
  {
    if (paramReadableInterval == null) {
      return ZERO;
    }
    return years(BaseSingleFieldPeriod.between(paramReadableInterval.getStart(), paramReadableInterval.getEnd(), DurationFieldType.years()));
  }
  
  public final Years dividedBy(int paramInt)
  {
    if (paramInt == 1) {
      return this;
    }
    return years(getValue() / paramInt);
  }
  
  public final DurationFieldType getFieldType()
  {
    return DurationFieldType.years();
  }
  
  public final PeriodType getPeriodType()
  {
    return PeriodType.years();
  }
  
  public final int getYears()
  {
    return getValue();
  }
  
  public final boolean isGreaterThan(Years paramYears)
  {
    if (paramYears == null) {
      return getValue() > 0;
    }
    return getValue() > paramYears.getValue();
  }
  
  public final boolean isLessThan(Years paramYears)
  {
    if (paramYears == null) {
      return getValue() < 0;
    }
    return getValue() < paramYears.getValue();
  }
  
  public final Years minus(int paramInt)
  {
    return plus(FieldUtils.safeNegate(paramInt));
  }
  
  public final Years minus(Years paramYears)
  {
    if (paramYears == null) {
      return this;
    }
    return minus(paramYears.getValue());
  }
  
  public final Years multipliedBy(int paramInt)
  {
    return years(FieldUtils.safeMultiply(getValue(), paramInt));
  }
  
  public final Years negated()
  {
    return years(FieldUtils.safeNegate(getValue()));
  }
  
  public final Years plus(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    return years(FieldUtils.safeAdd(getValue(), paramInt));
  }
  
  public final Years plus(Years paramYears)
  {
    if (paramYears == null) {
      return this;
    }
    return plus(paramYears.getValue());
  }
  
  @ToString
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("P");
    localStringBuilder.append(String.valueOf(getValue()));
    localStringBuilder.append("Y");
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Years.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */