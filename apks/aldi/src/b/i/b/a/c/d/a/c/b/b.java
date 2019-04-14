package b.i.b.a.c.d.a.c.b;

public enum b
{
  static
  {
    b localb1 = new b("INFLEXIBLE", 0);
    a = localb1;
    b localb2 = new b("FLEXIBLE_UPPER_BOUND", 1);
    b = localb2;
    b localb3 = new b("FLEXIBLE_LOWER_BOUND", 2);
    c = localb3;
    d = new b[] { localb1, localb2, localb3 };
  }
  
  private b() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/c/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */