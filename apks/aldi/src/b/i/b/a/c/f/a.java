package b.i.b.a.c.f;

import b.k.l;

public final class a
{
  public final b a;
  public final b b;
  public final boolean c;
  
  public a(b paramb1, b paramb2, boolean paramBoolean)
  {
    this.a = paramb1;
    if ((!d) && (paramb2.b.a.isEmpty()))
    {
      paramb2 = new StringBuilder("Class name must not be root: ");
      paramb2.append(paramb1);
      if (paramBoolean) {
        paramb1 = " (local)";
      } else {
        paramb1 = "";
      }
      paramb2.append(paramb1);
      throw new AssertionError(paramb2.toString());
    }
    this.b = paramb2;
    this.c = paramBoolean;
  }
  
  public a(b paramb, f paramf)
  {
    this(paramb, b.c(paramf), false);
  }
  
  public static a a(b paramb)
  {
    return new a(paramb.b(), paramb.b.d());
  }
  
  public static a a(String paramString)
  {
    return a(paramString, false);
  }
  
  public static a a(String paramString, boolean paramBoolean)
  {
    String str = l.f(paramString, "").replace('/', '.');
    paramString = l.a(paramString, '/', paramString);
    return new a(new b(str), new b(paramString), paramBoolean);
  }
  
  public final a a(f paramf)
  {
    return new a(this.a, this.b.a(paramf), this.c);
  }
  
  public final f a()
  {
    return this.b.b.d();
  }
  
  public final a b()
  {
    b localb = this.b.b();
    if (localb.b.a.isEmpty()) {
      return null;
    }
    return new a(this.a, localb, this.c);
  }
  
  public final boolean c()
  {
    return !this.b.b().b.a.isEmpty();
  }
  
  public final b d()
  {
    if (this.a.b.a.isEmpty()) {
      return this.b;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a.b.a);
    localStringBuilder.append(".");
    localStringBuilder.append(this.b.b.a);
    return new b(localStringBuilder.toString());
  }
  
  public final String e()
  {
    if (this.a.b.a.isEmpty()) {
      return this.b.b.a;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a.b.a.replace('.', '/'));
    localStringBuilder.append("/");
    localStringBuilder.append(this.b.b.a);
    return localStringBuilder.toString();
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
      paramObject = (a)paramObject;
      if ((this.a.equals(((a)paramObject).a)) && (this.b.equals(((a)paramObject).b)) && (this.c == ((a)paramObject).c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + Boolean.valueOf(this.c).hashCode();
  }
  
  public final String toString()
  {
    if (this.a.b.a.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder("/");
      localStringBuilder.append(e());
      return localStringBuilder.toString();
    }
    return e();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */