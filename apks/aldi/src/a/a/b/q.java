package a.a.b;

import a.a.d.b;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

public final class q<T>
  implements TypeAdapterFactory
{
  private final Map<Class<T>, b<T, String>> a;
  
  public q(Map<Class<T>, b<T, String>> paramMap)
  {
    this.a = paramMap;
  }
  
  public final <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken)
  {
    TypeAdapter localTypeAdapter = paramGson.getDelegateAdapter(this, paramTypeToken);
    for (paramTypeToken = paramTypeToken.getRawType(); paramTypeToken != null; paramTypeToken = paramTypeToken.getSuperclass())
    {
      b localb = (b)this.a.get(paramTypeToken);
      if (localb != null)
      {
        paramTypeToken = localb;
        break label50;
      }
    }
    paramTypeToken = null;
    label50:
    if (paramTypeToken == null) {
      return localTypeAdapter;
    }
    return new m(new a(paramTypeToken, paramGson, localTypeAdapter));
  }
  
  final class a<T>
    extends TypeAdapter<T>
  {
    private final b<T, String> b;
    private final Gson c;
    private final TypeAdapter<T> d;
    
    public a(Gson paramGson, TypeAdapter<T> paramTypeAdapter)
    {
      this.b = paramGson;
      this.c = paramTypeAdapter;
      TypeAdapter localTypeAdapter;
      this.d = localTypeAdapter;
    }
    
    public final T read(JsonReader paramJsonReader)
      throws IOException
    {
      paramJsonReader.beginObject();
      paramJsonReader.nextName();
      Object localObject = this.d.read(paramJsonReader);
      paramJsonReader.endObject();
      return (T)localObject;
    }
    
    public final void write(JsonWriter paramJsonWriter, T paramT)
      throws IOException
    {
      if (paramT == null)
      {
        this.d.write(paramJsonWriter, paramT);
        return;
      }
      String str = (String)this.b.a();
      paramT = this.d.toJsonTree(paramT);
      JsonObject localJsonObject = new JsonObject();
      localJsonObject.add(str, paramT);
      this.c.toJson(localJsonObject, paramJsonWriter);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */