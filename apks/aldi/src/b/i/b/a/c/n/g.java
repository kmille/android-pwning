package b.i.b.a.c.n;

public enum g
{
  public static final a e = new a((byte)0);
  final String d;
  
  static
  {
    g localg1 = new g("IGNORE", 0, "ignore");
    a = localg1;
    g localg2 = new g("WARN", 1, "warn");
    b = localg2;
    g localg3 = new g("STRICT", 2, "strict");
    c = localg3;
    f = new g[] { localg1, localg2, localg3 };
  }
  
  private g(String paramString)
  {
    this.d = paramString;
  }
  
  public final boolean a()
  {
    return (g)this == b;
  }
  
  public final boolean b()
  {
    return (g)this == a;
  }
  
  public static final class a {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/n/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */