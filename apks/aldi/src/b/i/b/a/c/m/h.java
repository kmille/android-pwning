package b.i.b.a.c.m;

import b.f.b.j;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.t;
import b.i.b.a.c.i.c.a;
import java.util.Collection;
import java.util.Iterator;

final class h
  implements b
{
  public static final h a = new h();
  private static final String b = "should not have varargs or parameters with default values";
  
  public final String a()
  {
    return b;
  }
  
  public final boolean a(t paramt)
  {
    j.b(paramt, "functionDescriptor");
    paramt = paramt.k();
    j.a(paramt, "functionDescriptor.valueParameters");
    paramt = (Iterable)paramt;
    if ((!(paramt instanceof Collection)) || (!((Collection)paramt).isEmpty()))
    {
      paramt = paramt.iterator();
      while (paramt.hasNext())
      {
        au localau = (au)paramt.next();
        j.a(localau, "it");
        int i;
        if ((!a.a(localau)) && (localau.m_() == null)) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          return false;
        }
      }
    }
    return true;
  }
  
  public final String b(t paramt)
  {
    j.b(paramt, "functionDescriptor");
    return b.a.a(this, paramt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */