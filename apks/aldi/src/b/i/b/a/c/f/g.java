package b.i.b.a.c.f;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
{
  public static final g a = new g();
  private static final b.k.j b = new b.k.j("[^\\p{L}\\p{Digit}]");
  
  public static final String a(String paramString)
  {
    b.f.b.j.b(paramString, "name");
    b.k.j localj = b;
    paramString = (CharSequence)paramString;
    b.f.b.j.b(paramString, "input");
    b.f.b.j.b("_", "replacement");
    paramString = localj.a.matcher(paramString).replaceAll("_");
    b.f.b.j.a(paramString, "nativePattern.matcher(in…).replaceAll(replacement)");
    return paramString;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */