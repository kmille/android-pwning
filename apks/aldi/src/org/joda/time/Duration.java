package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

public final class Duration
  extends BaseDuration
  implements Serializable, ReadableDuration
{
  public static final Duration ZERO = new Duration(0L);
  private static final long serialVersionUID = 2471658376918L;
  
  public Duration(long paramLong)
  {
    super(paramLong);
  }
  
  public Duration(long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public Duration(Object paramObject)
  {
    super(paramObject);
  }
  
  public Duration(ReadableInstant paramReadableInstant1, ReadableInstant paramReadableInstant2)
  {
    super(paramReadableInstant1, paramReadableInstant2);
  }
  
  public static Duration millis(long paramLong)
  {
    if (paramLong == 0L) {
      return ZERO;
    }
    return new Duration(paramLong);
  }
  
  @FromString
  public static Duration parse(String paramString)
  {
    return new Duration(paramString);
  }
  
  public static Duration standardDays(long paramLong)
  {
    if (paramLong == 0L) {
      return ZERO;
    }
    return new Duration(FieldUtils.safeMultiply(paramLong, 86400000));
  }
  
  public static Duration standardHours(long paramLong)
  {
    if (paramLong == 0L) {
      return ZERO;
    }
    return new Duration(FieldUtils.safeMultiply(paramLong, 3600000));
  }
  
  public static Duration standardMinutes(long paramLong)
  {
    if (paramLong == 0L) {
      return ZERO;
    }
    return new Duration(FieldUtils.safeMultiply(paramLong, 60000));
  }
  
  public static Duration standardSeconds(long paramLong)
  {
    if (paramLong == 0L) {
      return ZERO;
    }
    return new Duration(FieldUtils.safeMultiply(paramLong, 1000));
  }
  
  public final Duration dividedBy(long paramLong)
  {
    if (paramLong == 1L) {
      return this;
    }
    return new Duration(FieldUtils.safeDivide(getMillis(), paramLong));
  }
  
  public final long getStandardDays()
  {
    return getMillis() / 86400000L;
  }
  
  public final long getStandardHours()
  {
    return getMillis() / 3600000L;
  }
  
  public final long getStandardMinutes()
  {
    return getMillis() / 60000L;
  }
  
  public final long getStandardSeconds()
  {
    return getMillis() / 1000L;
  }
  
  public final Duration minus(long paramLong)
  {
    return withDurationAdded(paramLong, -1);
  }
  
  public final Duration minus(ReadableDuration paramReadableDuration)
  {
    if (paramReadableDuration == null) {
      return this;
    }
    return withDurationAdded(paramReadableDuration.getMillis(), -1);
  }
  
  public final Duration multipliedBy(long paramLong)
  {
    if (paramLong == 1L) {
      return this;
    }
    return new Duration(FieldUtils.safeMultiply(getMillis(), paramLong));
  }
  
  public final Duration negated()
  {
    if (getMillis() != Long.MIN_VALUE) {
      return new Duration(-getMillis());
    }
    throw new ArithmeticException("Negation of this duration would overflow");
  }
  
  public final Duration plus(long paramLong)
  {
    return withDurationAdded(paramLong, 1);
  }
  
  public final Duration plus(ReadableDuration paramReadableDuration)
  {
    if (paramReadableDuration == null) {
      return this;
    }
    return withDurationAdded(paramReadableDuration.getMillis(), 1);
  }
  
  public final Duration toDuration()
  {
    return this;
  }
  
  public final Days toStandardDays()
  {
    return Days.days(FieldUtils.safeToInt(getStandardDays()));
  }
  
  public final Hours toStandardHours()
  {
    return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
  }
  
  public final Minutes toStandardMinutes()
  {
    return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
  }
  
  public final Seconds toStandardSeconds()
  {
    return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
  }
  
  public final Duration withDurationAdded(long paramLong, int paramInt)
  {
    if (paramLong != 0L)
    {
      if (paramInt == 0) {
        return this;
      }
      paramLong = FieldUtils.safeMultiply(paramLong, paramInt);
      return new Duration(FieldUtils.safeAdd(getMillis(), paramLong));
    }
    return this;
  }
  
  public final Duration withDurationAdded(ReadableDuration paramReadableDuration, int paramInt)
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
  
  public final Duration withMillis(long paramLong)
  {
    if (paramLong == getMillis()) {
      return this;
    }
    return new Duration(paramLong);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/Duration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */