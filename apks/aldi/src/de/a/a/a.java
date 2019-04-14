package de.a.a;

import com.google.common.base.f;
import com.google.common.base.f.a;
import com.google.common.base.j;
import com.google.common.io.c;
import com.google.common.io.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.a.c.g;
import org.apache.a.c.h;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class a
{
  public String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final OkHttpClient f;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, Interceptor paramInterceptor)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = new OkHttpClient.Builder().addInterceptor(paramInterceptor).connectTimeout(20000L, TimeUnit.MILLISECONDS).readTimeout(20000L, TimeUnit.MILLISECONDS).build();
  }
  
  private b b(String paramString1, String paramString2)
  {
    paramString2 = new Request.Builder().url(paramString1).header("Accept-Language", paramString2).header("Accept", "application/json;charset=UTF-8").build();
    try
    {
      paramString2 = this.f.newCall(paramString2).execute();
      if (paramString2.code() != 304)
      {
        if (paramString2.isSuccessful()) {
          return b.a(paramString2.body().string(), paramString1);
        }
        return b.a(paramString2.code(), paramString1);
      }
      paramString2 = b.a;
      return paramString2;
    }
    catch (IOException paramString2) {}
    return b.a(paramString2, paramString1);
  }
  
  public final b a(String paramString1, String paramString2, String... paramVarArgs)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(this.b);
    ((StringBuilder)localObject).append(this.d);
    ((StringBuilder)localObject).append(this.c);
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(this.e);
    ((StringBuilder)localObject).append("/resourceContent/");
    ((StringBuilder)localObject).append(paramString1);
    paramString1 = ((StringBuilder)localObject).toString();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString1);
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(paramVarArgs[0]);
    paramVarArgs = ((StringBuilder)localObject).toString();
    paramString2 = new Request.Builder().url(paramVarArgs).header("Accept-Language", paramString2).header("Accept", "application/json;charset=UTF-8").build();
    try
    {
      paramString2 = this.f.newCall(paramString2).execute();
      localObject = paramString2.header("Content-Type");
      if (paramString2.isSuccessful())
      {
        if (h.a((CharSequence)localObject, new CharSequence[] { "json", "text", "html" }))
        {
          localObject = e.a(paramString2.body().charStream()).toString();
          paramString2.body().charStream().close();
          return b.a((String)localObject, paramString1);
        }
        if (h.c((CharSequence)localObject, "png"))
        {
          localObject = com.google.common.io.a.a();
          byte[] arrayOfByte = c.a(paramString2.body().byteStream());
          localObject = ((com.google.common.io.a)localObject).a(arrayOfByte, 0, arrayOfByte.length);
          paramString2.body().byteStream().close();
          return b.a((String)localObject, paramString1);
        }
        return b.a;
      }
      paramString1 = b.a(new IOException(String.format("Request for %s failed with http-code=%d", new Object[] { paramVarArgs, Integer.valueOf(paramString2.code()) })), paramVarArgs);
      return paramString1;
    }
    catch (IOException paramString1) {}
    return b.a(paramString1, paramVarArgs);
  }
  
  public final Map<String, b> a(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    j.a(h.d(this.e), "WTF i spinn");
    Object localObject;
    if (paramString2 != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.b);
      ((StringBuilder)localObject).append(this.d);
      ((StringBuilder)localObject).append(this.c);
      ((StringBuilder)localObject).append("/");
      ((StringBuilder)localObject).append(this.e);
      ((StringBuilder)localObject).append("/resourceUpdates/");
      ((StringBuilder)localObject).append(paramString2);
      paramString2 = ((StringBuilder)localObject).toString();
    }
    else
    {
      paramString2 = new StringBuilder();
      paramString2.append(this.b);
      paramString2.append(this.d);
      paramString2.append(this.c);
      paramString2.append("/");
      paramString2.append(this.e);
      paramString2.append("/resources/");
      paramString2 = paramString2.toString();
    }
    paramString1 = b(paramString2, paramString1);
    String str1;
    if (paramString1.a()) {
      str1 = paramString1.c;
    }
    for (;;)
    {
      try
      {
        paramString1 = new JSONObject(new JSONTokener(str1));
        this.a = paramString1.getString("resourceVersion");
        JSONObject localJSONObject1 = paramString1.getJSONObject("resources");
        Iterator localIterator1 = localJSONObject1.keys();
        if (localIterator1.hasNext())
        {
          String str2 = (String)localIterator1.next();
          try
          {
            JSONObject localJSONObject2 = localJSONObject1.getJSONObject(str2);
            Iterator localIterator2 = localJSONObject2.keys();
            if (!localIterator2.hasNext()) {
              continue;
            }
            String str3 = (String)localIterator2.next();
            try
            {
              paramString1 = String.format("%s_%s", new Object[] { str2, str3 });
              bool = h.d(localJSONObject2.getString(str3), "StreamingResource");
              if (!h.e(paramString1)) {
                break label568;
              }
              if ((h.a(paramString1)) || (org.apache.a.c.b.a(paramString1) < 0)) {
                break label562;
              }
              i = 1;
            }
            catch (Exception paramString1)
            {
              boolean bool;
              localHashMap.put(String.format("RawKey=%s", new Object[] { str3 }), b.a(paramString1, paramString2));
            }
            localObject = paramString1.replaceAll("[^\\w\\.]", "_");
            paramString1 = (String)localObject;
            if (!bool) {
              if (localObject == null) {
                paramString1 = null;
              } else {
                paramString1 = ((String)localObject).replace('.', '_');
              }
            }
            localHashMap.put(paramString1, b.a(h.a(h.a(h.a(g.a(g.b(localJSONObject2.getString(str3).replaceAll("\\\\{1,6}'", "'"))), "\\\\", ""), "&apos;", "\\'"), "\\&quot;", "&quot;"), paramString2));
            continue;
            continue;
          }
          catch (Exception paramString1)
          {
            localHashMap.put(String.format("ResourceGroup=%s", new Object[] { str2 }), b.a(paramString1, paramString2));
          }
        }
        return localHashMap;
      }
      catch (Exception paramString1)
      {
        localHashMap.put(str1, b.a(paramString1, paramString2));
        return localHashMap;
      }
      localHashMap.put("", paramString1);
      return localHashMap;
      label562:
      int i = 0;
      if (i != 0) {
        label568:
        paramString1 = "foo";
      }
    }
  }
  
  public final String toString()
  {
    return f.a(this).a("Version:", this.a).a("Url:", this.b).a("Versionsname:", this.c).a("Clienttype:", this.d).a("Brand", this.e).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */