package b.i.b.a.c.f;

public final class b
{
  public static final b a = new b("");
  public final c b;
  private transient b c;
  
  public b(c paramc)
  {
    this.b = paramc;
  }
  
  private b(c paramc, b paramb)
  {
    this.b = paramc;
    this.c = paramb;
  }
  
  public b(String paramString)
  {
    this.b = new c(paramString, this);
  }
  
  public static b c(f paramf)
  {
    return new b(c.c(paramf));
  }
  
  public final b a(f paramf)
  {
    return new b(this.b.a(paramf), this);
  }
  
  public final boolean a()
  {
    return this.b.a.isEmpty();
  }
  
  public final b b()
  {
    if (this.c != null) {
      return this.c;
    }
    if (!a())
    {
      this.c = new b(this.b.c());
      return this.c;
    }
    throw new IllegalStateException("root");
  }
  
  public final boolean b(f paramf)
  {
    return this.b.b(paramf);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return this.b.equals(((b)paramObject).b);
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    return this.b.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */