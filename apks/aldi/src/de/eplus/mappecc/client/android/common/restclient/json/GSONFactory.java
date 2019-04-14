package de.eplus.mappecc.client.android.common.restclient.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import org.joda.time.DateTime;

public class GSONFactory
{
  public static Gson getGson()
  {
    return new GsonBuilder().registerTypeAdapter(DateTime.class, new DateTimeTypeConverter()).setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/json/GSONFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */