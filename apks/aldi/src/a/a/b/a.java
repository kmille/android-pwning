package a.a.b;

import a.a.d.c;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

public final class a
  extends TypeAdapter<Date>
{
  private final boolean a;
  private final TimeZone b;
  private final ThreadLocal<DateFormat> c = new ThreadLocal();
  
  public a(TimeZone paramTimeZone, boolean paramBoolean)
  {
    this.b = paramTimeZone;
    this.a = paramBoolean;
  }
  
  private DateFormat a()
  {
    DateFormat localDateFormat = (DateFormat)this.c.get();
    Object localObject = localDateFormat;
    if (localDateFormat == null)
    {
      localObject = new c(this.b, this.a);
      this.c.set(localObject);
    }
    return (DateFormat)localObject;
  }
  
  private Date a(JsonReader paramJsonReader)
    throws IOException
  {
    paramJsonReader = paramJsonReader.nextString();
    try
    {
      Date localDate = a().parse(paramJsonReader);
      return localDate;
    }
    catch (ParseException localParseException)
    {
      throw new IOException("Could not parse date ".concat(String.valueOf(paramJsonReader)), localParseException);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */