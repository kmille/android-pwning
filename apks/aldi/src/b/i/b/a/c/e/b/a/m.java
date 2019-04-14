package b.i.b.a.c.e.b.a;

import b.a.ai;
import b.f.b.j;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class m
{
  final Set<String> a;
  private final LinkedHashMap<String, String> b;
  private final String c;
  
  public m(String paramString)
  {
    this.c = paramString;
    this.b = new LinkedHashMap();
    this.a = ((Set)new LinkedHashSet());
  }
  
  public final Set<String> a()
  {
    Set localSet = this.b.keySet();
    j.a(localSet, "packageParts.keys");
    return localSet;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    j.b(paramString1, "partInternalName");
    ((Map)this.b).put(paramString1, paramString2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof m))
    {
      paramObject = (m)paramObject;
      if ((j.a(((m)paramObject).c, this.c)) && (j.a(((m)paramObject).b, this.b)) && (j.a(((m)paramObject).a, this.a))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (this.c.hashCode() * 31 + this.b.hashCode()) * 31 + this.a.hashCode();
  }
  
  public final String toString()
  {
    return ai.a(a(), (Iterable)this.a).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */