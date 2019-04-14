package b.i.b.a.c.d.a;

import b.i.b.a.c.f.f;
import b.i.b.a.c.m.a.a;
import b.k.l;
import b.w;
import java.util.List;

public final class s
{
  private static final f a(f paramf, String paramString1, boolean paramBoolean, String paramString2)
  {
    if (paramf.b) {
      return null;
    }
    String str = paramf.a();
    b.f.b.j.a(str, "methodName.identifier");
    if (!l.a(str, paramString1)) {
      return null;
    }
    if (str.length() == paramString1.length()) {
      return null;
    }
    int i = str.charAt(paramString1.length());
    if ((97 <= i) && (122 >= i)) {
      return null;
    }
    if (paramString2 != null)
    {
      if ((w.a) && (!paramBoolean)) {
        throw ((Throwable)new AssertionError("Assertion failed"));
      }
      paramf = new StringBuilder();
      paramf.append(paramString2);
      paramf.append(l.a(str, (CharSequence)paramString1));
      return f.a(paramf.toString());
    }
    if (!paramBoolean) {
      return paramf;
    }
    paramf = a.a(l.a(str, (CharSequence)paramString1));
    if (!f.b(paramf)) {
      return null;
    }
    return f.a(paramf);
  }
  
  private static f a(f paramf, boolean paramBoolean)
  {
    b.f.b.j.b(paramf, "methodName");
    String str;
    if (paramBoolean) {
      str = "is";
    } else {
      str = null;
    }
    return a(paramf, "set", false, str, 4);
  }
  
  public static final List<f> a(f paramf)
  {
    b.f.b.j.b(paramf, "name");
    Object localObject = paramf.a;
    b.f.b.j.a(localObject, "name.asString()");
    if (o.a((String)localObject))
    {
      b.f.b.j.b(paramf, "methodName");
      f localf = a(paramf, "get", false, null, 12);
      localObject = localf;
      if (localf == null) {
        localObject = a(paramf, "is", false, null, 8);
      }
      return b.a.j.b(localObject);
    }
    if (o.b((String)localObject))
    {
      b.f.b.j.b(paramf, "methodName");
      return b.a.j.h((Iterable)b.a.j.b(new f[] { a(paramf, false), a(paramf, true) }));
    }
    localObject = e.a;
    return e.a(paramf);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */