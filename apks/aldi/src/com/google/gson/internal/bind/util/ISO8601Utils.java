package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils
{
  private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
  private static final String UTC_ID = "UTC";
  
  private static boolean checkOffset(String paramString, int paramInt, char paramChar)
  {
    return (paramInt < paramString.length()) && (paramString.charAt(paramInt) == paramChar);
  }
  
  public static String format(Date paramDate)
  {
    return format(paramDate, false, TIMEZONE_UTC);
  }
  
  public static String format(Date paramDate, boolean paramBoolean)
  {
    return format(paramDate, paramBoolean, TIMEZONE_UTC);
  }
  
  public static String format(Date paramDate, boolean paramBoolean, TimeZone paramTimeZone)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(paramTimeZone, Locale.US);
    localGregorianCalendar.setTime(paramDate);
    if (paramBoolean) {
      i = 4;
    } else {
      i = 0;
    }
    int j;
    if (paramTimeZone.getRawOffset() == 0) {
      j = 1;
    } else {
      j = 6;
    }
    paramDate = new StringBuilder(i + 19 + j);
    padInt(paramDate, localGregorianCalendar.get(1), 4);
    char c = '-';
    paramDate.append('-');
    padInt(paramDate, localGregorianCalendar.get(2) + 1, 2);
    paramDate.append('-');
    padInt(paramDate, localGregorianCalendar.get(5), 2);
    paramDate.append('T');
    padInt(paramDate, localGregorianCalendar.get(11), 2);
    paramDate.append(':');
    padInt(paramDate, localGregorianCalendar.get(12), 2);
    paramDate.append(':');
    padInt(paramDate, localGregorianCalendar.get(13), 2);
    if (paramBoolean)
    {
      paramDate.append('.');
      padInt(paramDate, localGregorianCalendar.get(14), 3);
    }
    int i = paramTimeZone.getOffset(localGregorianCalendar.getTimeInMillis());
    if (i != 0)
    {
      int k = i / 60000;
      j = Math.abs(k / 60);
      k = Math.abs(k % 60);
      if (i >= 0) {
        c = '+';
      }
      paramDate.append(c);
      padInt(paramDate, j, 2);
      paramDate.append(':');
      padInt(paramDate, k, 2);
    }
    else
    {
      paramDate.append('Z');
    }
    return paramDate.toString();
  }
  
  private static int indexOfNonDigit(String paramString, int paramInt)
  {
    while (paramInt < paramString.length())
    {
      int i = paramString.charAt(paramInt);
      if (i >= 48)
      {
        if (i > 57) {
          return paramInt;
        }
        paramInt += 1;
      }
      else
      {
        return paramInt;
      }
    }
    return paramString.length();
  }
  
  private static void padInt(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    String str = Integer.toString(paramInt1);
    paramInt1 = paramInt2 - str.length();
    while (paramInt1 > 0)
    {
      paramStringBuilder.append('0');
      paramInt1 -= 1;
    }
    paramStringBuilder.append(str);
  }
  
  public static Date parse(String paramString, ParsePosition paramParsePosition)
    throws ParseException
  {
    label959:
    label972:
    label982:
    label991:
    label1008:
    label1023:
    for (;;)
    {
      int i2;
      char c;
      try
      {
        i = paramParsePosition.getIndex();
        j = i + 4;
        int i3 = parseInt(paramString, i, j);
        i = j;
        if (checkOffset(paramString, j, '-')) {
          i = j + 1;
        }
        j = i + 2;
        int i4 = parseInt(paramString, i, j);
        i = j;
        if (checkOffset(paramString, j, '-')) {
          i = j + 1;
        }
        j = i + 2;
        int i5 = parseInt(paramString, i, j);
        boolean bool = checkOffset(paramString, j, 'T');
        if ((!bool) && (paramString.length() <= j))
        {
          localObject1 = new GregorianCalendar(i3, i4 - 1, i5);
          paramParsePosition.setIndex(j);
          return ((Calendar)localObject1).getTime();
        }
        if (!bool) {
          break label982;
        }
        i = j + 1;
        j = i + 2;
        n = parseInt(paramString, i, j);
        i = j;
        if (checkOffset(paramString, j, ':')) {
          i = j + 1;
        }
        j = i + 2;
        i1 = parseInt(paramString, i, j);
        k = j;
        if (checkOffset(paramString, j, ':')) {
          k = j + 1;
        }
        m = n;
        j = i1;
        i = k;
        if (paramString.length() <= k) {
          break label991;
        }
        i2 = paramString.charAt(k);
        m = n;
        j = i1;
        i = k;
        if (i2 == 90) {
          break label991;
        }
        m = n;
        j = i1;
        i = k;
        if (i2 == 43) {
          break label991;
        }
        m = n;
        j = i1;
        i = k;
        if (i2 == 45) {
          break label991;
        }
        i = k + 2;
        j = parseInt(paramString, k, i);
        k = 59;
        if ((j > 59) && (j < 63))
        {
          j = k;
          if (!checkOffset(paramString, i, '.')) {
            break label972;
          }
          k = i + 1;
          i2 = indexOfNonDigit(paramString, k + 1);
          m = Math.min(i2, k + 3);
          i = parseInt(paramString, k, m);
          switch (m - k)
          {
          default: 
            if (paramString.length() > i)
            {
              c = paramString.charAt(i);
              if (c != 'Z') {
                break label1008;
              }
              localObject1 = TIMEZONE_UTC;
              i += 1;
              continue;
              localObject1 = new StringBuilder("Invalid time zone indicator '");
              ((StringBuilder)localObject1).append(c);
              ((StringBuilder)localObject1).append("'");
              throw new IndexOutOfBoundsException(((StringBuilder)localObject1).toString());
              localObject1 = paramString.substring(i);
              if (((String)localObject1).length() < 5)
              {
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append((String)localObject1);
                ((StringBuilder)localObject2).append("00");
                localObject1 = ((StringBuilder)localObject2).toString();
              }
              i += ((String)localObject1).length();
              if ((!"+0000".equals(localObject1)) && (!"+00:00".equals(localObject1)))
              {
                localObject2 = "GMT".concat(String.valueOf(localObject1));
                localObject1 = TimeZone.getTimeZone((String)localObject2);
                Object localObject3 = ((TimeZone)localObject1).getID();
                if ((((String)localObject3).equals(localObject2)) || (((String)localObject3).replace(":", "").equals(localObject2))) {
                  break label1023;
                }
                localObject3 = new StringBuilder("Mismatching time zone indicator: ");
                ((StringBuilder)localObject3).append((String)localObject2);
                ((StringBuilder)localObject3).append(" given, resolves to ");
                ((StringBuilder)localObject3).append(((TimeZone)localObject1).getID());
                throw new IndexOutOfBoundsException(((StringBuilder)localObject3).toString());
              }
              localObject1 = TIMEZONE_UTC;
              localObject1 = new GregorianCalendar((TimeZone)localObject1);
              ((Calendar)localObject1).setLenient(false);
              ((Calendar)localObject1).set(1, i3);
              ((Calendar)localObject1).set(2, i4 - 1);
              ((Calendar)localObject1).set(5, i5);
              ((Calendar)localObject1).set(11, m);
              ((Calendar)localObject1).set(12, i1);
              ((Calendar)localObject1).set(13, j);
              ((Calendar)localObject1).set(14, k);
              paramParsePosition.setIndex(i);
              return ((Calendar)localObject1).getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
          }
        }
      }
      catch (IndexOutOfBoundsException|NumberFormatException|IllegalArgumentException localIndexOutOfBoundsException)
      {
        Object localObject1;
        if (paramString == null)
        {
          paramString = null;
        }
        else
        {
          localObject1 = new StringBuilder("\"");
          ((StringBuilder)localObject1).append(paramString);
          ((StringBuilder)localObject1).append('"');
          paramString = ((StringBuilder)localObject1).toString();
        }
        Object localObject2 = localIndexOutOfBoundsException.getMessage();
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (!((String)localObject2).isEmpty()) {}
        }
        else
        {
          localObject1 = new StringBuilder("(");
          ((StringBuilder)localObject1).append(localIndexOutOfBoundsException.getClass().getName());
          ((StringBuilder)localObject1).append(")");
          localObject1 = ((StringBuilder)localObject1).toString();
        }
        localObject2 = new StringBuilder("Failed to parse date [");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append("]: ");
        ((StringBuilder)localObject2).append((String)localObject1);
        paramString = new ParseException(((StringBuilder)localObject2).toString(), paramParsePosition.getIndex());
        paramString.initCause(localIndexOutOfBoundsException);
        throw paramString;
      }
      continue;
      break label959;
      i *= 10;
      break label959;
      i *= 100;
      int m = n;
      int k = i;
      int i = i2;
      continue;
      k = 0;
      m = n;
      continue;
      i = j;
      m = 0;
      int j = 0;
      k = 0;
      int n = 0;
      int i1 = j;
      j = n;
      continue;
      if (c != '+') {
        if (c == '-') {}
      }
    }
  }
  
  private static int parseInt(String paramString, int paramInt1, int paramInt2)
    throws NumberFormatException
  {
    if ((paramInt1 >= 0) && (paramInt2 <= paramString.length()) && (paramInt1 <= paramInt2))
    {
      int i;
      int j;
      StringBuilder localStringBuilder;
      if (paramInt1 < paramInt2)
      {
        i = paramInt1 + 1;
        j = Character.digit(paramString.charAt(paramInt1), 10);
        if (j >= 0)
        {
          j = -j;
        }
        else
        {
          localStringBuilder = new StringBuilder("Invalid number: ");
          localStringBuilder.append(paramString.substring(paramInt1, paramInt2));
          throw new NumberFormatException(localStringBuilder.toString());
        }
      }
      else
      {
        i = paramInt1;
        j = 0;
      }
      while (i < paramInt2)
      {
        int k = Character.digit(paramString.charAt(i), 10);
        if (k >= 0)
        {
          j = j * 10 - k;
          i += 1;
        }
        else
        {
          localStringBuilder = new StringBuilder("Invalid number: ");
          localStringBuilder.append(paramString.substring(paramInt1, paramInt2));
          throw new NumberFormatException(localStringBuilder.toString());
        }
      }
      return -j;
    }
    throw new NumberFormatException(paramString);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/internal/bind/util/ISO8601Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */