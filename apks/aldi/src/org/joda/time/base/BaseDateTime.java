package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

public abstract class BaseDateTime
  extends AbstractDateTime
  implements Serializable, ReadableDateTime
{
  private static final long serialVersionUID = -6728882245981L;
  private volatile Chronology iChronology;
  private volatile long iMillis;
  
  public BaseDateTime()
  {
    this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
  }
  
  public BaseDateTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, ISOChronology.getInstance());
  }
  
  public BaseDateTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Chronology paramChronology)
  {
    this.iChronology = checkChronology(paramChronology);
    this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7), this.iChronology);
    adjustForMinMax();
  }
  
  public BaseDateTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, DateTimeZone paramDateTimeZone)
  {
    this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, ISOChronology.getInstance(paramDateTimeZone));
  }
  
  public BaseDateTime(long paramLong)
  {
    this(paramLong, ISOChronology.getInstance());
  }
  
  public BaseDateTime(long paramLong, Chronology paramChronology)
  {
    this.iChronology = checkChronology(paramChronology);
    this.iMillis = checkInstant(paramLong, this.iChronology);
    adjustForMinMax();
  }
  
  public BaseDateTime(long paramLong, DateTimeZone paramDateTimeZone)
  {
    this(paramLong, ISOChronology.getInstance(paramDateTimeZone));
  }
  
  public BaseDateTime(Object paramObject, Chronology paramChronology)
  {
    InstantConverter localInstantConverter = ConverterManager.getInstance().getInstantConverter(paramObject);
    this.iChronology = checkChronology(localInstantConverter.getChronology(paramObject, paramChronology));
    this.iMillis = checkInstant(localInstantConverter.getInstantMillis(paramObject, paramChronology), this.iChronology);
    adjustForMinMax();
  }
  
  public BaseDateTime(Object paramObject, DateTimeZone paramDateTimeZone)
  {
    InstantConverter localInstantConverter = ConverterManager.getInstance().getInstantConverter(paramObject);
    paramDateTimeZone = checkChronology(localInstantConverter.getChronology(paramObject, paramDateTimeZone));
    this.iChronology = paramDateTimeZone;
    this.iMillis = checkInstant(localInstantConverter.getInstantMillis(paramObject, paramDateTimeZone), paramDateTimeZone);
    adjustForMinMax();
  }
  
  public BaseDateTime(Chronology paramChronology)
  {
    this(DateTimeUtils.currentTimeMillis(), paramChronology);
  }
  
  public BaseDateTime(DateTimeZone paramDateTimeZone)
  {
    this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(paramDateTimeZone));
  }
  
  private void adjustForMinMax()
  {
    if ((this.iMillis == Long.MIN_VALUE) || (this.iMillis == Long.MAX_VALUE)) {
      this.iChronology = this.iChronology.withUTC();
    }
  }
  
  protected Chronology checkChronology(Chronology paramChronology)
  {
    return DateTimeUtils.getChronology(paramChronology);
  }
  
  protected long checkInstant(long paramLong, Chronology paramChronology)
  {
    return paramLong;
  }
  
  public Chronology getChronology()
  {
    return this.iChronology;
  }
  
  public long getMillis()
  {
    return this.iMillis;
  }
  
  protected void setChronology(Chronology paramChronology)
  {
    this.iChronology = checkChronology(paramChronology);
  }
  
  protected void setMillis(long paramLong)
  {
    this.iMillis = checkInstant(paramLong, this.iChronology);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/base/BaseDateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */