package a.a.b;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public final class e<T extends Enum>
  implements TypeAdapterFactory
{
  private final Class<T> a;
  private final T b;
  
  public e(Class<T> paramClass, T paramT)
  {
    this.a = paramClass;
    this.b = paramT;
  }
  
  public final <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken)
  {
    if (this.a.isAssignableFrom(paramTypeToken.getRawType())) {
      new m(new TypeAdapter()
      {
        public final T read(JsonReader paramAnonymousJsonReader)
          throws IOException
        {
          Object localObject = this.a.read(paramAnonymousJsonReader);
          paramAnonymousJsonReader = (JsonReader)localObject;
          if (localObject == null) {
            paramAnonymousJsonReader = e.a(e.this);
          }
          return paramAnonymousJsonReader;
        }
        
        public final void write(JsonWriter paramAnonymousJsonWriter, T paramAnonymousT)
          throws IOException
        {
          this.a.write(paramAnonymousJsonWriter, paramAnonymousT);
        }
      });
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */