package b.i.b.a.c.a;

import b.i.b.a.c.f.b;
import b.i.b.a.c.f.f;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public enum h
{
  public static final Set<h> i = Collections.unmodifiableSet(EnumSet.of(b, new h[] { c, d, e, f, g, h }));
  public final f j;
  public final f k;
  public b l = null;
  public b m = null;
  
  private h(String paramString)
  {
    this.j = f.a(paramString);
    ??? = new StringBuilder();
    ((StringBuilder)???).append(paramString);
    ((StringBuilder)???).append("Array");
    this.k = f.a(((StringBuilder)???).toString());
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */