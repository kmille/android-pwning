package b.i.b.a.c.b.a;

import b.f.b.j;
import b.r;

public enum e
{
  public final String j;
  
  static
  {
    e locale1 = new e("FIELD", 0);
    a = locale1;
    e locale2 = new e("FILE", 1);
    b = locale2;
    e locale3 = new e("PROPERTY", 2);
    c = locale3;
    e locale4 = new e("PROPERTY_GETTER", 3, "get");
    d = locale4;
    e locale5 = new e("PROPERTY_SETTER", 4, "set");
    e = locale5;
    e locale6 = new e("RECEIVER", 5);
    f = locale6;
    e locale7 = new e("CONSTRUCTOR_PARAMETER", 6, "param");
    g = locale7;
    e locale8 = new e("SETTER_PARAMETER", 7, "setparam");
    h = locale8;
    e locale9 = new e("PROPERTY_DELEGATE_FIELD", 8, "delegate");
    i = locale9;
    k = new e[] { locale1, locale2, locale3, locale4, locale5, locale6, locale7, locale8, locale9 };
  }
  
  private e(String paramString)
  {
    ??? = paramString;
    if (paramString == null)
    {
      ??? = name();
      if (??? != null)
      {
        ??? = ???.toLowerCase();
        j.a(???, "(this as java.lang.String).toLowerCase()");
      }
      else
      {
        throw new r("null cannot be cast to non-null type java.lang.String");
      }
    }
    this.j = ???;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */