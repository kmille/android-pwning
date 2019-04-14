package de.eplus.mappecc.client.android.common.restclient.cookie;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.common.base.f;
import com.google.common.base.f.a;
import com.google.common.base.j;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import de.eplus.mappecc.client.android.common.restclient.json.GSONFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.joda.time.DateTime;

public class O2Cookiejar
  implements CookieJar
{
  private static final String O2_LOGIN_COOKIE_NAME = "o2online";
  private static final String PERSISTENT_ONLINE_COOKIE_NAME = "session-jwt";
  private static final String SHAREDPREFS_NAME = "O2Cookie";
  private static final Map<String, O2Cookie> cookieJar2 = ;
  private static O2Cookiejar instance = null;
  private Gson GSON = GSONFactory.getGson();
  private SharedPreferences userSharedPreferences;
  
  private O2Cookiejar(SharedPreferences paramSharedPreferences)
  {
    j.a(paramSharedPreferences, "SharedPreferences may not be null");
    this.userSharedPreferences = paramSharedPreferences;
    loadCookies();
  }
  
  public static O2Cookiejar getInstance(SharedPreferences paramSharedPreferences)
  {
    if (instance == null)
    {
      paramSharedPreferences = new O2Cookiejar(paramSharedPreferences);
      instance = paramSharedPreferences;
      return paramSharedPreferences;
    }
    return instance;
  }
  
  private void loadCookies()
  {
    Object localObject1;
    synchronized (cookieJar2)
    {
      cookieJar2.clear();
      localObject1 = this.userSharedPreferences.getString("O2Cookie", "");
      boolean bool = org.apache.a.c.h.a((CharSequence)localObject1);
      if (bool) {}
    }
    try
    {
      localObject1 = (Map)this.GSON.fromJson((String)localObject1, new TypeToken() {}.getType());
      cookieJar2.putAll((Map)localObject1);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
      for (;;) {}
    }
  }
  
  private void persistCookies()
  {
    synchronized (cookieJar2)
    {
      String str = this.GSON.toJson(cookieJar2);
      SharedPreferences.Editor localEditor = this.userSharedPreferences.edit();
      localEditor.putString("O2Cookie", str);
      localEditor.apply();
      return;
    }
  }
  
  public void clearCookies()
  {
    synchronized (cookieJar2)
    {
      cookieJar2.clear();
      SharedPreferences.Editor localEditor = this.userSharedPreferences.edit();
      localEditor.remove("O2Cookie");
      localEditor.apply();
      return;
    }
  }
  
  public boolean isCookieValid(DateTime paramDateTime)
  {
    synchronized (cookieJar2)
    {
      loadCookies();
      if (cookieJar2.containsKey("o2online"))
      {
        boolean bool = paramDateTime.isBefore(new DateTime(((O2Cookie)cookieJar2.get("o2online")).getExpiresAt()));
        return bool;
      }
      return false;
    }
  }
  
  public boolean isPersistentOnlineCookieValid()
  {
    synchronized (cookieJar2)
    {
      loadCookies();
      if (cookieJar2.containsKey("session-jwt"))
      {
        DateTime localDateTime = new DateTime(((O2Cookie)cookieJar2.get("session-jwt")).getExpiresAt());
        boolean bool = DateTime.now().isBefore(localDateTime);
        return bool;
      }
      return false;
    }
  }
  
  public List<Cookie> loadForRequest(HttpUrl arg1)
  {
    synchronized (cookieJar2)
    {
      if (cookieJar2.isEmpty()) {
        loadCookies();
      }
      ArrayList localArrayList = Lists.a();
      Iterator localIterator = cookieJar2.values().iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((O2Cookie)localIterator.next()).toOkHttpCookie());
      }
      return localArrayList;
    }
  }
  
  public void saveFromResponse(HttpUrl paramHttpUrl, List<Cookie> paramList)
  {
    synchronized (cookieJar2)
    {
      if (!paramList.isEmpty())
      {
        Iterator localIterator = paramList.iterator();
        if (localIterator.hasNext())
        {
          Object localObject = (Cookie)localIterator.next();
          if (cookieJar2.containsKey(((Cookie)localObject).name()))
          {
            cookieJar2.remove(((Cookie)localObject).name());
            paramHttpUrl = cookieJar2;
            paramList = ((Cookie)localObject).name();
          }
          for (localObject = new O2Cookie((Cookie)localObject);; localObject = new O2Cookie((Cookie)localObject))
          {
            paramHttpUrl.put(paramList, localObject);
            break;
            paramHttpUrl = cookieJar2;
            paramList = ((Cookie)localObject).name();
          }
        }
      }
      persistCookies();
      return;
    }
  }
  
  public String toString()
  {
    return f.a(this).a("userSharedPreferences", this.userSharedPreferences).a("GSON", this.GSON).a("Cookiejar", cookieJar2).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/cookie/O2Cookiejar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */