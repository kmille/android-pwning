package org.joda.time;

import java.util.Locale;

public abstract interface ReadableDateTime
  extends ReadableInstant
{
  public abstract int getCenturyOfEra();
  
  public abstract int getDayOfMonth();
  
  public abstract int getDayOfWeek();
  
  public abstract int getDayOfYear();
  
  public abstract int getEra();
  
  public abstract int getHourOfDay();
  
  public abstract int getMillisOfDay();
  
  public abstract int getMillisOfSecond();
  
  public abstract int getMinuteOfDay();
  
  public abstract int getMinuteOfHour();
  
  public abstract int getMonthOfYear();
  
  public abstract int getSecondOfDay();
  
  public abstract int getSecondOfMinute();
  
  public abstract int getWeekOfWeekyear();
  
  public abstract int getWeekyear();
  
  public abstract int getYear();
  
  public abstract int getYearOfCentury();
  
  public abstract int getYearOfEra();
  
  public abstract DateTime toDateTime();
  
  public abstract MutableDateTime toMutableDateTime();
  
  public abstract String toString(String paramString)
    throws IllegalArgumentException;
  
  public abstract String toString(String paramString, Locale paramLocale)
    throws IllegalArgumentException;
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/org/joda/time/ReadableDateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */