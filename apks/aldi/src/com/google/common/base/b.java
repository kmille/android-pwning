package com.google.common.base;

import java.util.Arrays;

public abstract class b
{
  @Deprecated
  public static final b a = q.p;
  @Deprecated
  public static final b b = c.o;
  @Deprecated
  public static final b c = b.o;
  @Deprecated
  public static final b d = d.o;
  @Deprecated
  public static final b e = g.o;
  @Deprecated
  public static final b f = i.o;
  @Deprecated
  public static final b g = j.o;
  @Deprecated
  public static final b h = l.o;
  @Deprecated
  public static final b i = k.o;
  @Deprecated
  public static final b j = h.o;
  @Deprecated
  public static final b k = f.o;
  @Deprecated
  public static final b l = p.o;
  @Deprecated
  public static final b m = a.o;
  @Deprecated
  public static final b n = n.o;
  
  public abstract boolean a(char paramChar);
  
  public String toString()
  {
    return super.toString();
  }
  
  static final class a
    extends b.m
  {
    static final a o = new a();
    
    private a()
    {
      super();
    }
    
    public final boolean a(char paramChar)
    {
      return true;
    }
  }
  
  public static final class b
    extends b.m
  {
    public static final b o = new b();
    
    b()
    {
      super();
    }
    
    public final boolean a(char paramChar)
    {
      return paramChar <= '';
    }
  }
  
  static final class c
    extends b
  {
    static final b o = new c();
    
    public final boolean a(char paramChar)
    {
      if ((paramChar != ' ') && (paramChar != '') && (paramChar != ' ')) {
        if (paramChar != ' ')
        {
          if ((paramChar == ' ') || (paramChar == '　')) {}
        }
        else {
          switch (paramChar)
          {
          default: 
            switch (paramChar)
            {
            default: 
              return (paramChar >= ' ') && (paramChar <= ' ');
            }
            break;
          }
        }
      }
      return true;
    }
    
    public final String toString()
    {
      return "CharMatcher.breakingWhitespace()";
    }
  }
  
  static final class d
    extends b.o
  {
    static final d o = new d();
    
    private d()
    {
      super("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), a());
    }
    
    private static char[] a()
    {
      char[] arrayOfChar = new char[31];
      int i = 0;
      while (i < 31)
      {
        arrayOfChar[i] = ((char)("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + '\t'));
        i += 1;
      }
      return arrayOfChar;
    }
  }
  
  static abstract class e
    extends b
  {}
  
  static final class f
    extends b.o
  {
    static final f o = new f();
    
    private f()
    {
      super("\000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());
    }
  }
  
  static final class g
    extends b
  {
    static final g o = new g();
    
    public final boolean a(char paramChar)
    {
      return Character.isDigit(paramChar);
    }
    
    public final String toString()
    {
      return "CharMatcher.javaDigit()";
    }
  }
  
  static final class h
    extends b.m
  {
    static final h o = new h();
    
    private h()
    {
      super();
    }
    
    public final boolean a(char paramChar)
    {
      return (paramChar <= '\037') || ((paramChar >= '') && (paramChar <= ''));
    }
  }
  
  static final class i
    extends b
  {
    static final i o = new i();
    
    public final boolean a(char paramChar)
    {
      return Character.isLetter(paramChar);
    }
    
    public final String toString()
    {
      return "CharMatcher.javaLetter()";
    }
  }
  
  static final class j
    extends b
  {
    static final j o = new j();
    
    public final boolean a(char paramChar)
    {
      return Character.isLetterOrDigit(paramChar);
    }
    
    public final String toString()
    {
      return "CharMatcher.javaLetterOrDigit()";
    }
  }
  
  static final class k
    extends b
  {
    static final k o = new k();
    
    public final boolean a(char paramChar)
    {
      return Character.isLowerCase(paramChar);
    }
    
    public final String toString()
    {
      return "CharMatcher.javaLowerCase()";
    }
  }
  
  static final class l
    extends b
  {
    static final l o = new l();
    
    public final boolean a(char paramChar)
    {
      return Character.isUpperCase(paramChar);
    }
    
    public final String toString()
    {
      return "CharMatcher.javaUpperCase()";
    }
  }
  
  static abstract class m
    extends b.e
  {
    private final String o;
    
    m(String paramString)
    {
      this.o = ((String)j.a(paramString));
    }
    
    public final String toString()
    {
      return this.o;
    }
  }
  
  static final class n
    extends b.m
  {
    static final n o = new n();
    
    private n()
    {
      super();
    }
    
    public final boolean a(char paramChar)
    {
      return false;
    }
  }
  
  static class o
    extends b
  {
    private final String o;
    private final char[] p;
    private final char[] q;
    
    o(String paramString, char[] paramArrayOfChar1, char[] paramArrayOfChar2)
    {
      this.o = paramString;
      this.p = paramArrayOfChar1;
      this.q = paramArrayOfChar2;
      boolean bool;
      if (paramArrayOfChar1.length == paramArrayOfChar2.length) {
        bool = true;
      } else {
        bool = false;
      }
      j.a(bool);
      int j;
      for (int i = 0; i < paramArrayOfChar1.length; i = j)
      {
        if (paramArrayOfChar1[i] <= paramArrayOfChar2[i]) {
          bool = true;
        } else {
          bool = false;
        }
        j.a(bool);
        j = i + 1;
        if (j < paramArrayOfChar1.length)
        {
          if (paramArrayOfChar2[i] < paramArrayOfChar1[j]) {
            bool = true;
          } else {
            bool = false;
          }
          j.a(bool);
        }
      }
    }
    
    public final boolean a(char paramChar)
    {
      int i = Arrays.binarySearch(this.p, paramChar);
      if (i >= 0) {
        return true;
      }
      i = (i ^ 0xFFFFFFFF) - 1;
      return (i >= 0) && (paramChar <= this.q[i]);
    }
    
    public String toString()
    {
      return this.o;
    }
  }
  
  static final class p
    extends b.o
  {
    static final p o = new p();
    
    private p()
    {
      super("\000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
    }
  }
  
  static final class q
    extends b.m
  {
    static final int o = Integer.numberOfLeadingZeros(31);
    static final q p = new q();
    
    q()
    {
      super();
    }
    
    public final boolean a(char paramChar)
    {
      return " 　\r   　 \013　   　 \t     \f 　 　　 \n 　".charAt(1682554634 * paramChar >>> o) == paramChar;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/common/base/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */