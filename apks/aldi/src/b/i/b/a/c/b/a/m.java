package b.i.b.a.c.b.a;

public enum m
{
  static
  {
    m localm1 = new m("RUNTIME", 0);
    a = localm1;
    m localm2 = new m("BINARY", 1);
    b = localm2;
    m localm3 = new m("SOURCE", 2);
    c = localm3;
    d = new m[] { localm1, localm2, localm3 };
  }
  
  private m() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */