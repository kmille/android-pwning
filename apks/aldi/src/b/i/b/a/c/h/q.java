package b.i.b.a.c.h;

import b.f.b.j;
import b.i.b.a.c.f.c;
import b.i.b.a.c.f.f;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class q
{
  public static final String a(c paramc)
  {
    j.b(paramc, "receiver$0");
    paramc = paramc.f();
    j.a(paramc, "pathSegments()");
    return a(paramc);
  }
  
  public static final String a(f paramf)
  {
    j.b(paramf, "receiver$0");
    if (b(paramf))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      paramf = paramf.a;
      j.a(paramf, "asString()");
      localStringBuilder.append("`".concat(String.valueOf(paramf)));
      localStringBuilder.append('`');
      return localStringBuilder.toString();
    }
    paramf = paramf.a;
    j.a(paramf, "asString()");
    return paramf;
  }
  
  public static final String a(List<f> paramList)
  {
    j.b(paramList, "pathSegments");
    StringBuilder localStringBuilder = new StringBuilder();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      f localf = (f)paramList.next();
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append(".");
      }
      localStringBuilder.append(a(localf));
    }
    paramList = localStringBuilder.toString();
    j.a(paramList, "StringBuilder().apply(builderAction).toString()");
    return paramList;
  }
  
  private static final boolean b(f paramf)
  {
    if (paramf.b) {
      return false;
    }
    paramf = paramf.a;
    j.a(paramf, "asString()");
    if (!l.a.contains(paramf))
    {
      paramf = (CharSequence)paramf;
      int i = 0;
      while (i < paramf.length())
      {
        char c = paramf.charAt(i);
        int j;
        if ((!Character.isLetterOrDigit(c)) && (c != '_')) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          i = 1;
          break label95;
        }
        i += 1;
      }
      i = 0;
      label95:
      return i != 0;
    }
    return true;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */