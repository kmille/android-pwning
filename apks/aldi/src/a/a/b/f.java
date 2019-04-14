package a.a.b;

import a.a.d.a.d;
import a.a.d.a.e;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class f
  implements TypeAdapterFactory
{
  private final e a;
  private final d b;
  private a.a.d.a c = null;
  
  public f(e parame, d paramd)
  {
    this.a = parame;
    this.b = paramd;
  }
  
  public final <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken)
  {
    if (this.c == null) {
      this.c = new a.a.d.a(paramGson);
    }
    return new a(paramGson, paramGson.getDelegateAdapter(this, paramTypeToken));
  }
  
  final class a
    extends TypeAdapter
  {
    private final Gson b;
    private final TypeAdapter c;
    
    public a(Gson paramGson, TypeAdapter paramTypeAdapter)
    {
      this.b = paramGson;
      this.c = paramTypeAdapter;
    }
    
    public final Object read(JsonReader paramJsonReader)
      throws IOException
    {
      return this.c.read(paramJsonReader);
    }
    
    public final void write(JsonWriter paramJsonWriter, Object paramObject)
      throws IOException
    {
      if (paramObject == null)
      {
        this.c.write(paramJsonWriter, paramObject);
        return;
      }
      Object localObject2 = null;
      Iterator localIterator = f.a(f.this).a(paramObject.getClass(), a.a.a.a.class).iterator();
      while (localIterator.hasNext())
      {
        Field localField = (Field)localIterator.next();
        try
        {
          Object localObject1 = ((a.a.a.a)localField.getAnnotation(a.a.a.a.class)).a();
          localObject1 = (g)f.b(f.this).a((Class)localObject1);
          localField.get(paramObject);
          if (((g)localObject1).a())
          {
            a.a.d.a locala = f.c(f.this);
            localObject1 = (String)locala.b.get(localField);
            Object localObject3 = localObject1;
            if (localObject1 == null)
            {
              localObject1 = (SerializedName)localField.getAnnotation(SerializedName.class);
              if (localObject1 == null) {
                localObject1 = locala.a.translateName(localField);
              } else {
                localObject1 = ((SerializedName)localObject1).value();
              }
              localObject3 = localObject1;
              if (!locala.b.containsKey(localField))
              {
                locala.b.put(localField, localObject1);
                localObject3 = localObject1;
              }
            }
            if (localObject3 != null)
            {
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject1 = this.c.toJsonTree(paramObject);
                if ((localObject1 != null) && (!((JsonElement)localObject1).isJsonNull()) && (((JsonElement)localObject1).isJsonObject())) {
                  localObject1 = this.c.toJsonTree(paramObject).getAsJsonObject();
                }
              }
              else
              {
                ((JsonObject)localObject1).remove((String)localObject3);
                localObject2 = localObject1;
              }
            }
          }
        }
        catch (IllegalAccessException paramJsonWriter)
        {
          throw new RuntimeException(paramJsonWriter);
        }
      }
      if (localObject2 != null)
      {
        this.b.toJson((JsonElement)localObject2, paramJsonWriter);
        return;
      }
      this.c.write(paramJsonWriter, paramObject);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */