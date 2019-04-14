package b.i.b.a.c.f;

import b.a.e;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class c
{
  private static final f b = f.c("<root>");
  private static final Pattern c = Pattern.compile("\\.");
  private static final b.f.a.b<String, f> d = new b.f.a.b() {};
  public final String a;
  private transient b e;
  private transient c f;
  private transient f g;
  
  private c(String paramString)
  {
    this.a = paramString;
  }
  
  c(String paramString, b paramb)
  {
    this.a = paramString;
    this.e = paramb;
  }
  
  private c(String paramString, c paramc, f paramf)
  {
    this.a = paramString;
    this.f = paramc;
    this.g = paramf;
  }
  
  public static c c(f paramf)
  {
    return new c(paramf.a, b.a.b, paramf);
  }
  
  private void g()
  {
    int i = this.a.lastIndexOf('.');
    if (i >= 0)
    {
      this.g = f.d(this.a.substring(i + 1));
      this.f = new c(this.a.substring(0, i));
      return;
    }
    this.g = f.d(this.a);
    this.f = b.a.b;
  }
  
  public final c a(f paramf)
  {
    Object localObject;
    if (this.a.isEmpty())
    {
      localObject = paramf.a;
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.a);
      ((StringBuilder)localObject).append(".");
      ((StringBuilder)localObject).append(paramf.a);
      localObject = ((StringBuilder)localObject).toString();
    }
    return new c((String)localObject, this, paramf);
  }
  
  public final boolean a()
  {
    return (this.e != null) || (this.a.indexOf('<') < 0);
  }
  
  public final b b()
  {
    if (this.e != null) {
      return this.e;
    }
    this.e = new b(this);
    return this.e;
  }
  
  public final boolean b(f paramf)
  {
    int j = this.a.indexOf('.');
    if (!this.a.isEmpty())
    {
      String str = this.a;
      paramf = paramf.a;
      int i = j;
      if (j == -1) {
        i = this.a.length();
      }
      if (str.regionMatches(0, paramf, 0, i)) {
        return true;
      }
    }
    return false;
  }
  
  public final c c()
  {
    if (this.f != null) {
      return this.f;
    }
    if (!this.a.isEmpty())
    {
      g();
      return this.f;
    }
    throw new IllegalStateException("root");
  }
  
  public final f d()
  {
    if (this.g != null) {
      return this.g;
    }
    if (!this.a.isEmpty())
    {
      g();
      return this.g;
    }
    throw new IllegalStateException("root");
  }
  
  public final f e()
  {
    if (this.a.isEmpty()) {
      return b;
    }
    return d();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    return this.a.equals(((c)paramObject).a);
  }
  
  public final List<f> f()
  {
    if (this.a.isEmpty()) {
      return Collections.emptyList();
    }
    return e.a(c.split(this.a), d);
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    if (this.a.isEmpty()) {
      return b.a;
    }
    return this.a;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */