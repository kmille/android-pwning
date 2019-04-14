package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Period
  extends BasePeriod
  implements Serializable, ReadablePeriod
{
  public static final Period ZERO = new Period();
  private static final long serialVersionUID = 741052353876488155L;
  
  public Period()
  {
    super(0L, null, null);
  }
  
  public Period(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(0, 0, 0, 0, paramInt1, paramInt2, paramInt3, paramInt4, PeriodType.standard());
  }
  
  public Period(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, PeriodType.standard());
  }
  
  public Period(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, PeriodType paramPeriodType)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramPeriodType);
  }
  
  public Period(long paramLong)
  {
    super(paramLong);
  }
  
  public Period(long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2, null, null);
  }
  
  public Period(long paramLong1, long paramLong2, Chronology paramChronology)
  {
    super(paramLong1, paramLong2, null, paramChronology);
  }
  
  public Period(long paramLong1, long paramLong2, PeriodType paramPeriodType)
  {
    super(paramLong1, paramLong2, paramPeriodType, null);
  }
  
  public Period(long paramLong1, long paramLong2, PeriodType paramPeriodType, Chronology paramChronology)
  {
    super(paramLong1, paramLong2, paramPeriodType, paramChronology);
  }
  
  public Period(long paramLong, Chronology paramChronology)
  {
    super(paramLong, null, paramChronology);
  }
  
  public Period(long paramLong, PeriodType paramPeriodType)
  {
    super(paramLong, paramPeriodType, null);
  }
  
  public Period(long paramLong, PeriodType paramPeriodType, Chronology paramChronology)
  {
    super(paramLong, paramPeriodType, paramChronology);
  }
  
  public Period(Object paramObject)
  {
    super(paramObject, null, null);
  }
  
  public Period(Object paramObject, Chronology paramChronology)
  {
    super(paramObject, null, paramChronology);
  }
  
  public Period(Object paramObject, PeriodType paramPeriodType)
  {
    super(paramObject, paramPeriodType, null);
  }
  
  public Period(Object paramObject, PeriodType paramPeriodType, Chronology paramChronology)
  {
    super(paramObject, paramPeriodType, paramChronology);
  }
  
  public Period(ReadableDuration paramReadableDuration, ReadableInstant paramReadableInstant)
  {
    super(paramReadableDuration, paramReadableInstant, null);
  }
  
  public Period(ReadableDuration paramReadableDuration, ReadableInstant paramReadableInstant, PeriodType paramPeriodType)
  {
    super(paramReadableDuration, paramReadableInstant, paramPeriodType);
  }
  
  public Period(ReadableInstant paramReadableInstant, ReadableDuration paramReadableDuration)
  {
    super(paramReadableInstant, paramReadableDuration, null);
  }
  
  public Period(ReadableInstant paramReadableInstant, ReadableDuration paramReadableDuration, PeriodType paramPeriodType)
  {
    super(paramReadableInstant, paramReadableDuration, paramPeriodType);
  }
  
  public Period(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    super(paramReadableInstant1, paramReadableInstant2, null);
  }
  
  public Period(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2, PeriodType paramPeriodType)
  {
    super(paramReadableInstant1, paramReadableInstant2, paramPeriodType);
  }
  
  public Period(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    super(paramReadablePartial1, paramReadablePartial2, null);
  }
  
  public Period(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2, PeriodType paramPeriodType)
  {
    super(paramReadablePartial1, paramReadablePartial2, paramPeriodType);
  }
  
  private Period(int[] paramArrayOfInt, PeriodType paramPeriodType)
  {
    super(paramArrayOfInt, paramPeriodType);
  }
  
  private void checkYearsAndMonths(String paramString)
  {
    if (getMonths() == 0)
    {
      if (getYears() == 0) {
        return;
      }
      localStringBuilder = new StringBuilder("Cannot convert to ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" as this period contains years and years vary in length");
      throw new UnsupportedOperationException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder("Cannot convert to ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" as this period contains months and months vary in length");
    throw new UnsupportedOperationException(localStringBuilder.toString());
  }
  
  public static Period days(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, 0, 0, paramInt, 0, 0, 0, 0 }, localPeriodType);
  }
  
  public static Period fieldDifference(ReadablePartial paramReadablePartial1, ReadablePartial paramReadablePartial2)
  {
    if ((paramReadablePartial1 != null) && (paramReadablePartial2 != null))
    {
      if (paramReadablePartial1.size() == paramReadablePartial2.size())
      {
        DurationFieldType[] arrayOfDurationFieldType = new DurationFieldType[paramReadablePartial1.size()];
        int[] arrayOfInt = new int[paramReadablePartial1.size()];
        int i = 0;
        int j = paramReadablePartial1.size();
        while (i < j) {
          if (paramReadablePartial1.getFieldType(i) == paramReadablePartial2.getFieldType(i))
          {
            arrayOfDurationFieldType[i] = paramReadablePartial1.getFieldType(i).getDurationType();
            if ((i > 0) && (arrayOfDurationFieldType[(i - 1)] == arrayOfDurationFieldType[i])) {
              throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
            }
            arrayOfInt[i] = (paramReadablePartial2.getValue(i) - paramReadablePartial1.getValue(i));
            i += 1;
          }
          else
          {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
          }
        }
        return new Period(arrayOfInt, PeriodType.forFields(arrayOfDurationFieldType));
      }
      throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
    }
    throw new IllegalArgumentException("ReadablePartial objects must not be null");
  }
  
  public static Period hours(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, 0, 0, 0, paramInt, 0, 0, 0 }, localPeriodType);
  }
  
  public static Period millis(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, 0, 0, 0, 0, 0, 0, paramInt }, localPeriodType);
  }
  
  public static Period minutes(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, 0, 0, 0, 0, paramInt, 0, 0 }, localPeriodType);
  }
  
  public static Period months(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, paramInt, 0, 0, 0, 0, 0, 0 }, localPeriodType);
  }
  
  @FromString
  public static Period parse(String paramString)
  {
    return parse(paramString, ISOPeriodFormat.standard());
  }
  
  public static Period parse(String paramString, PeriodFormatter paramPeriodFormatter)
  {
    return paramPeriodFormatter.parsePeriod(paramString);
  }
  
  public static Period seconds(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, 0, 0, 0, 0, 0, paramInt, 0 }, localPeriodType);
  }
  
  public static Period weeks(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { 0, 0, paramInt, 0, 0, 0, 0, 0 }, localPeriodType);
  }
  
  public static Period years(int paramInt)
  {
    PeriodType localPeriodType = PeriodType.standard();
    return new Period(new int[] { paramInt, 0, 0, 0, 0, 0, 0, 0, 0 }, localPeriodType);
  }
  
  public final int getDays()
  {
    return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
  }
  
  public final int getHours()
  {
    return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
  }
  
  public final int getMillis()
  {
    return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
  }
  
  public final int getMinutes()
  {
    return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
  }
  
  public final int getMonths()
  {
    return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
  }
  
  public final int getSeconds()
  {
    return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
  }
  
  public final int getWeeks()
  {
    return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
  }
  
  public final int getYears()
  {
    return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
  }
  
  public final Period minus(ReadablePeriod paramReadablePeriod)
  {
    if (paramReadablePeriod == null) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.YEARS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.MONTHS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.WEEKS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.DAYS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.HOURS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.MINUTES_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.SECONDS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, arrayOfInt, -paramReadablePeriod.get(DurationFieldType.MILLIS_TYPE));
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period minusDays(int paramInt)
  {
    return plusDays(-paramInt);
  }
  
  public final Period minusHours(int paramInt)
  {
    return plusHours(-paramInt);
  }
  
  public final Period minusMillis(int paramInt)
  {
    return plusMillis(-paramInt);
  }
  
  public final Period minusMinutes(int paramInt)
  {
    return plusMinutes(-paramInt);
  }
  
  public final Period minusMonths(int paramInt)
  {
    return plusMonths(-paramInt);
  }
  
  public final Period minusSeconds(int paramInt)
  {
    return plusSeconds(-paramInt);
  }
  
  public final Period minusWeeks(int paramInt)
  {
    return plusWeeks(-paramInt);
  }
  
  public final Period minusYears(int paramInt)
  {
    return plusYears(-paramInt);
  }
  
  public final Period multipliedBy(int paramInt)
  {
    if (this != ZERO)
    {
      if (paramInt == 1) {
        return this;
      }
      int[] arrayOfInt = getValues();
      int i = 0;
      while (i < arrayOfInt.length)
      {
        arrayOfInt[i] = FieldUtils.safeMultiply(arrayOfInt[i], paramInt);
        i += 1;
      }
      return new Period(arrayOfInt, getPeriodType());
    }
    return this;
  }
  
  public final Period negated()
  {
    return multipliedBy(-1);
  }
  
  public final Period normalizedStandard()
  {
    return normalizedStandard(PeriodType.standard());
  }
  
  public final Period normalizedStandard(PeriodType paramPeriodType)
  {
    PeriodType localPeriodType = DateTimeUtils.getPeriodType(paramPeriodType);
    Object localObject = new Period(getMillis() + getSeconds() * 1000L + getMinutes() * 60000L + getHours() * 3600000L + getDays() * 86400000L + getWeeks() * 604800000L, localPeriodType, ISOChronology.getInstanceUTC());
    int i = getYears();
    int j = getMonths();
    if (i == 0)
    {
      paramPeriodType = (PeriodType)localObject;
      if (j == 0) {}
    }
    else
    {
      long l2 = i * 12L + j;
      paramPeriodType = (PeriodType)localObject;
      long l1 = l2;
      if (localPeriodType.isSupported(DurationFieldType.YEARS_TYPE))
      {
        i = FieldUtils.safeToInt(l2 / 12L);
        paramPeriodType = ((Period)localObject).withYears(i);
        l1 = l2 - i * 12;
      }
      localObject = paramPeriodType;
      l2 = l1;
      if (localPeriodType.isSupported(DurationFieldType.MONTHS_TYPE))
      {
        i = FieldUtils.safeToInt(l1);
        localObject = paramPeriodType.withMonths(i);
        l2 = l1 - i;
      }
      if (l2 != 0L) {
        break label202;
      }
      paramPeriodType = (PeriodType)localObject;
    }
    return paramPeriodType;
    label202:
    paramPeriodType = new StringBuilder("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ");
    paramPeriodType.append(toString());
    throw new UnsupportedOperationException(paramPeriodType.toString());
  }
  
  public final Period plus(ReadablePeriod paramReadablePeriod)
  {
    if (paramReadablePeriod == null) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.YEARS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.MONTHS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.WEEKS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.DAYS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.HOURS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.MINUTES_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.SECONDS_TYPE));
    getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, arrayOfInt, paramReadablePeriod.get(DurationFieldType.MILLIS_TYPE));
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusDays(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusHours(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusMillis(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusMinutes(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusMonths(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusSeconds(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusWeeks(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period plusYears(int paramInt)
  {
    if (paramInt == 0) {
      return this;
    }
    int[] arrayOfInt = getValues();
    getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period toPeriod()
  {
    return this;
  }
  
  public final Days toStandardDays()
  {
    checkYearsAndMonths("Days");
    return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd((getMillis() + getSeconds() * 1000L + getMinutes() * 60000L + getHours() * 3600000L) / 86400000L, getDays()), getWeeks() * 7L)));
  }
  
  public final Duration toStandardDuration()
  {
    checkYearsAndMonths("Duration");
    return new Duration(getMillis() + getSeconds() * 1000L + getMinutes() * 60000L + getHours() * 3600000L + getDays() * 86400000L + getWeeks() * 604800000L);
  }
  
  public final Hours toStandardHours()
  {
    checkYearsAndMonths("Hours");
    return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd((getMillis() + getSeconds() * 1000L + getMinutes() * 60000L) / 3600000L, getHours()), getDays() * 24L), getWeeks() * 168L)));
  }
  
  public final Minutes toStandardMinutes()
  {
    checkYearsAndMonths("Minutes");
    return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd((getMillis() + getSeconds() * 1000L) / 60000L, getMinutes()), getHours() * 60L), getDays() * 1440L), getWeeks() * 10080L)));
  }
  
  public final Seconds toStandardSeconds()
  {
    checkYearsAndMonths("Seconds");
    return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(getMillis() / 1000, getSeconds()), getMinutes() * 60L), getHours() * 3600L), getDays() * 86400L), getWeeks() * 604800L)));
  }
  
  public final Weeks toStandardWeeks()
  {
    checkYearsAndMonths("Weeks");
    long l1 = getMillis();
    long l2 = getSeconds();
    long l3 = getMinutes();
    long l4 = getHours();
    long l5 = getDays();
    return Weeks.weeks(FieldUtils.safeToInt(getWeeks() + (l1 + l2 * 1000L + l3 * 60000L + l4 * 3600000L + l5 * 86400000L) / 604800000L));
  }
  
  public final Period withDays(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withField(DurationFieldType paramDurationFieldType, int paramInt)
  {
    if (paramDurationFieldType != null)
    {
      int[] arrayOfInt = getValues();
      super.setFieldInto(arrayOfInt, paramDurationFieldType, paramInt);
      return new Period(arrayOfInt, getPeriodType());
    }
    throw new IllegalArgumentException("Field must not be null");
  }
  
  public final Period withFieldAdded(DurationFieldType paramDurationFieldType, int paramInt)
  {
    if (paramDurationFieldType != null)
    {
      if (paramInt == 0) {
        return this;
      }
      int[] arrayOfInt = getValues();
      super.addFieldInto(arrayOfInt, paramDurationFieldType, paramInt);
      return new Period(arrayOfInt, getPeriodType());
    }
    throw new IllegalArgumentException("Field must not be null");
  }
  
  public final Period withFields(ReadablePeriod paramReadablePeriod)
  {
    if (paramReadablePeriod == null) {
      return this;
    }
    return new Period(super.mergePeriodInto(getValues(), paramReadablePeriod), getPeriodType());
  }
  
  public final Period withHours(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withMillis(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withMinutes(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withMonths(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withPeriodType(PeriodType paramPeriodType)
  {
    paramPeriodType = DateTimeUtils.getPeriodType(paramPeriodType);
    if (paramPeriodType.equals(getPeriodType())) {
      return this;
    }
    return new Period(this, paramPeriodType);
  }
  
  public final Period withSeconds(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withWeeks(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
  
  public final Period withYears(int paramInt)
  {
    int[] arrayOfInt = getValues();
    getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, arrayOfInt, paramInt);
    return new Period(arrayOfInt, getPeriodType());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Period.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */