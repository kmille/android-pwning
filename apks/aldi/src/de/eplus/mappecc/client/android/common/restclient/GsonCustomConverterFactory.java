package de.eplus.mappecc.client.android.common.restclient;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class GsonCustomConverterFactory
  extends Converter.Factory
{
  private final Gson gson;
  private final GsonConverterFactory gsonConverterFactory;
  
  private GsonCustomConverterFactory(Gson paramGson)
  {
    if (paramGson != null)
    {
      this.gson = paramGson;
      this.gsonConverterFactory = GsonConverterFactory.create(paramGson);
      return;
    }
    throw new NullPointerException("gson == null");
  }
  
  public static GsonCustomConverterFactory create(Gson paramGson)
  {
    return new GsonCustomConverterFactory(paramGson);
  }
  
  public Converter<?, RequestBody> requestBodyConverter(Type paramType, Annotation[] paramArrayOfAnnotation1, Annotation[] paramArrayOfAnnotation2, Retrofit paramRetrofit)
  {
    return this.gsonConverterFactory.requestBodyConverter(paramType, paramArrayOfAnnotation1, paramArrayOfAnnotation2, paramRetrofit);
  }
  
  public Converter<ResponseBody, ?> responseBodyConverter(Type paramType, Annotation[] paramArrayOfAnnotation, Retrofit paramRetrofit)
  {
    if (paramType.equals(String.class)) {
      return new GsonResponseBodyConverterToString(this.gson, paramType);
    }
    return this.gsonConverterFactory.responseBodyConverter(paramType, paramArrayOfAnnotation, paramRetrofit);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/GsonCustomConverterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */