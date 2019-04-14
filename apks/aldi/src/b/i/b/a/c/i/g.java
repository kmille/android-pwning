package b.i.b.a.c.i;

import b.f.a.b;
import b.i.b.a.c.b.ah;
import b.i.b.a.c.b.aq;
import b.i.b.a.c.b.e;
import b.i.b.a.c.b.k;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.t;
import b.i.b.a.c.f.f;
import b.i.b.a.c.h.c;
import b.i.b.a.c.h.c.a;
import b.i.b.a.c.h.i;
import b.u;
import java.util.Comparator;

public class g
  implements Comparator<l>
{
  public static final g a;
  private static final c c = c.a.a(new b() {});
  
  static
  {
    a = new g();
    c.a locala = c.j;
  }
  
  public static final class a
    implements Comparator<l>
  {
    public static final a a = new a();
    
    private static int a(l paraml)
    {
      if (d.i(paraml)) {
        return 8;
      }
      if ((paraml instanceof k)) {
        return 7;
      }
      if ((paraml instanceof ah))
      {
        if (((ah)paraml).d() == null) {
          return 6;
        }
        return 5;
      }
      if ((paraml instanceof t))
      {
        if (((t)paraml).d() == null) {
          return 4;
        }
        return 3;
      }
      if ((paraml instanceof e)) {
        return 2;
      }
      if ((paraml instanceof aq)) {
        return 1;
      }
      return 0;
    }
    
    private static Integer b(l paraml1, l paraml2)
    {
      int i = a(paraml2) - a(paraml1);
      if (i != 0) {
        return Integer.valueOf(i);
      }
      if ((d.i(paraml1)) && (d.i(paraml2))) {
        return Integer.valueOf(0);
      }
      i = paraml1.i().a(paraml2.i());
      if (i != 0) {
        return Integer.valueOf(i);
      }
      return null;
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */