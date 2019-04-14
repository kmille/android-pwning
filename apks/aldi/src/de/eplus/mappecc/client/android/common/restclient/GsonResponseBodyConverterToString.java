package de.eplus.mappecc.client.android.common.restclient;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.Converter;

class GsonResponseBodyConverterToString<T>
  implements Converter<ResponseBody, T>
{
  private final Gson gson;
  private final Type type;
  
  GsonResponseBodyConverterToString(Gson paramGson, Type paramType)
  {
    this.gson = paramGson;
    this.type = paramType;
  }
  
  public T convert(ResponseBody paramResponseBody)
    throws IOException
  {
    paramResponseBody = paramResponseBody.string();
    try
    {
      Object localObject = this.gson.fromJson(paramResponseBody, this.type);
      return (T)localObject;
    }
    catch (JsonParseException localJsonParseException) {}
    return paramResponseBody;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/GsonResponseBodyConverterToString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */