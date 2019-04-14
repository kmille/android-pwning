package de.eplus.mappecc.client.android.common.restclient.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.DateTime;

public class DateTimeTypeConverter
  implements JsonDeserializer<DateTime>, JsonSerializer<DateTime>
{
  public DateTime deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    paramJsonElement = paramJsonElement.getAsString();
    if ((paramJsonElement != null) && (paramJsonElement.length() > 0) && (!"".equals(paramJsonElement)) && (!"0".equals(paramJsonElement))) {
      return new DateTime(paramJsonElement);
    }
    return null;
  }
  
  public JsonElement serialize(DateTime paramDateTime, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    return new JsonPrimitive(paramDateTime.toString());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/json/DateTimeTypeConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */