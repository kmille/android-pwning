package de.a.a;

import com.google.common.base.f;
import com.google.common.base.f.a;

public final class b
{
  public static final b a = new b(null, c.b, "");
  public final c b;
  public final String c;
  public final int d;
  public Throwable e = null;
  public final String f;
  
  private b(int paramInt, String paramString)
  {
    this.d = paramInt;
    this.e = null;
    this.c = "";
    this.b = c.c;
    this.f = paramString;
  }
  
  private b(String paramString1, c paramc, String paramString2)
  {
    this.c = paramString1;
    this.b = paramc;
    this.f = paramString2;
    this.d = -1;
  }
  
  private b(Throwable paramThrowable, String paramString)
  {
    this.e = paramThrowable;
    this.b = c.c;
    this.c = null;
    this.f = paramString;
    this.d = -1;
  }
  
  public static b a(int paramInt, String paramString)
  {
    return new b(paramInt, paramString);
  }
  
  public static b a(String paramString1, String paramString2)
  {
    return new b(paramString1, c.a, paramString2);
  }
  
  public static b a(Throwable paramThrowable, String paramString)
  {
    return new b(paramThrowable, paramString);
  }
  
  public final boolean a()
  {
    return c.a == this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (b)paramObject;
      if (this.b != ((b)paramObject).b) {
        return false;
      }
      if (this.c != null)
      {
        if (!this.c.equals(((b)paramObject).c)) {
          return false;
        }
      }
      else if (((b)paramObject).c != null) {
        return false;
      }
      if (this.e != null) {
        return this.e.equals(((b)paramObject).e);
      }
      if (((b)paramObject).e == null) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.b.hashCode();
    String str = this.c;
    int j = 0;
    int i;
    if (str != null) {
      i = this.c.hashCode();
    } else {
      i = 0;
    }
    if (this.e != null) {
      j = this.e.hashCode();
    }
    return (k * 31 + i) * 31 + j;
  }
  
  public final String toString()
  {
    return f.a(this).a("type", this.b).a("value", this.c).a("exception", this.e).toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */