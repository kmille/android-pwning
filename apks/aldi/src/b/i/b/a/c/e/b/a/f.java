package b.i.b.a.c.e.b.a;

import b.f.b.j;

public abstract class f
{
  public abstract String a();
  
  public abstract String b();
  
  public abstract String c();
  
  public final String toString()
  {
    return c();
  }
  
  public static final class a
    extends f
  {
    public final String a;
    public final String b;
    
    public a(String paramString1, String paramString2)
    {
      super();
      this.a = paramString1;
      this.b = paramString2;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final String b()
    {
      return this.b;
    }
    
    public final String c()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.a);
      localStringBuilder.append(':');
      localStringBuilder.append(this.b);
      return localStringBuilder.toString();
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((j.a(this.a, ((a)paramObject).a)) && (j.a(this.b, ((a)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public final int hashCode()
    {
      String str = this.a;
      int j = 0;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      str = this.b;
      if (str != null) {
        j = str.hashCode();
      }
      return i * 31 + j;
    }
  }
  
  public static final class b
    extends f
  {
    public final String a;
    public final String b;
    
    public b(String paramString1, String paramString2)
    {
      super();
      this.a = paramString1;
      this.b = paramString2;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final String b()
    {
      return this.b;
    }
    
    public final String c()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.a);
      localStringBuilder.append(this.b);
      return localStringBuilder.toString();
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((j.a(this.a, ((b)paramObject).a)) && (j.a(this.b, ((b)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public final int hashCode()
    {
      String str = this.a;
      int j = 0;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      str = this.b;
      if (str != null) {
        j = str.hashCode();
      }
      return i * 31 + j;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */