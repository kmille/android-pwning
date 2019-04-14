package a.a.b;

import a.a.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

public final class k<T>
  implements TypeAdapterFactory
{
  private final a<T> a;
  
  public k(a<T> parama)
  {
    this.a = parama;
  }
  
  public final <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken)
  {
    if (this.a.a.isAssignableFrom(paramTypeToken.getRawType()))
    {
      TypeAdapter localTypeAdapter = paramGson.getDelegateAdapter(this, paramTypeToken);
      return new j(paramTypeToken.getRawType(), this.a, localTypeAdapter, paramGson);
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */