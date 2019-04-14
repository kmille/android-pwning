package b.i.b.a.c.l.a;

public enum a
{
  static
  {
    a locala1 = new a("FOR_SUBTYPING", 0);
    a = locala1;
    a locala2 = new a("FOR_INCORPORATION", 1);
    b = locala2;
    a locala3 = new a("FROM_EXPRESSION", 2);
    c = locala3;
    d = new a[] { locala1, locala2, locala3 };
  }
  
  private a() {}
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */