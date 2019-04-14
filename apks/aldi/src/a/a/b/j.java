package a.a.b;

import a.a.a;
import a.a.a.c;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class j<T>
  extends TypeAdapter<T>
{
  private final Class<T> a;
  private final a<? super T> b;
  private final Gson c;
  private final TypeAdapter<T> d;
  private final l e = new l();
  
  public j(Class<T> paramClass, a<? super T> parama, TypeAdapter<T> paramTypeAdapter, Gson paramGson)
  {
    this.b = parama;
    this.c = paramGson;
    this.d = paramTypeAdapter;
    this.a = paramClass;
  }
  
  private void a()
  {
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public final T read(JsonReader paramJsonReader)
    throws IOException
  {
    paramJsonReader = new JsonParser().parse(paramJsonReader);
    Object localObject = this.b;
    if (((a)localObject).c == null) {
      ((a)localObject).c = new ArrayList();
    }
    localObject = ((a)localObject).c.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Iterator)localObject).next();
    }
    localObject = this.d.fromJsonTree(paramJsonReader);
    if (this.b.d) {
      this.e.a(localObject, c.class, paramJsonReader, this.c);
    }
    a();
    return (T)localObject;
  }
  
  public final void write(JsonWriter paramJsonWriter, T paramT)
    throws IOException
  {
    if (this.b.d) {
      this.e.a(paramT, a.a.a.d.class, null, null);
    }
    JsonElement localJsonElement = this.d.toJsonTree(paramT);
    Iterator localIterator = this.b.a().iterator();
    while (localIterator.hasNext()) {
      ((a.a.d)localIterator.next()).a(localJsonElement, paramT, this.c);
    }
    this.c.toJson(localJsonElement, paramJsonWriter);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/a/a/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */