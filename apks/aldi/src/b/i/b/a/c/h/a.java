package b.i.b.a.c.h;

public enum a
{
  final boolean d;
  final boolean e;
  
  static
  {
    a locala1 = new a("NO_ARGUMENTS", 0, false, 3);
    a = locala1;
    a locala2 = new a("UNLESS_EMPTY", 1, true, 2);
    b = locala2;
    a locala3 = new a("ALWAYS_PARENTHESIZED", 2, true, true);
    c = locala3;
    f = new a[] { locala1, locala2, locala3 };
  }
  
  private a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */