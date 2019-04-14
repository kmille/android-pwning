package a.a.b;

import a.a.d.a.a;
import a.a.d.a.f;
import a.a.d.a.f.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class l
{
  private static final Set<Class> a = new HashSet(Arrays.asList(new Class[] { JsonElement.class, Gson.class }));
  private a<f> b = new a() {};
  
  final void a(Object paramObject, Class<? extends Annotation> paramClass, JsonElement paramJsonElement, Gson paramGson)
  {
    if (paramObject != null)
    {
      paramClass = this.b.a(paramObject.getClass(), paramClass).iterator();
      while (paramClass.hasNext())
      {
        f localf = (f)paramClass.next();
        try
        {
          localf.a(paramObject, new a(paramJsonElement, paramGson, (byte)0));
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
  
  static final class a
    implements f.a
  {
    private final JsonElement a;
    private final Gson b;
    
    private a(JsonElement paramJsonElement, Gson paramGson)
    {
      this.a = paramJsonElement;
      this.b = paramGson;
    }
    
    public final Object a(Class paramClass)
    {
      if (paramClass == JsonElement.class) {
        return this.a;
      }
      if (paramClass == Gson.class) {
        return this.b;
      }
      return null;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */