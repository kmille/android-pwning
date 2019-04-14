package b.i.b.a.c.f;

import b.f.b.j;
import b.k.l;
import b.r;

public final class d
{
  public static final b a(b paramb1, b paramb2)
  {
    j.b(paramb1, "receiver$0");
    j.b(paramb2, "prefix");
    if (b(paramb1, paramb2))
    {
      if (paramb2.a()) {
        return paramb1;
      }
      if (j.a(paramb1, paramb2))
      {
        paramb1 = b.a;
        j.a(paramb1, "FqName.ROOT");
        return paramb1;
      }
      paramb1 = paramb1.b.a;
      j.a(paramb1, "asString()");
      int i = paramb2.b.a.length();
      if (paramb1 != null)
      {
        paramb1 = paramb1.substring(i + 1);
        j.a(paramb1, "(this as java.lang.String).substring(startIndex)");
        return new b(paramb1);
      }
      throw new r("null cannot be cast to non-null type java.lang.String");
    }
    return paramb1;
  }
  
  private static boolean b(b paramb1, b paramb2)
  {
    j.b(paramb1, "receiver$0");
    j.b(paramb2, "packageName");
    if (j.a(paramb1, paramb2)) {
      return true;
    }
    if (paramb2.a()) {
      return true;
    }
    paramb1 = paramb1.b.a;
    j.a(paramb1, "this.asString()");
    paramb2 = paramb2.b.a;
    j.a(paramb2, "packageName.asString()");
    return (l.a(paramb1, paramb2)) && (paramb1.charAt(paramb2.length()) == '.');
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */