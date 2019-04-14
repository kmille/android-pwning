package org.joda.time;

public abstract interface ReadableDuration
  extends Comparable<ReadableDuration>
{
  public abstract boolean equals(Object paramObject);
  
  public abstract long getMillis();
  
  public abstract int hashCode();
  
  public abstract boolean isEqual(ReadableDuration paramReadableDuration);
  
  public abstract boolean isLongerThan(ReadableDuration paramReadableDuration);
  
  public abstract boolean isShorterThan(ReadableDuration paramReadableDuration);
  
  public abstract Duration toDuration();
  
  public abstract Period toPeriod();
  
  public abstract String toString();
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/ReadableDuration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */