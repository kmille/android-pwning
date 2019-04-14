package a.a.d;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class a
{
  public final FieldNamingStrategy a;
  public final ConcurrentMap<Field, String> b = new ConcurrentHashMap();
  
  public a(Gson paramGson)
  {
    this.a = paramGson.fieldNamingStrategy();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */