package b.i.b.a.c.b;

public enum w
{
  public static final a e = new a((byte)0);
  
  static
  {
    w localw1 = new w("FINAL", 0);
    a = localw1;
    w localw2 = new w("SEALED", 1);
    b = localw2;
    w localw3 = new w("OPEN", 2);
    c = localw3;
    w localw4 = new w("ABSTRACT", 3);
    d = localw4;
    f = new w[] { localw1, localw2, localw3, localw4 };
  }
  
  private w() {}
  
  public static final class a
  {
    public static w a(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (paramBoolean1) {
        return w.d;
      }
      if (paramBoolean2) {
        return w.c;
      }
      return w.a;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */