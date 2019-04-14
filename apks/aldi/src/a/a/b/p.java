package a.a.b;

import a.a.a;
import a.a.e;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Set;

public final class p<T>
  implements TypeAdapterFactory
{
  private final a<T> a;
  private final Set<TypeToken> b;
  
  public p(a<T> parama, Set<TypeToken> paramSet)
  {
    this.a = parama;
    this.b = paramSet;
  }
  
  public final <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken)
  {
    if (this.b.contains(paramTypeToken)) {
      return null;
    }
    if (this.a.a.isAssignableFrom(paramTypeToken.getRawType())) {
      return new m(new a(paramTypeToken.getRawType(), this.a.b, paramGson, (byte)0));
    }
    return null;
  }
  
  final class a<T>
    extends TypeAdapter<T>
  {
    private final Class b;
    private final e c;
    private final Gson d;
    
    private a(Class paramClass, e parame, Gson paramGson)
    {
      this.b = paramClass;
      this.c = parame;
      this.d = paramGson;
    }
    
    public final T read(JsonReader paramJsonReader)
      throws IOException
    {
      JsonElement localJsonElement = new JsonParser().parse(paramJsonReader);
      Object localObject = this.c.getClassForElement(localJsonElement);
      paramJsonReader = (JsonReader)localObject;
      if (localObject == null) {
        paramJsonReader = this.b;
      }
      localObject = TypeToken.get(paramJsonReader);
      p.a(p.this).add(localObject);
      try
      {
        if (paramJsonReader != this.b) {
          paramJsonReader = this.d.getAdapter((TypeToken)localObject);
        } else {
          paramJsonReader = this.d.getDelegateAdapter(p.this, (TypeToken)localObject);
        }
        return (T)paramJsonReader.fromJsonTree(localJsonElement);
      }
      finally
      {
        p.a(p.this).remove(localObject);
      }
    }
    
    public final void write(JsonWriter paramJsonWriter, T paramT)
      throws IOException
    {
      TypeAdapter localTypeAdapter = this.d.getDelegateAdapter(p.this, TypeToken.get(paramT.getClass()));
      this.d.toJson(localTypeAdapter.toJsonTree(paramT), paramJsonWriter);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */