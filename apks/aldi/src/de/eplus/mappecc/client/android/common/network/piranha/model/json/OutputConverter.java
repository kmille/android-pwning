package de.eplus.mappecc.client.android.common.network.piranha.model.json;

import android.support.annotation.NonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import de.eplus.mappecc.client.android.common.network.piranha.model.pojo.Output;
import java.lang.reflect.Type;

public class OutputConverter
  implements JsonDeserializer<Output>, JsonSerializer<Output>
{
  @NonNull
  public Output deserialize(@NonNull JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
    throws JsonParseException
  {
    paramType = new Output();
    paramJsonElement = paramJsonElement.getAsJsonObject().get("value");
    if (paramJsonElement.isJsonArray())
    {
      paramJsonElement = paramJsonElement.getAsJsonArray();
      paramJsonDeserializationContext = new String[2];
      int i = 0;
      while (i < paramJsonElement.size())
      {
        paramJsonDeserializationContext[i] = paramJsonElement.get(i).getAsString();
        i += 1;
      }
      paramType.setValueStrArray(paramJsonDeserializationContext);
      paramType.setName(null);
      return paramType;
    }
    paramType.setValue(paramJsonElement.getAsString());
    paramType.setValueStrArray(null);
    return paramType;
  }
  
  @NonNull
  public JsonElement serialize(@NonNull Output paramOutput, Type paramType, JsonSerializationContext paramJsonSerializationContext)
  {
    paramType = new JsonObject();
    paramType.addProperty("name", paramOutput.getName());
    if (paramOutput.getValueStrArray() == null)
    {
      paramType.addProperty("value", paramOutput.getValue());
      return paramType;
    }
    paramJsonSerializationContext = new JsonArray();
    int i = 0;
    while (i < paramOutput.getValueStrArray().length)
    {
      paramJsonSerializationContext.add(paramOutput.getValueStrArray()[i]);
      i += 1;
    }
    paramType.add("value", paramJsonSerializationContext);
    return paramType;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/network/piranha/model/json/OutputConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */