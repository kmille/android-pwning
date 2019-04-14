package a.a.b;

import a.a.d.d;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;

public final class o
  implements TypeAdapterFactory
{
  public final TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    if (paramTypeToken.getRawType() == d.class)
    {
      if ((paramTypeToken.getType() instanceof ParameterizedType)) {
        return new n(paramGson, ((ParameterizedType)paramTypeToken.getType()).getActualTypeArguments()[0]);
      }
      return new n(paramGson, Object.class);
    }
    return null;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */