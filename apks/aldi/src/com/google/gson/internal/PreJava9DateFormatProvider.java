package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PreJava9DateFormatProvider
{
  private static String getDateFormatPattern(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(paramInt)));
    case 3: 
      return "M/d/yy";
    case 2: 
      return "MMM d, y";
    case 1: 
      return "MMMM d, y";
    }
    return "EEEE, MMMM d, y";
  }
  
  private static String getDatePartOfDateTimePattern(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(paramInt)));
    case 3: 
      return "M/d/yy";
    case 2: 
      return "MMM d, yyyy";
    case 1: 
      return "MMMM d, yyyy";
    }
    return "EEEE, MMMM d, yyyy";
  }
  
  private static String getTimePartOfDateTimePattern(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(paramInt)));
    case 3: 
      return "h:mm a";
    case 2: 
      return "h:mm:ss a";
    }
    return "h:mm:ss a z";
  }
  
  public static DateFormat getUSDateFormat(int paramInt)
  {
    return new SimpleDateFormat(getDateFormatPattern(paramInt), Locale.US);
  }
  
  public static DateFormat getUSDateTimeFormat(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getDatePartOfDateTimePattern(paramInt1));
    localStringBuilder.append(" ");
    localStringBuilder.append(getTimePartOfDateTimePattern(paramInt2));
    return new SimpleDateFormat(localStringBuilder.toString(), Locale.US);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/internal/PreJava9DateFormatProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */