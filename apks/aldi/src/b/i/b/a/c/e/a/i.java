package b.i.b.a.c.e.a;

import b.a.v;
import b.f.b.j;
import b.i.b.a.c.e.a.ak;
import b.i.b.a.c.e.a.am;
import java.util.List;

public final class i
{
  public static final a b = new a((byte)0);
  private static final i c = new i((List)v.a);
  final List<a.ak> a;
  
  private i(List<a.ak> paramList)
  {
    this.a = paramList;
  }
  
  public static final class a
  {
    public static i a(a.am paramam)
    {
      j.b(paramam, "table");
      if (paramam.b.size() == 0) {
        return i.a();
      }
      paramam = paramam.b;
      j.a(paramam, "table.requirementList");
      return new i(paramam, (byte)0);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/e/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */