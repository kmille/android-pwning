package b.i.b.a.c.d.a;

import b.f.b.j;
import b.i.b.a.c.a.g;
import b.i.b.a.c.b.e;
import b.i.b.a.c.c.a.c;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.w;

public final class u
{
  public static final l a(w paramw, String paramString)
  {
    String str1 = paramString;
    j.b(paramw, "receiver$0");
    j.b(str1, "value");
    Object localObject2 = paramw.f().c();
    boolean bool = localObject2 instanceof e;
    localObject1 = null;
    if (bool)
    {
      localObject2 = (e)localObject2;
      if (((e)localObject2).g() == b.i.b.a.c.b.f.c)
      {
        paramw = ((e)localObject2).v();
        paramString = b.i.b.a.c.f.f.a(paramString);
        j.a(paramString, "Name.identifier(value)");
        paramw = paramw.c(paramString, (b.i.b.a.c.c.a.a)c.b);
        if ((paramw instanceof e))
        {
          paramw = (e)paramw;
          if (paramw.g() == b.i.b.a.c.b.f.d) {
            return (l)new h(paramw);
          }
        }
        return null;
      }
    }
    localObject2 = b.i.b.a.c.l.c.a.c(paramw);
    j.b(str1, "value");
    if ((!b.k.l.a(str1, "0x")) && (!b.k.l.a(str1, "0X")))
    {
      if ((!b.k.l.a(str1, "0b")) && (!b.k.l.a(str1, "0B")))
      {
        paramw = new b.i.b.a.c.n.f(str1, 10);
      }
      else
      {
        paramw = str1.substring(2);
        j.a(paramw, "(this as java.lang.String).substring(startIndex)");
        paramw = new b.i.b.a.c.n.f(paramw, 2);
      }
    }
    else
    {
      paramw = str1.substring(2);
      j.a(paramw, "(this as java.lang.String).substring(startIndex)");
      paramw = new b.i.b.a.c.n.f(paramw, 16);
    }
    String str2 = paramw.a;
    int m = paramw.b;
    try
    {
      if (g.f((w)localObject2))
      {
        paramw = Boolean.valueOf(Boolean.parseBoolean(paramString));
        break label760;
      }
      bool = g.g((w)localObject2);
      i = 0;
      if (bool)
      {
        paramString = (CharSequence)str1;
        j.b(paramString, "receiver$0");
        paramw = (w)localObject1;
        if (paramString.length() != 1) {
          break label738;
        }
        paramw = Character.valueOf(paramString.charAt(0));
        break label760;
      }
      if (g.i((w)localObject2))
      {
        j.b(str2, "receiver$0");
        paramw = b.k.l.a(str2, m);
        if (paramw == null) {
          break label736;
        }
        i = paramw.intValue();
        paramw = (w)localObject1;
        if (i < -128) {
          break label738;
        }
        if (i > 127)
        {
          paramw = (w)localObject1;
          break label738;
        }
        paramw = Byte.valueOf((byte)i);
        break label760;
      }
      if (g.k((w)localObject2))
      {
        j.b(str2, "receiver$0");
        paramw = b.k.l.a(str2, m);
        if (paramw == null) {
          break label736;
        }
        i = paramw.intValue();
        paramw = (w)localObject1;
        if (i < 32768) {
          break label738;
        }
        if (i > 32767)
        {
          paramw = (w)localObject1;
          break label738;
        }
        paramw = Short.valueOf((short)i);
        break label760;
      }
      if (g.h((w)localObject2))
      {
        paramw = b.k.l.a(str2, m);
        break label760;
      }
      if (!g.j((w)localObject2)) {
        break label686;
      }
      j.b(str2, "receiver$0");
      b.k.a.a(m);
      n = str2.length();
      if (n == 0) {
        break label736;
      }
      j = str2.charAt(0);
      l1 = -9223372036854775807L;
      if (j >= 48) {
        break label788;
      }
      if (n == 1) {
        break label736;
      }
      if (j != 45) {
        break label774;
      }
      l1 = Long.MIN_VALUE;
      i = 1;
    }
    catch (IllegalArgumentException paramw)
    {
      for (;;)
      {
        int i;
        int n;
        long l1;
        long l4;
        long l5;
        long l3;
        int k;
        long l2;
        continue;
        continue;
        for (;;)
        {
          k = 1;
          j = i;
          i = k;
          break;
          paramw = (w)localObject1;
          if (j != 43) {
            break label738;
          }
          i = 0;
        }
        int j = 0;
      }
    }
    l4 = m;
    l5 = l1 / l4;
    l3 = 0L;
    k = n - 1;
    l2 = l3;
    if (i <= k) {
      for (;;)
      {
        n = Character.digit(str2.charAt(i), m);
        if ((n < 0) || (l3 < l5)) {
          break label736;
        }
        l2 = l3 * l4;
        l3 = n;
        if (l2 < l1 + l3) {
          break label736;
        }
        l3 = l2 - l3;
        l2 = l3;
        if (i == k) {
          break;
        }
        i += 1;
      }
    }
    if (j != 0)
    {
      paramw = Long.valueOf(l2);
    }
    else
    {
      paramw = Long.valueOf(-l2);
      break label760;
      label686:
      if (g.l((w)localObject2))
      {
        paramw = b.k.l.a(paramString);
      }
      else if (g.m((w)localObject2))
      {
        paramw = b.k.l.b(paramString);
      }
      else
      {
        bool = g.t((w)localObject2);
        if (bool)
        {
          paramw = str1;
        }
        else
        {
          label736:
          paramw = null;
          label738:
          if (paramw != null) {
            return (l)new f(paramw);
          }
          return null;
        }
      }
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */