package b.i.b.a.c.m.a;

import b.f.a.b;
import b.f.b.j;
import b.f.b.k;
import b.h.c;
import java.util.Iterator;

public final class a
{
  public static final String a(String paramString)
  {
    j.b(paramString, "receiver$0");
    Object localObject2 = new a(paramString);
    Object localObject1 = (CharSequence)paramString;
    int i;
    if (((CharSequence)localObject1).length() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      if (!((a)localObject2).a(0)) {
        return paramString;
      }
      b localb;
      if ((paramString.length() != 1) && (((a)localObject2).a(1)))
      {
        localb = new b();
        j.b(localObject1, "receiver$0");
        Iterator localIterator = ((Iterable)new c(0, ((CharSequence)localObject1).length() - 1)).iterator();
        while (localIterator.hasNext())
        {
          localObject1 = localIterator.next();
          if ((((a)localObject2).a(((Number)localObject1).intValue()) ^ true)) {
            break label153;
          }
        }
        localObject1 = null;
        label153:
        localObject1 = (Integer)localObject1;
        if (localObject1 != null)
        {
          i = ((Integer)localObject1).intValue() - 1;
          localObject2 = new StringBuilder();
          localObject1 = paramString.substring(0, i);
          j.a(localObject1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
          ((StringBuilder)localObject2).append(localb.a((String)localObject1));
          localObject1 = paramString.substring(i);
          j.a(localObject1, "(this as java.lang.String).substring(startIndex)");
          paramString = (String)localObject2;
        }
      }
      for (;;)
      {
        paramString.append((String)localObject1);
        return paramString.toString();
        return localb.a(paramString);
        j.b(paramString, "receiver$0");
        if (((CharSequence)localObject1).length() == 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          break;
        }
        char c = paramString.charAt(0);
        if ('A' > c) {
          return paramString;
        }
        if ('Z' < c) {
          break;
        }
        c = Character.toLowerCase(c);
        localObject1 = paramString.substring(1);
        j.a(localObject1, "(this as java.lang.String).substring(startIndex)");
        paramString = new StringBuilder();
        paramString.append(String.valueOf(c));
      }
    }
    return paramString;
  }
  
  public static final String b(String paramString)
  {
    j.b(paramString, "receiver$0");
    int i;
    if (((CharSequence)paramString).length() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return paramString;
    }
    char c = paramString.charAt(0);
    if ('a' > c) {
      return paramString;
    }
    Object localObject = paramString;
    if ('z' >= c)
    {
      c = Character.toUpperCase(c);
      paramString = paramString.substring(1);
      j.a(paramString, "(this as java.lang.String).substring(startIndex)");
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(String.valueOf(c));
      ((StringBuilder)localObject).append(paramString);
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public static final String c(String paramString)
  {
    j.b(paramString, "receiver$0");
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    int j = paramString.length();
    int i = 0;
    while (i < j)
    {
      char c2 = paramString.charAt(i);
      char c1;
      if ('A' > c2)
      {
        c1 = c2;
      }
      else
      {
        c1 = c2;
        if ('Z' >= c2) {
          c1 = Character.toLowerCase(c2);
        }
      }
      localStringBuilder.append(c1);
      i += 1;
    }
    paramString = localStringBuilder.toString();
    j.a(paramString, "builder.toString()");
    return paramString;
  }
  
  static final class a
    extends k
    implements b<Integer, Boolean>
  {
    a(String paramString)
    {
      super();
    }
    
    public final boolean a(int paramInt)
    {
      char c = this.a.charAt(paramInt);
      if (this.b) {
        return ('A' <= c) && ('Z' >= c);
      }
      return Character.isUpperCase(c);
    }
  }
  
  static final class b
    extends k
    implements b<String, String>
  {
    b()
    {
      super();
    }
    
    public final String a(String paramString)
    {
      j.b(paramString, "string");
      if (this.a) {
        return a.c(paramString);
      }
      paramString = paramString.toLowerCase();
      j.a(paramString, "(this as java.lang.String).toLowerCase()");
      return paramString;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */