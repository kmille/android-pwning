package b.i.b.a.c.m;

import b.i.b.a.c.a.i;
import b.i.b.a.c.b.ar;
import b.i.b.a.c.b.au;
import b.i.b.a.c.b.l;
import b.i.b.a.c.b.s;
import b.i.b.a.c.b.t;
import b.i.b.a.c.l.ah;
import b.i.b.a.c.l.an;
import b.i.b.a.c.l.w;
import b.i.b.a.c.l.x;
import java.util.List;

final class e
  implements b
{
  public static final e a = new e();
  private static final String b = "second parameter must be of type KProperty<*> or its supertype";
  
  public final String a()
  {
    return b;
  }
  
  public final boolean a(t paramt)
  {
    b.f.b.j.b(paramt, "functionDescriptor");
    Object localObject1 = (au)paramt.k().get(1);
    paramt = i.b;
    b.f.b.j.a(localObject1, "secondParameter");
    paramt = b.i.b.a.c.i.c.a.c((l)localObject1);
    b.f.b.j.b(paramt, "module");
    Object localObject2 = b.i.b.a.c.a.g.k.ak;
    b.f.b.j.a(localObject2, "KotlinBuiltIns.FQ_NAMES.kProperty");
    paramt = s.a(paramt, (b.i.b.a.c.f.a)localObject2);
    if (paramt == null)
    {
      paramt = null;
    }
    else
    {
      localObject2 = b.i.b.a.c.b.a.g.a;
      localObject2 = b.i.b.a.c.b.a.g.a.a();
      Object localObject3 = paramt.c();
      b.f.b.j.a(localObject3, "kPropertyClass.typeConstructor");
      localObject3 = ((an)localObject3).b();
      b.f.b.j.a(localObject3, "kPropertyClass.typeConstructor.parameters");
      localObject3 = b.a.j.g((List)localObject3);
      b.f.b.j.a(localObject3, "kPropertyClass.typeConstructor.parameters.single()");
      paramt = (w)x.a((b.i.b.a.c.b.a.g)localObject2, paramt, b.a.j.a(new ah((ar)localObject3)));
    }
    if (paramt != null)
    {
      localObject1 = ((au)localObject1).y();
      b.f.b.j.a(localObject1, "secondParameter.type");
      return b.i.b.a.c.l.c.a.a(paramt, b.i.b.a.c.l.c.a.c((w)localObject1));
    }
    return false;
  }
  
  public final String b(t paramt)
  {
    b.f.b.j.b(paramt, "functionDescriptor");
    return b.a.a(this, paramt);
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/c/m/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */