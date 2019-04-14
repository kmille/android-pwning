package b.i.b.a.c.d.b;

import b.i.b.a.c.i.d.c;
import b.k.a;
import b.w;

final class l
  implements k<j>
{
  public static final l a = new l();
  
  private j c(String paramString)
  {
    b.f.b.j.b(paramString, "representation");
    int i = paramString.length();
    int k = 0;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((w.a) && (i == 0)) {
      throw ((Throwable)new AssertionError("empty string as JvmType"));
    }
    int m = paramString.charAt(0);
    c[] arrayOfc = c.values();
    int n = arrayOfc.length;
    i = 0;
    int j;
    while (i < n)
    {
      localObject = arrayOfc[i];
      if (((c)localObject).k.charAt(0) == m) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        break label120;
      }
      i += 1;
    }
    Object localObject = null;
    label120:
    if (localObject != null) {}
    for (paramString = new j.c((c)localObject);; paramString = new j.c(null))
    {
      return (j)paramString;
      if (m != 86)
      {
        if (m != 91)
        {
          i = k;
          if (m == 76)
          {
            localObject = (CharSequence)paramString;
            b.f.b.j.b(localObject, "receiver$0");
            if ((((CharSequence)localObject).length() > 0) && (a.a(((CharSequence)localObject).charAt(b.k.l.a((CharSequence)localObject)), ';', false))) {
              j = 1;
            } else {
              j = 0;
            }
            i = k;
            if (j != 0) {
              i = 1;
            }
          }
          if ((w.a) && (i == 0))
          {
            localObject = new StringBuilder("Type that is not primitive nor array should be Object, but '");
            ((StringBuilder)localObject).append(paramString);
            ((StringBuilder)localObject).append("' was found");
            throw ((Throwable)new AssertionError(((StringBuilder)localObject).toString()));
          }
          paramString = paramString.substring(1, paramString.length() - 1);
          b.f.b.j.a(paramString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        for (paramString = new j.b(paramString);; paramString = new j.a(c(paramString)))
        {
          return (j)paramString;
          paramString = paramString.substring(1);
          b.f.b.j.a(paramString, "(this as java.lang.String).substring(startIndex)");
        }
      }
    }
  }
  
  private static j.b d(String paramString)
  {
    b.f.b.j.b(paramString, "internalName");
    return new j.b(paramString);
  }
  
  public final String a(j paramj)
  {
    b.f.b.j.b(paramj, "type");
    Object localObject2;
    Object localObject1;
    if ((paramj instanceof j.a))
    {
      localObject2 = new StringBuilder("[");
      localObject1 = a(((j.a)paramj).a);
      paramj = (j)localObject2;
    }
    for (;;)
    {
      paramj.append((String)localObject1);
      return paramj.toString();
      if ((paramj instanceof j.c))
      {
        paramj = ((j.c)paramj).a;
        if (paramj != null)
        {
          paramj = paramj.k;
          if (paramj != null) {
            return paramj;
          }
        }
        return "V";
      }
      if (!(paramj instanceof j.b)) {
        break;
      }
      localObject1 = new StringBuilder("L");
      ((StringBuilder)localObject1).append(((j.b)paramj).a);
      localObject2 = ";";
      paramj = (j)localObject1;
      localObject1 = localObject2;
    }
    throw new b.k();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */