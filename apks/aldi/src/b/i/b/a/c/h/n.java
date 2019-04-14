package b.i.b.a.c.h;

public enum n
{
  static
  {
    n localn1 = new n("ALL", 0);
    a = localn1;
    n localn2 = new n("ONLY_NON_SYNTHESIZED", 1);
    b = localn2;
    n localn3 = new n("NONE", 2);
    c = localn3;
    d = new n[] { localn1, localn2, localn3 };
  }
  
  private n() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */