package b.i.b.a.c.d.a.f;

public enum g
{
  static
  {
    g localg1 = new g("NULLABLE", 0);
    a = localg1;
    g localg2 = new g("NOT_NULL", 1);
    b = localg2;
    g localg3 = new g("FORCE_FLEXIBILITY", 2);
    c = localg3;
    d = new g[] { localg1, localg2, localg3 };
  }
  
  private g() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/d/a/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */