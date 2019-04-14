package a.a.d;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
  extends DateFormat
{
  private static final Pattern a = Pattern.compile("(.*)([+-][0-9][0-9])\\:?([0-9][0-9])$");
  private static final Pattern b = Pattern.compile("(.*)\\.([0-9]+)(.*)");
  private static final Pattern c = Pattern.compile("^[0-9]{1,4}-[0-1][0-9]-[0-3][0-9]$");
  private final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
  private final SimpleDateFormat e;
  private final boolean f;
  
  public c()
  {
    this((byte)0);
  }
  
  private c(byte paramByte)
  {
    this(TimeZone.getTimeZone("UTC"), true);
  }
  
  public c(TimeZone paramTimeZone, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");; localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"))
    {
      this.e = localSimpleDateFormat;
      break;
    }
    this.f = paramBoolean;
    this.e.setTimeZone(paramTimeZone);
  }
  
  public final StringBuffer format(Date paramDate, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    paramStringBuffer = new StringBuffer();
    paramStringBuffer.append(this.e.format(paramDate).toString());
    if (this.f)
    {
      long l1 = paramDate.getTime();
      long l2 = l1 % 1000L;
      if (l2 != 0L) {
        paramStringBuffer.append(".".concat(String.valueOf(Long.toString(l2))));
      }
      paramDate = this.e.getTimeZone();
      if (paramDate.getOffset(l1) == 0)
      {
        paramDate = "Z";
      }
      else
      {
        int j = (int)(paramDate.getOffset(l1) / 1000L);
        int i = j / 3600;
        j = Math.abs((j - i * 3600) / 60);
        if (i >= 0) {
          paramDate = "+";
        } else {
          paramDate = "-";
        }
        paramFieldPosition = new StringBuilder();
        paramFieldPosition.append(paramDate);
        paramFieldPosition.append(String.format("%02d", new Object[] { Integer.valueOf(Math.abs(i)) }));
        paramFieldPosition.append(":");
        paramFieldPosition.append(String.format("%02d", new Object[] { Integer.valueOf(j) }));
        paramDate = paramFieldPosition.toString();
      }
      paramStringBuffer.append(paramDate);
    }
    return paramStringBuffer;
  }
  
  public final Date parse(String paramString, ParsePosition paramParsePosition)
  {
    Object localObject;
    if (c.matcher(paramString).matches())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("T00:00:00-0000");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = paramString;
      if (paramString.charAt(10) == 't')
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString.substring(0, 10));
        ((StringBuilder)localObject).append("T");
        ((StringBuilder)localObject).append(paramString.substring(12));
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    long l;
    if (((String)localObject).contains("."))
    {
      paramString = b.matcher((CharSequence)localObject);
      l = Long.parseLong(paramString.replaceAll("$2"));
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString.replaceAll("$1"));
      ((StringBuilder)localObject).append(paramString.replaceAll("$3"));
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      l = 0L;
    }
    if ((!((String)localObject).endsWith("Z")) && (!((String)localObject).endsWith("z")))
    {
      paramString = a.matcher((CharSequence)localObject);
      if (paramString.matches())
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString.replaceAll("$1"));
        ((StringBuilder)localObject).append(paramString.replaceAll("$2"));
        ((StringBuilder)localObject).append(paramString.replaceAll("$3"));
        paramString = ((StringBuilder)localObject).toString();
        break label330;
      }
      paramString = new StringBuilder();
    }
    else
    {
      paramString = new StringBuilder();
      localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1);
    }
    paramString.append((String)localObject);
    paramString.append("-0000");
    paramString = paramString.toString();
    try
    {
      label330:
      Date localDate = this.d.parse(paramString);
      localObject = localDate;
      if (l > 0L) {
        localObject = new Date(localDate.getTime() + l);
      }
      paramParsePosition.setIndex(paramString.length());
      return (Date)localObject;
    }
    catch (ParseException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */