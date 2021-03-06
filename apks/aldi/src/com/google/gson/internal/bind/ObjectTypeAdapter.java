package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter
  extends TypeAdapter<Object>
{
  public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory()
  {
    public final <T> TypeAdapter<T> create(Gson paramAnonymousGson, TypeToken<T> paramAnonymousTypeToken)
    {
      if (paramAnonymousTypeToken.getRawType() == Object.class) {
        return new ObjectTypeAdapter(paramAnonymousGson);
      }
      return null;
    }
  };
  private final Gson gson;
  
  ObjectTypeAdapter(Gson paramGson)
  {
    this.gson = paramGson;
  }
  
  public final Object read(JsonReader paramJsonReader)
    throws IOException
  {
    Object localObject = paramJsonReader.peek();
    switch (localObject)
    {
    default: 
      throw new IllegalStateException();
    case ???: 
      paramJsonReader.nextNull();
      return null;
    case ???: 
      return Boolean.valueOf(paramJsonReader.nextBoolean());
    case ???: 
      return Double.valueOf(paramJsonReader.nextDouble());
    case ???: 
      return paramJsonReader.nextString();
    case ???: 
      localObject = new LinkedTreeMap();
      paramJsonReader.beginObject();
      while (paramJsonReader.hasNext()) {
        ((Map)localObject).put(paramJsonReader.nextName(), read(paramJsonReader));
      }
      paramJsonReader.endObject();
      return localObject;
    }
    localObject = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      ((List)localObject).add(read(paramJsonReader));
    }
    paramJsonReader.endArray();
    return localObject;
  }
  
  public final void write(JsonWriter paramJsonWriter, Object paramObject)
    throws IOException
  {
    if (paramObject == null)
    {
      paramJsonWriter.nullValue();
      return;
    }
    TypeAdapter localTypeAdapter = this.gson.getAdapter(paramObject.getClass());
    if ((localTypeAdapter instanceof ObjectTypeAdapter))
    {
      paramJsonWriter.beginObject();
      paramJsonWriter.endObject();
      return;
    }
    localTypeAdapter.write(paramJsonWriter, paramObject);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/internal/bind/ObjectTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */