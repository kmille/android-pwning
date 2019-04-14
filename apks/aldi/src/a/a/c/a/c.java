package a.a.c.a;

import a.a.a.b.a;
import a.a.b.h;
import a.a.b.i;
import a.a.d;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

public final class c<T>
  implements d<T>
{
  private static b a = new b();
  private final h b;
  
  public c()
  {
    this(new i(new h[0]));
  }
  
  public c(h paramh)
  {
    this.b = paramh;
  }
  
  public final void a(JsonElement paramJsonElement, T paramT, Gson paramGson)
  {
    if (paramJsonElement.isJsonObject())
    {
      paramJsonElement = paramJsonElement.getAsJsonObject();
      Iterator localIterator = a.a(paramT.getClass(), a.a.a.b.class).iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (!this.b.a(locala)) {
          try
          {
            if ((locala.c == b.a.a) || ((locala.c == b.a.b) && (!paramJsonElement.has(locala.b))))
            {
              Object localObject = locala.a.invoke(paramT, new Object[0]);
              paramJsonElement.add(locala.b, paramGson.toJsonTree(localObject));
            }
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            localInvocationTargetException.printStackTrace();
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            localIllegalAccessException.printStackTrace();
          }
        }
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */