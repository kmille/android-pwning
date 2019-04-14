package b.i.b.a.c.l;

public enum ba
{
  public final String d;
  public final boolean e;
  private final boolean g;
  private final int h;
  
  static
  {
    ba localba1 = new ba("INVARIANT", 0, "", true, true, 0);
    a = localba1;
    ba localba2 = new ba("IN_VARIANCE", 1, "in", true, false, -1);
    b = localba2;
    ba localba3 = new ba("OUT_VARIANCE", 2, "out", false, true, 1);
    c = localba3;
    f = new ba[] { localba1, localba2, localba3 };
  }
  
  private ba(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this.d = paramString;
    this.g = paramBoolean1;
    this.e = paramBoolean2;
    this.h = paramInt;
  }
  
  public final String toString()
  {
    return this.d;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/l/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */